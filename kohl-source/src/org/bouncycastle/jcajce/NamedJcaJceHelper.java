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
import java.security.NoSuchProviderException;
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

public class NamedJcaJceHelper
    implements JcaJceHelper
{

    protected final String providerName;

    public NamedJcaJceHelper(String s)
    {
        providerName = s;
    }

    public AlgorithmParameterGenerator createAlgorithmParameterGenerator(String s)
        throws NoSuchAlgorithmException, NoSuchProviderException
    {
        return AlgorithmParameterGenerator.getInstance(s, providerName);
    }

    public AlgorithmParameters createAlgorithmParameters(String s)
        throws NoSuchAlgorithmException, NoSuchProviderException
    {
        return AlgorithmParameters.getInstance(s, providerName);
    }

    public CertificateFactory createCertificateFactory(String s)
        throws NoSuchAlgorithmException, CertificateException, NoSuchProviderException
    {
        return CertificateFactory.getInstance(s, providerName);
    }

    public Cipher createCipher(String s)
        throws NoSuchAlgorithmException, NoSuchPaddingException, NoSuchProviderException
    {
        return Cipher.getInstance(s, providerName);
    }

    public MessageDigest createDigest(String s)
        throws NoSuchAlgorithmException, NoSuchProviderException
    {
        return MessageDigest.getInstance(s, providerName);
    }

    public KeyAgreement createKeyAgreement(String s)
        throws NoSuchAlgorithmException, NoSuchProviderException
    {
        return KeyAgreement.getInstance(s, providerName);
    }

    public KeyFactory createKeyFactory(String s)
        throws NoSuchAlgorithmException, NoSuchProviderException
    {
        return KeyFactory.getInstance(s, providerName);
    }

    public KeyGenerator createKeyGenerator(String s)
        throws NoSuchAlgorithmException, NoSuchProviderException
    {
        return KeyGenerator.getInstance(s, providerName);
    }

    public KeyPairGenerator createKeyPairGenerator(String s)
        throws NoSuchAlgorithmException, NoSuchProviderException
    {
        return KeyPairGenerator.getInstance(s, providerName);
    }

    public Mac createMac(String s)
        throws NoSuchAlgorithmException, NoSuchProviderException
    {
        return Mac.getInstance(s, providerName);
    }

    public Signature createSignature(String s)
        throws NoSuchAlgorithmException, NoSuchProviderException
    {
        return Signature.getInstance(s, providerName);
    }
}
