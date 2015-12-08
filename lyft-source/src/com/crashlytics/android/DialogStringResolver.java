// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import android.content.Context;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.settings.PromptSettingsData;

class DialogStringResolver
{

    private final Context a;
    private final PromptSettingsData b;

    public DialogStringResolver(Context context, PromptSettingsData promptsettingsdata)
    {
        a = context;
        b = promptsettingsdata;
    }

    private String a(String s, String s1)
    {
        return b(CommonUtils.b(a, s), s1);
    }

    private boolean a(String s)
    {
        return s == null || s.length() == 0;
    }

    private String b(String s, String s1)
    {
        if (a(s))
        {
            return s1;
        } else
        {
            return s;
        }
    }

    public String a()
    {
        return a("com.crashlytics.CrashSubmissionPromptTitle", b.a);
    }

    public String b()
    {
        return a("com.crashlytics.CrashSubmissionPromptMessage", b.b);
    }

    public String c()
    {
        return a("com.crashlytics.CrashSubmissionSendTitle", b.c);
    }

    public String d()
    {
        return a("com.crashlytics.CrashSubmissionAlwaysSendTitle", b.g);
    }

    public String e()
    {
        return a("com.crashlytics.CrashSubmissionCancelTitle", b.e);
    }
}
