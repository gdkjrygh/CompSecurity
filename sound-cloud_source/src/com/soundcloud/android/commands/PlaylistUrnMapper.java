// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.commands;

import com.soundcloud.android.model.Urn;
import com.soundcloud.propeller.CursorReader;
import com.soundcloud.propeller.rx.RxResultMapper;

public final class PlaylistUrnMapper extends RxResultMapper
{

    public PlaylistUrnMapper()
    {
    }

    public final Urn map(CursorReader cursorreader)
    {
        return Urn.forPlaylist(cursorreader.getLong("_id"));
    }

    public final volatile Object map(CursorReader cursorreader)
    {
        return map(cursorreader);
    }
}
