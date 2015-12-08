// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import com.soundcloud.propeller.CursorReader;
import com.soundcloud.propeller.rx.RxResultMapper;

// Referenced classes of package com.soundcloud.android.playlists:
//            AddTrackToPlaylistCommand, PlaylistMapper

private static final class <init> extends RxResultMapper
{

    public final Integer map(CursorReader cursorreader)
    {
        return Integer.valueOf(PlaylistMapper.readTrackCount(cursorreader));
    }

    public final volatile Object map(CursorReader cursorreader)
    {
        return map(cursorreader);
    }

    private Q()
    {
    }

    Q(Q q)
    {
        this();
    }
}
