// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget.recycler;

import android.content.Context;
import android.support.v7.widget.g;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package com.skype.android.widget.recycler:
//            TwoWayRecyclerView, OnStretchListener

public static abstract class k extends g
{
    public static interface Appetite
    {

        public abstract int a(int i);
    }

    public static class Dimension
    {

        int a;
        int b;
        int c;
        int d;
        int e;
        int f;
        int g;
        int h;
        int i;
        int j;
        boolean k;
        boolean l;
        boolean m;
        boolean n;
        boolean o;
        boolean p;
        boolean q;
        boolean r;
        public int s;

        static void a(Dimension dimension, int i1)
        {
            boolean flag1 = true;
            dimension.e = i1;
            dimension.f = android.view.View.MeasureSpec.getMode(i1);
            dimension.g = android.view.View.MeasureSpec.getSize(i1);
            int j1;
            boolean flag;
            if (dimension.f != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            dimension.m = flag;
            if (dimension.f != 0x40000000)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            dimension.n = flag;
            if (dimension.k)
            {
                j1 = dimension.a;
            } else
            {
                j1 = 0x7fffffff;
            }
            if (dimension.m)
            {
                int k1 = dimension.g;
                i1 = k1;
                if (dimension.l)
                {
                    i1 = k1 / dimension.d;
                }
            } else
            {
                i1 = 0x7fffffff;
            }
            i1 = Math.min(j1, i1);
            if (i1 == 0x7fffffff)
            {
                dimension.h = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                return;
            } else
            {
                dimension.h = android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x80000000);
                return;
            }
        }

        static void a(Dimension dimension, boolean flag)
        {
            boolean flag1 = true;
            int i1;
            if (flag)
            {
                i1 = dimension.c;
            } else
            {
                i1 = dimension.b;
            }
            dimension.d = i1;
            if ((dimension.j == 1 || dimension.j == 3) && !flag)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            dimension.o = flag;
            if (dimension.d > 0)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            dimension.l = flag;
        }

        public final int a()
        {
            if (o)
            {
                return 0;
            } else
            {
                return h;
            }
        }

        final void a(Appetite appetite)
        {
            r = false;
            q = false;
            if (s > 0)
            {
                int i1;
                int j1;
                if (m)
                {
                    i1 = g / s;
                } else
                {
                    i1 = 0x7fffffff;
                }
                if (l)
                {
                    j1 = d;
                } else
                {
                    j1 = 0x7fffffff;
                }
                i1 = Math.min(j1, i1);
                j1 = appetite.a(i1);
                if (j1 == i1)
                {
                    r = true;
                } else
                {
             