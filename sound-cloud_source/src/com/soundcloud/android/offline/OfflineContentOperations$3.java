// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.offline;

import com.soundcloud.android.events.EntityStateChangedEvent;
import com.soundcloud.java.collections.PropertySet;
import rx.b.f;

final class 
    implements f
{

    public final Boolean call(EntityStateChangedEvent entitystatechangedevent)
    {
        return (Boolean)entitystatechangedevent.getNextChangeSet().getOrElse(OFFLINE_LIKES, Boolean.valueOf(false));
    }

    public final volatile Object call(Object obj)
    {
        return call((EntityStateChangedEvent)obj);
    }

    ()
    {
    }
}
