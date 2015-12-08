// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;


interface 
{

    public abstract void complete();

    public abstract void error(Throwable throwable);

    public abstract void next(Object obj);

    public abstract void replay( );
}
