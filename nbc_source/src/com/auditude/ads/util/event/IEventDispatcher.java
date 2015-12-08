// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.util.event;


// Referenced classes of package com.auditude.ads.util.event:
//            IEventListener

public interface IEventDispatcher
{

    public abstract void addEventListener(String s, IEventListener ieventlistener);

    public abstract void addEventListener(String s, IEventListener ieventlistener, int i);

    public abstract void dispatchEvent(String s, Object obj);

    public abstract Boolean hasEventListener(String s);

    public abstract void removeEventListener(String s, IEventListener ieventlistener);
}
