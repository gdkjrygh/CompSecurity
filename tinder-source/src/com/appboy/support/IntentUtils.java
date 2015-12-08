// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.support;

import java.util.Random;

public final class IntentUtils
{

    private static final Random a = new Random();

    public IntentUtils()
    {
    }

    public static int getRequestCode()
    {
        return a.nextInt();
    }

}
