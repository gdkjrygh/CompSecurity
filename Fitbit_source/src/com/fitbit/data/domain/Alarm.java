// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain;

import com.fitbit.d.b;
import com.fitbit.data.domain.device.Device;
import com.fitbit.util.format.e;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.fitbit.data.domain:
//            Entity

public class Alarm extends Entity
    implements b, Cloneable
{
    private static final class WeekDay extends Enum
    {

        private static final WeekDay $VALUES[];
        public static final WeekDay FRIDAY;
        public static final WeekDay MONDAY;
        public static final WeekDay SATURDAY;
        public static final WeekDay SUNDAY;
        public static final WeekDay THURSDAY;
        public static final WeekDay TUESDAY;
        public static final WeekDay WEDNESDAY;
        private int bitField;

        public static WeekDay valueOf(String s)
        {
            return (WeekDay)Enum.valueOf(com/fitbit/data/domain/Alarm$WeekDay, s);
        }

        public static WeekDay[] values()
        {
            return (WeekDay[])$VALUES.clone();
        }

        public int bitField()
        {
            return bitField;
        }

        static 
        {
            MONDAY = new WeekDay("MONDAY", 0, 1);
            TUESDAY = new WeekDay("TUESDAY", 1, 2);
            WEDNESDAY = new WeekDay("WEDNESDAY", 2, 4);
            THURSDAY = new WeekDay("THURSDAY", 3, 8);
            FRIDAY = new WeekDay("FRIDAY", 4, 16);
            SATURDAY = new WeekDay("SATURDAY", 5, 32);
            SUNDAY = new WeekDay("SUNDAY", 6, 64);
            $VALUES = (new WeekDay[] {
                MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
            });
        }

        private WeekDay(String s, int i1, int j1)
        {
            super(s, i1);
            bitField = j1;
        }
    }


    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 4;
    public static final int d = 8;
    public static final int e = 16;
    public static final int f = 32;
    public static final int g = 64;
    public static final int h = 127;
    private int daysOfWeek;
    private boolean deleted;
    private Device device;
    private long deviceId;
    private boolean enabled;
    private String label;
    private boolean recurring;
    private int snoozeCount;
    private long snoozeLength;
    private boolean staysVisible;
    private boolean syncedToDevice;
    private Date time;
    private String vibePattern;

    public Alarm()
    {
        snoozeCount = -1;
        snoozeLength = -1L;
    }

    public static int a(Collection collection)
    {
        collection = collection.iterator();
        int i1;
        for (i1 = 0; collection.hasNext(); i1 = d(((Integer)collection.next()).intValue()) | i1) { }
        return i1;
    }

    private static int a(JSONArray jsonarray)
    {
        int i1;
        int j1;
        i1 = 0;
        if (jsonarray == null)
        {
            return 0;
        }
        j1 = 0;
_L2:
        if (i1 >= jsonarray.length())
        {
            break; /* Loop/switch isn't completed */
        }
        int k1 = WeekDay.valueOf(jsonarray.optString(i1)).bitField();
        j1 |= k1;
_L3:
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
        return j1;
        Object obj;
        obj;
          goto _L3
        obj;
          goto _L3
    }

    private static void a(String s, StringBuilder stringbuilder, String s1)
    {
        if (stringbuilder.length() > 0)
        {
            stringbuilder.append(s1);
        }
        stringbuilder.append(s);
    }

    public static boolean a(int i1, int j1)
    {
        return (d(i1) & j1) != 0;
    }

    public static String c(int i1)
    {
        StringBuilder stringbuilder = new StringBuilder();
        if ((i1 & 1) != 0)
        {
            a("MONDAY", stringbuilder, ",");
        }
        if ((i1 & 2) != 0)
        {
            a("TUESDAY", stringbuilder, ",");
        }
        if ((i1 & 4) != 0)
        {
            a("WEDNESDAY", stringbuilder, ",");
        }
        if ((i1 & 8) != 0)
        {
            a("THURSDAY", stringbuilder, ",");
        }
        if ((i1 & 0x10) != 0)
        {
            a("FRIDAY", stringbuilder, ",");
        }
        if ((i1 & 0x20) != 0)
        {
            a("SATURDAY", stringbuilder, ",");
        }
        if ((i1 & 0x40) != 0)
        {
            a("SUNDAY", stringbuilder, ",");
        }
        return stringbuilder.toString();
    }

    public static int d(int i1)
    {
        switch (i1)
        {
        default:
            return 0;

        case 2: // '\002'
            return 1;

        case 3: // '\003'
            return 2;

        case 4: // '\004'
            return 4;

        case 5: // '\005'
            return 8;

        case 6: // '\006'
            return 16;

        case 7: // '\007'
            return 32;

        case 1: // '\001'
            return 64;
        }
    }

    public static Set e(int i1)
    {
        TreeSet treeset = new TreeSet();
        int ai[] = new int[7];
        int[] _tmp = ai;
        ai[0] = 2;
        ai[1] = 3;
        ai[2] = 5;
        ai[3] = 1;
        ai[4] = 6;
        ai[5] = 7;
        ai[6] = 4;
        int k1 = ai.length;
        for (int j1 = 0; j1 < k1; j1++)
        {
            int l1 = ai[j1];
            if (a(l1, i1))
            {
                treeset.add(Integer.valueOf(l1));
            }
        }

        return treeset;
    }

    public void a(int i1)
    {
        snoozeCount = i1;
    }

    public void a(long l1)
    {
        snoozeLength = l1;
    }

    public void a(Device device1)
    {
        device = device1;
    }

    public void a(String s)
    {
        label = s;
    }

    public void a(Date date)
    {
        time = date;
    }

    public void a(boolean flag)
    {
        staysVisible = flag;
    }

    public boolean a()
    {
        return enabled;
    }

    public Date b(Date date)
    {
        GregorianCalendar gregoriancalendar = new GregorianCalendar();
        gregoriancalendar.setTime(date);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(time);
        gregoriancalendar.set(11, calendar.get(11));
        gregoriancalendar.set(12, calendar.get(12));
        gregoriancalendar.set(13, calendar.get(13));
        for (int i1 = 0; i1 < 8; i1++)
        {
            if ((a(gregoriancalendar.get(7), daysOfWeek) || daysOfWeek == 0) && date.before(gregoriancalendar.getTime()))
            {
                return gregoriancalendar.getTime();
            }
            gregoriancalendar.add(7, 1);
        }

        return null;
    }

    public void b(int i1)
    {
        daysOfWeek = i1;
    }

    public void b(long l1)
    {
        deviceId = l1;
    }

    public void b(String s)
    {
        vibePattern = s;
    }

    public void b(boolean flag)
    {
        enabled = flag;
    }

    public boolean b()
    {
        return staysVisible;
    }

    public void c(boolean flag)
    {
        recurring = flag;
    }

    public boolean c()
    {
        return recurring;
    }

    public Object clone()
        throws CloneNotSupportedException
    {
        return super.clone();
    }

    public String d()
    {
        return label;
    }

    public void d(boolean flag)
    {
        syncedToDevice = flag;
    }

    public int e()
    {
        return snoozeCount;
    }

    public void e(boolean flag)
    {
        deleted = flag;
    }

    public long f()
    {
        return snoozeLength;
    }

    public boolean g()
    {
        return syncedToDevice;
    }

    public Date h()
    {
        return time;
    }

    public String i()
    {
        return vibePattern;
    }

    public void initFromPublicApiJsonObject(JSONObject jsonobject)
        throws JSONException
    {
        b(jsonobject.optString("vibe"));
        b(jsonobject.optBoolean("enabled"));
        String s = jsonobject.optString("time");
        if (s != null)
        {
            a(com.fitbit.util.format.e.j(s));
            if (h() == null)
            {
                throw new JSONException("Incorrect time format received");
            }
        }
        d(jsonobject.optBoolean("syncedToDevice"));
        a(jsonobject.optInt("snoozeCount", -1));
        setServerId(jsonobject.optLong("alarmId"));
        a(jsonobject.optLong("snoozeLength", -1L));
        c(jsonobject.optBoolean("recurring"));
        e(jsonobject.optBoolean("deleted"));
        b(a(jsonobject.optJSONArray("weekDays")));
        a(false);
        setEntityStatus(Entity.EntityStatus.SYNCED);
    }

    public int j()
    {
        return daysOfWeek;
    }

    public Device k()
    {
        return device;
    }

    public boolean l()
    {
        return deleted;
    }

    public long m()
    {
        return deviceId;
    }

    public JSONObject toPublicApiJsonObject()
        throws JSONException
    {
        throw new UnsupportedOperationException();
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(super.toString());
        stringbuilder.append(" vibePattern: ").append(i());
        stringbuilder.append(" enabled: ").append(a());
        stringbuilder.append(" time: ").append(h());
        stringbuilder.append(" isSyncedToDevice: ").append(g());
        stringbuilder.append(" snoozeCount: ").append(e());
        stringbuilder.append(" snoozeLength: ").append(f());
        stringbuilder.append(" isRecurring: ").append(c());
        stringbuilder.append(" isDeleted: ").append(l());
        stringbuilder.append(" daysOfWeek: ").append(j());
        stringbuilder.append(" isStaysVisible: ").append(b());
        return stringbuilder.toString();
    }
}
