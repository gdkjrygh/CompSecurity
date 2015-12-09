// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.common.inject;

import android.app.Activity;
import android.content.Context;

public class ActivityModule
{

    private final Activity mActivity;

    public ActivityModule(Activity activity)
    {
        mActivity = activity;
    }

    public final Activity getActivity()
    {
        return mActivity;
    }

    public final Context getContext()
    {
        return mActivity;
    }
}
