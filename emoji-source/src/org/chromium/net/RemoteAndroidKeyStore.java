// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net;

import android.os.RemoteException;
import android.util.Log;

// Referenced classes of package org.chromium.net:
//            AndroidKeyStore, IRemoteAndroidKeyStore, AndroidPrivateKey

public class RemoteAndroidKeyStore
    implements AndroidKeyStore
{
    private static class RemotePrivateKey
        implements AndroidPrivateKey
    {

        final int mHandle;
        final RemoteAndroidKeyStore mStore;

        public int getHandle()
        {
            return mHandle;
        }

        public AndroidKeyStore getKeyStore()
        {
            return mStore;
        }

        RemotePrivateKey(int i, RemoteAndroidKeyStore remoteandroidkeystore)
        {
            mHandle = i;
            mStore = remoteandroidkeystore;
        }
    }


    static final boolean $assertionsDisabled;
    private static final String TAG = "AndroidKeyStoreRemoteImpl";
    private final IRemoteAndroidKeyStore mRemoteManager;

    public RemoteAndroidKeyStore(IRemoteAndroidKeyStore iremoteandroidkeystore)
    {
        mRemoteManager = iremoteandroidkeystore;
    }

    public AndroidPrivateKey createKey(String s)
    {
        try
        {
            s = new RemotePrivateKey(mRemoteManager.getPrivateKeyHandle(s), this);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return null;
        }
        return s;
    }

    public byte[] getDSAKeyParamQ(AndroidPrivateKey androidprivatekey)
    {
        androidprivatekey = (RemotePrivateKey)androidprivatekey;
        try
        {
            Log.d("AndroidKeyStoreRemoteImpl", "getDSAKeyParamQ");
            androidprivatekey = mRemoteManager.getDSAKeyParamQ(androidprivatekey.getHandle());
        }
        // Misplaced declaration of an exception variable
        catch (AndroidPrivateKey androidprivatekey)
        {
            androidprivatekey.printStackTrace();
            return null;
        }
        return androidprivatekey;
    }

    public byte[] getECKeyOrder(AndroidPrivateKey androidprivatekey)
    {
        androidprivatekey = (RemotePrivateKey)androidprivatekey;
        try
        {
            Log.d("AndroidKeyStoreRemoteImpl", "getECKeyOrder");
            androidprivatekey = mRemoteManager.getECKeyOrder(androidprivatekey.getHandle());
        }
        // Misplaced declaration of an exception variable
        catch (AndroidPrivateKey androidprivatekey)
        {
            androidprivatekey.printStackTrace();
            return null;
        }
        return androidprivatekey;
    }

    public Object getOpenSSLEngineForPrivateKey(AndroidPrivateKey androidprivatekey)
    {
        if (!$assertionsDisabled)
        {
            throw new AssertionError();
        } else
        {
            return null;
        }
    }

    public long getOpenSSLHandleForPrivateKey(AndroidPrivateKey androidprivatekey)
    {
        if (!$assertionsDisabled)
        {
            throw new AssertionError();
        } else
        {
            return 0L;
        }
    }

    public byte[] getPrivateKeyEncodedBytes(AndroidPrivateKey androidprivatekey)
    {
        if (!$assertionsDisabled)
        {
            throw new AssertionError();
        } else
        {
            return null;
        }
    }

    public int getPrivateKeyType(AndroidPrivateKey androidprivatekey)
    {
        androidprivatekey = (RemotePrivateKey)androidprivatekey;
        int i;
        try
        {
            Log.d("AndroidKeyStoreRemoteImpl", "getPrivateKeyType");
            i = mRemoteManager.getPrivateKeyType(androidprivatekey.getHandle());
        }
        // Misplaced declaration of an exception variable
        catch (AndroidPrivateKey androidprivatekey)
        {
            androidprivatekey.printStackTrace();
            return 0;
        }
        return i;
    }

    public byte[] getRSAKeyModulus(AndroidPrivateKey androidprivatekey)
    {
        androidprivatekey = (RemotePrivateKey)androidprivatekey;
        try
        {
            Log.d("AndroidKeyStoreRemoteImpl", "getRSAKeyModulus");
            androidprivatekey = mRemoteManager.getRSAKeyModulus(androidprivatekey.getHandle());
        }
        // Misplaced declaration of an exception variable
        catch (AndroidPrivateKey androidprivatekey)
        {
            androidprivatekey.printStackTrace();
            return null;
        }
        return androidprivatekey;
    }

    public byte[] rawSignDigestWithPrivateKey(AndroidPrivateKey androidprivatekey, byte abyte0[])
    {
        androidprivatekey = (RemotePrivateKey)androidprivatekey;
        try
        {
            Log.d("AndroidKeyStoreRemoteImpl", "rawSignDigestWithPrivateKey");
            androidprivatekey = mRemoteManager.rawSignDigestWithPrivateKey(androidprivatekey.getHandle(), abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (AndroidPrivateKey androidprivatekey)
        {
            androidprivatekey.printStackTrace();
            return null;
        }
        return androidprivatekey;
    }

    public void releaseKey(AndroidPrivateKey androidprivatekey)
    {
        androidprivatekey = (RemotePrivateKey)androidprivatekey;
        try
        {
            Log.d("AndroidKeyStoreRemoteImpl", "releaseKey");
            mRemoteManager.releaseKey(androidprivatekey.getHandle());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (AndroidPrivateKey androidprivatekey)
        {
            androidprivatekey.printStackTrace();
        }
    }

    static 
    {
        boolean flag;
        if (!org/chromium/net/RemoteAndroidKeyStore.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
