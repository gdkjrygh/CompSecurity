// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bx;

import com.google.android.m4b.maps.aa.al;
import com.google.android.m4b.maps.bi.b;
import com.google.android.m4b.maps.bm.c;
import com.google.android.m4b.maps.bm.d;
import com.google.android.m4b.maps.bo.g;
import java.util.Set;
import javax.microedition.khronos.opengles.GL10;

// Referenced classes of package com.google.android.m4b.maps.bx:
//            h, b, ab, ag

static final class 
    implements h
{

    private final Set a;

    public final Set a()
    {
        return a;
    }

    public final void a(d d1, b b1, ab ab1, g g)
    {
        b1 = d1.a;
        if (ab1.c.b == .e)
        {
            d1.d();
            b1.glStencilOp(7681, 7681, 7681);
            b1.glStencilFunc(519, 255, 128);
            b1.glStencilMask(128);
            b1.glTexEnvx(8960, 8704, 7681);
            c.a(b1, 0xff606060);
        }
    }

    public final void a(d d1, ab ab1)
    {
        if (ab1.c.b == .e)
        {
            d1.e();
        }
    }

    public final volatile int compareTo(Object obj)
    {
        return 0;
    }

    public .GL10(Set set)
    {
        a = al.a(set);
    }
}
