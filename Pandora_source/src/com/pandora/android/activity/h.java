// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import android.support.v4.app.Fragment;
import java.util.ArrayList;
import java.util.Stack;
import p.ca.x;

// Referenced classes of package com.pandora.android.activity:
//            f

public class h
{

    private Stack a;
    private ArrayList b;

    public h()
    {
        a = new Stack();
    }

    private ArrayList h()
    {
        ArrayList arraylist = new ArrayList();
        HomeTabsActivity.b ab[] = HomeTabsActivity.b.values();
        int j = ab.length;
        for (int i = 0; i < j; i++)
        {
            x x1 = (x)ab[i].e.a;
            if (x1 != null)
            {
                arraylist.add(x1);
            }
        }

        arraylist.addAll(a);
        return arraylist;
    }

    public ArrayList a()
    {
        if (b == null)
        {
            b = h();
        }
        return b;
    }

    public void a(x x1)
    {
        a.push(x1);
        b();
    }

    void b()
    {
        b = null;
    }

    public void c()
    {
        a.clear();
        b();
    }

    public Fragment d()
    {
        Fragment fragment = (Fragment)a.pop();
        b();
        return fragment;
    }

    public int e()
    {
        return a.size();
    }

    public x f()
    {
        return (x)a.peek();
    }

    public boolean g()
    {
        return a.empty();
    }
}
