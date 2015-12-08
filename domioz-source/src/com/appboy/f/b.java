// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.f;

import com.appboy.f;
import java.util.Random;

public final class b
{

    private static final String a;
    private static final Random b = new Random();

    public b()
    {
    }

    public static int a()
    {
        return b.nextInt();
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            f.a, com/appboy/f/b.getName()
        });
    }
}
