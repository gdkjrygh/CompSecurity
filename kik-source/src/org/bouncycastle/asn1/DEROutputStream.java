// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package org.bouncycastle.asn1:
//            DERTags, DERObject, DEREncodable

public class DEROutputStream extends FilterOutputStream
    implements DERTags
{

    public DEROutputStream(OutputStream outputstream)
    {
        super(outputstream);
    }

    private void a(int i)
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
            write((byte)(j | 0x80));
            for (j = (j - 1) * 8; j >= 0; j -= 8)
            {
                write((byte)(i >> j));
            }

        } else
        {
            write((byte)i);
        }
    }

    protected final void a()
    {
        write(5);
        write(0);
    }

    final void a(int i, int j)
    {
        int k = 4;
        if (j < 31)
        {
            write(i | j);
            return;
        }
        write(i | 0x1f);
        if (j < 128)
        {
            write(j);
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
        write(abyte0, l, 5 - l);
    }

    final void a(int i, int j, byte abyte0[])
    {
        a(i, j);
        a(abyte0.length);
        write(abyte0);
    }

    final void a(int i, byte abyte0[])
    {
        write(i);
        a(abyte0.length);
        write(abyte0);
    }

    public void a(Object obj)
    {
        if (obj == null)
        {
            a();
            return;
        }
        if (obj instanceof DERObject)
        {
            ((DERObject)obj).a(this);
            return;
        }
        if (obj instanceof DEREncodable)
        {
            ((DEREncodable)obj).c().a(this);
            return;
        } else
        {
            throw new IOException("object not DEREncodable");
        }
    }

    public void write(byte abyte0[])
    {
        out.write(abyte0, 0, abyte0.length);
    }

    public void write(byte abyte0[], int i, int j)
    {
        out.write(abyte0, i, j);
    }
}
