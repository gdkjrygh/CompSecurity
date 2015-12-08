// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.functionevent.report;

import android.os.Build;
import android.text.TextUtils;
import com.cleanmaster.util.r;

public abstract class a
{

    public static int a(long l)
    {
        return Math.round((float)l / 1048576F);
    }

    public static String a(String s, String s1)
    {
        String s2 = r.a(s);
        s = s2;
        if (TextUtils.isEmpty(s2))
        {
            s = Build.MODEL;
        }
        if (!TextUtils.isEmpty(s))
        {
            return s;
        } else
        {
            return s1;
        }
    }
}
