// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ar;

import android.content.res.Resources;

public final class a
{

    public static boolean a(Resources resources)
    {
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            return false;
        } else
        {
            return resources.getBoolean(com.google.android.m4b.maps.h.b.maps_is_tablet);
        }
    }
}
