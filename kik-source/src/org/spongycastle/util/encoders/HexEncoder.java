// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.util.encoders;

import java.io.OutputStream;

// Referenced classes of package org.spongycastle.util.encoders:
//            Encoder

public class HexEncoder
    implements Encoder
{

    protected final byte a[] = {
        48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 
        97, 98, 99, 100, 101, 102
    };
    protected final byte b[] = new byte[128];

    public HexEncoder()
    {
        a();
    }

    private void a()
    {
        for (int i = 0; i < a.length; i++)
        {
            b[a[i]] = (byte)i;
        }

        b[65] = b[97];
        b[66] = b[98];
        b[67] = b[99];
        b[68] = b[100];
        b[69] = b[101];
        b[70] = b[102];
    }

    private static boolean a(char c)
    {
        return c == '\n' || c == '\r' || c == '\t' || c == ' ';
    }

    public final int a(String s, OutputStream outputstream)
    {
        int i = 0;
        int j;
        for (j = s.length(); j > 0 && a(s.charAt(j - 1)); j--) { }
        int k = 0;
        for (; i < j; i++)
        {
            for (; i < j && a(s.charAt(i)); i++) { }
            byte abyte0[] = b;
            int l = i + 1;
            byte byte0 = abyte0[s.charAt(i)];
            for (i = l; i < j && a(s.charAt(i)); i++) { }
            outputstream.write(b[s.charAt(i)] | byte0 << 4);
            k++;
        }

        return k;
    }

    public final int a(byte abyte0[], int i, int j, OutputStream outputstream)
    {
        for (int k = i; k < i + j; k++)
        {
            int l = abyte0[k] & 0xff;
            outputstream.write(a[l >>> 4]);
            outputstream.write(a[l & 0xf]);
        }

        return j * 2;
    }
}
