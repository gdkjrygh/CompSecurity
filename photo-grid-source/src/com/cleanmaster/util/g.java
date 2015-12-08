// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.util;

import android.content.Context;
import android.text.TextUtils;
import com.cleanmaster.common.a;
import com.cleanmaster.gaid.AdvertisingIdHelper;
import com.picksinit.PicksMob;
import com.picksinit.b;

public class g
{

    public static final int a = PicksMob.getInstance().getIntMid();
    public static String b = null;
    public static String c = null;
    String d;
    int e;
    int f;
    String g;
    String h;
    String i;
    int j;
    String k;
    int l;
    String m;
    String n;
    String o;
    String p;
    String q;
    int r;

    public g()
    {
        i = "";
        j = 0;
        k = null;
        l = -1;
        m = "";
        n = "";
        o = "";
        p = "";
        r = 0;
    }

    public static g a(String s)
    {
        return a(s, 50, a);
    }

    public static g a(String s, int i1, int j1)
    {
        g g1 = new g();
        g1.d = s;
        g1.e = j1;
        g1.f = i1;
        g1.g = com.cleanmaster.common.a.a();
        g1.h = String.format("%s_%s", new Object[] {
            com.cleanmaster.common.a.i(PicksMob.getInstance().getContext()), com.cleanmaster.common.a.j(PicksMob.getInstance().getContext())
        });
        if (PicksMob.getInstance().getmAdResourceRp() == 1)
        {
            i1 = com.cleanmaster.common.a.a(PicksMob.getInstance().getContext(), com.cleanmaster.common.a.c());
        } else
        {
            i1 = PicksMob.getInstance().getmCver();
        }
        g1.j = i1;
        g1.m = a(PicksMob.getInstance().getContext());
        g1.n = AdvertisingIdHelper.getInstance().getGAId();
        g1.p = b(PicksMob.getInstance().getContext());
        g1.q = PicksMob.getInstance().getChannelId();
        return g1;
    }

    public static g a(String s, String s1)
    {
        return a(s, 36, a).e(s1);
    }

    private static String a(Context context)
    {
        if (TextUtils.isEmpty(b))
        {
            context = com.cleanmaster.common.a.f(context);
            b = context;
            if (TextUtils.isEmpty(context))
            {
                b = "";
            }
        }
        return b;
    }

    public static void a(g g1, int i1)
    {
        g1.r = i1;
    }

    public static g b(String s)
    {
        return a(s, 60, a);
    }

    public static g b(String s, String s1)
    {
        return a(s, 38, a).e(s1);
    }

    private static String b(Context context)
    {
        if (TextUtils.isEmpty(c))
        {
            context = com.cleanmaster.common.a.g(context);
            c = context;
            if (TextUtils.isEmpty(context))
            {
                c = "";
            }
        }
        return c;
    }

    public static g c(String s)
    {
        return a(s, 61, a);
    }

    public static g d(String s)
    {
        return a(s, 62, a);
    }

    public String a()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append((new StringBuilder("ac=")).append(f).toString());
        stringbuilder.append((new StringBuilder("&pos=")).append(d).toString());
        stringbuilder.append((new StringBuilder("&mid=")).append(e).toString());
        stringbuilder.append((new StringBuilder("&aid=")).append(g).toString());
        stringbuilder.append((new StringBuilder("&lan=")).append(h).toString());
        stringbuilder.append((new StringBuilder("&ext=")).append(i).toString());
        stringbuilder.append((new StringBuilder("&cmver=")).append(j).toString());
        if (k != null)
        {
            stringbuilder.append((new StringBuilder("&rf=")).append(k).toString());
        }
        if (l != -1)
        {
            stringbuilder.append((new StringBuilder("&g_pg=")).append(l).toString());
        }
        stringbuilder.append((new StringBuilder("&mcc=")).append(m).toString());
        stringbuilder.append((new StringBuilder("&mnc=")).append(p).toString());
        stringbuilder.append((new StringBuilder("&gaid=")).append(n).toString());
        stringbuilder.append((new StringBuilder("&placementid=")).append(o).toString());
        stringbuilder.append("&pl=2");
        stringbuilder.append("&v=16");
        stringbuilder.append((new StringBuilder("&channelid=")).append(q).toString());
        stringbuilder.append((new StringBuilder("&lp=")).append(r).toString());
        return stringbuilder.toString();
    }

    public g e(String s)
    {
        k = s;
        return this;
    }

}
