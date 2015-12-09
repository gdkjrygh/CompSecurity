// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import android.content.Context;
import com.crashlytics.android.internal.ap;
import com.crashlytics.android.internal.ba;

final class ab
{

    private final Context a;
    private final ap b;

    public ab(Context context, ap ap1)
    {
        a = context;
        b = ap1;
    }

    private String a(String s, String s1)
    {
        s = ba.a(a, s);
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

    public final String a()
    {
        return a("com.crashlytics.CrashSubmissionPromptTitle", b.a);
    }

    public final String b()
    {
        return a("com.crashlytics.CrashSubmissionPromptMessage", b.b);
    }

    public final String c()
    {
        return a("com.crashlytics.CrashSubmissionSendTitle", b.c);
    }

    public final String d()
    {
        return a("com.crashlytics.CrashSubmissionAlwaysSendTitle", b.g);
    }

    public final String e()
    {
        return a("com.crashlytics.CrashSubmissionCancelTitle", b.e);
    }
}
