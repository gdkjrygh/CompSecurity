// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.support;

import com.appboy.Constants;
import java.util.Random;

public final class IntentUtils
{

    private static final String a;
    private static final Random b = new Random();

    public IntentUtils()
    {
    }

    public static int getRequestCode()
    {
        return b.nextInt();
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            Constants.APPBOY_LOG_TAG_PREFIX, com/appboy/support/IntentUtils.getName()
        });
    }
}
