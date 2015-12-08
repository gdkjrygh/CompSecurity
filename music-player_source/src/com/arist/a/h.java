// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.a;

import android.support.v4.view.ViewPager;
import android.support.v4.view.aa;
import android.view.View;
import java.util.ArrayList;

public final class h extends aa
{

    private ArrayList a;

    public h(ArrayList arraylist)
    {
        if (arraylist != null)
        {
            a = arraylist;
            return;
        } else
        {
            a = new ArrayList();
            return;
        }
    }

    public final int a()
    {
        return a.size();
    }

    public final Object a(View view, int i)
    {
        View view1 = (View)a.get(i);
        ((ViewPager)view).addView(view1);
        return view1;
    }

    public final boolean a(View view, Object obj)
    {
        return view == obj;
    }

    public final int b()
    {
        return -2;
    }

    public final void b(View view, int i)
    {
        View view1 = (View)a.get(i);
        ((ViewPager)view).removeView(view1);
    }
}
