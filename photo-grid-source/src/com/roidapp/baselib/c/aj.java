// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.c;

import android.app.Application;

public final class aj
{

    private static aj b;
    private final Application a;

    private aj(Application application)
    {
        a = application;
    }

    public static Application a()
    {
        if (b == null)
        {
            throw new NullPointerException("TheApplication not init yet.");
        } else
        {
            return b.a;
        }
    }

    public static void a(Application application)
    {
        if (b == null)
        {
            b = new aj(application);
        }
    }
}
