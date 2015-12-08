// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import android.content.Context;

// Referenced classes of package com.crashlytics.android:
//            aB, am

final class af
{

    private final Context a;
    private final am b;

    public af(Context context, am am1)
    {
        a = context;
        b = am1;
    }

    private String a(String s, String s1)
    {
        s = aB.a(a, s);
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
        return a("com.crashlytics.CrashSubmissionPromptTitle", b.b());
    }

    public final String b()
    {
        return a("com.crashlytics.CrashSubmissionPromptMessage", b.c());
    }

    public final String c()
    {
        return a("com.crashlytics.CrashSubmissionSendTitle", b.d());
    }

    public final String d()
    {
        return a("com.crashlytics.CrashSubmissionAlwaysSendTitle", b.h());
    }

    public final String e()
    {
        return a("com.crashlytics.CrashSubmissionCancelTitle", b.f());
    }
}
