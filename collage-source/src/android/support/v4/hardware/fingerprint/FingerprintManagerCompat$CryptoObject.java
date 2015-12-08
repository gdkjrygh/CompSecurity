// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.hardware.fingerprint;

import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

// Referenced classes of package android.support.v4.hardware.fingerprint:
//            FingerprintManagerCompat

public static class mSignature
{

    private final Cipher mCipher;
    private final Mac mMac;
    private final Signature mSignature;

    public Cipher getCipher()
    {
        return mCipher;
    }

    public Mac getMac()
    {
        return mMac;
    }

    public Signature getSignature()
    {
        return mSignature;
    }

    public (Signature signature)
    {
        mSignature = signature;
        mCipher = null;
        mMac = null;
    }

    public mMac(Cipher cipher)
    {
        mCipher = cipher;
        mSignature = null;
        mMac = null;
    }

    public mMac(Mac mac)
    {
        mMac = mac;
        mCipher = null;
        mSignature = null;
    }
}
