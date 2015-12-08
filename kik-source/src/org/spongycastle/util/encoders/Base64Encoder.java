// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.util.encoders;

import java.io.OutputStream;

// Referenced classes of package org.spongycastle.util.encoders:
//            Encoder

public class Base64Encoder
    implements Encoder
{

    protected final byte a[] = {
        65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 
        75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 
        85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 
        101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 
        111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 
        121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 
        56, 57, 43, 47
    };
    protected byte b;
    protected final byte c[] = new byte[128];

    public Base64Encoder()
    {
        b = 61;
        a();
    }

    private static int a(String s, int i, int j)
    {
        for (; i < j && a(s.charAt(i)); i++) { }
        return i;
    }

    private static boolean a(char c1)
    {
        return c1 == '\n' || c1 == '\r' || c1 == '\t' || c1 == ' ';
    }

    public final int a(String s, OutputStream outputstream)
    {
        int j = 0;
        int i;
        for (i = s.length(); i > 0 && a(s.charAt(i - 1)); i--) { }
        int l = i - 4;
        int j1;
        for (int k = a(s, 0, l); k < l; k = a(s, j1 + 1, l))
        {
            byte byte0 = c[s.charAt(k)];
            int i1 = a(s, k + 1, l);
            k = c[s.charAt(i1)];
            j1 = a(s, i1 + 1, l);
            i1 = c[s.charAt(j1)];
            j1 = a(s, j1 + 1, l);
            byte byte1 = c[s.charAt(j1)];
            outputstream.write(byte0 << 2 | k >> 4);
            outputstream.write(k << 4 | i1 >> 2);
            outputstream.write(i1 << 6 | byte1);
            j += 3;
        }

        char c2 = s.charAt(i - 4);
        l = s.charAt(i - 3);
        char c1 = s.charAt(i - 2);
        i = s.charAt(i - 1);
        if (c1 == b)
        {
            outputstream.write(c[c2] << 2 | c[l] >> 4);
            i = 1;
        } else
        if (i == b)
        {
            i = c[c2];
            l = c[l];
            c1 = c[c1];
            outputstream.write(i << 2 | l >> 4);
            outputstream.write(l << 4 | c1 >> 2);
            i = 2;
        } else
        {
            c2 = c[c2];
            l = c[l];
            c1 = c[c1];
            i = c[i];
            outputstream.write(c2 << 2 | l >> 4);
            outputstream.write(l << 4 | c1 >> 2);
            outputstream.write(c1 << 6 | i);
            i = 3;
        }
        return i + j;
    }

    public final int a(byte abyte0[], int i, int j, OutputStream outputstream)
    {
        int k;
        int l;
        k = j % 3;
        l = j - k;
        for (j = i; j < i + l; j += 3)
        {
            int i1 = abyte0[j] & 0xff;
            int j1 = abyte0[j + 1] & 0xff;
            int k1 = abyte0[j + 2] & 0xff;
            outputstream.write(a[i1 >>> 2 & 0x3f]);
            outputstream.write(a[(i1 << 4 | j1 >>> 4) & 0x3f]);
            outputstream.write(a[(j1 << 2 | k1 >>> 6) & 0x3f]);
            outputstream.write(a[k1 & 0x3f]);
        }

        k;
        JVM INSTR tableswitch 0 2: default 164
    //                   0 164
    //                   1 182
    //                   2 246;
           goto _L1 _L1 _L2 _L3
_L1:
        break; /* Loop/switch isn't completed */
_L3:
        break MISSING_BLOCK_LABEL_246;
_L4:
        j = l / 3;
        if (k == 0)
        {
            i = 0;
        } else
        {
            i = 4;
        }
        return i + j * 4;
_L2:
        i = abyte0[i + l] & 0xff;
        outputstream.write(a[i >>> 2 & 0x3f]);
        outputstream.write(a[i << 4 & 0x3f]);
        outputstream.write(b);
        outputstream.write(b);
          goto _L4
        j = abyte0[i + l] & 0xff;
        i = abyte0[i + l + 1] & 0xff;
        outputstream.write(a[j >>> 2 & 0x3f]);
        outputstream.write(a[(j << 4 | i >>> 4) & 0x3f]);
        outputstream.write(a[i << 2 & 0x3f]);
        outputstream.write(b);
          goto _L4
    }

    protected final void a()
    {
        for (int i = 0; i < a.length; i++)
        {
            c[a[i]] = (byte)i;
        }

    }
}
