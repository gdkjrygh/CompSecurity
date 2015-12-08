// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util;

import android.os.Build;
import com.fitbit.util.b.a;

public class af
{

    public af()
    {
    }

    public static boolean a()
    {
        return "Amazon".equalsIgnoreCase(Build.MANUFACTURER) && "Kindle Fire".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean b()
    {
        return com.fitbit.util.b.a.a(14) && !com.fitbit.util.b.a.a(18) && Build.MANUFACTURER.compareToIgnoreCase("LGE") == 0;
    }
}
