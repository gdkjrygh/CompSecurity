// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1;

import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package org.spongycastle.asn1:
//            DEROutputStream, ASN1Encodable, ASN1Primitive, DLOutputStream

public class ASN1OutputStream
{
    private final class a extends ASN1OutputStream
    {

        final ASN1OutputStream a;
        private boolean b;

        public final void b(int i)
        {
            if (b)
            {
                b = false;
                return;
            } else
            {
                b(i);
                return;
            }
        }

        public a(OutputStream outputstream)
        {
            a = ASN1OutputStream.this;
            super(outputstream);
            b = true;
        }
    }


    private OutputStream a;

    public ASN1OutputStream(OutputStream outputstream)
    {
        a = outputstream;
    }

    ASN1OutputStream a()
    {
        return new DEROutputStream(a);
    }

    final void a(int i)
    {
        if (i > 127)
        {
            int j = 1;
            int k = i;
            do
            {
                k >>>= 8;
                if (k == 0)
                {
                    break;
                }
                j++;
            } while (true);
            b((byte)(j | 0x80));
            for (j = (j - 1) * 8; j >= 0; j -= 8)
            {
                b((byte)(i >> j));
            }

        } else
        {
            b((byte)i);
        }
    }

    final void a(int i, int j)
    {
        int k = 4;
        if (j < 31)
        {
            b(i | j);
            return;
        }
        b(i | 0x1f);
        if (j < 128)
        {
            b(j);
            return;
        }
        byte abyte0[] = new byte[5];
        abyte0[4] = (byte)(j & 0x7f);
        i = k;
        int l;
        do
        {
            k = j >> 7;
            l = i - 1;
            abyte0[l] = (byte)(k & 0x7f | 0x80);
            i = l;
            j = k;
        } while (k > 127);
        a.write(abyte0, l, 5 - l);
    }

    final void a(int i, int j, byte abyte0[])
    {
        a(i, j);
        a(abyte0.length);
        a(abyte0);
    }

    final void a(int i, byte abyte0[])
    {
        b(i);
        a(abyte0.length);
        a(abyte0);
    }

    public void a(ASN1Encodable asn1encodable)
    {
        if (asn1encodable != null)
        {
            asn1encodable.a().a(this);
            return;
        } else
        {
            throw new IOException("null object detected");
        }
    }

    final void a(ASN1Primitive asn1primitive)
    {
        if (asn1primitive != null)
        {
            asn1primitive.a(new a(a));
            return;
        } else
        {
            throw new IOException("null object detected");
        }
    }

    final void a(byte abyte0[])
    {
        a.write(abyte0);
    }

    ASN1OutputStream b()
    {
        return new DLOutputStream(a);
    }

    void b(int i)
    {
        a.write(i);
    }
}
