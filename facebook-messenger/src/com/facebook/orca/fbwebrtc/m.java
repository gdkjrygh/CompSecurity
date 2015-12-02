// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.fbwebrtc;

import com.facebook.appconfig.AppConfig;
import com.facebook.appconfig.b;
import com.facebook.common.bundle.ImmutableBundle;
import com.facebook.common.w.t;

public class m
{

    private final b a;

    public m(b b1)
    {
        a = b1;
    }

    public int a()
    {
        AppConfig appconfig = a.a();
        if (appconfig == null)
        {
            return 0;
        } else
        {
            return t.a(appconfig.a().a("min_webrtc_version"), 0);
        }
    }

    public double b()
    {
        AppConfig appconfig = a.a();
        if (appconfig == null)
        {
            return 0.0D;
        } else
        {
            return t.a(appconfig.a().a("webrtc_survey_pct"), 0.0D);
        }
    }
}
