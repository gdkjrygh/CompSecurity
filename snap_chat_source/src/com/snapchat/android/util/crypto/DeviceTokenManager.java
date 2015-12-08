// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util.crypto;

import IO;
import Iu;
import KF;
import KN;
import KO;
import KQ;
import Kl;
import LA;
import Ll;
import Pf;
import android.app.Application;
import android.util.Pair;
import com.google.gson.JsonSyntaxException;
import com.snapchat.android.SnapchatApplication;
import com.snapchat.android.Timber;
import com.snapchat.android.util.AlertDialogUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import lX;
import mm;
import oV;
import org.apache.commons.codec.binary.Hex;
import org.apache.commons.io.Charsets;

// Referenced classes of package com.snapchat.android.util.crypto:
//            DeviceToken, CbcEncryptionAlgorithm

public class DeviceTokenManager
{

    private static final String FIELD_SEPARATOR_FOR_SIGNATURE = "|";
    private static final String FILENAME = "device_token_1";
    private static final String SECURE_HASH_ALGORITHM = "HmacSHA256";
    private static final String TAG = "DeviceTokenManager";
    private static final int TRUNCATED_SIZE_IN_BYTES = 10;
    private static DeviceTokenManager sInstance;
    private final lX mApiTaskFactory;
    private final LA mDeveloperSettings;
    protected DeviceToken mDeviceToken;
    protected ExecutorService mExecutorService;
    private final Iu mGsonWrapper;
    protected boolean mIsFetchingDeviceTokenFromServer;
    private final Object mMutex = new Object();
    private final KO mSlightlySecurePreferences;

    public DeviceTokenManager(KO ko, Iu iu, lX lx, LA la)
    {
        mIsFetchingDeviceTokenFromServer = false;
        mExecutorService = IO.MISCELLANEOUS_EXECUTOR;
        mSlightlySecurePreferences = ko;
        mGsonWrapper = iu;
        mApiTaskFactory = lx;
        mDeveloperSettings = la;
    }

    public static DeviceTokenManager getInstance()
    {
        com/snapchat/android/util/crypto/DeviceTokenManager;
        JVM INSTR monitorenter ;
        DeviceTokenManager devicetokenmanager;
        if (sInstance == null)
        {
            sInstance = SnapchatApplication.getDIComponent().a();
        }
        devicetokenmanager = sInstance;
        com/snapchat/android/util/crypto/DeviceTokenManager;
        JVM INSTR monitorexit ;
        return devicetokenmanager;
        Exception exception;
        exception;
        throw exception;
    }

    private void logDeviceTokenMessage(String s)
    {
        String s1 = s;
        if (mDeveloperSettings.c())
        {
            s1 = s;
            if (mDeviceToken != null)
            {
                s1 = (new StringBuilder()).append(s).append("\n").append(mDeviceToken.getId()).toString();
            }
            AlertDialogUtils.a(s1, SnapchatApplication.get().getApplicationContext(), 1);
        }
        Timber.c("DeviceTokenManager", s1, new Object[0]);
    }

    private byte[] readDataFromDisk(File file)
    {
        BufferedInputStream bufferedinputstream = new BufferedInputStream(new FileInputStream(file));
        long l = file.length();
        if (l > 0x7fffffffL)
        {
            throw new IOException("Cannot read files larger than 2147483647 bytes");
        } else
        {
            int i = (int)l;
            file = new byte[i];
            bufferedinputstream.read(file, 0, i);
            bufferedinputstream.close();
            return file;
        }
    }

    public void checkForDeviceTokenAsynchronously()
    {
        Runnable runnable = new Runnable() {

            final DeviceTokenManager this$0;

            public final void run()
            {
                checkForDeviceTokenSynchronously(true);
            }

            
            {
                this$0 = DeviceTokenManager.this;
                super();
            }
        };
        mExecutorService.execute(runnable);
    }

    protected void checkForDeviceTokenSynchronously(boolean flag)
    {
label0:
        {
            mSlightlySecurePreferences.b();
            synchronized (mMutex)
            {
                if (mDeviceToken == null)
                {
                    break label0;
                }
                logDeviceTokenMessage("Device token successfully fetched in memory.");
            }
            return;
        }
        mDeviceToken = getDeviceToken1FromDisk();
        if (mDeviceToken == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        logDeviceTokenMessage("Device token successfully fetched from disk.");
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        IOException ioexception;
        ioexception;
        Timber.a("DeviceTokenManager", ioexception);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_104;
        }
        if (!mIsFetchingDeviceTokenFromServer)
        {
            logDeviceTokenMessage("Requesting a new device token from the server.");
            mIsFetchingDeviceTokenFromServer = true;
            mm mm1 = new mm();
            mm1.onResult(mm1.executeSynchronously());
        }
        obj;
        JVM INSTR monitorexit ;
    }

    public String getDeviceSignature(DeviceToken devicetoken, String s, String s1, String s2, String s3)
    {
        devicetoken = new SecretKeySpec(devicetoken.getValue().getBytes(Charsets.UTF_8), "HmacSHA256");
        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(devicetoken);
        devicetoken = (new String(Hex.encodeHex(Arrays.copyOf(mac.doFinal((new StringBuilder()).append(s).append("|").append(s1).append("|").append(s2).append("|").append(s3).toString().getBytes(Charsets.UTF_8)), 10)))).toLowerCase(Locale.ENGLISH);
        return devicetoken;
        devicetoken;
_L2:
        Timber.a("DeviceTokenManager", devicetoken);
        return null;
        devicetoken;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public DeviceToken getDeviceToken1(boolean flag)
    {
        checkForDeviceTokenSynchronously(flag);
        return mDeviceToken;
    }

    protected DeviceToken getDeviceToken1FromDisk()
    {
        File file;
        file = getTokenFile();
        if (file == null || !file.exists())
        {
            return null;
        }
        Object obj1 = getDeviceToken1KeyAndIv();
        if (obj1 == null)
        {
            file.delete();
            return null;
        }
        byte abyte0[] = readDataFromDisk(file);
        obj1 = new CbcEncryptionAlgorithm(((KF) (obj1)).mKey, ((KF) (obj1)).mIv);
        Object obj;
        try
        {
            obj = ((CbcEncryptionAlgorithm) (obj1)).b(abyte0, "no dataId provided");
        }
        catch (GeneralSecurityException generalsecurityexception)
        {
            Timber.a("DeviceTokenManager", generalsecurityexception);
            generalsecurityexception = null;
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_111;
        }
        obj = (DeviceToken)mGsonWrapper.a(new String(((byte []) (obj))), com/snapchat/android/util/crypto/DeviceToken);
        return ((DeviceToken) (obj));
        JsonSyntaxException jsonsyntaxexception;
        jsonsyntaxexception;
        Timber.a("DeviceTokenManager", jsonsyntaxexception);
        file.delete();
        return null;
    }

    public KF getDeviceToken1KeyAndIv()
    {
        String s = mSlightlySecurePreferences.a(KQ.DEVICE_TOKEN_1_KEY_AND_IV);
        if (s == null)
        {
            return null;
        } else
        {
            return (KF)mGsonWrapper.a(s, KF);
        }
    }

    public Pair getDeviceTokenAndSignaturePair(String s, String s1, String s2)
    {
        checkForDeviceTokenSynchronously(false);
        if (mDeviceToken != null && mDeviceToken.getId() != null && mDeviceToken.getValue() != null)
        {
            s = getDeviceSignature(mDeviceToken, s, s, s1, s2);
            return Pair.create(mDeviceToken.getId(), s);
        } else
        {
            return null;
        }
    }

    public String getDeviceTokenIdHash(boolean flag)
    {
        DeviceToken devicetoken = getDeviceToken1(flag);
        if (devicetoken == null)
        {
            return null;
        } else
        {
            return KN.b(devicetoken.getId());
        }
    }

    protected File getTokenFile()
    {
        File file2 = new File((new StringBuilder()).append(Kl.sInternalCacheDirectory.getAbsolutePath()).append("/Snapchat").toString());
        File file1 = new File(file2, "device_token_1");
        File file = file1;
        if (!file2.exists())
        {
            file = file1;
            if (!file2.mkdirs())
            {
                file = null;
            }
        }
        return file;
    }

    public void onGetDeviceTokenTaskCompleted(DeviceToken devicetoken)
    {
label0:
        {
            synchronized (mMutex)
            {
                mDeviceToken = devicetoken;
                mIsFetchingDeviceTokenFromServer = false;
                if (mDeviceToken != null)
                {
                    break label0;
                }
            }
            return;
        }
        obj;
        JVM INSTR monitorexit ;
        byte abyte0[];
        Timber.c("DeviceTokenManager", "A new device token was acquired from the server.", new Object[0]);
        devicetoken = mGsonWrapper.a(mDeviceToken).getBytes();
        obj = new CbcEncryptionAlgorithm();
        storeDeviceToken1KeyAndIvToSsp(((CbcEncryptionAlgorithm) (obj)).b(), ((CbcEncryptionAlgorithm) (obj)).c());
        abyte0 = ((CbcEncryptionAlgorithm) (obj)).a(devicetoken, "no dataId provided");
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_182;
        }
        obj = getTokenFile();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_182;
        }
        devicetoken = null;
        ((File) (obj)).delete();
        ((File) (obj)).createNewFile();
        obj = new BufferedOutputStream(new FileOutputStream(((File) (obj))));
        devicetoken = ((DeviceToken) (obj));
        ((BufferedOutputStream) (obj)).write(abyte0);
        Pf.a(((java.io.Closeable) (obj)));
        return;
        devicetoken;
        obj;
        JVM INSTR monitorexit ;
        throw devicetoken;
        Object obj1;
        obj1;
        obj = null;
_L4:
        devicetoken = ((DeviceToken) (obj));
        Timber.a("DeviceTokenManager", ((Throwable) (obj1)));
        Pf.a(((java.io.Closeable) (obj)));
        return;
        obj1;
        DeviceToken devicetoken1;
        devicetoken1 = devicetoken;
        devicetoken = ((DeviceToken) (obj1));
_L2:
        Pf.a(devicetoken1);
        throw devicetoken;
        obj1;
        devicetoken1 = devicetoken;
        devicetoken = ((DeviceToken) (obj1));
        if (true) goto _L2; else goto _L1
_L1:
        obj1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void storeDeviceToken1KeyAndIvToSsp(String s, String s1)
    {
        s = new KF(s, s1);
        mSlightlySecurePreferences.a(KQ.DEVICE_TOKEN_1_KEY_AND_IV, mGsonWrapper.a(s));
    }
}
