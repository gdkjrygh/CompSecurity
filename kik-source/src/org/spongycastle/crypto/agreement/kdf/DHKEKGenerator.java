// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.agreement.kdf;

import java.io.IOException;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.DERObjectIdentifier;
import org.spongycastle.asn1.DEROctetString;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.DERTaggedObject;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.DerivationFunction;
import org.spongycastle.crypto.DerivationParameters;
import org.spongycastle.crypto.Digest;

// Referenced classes of package org.spongycastle.crypto.agreement.kdf:
//            DHKDFParameters

public class DHKEKGenerator
    implements DerivationFunction
{

    private final Digest a;
    private DERObjectIdentifier b;
    private int c;
    private byte d[];
    private byte e[];

    private static byte[] a(int i)
    {
        return (new byte[] {
            (byte)(i >> 24), (byte)(i >> 16), (byte)(i >> 8), (byte)i
        });
    }

    public final int a(byte abyte0[], int i, int j)
    {
        if (abyte0.length - j < i)
        {
            throw new DataLengthException("output buffer too small");
        }
        long l1 = j;
        int i1 = a.b();
        if (l1 > 0x1ffffffffL)
        {
            throw new IllegalArgumentException("Output length too large");
        }
        int j1 = (int)(((l1 + (long)i1) - 1L) / (long)i1);
        byte abyte1[] = new byte[a.b()];
        boolean flag = false;
        boolean flag1 = true;
        int k = j;
        int l = i;
        j = ((flag1) ? 1 : 0);
        i = ((flag) ? 1 : 0);
        while (i < j1) 
        {
            a.a(d, 0, d.length);
            ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
            ASN1EncodableVector asn1encodablevector1 = new ASN1EncodableVector();
            asn1encodablevector1.a(b);
            asn1encodablevector1.a(new DEROctetString(a(j)));
            asn1encodablevector.a(new DERSequence(asn1encodablevector1));
            if (e != null)
            {
                asn1encodablevector.a(new DERTaggedObject(true, 0, new DEROctetString(e)));
            }
            asn1encodablevector.a(new DERTaggedObject(true, 2, new DEROctetString(a(c))));
            try
            {
                byte abyte2[] = (new DERSequence(asn1encodablevector)).a("DER");
                a.a(abyte2, 0, abyte2.length);
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw new IllegalArgumentException((new StringBuilder("unable to encode parameter info: ")).append(abyte0.getMessage()).toString());
            }
            a.a(abyte1, 0);
            if (k > i1)
            {
                System.arraycopy(abyte1, 0, abyte0, l, i1);
                l += i1;
                k -= i1;
            } else
            {
                System.arraycopy(abyte1, 0, abyte0, l, k);
            }
            j++;
            i++;
        }
        a.c();
        return k;
    }

    public final void a(DerivationParameters derivationparameters)
    {
        derivationparameters = (DHKDFParameters)derivationparameters;
        b = derivationparameters.a();
        c = derivationparameters.b();
        d = derivationparameters.c();
        e = derivationparameters.d();
    }
}
