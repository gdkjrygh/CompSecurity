// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.func.process;

import android.app.ActivityManager;
import android.content.Context;
import com.cleanmaster.util.o;
import com.picksinit.PicksMob;
import com.picksinit.b;
import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Method;

public class c
{

    private static long a = -1L;
    private static Method b = null;
    private static Method c = null;

    public static long a()
    {
label0:
        {
            long l;
label1:
            {
                Object obj = new o();
                ((o) (obj)).a();
                long l1 = ((o) (obj)).c() + ((o) (obj)).d();
                l = ((o) (obj)).b();
                if (0L < l && a < l && l < 0x1900000000L)
                {
                    a = ((o) (obj)).b();
                }
                if (l1 > 0L)
                {
                    l = l1;
                    if (a > l1)
                    {
                        break label1;
                    }
                }
                obj = a(PicksMob.getInstance().getContext());
                if (obj == null || 0L >= ((android.app.ActivityManager.MemoryInfo) (obj)).availMem || ((android.app.ActivityManager.MemoryInfo) (obj)).availMem >= a)
                {
                    break label0;
                }
                l = ((android.app.ActivityManager.MemoryInfo) (obj)).availMem;
            }
            return l;
        }
        return (long)((float)a * 0.15F);
    }

    private static android.app.ActivityManager.MemoryInfo a(Context context)
    {
        if (context == null)
        {
            return null;
        }
        android.app.ActivityManager.MemoryInfo memoryinfo = new android.app.ActivityManager.MemoryInfo();
        try
        {
            ((ActivityManager)context.getSystemService("activity")).getMemoryInfo(memoryinfo);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return memoryinfo;
        }
        return memoryinfo;
    }

    public static long b()
    {
        long l;
        try
        {
            BufferedReader bufferedreader = new BufferedReader(new FileReader("/proc/meminfo"), 8192);
            String s = bufferedreader.readLine();
            l = Integer.valueOf(s.substring(s.indexOf(":") + 1, s.indexOf("kB")).trim()).intValue();
            bufferedreader.close();
        }
        catch (Exception exception)
        {
            if (a < 0L)
            {
                return 1L;
            } else
            {
                return a;
            }
        }
        l = 1024L * l;
        if (0L >= l)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        if (a >= l || l >= 0x1900000000L)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        a = l;
        return l;
    }

}
