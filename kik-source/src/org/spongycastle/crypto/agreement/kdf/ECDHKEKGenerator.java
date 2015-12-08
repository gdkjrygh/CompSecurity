// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.agreement.kdf;

import java.io.IOException;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.DERNull;
import org.spongycastle.asn1.DEROctetString;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.DERTaggedObject;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.crypto.DerivationFunction;
import org.spongycastle.crypto.DerivationParameters;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.generators.KDF2BytesGenerator;
import org.spongycastle.crypto.params.KDFParameters;

// Referenced classes of package org.spongycastle.crypto.agreement.kdf:
//            DHKDFParameters

public class ECDHKEKGenerator
    implements DerivationFunction
{

    private DerivationFunction a;
    private ASN1ObjectIdentifier b;
    private int c;
    private byte d[];

    public ECDHKEKGenerator(Digest digest)
    {
        a = new KDF2BytesGenerator(digest);
    }

    public final int a(byte abyte0[], int i, int j)
    {
        ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
        asn1encodablevector.a(new AlgorithmIdentifier(b, new DERNull()));
        int k = c;
        asn1encodablevector.a(new DERTaggedObject(true, 2, new DEROctetString(new byte[] {
            (byte)(k >> 24), (byte)(k >> 16), (byte)(k >> 8), (byte)k
        })));
        try
        {
            a.a(new KDFParameters(d, (new DERSequence(asn1encodablevector)).a("DER")));
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new IllegalArgumentException((new StringBuilder("unable to initialise kdf: ")).append(abyte0.getMessage()).toString());
        }
        return a.a(abyte0, i, j);
    }

    public final void a(DerivationParameters derivationparameters)
    {
        derivationparameters = (DHKDFParameters)derivationparameters;
        b = derivationparameters.a();
        c = derivationparameters.b();
        d = derivationparameters.c();
    }
}
