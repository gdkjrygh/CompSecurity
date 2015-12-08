// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce;

import java.io.IOException;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.CertificationRequest;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.RSASSAPSSparams;
import org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;

public class PKCS10CertificationRequest extends CertificationRequest
{

    private static Hashtable d;
    private static Hashtable e;
    private static Hashtable f;
    private static Hashtable g;
    private static Set h;

    private static RSASSAPSSparams a(AlgorithmIdentifier algorithmidentifier, int i)
    {
        return new RSASSAPSSparams(algorithmidentifier, new AlgorithmIdentifier(PKCSObjectIdentifiers.l_, algorithmidentifier), new DERInteger(i), new DERInteger(1));
    }

    public final byte[] a()
    {
        byte abyte0[];
        try
        {
            abyte0 = a("DER");
        }
        catch (IOException ioexception)
        {
            throw new RuntimeException(ioexception.toString());
        }
        return abyte0;
    }

    static 
    {
        d = new Hashtable();
        e = new Hashtable();
        f = new Hashtable();
        g = new Hashtable();
        h = new HashSet();
        d.put("MD2WITHRSAENCRYPTION", new DERObjectIdentifier("1.2.840.113549.1.1.2"));
        d.put("MD2WITHRSA", new DERObjectIdentifier("1.2.840.113549.1.1.2"));
        d.put("MD5WITHRSAENCRYPTION", new DERObjectIdentifier("1.2.840.113549.1.1.4"));
        d.put("MD5WITHRSA", new DERObjectIdentifier("1.2.840.113549.1.1.4"));
        d.put("RSAWITHMD5", new DERObjectIdentifier("1.2.840.113549.1.1.4"));
        d.put("SHA1WITHRSAENCRYPTION", new DERObjectIdentifier("1.2.840.113549.1.1.5"));
        d.put("SHA1WITHRSA", new DERObjectIdentifier("1.2.840.113549.1.1.5"));
        d.put("SHA224WITHRSAENCRYPTION", PKCSObjectIdentifiers.p_);
        d.put("SHA224WITHRSA", PKCSObjectIdentifiers.p_);
        d.put("SHA256WITHRSAENCRYPTION", PKCSObjectIdentifiers.m_);
        d.put("SHA256WITHRSA", PKCSObjectIdentifiers.m_);
        d.put("SHA384WITHRSAENCRYPTION", PKCSObjectIdentifiers.n_);
        d.put("SHA384WITHRSA", PKCSObjectIdentifiers.n_);
        d.put("SHA512WITHRSAENCRYPTION", PKCSObjectIdentifiers.o_);
        d.put("SHA512WITHRSA", PKCSObjectIdentifiers.o_);
        d.put("SHA1WITHRSAANDMGF1", PKCSObjectIdentifiers.k);
        d.put("SHA224WITHRSAANDMGF1", PKCSObjectIdentifiers.k);
        d.put("SHA256WITHRSAANDMGF1", PKCSObjectIdentifiers.k);
        d.put("SHA384WITHRSAANDMGF1", PKCSObjectIdentifiers.k);
        d.put("SHA512WITHRSAANDMGF1", PKCSObjectIdentifiers.k);
        d.put("RSAWITHSHA1", new DERObjectIdentifier("1.2.840.113549.1.1.5"));
        d.put("RIPEMD128WITHRSAENCRYPTION", TeleTrusTObjectIdentifiers.g);
        d.put("RIPEMD128WITHRSA", TeleTrusTObjectIdentifiers.g);
        d.put("RIPEMD160WITHRSAENCRYPTION", TeleTrusTObjectIdentifiers.f);
        d.put("RIPEMD160WITHRSA", TeleTrusTObjectIdentifiers.f);
        d.put("RIPEMD256WITHRSAENCRYPTION", TeleTrusTObjectIdentifiers.h);
        d.put("RIPEMD256WITHRSA", TeleTrusTObjectIdentifiers.h);
        d.put("SHA1WITHDSA", new DERObjectIdentifier("1.2.840.10040.4.3"));
        d.put("DSAWITHSHA1", new DERObjectIdentifier("1.2.840.10040.4.3"));
        d.put("SHA224WITHDSA", NISTObjectIdentifiers.C);
        d.put("SHA256WITHDSA", NISTObjectIdentifiers.D);
        d.put("SHA384WITHDSA", NISTObjectIdentifiers.E);
        d.put("SHA512WITHDSA", NISTObjectIdentifiers.F);
        d.put("SHA1WITHECDSA", X9ObjectIdentifiers.i);
        d.put("SHA224WITHECDSA", X9ObjectIdentifiers.m);
        d.put("SHA256WITHECDSA", X9ObjectIdentifiers.n);
        d.put("SHA384WITHECDSA", X9ObjectIdentifiers.o);
        d.put("SHA512WITHECDSA", X9ObjectIdentifiers.p);
        d.put("ECDSAWITHSHA1", X9ObjectIdentifiers.i);
        d.put("GOST3411WITHGOST3410", CryptoProObjectIdentifiers.e);
        d.put("GOST3410WITHGOST3411", CryptoProObjectIdentifiers.e);
        d.put("GOST3411WITHECGOST3410", CryptoProObjectIdentifiers.f);
        d.put("GOST3411WITHECGOST3410-2001", CryptoProObjectIdentifiers.f);
        d.put("GOST3411WITHGOST3410-2001", CryptoProObjectIdentifiers.f);
        g.put(new DERObjectIdentifier("1.2.840.113549.1.1.5"), "SHA1WITHRSA");
        g.put(PKCSObjectIdentifiers.p_, "SHA224WITHRSA");
        g.put(PKCSObjectIdentifiers.m_, "SHA256WITHRSA");
        g.put(PKCSObjectIdentifiers.n_, "SHA384WITHRSA");
        g.put(PKCSObjectIdentifiers.o_, "SHA512WITHRSA");
        g.put(CryptoProObjectIdentifiers.e, "GOST3411WITHGOST3410");
        g.put(CryptoProObjectIdentifiers.f, "GOST3411WITHECGOST3410");
        g.put(new DERObjectIdentifier("1.2.840.113549.1.1.4"), "MD5WITHRSA");
        g.put(new DERObjectIdentifier("1.2.840.113549.1.1.2"), "MD2WITHRSA");
        g.put(new DERObjectIdentifier("1.2.840.10040.4.3"), "SHA1WITHDSA");
        g.put(X9ObjectIdentifiers.i, "SHA1WITHECDSA");
        g.put(X9ObjectIdentifiers.m, "SHA224WITHECDSA");
        g.put(X9ObjectIdentifiers.n, "SHA256WITHECDSA");
        g.put(X9ObjectIdentifiers.o, "SHA384WITHECDSA");
        g.put(X9ObjectIdentifiers.p, "SHA512WITHECDSA");
        g.put(OIWObjectIdentifiers.k, "SHA1WITHRSA");
        g.put(OIWObjectIdentifiers.j, "SHA1WITHDSA");
        g.put(NISTObjectIdentifiers.C, "SHA224WITHDSA");
        g.put(NISTObjectIdentifiers.D, "SHA256WITHDSA");
        f.put(PKCSObjectIdentifiers.h_, "RSA");
        f.put(X9ObjectIdentifiers.U, "DSA");
        h.add(X9ObjectIdentifiers.i);
        h.add(X9ObjectIdentifiers.m);
        h.add(X9ObjectIdentifiers.n);
        h.add(X9ObjectIdentifiers.o);
        h.add(X9ObjectIdentifiers.p);
        h.add(X9ObjectIdentifiers.V);
        h.add(NISTObjectIdentifiers.C);
        h.add(NISTObjectIdentifiers.D);
        h.add(CryptoProObjectIdentifiers.e);
        h.add(CryptoProObjectIdentifiers.f);
        AlgorithmIdentifier algorithmidentifier = new AlgorithmIdentifier(OIWObjectIdentifiers.i, new DERNull());
        e.put("SHA1WITHRSAANDMGF1", a(algorithmidentifier, 20));
        algorithmidentifier = new AlgorithmIdentifier(NISTObjectIdentifiers.e, new DERNull());
        e.put("SHA224WITHRSAANDMGF1", a(algorithmidentifier, 28));
        algorithmidentifier = new AlgorithmIdentifier(NISTObjectIdentifiers.b, new DERNull());
        e.put("SHA256WITHRSAANDMGF1", a(algorithmidentifier, 32));
        algorithmidentifier = new AlgorithmIdentifier(NISTObjectIdentifiers.c, new DERNull());
        e.put("SHA384WITHRSAANDMGF1", a(algorithmidentifier, 48));
        algorithmidentifier = new AlgorithmIdentifier(NISTObjectIdentifiers.d, new DERNull());
        e.put("SHA512WITHRSAANDMGF1", a(algorithmidentifier, 64));
    }
}
