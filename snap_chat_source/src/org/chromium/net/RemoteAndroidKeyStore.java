// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net;

import android.os.RemoteException;

// Referenced classes of package org.chromium.net:
//            AndroidKeyStore, IRemoteAndroidKeyStore, AndroidPrivateKey

public class RemoteAndroidKeyStore
    implements AndroidKeyStore
{

    private static boolean b;
    private final IRemoteAndroidKeyStore a;

    public byte[] getECKeyOrder(AndroidPrivateKey androidprivatekey)
    {
        try
        {
            androidprivatekey = a.g();
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
        if (!b)
        {
            throw new AssertionError();
        } else
        {
            return null;
        }
    }

    public long getOpenSSLHandleForPrivateKey(AndroidPrivateKey androidprivatekey)
    {
        if (!b)
        {
            throw new AssertionError();
        } else
        {
            return 0L;
        }
    }

    public int getPrivateKeyType(AndroidPrivateKey androidprivatekey)
    {
        int i;
        try
        {
            i = a.i();
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
        try
        {
            androidprivatekey = a.d();
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
        try
        {
            androidprivatekey = a.h();
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
        b = flag;
    }
}
