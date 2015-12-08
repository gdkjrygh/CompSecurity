// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.broker;

import android.content.ContentValues;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.TransientDataHolder;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

// Referenced classes of package com.google.android.gms.games.broker:
//            RealTimeAgent

private static final class updateRoomValues
{

    private TransientDataHolder mRoomDataHolder;
    Map mRoomDataValues;
    final String mRoomId;

    final DataHolder getRoomData()
    {
        if (mRoomDataHolder.getCount() == 0)
        {
            return DataHolder.empty(1);
        } else
        {
            return mRoomDataHolder.build(0);
        }
    }

    final boolean isRoomCached(String s)
    {
        return mRoomId.equals(s);
    }

    final void updateRoomValues(Map map)
    {
        mRoomDataValues = map;
        mRoomDataHolder = new TransientDataHolder(RealTimeAgent.access$000(), null, null, null);
        if (mRoomDataValues != null)
        {
            ContentValues contentvalues;
            for (map = mRoomDataValues.values().iterator(); map.hasNext(); mRoomDataHolder.addRow(contentvalues))
            {
                contentvalues = (ContentValues)map.next();
            }

        }
    }

    A(String s, Map map)
    {
        mRoomId = s;
        updateRoomValues(map);
    }
}
