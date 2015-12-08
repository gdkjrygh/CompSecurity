// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.internal;


public final class au extends Enum
{

    public static final au a;
    public static final au b;
    public static final au c;
    private static final au d[];

    private au(String s, int i)
    {
        super(s, i);
    }

    public static au valueOf(String s)
    {
        return (au)Enum.valueOf(com/crashlytics/android/internal/au, s);
    }

    public static au[] values()
    {
        return (au[])d.clone();
    }

    static 
    {
        a = new au("USE_CACHE", 0);
        b = new au("SKIP_CACHE_LOOKUP", 1);
        c = new au("IGNORE_CACHE_EXPIRATION", 2);
        d = (new au[] {
            a, b, c
        });
    }
}
