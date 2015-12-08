// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android;

import android.app.Activity;
import android.content.res.TypedArray;
import android.view.Window;

final class a
{

    a(Activity activity)
    {
        TypedArray typedarray = activity.obtainStyledAttributes(com.skype.android.app.R.styleable.WindowTheme);
        if (typedarray.getIndexCount() > 0)
        {
            boolean flag1 = typedarray.getBoolean(2, false);
            int l = typedarray.getDimensionPixelSize(0, -1);
            int k = typedarray.getDimensionPixelSize(1, -1);
            int j = typedarray.getInt(3, -1);
            int i = typedarray.getResourceId(4, -1);
            activity = activity.getWindow();
            android.view.WindowManager.LayoutParams layoutparams = activity.getAttributes();
            boolean flag = false;
            if (l > 0)
            {
                layoutparams.width = l;
                flag = true;
            }
            if (k > 0)
            {
                layoutparams.height = k;
                flag = true;
            }
            if (j > 0)
            {
                layoutparams.gravity = j;
                flag = true;
            }
            if (flag1)
            {
                layoutparams.type = 1000;
                flag = true;
            }
            if (i > 0)
            {
                activity.setBackgroundDrawableResource(i);
            }
            if (flag)
            {
                activity.setAttributes(layoutparams);
            }
        }
        typedarray.recycle();
    }
}
