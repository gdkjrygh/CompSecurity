// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;

public class aw
{

    public aw()
    {
    }

    public SharedPreferences a(Context context)
    {
        return context.getSharedPreferences("google_ads_flags", 1);
    }
}
