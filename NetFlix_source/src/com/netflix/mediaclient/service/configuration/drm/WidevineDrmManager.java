// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.configuration.drm;

import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.NotProvisionedException;
import android.media.UnsupportedSchemeException;
import android.os.Build;
import android.util.Base64;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.app.BackgroundTask;
import com.netflix.mediaclient.servicemgr.ErrorLogging;
import com.netflix.mediaclient.util.AndroidUtils;
import com.netflix.mediaclient.util.CryptoUtils;
import com.netflix.mediaclient.util.PreferenceUtils;
import com.netflix.mediaclient.util.StringUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.netflix.mediaclient.service.configuration.drm:
//            DrmManager, AccountKeyMap, WidevineCDMProvisionRequestTask

public class WidevineDrmManager
    implements android.media.MediaDrm.OnEventListener, DrmManager
{
    private static class CryptoSession
    {

        public byte kceKeyId[];
        public byte kchKeyId[];
        public byte pendingSessionId[];
        public byte sessionId[];

        public byte[] activatePendingSessionId()
        {
            byte abyte0[] = null;
            this;
            JVM INSTR monitorenter ;
            if (pendingSessionId != null) goto _L2; else goto _L1
_L1:
            Log.e(WidevineDrmManager.TAG, "Pending session does NOT exist! Do nothing!");
_L4:
            this;
            JVM INSTR monitorexit ;
            return abyte0;
_L2:
            Log.d(WidevineDrmManager.TAG, "Pending session does exist! Move pending to current session id and return old!");
            abyte0 = sessionId;
            sessionId = pendingSessionId;
            pendingSessionId = null;
            if (true) goto _L4; else goto _L3
_L3:
            Exception exception;
            exception;
            throw exception;
        }

        public void reset()
        {
            this;
            JVM INSTR monitorenter ;
            pendingSessionId = null;
            sessionId = null;
            kceKeyId = null;
            kchKeyId = null;
            this;
            JVM INSTR monitorexit ;
            return;
            Exception exception;
            exception;
            throw exception;
        }

        private CryptoSession()
        {
        }

    }

    public static interface NccpProvisiongCallback
    {

        public abstract void done(byte abyte0[]);

        public abstract void error();
    }

    public static interface WidewineProvisiongCallback
    {

        public abstract void done(byte abyte0[]);
    }


    public static final String PROPERTY_SYSTEM_ID = "systemId";
    public static final String TAG = com/netflix/mediaclient/service/configuration/drm/WidevineDrmManager.getSimpleName();
    private static final UUID WIDEVINE_SCHEME = new UUID(0xedef8ba979d64aceL, 0xa3c827dcd51d21edL);
    private static final byte init[] = {
        10, 122, 0, 108, 56, 43
    };
    private MediaDrm drm;
    private DrmManager.DrmReadyCallback mCallback;
    private Context mContext;
    private String mCurrentAccountId;
    private boolean mDrmSystemChanged;
    private ErrorLogging mErrorLogging;
    private AccountKeyMap mKeyIdsMap;
    private com.netflix.mediaclient.service.ServiceAgent.UserAgentInterface mUser;
    private AtomicBoolean mWidevineProvisioned;
    private CryptoSession nccpCryptoFactoryCryptoSession;

    WidevineDrmManager(Context context, com.netflix.mediaclient.service.ServiceAgent.UserAgentInterface useragentinterface, ErrorLogging errorlogging, DrmManager.DrmReadyCallback drmreadycallback)
        throws UnsupportedSchemeException
    {
        mWidevineProvisioned = new AtomicBoolean(false);
        nccpCryptoFactoryCryptoSession = new CryptoSession();
        if (drmreadycallback == null)
        {
            throw new IllegalArgumentException();
        }
        mCallback = drmreadycallback;
        mUser = useragentinterface;
        mErrorLogging = errorlogging;
        mContext = context;
        drm = new MediaDrm(WIDEVINE_SCHEME);
        drm.setOnEventListener(this);
        mKeyIdsMap = new AccountKeyMap(mContext);
        showProperties();
        if (isWidevinePluginChanged())
        {
            reset();
            mDrmSystemChanged = true;
        }
        PreferenceUtils.putStringPref(mContext, "nf_drm_system_id", getDeviceType());
    }

    private void afterWidewineProvisioning()
    {
        mCallback.drmReady();
    }

    private void closeCryptoSessions(byte abyte0[])
    {
        if (abyte0 == null || drm == null)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        Log.d(TAG, "closeCryptoSessions");
        drm.closeSession(abyte0);
        return;
        abyte0;
        Log.w(TAG, "closeCryptoSessions failed !", abyte0);
        return;
    }

    private void closeSessionAndRemoveKeys(byte abyte0[])
    {
        this;
        JVM INSTR monitorenter ;
        removeSessionKeys(abyte0);
        closeCryptoSessions(abyte0);
        this;
        JVM INSTR monitorexit ;
        return;
        abyte0;
        throw abyte0;
    }

    private android.media.MediaDrm.KeyRequest createKeyRequest()
        throws NotProvisionedException
    {
        this;
        JVM INSTR monitorenter ;
        android.media.MediaDrm.KeyRequest keyrequest;
        Log.d(TAG, "get NCCP session key request");
        closeCryptoSessions(nccpCryptoFactoryCryptoSession.pendingSessionId);
        Log.d(TAG, "Create a new crypto session");
        nccpCryptoFactoryCryptoSession.pendingSessionId = drm.openSession();
        keyrequest = drm.getKeyRequest(nccpCryptoFactoryCryptoSession.pendingSessionId, init, "application/xml", 2, new HashMap());
        this;
        JVM INSTR monitorexit ;
        return keyrequest;
        Exception exception;
        exception;
        throw exception;
    }

    private boolean createNccpCryptoFactoryDrmSession()
    {
        try
        {
            nccpCryptoFactoryCryptoSession.sessionId = drm.openSession();
        }
        catch (NotProvisionedException notprovisionedexception)
        {
            Log.e(TAG, "Device is not provisioned, start provisioning workflow!", notprovisionedexception);
            startWidewineProvisioning();
            return false;
        }
        catch (Throwable throwable)
        {
            Log.e(TAG, "Fatal error, can not recover!", throwable);
            mCallback.drmError(-100);
            mErrorLogging.logHandledException((new StringBuilder()).append("Failed to created NCCP crypto factory DRM session ").append(throwable.getMessage()).toString());
            return false;
        }
        if (Log.isLoggable(TAG, 3))
        {
            if (nccpCryptoFactoryCryptoSession.sessionId != null)
            {
                Log.d(TAG, (new StringBuilder()).append("Device is provisioned. NCCP crypto factory session ID: ").append(new String(nccpCryptoFactoryCryptoSession.sessionId)).toString());
            } else
            {
                Log.d(TAG, "Device is provisioned. NCCP crypto factory session ID: null");
            }
        }
        return true;
    }

    private void dumpKeyReqyest(byte abyte0[])
    {
        if (abyte0 != null)
        {
            if (Log.isLoggable(TAG, 3))
            {
                abyte0 = Base64.encodeToString(abyte0, 2);
                Log.d(TAG, (new StringBuilder()).append("key request created: ").append(abyte0).toString());
            }
            return;
        } else
        {
            Log.w(TAG, "key request returned null");
            return;
        }
    }

    private android.media.MediaDrm.CryptoSession findMediaDrmCryptoSession()
    {
        byte abyte0[] = nccpCryptoFactoryCryptoSession.sessionId;
        if (abyte0 == null)
        {
            return null;
        } else
        {
            return drm.getCryptoSession(abyte0, getCipherAlgorithm(), getMacAlgorithm());
        }
    }

    private static String getCipherAlgorithm()
    {
        return "AES/CBC/NoPadding";
    }

    private static String getMacAlgorithm()
    {
        return "HmacSHA256";
    }

    public static String getMediaDrmSecurityLevels()
    {
        MediaDrm mediadrm;
        String s;
        try
        {
            mediadrm = new MediaDrm(WIDEVINE_SCHEME);
            s = mediadrm.getPropertyString("securityLevel");
            Log.d(TAG, (new StringBuilder()).append("Widevine securityLevel [").append(s).append("]").toString());
        }
        catch (UnsupportedSchemeException unsupportedschemeexception)
        {
            return null;
        }
        if (mediadrm == null)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        mediadrm.release();
        return s;
    }

    private boolean isValidKeyIds(AccountKeyMap.KeyIds keyids, String s, String s1)
    {
        if (keyids != null && StringUtils.isNotEmpty(keyids.getKceKeyId()) && StringUtils.isNotEmpty(keyids.getKchKeyId()) && StringUtils.isNotEmpty(keyids.getKeySetId()))
        {
            while (StringUtils.isEmpty(s1) && StringUtils.isEmpty(s) || keyids.getKchKeyId().equals(s1) && keyids.getKceKeyId().equals(s)) 
            {
                return true;
            }
            return false;
        } else
        {
            return false;
        }
    }

    private boolean isWidevinePluginChanged()
    {
        String s = PreferenceUtils.getStringPref(mContext, "nf_drm_system_id", null);
        String s1 = getDeviceType();
        if (s == null)
        {
            if (Log.isLoggable(TAG, 3))
            {
                Log.d(TAG, (new StringBuilder()).append("System ID was not saved, user is not logged in, no need to report that plugin is changed: ").append(s).toString());
            }
        } else
        if (s.equals(s1))
        {
            if (Log.isLoggable(TAG, 3))
            {
                Log.d(TAG, (new StringBuilder()).append("System ID did not changed: ").append(s).toString());
                return false;
            }
        } else
        {
            if (Log.isLoggable(TAG, 3))
            {
                Log.d(TAG, (new StringBuilder()).append("System ID changed from ").append(s).append(" to ").append(s1).toString());
            }
            return true;
        }
        return false;
    }

    public static boolean isWidewineSupported()
    {
        if (AndroidUtils.getAndroidVersion() >= 18)
        {
            return MediaDrm.isCryptoSchemeSupported(WIDEVINE_SCHEME);
        } else
        {
            return false;
        }
    }

    private void mediaDrmFailure(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        Log.d(TAG, "MediaDrm failed, unregister device and logout user");
        (new BackgroundTask()).execute(new Runnable() {

            final WidevineDrmManager this$0;

            public void run()
            {
                mUser.logoutUser();
                Log.d(WidevineDrmManager.TAG, "Redo CDM provisioning");
                init();
            }

            
            {
                this$0 = WidevineDrmManager.this;
                super();
            }
        });
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    private void removeSessionKeys(byte abyte0[])
    {
        if (abyte0 == null || drm == null)
        {
            break MISSING_BLOCK_LABEL_29;
        }
        Log.d(TAG, "removeSessionKeys");
        drm.removeKeys(abyte0);
        return;
        abyte0;
        Log.e(TAG, "removeSessionKeys ", abyte0);
        return;
    }

    private void reset()
    {
        PreferenceUtils.removePref(mContext, "nf_drm_system_id");
        closeSessionAndRemoveKeys(nccpCryptoFactoryCryptoSession.pendingSessionId);
        closeSessionAndRemoveKeys(nccpCryptoFactoryCryptoSession.sessionId);
        nccpCryptoFactoryCryptoSession.reset();
        mKeyIdsMap.clearMap();
    }

    private boolean restoreKeysToSession(AccountKeyMap.KeyIds keyids)
    {
        try
        {
            closeCryptoSessions(nccpCryptoFactoryCryptoSession.sessionId);
            nccpCryptoFactoryCryptoSession.sessionId = drm.openSession();
            drm.restoreKeys(nccpCryptoFactoryCryptoSession.sessionId, keyids.getKeySetId().getBytes());
        }
        // Misplaced declaration of an exception variable
        catch (AccountKeyMap.KeyIds keyids)
        {
            Log.e(TAG, "Failed to restore keys to DRM session");
            return false;
        }
        nccpCryptoFactoryCryptoSession.kceKeyId = keyids.getKceKeyId().getBytes();
        nccpCryptoFactoryCryptoSession.kchKeyId = keyids.getKchKeyId().getBytes();
        Log.d(TAG, "restoreKeysToSession succeeded.");
        return true;
    }

    private void showProperties()
    {
        if (Log.isLoggable(TAG, 3))
        {
            Log.d(TAG, (new StringBuilder()).append("vendor: ").append(drm.getPropertyString("vendor")).toString());
            Log.d(TAG, (new StringBuilder()).append("version: ").append(drm.getPropertyString("version")).toString());
            Log.d(TAG, (new StringBuilder()).append("description: ").append(drm.getPropertyString("description")).toString());
            Log.d(TAG, (new StringBuilder()).append("deviceId: ").append(Arrays.toString(drm.getPropertyByteArray("deviceUniqueId"))).toString());
            Log.d(TAG, (new StringBuilder()).append("algorithms: ").append(drm.getPropertyString("algorithms")).toString());
            Log.d(TAG, (new StringBuilder()).append("security level: ").append(drm.getPropertyString("securityLevel")).toString());
            Log.d(TAG, (new StringBuilder()).append("system ID: ").append(drm.getPropertyString("systemId")).toString());
            Log.i(TAG, (new StringBuilder()).append("provisioningId: ").append(Arrays.toString(drm.getPropertyByteArray("provisioningUniqueId"))).toString());
        }
    }

    private void startWidewineProvisioning()
    {
        synchronized (mWidevineProvisioned)
        {
            mWidevineProvisioned.set(false);
        }
        obj = drm.getProvisionRequest();
        WidewineProvisiongCallback widewineprovisiongcallback = new WidewineProvisiongCallback() {

            final WidevineDrmManager this$0;
            final String val$url;

            public void done(byte abyte0[])
            {
                if (abyte0 == null)
                {
                    break MISSING_BLOCK_LABEL_254;
                }
                if (Log.isLoggable(WidevineDrmManager.TAG, 3))
                {
                    Log.d(WidevineDrmManager.TAG, (new StringBuilder()).append("Got CDM provisiong ").append(new String(abyte0)).toString());
                }
                drm.provideProvisionResponse(abyte0);
                init();
_L2:
                return;
                abyte0;
                Log.d(WidevineDrmManager.TAG, (new StringBuilder()).append("Server declined Widewine provisioning request. Server URL: ").append(url).toString(), abyte0);
                mCallback.drmError(-101);
                mErrorLogging.logHandledException(new Exception((new StringBuilder()).append("Server declined Widewine provisioning request. Server URL: ").append(url).append(". Build: ").append(Build.DISPLAY).toString(), abyte0));
                return;
                abyte0;
                Log.d(WidevineDrmManager.TAG, "Fatal error on seting Widewine provisioning response", abyte0);
                mErrorLogging.logHandledException(new Exception((new StringBuilder()).append("Fatal error on seting Widewine provisioning response received from URL: ").append(url).append(". Build: ").append(Build.DISPLAY).toString(), abyte0));
                if (mCallback == null) goto _L2; else goto _L1
_L1:
                mCallback.drmError(-100);
                return;
                Log.e(WidevineDrmManager.TAG, "Failed to get provisiong certificate");
                mCallback.drmError(-100);
                mErrorLogging.logHandledException((new StringBuilder()).append("Failed to get provisiong certificate. Response is null from URL ").append(url).toString());
                return;
            }

            
            {
                this$0 = WidevineDrmManager.this;
                url = s;
                super();
            }
        };
        (new WidevineCDMProvisionRequestTask(((android.media.MediaDrm.ProvisionRequest) (obj)).getData(), widewineprovisiongcallback)).execute(new String[] {
            ((android.media.MediaDrm.ProvisionRequest) (obj)).getDefaultUrl()
        });
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void updateKeyResponseForNccpSession(byte abyte0[], byte abyte1[], byte abyte2[])
        throws DeniedByServerException, NotProvisionedException
    {
        Log.d(TAG, "Provide key response...");
        abyte0 = drm.provideKeyResponse(nccpCryptoFactoryCryptoSession.sessionId, abyte0);
        Log.d(TAG, "Save keys...");
        if (abyte0 == null)
        {
            Log.e(TAG, "Something is wrong, this should not happen! KeySetId is null!");
            throw new NotProvisionedException("Something is wrong, this should not happen! KeySetId is null!");
        } else
        {
            nccpCryptoFactoryCryptoSession.kceKeyId = abyte1;
            nccpCryptoFactoryCryptoSession.kchKeyId = abyte2;
            mKeyIdsMap.addCurrentKeyIds(new String(abyte0), new String(abyte1), new String(abyte2));
            mDrmSystemChanged = false;
            return;
        }
    }

    void clearKeys(String s)
    {
        this;
        JVM INSTR monitorenter ;
        if (Log.isLoggable(TAG, 3))
        {
            Log.d(TAG, (new StringBuilder()).append("clearKeys ").append(s).toString());
        }
        mKeyIdsMap.removeCurrentKeyIds(s);
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    byte[] decrypt(byte abyte0[], byte abyte1[])
    {
        android.media.MediaDrm.CryptoSession cryptosession = findMediaDrmCryptoSession();
        if (cryptosession == null)
        {
            Log.w(TAG, "decrypt - session NOT found!");
            return new byte[0];
        }
        if (nccpCryptoFactoryCryptoSession.kceKeyId == null)
        {
            Log.w(TAG, "decrypt - kce is null!");
            return new byte[0];
        }
        try
        {
            abyte0 = CryptoUtils.unpadPerPKCS5Padding(cryptosession.decrypt(nccpCryptoFactoryCryptoSession.kceKeyId, abyte0, abyte1), 16);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            Log.e(TAG, "Failed to decrypt ", abyte0);
            mediaDrmFailure(false);
            return new byte[0];
        }
        return abyte0;
    }

    public void destroy()
    {
        this;
        JVM INSTR monitorenter ;
        mWidevineProvisioned.set(false);
        closeSessionAndRemoveKeys(nccpCryptoFactoryCryptoSession.pendingSessionId);
        closeCryptoSessions(nccpCryptoFactoryCryptoSession.sessionId);
        if (drm != null)
        {
            drm.release();
            drm = null;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    byte[] encrypt(byte abyte0[], byte abyte1[])
    {
        android.media.MediaDrm.CryptoSession cryptosession = findMediaDrmCryptoSession();
        if (cryptosession == null)
        {
            Log.w(TAG, "encrypt - session NOT found!");
            return new byte[0];
        }
        if (nccpCryptoFactoryCryptoSession.kceKeyId == null)
        {
            Log.w(TAG, "encrypt - kce is null!");
            return new byte[0];
        }
        try
        {
            abyte0 = CryptoUtils.padPerPKCS5Padding(abyte0, 16);
            abyte0 = cryptosession.encrypt(nccpCryptoFactoryCryptoSession.kceKeyId, abyte0, abyte1);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            Log.e(TAG, "Failed to encrypt ", abyte0);
            mediaDrmFailure(false);
            return new byte[0];
        }
        return abyte0;
    }

    public byte[] getDeviceId()
    {
        byte abyte0[];
        if (drm == null)
        {
            Log.e(TAG, "Session MediaDrm is null! It should NOT happen!");
            abyte0 = null;
        } else
        {
            byte abyte1[] = drm.getPropertyByteArray("deviceUniqueId");
            if (abyte1 != null)
            {
                abyte0 = abyte1;
                if (Log.isLoggable(TAG, 3))
                {
                    Log.d(TAG, (new StringBuilder()).append("MediaDrm device ID is: ").append(new String(abyte1)).toString());
                    return abyte1;
                }
            } else
            {
                Log.e(TAG, "MediaDrm device ID is null! It should NOT happen!");
                return abyte1;
            }
        }
        return abyte0;
    }

    public String getDeviceType()
    {
        String s;
        if (drm == null)
        {
            Log.e(TAG, "Session MediaDrm is null! It should NOT happen!");
            s = null;
        } else
        {
            String s1 = drm.getPropertyString("systemId");
            s = s1;
            if (Log.isLoggable(TAG, 3))
            {
                Log.d(TAG, (new StringBuilder()).append("MediaDrm system ID is: ").append(s1).toString());
                return s1;
            }
        }
        return s;
    }

    public int getDrmType()
    {
        return 1;
    }

    byte[] getNccpSessionKeyRequest()
    {
        this;
        JVM INSTR monitorenter ;
        Log.d(TAG, "get NCCP session key request");
        byte abyte0[];
        abyte0 = createKeyRequest().getData();
        dumpKeyReqyest(abyte0);
_L2:
        this;
        JVM INSTR monitorexit ;
        return abyte0;
        Object obj;
        obj;
        Log.e(TAG, "Failed to get key request", ((Throwable) (obj)));
        mediaDrmFailure(false);
        obj = new byte[0];
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        throw obj;
    }

    public void init()
    {
        if (isWidevinePluginChanged())
        {
            PreferenceUtils.putStringPref(mContext, "nf_drm_system_id", getDeviceType());
            mediaDrmFailure(true);
        } else
        if (createNccpCryptoFactoryDrmSession())
        {
            Log.d(TAG, "NCCP Crypto Factory session is created");
            afterWidewineProvisioning();
            return;
        }
    }

    public void onEvent(MediaDrm mediadrm, byte abyte0[], int i, int j, byte abyte1[])
    {
        if (i == 1)
        {
            Log.d(TAG, "Provisioning is required");
        } else
        {
            if (i == 2)
            {
                Log.d(TAG, "MediaDrm event: Key required");
                return;
            }
            if (i == 3)
            {
                Log.d(TAG, "MediaDrm event: Key expired");
                return;
            }
            if (i == 4 && Log.isLoggable(TAG, 3))
            {
                Log.d(TAG, (new StringBuilder()).append("MediaDrm event: Vendor defined: ").append(i).toString());
                return;
            }
        }
    }

    boolean restoreKeys(String s, String s1, String s2)
    {
        boolean flag = true;
        this;
        JVM INSTR monitorenter ;
        if (Log.isLoggable(TAG, 3))
        {
            Log.d(TAG, (new StringBuilder()).append("restoreKeys for ").append(s).append(",kceKid: ").append(s1).append(",kchKid: ").append(s2).toString());
        }
        if (!s.equals(mCurrentAccountId)) goto _L2; else goto _L1
_L1:
        Log.d(TAG, "restoreKeys already loaded");
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        AccountKeyMap.KeyIds keyids = mKeyIdsMap.restoreKeyIdsForAccount(s);
        mCurrentAccountId = s;
        if (mDrmSystemChanged)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (isValidKeyIds(keyids, s1, s2))
        {
            flag = restoreKeysToSession(keyids);
            continue; /* Loop/switch isn't completed */
        }
        flag = false;
        if (true) goto _L4; else goto _L3
_L3:
        s;
        throw s;
    }

    byte[] sign(byte abyte0[])
    {
        android.media.MediaDrm.CryptoSession cryptosession = findMediaDrmCryptoSession();
        if (cryptosession == null)
        {
            Log.w(TAG, "sign - session NOT found!");
            return new byte[0];
        }
        if (nccpCryptoFactoryCryptoSession.kchKeyId == null)
        {
            Log.w(TAG, "sign - kch is null!");
            return new byte[0];
        }
        try
        {
            abyte0 = cryptosession.sign(nccpCryptoFactoryCryptoSession.kchKeyId, abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            Log.e(TAG, "Failed to sign message ", abyte0);
            mediaDrmFailure(false);
            return new byte[0];
        }
        return abyte0;
    }

    boolean updateNccpSessionKeyResponse(byte abyte0[], byte abyte1[], byte abyte2[], String s)
    {
        boolean flag = false;
        this;
        JVM INSTR monitorenter ;
        if (Log.isLoggable(TAG, 3))
        {
            Log.d(TAG, (new StringBuilder()).append("Update key response for account ").append(s).toString());
        }
          goto _L1
_L4:
        Log.e(TAG, "Update key response has invlaid input");
_L2:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L5:
        flag = false;
        byte abyte3[] = nccpCryptoFactoryCryptoSession.pendingSessionId;
        if (abyte3 == null)
        {
            break MISSING_BLOCK_LABEL_140;
        }
        Log.d(TAG, (new StringBuilder()).append("Update key response for pending session id ").append(new String(abyte3)).toString());
        abyte3 = nccpCryptoFactoryCryptoSession.activatePendingSessionId();
        if (!s.equals(mCurrentAccountId))
        {
            break MISSING_BLOCK_LABEL_153;
        }
        closeSessionAndRemoveKeys(abyte3);
_L3:
        updateKeyResponseForNccpSession(abyte0, abyte1, abyte2);
        flag = true;
          goto _L2
        closeCryptoSessions(abyte3);
          goto _L3
        abyte0;
        Log.e(TAG, (new StringBuilder()).append("We failed to update key response...").append(abyte0.getMessage()).append(": ").toString(), abyte0);
        mediaDrmFailure(false);
          goto _L2
        abyte0;
        throw abyte0;
_L1:
        if (abyte0 != null && abyte1 != null && abyte2 != null) goto _L5; else goto _L4
    }

    boolean verify(byte abyte0[], byte abyte1[])
    {
        Log.logByteArray(TAG, "Verify message", abyte0);
        android.media.MediaDrm.CryptoSession cryptosession = findMediaDrmCryptoSession();
        boolean flag;
        if (cryptosession == null)
        {
            Log.w(TAG, "verify - session NOT found!");
            flag = false;
        } else
        {
            if (nccpCryptoFactoryCryptoSession.kchKeyId == null)
            {
                Log.w(TAG, "verify - kch is null!");
                return false;
            }
            boolean flag1;
            try
            {
                flag1 = cryptosession.verify(nccpCryptoFactoryCryptoSession.kchKeyId, abyte0, abyte1);
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                Log.e(TAG, "Failed to verify message ", abyte0);
                mediaDrmFailure(false);
                return false;
            }
            flag = flag1;
            if (Log.isLoggable(TAG, 3))
            {
                Log.d(TAG, (new StringBuilder()).append("Messaage is verified: ").append(flag1).toString());
                return flag1;
            }
        }
        return flag;
    }





}
