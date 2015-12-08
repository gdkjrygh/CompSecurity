// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public abstract class zzk
{

    private static final ExecutorService zzaay = Executors.newFixedThreadPool(2);

    public static ExecutorService zznF()
    {
        return zzaay;
    }

}
