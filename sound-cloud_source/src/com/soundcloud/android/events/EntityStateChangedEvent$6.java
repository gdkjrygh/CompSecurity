// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.events;

import com.soundcloud.android.playlists.PlaylistProperty;
import com.soundcloud.java.collections.PropertySet;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.events:
//            EntityStateChangedEvent

final class 
    implements f
{

    public final Boolean call(EntityStateChangedEvent entitystatechangedevent)
    {
        boolean flag;
        if (entitystatechangedevent.isPlaylistLike() && ((Boolean)entitystatechangedevent.getNextChangeSet().get(PlaylistProperty.IS_LIKED)).booleanValue())
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
