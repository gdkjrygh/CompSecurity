// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.radio.art;

import android.graphics.Bitmap;
import p.s.k;

public class a extends p.ah.a
{

    public a()
    {
    }

    public k a(k k1)
    {
        k1 = (Bitmap)k1.b();
        int i1 = k1.getWidth();
        int j1 = k1.getHeight();
        byte abyte0[] = new byte[i1 * j1 * 2];
        int j = 1;
        int i = 0;
        for (; j <= j1; j++)
        {
            for (int l = 0; l < i1; l++)
            {
                int l1 = k1.getPixel(l, j1 - j);
                l1 = (l1 & 0xff) >> 3 | (((0xff0000 & l1) >> 19) << 11 | ((l1 & 0xff00) >> 10) << 5);
                int i2 = i + 1;
                abyte0[i] = (byte)(l1 & 0xff);
                i = i2 + 1;
                abyte0[i2] = (byte)((l1 & 0xff00) >> 8);
            }

        }

        return new p.ac.a(abyte0);
    }
}
