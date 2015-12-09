// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

public class ad
{

    public ad()
    {
    }

    public static void a(FragmentActivity fragmentactivity, Fragment fragment, int i)
    {
        if (fragmentactivity != null)
        {
            a(fragmentactivity.getSupportFragmentManager(), fragment, i);
        }
    }

    public static void a(FragmentActivity fragmentactivity, String s, int i)
    {
        if (fragmentactivity != null)
        {
            a(fragmentactivity.getSupportFragmentManager(), s, i);
        }
    }

    public static void a(FragmentManager fragmentmanager, Fragment fragment, int i)
    {
        fragmentmanager = fragmentmanager.beginTransaction();
        if (fragment != null)
        {
            fragmentmanager.remove(fragment);
            fragmentmanager.setTransition(i);
        }
        fragmentmanager.commitAllowingStateLoss();
    }

    public static void a(FragmentManager fragmentmanager, String s)
    {
        a(fragmentmanager, s, 0);
    }

    public static void a(FragmentManager fragmentmanager, String s, int i)
    {
        a(fragmentmanager, fragmentmanager.findFragmentByTag(s), i);
    }

    public static void a(FragmentManager fragmentmanager, String s, Fragment fragment)
    {
        a(fragmentmanager, s, fragment, true, 0);
    }

    public static void a(FragmentManager fragmentmanager, String s, Fragment fragment, int i)
    {
        a(fragmentmanager, s, fragment, true, i);
    }

    public static void a(FragmentManager fragmentmanager, String s, Fragment fragment, boolean flag)
    {
        a(fragmentmanager, s, fragment, flag, 0);
    }

    public static void a(FragmentManager fragmentmanager, String s, Fragment fragment, boolean flag, int i)
    {
label0:
        {
            FragmentTransaction fragmenttransaction = fragmentmanager.beginTransaction();
            fragmentmanager = fragmentmanager.findFragmentByTag(s);
            if (fragmentmanager != null)
            {
                if (!flag)
                {
                    break label0;
                }
                fragmenttransaction.remove(fragmentmanager);
            }
            fragmenttransaction.add(fragment, s);
            fragmenttransaction.setTransition(i);
            fragmenttransaction.commitAllowingStateLoss();
        }
    }

    public static boolean a(FragmentActivity fragmentactivity, String s)
    {
        return fragmentactivity != null && fragmentactivity.getSupportFragmentManager().findFragmentByTag(s) != null;
    }
}
