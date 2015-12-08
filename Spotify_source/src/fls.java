// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.KeyCharacterMap;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.Window;

public final class fls
{

    public static int a(Resources resources)
    {
        int j = 1;
        boolean flag = false;
        cvp.a(resources);
        Configuration configuration = resources.getConfiguration();
        int i;
        if (configuration.orientation == 1)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (configuration.smallestScreenWidthDp < 600)
        {
            j = 0;
        }
        if (j != 0)
        {
            String s;
            if (i != 0)
            {
                s = "navigation_bar_height";
            } else
            {
                s = "navigation_bar_height_landscape";
            }
            i = resources.getIdentifier(s, "dimen", "android");
        } else
        {
            String s1;
            if (i != 0)
            {
                s1 = "navigation_bar_height";
            } else
            {
                s1 = "navigation_bar_width";
            }
            i = resources.getIdentifier(s1, "dimen", "android");
        }
        j = ((flag) ? 1 : 0);
        if (i > 0)
        {
            j = resources.getDimensionPixelSize(i);
        }
        return j;
    }

    public static void a(Activity activity)
    {
        if (gcl.a)
        {
            return;
        } else
        {
            cvp.a(activity);
            ((View)cvp.a(activity.getWindow().getDecorView())).setSystemUiVisibility(1792);
            return;
        }
    }

    public static boolean a(Context context)
    {
        cvp.a(context);
        Resources resources = context.getResources();
        int i = resources.getIdentifier("config_showNavigationBar", "bool", "android");
        if (i > 0)
        {
            return resources.getBoolean(i);
        }
        boolean flag = ViewConfiguration.get(context).hasPermanentMenuKey();
        boolean flag1 = KeyCharacterMap.deviceHasKey(4);
        return !flag && !flag1;
    }

    public static void b(Activity activity)
    {
        if (gcl.a)
        {
            return;
        }
        cvp.a(activity);
        activity = (View)cvp.a(activity.getWindow().getDecorView());
        char c = '\u0706';
        if (gcl.i)
        {
            c = '\u0F06';
        }
        activity.setSystemUiVisibility(c);
    }
}
