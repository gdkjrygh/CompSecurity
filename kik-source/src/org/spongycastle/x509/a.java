// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.x509;

import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.Security;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.DERNull;
import org.spongycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.spongycastle.asn1.nist.NISTObjectIdentifiers;
import org.spongycastle.asn1.oiw.OIWObjectIdentifiers;
import org.spongycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.spongycastle.asn1.pkcs.RSASSAPSSparams;
import org.spongycastle.asn1.teletrust.TeleTrusTObjectIdentifiers;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.asn1.x9.X9ObjectIdentifiers;
import org.spongycastle.util.Strings;

final class org.spongycastle.x509.a
{
    static final class a
    {

        Object a;
        Provider b;

        a(Object obj, Provider provider)
        {
            a = obj;
            b = provider;
        }
    }


    private static Hashtable a;
    private static Hashtable b;
    private static Set c;

    static Provider a(String s)
    {
        Provider provider = Security.getProvider(s);
        if (provider == null)
        {
            throw new NoSuchProviderException((new StringBuilder("Provider ")).append(s).append(" not found").toString());
        } else
        {
            return provider;
        }
    }

    private static RSASSAPSSparams a(AlgorithmIdentifier algorithmidentifier, int i)
    {
        return new RSASSAPSSparams(algorithmidentifier, new AlgorithmIdentifier(PKCSObjectIdentifiers.H_, algorithmidentifier), new ASN1Integer(i), new ASN1Integer(1));
    }

    static a a(String s, String s1, Provider provider)
    {
        String s3;
        s1 = Strings.b(s1);
        do
        {
            String s2 = provider.getProperty((new StringBuilder("Alg.Alias.")).append(s).append(".").append(s1).toString());
            if (s2 == null)
            {
                break;
            }
            s1 = s2;
        } while (true);
        s3 = provider.getProperty((new StringBuilder()).append(s).append(".").append(s1).toString());
        if (s3 == null) goto _L2; else goto _L1
_L1:
        try
        {
            s = provider.getClass().getClassLoader();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new IllegalStateException((new StringBuilder("algorithm ")).append(s1).append(" in provider ").append(provider.getName()).append(" but no class \"").append(s3).append("\" found!").toString());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new IllegalStateException((new StringBuilder("algorithm ")).append(s1).append(" in provider ").append(provider.getName()).append(" but class \"").append(s3).append("\" inaccessible!").toString());
        }
        if (s == null) goto _L4; else goto _L3
_L3:
        s = s.loadClass(s3);
_L5:
        return new a(s.newInstance(), provider);
_L4:
        s = Class.forName(s3);
        if (true) goto _L5; else goto _L2
_L2:
        throw new NoSuchAlgorithmException((new StringBuilder("cannot find implementation ")).append(s1).append(" for provider ").append(provider.getName()).toString());
    }

    static 
    {
        a = new Hashtable();
        b = new Hashtable();
        c = new HashSet();
        a.put("MD2WITHRSAENCRYPTION", PKCSObjectIdentifiers.E_);
        a.put("MD2WITHRSA", PKCSObjectIdentifiers.E_);
        a.put("MD5WITHRSAENCRYPTION", PKCSObjectIdentifiers.e);
        a.put("MD5WITHRSA", PKCSObjectIdentifiers.e);
        a.put("SHA1WITHRSAENCRYPTION", PKCSObjectIdentifiers.F_);
        a.put("SHA1WITHRSA", PKCSObjectIdentifiers.F_);
        a.put("SHA224WITHRSAENCRYPTION", PKCSObjectIdentifiers.L_);
        a.put("SHA224WITHRSA", PKCSObjectIdentifiers.L_);
        a.put("SHA256WITHRSAENCRYPTION", PKCSObjectIdentifiers.I_);
        a.put("SHA256WITHRSA", PKCSObjectIdentifiers.I_);
        a.put("SHA384WITHRSAENCRYPTION", PKCSObjectIdentifiers.J_);
        a.put("SHA384WITHRSA", PKCSObjectIdentifiers.J_);
        a.put("SHA512WITHRSAENCRYPTION", PKCSObjectIdentifiers.K_);
        a.put("SHA512WITHRSA", PKCSObjectIdentifiers.K_);
        a.put("SHA1WITHRSAANDMGF1", PKCSObjectIdentifiers.k);
        a.put("SHA224WITHRSAANDMGF1", PKCSObjectIdentifiers.k);
        a.put("SHA256WITHRSAANDMGF1", PKCSObjectIdentifiers.k);
        a.put("SHA384WITHRSAANDMGF1", PKCSObjectIdentifiers.k);
        a.put("SHA512WITHRSAANDMGF1", PKCSObjectIdentifiers.k);
        a.put("RIPEMD160WITHRSAENCRYPTION", TeleTrusTObjectIdentifiers.f);
        a.put("RIPEMD160WITHRSA", TeleTrusTObjectIdentifiers.f);
        a.put("RIPEMD128WITHRSAENCRYPTION", TeleTrusTObjectIdentifiers.g);
        a.put("RIPEMD128WITHRSA", TeleTrusTObjectIdentifiers.g);
        a.put("RIPEMD256WITHRSAENCRYPTION", TeleTrusTObjectIdentifiers.h);
        a.put("RIPEMD256WITHRSA", TeleTrusTObjectIdentifiers.h);
        a.put("SHA1WITHDSA", X9ObjectIdentifiers.V);
        a.put("DSAWITHSHA1", X9ObjectIdentifiers.V);
        a.put("SHA224WITHDSA", NISTObjectIdentifiers.C);
        a.put("SHA256WITHDSA", NISTObjectIdentifiers.D);
        a.put("SHA384WITHDSA", NISTObjectIdentifiers.E);
        a.put("SHA512WITHDSA", NISTObjectIdentifiers.F);
        a.put("SHA1WITHECDSA", X9ObjectIdentifiers.i);
        a.put("ECDSAWITHSHA1", X9ObjectIdentifiers.i);
        a.put("SHA224WITHECDSA", X9ObjectIdentifiers.m);
        a.put("SHA256WITHECDSA", X9ObjectIdentifiers.n);
        a.put("SHA384WITHECDSA", X9ObjectIdentifiers.o);
        a.put("SHA512WITHECDSA", X9ObjectIdentifiers.p);
        a.put("GOST3411WITHGOST3410", CryptoProObjectIdentifiers.e);
        a.put("GOST3411WITHGOST3410-94", CryptoProObjectIdentifiers.e);
        a.put("GOST3411WITHECGOST3410", CryptoProObjectIdentifiers.f);
        a.put("GOST3411WITHECGOST3410-2001", CryptoProObjectIdentifiers.f);
        a.put("GOST3411WITHGOST3410-2001", CryptoProObjectIdentifiers.f);
        c.add(X9ObjectIdentifiers.i);
        c.add(X9ObjectIdentifiers.m);
        c.add(X9ObjectIdentifiers.n);
        c.add(X9ObjectIdentifiers.o);
        c.add(X9ObjectIdentifiers.p);
        c.add(X9ObjectIdentifiers.V);
        c.add(NISTObjectIdentifiers.C);
        c.add(NISTObjectIdentifiers.D);
        c.add(NISTObjectIdentifiers.E);
        c.add(NISTObjectIdentifiers.F);
        c.add(CryptoProObjectIdentifiers.e);
        c.add(CryptoProObjectIdentifiers.f);
        AlgorithmIdentifier algorithmidentifier = new AlgorithmIdentifier(OIWObjectIdentifiers.i, new DERNull());
        b.put("SHA1WITHRSAANDMGF1", a(algorithmidentifier, 20));
        algorithmidentifier = new AlgorithmIdentifier(NISTObjectIdentifiers.e, new DERNull());
        b.put("SHA224WITHRSAANDMGF1", a(algorithmidentifier, 28));
        algorithmidentifier = new AlgorithmIdentifier(NISTObjectIdentifiers.b, new DERNull());
        b.put("SHA256WITHRSAANDMGF1", a(algorithmidentifier, 32));
        algorithmidentifier = new AlgorithmIdentifier(NISTObjectIdentifiers.c, new DERNull());
        b.put("SHA384WITHRSAANDMGF1", a(algorithmidentifier, 48));
        algorithmidentifier = new AlgorithmIdentifier(NISTObjectIdentifiers.d, new DERNull());
        b.put("SHA512WITHRSAANDMGF1", a(algorithmidentifier, 64));
    }
}
