// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cc;

import com.google.android.m4b.maps.bi.b;
import com.google.android.m4b.maps.bm.d;
import com.google.android.m4b.maps.bn.k;
import com.google.android.m4b.maps.bo.ah;
import com.google.android.m4b.maps.bx.ab;
import com.google.android.m4b.maps.bx.ag;
import com.google.android.m4b.maps.bx.l;
import javax.microedition.khronos.opengles.GL10;

// Referenced classes of package com.google.android.m4b.maps.cc:
//            c

public final class r
    implements c
{

    static final r a = new r();
    private static boolean b;

    public r()
    {
    }

    public static void a(d d1)
    {
        d1.f();
        d1.a.glColor4x(0x10000, 0x10000, 0x10000, 0x10000);
        d1.r.d(d1);
        d1.b();
        if ((d1.d & 2) != 0)
        {
            d1.a.glDisable(3553);
            d1.a.glDisableClientState(32888);
            d1.a(2, false);
        }
        d1.a.glDrawArrays(5, 0, 4);
        d1.g();
    }

    public static void a(d d1, ab ab1)
    {
        GL10 gl10 = d1.a;
        ab1 = ((l)ab1.c.a).e;
        boolean flag = ab1.f();
        b = flag;
        if (flag)
        {
            ab1.a(gl10);
            gl10.glLineWidth(5F);
            d1.v.d(d1);
        }
    }

    public final void a(d d1, b b1, ab ab1)
    {
        if (b)
        {
            d1.a.glDrawArrays(2, 0, 4);
        }
    }

    public final void b(d d1)
    {
    }

    public final void c(d d1)
    {
    }

}
