// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.extractor.webm;

import com.google.android.exoplayer.extractor.ExtractorInput;

final class VarintReader
{

    private static final int a[] = {
        128, 64, 32, 16, 8, 4, 2, 1
    };
    private final byte b[] = new byte[8];
    private int c;
    private int d;

    public VarintReader()
    {
    }

    public final long a(ExtractorInput extractorinput, boolean flag, boolean flag1)
    {
label0:
        {
            if (c != 0)
            {
                break label0;
            }
            if (!extractorinput.a(b, 0, 1, flag))
            {
                return -1L;
            }
            byte byte0 = b[0];
            d = -1;
            int i = 0;
label1:
            do
            {
label2:
                {
                    if (i < a.length)
                    {
                        if ((a[i] & (byte0 & 0xff)) == 0)
                        {
                            break label2;
                        }
                        d = i + 1;
                    }
                    if (d == -1)
                    {
                        throw new IllegalStateException("No valid varint length mask found");
                    }
                    break label1;
                }
                i++;
            } while (true);
            c = 1;
        }
        extractorinput.b(b, 1, d - 1);
        if (flag1)
        {
            extractorinput = b;
            extractorinput[0] = (byte)(extractorinput[0] & ~a[d - 1]);
        }
        long l = 0L;
        for (int j = 0; j < d; j++)
        {
            l = l << 8 | (long)(b[j] & 0xff);
        }

        c = 0;
        return l;
    }

    public final void a()
    {
        c = 0;
        d = 0;
    }

    public final int b()
    {
        return d;
    }

}
