// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.b.b;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Resources;
import android.text.format.Formatter;
import android.util.Log;

// Referenced classes of package com.bumptech.glide.load.b.b:
//            q, r

public final class p
{

    private final int a;
    private final int b;
    private final Context c;

    public p(Context context)
    {
        this(context, (ActivityManager)context.getSystemService("activity"), ((r) (new q(context.getResources().getDisplayMetrics()))));
    }

    private p(Context context, ActivityManager activitymanager, r r1)
    {
        c = context;
        int i = activitymanager.getMemoryClass();
        boolean flag = a(activitymanager);
        float f1 = i * 1024 * 1024;
        float f;
        int j;
        int k;
        if (flag)
        {
            f = 0.33F;
        } else
        {
            f = 0.4F;
        }
        i = Math.round(f * f1);
        k = r1.a() * r1.b() * 4;
        j = k * 4;
        k *= 2;
        if (k + j <= i)
        {
            b = k;
            a = j;
        } else
        {
            int l = Math.round((float)i / 6F);
            b = l * 2;
            a = l * 4;
        }
        if (Log.isLoggable("MemorySizeCalculator", 3))
        {
            context = (new StringBuilder("Calculated memory cache size: ")).append(a(b)).append(" pool size: ").append(a(a)).append(" memory class limited? ");
            boolean flag1;
            if (k + j > i)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            context.append(flag1).append(" max size: ").append(a(i)).append(" memoryClass: ").append(activitymanager.getMemoryClass()).append(" isLowMemoryDevice: ").append(a(activitymanager));
        }
    }

    private String a(int i)
    {
        return Formatter.formatFileSize(c, i);
    }

    private static boolean a(ActivityManager activitymanager)
    {
        int i = android.os.Build.VERSION.SDK_INT;
        return i < 11 || i >= 19 && activitymanager.isLowRamDevice();
    }

    public final int a()
    {
        return b;
    }

    public final int b()
    {
        return a;
    }
}
