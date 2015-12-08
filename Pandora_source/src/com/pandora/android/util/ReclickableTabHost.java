// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.util;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TabHost;

public class ReclickableTabHost extends TabHost
{
    public static interface a
    {

        public abstract void d(int i);
    }


    private Activity a;
    private a b;
    private int c;

    public ReclickableTabHost(Context context)
    {
        super(context);
        c = -1;
    }

    public ReclickableTabHost(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        c = -1;
    }

    public void a(int i, boolean flag)
    {
        if (i == c && b != null && flag)
        {
            b.d(i);
            return;
        } else
        {
            c = i;
            super.setCurrentTab(i);
            return;
        }
    }

    public void onTouchModeChanged(boolean flag)
    {
        boolean flag2 = false;
        if (android.os.Build.VERSION.SDK_INT > 15)
        {
            boolean flag1 = flag2;
            if (a != null)
            {
                android.view.View view = a.getCurrentFocus();
                flag1 = flag2;
                if (!(view instanceof WebView))
                {
                    flag1 = flag2;
                    if (!(view instanceof EditText))
                    {
                        flag1 = true;
                    }
                }
            }
            if (!flag && flag1)
            {
                super.onTouchModeChanged(flag);
            }
        }
    }

    public void setCurrentTab(int i)
    {
        a(i, true);
    }

    public void setHostActivity(Activity activity)
    {
        a = activity;
    }

    public void setOnCurrentTabClickedListener(a a1)
    {
        b = a1;
    }
}
