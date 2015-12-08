// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.inmobi.commons.core.utilities.info;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.widget.TextView;
import com.inmobi.commons.a.a;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.inmobi.commons.core.utilities.info:
//            c

public class DisplayInfo
{

    public static int a(int i)
    {
        float f1 = a().c();
        return Math.round((float)i / f1);
    }

    public static c a()
    {
        DisplayMetrics displaymetrics = new DisplayMetrics();
        ((WindowManager)com.inmobi.commons.a.a.b().getSystemService("window")).getDefaultDisplay().getMetrics(displaymetrics);
        float f1 = displaymetrics.density;
        return new c(Math.round((float)displaymetrics.widthPixels / f1), Math.round((float)displaymetrics.heightPixels / f1), f1);
    }

    public static int b()
    {
        Context context = com.inmobi.commons.a.a.b();
        int i = ((WindowManager)context.getSystemService("window")).getDefaultDisplay().getRotation();
    /* block-local class not found */
    class ORIENTATION_VALUES {}

        switch (context.getResources().getConfiguration().orientation)
        {
        default:
            return ORIENTATION_VALUES.PORTRAIT.getValue();

        case 1: // '\001'
            if (i == 1 || i == 2)
            {
                return ORIENTATION_VALUES.REVERSE_PORTRAIT.getValue();
            } else
            {
                return ORIENTATION_VALUES.PORTRAIT.getValue();
            }

        case 2: // '\002'
            break;
        }
        if (i == 0 || i == 1)
        {
            return ORIENTATION_VALUES.LANDSCAPE.getValue();
        } else
        {
            return ORIENTATION_VALUES.REVERSE_LANDSCAPE.getValue();
        }
    }

    public static Map c()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("d-device-screen-density", String.valueOf(a().c()));
        hashmap.put("d-device-screen-size", d());
        hashmap.put("d-density-dependent-screen-size", e());
        hashmap.put("d-orientation", String.valueOf(b()));
        hashmap.put("d-textsize", String.valueOf(f()));
        return hashmap;
    }

    private static String d()
    {
        c c1 = a();
        return (new StringBuilder()).append(c1.b()).append("X").append(c1.a()).toString();
    }

    private static String e()
    {
        DisplayMetrics displaymetrics = new DisplayMetrics();
        ((WindowManager)com.inmobi.commons.a.a.b().getSystemService("window")).getDefaultDisplay().getMetrics(displaymetrics);
        int i = displaymetrics.widthPixels;
        int j = displaymetrics.heightPixels;
        return (new StringBuilder()).append(i).append("x").append(j).toString();
    }

    private static float f()
    {
        return (new TextView(com.inmobi.commons.a.a.b())).getTextSize();
    }
}
