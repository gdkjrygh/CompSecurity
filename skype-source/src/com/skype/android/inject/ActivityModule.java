// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.inject;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.LoaderManager;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.l;
import android.support.v4.app.r;
import android.view.LayoutInflater;
import android.view.MenuInflater;

public class ActivityModule
{

    private final Activity activity;

    public ActivityModule(Activity activity1)
    {
        activity = activity1;
    }

    Activity activity()
    {
        return activity;
    }

    FragmentManager fragmentManager()
    {
        return activity.getFragmentManager();
    }

    LayoutInflater layoutInflater()
    {
        return LayoutInflater.from(activity);
    }

    LoaderManager loaderManager()
    {
        return activity.getLoaderManager();
    }

    MenuInflater menuInflater()
    {
        return activity.getMenuInflater();
    }

    l supportFragmentManager()
    {
        return ((FragmentActivity)activity).getSupportFragmentManager();
    }

    r supportLoaderManager()
    {
        return ((FragmentActivity)activity).getSupportLoaderManager();
    }
}
