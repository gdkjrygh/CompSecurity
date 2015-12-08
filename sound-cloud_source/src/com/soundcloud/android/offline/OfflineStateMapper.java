// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.offline;

import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.propeller.CursorReader;
import com.soundcloud.propeller.rx.RxResultMapper;
import com.soundcloud.propeller.schema.Column;
import java.util.Date;

// Referenced classes of package com.soundcloud.android.offline:
//            OfflineProperty, OfflineState

public class OfflineStateMapper extends RxResultMapper
{

    public OfflineStateMapper()
    {
    }

    private PropertySet addOptionalOfflineSyncDates(CursorReader cursorreader)
    {
        Date date3 = new Date(0L);
        Date date = getDateOr(cursorreader, com.soundcloud.android.storage.Tables.TrackDownloads.REQUESTED_AT, date3);
        Date date1 = getDateOr(cursorreader, com.soundcloud.android.storage.Tables.TrackDownloads.REMOVED_AT, date3);
        Date date2 = getDateOr(cursorreader, com.soundcloud.android.storage.Tables.TrackDownloads.DOWNLOADED_AT, date3);
        date3 = getDateOr(cursorreader, com.soundcloud.android.storage.Tables.TrackDownloads.UNAVAILABLE_AT, date3);
        boolean flag = cursorreader.isNotNull(com.soundcloud.android.storage.Tables.OfflineContent._ID);
        cursorreader = PropertySet.create(1);
        if (isMostRecentDate(date, new Date[] {
    date1, date2, date3
}))
        {
            cursorreader.put(OfflineProperty.OFFLINE_STATE, OfflineState.REQUESTED);
        } else
        {
            if (isMostRecentDate(date1, new Date[] {
    date, date2, date3
}))
            {
                cursorreader.put(OfflineProperty.OFFLINE_STATE, OfflineState.NO_OFFLINE);
                return cursorreader;
            }
            if (isMostRecentDate(date2, new Date[] {
    date, date1, date3
}))
            {
                cursorreader.put(OfflineProperty.OFFLINE_STATE, OfflineState.DOWNLOADED);
                return cursorreader;
            }
            if (flag && isMostRecentDate(date3, new Date[] {
    date, date1, date2
}))
            {
                cursorreader.put(OfflineProperty.OFFLINE_STATE, OfflineState.UNAVAILABLE);
                return cursorreader;
            }
        }
        return cursorreader;
    }

    private Date getDateOr(CursorReader cursorreader, Column column, Date date)
    {
        if (cursorreader.isNotNull(column))
        {
            date = cursorreader.getDateFromTimestamp(column);
        }
        return date;
    }

    private transient boolean isMostRecentDate(Date date, Date adate[])
    {
        int j = adate.length;
        for (int i = 0; i < j; i++)
        {
            Date date1 = adate[i];
            if (date1.after(date) || date1.equals(date))
            {
                return false;
            }
        }

        return true;
    }

    public PropertySet map(CursorReader cursorreader)
    {
        return addOptionalOfflineSyncDates(cursorreader);
    }

    public volatile Object map(CursorReader cursorreader)
    {
        return map(cursorreader);
    }
}
