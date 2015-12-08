// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.util;

import java.util.Random;

public final class al
{

    private static final Random a = new Random();
    private static final int b[] = {
        0x7f020026, 0x7f020131, 0x7f0201f6, 0x7f020204
    };

    public static int a()
    {
        return b[a.nextInt(b.length)];
    }

}
