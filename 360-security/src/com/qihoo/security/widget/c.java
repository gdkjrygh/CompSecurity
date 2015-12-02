// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.widget;

import java.util.ArrayList;
import java.util.Iterator;

public class c
    implements android.support.v4.view.ViewPager.e
{

    private ArrayList a;

    public c()
    {
        a = new ArrayList();
    }

    public void a(int i)
    {
        Iterator iterator = a.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            android.support.v4.view.ViewPager.e e = (android.support.v4.view.ViewPager.e)iterator.next();
            if (e != null)
            {
                e.a(i);
            }
        } while (true);
    }

    public void a(int i, float f, int j)
    {
        Iterator iterator = a.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            android.support.v4.view.ViewPager.e e = (android.support.v4.view.ViewPager.e)iterator.next();
            if (e != null)
            {
                e.a(i, f, j);
            }
        } while (true);
    }

    public void a(android.support.v4.view.ViewPager.e e)
    {
        if (e != null)
        {
            a.add(e);
        }
    }

    public void b(int i)
    {
        Iterator iterator = a.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            android.support.v4.view.ViewPager.e e = (android.support.v4.view.ViewPager.e)iterator.next();
            if (e != null)
            {
                e.b(i);
            }
        } while (true);
    }
}
