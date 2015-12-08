// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.common.inject;

import android.support.v4.app.FragmentActivity;

public class FragmentActivityModule
{

    private final FragmentActivity mFragmentActivity;

    public FragmentActivityModule(FragmentActivity fragmentactivity)
    {
        mFragmentActivity = fragmentactivity;
    }

    public final FragmentActivity getFragmentActivity()
    {
        return mFragmentActivity;
    }
}
