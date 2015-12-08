// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.internal.async;


public interface Dispatcher
{

    public abstract void invokeLater(Runnable runnable);

    public abstract void shutdown();
}
