// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.analytics.tracking.android;

import java.util.Random;

final class b
{

    private static final b c = new b();
    int a;
    Random b;

    private b()
    {
        b = new Random();
    }

    static b a()
    {
        return c;
    }

}
