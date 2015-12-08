// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import com.soundcloud.java.collections.PropertySet;
import java.util.List;
import rx.b.g;

// Referenced classes of package com.soundcloud.android.playlists:
//            PlaylistWithTracks, PlaylistOperations

class this._cls0
    implements g
{

    final PlaylistOperations this$0;

    public PlaylistWithTracks call(PropertySet propertyset, List list)
    {
        return new PlaylistWithTracks(propertyset, list);
    }

    public volatile Object call(Object obj, Object obj1)
    {
        return call((PropertySet)obj, (List)obj1);
    }

    ()
    {
        this$0 = PlaylistOperations.this;
        super();
    }
}
