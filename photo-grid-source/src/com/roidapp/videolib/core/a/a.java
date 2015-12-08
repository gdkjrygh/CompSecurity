// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.videolib.core.a;

import android.os.Bundle;
import com.roidapp.imagelib.filter.filterinfo.CloudFilterInfo;
import com.roidapp.imagelib.filter.filterinfo.IFilterInfo;
import com.roidapp.imagelib.filter.filterinfo.LocalFilterInfo;
import com.roidapp.videolib.b.u;

public final class a
{

    private u A;
    private u B[];
    private int C;
    private IFilterInfo D;
    public int a;
    public int b;
    public float c;
    public float d;
    public int e;
    public int f;
    public int g;
    public int h;
    public float i;
    public float j;
    public float k;
    public float l;
    public String m;
    public boolean n;
    public String o;
    public boolean p;
    public int q;
    private String r;
    private String s;
    private String t[];
    private int u;
    private int v;
    private long w;
    private long x;
    private int y;
    private boolean z;

    public a()
    {
        e = -1;
        k = 0.0F;
        l = 0.0F;
        D = null;
    }

    public a(String s1, String s2, String as[], int i1, int j1, long l1, 
            long l2, int k1, boolean flag)
    {
        e = -1;
        k = 0.0F;
        l = 0.0F;
        D = null;
        r = s1;
        s = s2;
        t = as;
        u = i1;
        v = j1;
        w = l1;
        x = l2;
        y = k1;
        z = flag;
        n = false;
    }

    public static a a(Bundle bundle)
    {
        a a1 = new a();
        bundle.setClassLoader(com/roidapp/imagelib/filter/filterinfo/IFilterInfo.getClassLoader());
        bundle.setClassLoader(com/roidapp/imagelib/filter/filterinfo/CloudFilterInfo.getClassLoader());
        bundle.setClassLoader(com/roidapp/imagelib/filter/filterinfo/LocalFilterInfo.getClassLoader());
        a1.r = bundle.getString("op");
        a1.s = bundle.getString("afp");
        a1.t = bundle.getStringArray("fi");
        a1.u = bundle.getInt("w");
        a1.v = bundle.getInt("h");
        a1.w = bundle.getLong("asm");
        a1.x = bundle.getLong("tm");
        a1.y = bundle.getInt("quality");
        a1.a = bundle.getInt("width");
        a1.b = bundle.getInt("height");
        a1.c = bundle.getFloat("scale");
        a1.d = bundle.getFloat("corner_scale");
        a1.e = bundle.getInt("mShapeIndex");
        a1.f = bundle.getInt("mPosition");
        a1.g = bundle.getInt("mPattenIndex0");
        a1.h = bundle.getInt("mPattenIndex1");
        a1.i = bundle.getFloat("top_border");
        a1.j = bundle.getFloat("left_border");
        a1.k = bundle.getFloat("corner_radious");
        a1.l = bundle.getFloat("outer_space");
        a1.z = bundle.getBoolean("is_fit");
        a1.m = bundle.getString("cover_path");
        a1.n = bundle.getBoolean("water_mark");
        a1.o = bundle.getString("video_water_marker");
        a1.A = (u)bundle.getSerializable("transitionConfig");
        a1.C = bundle.getInt("video_alphaprogress");
        a1.D = (IFilterInfo)bundle.getParcelable("video_filter_type");
        a1.p = bundle.getBoolean("video_bg_blur");
        a1.q = bundle.getInt("video_bg_blur_size", 1);
        bundle = bundle.getIntArray("transitionArrayConfig");
        if (bundle != null)
        {
            a1.B = new u[bundle.length];
            for (int i1 = 0; i1 < bundle.length; i1++)
            {
                a1.B[i1] = com.roidapp.videolib.b.u.values()[bundle[i1]];
            }

        }
        return a1;
    }

    public final String a()
    {
        return r;
    }

    public final void a(int i1)
    {
        C = i1;
    }

    public final void a(IFilterInfo ifilterinfo)
    {
        D = ifilterinfo;
    }

    public final void a(u u1)
    {
        A = u1;
    }

    public final void a(u au[])
    {
        B = au;
    }

    public final String b()
    {
        return s;
    }

    public final String[] c()
    {
        return t;
    }

    public final int d()
    {
        return u;
    }

    public final int e()
    {
        return v;
    }

    public final long f()
    {
        return w;
    }

    public final long g()
    {
        return x;
    }

    public final int h()
    {
        return y;
    }

    public final Bundle i()
    {
        Bundle bundle = new Bundle();
        bundle.putString("op", r);
        bundle.putString("afp", s);
        bundle.putStringArray("fi", t);
        bundle.putInt("w", u);
        bundle.putInt("h", v);
        bundle.putLong("asm", w);
        bundle.putLong("tm", x);
        bundle.putInt("quality", y);
        bundle.putInt("width", a);
        bundle.putInt("height", b);
        bundle.putFloat("scale", c);
        bundle.putFloat("corner_scale", d);
        bundle.putInt("mShapeIndex", e);
        bundle.putInt("mPosition", f);
        bundle.putInt("mPattenIndex0", g);
        bundle.putInt("mPattenIndex1", h);
        bundle.putFloat("top_border", i);
        bundle.putFloat("left_border", j);
        bundle.putFloat("corner_radious", k);
        bundle.putFloat("outer_space", l);
        bundle.putBoolean("is_fit", z);
        bundle.putString("cover_path", m);
        bundle.putBoolean("water_mark", n);
        bundle.putString("video_water_marker", o);
        bundle.putSerializable("transitionConfig", A);
        bundle.putInt("video_alphaprogress", C);
        bundle.putBoolean("video_bg_blur", p);
        bundle.putInt("video_bg_blur_size", q);
        bundle.putParcelable("video_filter_type", D);
        bundle.setClassLoader(com/roidapp/imagelib/filter/filterinfo/IFilterInfo.getClassLoader());
        bundle.setClassLoader(com/roidapp/imagelib/filter/filterinfo/CloudFilterInfo.getClassLoader());
        bundle.setClassLoader(com/roidapp/imagelib/filter/filterinfo/LocalFilterInfo.getClassLoader());
        if (B != null)
        {
            int ai[] = new int[B.length];
            for (int i1 = 0; i1 < ai.length; i1++)
            {
                ai[i1] = B[i1].ordinal();
            }

            bundle.putIntArray("transitionArrayConfig", ai);
        }
        return bundle;
    }

    public final boolean j()
    {
        return z;
    }

    public final u[] k()
    {
        return B;
    }

    public final u l()
    {
        return A;
    }

    public final int m()
    {
        return C;
    }

    public final IFilterInfo n()
    {
        return D;
    }
}
