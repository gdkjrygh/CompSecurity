// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce;

import java.security.AlgorithmParameterGenerator;
import java.security.AlgorithmParameters;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Signature;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;

// Referenced classes of package org.bouncycastle.jcajce:
//            JcaJceHelper

public class DefaultJcaJceHelper
    implements JcaJceHelper
{

    public DefaultJcaJceHelper()
    {
    }

    public AlgorithmParameterGenerator createAlgorithmParameterGenerator(String s)
        throws NoSuchAlgorithmException
    {
        return AlgorithmParameterGenerator.getInstance(s);
    }

    public AlgorithmParameters createAlgorithmParameters(String s)
        throws NoSuchAlgorithmException
    {
        return AlgorithmParameters.getInstance(s);
    }

    public CertificateFactory createCertificateFactory(String s)
        throws NoSuchAlgorithmException, CertificateException
    {
        return CertificateFactory.getInstance(s);
    }

    public Cipher createCipher(String s)
        throws NoSuchAlgorithmException, NoSuchPaddingException
    {
        return Cipher.getInstance(s);
    }

    public MessageDigest createDigest(String s)
        throws NoSuchAlgorithmException
    {
        return MessageDigest.getInstance(s);
    }

    public KeyAgreement createKeyAgreement(String s)
        throws NoSuchAlgorithmException
    {
        return KeyAgreement.getInstance(s);
    }

    public KeyFactory createKeyFactory(String s)
        throws NoSuchAlgorithmException
    {
        return KeyFactory.getInstance(s);
    }

    public KeyGenerator createKeyGenerator(String s)
        throws NoSuchAlgorithmException
    {
        return KeyGenerator.getInstance(s);
    }

    public KeyPairGenerator createKeyPairGenerator(String s)
        throws NoSuchAlgorithmException
    {
        return KeyPairGenerator.getInstance(s);
    }

    public Mac createMac(String s)
        throws NoSuchAlgorithmException
    {
        return Mac.getInstance(s);
    }

    public Signature createSignature(String s)
        throws NoSuchAlgorithmException
    {
        return Signature.getInstance(s);
    }
}
