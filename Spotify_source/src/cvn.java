// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.Executor;

public final class cvn
{

    final Runnable a;
    final Executor b;
    cvn c;

    public cvn(Runnable runnable, Executor executor, cvn cvn1)
    {
        a = runnable;
        b = executor;
        c = cvn1;
    }
}
