// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.leanplum.messagetemplates;

import android.content.Context;
import com.leanplum.ActionArgs;
import com.leanplum.ActionContext;

public class WebInterstitialOptions
{

    private String a;
    private String b;
    private boolean c;

    protected WebInterstitialOptions(ActionContext actioncontext)
    {
        a = actioncontext.stringNamed("URL");
        c = actioncontext.booleanNamed("Has dismiss button");
        b = actioncontext.stringNamed("Close URL");
    }

    public static ActionArgs toArgs(Context context)
    {
        return (new ActionArgs()).with("URL", "http://www.example.com").with("Close URL", "http://leanplum:close").with("Has dismiss button", Boolean.valueOf(true));
    }

    public String getCloseUrl()
    {
        return b;
    }

    public String getUrl()
    {
        return a;
    }

    public boolean hasDismissButton()
    {
        return c;
    }
}
