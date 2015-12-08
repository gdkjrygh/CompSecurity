// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import com.soundcloud.android.sync.SyncInitiator;
import com.soundcloud.android.utils.NetworkConnectionHelper;
import java.util.List;
import rx.b.b;

// Referenced classes of package com.soundcloud.android.playlists:
//            PlaylistPostOperations

class this._cls0
    implements b
{

    final PlaylistPostOperations this$0;

    public volatile void call(Object obj)
    {
        call((List)obj);
    }

    public void call(List list)
    {
        if (PlaylistPostOperations.access$100(PlaylistPostOperations.this).isWifiConnected() && !list.isEmpty())
        {
            PlaylistPostOperations.access$200(PlaylistPostOperations.this).requestPlaylistSync(list);
        }
    }

    ()
    {
        this$0 = PlaylistPostOperations.this;
        super();
    }
}
