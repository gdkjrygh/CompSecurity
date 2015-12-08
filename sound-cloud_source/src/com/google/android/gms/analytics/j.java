// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import com.google.android.gms.analytics.internal.f;

public final class j
{

    static String a(String s, int i)
    {
        if (i <= 0)
        {
            f.a("index out of range for prefix", s);
            return "";
        } else
        {
            return (new StringBuilder()).append(s).append(i).toString();
        }
    }
}
