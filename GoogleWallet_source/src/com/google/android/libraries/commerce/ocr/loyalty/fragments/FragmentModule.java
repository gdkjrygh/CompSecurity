// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.loyalty.fragments;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Vibrator;
import android.support.v4.app.Fragment;
import com.google.android.libraries.commerce.ocr.util.ScreenManager;

public class FragmentModule
{

    private final com.google.android.libraries.commerce.ocr.fragments.FragmentModule baseModule;

    public FragmentModule(Fragment fragment)
    {
        baseModule = new com.google.android.libraries.commerce.ocr.fragments.FragmentModule(fragment);
    }

    final Handler provideBackgroundHandler()
    {
        return baseModule.provideBackgroundHandler();
    }

    final Context provideContext()
    {
        return baseModule.provideContext();
    }

    final Fragment provideFragment()
    {
        return baseModule.provideFragment();
    }

    final PackageManager providePackageManager()
    {
        return baseModule.providePackageManager();
    }

    final Resources provideResources()
    {
        return baseModule.provideResources();
    }

    final ScreenManager provideScreenManager()
    {
        return baseModule.provideScreenManager();
    }

    final Handler provideUiThreadHandler()
    {
        com.google.android.libraries.commerce.ocr.fragments.FragmentModule fragmentmodule = baseModule;
        return com.google.android.libraries.commerce.ocr.fragments.FragmentModule.provideUiThreadHandler();
    }

    final Vibrator provideVibrator()
    {
        return baseModule.provideVibrator();
    }
}
