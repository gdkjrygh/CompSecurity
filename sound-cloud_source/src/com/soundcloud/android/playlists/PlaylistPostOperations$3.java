// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import rx.b;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.playlists:
//            PlaylistPostOperations, PlaylistPostStorage

class this._cls0
    implements f
{

    final PlaylistPostOperations this$0;

    public volatile Object call(Object obj)
    {
        return call((Boolean)obj);
    }

    public b call(Boolean boolean1)
    {
        return PlaylistPostOperations.access$500(PlaylistPostOperations.this).loadPostedPlaylists(30, 0x7fffffffffffffffL).doOnNext(PlaylistPostOperations.access$400(PlaylistPostOperations.this)).subscribeOn(PlaylistPostOperations.access$300(PlaylistPostOperations.this));
    }

    ()
    {
        this$0 = PlaylistPostOperations.this;
        super();
    }
}
