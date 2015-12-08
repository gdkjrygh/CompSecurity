// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.a;

import android.content.Context;
import com.roidapp.baselib.c.n;
import com.roidapp.imagelib.filter.a;
import com.roidapp.imagelib.filter.bj;
import com.roidapp.imagelib.filter.filterinfo.IFilterInfo;
import com.roidapp.imagelib.filter.groupinfo.IGroupInfo;
import com.roidapp.imagelib.filter.r;

public final class h
{

    public static int a;
    public static int b = 0;
    public static int c;
    public static int d = 1;
    public static boolean e = false;
    public static boolean f = true;
    public static boolean g = false;
    public static int h = 100;
    public static int i = 0;
    public static IGroupInfo j = null;
    public static IFilterInfo k = null;
    public static String l = "DefaultSelType";

    public static void a()
    {
        c = a;
        d = 1;
        e = false;
        f = true;
        g = false;
        h = 100;
        i = 0;
        bj bj1 = new bj();
        j = bj1.b[0];
        k = bj1.a[0][7];
    }

    public static void a(Context context, int i1, int j1, boolean flag, boolean flag1, String s)
    {
        boolean flag2 = false;
        c = a;
        d = 1;
        e = false;
        f = true;
        g = flag;
        h = 100;
        i = 0;
        if (flag1)
        {
            if (!n.a(context, s))
            {
                context = new bj();
                j = ((bj) (context)).b[0];
                k = ((bj) (context)).a[0][7];
                return;
            }
            com.roidapp.imagelib.filter.groupinfo.CloudGroupInfo cloudgroupinfo = (new a(context)).a(s);
            if (cloudgroupinfo != null)
            {
                cloudgroupinfo.a(r.b(context, s));
                j = cloudgroupinfo;
                k = cloudgroupinfo.a(j1);
                return;
            } else
            {
                context = new bj();
                j = ((bj) (context)).b[0];
                k = ((bj) (context)).a[0][7];
                return;
            }
        }
        context = new bj();
        i1--;
        if (i1 < 0)
        {
            i1 = ((flag2) ? 1 : 0);
        }
        j = ((bj) (context)).b[i1];
        k = ((bj) (context)).a[i1][j1];
    }

    static 
    {
        a = 1;
        c = a;
    }
}
