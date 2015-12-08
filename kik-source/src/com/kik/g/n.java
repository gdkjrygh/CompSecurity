// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.g;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public final class n
{
    public static interface a
    {
    }


    private List a;
    private a b;
    private ScheduledExecutorService c;

    public n(a a1)
    {
        c = Executors.newSingleThreadScheduledExecutor();
        b = a1;
        a = new ArrayList();
    }
}
