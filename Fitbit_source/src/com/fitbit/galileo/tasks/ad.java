// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.galileo.tasks;

import android.bluetooth.BluetoothDevice;
import com.fitbit.galileo.GalileoTracker;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.fitbit.galileo.tasks:
//            aa

public class ad extends aa
{

    private static final String c = "SearchTrackerByRssiTask";

    public ad(List list, String s, SearchMultipleTrackersTask.ScanDuration scanduration)
    {
        super(list, s, SearchMultipleTrackersTask.ScanDuration.a);
    }

    private boolean a(GalileoTracker galileotracker, GalileoTracker galileotracker1)
    {
        return galileotracker.b() > galileotracker1.b();
    }

    protected BluetoothDevice b(Map map)
    {
        if (map != null && !map.isEmpty())
        {
            map = new ArrayList(map.values());
            if (map.size() == 1)
            {
                return ((GalileoTracker)map.get(0)).a();
            }
            int i = 1;
            int j = 0;
            for (; i < map.size(); i++)
            {
                GalileoTracker galileotracker = (GalileoTracker)map.get(j);
                if (a((GalileoTracker)map.get(i), galileotracker))
                {
                    j = i;
                }
            }

            return ((GalileoTracker)map.get(j)).a();
        } else
        {
            return null;
        }
    }

    protected String c()
    {
        return "SearchTrackerByRssiTask";
    }
}
