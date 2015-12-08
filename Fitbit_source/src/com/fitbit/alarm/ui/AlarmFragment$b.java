// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.alarm.ui;

import android.content.Context;
import android.content.Intent;
import android.util.Pair;
import com.fitbit.data.bl.b;
import com.fitbit.data.bl.bh;
import com.fitbit.data.domain.Alarm;
import com.fitbit.data.domain.device.Device;
import com.fitbit.util.az;
import com.fitbit.util.p;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.fitbit.alarm.ui:
//            AlarmFragment

class b extends az
{

    final AlarmFragment b;

    protected boolean a(String s)
    {
        return com.fitbit.data.bl.b.a().a(s);
    }

    protected void b()
    {
        com.fitbit.data.bl.b.a().b(this);
    }

    protected void d()
    {
        com.fitbit.data.bl.b.a().a(this);
    }

    public Pair e()
    {
        Device device = p.c(b.f);
        List list = com.fitbit.data.bl.b.a().a(device);
        if (device == null)
        {
            list.clear();
        } else
        {
            Iterator iterator = list.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                Alarm alarm = (Alarm)iterator.next();
                if (alarm.m() != device.getEntityId().longValue() || alarm.getEntityStatus() == com.fitbit.data.domain.tus.PENDING_DELETE && !alarm.b())
                {
                    iterator.remove();
                }
            } while (true);
            Collections.sort(list, new Comparator() {

                Calendar a;
                Calendar b;
                final AlarmFragment.b c;

                public int a(Alarm alarm1, Alarm alarm2)
                {
                    a.setTime(alarm1.h());
                    b.setTime(alarm2.h());
                    int j = Integer.valueOf(a.get(11)).compareTo(Integer.valueOf(b.get(11)));
                    int i = j;
                    if (j == 0)
                    {
                        i = Integer.valueOf(a.get(12)).compareTo(Integer.valueOf(b.get(12)));
                    }
                    j = i;
                    if (i == 0)
                    {
                        j = Integer.valueOf(a.get(13)).compareTo(Integer.valueOf(b.get(13)));
                    }
                    return j;
                }

                public int compare(Object obj, Object obj1)
                {
                    return a((Alarm)obj, (Alarm)obj1);
                }

            
            {
                c = AlarmFragment.b.this;
                super();
                a = Calendar.getInstance();
                b = Calendar.getInstance();
            }
            });
        }
        return new Pair(device, list);
    }

    protected Intent f()
    {
        return bh.a(getContext());
    }

    public Object f_()
    {
        return e();
    }

    public void onContentChanged()
    {
        super.onContentChanged();
    }

    public _cls1.b(AlarmFragment alarmfragment, Context context)
    {
        b = alarmfragment;
        super(context);
    }
}
