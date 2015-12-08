// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.engines;


// Referenced classes of package org.spongycastle.crypto.engines:
//            IndexGenerator

public static class a
{

    byte a[];
    int b;
    int c;

    final void a(byte abyte0[])
    {
        int i = 0;
        while (i != abyte0.length) 
        {
            byte byte0 = abyte0[i];
            if (b == a.length)
            {
                a = IndexGenerator.a(a, a.length * 2);
            }
            if (b == 0)
            {
                b = 1;
                a[0] = byte0;
                c = 8;
            } else
            if (c == 8)
            {
                byte abyte1[] = a;
                int j = b;
                b = j + 1;
                abyte1[j] = byte0;
            } else
            {
                int k = c;
                byte abyte2[] = a;
                int l = b - 1;
                abyte2[l] = (byte)(abyte2[l] | (byte0 & 0xff) << c);
                abyte2 = a;
                l = b;
                b = l + 1;
                abyte2[l] = (byte)((byte0 & 0xff) >> 8 - k);
            }
            i++;
        }
    }

    public ()
    {
        a = new byte[4];
    }
}
