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

public interface JcaJceHelper
{

    public abstract AlgorithmParameterGenerator createAlgorithmParameterGenerator(String s)
        throws NoSuchAlgorithmException, NoSuchProviderException;

    public abstract AlgorithmParameters createAlgorithmParameters(String s)
        throws NoSuchAlgorithmException, NoSuchProviderException;

    public abstract CertificateFactory createCertificateFactory(String s)
        throws NoSuchAlgorithmException, NoSuchProviderException, CertificateException;

    public abstract Cipher createCipher(String s)
        throws NoSuchAlgorithmException, NoSuchPaddingException, NoSuchProviderException;

    public abstract MessageDigest createDigest(String s)
        throws NoSuchAlgorithmException, NoSuchProviderException;

    public abstract KeyAgreement createKeyAgreement(String s)
        throws NoSuchAlgorithmException, NoSuchProviderException;

    public abstract KeyFactory createKeyFactory(String s)
        throws NoSuchAlgorithmException, NoSuchProviderException;

    public abstract KeyGenerator createKeyGenerator(String s)
        throws NoSuchAlgorithmException, NoSuchProviderException;

    public abstract KeyPairGenerator createKeyPairGenerator(String s)
        throws NoSuchAlgorithmException, NoSuchProviderException;

    public abstract Mac createMac(String s)
        throws NoSuchAlgorithmException, NoSuchProviderException;

    public abstract Signature createSignature(String s)
        throws NoSuchAlgorithmException, NoSuchProviderException;
}
