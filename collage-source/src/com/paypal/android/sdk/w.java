// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;

import android.app.ActionBar;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.Window;
import android.widget.TextView;

// Referenced classes of package com.paypal.android.sdk:
//            gn

public class w
{

    private String a;
    private String b;

    public w()
    {
    }

    public static void a(Activity activity)
    {
        if (d())
        {
            activity.requestWindowFeature(8);
        }
    }

    public static void a(Activity activity, TextView textview, String s, String s1, Drawable drawable)
    {
        activity.setTitle((new StringBuilder()).append(s1).append(s).toString());
        if (!d()) goto _L2; else goto _L1
_L1:
        boolean flag;
        if (activity.getActionBar() != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag) goto _L2; else goto _L3
_L3:
        s1 = activity.getActionBar();
        s1.setBackgroundDrawable(gn.b);
        s1.setTitle(s);
        activity = (TextView)activity.findViewById(Resources.getSystem().getIdentifier("action_bar_title", "id", "android"));
        if (activity != null)
        {
            activity.setTextColor(-1);
        }
        s1.setDisplayHomeAsUpEnabled(false);
        if (drawable != null && android.os.Build.VERSION.SDK_INT >= 14)
        {
            s1.setIcon(drawable);
        } else
        {
            s1.setDisplayShowHomeEnabled(false);
        }
        if (textview != null)
        {
            textview.setVisibility(8);
        }
_L5:
        return;
_L2:
        if (textview != null)
        {
            textview.setText(s);
            return;
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    public static void b(Activity activity)
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            activity.getWindow().addFlags(8192);
        }
    }

    public static boolean c()
    {
        return android.os.Build.VERSION.SDK_INT >= 11;
    }

    private static boolean d()
    {
        return android.os.Build.VERSION.SDK_INT >= 11;
    }

    public final String a()
    {
        return a;
    }

    public final void a(String s)
    {
        a = s;
    }

    public final String b()
    {
        return b;
    }

    public final void b(String s)
    {
        b = s;
    }
}
