// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.analytics;

import android.content.Context;
import b.a.a.a.f;
import b.a.a.a.o;
import com.a.a.h;
import com.dominos.App;

public class CrashlyticsHandler
{

    private static final String CRASHLYTICS_KEY_DEBUGGABLE = "debuggable";

    private CrashlyticsHandler()
    {
    }

    public static void start(Context context)
    {
        f.a(context, new o[] {
            new h()
        });
        h.a("debuggable", App.isDebugMode());
    }
}
