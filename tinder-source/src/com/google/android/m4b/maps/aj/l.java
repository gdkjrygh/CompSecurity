// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aj;

import java.util.concurrent.Future;

public final class l
{

    public static Object a(Future future)
    {
        boolean flag = false;
_L2:
        Object obj = future.get();
        if (flag)
        {
            Thread.currentThread().interrupt();
        }
        return obj;
        InterruptedException interruptedexception;
        interruptedexception;
        flag = true;
        if (true) goto _L2; else goto _L1
_L1:
        future;
        if (flag)
        {
            Thread.currentThread().interrupt();
        }
        throw future;
    }
}
