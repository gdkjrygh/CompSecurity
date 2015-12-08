// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.Executor;

interface anP
    extends Executor
{

    public abstract void a(Runnable runnable);

    public abstract void execute(Runnable runnable);
}
