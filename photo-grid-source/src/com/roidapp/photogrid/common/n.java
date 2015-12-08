// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.common;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import com.roidapp.baselib.c.aj;

public final class n
{

    private static n a;

    private n()
    {
    }

    private static int a(Context context, String s, String s1)
    {
        context = context.getPackageManager();
        String s2 = aj.a().getPackageName();
        int i;
        try
        {
            i = context.getResourcesForApplication(s2).getIdentifier(s, s1, s2);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            return -1;
        }
        return i;
    }

    private static int a(String s)
    {
        return a(((Context) (aj.a())), s, "drawable");
    }

    public static int[] a()
    {
        int ai[] = new int[46];
        for (int i = 0; i < 46; i++)
        {
            ai[i] = a((new StringBuilder("emoji_")).append(i + 1).toString());
        }

        return ai;
    }

    public static int[] b()
    {
        int ai[] = new int[36];
        for (int i = 0; i < 36; i++)
        {
            ai[i] = a((new StringBuilder("deco_2_")).append(i + 1).toString());
        }

        return ai;
    }

    public static n c()
    {
        com/roidapp/photogrid/common/n;
        JVM INSTR monitorenter ;
        n n1;
        if (a == null)
        {
            a = new n();
        }
        n1 = a;
        com/roidapp/photogrid/common/n;
        JVM INSTR monitorexit ;
        return n1;
        Exception exception;
        exception;
        throw exception;
    }

    public static void d()
    {
        com/roidapp/photogrid/common/n;
        JVM INSTR monitorenter ;
        a = null;
        com/roidapp/photogrid/common/n;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }
}
