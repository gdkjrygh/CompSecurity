// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.events;

import com.soundcloud.java.collections.PropertySet;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.events:
//            EntityStateChangedEvent

final class 
    implements f
{

    public final PropertySet call(EntityStateChangedEvent entitystatechangedevent)
    {
        return entitystatechangedevent.getNextChangeSet();
    }

    public final volatile Object call(Object obj)
    {
        return call((EntityStateChangedEvent)obj);
    }

    ()
    {
    }
}
