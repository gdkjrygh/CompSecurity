// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.crypto;

import com.facebook.crypto.cipher.NativeCBCCipher;
import com.facebook.crypto.streams.NativeCBCCipherInputStream;
import com.facebook.crypto.util.NativeCryptoLibrary;
import com.facebook.crypto.util.SystemNativeCryptoLibrary;
import java.io.InputStream;

public final class CBCCrypto extends Enum
{

    private static final CBCCrypto $VALUES[];
    public static final CBCCrypto INSTANCE;
    private final NativeCryptoLibrary mNativeCryptoLibrary = new SystemNativeCryptoLibrary();

    private CBCCrypto(String s, int i)
    {
        super(s, i);
    }

    public static CBCCrypto getInstance()
    {
        return INSTANCE;
    }

    public static CBCCrypto valueOf(String s)
    {
        return (CBCCrypto)Enum.valueOf(com/facebook/crypto/CBCCrypto, s);
    }

    public static CBCCrypto[] values()
    {
        return (CBCCrypto[])$VALUES.clone();
    }

    public final InputStream getCipherInputStream(InputStream inputstream, byte abyte0[], byte abyte1[])
    {
        NativeCBCCipher nativecbccipher = new NativeCBCCipher(mNativeCryptoLibrary);
        nativecbccipher.encryptInit(abyte0, abyte1);
        return new NativeCBCCipherInputStream(inputstream, nativecbccipher);
    }

    public final InputStream getDecipherInputStream(InputStream inputstream, byte abyte0[], byte abyte1[])
    {
        NativeCBCCipher nativecbccipher = new NativeCBCCipher(mNativeCryptoLibrary);
        nativecbccipher.decryptInit(abyte0, abyte1);
        return new NativeCBCCipherInputStream(inputstream, nativecbccipher);
    }

    public final boolean isAvailable()
    {
        try
        {
            mNativeCryptoLibrary.ensureCryptoLoaded();
        }
        catch (Throwable throwable)
        {
            return false;
        }
        return true;
    }

    static 
    {
        INSTANCE = new CBCCrypto("INSTANCE", 0);
        $VALUES = (new CBCCrypto[] {
            INSTANCE
        });
    }
}
