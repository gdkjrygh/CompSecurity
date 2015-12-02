// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.tools.dextr.bridge.constants;

import com.facebook.prefs.shared.PrefKey;
import com.facebook.prefs.shared.SharedPrefKeys;

public class DextrConstants
{

    public static final PrefKey a;
    public static final PrefKey b;
    public static String c = "d7f6e308-25a6-410f-9b42-47425f26a588";
    private static final PrefKey d;

    public DextrConstants()
    {
    }

    static 
    {
        PrefKey prefkey = (PrefKey)SharedPrefKeys.c.b("dextr/");
        d = prefkey;
        a = (PrefKey)prefkey.b("remaining_bytes");
        b = (PrefKey)d.b("last_remaining_bytes_update_time");
    }
}
