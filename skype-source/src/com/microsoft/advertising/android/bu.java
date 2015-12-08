// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.util.Map;
import java.util.TreeMap;

// Referenced classes of package com.microsoft.advertising.android:
//            af, av

public final class bu
{

    private static final Map d = new TreeMap() {

            
            {
                put(Integer.valueOf(120), "DENSITY_LOW");
                put(Integer.valueOf(160), "DENSITY_MEDIUM");
                put(Integer.valueOf(240), "DENSITY_HIGH");
                put(Integer.valueOf(320), "DENSITY_XHIGH");
                put(Integer.valueOf(480), "DENSITY_XXHIGH");
            }
    };
    private final Context a;
    private final DisplayMetrics b;
    private final int c;

    public bu(DisplayMetrics displaymetrics, Context context)
    {
        af.a(new Object[] {
            displaymetrics, context
        });
        b = displaymetrics;
        a = context;
        c = a(context.getResources());
    }

    public static int a(Resources resources)
    {
        if (resources != null) goto _L2; else goto _L1
_L1:
        int i;
        return 0;
_L2:
        if ((i = resources.getIdentifier("status_bar_height", "dimen", "android")) <= 0) goto _L1; else goto _L3
_L3:
        try
        {
            i = resources.getDimensionPixelSize(i);
        }
        // Misplaced declaration of an exception variable
        catch (Resources resources)
        {
            av.a("ScreenInfo", "exception getting status bar height", resources);
            return 0;
        }
        return i;
    }

    public final int a()
    {
        return a(((WindowManager)a.getSystemService("window")).getDefaultDisplay().getWidth(), true);
    }

    public final int a(int i)
    {
        return a(i, false);
    }

    public final int a(int i, boolean flag)
    {
        if (flag)
        {
            if ((float)i % b.density == 0.0F)
            {
                return (int)((float)i / b.density);
            } else
            {
                return (int)((float)i / b.density) + 1;
            }
        } else
        {
            return (int)((float)i / b.density);
        }
    }

    public final int b()
    {
        return a(((WindowManager)a.getSystemService("window")).getDefaultDisplay().getHeight(), true);
    }

    public final int b(int i)
    {
        return (int)((float)i * b.density);
    }

    public final float c()
    {
        return b.density;
    }

}
