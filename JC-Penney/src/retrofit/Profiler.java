// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package retrofit;


public interface Profiler
{

    public abstract void afterCall(RequestInformation requestinformation, long l, int i, Object obj);

    public abstract Object beforeCall();
}
