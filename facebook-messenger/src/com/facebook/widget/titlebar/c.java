// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget.titlebar;

import android.app.Activity;
import android.view.View;
import com.facebook.i;

public class c
{

    public c()
    {
    }

    public static boolean a(Activity activity)
    {
        boolean flag = false;
        activity = activity.findViewById(i.titlebar_stub);
        if (activity != null)
        {
            activity.setVisibility(0);
        }
        if (activity != null)
        {
            flag = true;
        }
        return flag;
    }

    public static boolean a(View view)
    {
        boolean flag = false;
        view = view.findViewById(i.titlebar_stub);
        if (view != null)
        {
            view.setVisibility(0);
        }
        if (view != null)
        {
            flag = true;
        }
        return flag;
    }
}
