// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.fragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

public final class Fragments
{

    public static Fragment findByTag(FragmentManager fragmentmanager, Class class1)
    {
        return fragmentmanager.findFragmentByTag(getTransactionTag(class1));
    }

    public static String getTransactionTag(Class class1)
    {
        return class1.getName();
    }

    public static boolean hasTagForClass(Fragment fragment, Class class1)
    {
        return getTransactionTag(class1).equals(fragment.getTag());
    }
}
