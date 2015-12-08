// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import com.google.android.gms.common.GoogleApiAvailability;

public class zze
{

    public static final String a;
    public static final String b;

    static 
    {
        a = String.valueOf(GoogleApiAvailability.a / 1000).replaceAll("(\\d+)(\\d)(\\d\\d)", "$1.$2.$3");
        b = (new StringBuilder()).append("ma").append(a).toString();
    }
}
