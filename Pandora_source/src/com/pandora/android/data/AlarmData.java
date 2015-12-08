// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.data;

import android.app.Application;
import android.content.ContentValues;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.media.AudioManager;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.BaseColumns;
import android.text.format.DateFormat;
import com.pandora.android.provider.b;
import com.pandora.android.util.s;
import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.Locale;

public class AlarmData
    implements Parcelable
{
    public static class a extends IllegalArgumentException
    {

        public a()
        {
        }

        public a(String s1)
        {
            super(s1);
        }
    }

    public static class b
        implements BaseColumns
    {

        public static final String a[] = {
            "_id", "hour", "minutes", "daysofweek", "alarmtime", "enabled", "stationtoken", "stationname", "defaultsnoozeminutes", "snoozetime", 
            "volume"
        };

    }

    public static final class c
    {

        private static int a[] = {
            2, 3, 4, 5, 6, 7, 1
        };
        private int b;

        static int a(c c1)
        {
            return c1.b;
        }

        private boolean a(int i1)
        {
            return (b & 1 << i1) > 0;
        }

        public int a()
        {
            return b;
        }

        public int a(Calendar calendar)
        {
            if (b != 0) goto _L2; else goto _L1
_L1:
            int j1 = -1;
_L4:
            return j1;
_L2:
            int i1;
            int k1;
            k1 = calendar.get(7);
            i1 = 0;
_L6:
            j1 = i1;
            if (i1 >= 7) goto _L4; else goto _L3
_L3:
            j1 = i1;
            if (a(((k1 + 5) % 7 + i1) % 7)) goto _L4; else goto _L5
_L5:
            i1++;
              goto _L6
        }

        public String a(Context context, boolean flag)
        {
            boolean flag1 = false;
            StringBuilder stringbuilder = new StringBuilder();
            if (b == 0)
            {
                if (flag)
                {
                    return context.getText(0x7f08008f).toString();
                } else
                {
                    return "";
                }
            }
            if (b == 96)
            {
                return context.getText(0x7f080091).toString();
            }
            if (b == 31)
            {
                return context.getText(0x7f080090).toString();
            }
            if (b == 127)
            {
                return context.getText(0x7f08008e).toString();
            }
            int j1 = b;
            int i1;
            int k1;
            for (i1 = 0; j1 > 0; i1 = k1)
            {
                k1 = i1;
                if ((j1 & 1) == 1)
                {
                    k1 = i1 + 1;
                }
                j1 >>= 1;
            }

            Object obj = new DateFormatSymbols();
            if (i1 > 1)
            {
                obj = ((DateFormatSymbols) (obj)).getShortWeekdays();
                j1 = ((flag1) ? 1 : 0);
            } else
            {
                obj = ((DateFormatSymbols) (obj)).getWeekdays();
                j1 = ((flag1) ? 1 : 0);
            }
            while (j1 < 7) 
            {
                int l1 = i1;
                if ((b & 1 << j1) != 0)
                {
                    stringbuilder.append(obj[a[j1]]);
                    i1--;
                    l1 = i1;
                    if (i1 > 0)
                    {
                        stringbuilder.append(context.getText(0x7f08008c));
                        l1 = i1;
                    }
                }
                j1++;
                i1 = l1;
            }
            return stringbuilder.toString();
        }

        public void a(int i1, boolean flag)
        {
            if (flag)
            {
                b = b | 1 << i1;
                return;
            } else
            {
                b = b & ~(1 << i1);
                return;
            }
        }

        public boolean[] b()
        {
            boolean aflag[] = new boolean[7];
            for (int i1 = 0; i1 < 7; i1++)
            {
                aflag[i1] = a(i1);
            }

            return aflag;
        }

        public boolean c()
        {
            return b != 0;
        }

        public boolean equals(Object obj)
        {
            if (this != obj)
            {
                if (obj == null)
                {
                    return false;
                }
                if (getClass() != obj.getClass())
                {
                    return false;
                }
                obj = (c)obj;
                if (b != ((c) (obj)).b)
                {
                    return false;
                }
            }
            return true;
        }

        public int hashCode()
        {
            return b + 31;
        }


        public c(int i1)
        {
            b = i1;
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public AlarmData a(Parcel parcel)
        {
            return new AlarmData(parcel);
        }

        public AlarmData[] a(int i1)
        {
            return new AlarmData[i1];
        }

        public Object createFromParcel(Parcel parcel)
        {
            return a(parcel);
        }

        public Object[] newArray(int i1)
        {
            return a(i1);
        }

    };
    private int a;
    private boolean b;
    private int c;
    private int d;
    private c e;
    private long f;
    private String g;
    private String h;
    private int i;
    private long j;
    private int k;

    public AlarmData()
    {
        b = false;
        c = 7;
        d = 0;
        e = new c(0);
        i = 5;
        k = ((AudioManager)com.pandora.android.provider.b.a.h().getSystemService("audio")).getStreamVolume(4);
    }

    public AlarmData(Cursor cursor)
    {
        boolean flag = false;
        super();
        a = cursor.getInt(0);
        if (cursor.getInt(5) == 1)
        {
            flag = true;
        }
        b = flag;
        c = cursor.getInt(1);
        d = cursor.getInt(2);
        e = new c(cursor.getInt(3));
        f = cursor.getLong(4);
        g = cursor.getString(6);
        h = cursor.getString(7);
        i = cursor.getInt(8);
        j = cursor.getLong(9);
        k = cursor.getInt(10);
    }

    public AlarmData(Parcel parcel)
    {
        boolean flag = true;
        super();
        a = parcel.readInt();
        if (parcel.readInt() != 1)
        {
            flag = false;
        }
        b = flag;
        c = parcel.readInt();
        d = parcel.readInt();
        e = new c(parcel.readInt());
        f = parcel.readLong();
        g = parcel.readString();
        h = parcel.readString();
        i = parcel.readInt();
        j = parcel.readLong();
        k = parcel.readInt();
    }

    private String a(Context context, long l1)
    {
        return DateFormat.getTimeFormat(context).format(Long.valueOf(l1));
    }

    private String f(Context context)
    {
        return a(context, j);
    }

    public AlarmData a()
    {
        AlarmData alarmdata = new AlarmData();
        alarmdata.a(a);
        alarmdata.a(b);
        alarmdata.b(c);
        alarmdata.c(d);
        alarmdata.a(e);
        alarmdata.a(f);
        alarmdata.a(g);
        alarmdata.b(h);
        alarmdata.d(i);
        alarmdata.b(j);
        alarmdata.e(k);
        return alarmdata;
    }

    public String a(Context context)
    {
        if (n())
        {
            return f(context);
        }
        String s1 = a(context, false);
        if (s.a(s1))
        {
            return b(context);
        } else
        {
            return (new StringBuilder()).append(b(context)).append(" ").append(s1).toString();
        }
    }

    public String a(Context context, boolean flag)
    {
        return e.a(context, flag);
    }

    public void a(int i1)
    {
        a = i1;
    }

    public void a(long l1)
    {
        f = l1;
    }

    public void a(c c1)
    {
        e = c1;
    }

    public void a(String s1)
    {
        g = s1;
    }

    public void a(boolean flag)
    {
        b = flag;
    }

    public ContentValues b()
    {
        ContentValues contentvalues = new ContentValues();
        if (a != 0)
        {
            contentvalues.put("_id", Integer.valueOf(a));
        }
        contentvalues.put("hour", Integer.valueOf(c));
        contentvalues.put("minutes", Integer.valueOf(d));
        contentvalues.put("daysofweek", Integer.valueOf(c.a(e)));
        contentvalues.put("alarmtime", Long.valueOf(f));
        contentvalues.put("enabled", Boolean.valueOf(b));
        contentvalues.put("stationtoken", g);
        contentvalues.put("stationname", h);
        contentvalues.put("defaultsnoozeminutes", Integer.valueOf(i));
        contentvalues.put("snoozetime", Long.valueOf(j));
        contentvalues.put("volume", Integer.valueOf(k));
        return contentvalues;
    }

    public String b(Context context)
    {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, c);
        calendar.set(12, d);
        return a(context, calendar.getTimeInMillis());
    }

    public void b(int i1)
    {
        c = i1;
    }

    public void b(long l1)
    {
        j = l1;
    }

    public void b(String s1)
    {
        h = s1;
    }

    public int c()
    {
        return a;
    }

    public String c(Context context)
    {
        return context.getResources().getStringArray(0x7f0e0002)[i / 5];
    }

    public void c(int i1)
    {
        d = i1;
    }

    public Object clone()
        throws CloneNotSupportedException
    {
        return a();
    }

    public String d(Context context)
    {
        return context.getString(0x7f080092, new Object[] {
            e(context), b(context)
        });
    }

    public void d(int i1)
    {
        i = i1;
    }

    public boolean d()
    {
        return b;
    }

    public int describeContents()
    {
        return 0;
    }

    public int e()
    {
        return c;
    }

    public String e(Context context)
    {
        Calendar calendar = Calendar.getInstance();
        Calendar calendar1 = Calendar.getInstance();
        calendar1.setTimeInMillis(f);
        int k1 = calendar.get(6);
        int l1 = calendar1.get(6);
        int j1 = l1 - k1;
        int i1 = j1;
        if (j1 < 0)
        {
            i1 = (calendar.getActualMaximum(6) - k1) + l1;
        }
        switch (i1)
        {
        default:
            return (new DateFormatSymbols(Locale.US)).getWeekdays()[calendar1.get(7)];

        case 0: // '\0'
            return context.getString(0x7f080093);

        case 1: // '\001'
            return context.getString(0x7f080094);
        }
    }

    public void e(int i1)
    {
        k = i1;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null)
            {
                return false;
            }
            if (getClass() != obj.getClass())
            {
                return false;
            }
            obj = (AlarmData)obj;
            if (e == null)
            {
                if (((AlarmData) (obj)).e != null)
                {
                    return false;
                }
            } else
            if (!e.equals(((AlarmData) (obj)).e))
            {
                return false;
            }
            if (i != ((AlarmData) (obj)).i)
            {
                return false;
            }
            if (b != ((AlarmData) (obj)).b)
            {
                return false;
            }
            if (c != ((AlarmData) (obj)).c)
            {
                return false;
            }
            if (a != ((AlarmData) (obj)).a)
            {
                return false;
            }
            if (d != ((AlarmData) (obj)).d)
            {
                return false;
            }
            if (j != ((AlarmData) (obj)).j)
            {
                return false;
            }
            if (h == null)
            {
                if (((AlarmData) (obj)).h != null)
                {
                    return false;
                }
            } else
            if (!h.equals(((AlarmData) (obj)).h))
            {
                return false;
            }
            if (g == null)
            {
                if (((AlarmData) (obj)).g != null)
                {
                    return false;
                }
            } else
            if (!g.equals(((AlarmData) (obj)).g))
            {
                return false;
            }
            if (f != ((AlarmData) (obj)).f)
            {
                return false;
            }
            if (k != ((AlarmData) (obj)).k)
            {
                return false;
            }
        }
        return true;
    }

    public int f()
    {
        return d;
    }

    public c g()
    {
        return e;
    }

    public long h()
    {
        return f;
    }

    public int hashCode()
    {
        int k1 = 0;
        int i1;
        char c1;
        int j1;
        int l1;
        int i2;
        int j2;
        int k2;
        int l2;
        if (e == null)
        {
            i1 = 0;
        } else
        {
            i1 = e.hashCode();
        }
        l1 = i;
        if (b)
        {
            c1 = '\u04CF';
        } else
        {
            c1 = '\u04D5';
        }
        i2 = c;
        j2 = a;
        k2 = d;
        l2 = (int)(j ^ j >>> 32);
        if (h == null)
        {
            j1 = 0;
        } else
        {
            j1 = h.hashCode();
        }
        if (g != null)
        {
            k1 = g.hashCode();
        }
        return (((j1 + (((((c1 + ((i1 + 31) * 31 + l1) * 31) * 31 + i2) * 31 + j2) * 31 + k2) * 31 + l2) * 31) * 31 + k1) * 31 + (int)(f ^ f >>> 32)) * 31 + k;
    }

    public String i()
    {
        return g;
    }

    public String j()
    {
        return h;
    }

    public int k()
    {
        return i;
    }

    public long l()
    {
        return j;
    }

    public int m()
    {
        return k;
    }

    public boolean n()
    {
        return j != 0L;
    }

    public void o()
    {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        int i1 = calendar.get(11);
        int j1 = calendar.get(12);
        if (c < i1 || c == i1 && d <= j1)
        {
            calendar.add(6, 1);
        }
        calendar.set(11, c);
        calendar.set(12, d);
        calendar.set(13, 0);
        calendar.set(14, 0);
        i1 = e.a(calendar);
        if (i1 > 0)
        {
            calendar.add(7, i1);
        }
        f = calendar.getTimeInMillis();
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        parcel.writeInt(a);
        if (b)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        parcel.writeInt(i1);
        parcel.writeInt(c);
        parcel.writeInt(d);
        parcel.writeInt(e.a());
        parcel.writeLong(f);
        parcel.writeString(g);
        parcel.writeString(h);
        parcel.writeInt(i);
        parcel.writeLong(j);
        parcel.writeInt(k);
    }

}
