// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.signers;

import java.util.Hashtable;
import org.spongycastle.asn1.nist.NISTObjectIdentifiers;
import org.spongycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.spongycastle.asn1.teletrust.TeleTrusTObjectIdentifiers;
import org.spongycastle.asn1.x509.X509ObjectIdentifiers;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.Signer;

public class RSADigestSigner
    implements Signer
{

    private static final Hashtable b;
    private final Digest a;

    public final void a(byte byte0)
    {
        a.a(byte0);
    }

    public final void a(byte abyte0[], int i, int j)
    {
        a.a(abyte0, i, j);
    }

    static 
    {
        Hashtable hashtable = new Hashtable();
        b = hashtable;
        hashtable.put("RIPEMD128", TeleTrusTObjectIdentifiers.c);
        b.put("RIPEMD160", TeleTrusTObjectIdentifiers.b);
        b.put("RIPEMD256", TeleTrusTObjectIdentifiers.d);
        b.put("SHA-1", X509ObjectIdentifiers.i);
        b.put("SHA-224", NISTObjectIdentifiers.e);
        b.put("SHA-256", NISTObjectIdentifiers.b);
        b.put("SHA-384", NISTObjectIdentifiers.c);
        b.put("SHA-512", NISTObjectIdentifiers.d);
        b.put("MD2", PKCSObjectIdentifiers.E);
        b.put("MD4", PKCSObjectIdentifiers.F);
        b.put("MD5", PKCSObjectIdentifiers.G);
    }
}
