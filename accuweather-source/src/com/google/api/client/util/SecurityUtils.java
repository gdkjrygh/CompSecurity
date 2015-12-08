// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.util;

import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.Collection;
import java.util.Iterator;

public final class SecurityUtils
{

    private SecurityUtils()
    {
    }

    public static KeyStore getDefaultKeyStore()
        throws KeyStoreException
    {
        return KeyStore.getInstance(KeyStore.getDefaultType());
    }

    public static KeyStore getJavaKeyStore()
        throws KeyStoreException
    {
        return KeyStore.getInstance("JKS");
    }

    public static KeyStore getPkcs12KeyStore()
        throws KeyStoreException
    {
        return KeyStore.getInstance("PKCS12");
    }

    public static PrivateKey getPrivateKey(KeyStore keystore, String s, String s1)
        throws GeneralSecurityException
    {
        return (PrivateKey)keystore.getKey(s, s1.toCharArray());
    }

    public static KeyFactory getRsaKeyFactory()
        throws NoSuchAlgorithmException
    {
        return KeyFactory.getInstance("RSA");
    }

    public static Signature getSha1WithRsaSignatureAlgorithm()
        throws NoSuchAlgorithmException
    {
        return Signature.getInstance("SHA1withRSA");
    }

    public static Signature getSha256WithRsaSignatureAlgorithm()
        throws NoSuchAlgorithmException
    {
        return Signature.getInstance("SHA256withRSA");
    }

    public static CertificateFactory getX509CertificateFactory()
        throws CertificateException
    {
        return CertificateFactory.getInstance("X.509");
    }

    public static void loadKeyStore(KeyStore keystore, InputStream inputstream, String s)
        throws IOException, GeneralSecurityException
    {
        keystore.load(inputstream, s.toCharArray());
        inputstream.close();
        return;
        keystore;
        inputstream.close();
        throw keystore;
    }

    public static void loadKeyStoreFromCertificates(KeyStore keystore, CertificateFactory certificatefactory, InputStream inputstream)
        throws GeneralSecurityException
    {
        int i = 0;
        for (certificatefactory = certificatefactory.generateCertificates(inputstream).iterator(); certificatefactory.hasNext();)
        {
            keystore.setCertificateEntry(String.valueOf(i), (Certificate)certificatefactory.next());
            i++;
        }

    }

    public static PrivateKey loadPrivateKeyFromKeyStore(KeyStore keystore, InputStream inputstream, String s, String s1, String s2)
        throws IOException, GeneralSecurityException
    {
        loadKeyStore(keystore, inputstream, s);
        return getPrivateKey(keystore, s1, s2);
    }

    public static byte[] sign(Signature signature, PrivateKey privatekey, byte abyte0[])
        throws InvalidKeyException, SignatureException
    {
        signature.initSign(privatekey);
        signature.update(abyte0);
        return signature.sign();
    }

    public static boolean verify(Signature signature, PublicKey publickey, byte abyte0[], byte abyte1[])
        throws InvalidKeyException, SignatureException
    {
        signature.initVerify(publickey);
        signature.update(abyte1);
        return signature.verify(abyte0);
    }
}
