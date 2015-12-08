// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.analytics;

import android.content.ContentValues;
import com.soundcloud.android.utils.NetworkConnectionHelper;
import com.soundcloud.java.collections.Lists;
import com.soundcloud.propeller.ChangeResult;
import com.soundcloud.propeller.InsertResult;
import com.soundcloud.propeller.PropellerDatabase;
import com.soundcloud.propeller.QueryResult;
import com.soundcloud.propeller.query.Filter;
import com.soundcloud.propeller.query.Query;
import com.soundcloud.propeller.schema.Table;
import java.io.UnsupportedEncodingException;
import java.util.List;

// Referenced classes of package com.soundcloud.android.analytics:
//            TrackingRecord, TrackingDbHelper

class TrackingStorage
{

    static final int FIXED_BATCH_SIZE = 30;
    private final NetworkConnectionHelper networkConnectionHelper;
    private final PropellerDatabase propeller;

    TrackingStorage(PropellerDatabase propellerdatabase, NetworkConnectionHelper networkconnectionhelper)
    {
        propeller = propellerdatabase;
        networkConnectionHelper = networkconnectionhelper;
    }

    private ContentValues createValuesFromEvent(TrackingRecord trackingrecord)
        throws UnsupportedEncodingException
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("backend", trackingrecord.getBackend());
        contentvalues.put("timestamp", Long.valueOf(trackingrecord.getTimeStamp()));
        contentvalues.put("data", trackingrecord.getData());
        return contentvalues;
    }

    private List getPendingEvents(String s)
    {
        Query query = Query.from(new String[] {
            TrackingDbHelper.EVENTS_TABLE.name()
        });
        if (s != null)
        {
            query.whereEq("backend", s);
        }
        if (!networkConnectionHelper.isWifiConnected())
        {
            query.limit(30);
        }
        return propeller.query(query).toList(new _cls1());
    }

    ChangeResult deleteEvents(List list)
    {
        list = Lists.transform(list, new _cls2());
        int i = 0;
        Object obj;
        int j;
        do
        {
            obj = list.subList(i, Math.min(i + 30, list.size()));
            obj = Filter.filter().whereIn("_id", ((List) (obj)));
            obj = propeller.delete(TrackingDbHelper.EVENTS_TABLE, ((com.soundcloud.propeller.query.Where) (obj)));
            j = i + 30;
            if (j >= list.size())
            {
                break;
            }
            i = j;
        } while (((ChangeResult) (obj)).success());
        if (((ChangeResult) (obj)).success())
        {
            return new ChangeResult(list.size());
        } else
        {
            return (ChangeResult)(new ChangeResult(j - 30)).fail(((ChangeResult) (obj)).getFailure());
        }
    }

    List getPendingEvents()
    {
        return getPendingEvents(null);
    }

    List getPendingEventsForBackend(String s)
    {
        return getPendingEvents(s);
    }

    InsertResult insertEvent(TrackingRecord trackingrecord)
        throws UnsupportedEncodingException
    {
        return propeller.insert(TrackingDbHelper.EVENTS_TABLE, createValuesFromEvent(trackingrecord), 4);
    }

    private class _cls1
        implements ResultMapper
    {

        final TrackingStorage this$0;

        public TrackingRecord map(CursorReader cursorreader)
        {
            return new TrackingRecord(cursorreader.getInt("_id"), cursorreader.getLong("timestamp"), cursorreader.getString("backend"), cursorreader.getString("data"));
        }

        public volatile Object map(CursorReader cursorreader)
        {
            return map(cursorreader);
        }

        _cls1()
        {
            this$0 = TrackingStorage.this;
            super();
        }
    }


    private class _cls2
        implements Function
    {

        final TrackingStorage this$0;

        public volatile Object apply(Object obj)
        {
            return apply((TrackingRecord)obj);
        }

        public String apply(TrackingRecord trackingrecord)
        {
            return Long.toString(trackingrecord.getId());
        }

        _cls2()
        {
            this$0 = TrackingStorage.this;
            super();
        }
    }

}
