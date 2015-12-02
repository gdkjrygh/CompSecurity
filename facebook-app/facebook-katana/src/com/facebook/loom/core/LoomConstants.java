// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.loom.core;

import com.facebook.prefs.shared.PrefKey;
import com.facebook.prefs.shared.SharedPrefKeys;

public final class LoomConstants
{

    public static final PrefKey a;
    public static final PrefKey b;
    private static final PrefKey c;

    public LoomConstants()
    {
    }

    static 
    {
        PrefKey prefkey = (PrefKey)SharedPrefKeys.c.b("loom/");
        c = prefkey;
        a = (PrefKey)prefkey.b("manual_tracing");
        b = (PrefKey)c.b("manual_filter_enabled");
    }
}
