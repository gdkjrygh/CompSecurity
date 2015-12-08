// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.j;

import android.content.SharedPreferences;
import com.kik.c.a;
import com.kik.c.b;
import com.mixpanel.android.mpmetrics.v;
import kik.a.e.f;
import kik.a.e.w;
import kik.a.j.m;
import kik.android.chat.KikApplication;

public final class o
{

    private final com.kik.android.a a;
    private final b b;

    public o(v v, m m, f f, kik.a.e.v v1, w w, SharedPreferences sharedpreferences, KikApplication kikapplication)
    {
        b = new b(new a(kikapplication, v1), kikapplication.getDir("augmentum-metrics", 0));
        a = new com.kik.android.a(v, m, f, v1, w, sharedpreferences, b);
    }

    final com.kik.android.a a()
    {
        return a;
    }
}
