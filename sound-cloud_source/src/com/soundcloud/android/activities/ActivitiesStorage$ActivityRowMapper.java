// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.activities;

import com.soundcloud.android.model.Urn;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.propeller.CursorReader;
import com.soundcloud.propeller.rx.RxResultMapper;

// Referenced classes of package com.soundcloud.android.activities:
//            ActivitiesStorage, ActivityProperty, ActivityKind

private static class <init> extends RxResultMapper
{

    public PropertySet map(CursorReader cursorreader)
    {
        PropertySet propertyset = PropertySet.create(cursorreader.getRowCount());
        propertyset.put(ActivityProperty.KIND, ActivityKind.fromIdentifier(cursorreader.getString("type")));
        propertyset.put(ActivityProperty.DATE, cursorreader.getDateFromTimestamp("created_at"));
        propertyset.put(ActivityProperty.USER_URN, Urn.forUser(cursorreader.getLong("user_id")));
        propertyset.put(ActivityProperty.USER_NAME, cursorreader.getString("activity_user_username"));
        if (cursorreader.isNotNull("sound_id"))
        {
            propertyset.put(ActivityProperty.PLAYABLE_TITLE, cursorreader.getString("title"));
        }
        return propertyset;
    }

    public volatile Object map(CursorReader cursorreader)
    {
        return map(cursorreader);
    }

    private ()
    {
    }

    ( )
    {
        this();
    }
}
