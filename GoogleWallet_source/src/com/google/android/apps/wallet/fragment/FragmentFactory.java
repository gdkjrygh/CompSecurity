// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.fragment;

import android.support.v4.app.Fragment;

public final class FragmentFactory
{

    public FragmentFactory()
    {
    }

    public static Fragment get(Class class1)
    {
        Fragment fragment;
        try
        {
            fragment = (Fragment)class1.newInstance();
        }
        catch (InstantiationException instantiationexception)
        {
            throw new RuntimeException(String.valueOf(class1.getSimpleName()).concat(" must have a public no-arg constructor"));
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            throw new RuntimeException(String.valueOf(class1.getSimpleName()).concat(" must have a public no-arg constructor"));
        }
        return fragment;
    }
}
