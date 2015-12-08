// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import com.soundcloud.android.model.Urn;
import com.soundcloud.java.collections.Property;
import com.soundcloud.java.collections.PropertyBinding;
import com.soundcloud.java.collections.PropertySet;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.playlists:
//            PlaylistProperty, PlaylistOperations

class val.targetUrn
    implements f
{

    final PlaylistOperations this$0;
    final Urn val$targetUrn;

    public PropertySet call(Integer integer)
    {
        return PropertySet.from(new PropertyBinding[] {
            PlaylistProperty.URN.bind(val$targetUrn), PlaylistProperty.TRACK_COUNT.bind(integer)
        });
    }

    public volatile Object call(Object obj)
    {
        return call((Integer)obj);
    }

    ()
    {
        this$0 = final_playlistoperations;
        val$targetUrn = Urn.this;
        super();
    }
}
