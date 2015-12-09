// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.util;

import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

public final class DialogFragmentUtil
{

    public static void dismiss(FragmentActivity fragmentactivity, String s)
    {
        fragmentactivity = fragmentactivity.mFragments.findFragmentByTag(s);
        if (fragmentactivity != null)
        {
            ((DialogFragment)fragmentactivity).dismissInternal(false);
        }
    }

    public static void dismissAllowingStateLoss(FragmentActivity fragmentactivity, String s)
    {
        fragmentactivity = fragmentactivity.mFragments.findFragmentByTag(s);
        if (fragmentactivity != null)
        {
            ((DialogFragment)fragmentactivity).dismissInternal(true);
        }
    }

    public static void show(FragmentActivity fragmentactivity, DialogFragment dialogfragment, String s)
    {
        Object obj = fragmentactivity.mFragments;
        fragmentactivity = ((FragmentManager) (obj)).beginTransaction();
        obj = ((FragmentManager) (obj)).findFragmentByTag(s);
        if (obj != null)
        {
            fragmentactivity.remove(((android.support.v4.app.Fragment) (obj)));
        }
        fragmentactivity.add(dialogfragment, s);
        fragmentactivity.commitAllowingStateLoss();
    }
}
