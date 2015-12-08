// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.a;

import a.a.a.a.a.f.c;
import android.content.SharedPreferences;

final class j
{

    private final c a;

    public j(c c1)
    {
        a = c1;
    }

    public final void a()
    {
        a.a(a.b().putBoolean("analytics_launched", true));
    }

    public final boolean b()
    {
        return a.a().getBoolean("analytics_launched", false);
    }
}
