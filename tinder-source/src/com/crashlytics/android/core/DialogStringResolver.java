// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core;

import android.content.Context;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.settings.o;

class DialogStringResolver
{

    final o a;
    private final Context b;

    public DialogStringResolver(Context context, o o)
    {
        b = context;
        a = o;
    }

    final String a(String s, String s1)
    {
        s = CommonUtils.d(b, s);
        boolean flag;
        if (s == null || s.length() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            return s1;
        } else
        {
            return s;
        }
    }
}
