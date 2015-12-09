// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public abstract class cmr
{

    private static final ExecutorService a = Executors.newFixedThreadPool(2, new cms((byte)0));

    public static ExecutorService a()
    {
        return a;
    }

}
