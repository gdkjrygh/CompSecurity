// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.commands;

import com.soundcloud.android.model.Urn;
import com.soundcloud.propeller.CursorReader;
import com.soundcloud.propeller.rx.RxResultMapper;

public final class TrackUrnMapper extends RxResultMapper
{

    public TrackUrnMapper()
    {
    }

    public final Urn map(CursorReader cursorreader)
    {
        return Urn.forTrack(cursorreader.getLong("_id"));
    }

    public final volatile Object map(CursorReader cursorreader)
    {
        return map(cursorreader);
    }
}
