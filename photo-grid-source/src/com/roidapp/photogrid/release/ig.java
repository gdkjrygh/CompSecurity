// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.text.TextUtils;
import com.roidapp.imagelib.b.b;
import com.roidapp.imagelib.filter.filterinfo.IFilterInfo;
import com.roidapp.imagelib.filter.groupinfo.IGroupInfo;

// Referenced classes of package com.roidapp.photogrid.release:
//            lc

public class ig
{

    public boolean A;
    public boolean B;
    public int C;
    public int D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public int h;
    public b i;
    public transient IGroupInfo j;
    public transient IFilterInfo k;
    public int l;
    public boolean m;
    public String n;
    public String o;
    int p;
    int q;
    int r;
    int s;
    float t;
    float u;
    float v;
    public boolean w;
    int x;
    public transient lc y;
    public boolean z;

    public ig()
    {
        l = 100;
        B = false;
    }

    public ig(String s1)
    {
        l = 100;
        B = false;
        n = s1;
        b = null;
        e = null;
        p = 0;
        r = 1;
        s = 1;
        t = 0.0F;
        u = 0.0F;
        v = 1.0F;
        x = 0;
        w = true;
        i = new b();
    }

    public final ig a()
    {
        ig ig1 = new ig();
        ig1.a = a;
        ig1.n = n;
        ig1.b = b;
        ig1.c = c;
        ig1.e = e;
        ig1.p = p;
        ig1.r = r;
        ig1.s = s;
        ig1.t = t;
        ig1.u = u;
        ig1.v = v;
        ig1.w = w;
        ig1.y = y;
        ig1.x = x;
        ig1.z = z;
        ig1.B = B;
        ig1.i = new b(i.a, i.b, i.c, i.d);
        ig1.j = j;
        ig1.A = A;
        ig1.C = C;
        ig1.D = D;
        ig1.E = E;
        ig1.F = F;
        ig1.G = G;
        ig1.H = H;
        return ig1;
    }

    public final void b()
    {
        p = 0;
        r = 1;
        s = 1;
        t = 0.0F;
        u = 0.0F;
        v = 1.0F;
        x = 0;
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        j = null;
        l = 100;
        i = new b();
    }

    public final void c()
    {
        t = 0.0F;
        u = 0.0F;
        v = 1.0F;
        x = 0;
    }

    public Object clone()
    {
        return a();
    }

    public final String d()
    {
        if (!TextUtils.isEmpty(b))
        {
            return b;
        } else
        {
            return e();
        }
    }

    public final String e()
    {
        if (!TextUtils.isEmpty(c))
        {
            return c;
        }
        if (!TextUtils.isEmpty(a))
        {
            return a;
        }
        if (!TextUtils.isEmpty(n))
        {
            return n;
        } else
        {
            return "";
        }
    }

    public final void f()
    {
        b = null;
        a = null;
        c = null;
    }
}
