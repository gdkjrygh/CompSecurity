// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ui.e;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;

public class a
{

    public a()
    {
    }

    public static void a(Activity activity)
    {
        InputMethodManager inputmethodmanager;
        if (activity != null)
        {
            if ((inputmethodmanager = (InputMethodManager)activity.getSystemService("input_method")) != null)
            {
                inputmethodmanager.hideSoftInputFromWindow(activity.getWindow().getDecorView().getWindowToken(), 0);
                return;
            }
        }
    }

    public static void a(Context context, View view)
    {
        if (context != null)
        {
            if ((context = (InputMethodManager)context.getSystemService("input_method")) != null)
            {
                context.showSoftInput(view, 1);
                return;
            }
        }
    }
}
