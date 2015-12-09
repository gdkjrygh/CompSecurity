// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.util;

import android.content.Intent;
import android.text.TextUtils;
import com.crittercism.app.Crittercism;
import com.jcp.h.e;

public final class ab
{

    private static String a = null;
    private static final String b = com/jcp/util/ab.getName();

    private ab()
    {
    }

    public static Intent a(String s)
    {
        Intent intent = new Intent();
        intent.putExtra("startProductDetails", true);
        intent.putExtra("PPID", s);
        return intent;
    }

    public static void a(String s, String s1)
    {
        a = s;
        Crittercism.c(s);
        if (!TextUtils.isEmpty(s1))
        {
            Crittercism.b(s1);
        }
    }

    public static void a(boolean flag)
    {
        a(flag, null);
    }

    public static void a(boolean flag, String s)
    {
        if (!TextUtils.isEmpty(a))
        {
            if (!TextUtils.isEmpty(s))
            {
                Crittercism.b(s);
            }
            if (flag)
            {
                Crittercism.e(a);
            } else
            {
                Crittercism.d(a);
            }
            if (flag)
            {
                s = "scan failure";
            } else
            {
                s = "scan";
            }
            e.a(a, "picture", s);
        }
        a = null;
    }

    public static void b(String s)
    {
        a(s, null);
    }

}
