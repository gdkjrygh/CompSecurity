// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.a;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.CustomFragmentStatePagerAdapter;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import java.util.ArrayList;

public class x extends CustomFragmentStatePagerAdapter
{
    static final class a
    {

        private final String a;
        private final Bundle b;
        private final String c;
        private final String d;

        static String a(a a1)
        {
            return a1.a;
        }

        static Bundle b(a a1)
        {
            return a1.b;
        }

        static String c(a a1)
        {
            return a1.c;
        }

        static String d(a a1)
        {
            return a1.d;
        }

        a(String s, String s1, Bundle bundle, String s2)
        {
            c = s;
            a = s1;
            b = bundle;
            d = s2;
        }
    }


    private FragmentManager a;
    private final Context b;
    private final ArrayList c = new ArrayList();

    public x(Context context, FragmentManager fragmentmanager)
    {
        super(fragmentmanager);
        b = context;
        a = fragmentmanager;
    }

    public int a(int i)
    {
        if (i < 0)
        {
            return -1;
        }
        if (c.size() == 0)
        {
            return -1;
        }
        if (i > c.size())
        {
            return -1;
        }
        Bundle bundle = a.b((a)c.get(i));
        if (bundle == null)
        {
            return -1;
        } else
        {
            return bundle.getInt("type", -1);
        }
    }

    public void a(String s, String s1, Bundle bundle, String s2)
    {
        s = new a(s, s1, bundle, s2);
        c.add(s);
        notifyDataSetChanged();
    }

    public void a(String s, String s1, String s2)
    {
        a(s, s1, null, s2);
    }

    public int getCount()
    {
        return c.size();
    }

    public Fragment getItem(int i)
    {
        a a1 = (a)c.get(i);
        return Fragment.instantiate(b, a.a(a1), a.b(a1));
    }

    public String getItemTag(int i)
    {
        return a.d((a)c.get(i));
    }

    public CharSequence getPageTitle(int i)
    {
        return a.c((a)c.get(i));
    }
}
