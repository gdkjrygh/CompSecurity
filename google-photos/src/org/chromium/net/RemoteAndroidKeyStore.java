// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net;

import android.os.RemoteException;

// Referenced classes of package org.chromium.net:
//            AndroidKeyStore, AndroidPrivateKey

public class RemoteAndroidKeyStore
    implements AndroidKeyStore
{

    public byte[] getECKeyOrder(AndroidPrivateKey androidprivatekey)
    {
        try
        {
            throw new NullPointerException();
        }
        // Misplaced declaration of an exception variable
        catch (AndroidPrivateKey androidprivatekey)
        {
            androidprivatekey.printStackTrace();
        }
        return null;
    }

    public Object getOpenSSLEngineForPrivateKey(AndroidPrivateKey androidprivatekey)
    {
        return null;
    }

    public long getOpenSSLHandleForPrivateKey(AndroidPrivateKey androidprivatekey)
    {
        return 0L;
    }

    public int getPrivateKeyType(AndroidPrivateKey androidprivatekey)
    {
        try
        {
            throw new NullPointerException();
        }
        // Misplaced declaration of an exception variable
        catch (AndroidPrivateKey androidprivatekey)
        {
            androidprivatekey.printStackTrace();
        }
        return 0;
    }

    public byte[] getRSAKeyModulus(AndroidPrivateKey androidprivatekey)
    {
        try
        {
            throw new NullPointerException();
        }
        // Misplaced declaration of an exception variable
        catch (AndroidPrivateKey androidprivatekey)
        {
            androidprivatekey.printStackTrace();
        }
        return null;
    }

    public byte[] rawSignDigestWithPrivateKey(AndroidPrivateKey androidprivatekey, byte abyte0[])
    {
        try
        {
            throw new NullPointerException();
        }
        // Misplaced declaration of an exception variable
        catch (AndroidPrivateKey androidprivatekey)
        {
            androidprivatekey.printStackTrace();
        }
        return null;
    }

    public void releaseKey(AndroidPrivateKey androidprivatekey)
    {
    }
}
