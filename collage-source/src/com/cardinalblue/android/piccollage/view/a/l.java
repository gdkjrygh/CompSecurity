// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.a;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.CustomFragmentStatePagerAdapter;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import com.cardinalblue.android.piccollage.a.f;
import java.util.ArrayList;

public class l extends CustomFragmentStatePagerAdapter
{
    static final class a
    {

        private final String a;
        private final Bundle b;
        private final int c;
        private final String d;

        static Bundle a(a a1)
        {
            return a1.b;
        }

        static String b(a a1)
        {
            return a1.a;
        }

        static String c(a a1)
        {
            return a1.d;
        }

        static int d(a a1)
        {
            return a1.c;
        }

        a(int i, String s, Bundle bundle, String s1)
        {
            c = i;
            a = s;
            b = bundle;
            d = s1;
        }
    }


    private final Context a;
    private final ArrayList b = new ArrayList();

    public l(AppCompatActivity appcompatactivity)
    {
        super(appcompatactivity.getSupportFragmentManager());
        a = appcompatactivity;
    }

    public int a(int i)
    {
        if (b == null)
        {
            return -1;
        }
        Bundle bundle = a.a((a)b.get(i));
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        i = bundle.getInt("extra_activity_title", -1);
        return i;
        IndexOutOfBoundsException indexoutofboundsexception;
        indexoutofboundsexception;
        f.a(indexoutofboundsexception);
        return -1;
    }

    public void a(int i, String s, Bundle bundle, String s1)
    {
        s = new a(i, s, bundle, s1);
        b.add(s);
        notifyDataSetChanged();
    }

    public int b(int i)
    {
        return a.d((a)b.get(i));
    }

    public int getCount()
    {
        return b.size();
    }

    public Fragment getItem(int i)
    {
        a a1 = (a)b.get(i);
        return Fragment.instantiate(a, a.b(a1), a.a(a1));
    }

    public String getItemTag(int i)
    {
        return a.c((a)b.get(i));
    }

    public CharSequence getPageTitle(int i)
    {
        return "";
    }
}
