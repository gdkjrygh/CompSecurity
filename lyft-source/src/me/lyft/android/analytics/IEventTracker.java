// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.analytics;


// Referenced classes of package me.lyft.android.analytics:
//            IEvent

public interface IEventTracker
{

    public abstract void flush();

    public abstract void track(IEvent ievent);
}
