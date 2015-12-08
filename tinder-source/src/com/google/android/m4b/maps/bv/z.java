// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bv;

import javax.microedition.khronos.opengles.GL10;

// Referenced classes of package com.google.android.m4b.maps.bv:
//            m, aa

final class z
{

    public final float a[] = new float[16];
    public final float b[] = new float[16];

    public z()
    {
    }

    private static void a(GL10 gl10, int i, float af[])
    {
        if (gl10 instanceof m)
        {
            gl10 = (m)gl10;
            gl10.glMatrixMode(i);
            gl10 = ((m) (gl10)).a;
            System.arraycopy(((aa) (gl10)).a, ((aa) (gl10)).b, af, 0, 16);
            return;
        } else
        {
            throw new IllegalArgumentException("gl must be GLMatrixWrapper");
        }
    }

    public final void a(GL10 gl10)
    {
        a(gl10, 5888, a);
    }

    public final void b(GL10 gl10)
    {
        a(gl10, 5889, b);
    }
}
