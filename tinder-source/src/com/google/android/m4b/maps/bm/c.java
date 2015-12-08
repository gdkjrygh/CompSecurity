// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bm;

import javax.microedition.khronos.opengles.GL10;

public final class c
{

    public static int a(float f, float f1, float f2, float f3)
    {
        return b((int)(f * 255F + 0.5F)) << 24 | b((int)(f1 * 255F + 0.5F)) << 16 | b((int)(f2 * 255F + 0.5F)) << 8 | b((int)(255F * f3 + 0.5F));
    }

    public static int a(int i)
    {
        return ((i >> 16 & 0xff) * 3 + (i >> 8 & 0xff) * 10 + (i & 0xff)) / 14;
    }

    public static void a(GL10 gl10, int i)
    {
        gl10.glColor4x(i >> 8 & 0xff00 | i >> 16 & 0xff, i & 0xff00 | i >> 8 & 0xff, i << 8 & 0xff00 | i & 0xff, i >> 16 & 0xff00 | i >> 24 & 0xff);
    }

    private static int b(int i)
    {
        int j;
        if (i < 0)
        {
            j = 0;
        } else
        {
            j = i;
            if (i > 255)
            {
                return 255;
            }
        }
        return j;
    }
}
