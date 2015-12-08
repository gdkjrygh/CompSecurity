// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.events;

import com.soundcloud.android.model.Urn;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.events:
//            EntityStateChangedEvent

final class 
    implements f
{

    public final Boolean call(EntityStateChangedEvent entitystatechangedevent)
    {
        boolean flag;
        if (entitystatechangedevent.isSingularChange() && entitystatechangedevent.getFirstUrn().isPlaylist() && entitystatechangedevent.getKind() == 4)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return Boolean.valueOf(flag);
    }

    public final volatile Object call(Object obj)
    {
        return call((EntityStateChangedEvent)obj);
    }

    ()
    {
    }
}
