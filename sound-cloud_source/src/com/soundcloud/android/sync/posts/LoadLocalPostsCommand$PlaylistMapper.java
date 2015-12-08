// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync.posts;

import com.soundcloud.android.model.PostProperty;
import com.soundcloud.android.model.Urn;
import com.soundcloud.java.collections.Property;
import com.soundcloud.java.collections.PropertyBinding;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.propeller.CursorReader;
import com.soundcloud.propeller.rx.RxResultMapper;
import java.util.Date;

// Referenced classes of package com.soundcloud.android.sync.posts:
//            LoadLocalPostsCommand

private static class <init> extends RxResultMapper
{

    private final boolean isPlaylist;

    private Urn getUrn(long l)
    {
        if (isPlaylist)
        {
            return Urn.forPlaylist(l);
        } else
        {
            return Urn.forTrack(l);
        }
    }

    public PropertySet map(CursorReader cursorreader)
    {
        return PropertySet.from(new PropertyBinding[] {
            PostProperty.TARGET_URN.bind(getUrn(cursorreader.getLong("target_id"))), PostProperty.CREATED_AT.bind(new Date(cursorreader.getLong("created_at"))), PostProperty.IS_REPOST.bind(Boolean.valueOf("repost".equals(cursorreader.getString("type"))))
        });
    }

    public volatile Object map(CursorReader cursorreader)
    {
        return map(cursorreader);
    }

    private (boolean flag)
    {
        isPlaylist = flag;
    }

    isPlaylist(boolean flag, isPlaylist isplaylist)
    {
        this(flag);
    }
}
