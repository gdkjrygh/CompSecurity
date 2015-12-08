// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.ui;

import android.content.res.Resources;
import android.text.format.DateUtils;
import android.widget.GridView;
import android.widget.TextView;
import com.fitbit.runtrack.a.a;
import com.fitbit.ui.a.c;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

// Referenced classes of package com.fitbit.runtrack.ui:
//            FitbitFragment

public class CalendarFragment extends FitbitFragment
{

    private static final int i = 0;
    private static final int j = 1;
    private static final int k = 2;
    private static final int l = 3;
    private static final int m = 4;
    private static final int n = 28;
    private static final int o = 21;
    protected GridView a;
    protected TextView b;
    protected TextView c;
    protected TextView d;
    protected TextView e;
    protected TextView f;
    protected TextView g;
    protected TextView h;
    private c p;

    public CalendarFragment()
    {
        p = new _cls1();
        int k1 = com.fitbit.runtrack.a.a.a();
        ArrayList arraylist = new ArrayList();
        for (int i1 = 0; i1 < 28; i1++)
        {
            arraylist.add(Integer.valueOf(1));
        }

        for (int j1 = arraylist.size() - 1; j1 >= k1 + 21; j1--)
        {
            arraylist.set(j1, Integer.valueOf(0));
        }

        arraylist.set((k1 + 21) - 1, Integer.valueOf(2));
        p.addAll(arraylist);
    }

    protected void a()
    {
        int j1 = Calendar.getInstance().getFirstDayOfWeek();
        TextView atextview[] = new TextView[7];
        atextview[0] = b;
        atextview[1] = c;
        atextview[2] = d;
        atextview[3] = e;
        atextview[4] = f;
        atextview[5] = g;
        atextview[6] = h;
        for (int i1 = 0; i1 < atextview.length; i1++)
        {
            atextview[i1].setText(DateUtils.getDayOfWeekString(com.fitbit.runtrack.a.a.a(j1 + i1), 50));
        }

        TextView textview = atextview[com.fitbit.runtrack.a.a.a() - 1];
        textview.setTextColor(getResources().getColor(0x7f0f0097));
        textview.setBackgroundResource(0x7f020101);
        a.setAdapter(p);
        a.setEnabled(false);
    }

    public void a(Date date)
    {
        int i1;
label0:
        {
            i1 = com.fitbit.runtrack.a.a.a(date);
            if (i1 >= 0)
            {
                if (!DateUtils.isToday(date.getTime()))
                {
                    break label0;
                }
                p.set(i1, Integer.valueOf(4));
            }
            return;
        }
        p.set(i1, Integer.valueOf(3));
    }

    public void b(Date date)
    {
        int i1;
label0:
        {
            i1 = com.fitbit.runtrack.a.a.a(date);
            if (i1 >= 0)
            {
                if (!DateUtils.isToday(date.getTime()))
                {
                    break label0;
                }
                p.set(i1, Integer.valueOf(2));
            }
            return;
        }
        p.set(i1, Integer.valueOf(1));
    }

    /* member class not found */
    class _cls1 {}

}
