// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.media;

import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import android.media.UnsupportedSchemeException;
import android.os.AsyncTask;
import android.os.Handler;
import android.util.Log;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

public class MediaDrmBridge
{
    private class MediaDrmListener
        implements android.media.MediaDrm.OnEventListener
    {

        static final boolean $assertionsDisabled;
        final MediaDrmBridge this$0;

        public void onEvent(MediaDrm mediadrm, byte abyte0[], int i, int j, byte abyte1[])
        {
            if (abyte0 != null) goto _L2; else goto _L1
_L1:
            Log.e("MediaDrmBridge", "MediaDrmListener: Null session.");
_L4:
            return;
_L2:
            abyte0 = ByteBuffer.wrap(abyte0);
            if (!sessionExists(abyte0))
            {
                Log.e("MediaDrmBridge", "MediaDrmListener: Invalid session.");
                return;
            }
            mediadrm = (Integer)mSessionIds.get(abyte0);
            if (mediadrm == null || mediadrm.intValue() == 0)
            {
                Log.e("MediaDrmBridge", "MediaDrmListener: Invalid session ID.");
                return;
            }
            switch (i)
            {
            default:
                Log.e("MediaDrmBridge", (new StringBuilder()).append("Invalid DRM event ").append(i).toString());
                return;

            case 1: // '\001'
                Log.d("MediaDrmBridge", "MediaDrm.EVENT_PROVISION_REQUIRED");
                return;

            case 2: // '\002'
                Log.d("MediaDrmBridge", "MediaDrm.EVENT_KEY_REQUIRED");
                if (!mProvisioningPending)
                {
                    String s = (String)mSessionMimeTypes.get(abyte0);
                    try
                    {
                        abyte0 = getKeyRequest(abyte0, abyte1, s);
                    }
                    // Misplaced declaration of an exception variable
                    catch (MediaDrm mediadrm)
                    {
                        Log.e("MediaDrmBridge", "Device not provisioned", mediadrm);
                        startProvisioning();
                        return;
                    }
                    if (abyte0 != null)
                    {
                        onSessionMessage(mediadrm.intValue(), abyte0);
                        return;
                    } else
                    {
                        onSessionError(mediadrm.intValue());
                        return;
                    }
                }
                break;

            case 3: // '\003'
                Log.d("MediaDrmBridge", "MediaDrm.EVENT_KEY_EXPIRED");
                onSessionError(mediadrm.intValue());
                return;

            case 4: // '\004'
                Log.d("MediaDrmBridge", "MediaDrm.EVENT_VENDOR_DEFINED");
                continue; /* Loop/switch isn't completed */
            }
            if (true) goto _L4; else goto _L3
_L3:
            if ($assertionsDisabled) goto _L4; else goto _L5
_L5:
            throw new AssertionError();
        }

        static 
        {
            boolean flag;
            if (!org/chromium/media/MediaDrmBridge.desiredAssertionStatus())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            $assertionsDisabled = flag;
        }

        private MediaDrmListener()
        {
            this$0 = MediaDrmBridge.this;
            super();
        }

    }

    private static class PendingCreateSessionData
    {

        private final byte mInitData[];
        private final String mMimeType;
        private final int mSessionId;

        private byte[] initData()
        {
            return mInitData;
        }

        private String mimeType()
        {
            return mMimeType;
        }

        private int sessionId()
        {
            return mSessionId;
        }




        private PendingCreateSessionData(int i, byte abyte0[], String s)
        {
            mSessionId = i;
            mInitData = abyte0;
            mMimeType = s;
        }

    }

    private class PostRequestTask extends AsyncTask
    {

        private static final String TAG = "PostRequestTask";
        private byte mDrmRequest[];
        private byte mResponseBody[];
        final MediaDrmBridge this$0;

        private byte[] postRequest(String s, byte abyte0[])
        {
            DefaultHttpClient defaulthttpclient = new DefaultHttpClient();
            s = new HttpPost((new StringBuilder()).append(s).append("&signedRequest=").append(new String(abyte0)).toString());
            Log.d("PostRequestTask", (new StringBuilder()).append("PostRequest:").append(s.getRequestLine()).toString());
            int i;
            try
            {
                s.setHeader("Accept", "*/*");
                s.setHeader("User-Agent", "Widevine CDM v1.0");
                s.setHeader("Content-Type", "application/json");
                s = defaulthttpclient.execute(s);
                i = s.getStatusLine().getStatusCode();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
                return null;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
                return null;
            }
            if (i != 200)
            {
                break MISSING_BLOCK_LABEL_137;
            }
            return EntityUtils.toByteArray(s.getEntity());
            Log.d("PostRequestTask", (new StringBuilder()).append("Server returned HTTP error code ").append(i).toString());
            return null;
        }

        protected volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((String[])aobj);
        }

        protected transient Void doInBackground(String as[])
        {
            mResponseBody = postRequest(as[0], mDrmRequest);
            if (mResponseBody != null)
            {
                Log.d("PostRequestTask", (new StringBuilder()).append("response length=").append(mResponseBody.length).toString());
            }
            return null;
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((Void)obj);
        }

        protected void onPostExecute(Void void1)
        {
            onProvisionResponse(mResponseBody);
        }

        public PostRequestTask(byte abyte0[])
        {
            this$0 = MediaDrmBridge.this;
            super();
            mDrmRequest = abyte0;
        }
    }


    static final boolean $assertionsDisabled;
    private static final String ENABLE = "enable";
    private static final int INVALID_SESSION_ID = 0;
    private static final String PRIVACY_MODE = "privacyMode";
    private static final String SECURITY_LEVEL = "securityLevel";
    private static final String SESSION_SHARING = "sessionSharing";
    private static final String TAG = "MediaDrmBridge";
    private Handler mHandler;
    private MediaCrypto mMediaCrypto;
    private ByteBuffer mMediaCryptoSession;
    private MediaDrm mMediaDrm;
    private long mNativeMediaDrmBridge;
    private ArrayDeque mPendingCreateSessionDataQueue;
    private boolean mProvisioningPending;
    private boolean mResetDeviceCredentialsPending;
    private UUID mSchemeUUID;
    private HashMap mSessionIds;
    private HashMap mSessionMimeTypes;
    private boolean mSingleSessionMode;

    private MediaDrmBridge(UUID uuid, long l, boolean flag)
        throws UnsupportedSchemeException
    {
        mSchemeUUID = uuid;
        mMediaDrm = new MediaDrm(uuid);
        mNativeMediaDrmBridge = l;
        mHandler = new Handler();
        mSingleSessionMode = flag;
        mSessionIds = new HashMap();
        mSessionMimeTypes = new HashMap();
        mPendingCreateSessionDataQueue = new ArrayDeque();
        mResetDeviceCredentialsPending = false;
        mProvisioningPending = false;
        mMediaDrm.setOnEventListener(new MediaDrmListener());
        mMediaDrm.setPropertyString("privacyMode", "enable");
        if (!mSingleSessionMode)
        {
            mMediaDrm.setPropertyString("sessionSharing", "enable");
        }
    }

    public static void addKeySystemUuidMapping(String s, UUID uuid)
    {
        ByteBuffer bytebuffer = ByteBuffer.allocateDirect(16);
        bytebuffer.order(ByteOrder.BIG_ENDIAN);
        bytebuffer.putLong(uuid.getMostSignificantBits());
        bytebuffer.putLong(uuid.getLeastSignificantBits());
        nativeAddKeySystemUuidMapping(s, bytebuffer);
    }

    private void closeSession(ByteBuffer bytebuffer)
    {
        if (!$assertionsDisabled && mMediaDrm == null)
        {
            throw new AssertionError();
        } else
        {
            mMediaDrm.closeSession(bytebuffer.array());
            return;
        }
    }

    private static MediaDrmBridge create(byte abyte0[], long l)
    {
        Object obj;
        Object obj1;
        Object obj3;
        UUID uuid = getUUIDFromBytes(abyte0);
        if (uuid == null || !MediaDrm.isCryptoSchemeSupported(uuid))
        {
            return null;
        }
        boolean flag = false;
        if (android.os.Build.VERSION.RELEASE.equals("4.4"))
        {
            flag = true;
        }
        obj = (new StringBuilder()).append("MediaDrmBridge uses ");
        if (flag)
        {
            abyte0 = "single";
        } else
        {
            abyte0 = "multiple";
        }
        Log.d("MediaDrmBridge", ((StringBuilder) (obj)).append(abyte0).append("-session mode.").toString());
        obj1 = null;
        obj3 = null;
        obj = null;
        abyte0 = new MediaDrmBridge(uuid, l, flag);
        Log.d("MediaDrmBridge", "MediaDrmBridge successfully created.");
        return abyte0;
        abyte0;
_L6:
        Log.e("MediaDrmBridge", "Unsupported DRM scheme", abyte0);
        return ((MediaDrmBridge) (obj));
        abyte0;
        obj = obj1;
_L4:
        Log.e("MediaDrmBridge", "Failed to create MediaDrmBridge", abyte0);
        return ((MediaDrmBridge) (obj));
        abyte0;
        obj = obj3;
_L2:
        Log.e("MediaDrmBridge", "Failed to create MediaDrmBridge", abyte0);
        return ((MediaDrmBridge) (obj));
        Object obj2;
        obj2;
        obj = abyte0;
        abyte0 = ((byte []) (obj2));
        if (true) goto _L2; else goto _L1
_L1:
        obj2;
        obj = abyte0;
        abyte0 = ((byte []) (obj2));
        if (true) goto _L4; else goto _L3
_L3:
        obj2;
        obj = abyte0;
        abyte0 = ((byte []) (obj2));
        if (true) goto _L6; else goto _L5
_L5:
    }

    private boolean createMediaCrypto()
        throws NotProvisionedException
    {
        if (mMediaDrm == null)
        {
            return false;
        }
        if (!$assertionsDisabled && mProvisioningPending)
        {
            throw new AssertionError();
        }
        if (!$assertionsDisabled && mMediaCryptoSession != null)
        {
            throw new AssertionError();
        }
        if (!$assertionsDisabled && mMediaCrypto != null)
        {
            throw new AssertionError();
        }
        mMediaCryptoSession = openSession();
        if (mMediaCryptoSession == null)
        {
            Log.e("MediaDrmBridge", "Cannot create MediaCrypto Session.");
            return false;
        }
        Log.d("MediaDrmBridge", (new StringBuilder()).append("MediaCrypto Session created: ").append(mMediaCryptoSession).toString());
        if (!MediaCrypto.isCryptoSchemeSupported(mSchemeUUID))
        {
            break MISSING_BLOCK_LABEL_196;
        }
        byte abyte0[] = mMediaCryptoSession.array();
        mMediaCrypto = new MediaCrypto(mSchemeUUID, abyte0);
        Log.d("MediaDrmBridge", "MediaCrypto successfully created!");
        mSessionIds.put(mMediaCryptoSession, Integer.valueOf(0));
        nativeOnMediaCryptoReady(mNativeMediaDrmBridge);
        return true;
        try
        {
            Log.e("MediaDrmBridge", "Cannot create MediaCrypto for unsupported scheme.");
        }
        catch (MediaCryptoException mediacryptoexception)
        {
            Log.e("MediaDrmBridge", "Cannot create MediaCrypto", mediacryptoexception);
        }
        release();
        return false;
    }

    private void createSession(int i, byte abyte0[], String s)
    {
        Object obj;
        Object obj1;
        boolean flag;
        boolean flag2;
        boolean flag3;
        Log.d("MediaDrmBridge", "createSession()");
        if (mMediaDrm == null)
        {
            Log.e("MediaDrmBridge", "createSession() called when MediaDrm is null.");
            return;
        }
        if (mProvisioningPending)
        {
            if (!$assertionsDisabled && mMediaCrypto != null)
            {
                throw new AssertionError();
            } else
            {
                savePendingCreateSessionData(i, abyte0, s);
                return;
            }
        }
        flag3 = false;
        flag2 = false;
        obj1 = null;
        flag = flag2;
        obj = obj1;
        if (mMediaCrypto != null)
        {
            break MISSING_BLOCK_LABEL_151;
        }
        flag = flag2;
        obj = obj1;
        if (!createMediaCrypto())
        {
            flag = flag2;
            obj = obj1;
            try
            {
                onSessionError(i);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                Log.e("MediaDrmBridge", "Device not provisioned", ((Throwable) (obj1)));
            }
            if (flag)
            {
                closeSession(((ByteBuffer) (obj)));
            }
            savePendingCreateSessionData(i, abyte0, s);
            startProvisioning();
            return;
        }
        flag = flag2;
        obj = obj1;
        if ($assertionsDisabled)
        {
            break MISSING_BLOCK_LABEL_196;
        }
        flag = flag2;
        obj = obj1;
        if (mMediaCrypto != null)
        {
            break MISSING_BLOCK_LABEL_196;
        }
        flag = flag2;
        obj = obj1;
        throw new AssertionError();
        flag = flag2;
        obj = obj1;
        if ($assertionsDisabled)
        {
            break MISSING_BLOCK_LABEL_248;
        }
        flag = flag2;
        obj = obj1;
        if (mSessionIds.containsKey(mMediaCryptoSession))
        {
            break MISSING_BLOCK_LABEL_248;
        }
        flag = flag2;
        obj = obj1;
        throw new AssertionError();
        flag = flag2;
        obj = obj1;
        if (!mSingleSessionMode)
        {
            break MISSING_BLOCK_LABEL_371;
        }
        flag = flag2;
        obj = obj1;
        Object obj2 = mMediaCryptoSession;
        boolean flag1;
        flag = flag2;
        obj = obj2;
        flag1 = flag3;
        obj1 = obj2;
        if (mSessionMimeTypes.get(obj2) == null)
        {
            break MISSING_BLOCK_LABEL_493;
        }
        flag = flag2;
        obj = obj2;
        flag1 = flag3;
        obj1 = obj2;
        if (((String)mSessionMimeTypes.get(obj2)).equals(s))
        {
            break MISSING_BLOCK_LABEL_493;
        }
        flag = flag2;
        obj = obj2;
        Log.e("MediaDrmBridge", "Only one mime type is supported in single session mode.");
        flag = flag2;
        obj = obj2;
        onSessionError(i);
        return;
        flag = flag2;
        obj = obj1;
        obj2 = openSession();
        if (obj2 != null)
        {
            break MISSING_BLOCK_LABEL_421;
        }
        flag = flag2;
        obj = obj2;
        Log.e("MediaDrmBridge", "Cannot open session in createSession().");
        flag = flag2;
        obj = obj2;
        onSessionError(i);
        return;
        flag3 = true;
        flag2 = true;
        flag = flag2;
        obj = obj2;
        flag1 = flag3;
        obj1 = obj2;
        if ($assertionsDisabled)
        {
            break MISSING_BLOCK_LABEL_493;
        }
        flag = flag2;
        obj = obj2;
        flag1 = flag3;
        obj1 = obj2;
        if (!mSessionIds.containsKey(obj2))
        {
            break MISSING_BLOCK_LABEL_493;
        }
        flag = flag2;
        obj = obj2;
        throw new AssertionError();
        flag = flag1;
        obj = obj1;
        obj2 = getKeyRequest(((ByteBuffer) (obj1)), abyte0, s);
        if (obj2 != null)
        {
            break MISSING_BLOCK_LABEL_549;
        }
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_535;
        }
        flag = flag1;
        obj = obj1;
        closeSession(((ByteBuffer) (obj1)));
        flag = flag1;
        obj = obj1;
        onSessionError(i);
        return;
        flag = flag1;
        obj = obj1;
        onSessionCreated(i, getWebSessionId(((ByteBuffer) (obj1))));
        flag = flag1;
        obj = obj1;
        onSessionMessage(i, ((android.media.MediaDrm.KeyRequest) (obj2)));
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_643;
        }
        flag = flag1;
        obj = obj1;
        Log.d("MediaDrmBridge", (new StringBuilder()).append("createSession(): Session ").append(getWebSessionId(((ByteBuffer) (obj1)))).append(" (").append(i).append(") created.").toString());
        flag = flag1;
        obj = obj1;
        mSessionIds.put(obj1, Integer.valueOf(i));
        flag = flag1;
        obj = obj1;
        mSessionMimeTypes.put(obj1, s);
        return;
    }

    private android.media.MediaDrm.KeyRequest getKeyRequest(ByteBuffer bytebuffer, byte abyte0[], String s)
        throws NotProvisionedException
    {
        if (!$assertionsDisabled && mMediaDrm == null)
        {
            throw new AssertionError();
        }
        if (!$assertionsDisabled && mMediaCrypto == null)
        {
            throw new AssertionError();
        }
        if (!$assertionsDisabled && mProvisioningPending)
        {
            throw new AssertionError();
        }
        HashMap hashmap = new HashMap();
        abyte0 = mMediaDrm.getKeyRequest(bytebuffer.array(), abyte0, s, 1, hashmap);
        if (abyte0 != null)
        {
            bytebuffer = "successed";
        } else
        {
            bytebuffer = "failed";
        }
        Log.d("MediaDrmBridge", (new StringBuilder()).append("getKeyRequest ").append(bytebuffer).append("!").toString());
        return abyte0;
    }

    private MediaCrypto getMediaCrypto()
    {
        return mMediaCrypto;
    }

    private String getSecurityLevel()
    {
        if (mMediaDrm == null)
        {
            Log.e("MediaDrmBridge", "getSecurityLevel() called when MediaDrm is null.");
            return null;
        } else
        {
            return mMediaDrm.getPropertyString("securityLevel");
        }
    }

    private ByteBuffer getSession(int i)
    {
        for (Iterator iterator = mSessionIds.keySet().iterator(); iterator.hasNext();)
        {
            ByteBuffer bytebuffer = (ByteBuffer)iterator.next();
            if (((Integer)mSessionIds.get(bytebuffer)).intValue() == i)
            {
                return bytebuffer;
            }
        }

        return null;
    }

    private static UUID getUUIDFromBytes(byte abyte0[])
    {
        if (abyte0.length != 16)
        {
            return null;
        }
        long l = 0L;
        long l1 = 0L;
        for (int i = 0; i < 8; i++)
        {
            l = l << 8 | (long)(abyte0[i] & 0xff);
        }

        for (int j = 8; j < 16; j++)
        {
            l1 = l1 << 8 | (long)(abyte0[j] & 0xff);
        }

        return new UUID(l, l1);
    }

    private String getWebSessionId(ByteBuffer bytebuffer)
    {
        try
        {
            bytebuffer = new String(bytebuffer.array(), "UTF-8");
        }
        // Misplaced declaration of an exception variable
        catch (ByteBuffer bytebuffer)
        {
            Log.e("MediaDrmBridge", "getWebSessionId failed", bytebuffer);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (ByteBuffer bytebuffer)
        {
            Log.e("MediaDrmBridge", "getWebSessionId failed", bytebuffer);
            return null;
        }
        return bytebuffer;
    }

    private static boolean isCryptoSchemeSupported(byte abyte0[], String s)
    {
        abyte0 = getUUIDFromBytes(abyte0);
        if (s.isEmpty())
        {
            return MediaDrm.isCryptoSchemeSupported(abyte0);
        } else
        {
            return MediaDrm.isCryptoSchemeSupported(abyte0, s);
        }
    }

    private static native void nativeAddKeySystemUuidMapping(String s, ByteBuffer bytebuffer);

    private native void nativeOnMediaCryptoReady(long l);

    private native void nativeOnResetDeviceCredentialsCompleted(long l, boolean flag);

    private native void nativeOnSessionClosed(long l, int i);

    private native void nativeOnSessionCreated(long l, int i, String s);

    private native void nativeOnSessionError(long l, int i);

    private native void nativeOnSessionMessage(long l, int i, byte abyte0[], String s);

    private native void nativeOnSessionReady(long l, int i);

    private void onProvisionResponse(byte abyte0[])
    {
        Log.d("MediaDrmBridge", "onProvisionResponse()");
        if (!$assertionsDisabled && !mProvisioningPending)
        {
            throw new AssertionError();
        }
        mProvisioningPending = false;
        if (mMediaDrm != null)
        {
            boolean flag = provideProvisionResponse(abyte0);
            if (mResetDeviceCredentialsPending)
            {
                nativeOnResetDeviceCredentialsCompleted(mNativeMediaDrmBridge, flag);
                mResetDeviceCredentialsPending = false;
            }
            if (flag)
            {
                resumePendingOperations();
                return;
            }
        }
    }

    private void onSessionClosed(final int sessionId)
    {
        mHandler.post(new Runnable() {

            final MediaDrmBridge this$0;
            final int val$sessionId;

            public void run()
            {
                nativeOnSessionClosed(mNativeMediaDrmBridge, sessionId);
            }

            
            {
                this$0 = MediaDrmBridge.this;
                sessionId = i;
                super();
            }
        });
    }

    private void onSessionCreated(final int sessionId, final String webSessionId)
    {
        mHandler.post(new Runnable() {

            final MediaDrmBridge this$0;
            final int val$sessionId;
            final String val$webSessionId;

            public void run()
            {
                nativeOnSessionCreated(mNativeMediaDrmBridge, sessionId, webSessionId);
            }

            
            {
                this$0 = MediaDrmBridge.this;
                sessionId = i;
                webSessionId = s;
                super();
            }
        });
    }

    private void onSessionError(final int sessionId)
    {
        mHandler.post(new Runnable() {

            final MediaDrmBridge this$0;
            final int val$sessionId;

            public void run()
            {
                nativeOnSessionError(mNativeMediaDrmBridge, sessionId);
            }

            
            {
                this$0 = MediaDrmBridge.this;
                sessionId = i;
                super();
            }
        });
    }

    private void onSessionMessage(final int sessionId, final android.media.MediaDrm.KeyRequest request)
    {
        mHandler.post(new Runnable() {

            final MediaDrmBridge this$0;
            final android.media.MediaDrm.KeyRequest val$request;
            final int val$sessionId;

            public void run()
            {
                nativeOnSessionMessage(mNativeMediaDrmBridge, sessionId, request.getData(), request.getDefaultUrl());
            }

            
            {
                this$0 = MediaDrmBridge.this;
                sessionId = i;
                request = keyrequest;
                super();
            }
        });
    }

    private void onSessionReady(final int sessionId)
    {
        mHandler.post(new Runnable() {

            final MediaDrmBridge this$0;
            final int val$sessionId;

            public void run()
            {
                nativeOnSessionReady(mNativeMediaDrmBridge, sessionId);
            }

            
            {
                this$0 = MediaDrmBridge.this;
                sessionId = i;
                super();
            }
        });
    }

    private ByteBuffer openSession()
        throws NotProvisionedException
    {
        if (!$assertionsDisabled && mMediaDrm == null)
        {
            throw new AssertionError();
        }
        ByteBuffer bytebuffer;
        try
        {
            bytebuffer = ByteBuffer.wrap((byte[])mMediaDrm.openSession().clone());
        }
        catch (RuntimeException runtimeexception)
        {
            Log.e("MediaDrmBridge", "Cannot open a new session", runtimeexception);
            release();
            return null;
        }
        catch (NotProvisionedException notprovisionedexception)
        {
            throw notprovisionedexception;
        }
        catch (MediaDrmException mediadrmexception)
        {
            Log.e("MediaDrmBridge", "Cannot open a new session", mediadrmexception);
            release();
            return null;
        }
        return bytebuffer;
    }

    private void processPendingCreateSessionData()
    {
        Log.d("MediaDrmBridge", "processPendingCreateSessionData()");
        if (!$assertionsDisabled && mMediaDrm == null)
        {
            throw new AssertionError();
        }
        PendingCreateSessionData pendingcreatesessiondata;
        for (; mMediaDrm != null && !mProvisioningPending && !mPendingCreateSessionDataQueue.isEmpty(); createSession(pendingcreatesessiondata.sessionId(), pendingcreatesessiondata.initData(), pendingcreatesessiondata.mimeType()))
        {
            pendingcreatesessiondata = (PendingCreateSessionData)mPendingCreateSessionDataQueue.poll();
        }

    }

    private void release()
    {
        mPendingCreateSessionDataQueue.clear();
        mPendingCreateSessionDataQueue = null;
        for (Iterator iterator = mSessionIds.keySet().iterator(); iterator.hasNext(); closeSession((ByteBuffer)iterator.next())) { }
        mSessionIds.clear();
        mSessionIds = null;
        mSessionMimeTypes.clear();
        mSessionMimeTypes = null;
        mMediaCryptoSession = null;
        if (mMediaCrypto != null)
        {
            mMediaCrypto.release();
            mMediaCrypto = null;
        }
        if (mMediaDrm != null)
        {
            mMediaDrm.release();
            mMediaDrm = null;
        }
    }

    private void releaseSession(int i)
    {
        Log.d("MediaDrmBridge", (new StringBuilder()).append("releaseSession(): ").append(i).toString());
        if (mMediaDrm == null)
        {
            Log.e("MediaDrmBridge", "releaseSession() called when MediaDrm is null.");
        } else
        {
            ByteBuffer bytebuffer = getSession(i);
            if (bytebuffer == null)
            {
                Log.e("MediaDrmBridge", "Invalid sessionId in releaseSession.");
                onSessionError(i);
                return;
            }
            mMediaDrm.removeKeys(bytebuffer.array());
            if (!mSingleSessionMode)
            {
                Log.d("MediaDrmBridge", (new StringBuilder()).append("Session ").append(i).append("closed.").toString());
                closeSession(bytebuffer);
                mSessionIds.remove(bytebuffer);
                onSessionClosed(i);
                return;
            }
        }
    }

    private void resetDeviceCredentials()
    {
        mResetDeviceCredentialsPending = true;
        android.media.MediaDrm.ProvisionRequest provisionrequest = mMediaDrm.getProvisionRequest();
        (new PostRequestTask(provisionrequest.getData())).execute(new String[] {
            provisionrequest.getDefaultUrl()
        });
    }

    private void resumePendingOperations()
    {
        mHandler.post(new Runnable() {

            final MediaDrmBridge this$0;

            public void run()
            {
                processPendingCreateSessionData();
            }

            
            {
                this$0 = MediaDrmBridge.this;
                super();
            }
        });
    }

    private void savePendingCreateSessionData(int i, byte abyte0[], String s)
    {
        Log.d("MediaDrmBridge", "savePendingCreateSessionData()");
        mPendingCreateSessionDataQueue.offer(new PendingCreateSessionData(i, abyte0, s));
    }

    private boolean sessionExists(ByteBuffer bytebuffer)
    {
        if (mMediaCryptoSession == null)
        {
            if (!$assertionsDisabled && !mSessionIds.isEmpty())
            {
                throw new AssertionError();
            }
            Log.e("MediaDrmBridge", "Session doesn't exist because media crypto session is not created.");
        } else
        {
            if (!$assertionsDisabled && !mSessionIds.containsKey(mMediaCryptoSession))
            {
                throw new AssertionError();
            }
            if (mSingleSessionMode)
            {
                return mMediaCryptoSession.equals(bytebuffer);
            }
            if (!bytebuffer.equals(mMediaCryptoSession) && mSessionIds.containsKey(bytebuffer))
            {
                return true;
            }
        }
        return false;
    }

    private boolean setSecurityLevel(String s)
    {
        boolean flag = true;
        if (mMediaDrm != null && mMediaCrypto == null) goto _L2; else goto _L1
_L1:
        flag = false;
_L4:
        return flag;
_L2:
        String s1;
        s1 = mMediaDrm.getPropertyString("securityLevel");
        Log.e("MediaDrmBridge", (new StringBuilder()).append("Security level: current ").append(s1).append(", new ").append(s).toString());
        if (s.equals(s1)) goto _L4; else goto _L3
_L3:
        mMediaDrm.setPropertyString("securityLevel", s);
        return true;
        Object obj;
        obj;
        Log.e("MediaDrmBridge", (new StringBuilder()).append("Failed to set security level ").append(s).toString(), ((Throwable) (obj)));
_L6:
        Log.e("MediaDrmBridge", (new StringBuilder()).append("Security level ").append(s).append(" not supported!").toString());
        return false;
        obj;
        Log.e("MediaDrmBridge", (new StringBuilder()).append("Failed to set security level ").append(s).toString(), ((Throwable) (obj)));
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void startProvisioning()
    {
        Log.d("MediaDrmBridge", "startProvisioning");
        if (!$assertionsDisabled && mMediaDrm == null)
        {
            throw new AssertionError();
        }
        if (!$assertionsDisabled && mProvisioningPending)
        {
            throw new AssertionError();
        } else
        {
            mProvisioningPending = true;
            android.media.MediaDrm.ProvisionRequest provisionrequest = mMediaDrm.getProvisionRequest();
            (new PostRequestTask(provisionrequest.getData())).execute(new String[] {
                provisionrequest.getDefaultUrl()
            });
            return;
        }
    }

    private void updateSession(int i, byte abyte0[])
    {
        ByteBuffer bytebuffer;
        Log.d("MediaDrmBridge", (new StringBuilder()).append("updateSession(): ").append(i).toString());
        if (mMediaDrm == null)
        {
            Log.e("MediaDrmBridge", "updateSession() called when MediaDrm is null.");
            return;
        }
        bytebuffer = getSession(i);
        if (!sessionExists(bytebuffer))
        {
            Log.e("MediaDrmBridge", "Invalid session in updateSession.");
            onSessionError(i);
            return;
        }
        mMediaDrm.provideKeyResponse(bytebuffer.array(), abyte0);
_L1:
        onSessionReady(i);
        Log.d("MediaDrmBridge", (new StringBuilder()).append("Key successfully added for session ").append(i).toString());
        return;
        abyte0;
        Log.e("MediaDrmBridge", "failed to provide key response", abyte0);
_L2:
        onSessionError(i);
        release();
        return;
        abyte0;
        Log.e("MediaDrmBridge", "Exception intentionally caught when calling provideKeyResponse()", abyte0);
          goto _L1
        abyte0;
        Log.e("MediaDrmBridge", "failed to provide key response", abyte0);
          goto _L2
    }

    boolean provideProvisionResponse(byte abyte0[])
    {
        if (abyte0 == null || abyte0.length == 0)
        {
            Log.e("MediaDrmBridge", "Invalid provision response.");
            return false;
        }
        try
        {
            mMediaDrm.provideProvisionResponse(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            Log.e("MediaDrmBridge", "failed to provide provision response", abyte0);
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            Log.e("MediaDrmBridge", "failed to provide provision response", abyte0);
            return false;
        }
        return true;
    }

    static 
    {
        boolean flag;
        if (!org/chromium/media/MediaDrmBridge.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
















}
