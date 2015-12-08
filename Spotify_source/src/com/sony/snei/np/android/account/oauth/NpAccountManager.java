// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sony.snei.np.android.account.oauth;

import android.content.Context;
import android.os.Handler;
import dal;
import dam;
import dap;
import dba;
import dbo;
import dbt;

public class NpAccountManager
{

    private static boolean b;
    public final dam a;

    private NpAccountManager(Context context, dam dam)
    {
        if (!b && context == null)
        {
            throw new AssertionError();
        } else
        {
            a = dam;
            return;
        }
    }

    public static NpAccountManager a(Context context, dal dal, Handler handler)
    {
        dbt.a(com/sony/snei/np/android/account/oauth/NpAccountManager.getSimpleName(), "buildType=%d, defaultNpenv=%s", new Object[] {
            Integer.valueOf(0), "np"
        });
        dbo.a();
        dal = new dba(dal, handler);
        new dap();
        return new NpAccountManager(context, dap.a(context, dal));
    }

    static 
    {
        boolean flag;
        if (!com/sony/snei/np/android/account/oauth/NpAccountManager.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b = flag;
    }
}
