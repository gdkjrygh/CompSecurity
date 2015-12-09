// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.provider;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.pandora.android.data.AlarmData;
import com.pandora.android.util.s;
import com.pandora.radio.provider.d;
import java.util.ArrayList;
import java.util.Collection;
import p.bz.b;
import p.cw.c;

// Referenced classes of package com.pandora.android.provider:
//            b

public class com.pandora.android.provider.a
{
    private static class a
        implements com.pandora.radio.provider.d.b
    {

        public Collection a()
        {
            ArrayList arraylist = new ArrayList(1);
            arraylist.add(new com.pandora.radio.provider.d.c("alarms", com.pandora.android.provider.a.c()));
            return arraylist;
        }

        public void a(SQLiteDatabase sqlitedatabase)
        {
        }

        public void a(SQLiteDatabase sqlitedatabase, int i, int j)
        {
        }

        private a()
        {
        }

    }


    private static com.pandora.android.provider.a a;
    private SQLiteDatabase b;

    private com.pandora.android.provider.a()
    {
        this(b.a.b().w().getWritableDatabase());
    }

    private com.pandora.android.provider.a(SQLiteDatabase sqlitedatabase)
    {
        b = sqlitedatabase;
    }

    public static com.pandora.android.provider.a a()
    {
        if (a == null)
        {
            a = new com.pandora.android.provider.a();
        }
        return a;
    }

    public static a b()
    {
        return new a();
    }

    private static void c(AlarmData alarmdata)
    {
        if (alarmdata == null)
        {
            throw new com.pandora.android.data.AlarmData.a("AlarmData cannot be null!");
        }
        if (s.a(alarmdata.i()))
        {
            throw new com.pandora.android.data.AlarmData.a("StationToken cannot be null!");
        }
        if (s.a(alarmdata.j()))
        {
            throw new com.pandora.android.data.AlarmData.a("StationName cannot be null!");
        }
        if (alarmdata.h() == 0L)
        {
            throw new com.pandora.android.data.AlarmData.a("Time cannot be 0!");
        } else
        {
            return;
        }
    }

    public static com.pandora.radio.provider.d.a[] c()
    {
        return (new com.pandora.radio.provider.d.a[] {
            com.pandora.radio.provider.d.a.a("hour"), com.pandora.radio.provider.d.a.a("minutes"), com.pandora.radio.provider.d.a.b("daysofweek"), com.pandora.radio.provider.d.a.a("alarmtime"), com.pandora.radio.provider.d.a.a("enabled"), com.pandora.radio.provider.d.a.b("stationtoken"), com.pandora.radio.provider.d.a.b("stationname"), com.pandora.radio.provider.d.a.a("defaultsnoozeminutes"), com.pandora.radio.provider.d.a.a("snoozetime"), com.pandora.radio.provider.d.a.a("volume")
        });
    }

    private SQLiteDatabase g()
    {
        return b;
    }

    public long a(AlarmData alarmdata)
    {
        c(alarmdata);
        long l = g().insert("alarms", null, alarmdata.b());
        alarmdata.a((int)l);
        p.dt.b b1 = b.a.e();
        boolean flag;
        if (l != -1L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b1.a(new b(alarmdata, flag));
        return l;
    }

    public AlarmData a(long l)
    {
        Object obj = g();
        String s1 = String.format("%s=?", new Object[] {
            "_id"
        });
        obj = ((SQLiteDatabase) (obj)).query("alarms", com.pandora.android.data.AlarmData.b.a, s1, new String[] {
            Long.toString(l)
        }, null, null, null);
        if (!((Cursor) (obj)).moveToFirst())
        {
            throw new SQLException((new StringBuilder()).append("No alarm found with id ").append(l).toString());
        } else
        {
            AlarmData alarmdata = new AlarmData(((Cursor) (obj)));
            ((Cursor) (obj)).close();
            return alarmdata;
        }
    }

    public int b(AlarmData alarmdata)
    {
        boolean flag = true;
        c(alarmdata);
        Object obj = g();
        String s1 = String.format("%s=?", new Object[] {
            "_id"
        });
        int i = ((SQLiteDatabase) (obj)).update("alarms", alarmdata.b(), s1, new String[] {
            Long.toString(alarmdata.c())
        });
        obj = b.a.e();
        if (i != 1)
        {
            flag = false;
        }
        ((p.dt.b) (obj)).a(new b(alarmdata, flag));
        return i;
    }

    public AlarmData d()
    {
        AlarmData alarmdata = null;
        Cursor cursor = g().query("alarms", com.pandora.android.data.AlarmData.b.a, null, null, null, null, null);
        if (cursor.moveToFirst())
        {
            alarmdata = new AlarmData(cursor);
        }
        cursor.close();
        return alarmdata;
    }

    public int e()
    {
        return g().delete("alarms", "1", null);
    }

    public boolean f()
    {
        AlarmData alarmdata = d();
        return alarmdata != null && alarmdata.d();
    }
}
