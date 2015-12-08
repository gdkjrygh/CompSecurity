// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.library.services;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

// Referenced classes of package com.aviary.android.feather.library.services:
//            BaseContextService, IAviaryController

public class ConfigService extends BaseContextService
{

    Resources d;

    public ConfigService(IAviaryController iaviarycontroller)
    {
        super(iaviarycontroller);
        d = iaviarycontroller.a().getResources();
    }

    public int a(int i)
    {
        return d.getInteger(i);
    }

    public void b()
    {
    }

    public int[] b(int i)
    {
        return d.getIntArray(i);
    }

    public int[] c(int i)
    {
        float f1 = d.getDisplayMetrics().density;
        int ai[] = b(i);
        if (ai != null)
        {
            for (i = 0; i < ai.length; i++)
            {
                ai[i] = (int)((float)ai[i] * f1);
            }

        }
        return ai;
    }

    public int d(int i)
    {
        return d.getColor(i);
    }

    public boolean e(int i)
    {
        return d.getBoolean(i);
    }

    public String f(int i)
    {
        return d.getString(i);
    }

    public int g(int i)
    {
        return d.getDimensionPixelSize(i);
    }

    public String[] h(int i)
    {
        return d.getStringArray(i);
    }
}
