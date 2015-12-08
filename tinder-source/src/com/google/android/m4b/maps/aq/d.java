// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aq;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.google.android.m4b.maps.ay.b;
import com.google.android.m4b.maps.bx.ak;
import com.google.android.m4b.maps.cc.m;
import com.google.android.m4b.maps.cg.aa;
import com.google.android.m4b.maps.model.LatLng;

// Referenced classes of package com.google.android.m4b.maps.aq:
//            b, c

public final class d
    implements com.google.android.m4b.maps.cg.aa.a
{

    m a;
    final aa b;
    private final c c;

    public d(aa aa1, c c1)
    {
        b = aa1;
        c = c1;
    }

    private m a(String s, LatLng latlng, Bitmap bitmap, float f1, float f2, float f3, float f4, 
            boolean flag, boolean flag1, boolean flag2, float f5, float f6)
    {
        latlng = new m(com.google.android.m4b.maps.aq.b.b(latlng), bitmap, Math.round((float)bitmap.getWidth() * f1), Math.round((float)bitmap.getHeight() * f2));
        latlng.g = s;
        latlng.k = flag;
        latlng.b(flag1);
        if (!flag2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        latlng.a(flag);
        latlng.a(f5);
        latlng.a(Math.round((float)bitmap.getWidth() * f3), Math.round((float)bitmap.getHeight() * f4));
        latlng.b(f6);
        latlng.n = b;
        return latlng;
    }

    public final void a()
    {
        Bitmap bitmap = b.f();
        a = a(b.a(), b.e(), bitmap, b.g(), b.h(), b.j(), b.l(), b.q(), b.v(), b.x(), b.z(), b.B());
        c.a(this);
        c.a();
    }

    public final void a(int i)
    {
        if ((i & 1) != 0)
        {
            LatLng latlng = b.d();
            a.a(com.google.android.m4b.maps.aq.b.b(latlng));
            c.b.c();
            c.a();
        }
        if ((i & 2) != 0)
        {
            String s = b.m();
            String s1 = b.o();
            c.a(a);
            String s2 = b.a();
            LatLng latlng1 = b.e();
            Bitmap bitmap = b.f();
            aa aa1 = b;
            aa1.b.a();
            float f1 = aa1.g();
            aa1 = b;
            aa1.b.a();
            a = a(s2, latlng1, bitmap, f1, aa1.h(), b.i(), b.k(), b.q(), b.v(), b.x(), b.z(), b.B());
            a.e = s;
            a.f = s1;
            c.a(this);
            c.a();
        }
        if ((i & 4) != 0)
        {
            float f2 = b.g();
            float f4 = b.h();
            m m1 = a;
            int j = Math.round(f2 * (float)a.a.getWidth());
            int k = Math.round(f4 * (float)a.a.getHeight());
            m1.c = j;
            m1.d = k;
            m1.l = m1.a(m1.c);
            m1.m = m1.a(m1.d);
            c.a();
        }
        if ((i & 8) != 0)
        {
            boolean flag = b.x();
            Object obj = a;
            float f3;
            float f5;
            if (!flag)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            ((m) (obj)).a(flag);
            c.a();
        }
        if ((i & 0x10) != 0)
        {
            a.a(b.z());
            c.a();
        }
        if ((i & 0x40) != 0)
        {
            flag = b.v();
            if (!flag)
            {
                c.c(this);
            }
            a.b(flag);
            c.a();
            c.b.c();
        }
        if ((i & 0x400) != 0)
        {
            a.b(b.B());
            c.a();
        }
        if ((i & 0x200) != 0)
        {
            f3 = b.j();
            f5 = b.l();
            a.a(Math.round(f3 * (float)a.a.getWidth()), Math.round(f5 * (float)a.a.getHeight()));
            c.a();
        }
        if ((i & 0x80) != 0)
        {
            obj = b.n();
            a.e = ((String) (obj));
            c.a();
        }
        if ((i & 0x20) != 0)
        {
            a.k = b.q();
        }
        if ((i & 0x100) != 0)
        {
            a.f = b.e;
            c.a();
        }
    }

    public final void b()
    {
        c.a(a);
        c.a();
    }

    public final void c()
    {
        c.b(this);
        c.a();
    }

    public final void d()
    {
        c.c(this);
        c.a();
    }

    public final void e()
    {
        aa aa1 = b;
        com.google.android.m4b.maps.ak.b b1 = a.d();
        aa1.b(new LatLng((double)b1.a * 9.9999999999999995E-07D, (double)b1.b * 9.9999999999999995E-07D));
    }

    public final boolean f()
    {
        return c.b(a);
    }

    public final Rect g()
    {
        return a.h();
    }
}
