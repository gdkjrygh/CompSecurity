// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.ui;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.artfulbits.aiCharts.Base.j;
import com.fitbit.data.domain.ActivityLogEntry;
import com.fitbit.heartrate.charts.views.ExercizeHeartRateBabyChartView;
import com.fitbit.util.o;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HeartRateGraphFragment extends Fragment
{

    private static final int a = 30;
    private ExercizeHeartRateBabyChartView b;
    private List c;

    public HeartRateGraphFragment()
    {
    }

    private com.fitbit.weight.ui.b.a a(Map map)
    {
        com.fitbit.weight.ui.b.a a1 = new com.fitbit.weight.ui.b.a();
        a1.a = new ArrayList();
        a1.c = new LinkedHashMap();
        ArrayList arraylist = new ArrayList();
        ArrayList arraylist1 = new ArrayList();
        ArrayList arraylist2 = new ArrayList();
        map = map.entrySet().iterator();
        while (map.hasNext()) 
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
    /* block-local class not found */
    class a {}

            j j1 = new j(((Long)entry.getKey()).longValue(), new double[] {
                (double)((a)entry.getValue()).a
            });
            j j2 = new j(((Long)entry.getKey()).longValue(), new double[] {
                (double)((a)entry.getValue()).b
            });
            j j3 = new j(((Long)entry.getKey()).longValue(), new double[] {
                (double)((a)entry.getValue()).c
            });
            arraylist.add(j1);
            arraylist1.add(j2);
            arraylist2.add(j3);
            a1.a.add(j1);
            a1.a.add(j2);
            a1.a.add(j3);
            int i = ((a)entry.getValue()).a;
            int k = ((a)entry.getValue()).b;
            i = ((a)entry.getValue()).c + (k + i);
            a1.f = a1.f + (double)i;
            double d;
            if (a1.d > (double)i)
            {
                d = a1.d;
            } else
            {
                d = i;
            }
            a1.d = d;
        }
        a1.c.put(com.fitbit.data.domain.heartrate.HeartRateZone.HeartRateZoneType.FAT_BURN.name(), arraylist);
        a1.c.put(com.fitbit.data.domain.heartrate.HeartRateZone.HeartRateZoneType.CARDIO.name(), arraylist1);
        a1.c.put(com.fitbit.data.domain.heartrate.HeartRateZone.HeartRateZoneType.PEAK.name(), arraylist2);
        return a1;
    }

    private void a()
    {
        if (c != null)
        {
            com.fitbit.weight.ui.b.a a1 = a(b(c));
            b.a(a1);
        }
    }

    private Map b(List list)
    {
        HashMap hashmap = new HashMap();
        Object obj = Calendar.getInstance();
        ((Calendar) (obj)).setTime(o.a(o.b()));
        for (int i = 0; i < 30; i++)
        {
            hashmap.put(Long.valueOf(((Calendar) (obj)).getTimeInMillis()), new a(null));
            ((Calendar) (obj)).add(5, -1);
        }

        obj = o.b();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            ActivityLogEntry activitylogentry = (ActivityLogEntry)list.next();
            if ((int)o.f(activitylogentry.getLogDate(), ((Date) (obj))) < 30)
            {
                a a1 = (a)hashmap.get(Long.valueOf(o.a(activitylogentry.getLogDate()).getTime()));
                a1.a = a1.a + activitylogentry.s();
                a1.b = a1.b + activitylogentry.t();
                int k = a1.c;
                a1.c = activitylogentry.u() + k;
            }
        } while (true);
        return hashmap;
    }

    public void a(List list)
    {
        c = list;
        if (isResumed())
        {
            a();
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f0400fd, viewgroup, false);
        b = (ExercizeHeartRateBabyChartView)layoutinflater.findViewById(0x7f110239);
        b.setPadding(0, 0, 0, (int)getResources().getDimension(0x7f0a00af));
        ((TextView)layoutinflater.findViewById(0x7f110338)).setText(0x7f08019d);
        return layoutinflater;
    }

    public void onResume()
    {
        super.onResume();
        a();
    }
}
