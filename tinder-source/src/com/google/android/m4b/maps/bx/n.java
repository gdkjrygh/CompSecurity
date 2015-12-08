// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bx;

import com.google.android.m4b.maps.bi.b;
import com.google.android.m4b.maps.bi.c;
import com.google.android.m4b.maps.bm.d;
import com.google.android.m4b.maps.bo.g;
import javax.microedition.khronos.opengles.GL10;

public final class n
{

    public static void a(d d1, b b1, g g1, float f)
    {
        a(d1, b1, g1, f, d1.x);
        a(d1.a, d1.x);
    }

    private static void a(d d1, b b1, g g1, float f, boolean flag, float af[])
    {
        float f1;
        g g2;
        if (d1 == null)
        {
            d1 = new g();
            g2 = new g();
        } else
        {
            g2 = d1.y;
            g g3 = d1.z;
            d1 = g2;
            g2 = g3;
        }
        b1.a(d1);
        g.b(g1, d1, g2);
        if (flag)
        {
            g2.h(g2);
        }
        f1 = b1.f();
        af[0] = (float)g2.a * f1;
        af[1] = (float)g2.b * f1;
        af[2] = (float)g2.c * f1;
        af[3] = f1 * f;
    }

    public static void a(d d1, b b1, g g1, float f, float af[])
    {
        a(d1, b1, g1, f, true, af);
    }

    public static void a(GL10 gl10, b b1)
    {
        gl10.glRotatef(-b1.b.d, 0.0F, 0.0F, 1.0F);
        gl10.glRotatef(b1.b.c - 90F, 1.0F, 0.0F, 0.0F);
    }

    public static void a(GL10 gl10, float af[])
    {
        gl10.glTranslatef(af[0], af[1], af[2]);
        gl10.glScalef(af[3], af[3], af[3]);
    }

    public static void b(d d1, b b1, g g1, float f)
    {
        a(d1, b1, g1, f, false, d1.x);
        a(d1.a, d1.x);
    }
}
