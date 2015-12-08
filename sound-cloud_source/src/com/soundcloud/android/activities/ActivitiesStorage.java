// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.activities;

import com.soundcloud.android.model.Urn;
import com.soundcloud.android.sync.timeline.TimelineStorage;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.propeller.CursorReader;
import com.soundcloud.propeller.query.Query;
import com.soundcloud.propeller.rx.PropellerRx;
import com.soundcloud.propeller.rx.RxResultMapper;
import com.soundcloud.propeller.schema.Table;
import rx.b;

// Referenced classes of package com.soundcloud.android.activities:
//            ActivityProperty, ActivityKind

class ActivitiesStorage
    implements TimelineStorage
{
    private static class ActivityRowMapper extends RxResultMapper
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

        private ActivityRowMapper()
        {
        }

        ActivityRowMapper(_cls1 _pcls1)
        {
            this();
        }
    }


    private final PropellerRx propellerRx;

    public ActivitiesStorage(PropellerRx propellerrx)
    {
        propellerRx = propellerrx;
    }

    public b timelineItems(int i)
    {
        Query query = Query.from(new Table[] {
            com.soundcloud.android.storage.Table.ActivityView
        }).order("created_at", com.soundcloud.propeller.query.Query.Order.DESC).limit(i);
        return propellerRx.query(query).map(new ActivityRowMapper(null));
    }

    public b timelineItemsBefore(long l, int i)
    {
        Query query = ((Query)Query.from(new Table[] {
            com.soundcloud.android.storage.Table.ActivityView
        }).whereLt("created_at", Long.valueOf(l))).order("created_at", com.soundcloud.propeller.query.Query.Order.DESC).limit(i);
        return propellerRx.query(query).map(new ActivityRowMapper(null));
    }
}
