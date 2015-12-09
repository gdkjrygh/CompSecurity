// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.water.ui;

import android.content.Context;
import android.content.Intent;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.bl.fd;
import com.fitbit.data.bl.gb;
import com.fitbit.data.bl.t;
import com.fitbit.data.domain.WaterLogEntry;
import com.fitbit.e.a;
import com.fitbit.util.o;
import com.fitbit.water.Water;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;

public class b extends com.fitbit.ui.endless.b
{

    private static final String a = "WaterListLoader";
    private static final int b = 6;
    private double c;
    private double d;

    public b(Context context, Date date, Date date1)
    {
        super(context, fd.d(), date, date1);
        c = 0.0D;
        d = 0.0D;
    }

    private WaterLogEntry a(WaterLogEntry waterlogentry, WaterLogEntry waterlogentry1)
    {
        double d1 = waterlogentry.e().b();
        double d2 = waterlogentry1.e().b();
        waterlogentry.e().a(d1 + d2);
        return waterlogentry;
    }

    private List a(List list)
    {
        if (list.size() >= 2)
        {
            int k = 1;
            int j = 0;
            while (k < list.size()) 
            {
                WaterLogEntry waterlogentry = (WaterLogEntry)list.get(j);
                WaterLogEntry waterlogentry1 = (WaterLogEntry)list.get(k);
                if (o.j(waterlogentry.getLogDate(), waterlogentry1.getLogDate()))
                {
                    list.set(j, a(waterlogentry, waterlogentry1));
                    list.remove(waterlogentry1);
                } else
                {
                    k++;
                    j++;
                }
            }
        }
        return list;
    }

    private void b(List list)
    {
        for (list = list.iterator(); list.hasNext();)
        {
            WaterLogEntry waterlogentry = (WaterLogEntry)list.next();
            d = d + waterlogentry.e().b();
        }

    }

    protected List a(Date date, Date date1)
    {
        c = t.a().a(com.fitbit.data.domain.Goal.GoalType.WATER_GOAL).intValue();
        new ArrayList();
        date = new Date(date1.getTime() - 0x1ee62800L);
        Calendar calendar = Calendar.getInstance();
        Calendar calendar1 = Calendar.getInstance();
        calendar.setTime(date);
        calendar1.setTime(date1);
        date1 = a(gb.a().a(date, date1));
        date = date1;
        if (date1.size() < 7)
        {
            date1.clear();
            while (!calendar.after(calendar1)) 
            {
                try
                {
                    date = gb.a().d(calendar.getTime());
                    if (date.size() == 0)
                    {
                        WaterLogEntry waterlogentry = new WaterLogEntry();
                        waterlogentry.a(new Water(0.0D, com.fitbit.data.domain.WaterLogEntry.WaterUnits.OZ));
                        waterlogentry.setLogDate(calendar.getTime());
                        date.add(waterlogentry);
                        gb.a().a(waterlogentry, getContext());
                        com.fitbit.e.a.a("WaterListLoader", "Saving empty entry for %s", new Object[] {
                            calendar.getTime().toString()
                        });
                    }
                    date1.addAll(date);
                    calendar.add(5, 1);
                }
                // Misplaced declaration of an exception variable
                catch (Date date)
                {
                    com.fitbit.e.a.f("WaterListLoader", "Server Communication Exception.", date, new Object[0]);
                }
                // Misplaced declaration of an exception variable
                catch (Date date)
                {
                    com.fitbit.e.a.f("WaterListLoader", "JSON Exception.", date, new Object[0]);
                }
            }
            date = a(((List) (date1)));
        }
        b(date);
        Collections.reverse(date);
        return date;
    }

    protected String b()
    {
        return "WaterListLoader";
    }

    protected Intent f()
    {
        return fd.a(getContext(), false, com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.WATER, d(), e());
    }

    public double h()
    {
        return c;
    }

    public double i()
    {
        return d;
    }
}
