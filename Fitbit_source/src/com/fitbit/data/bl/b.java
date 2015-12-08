// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import android.content.Context;
import android.util.Pair;
import com.fitbit.data.domain.Alarm;
import com.fitbit.data.domain.device.Device;
import com.fitbit.data.repo.ap;
import com.fitbit.data.repo.g;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.fitbit.data.bl:
//            aq, l

public class b
{
    private static class a
    {

        public static b a = new b();


        private a()
        {
        }
    }


    public static final int a = 8;
    private final g b;

    private b()
    {
        b = aq.a().j();
    }


    public static b a()
    {
        return a.a;
    }

    public Alarm a(long l1)
    {
        return (Alarm)b.getById(l1);
    }

    public Alarm a(Date date, List list)
    {
        ArrayList arraylist = new ArrayList(list.size());
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            Alarm alarm = (Alarm)list.next();
            Date date1 = alarm.b(date);
            if (date1 != null && alarm.a())
            {
                arraylist.add(new Pair(date1, alarm));
            }
        } while (true);
        Collections.sort(arraylist, new Comparator() {

            final b a;

            public int a(Pair pair, Pair pair1)
            {
                return ((Date)pair.first).compareTo((Date)pair1.first);
            }

            public int compare(Object obj, Object obj1)
            {
                return a((Pair)obj, (Pair)obj1);
            }

            
            {
                a = b.this;
                super();
            }
        });
        if (arraylist.size() == 0)
        {
            return null;
        } else
        {
            return (Alarm)((Pair)arraylist.get(0)).second;
        }
    }

    public List a(Device device)
    {
        if (device != null)
        {
            device = b.getAlarmsForDevice(device);
            Iterator iterator = device.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                Alarm alarm = (Alarm)iterator.next();
                if (alarm.getEntityStatus() == com.fitbit.data.domain.Entity.EntityStatus.PENDING_DELETE && !alarm.b())
                {
                    iterator.remove();
                }
            } while (true);
            Collections.sort(device, new Comparator() {

                Calendar a;
                Calendar b;
                final b c;

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
                c = b.this;
                super();
                a = Calendar.getInstance();
                b = Calendar.getInstance();
            }
            });
            return device;
        } else
        {
            return Collections.emptyList();
        }
    }

    public void a(Context context, Alarm alarm)
    {
        l.a(alarm, context);
    }

    public void a(Context context, Alarm alarm, Device device, Set set, boolean flag, boolean flag1)
    {
        boolean flag2 = true;
        if (context == null || alarm == null || device == null || set == null)
        {
            return;
        }
        if (set.size() != 0 && flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        alarm.c(flag);
        if (alarm.isNew() && !alarm.a())
        {
            flag = flag2;
        } else
        {
            flag = false;
        }
        alarm.d(flag);
        alarm.a(3);
        alarm.a(1L);
        if (alarm.c())
        {
            alarm.b(Alarm.a(set));
        } else
        {
            set = alarm.b(new Date());
            GregorianCalendar gregoriancalendar = new GregorianCalendar();
            gregoriancalendar.setTime(set);
            alarm.b(Alarm.d(gregoriancalendar.get(7)));
        }
        alarm.b(flag1);
        alarm.a(device);
        device.l().add(alarm);
        a(context, alarm);
    }

    public void a(ap ap)
    {
        b.removeListener(ap);
    }

    public boolean a(String s)
    {
        String s1 = b.getName();
        return s1 != null && s1.equals(s);
    }

    public int b(Device device)
    {
        return a(device).size();
    }

    public List b()
    {
        return b.getAllAlarms();
    }

    public void b(Context context, Alarm alarm)
    {
        boolean flag = true;
        alarm.e(true);
        if (alarm.g() != alarm.a())
        {
            flag = false;
        }
        alarm.a(flag);
        alarm.d(false);
        b.save(alarm);
        l.a(Collections.singletonList(alarm), context);
    }

    public void b(ap ap)
    {
        b.addListener(ap);
    }

    public int c()
    {
        return b().size();
    }

    public boolean c(Device device)
    {
        return b(device) < 8;
    }
}
