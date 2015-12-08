// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment.ui;

import android.app.ActionBar;
import android.app.Activity;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.Window;
import android.widget.TextView;

// Referenced classes of package io.card.payment.ui:
//            Appearance

public class ActivityHelper
{

    private static boolean actionBarNonNull(Activity activity)
    {
        return activity.getActionBar() != null;
    }

    private static boolean actionBarSupported()
    {
        return android.os.Build.VERSION.SDK_INT >= 11;
    }

    public static void addActionBarIfSupported(Activity activity)
    {
        if (actionBarSupported())
        {
            activity.requestWindowFeature(8);
        }
    }

    public static boolean holoSupported()
    {
        return android.os.Build.VERSION.SDK_INT >= 11;
    }

    private static void setActionBarHomeIcon(ActionBar actionbar, Drawable drawable)
    {
        actionbar.setIcon(drawable);
    }

    public static void setActivityTheme(Activity activity, boolean flag)
    {
        if (flag && activity.getApplicationInfo().theme != 0)
        {
            activity.setTheme(activity.getApplicationInfo().theme);
            return;
        }
        if (holoSupported())
        {
            activity.setTheme(0x103006e);
            return;
        } else
        {
            activity.setTheme(0x103000c);
            return;
        }
    }

    public static void setFlagSecure(Activity activity)
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            activity.getWindow().addFlags(8192);
        }
    }

    private static void setupActionBar(Activity activity, String s, Drawable drawable)
    {
        ActionBar actionbar = activity.getActionBar();
        actionbar.setBackgroundDrawable(Appearance.ACTIONBAR_BACKGROUND);
        actionbar.setTitle(s);
        activity = (TextView)activity.findViewById(Resources.getSystem().getIdentifier("action_bar_title", "id", "android"));
        if (activity != null)
        {
            activity.setTextColor(-1);
        }
        actionbar.setDisplayHomeAsUpEnabled(false);
        if (drawable != null && android.os.Build.VERSION.SDK_INT >= 14)
        {
            setActionBarHomeIcon(actionbar, drawable);
            return;
        } else
        {
            actionbar.setDisplayShowHomeEnabled(false);
            return;
        }
    }

    public static void setupActionBarIfSupported(Activity activity, TextView textview, String s, String s1, Drawable drawable)
    {
        String s2 = s1;
        if (s1 == null)
        {
            s2 = "";
        }
        activity.setTitle((new StringBuilder()).append(s2).append(s).toString());
        if (actionBarSupported() && actionBarNonNull(activity))
        {
            setupActionBar(activity, s, drawable);
            if (textview != null)
            {
                textview.setVisibility(8);
            }
        } else
        if (textview != null)
        {
            textview.setText(s);
            return;
        }
    }
}
