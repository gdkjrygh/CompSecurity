// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.ui;

import android.util.Pair;
import com.artfulbits.aiCharts.Base.ChartAxis;
import com.fitbit.runtrack.data.ExerciseSession;
import com.fitbit.runtrack.data.ExerciseStat;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.fitbit.runtrack.ui:
//            RecentSummary

class a
    implements com.artfulbits.aiCharts.Base.
{

    final List a;
    final RecentSummary b;

    public void a(ChartAxis chartaxis, List list)
    {
        list.clear();
        chartaxis = a.iterator();
        int i = 0;
        while (chartaxis.hasNext()) 
        {
            Object obj = (Pair)chartaxis.next();
            RecentSummary recentsummary = b;
            ExerciseSession exercisesession = (ExerciseSession)((Pair) (obj)).first;
            obj = (ExerciseStat)((Pair) (obj)).second;
            boolean flag;
            if (i == a.size() - 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            list.add(RecentSummary.a(recentsummary, i, exercisesession, ((ExerciseStat) (obj)), flag));
            i++;
        }
    }

    n(RecentSummary recentsummary, List list)
    {
        b = recentsummary;
        a = list;
        super();
    }
}
