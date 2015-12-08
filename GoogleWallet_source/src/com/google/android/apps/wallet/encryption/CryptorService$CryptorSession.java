// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.encryption;

import com.google.common.base.Throwables;
import org.keyczar.SessionCrypter;
import org.keyczar.exceptions.KeyczarException;

// Referenced classes of package com.google.android.apps.wallet.encryption:
//            CryptorService

public static class <init>
    implements ssion
{

    private final SessionCrypter mSessionCrypter;

    public volatile Object decrypt(Object obj)
    {
        return decrypt((byte[])obj);
    }

    public byte[] decrypt(byte abyte0[])
    {
        try
        {
            abyte0 = mSessionCrypter.decrypt(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw Throwables.propagate(abyte0);
        }
        return abyte0;
    }

    public volatile Object encrypt(Object obj)
    {
        return encrypt((byte[])obj);
    }

    public byte[] encrypt(byte abyte0[])
    {
        try
        {
            abyte0 = mSessionCrypter.encrypt(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw Throwables.propagate(abyte0);
        }
        return abyte0;
    }

    public volatile Object getSessionMaterial()
    {
        return getSessionMaterial();
    }

    public byte[] getSessionMaterial()
    {
        return mSessionCrypter.getSessionMaterial();
    }

    private vice._cls1(SessionCrypter sessioncrypter)
    {
        mSessionCrypter = sessioncrypter;
    }

    vice._cls1(SessionCrypter sessioncrypter, vice._cls1 _pcls1)
    {
        this(sessioncrypter);
    }
}
