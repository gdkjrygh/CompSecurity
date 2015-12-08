// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.ActivityManager;
import android.content.Context;
import android.text.format.Formatter;
import android.util.Log;

public final class ars
{

    public final int a;
    public final int b;
    public final int c;
    private final Context d;

    ars(Context context, ActivityManager activitymanager, aru aru1, float f, float f1, int i, float f2, 
            float f3)
    {
        d = context;
        int j = i;
        if (a(activitymanager))
        {
            j = i / 2;
        }
        c = j;
        i = activitymanager.getMemoryClass();
        boolean flag = a(activitymanager);
        float f4 = i << 10 << 10;
        int k;
        int l;
        if (!flag)
        {
            f3 = f2;
        }
        i = Math.round(f4 * f3);
        k = aru1.a() * aru1.b() << 2;
        j = Math.round((float)k * f1);
        k = Math.round((float)k * f);
        l = i - c;
        if (k + j <= l)
        {
            b = k;
            a = j;
        } else
        {
            f2 = (float)l / (f1 + f);
            b = Math.round(f2 * f);
            a = Math.round(f2 * f1);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3))
        {
            context = String.valueOf("Calculation complete, Calculated memory cache size: ");
            aru1 = String.valueOf(a(b));
            String s = String.valueOf(a(a));
            String s1 = String.valueOf(a(c));
            String s2;
            boolean flag1;
            boolean flag2;
            if (k + j > i)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            s2 = String.valueOf(a(i));
            i = activitymanager.getMemoryClass();
            flag2 = a(activitymanager);
            (new StringBuilder(String.valueOf(context).length() + 125 + String.valueOf(aru1).length() + String.valueOf(s).length() + String.valueOf(s1).length() + String.valueOf(s2).length())).append(context).append(aru1).append(", pool size: ").append(s).append(", byte array size: ").append(s1).append(", memory class limited? ").append(flag1).append(", max size: ").append(s2).append(", memoryClass: ").append(i).append(", isLowMemoryDevice: ").append(flag2);
        }
    }

    private String a(int i)
    {
        return Formatter.formatFileSize(d, i);
    }

    private static boolean a(ActivityManager activitymanager)
    {
        int i = android.os.Build.VERSION.SDK_INT;
        return i < 11 || i >= 19 && activitymanager.isLowRamDevice();
    }
}
