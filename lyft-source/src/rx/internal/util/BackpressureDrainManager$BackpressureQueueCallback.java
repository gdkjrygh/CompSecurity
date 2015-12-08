// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.util;


public interface I
{

    public abstract boolean accept(Object obj);

    public abstract void complete(Throwable throwable);

    public abstract Object peek();

    public abstract Object poll();
}
