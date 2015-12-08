// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.likes;

import com.soundcloud.android.likes.LikeProperty;
import com.soundcloud.android.model.Urn;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.propeller.CursorReader;
import com.soundcloud.propeller.rx.RxResultMapper;

class LikeMapper extends RxResultMapper
{

    LikeMapper()
    {
    }

    public PropertySet map(CursorReader cursorreader)
    {
        PropertySet propertyset = PropertySet.create(cursorreader.getColumnCount());
        if (cursorreader.getInt("_type") != 0) goto _L2; else goto _L1
_L1:
        propertyset.put(LikeProperty.TARGET_URN, Urn.forTrack(cursorreader.getLong("_id")));
_L4:
        propertyset.put(LikeProperty.CREATED_AT, cursorreader.getDateFromTimestamp("created_at"));
        if (cursorreader.isNotNull("added_at"))
        {
            propertyset.put(LikeProperty.ADDED_AT, cursorreader.getDateFromTimestamp("added_at"));
        }
        if (cursorreader.isNotNull("removed_at"))
        {
            propertyset.put(LikeProperty.REMOVED_AT, cursorreader.getDateFromTimestamp("removed_at"));
        }
        return propertyset;
_L2:
        if (cursorreader.getInt("_type") == 1)
        {
            propertyset.put(LikeProperty.TARGET_URN, Urn.forPlaylist(cursorreader.getLong("_id")));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public volatile Object map(CursorReader cursorreader)
    {
        return map(cursorreader);
    }
}
