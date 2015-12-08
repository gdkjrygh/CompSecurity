// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.profile;

import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.propeller.CursorReader;
import com.soundcloud.propeller.rx.RxResultMapper;

// Referenced classes of package com.soundcloud.android.profile:
//            PostsStorage

private static class <init> extends RxResultMapper
{

    private stMapper playlistMapper;
    private Mapper postedTracksMapper;

    public PropertySet map(CursorReader cursorreader)
    {
        if (cursorreader.getInt("_type") == 0)
        {
            return postedTracksMapper.map(cursorreader);
        } else
        {
            return playlistMapper.map(cursorreader);
        }
    }

    public volatile Object map(CursorReader cursorreader)
    {
        return map(cursorreader);
    }

    private Mapper()
    {
        playlistMapper = new stMapper(null);
        postedTracksMapper = new Mapper(null);
    }

    Mapper(Mapper mapper)
    {
        this();
    }
}
