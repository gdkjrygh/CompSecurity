// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.base.activity;

import android.app.Activity;
import android.view.LayoutInflater;

public class ActivitySupportModule
{

    public ActivitySupportModule()
    {
    }

    static LayoutInflater getLayoutInflater(Activity activity)
    {
        return activity.getLayoutInflater();
    }
}
