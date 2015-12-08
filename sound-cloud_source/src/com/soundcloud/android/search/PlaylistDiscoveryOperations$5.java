// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.search;

import rx.b.a;

// Referenced classes of package com.soundcloud.android.search:
//            PlaylistDiscoveryOperations, PlaylistTagStorage

class val.tag
    implements a
{

    final PlaylistDiscoveryOperations this$0;
    final String val$tag;

    public void call()
    {
        PlaylistDiscoveryOperations.access$000(PlaylistDiscoveryOperations.this).addRecentTag(val$tag);
    }

    A()
    {
        this$0 = final_playlistdiscoveryoperations;
        val$tag = String.this;
        super();
    }
}
