// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.util.unsafe;


interface MessagePassingQueue
{

    public abstract boolean isEmpty();

    public abstract boolean offer(Object obj);

    public abstract Object peek();

    public abstract Object poll();

    public abstract int size();
}
