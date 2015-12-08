// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.init;

import java.util.concurrent.TimeUnit;

public class InitModule
{

    public InitModule()
    {
    }

    static Long getLessImportantTaskSleepMillis()
    {
        return Long.valueOf(TimeUnit.SECONDS.toMillis(30L));
    }
}
