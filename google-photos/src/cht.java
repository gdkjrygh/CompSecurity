// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.Callable;

final class cht
    implements Callable
{

    private Runnable a;

    cht(chq chq, Runnable runnable)
    {
        a = runnable;
        super();
    }

    public final Object call()
    {
        a.run();
        return null;
    }
}
