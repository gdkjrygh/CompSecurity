// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cn;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.pandora.radio.data.aa;
import com.pandora.radio.data.ac;
import com.pandora.radio.provider.d;
import com.pandora.radio.util.b;
import java.util.ArrayList;
import java.util.Collection;

// Referenced classes of package p.cn:
//            b

public class c extends b
{
    static class a
        implements com.pandora.radio.provider.d.b
    {

        public Collection a()
        {
            ArrayList arraylist = new ArrayList(1);
            arraylist.add(new com.pandora.radio.provider.d.c("station_history", p.cn.b.a.a()));
            return arraylist;
        }

        public void a(SQLiteDatabase sqlitedatabase)
        {
            sqlitedatabase.execSQL("CREATE TRIGGER IF NOT EXISTS StationTrackHistoryDataCleanup DELETE ON station_history BEGIN  DELETE FROM station_history WHERE station_id = old._id;  END; ");
        }

        public void a(SQLiteDatabase sqlitedatabase, int i, int j)
        {
            sqlitedatabase.execSQL("CREATE TRIGGER IF NOT EXISTS StationTrackHistoryDataCleanup DELETE ON station_history BEGIN  DELETE FROM station_history WHERE station_id = old._id;  END; ");
        }

        a()
        {
        }
    }


    private static c a;
    private SQLiteDatabase b;

    private c()
    {
        this(com.pandora.android.provider.b.a.b().w().getWritableDatabase());
    }

    private c(SQLiteDatabase sqlitedatabase)
    {
        b = sqlitedatabase;
    }

    public static c a()
    {
        if (a == null)
        {
            a = new c();
        }
        return a;
    }

    private void a(String s, aa aa1, long l)
    {
        SQLiteDatabase sqlitedatabase = c();
        aa1 = aa1.p();
        aa1.put("sessionId", s);
        aa1.put("dateCreated", Long.valueOf(l));
        sqlitedatabase.insert("station_history", null, aa1);
    }

    public static a b()
    {
        return new a();
    }

    private SQLiteDatabase c()
    {
        return b;
    }

    public aa a(long l, String s)
    {
        Object obj;
        Object obj1;
        String s1;
        obj = null;
        obj1 = c();
        s1 = String.format("%s=? AND %s=?", new Object[] {
            "station_id", "songIdentity"
        });
        String as[] = b.a.a;
        String s2 = Long.toString(l);
        String s3 = b.a;
        obj1 = ((SQLiteDatabase) (obj1)).query("station_history", as, s1, new String[] {
            s2, s
        }, null, null, s3);
        if (obj1 == null) goto _L2; else goto _L1
_L1:
        int i = ((Cursor) (obj1)).getCount();
        if (i != 0) goto _L3; else goto _L2
_L2:
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
        s = null;
_L5:
        return s;
_L3:
        ((Cursor) (obj1)).moveToNext();
        obj = new aa(((Cursor) (obj1)));
        s = ((String) (obj));
        if (obj1 == null) goto _L5; else goto _L4
_L4:
        ((Cursor) (obj1)).close();
        return ((aa) (obj));
        s;
_L7:
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        throw s;
        s;
        obj = obj1;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public void a(aa aa1)
    {
        SQLiteDatabase sqlitedatabase = c();
        String s = String.format("%s=?", new Object[] {
            "trackToken"
        });
        sqlitedatabase.update("station_history", aa1.p(), s, new String[] {
            aa1.w()
        });
    }

    public void a(String s, d.a aa1[])
    {
        SQLiteDatabase sqlitedatabase = c();
        sqlitedatabase.beginTransaction();
        int j = aa1.length;
        for (int i = 0; i < j; i++)
        {
            d.a a1 = aa1[i];
            if (a1.a.l() == ac.a)
            {
                a(s, a1.a, a1.b);
            }
        }

        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
    }

    public aa[] a(String s)
    {
        SQLiteDatabase sqlitedatabase;
        String s1;
        sqlitedatabase = c();
        s1 = String.format("%s=?", new Object[] {
            "stationId"
        });
        String as[] = b.a.a;
        String s2 = b.a;
        s = sqlitedatabase.query("station_history", as, s1, new String[] {
            s
        }, null, null, s2);
        if (s == null) goto _L2; else goto _L1
_L1:
        int i = s.getCount();
        if (i != 0) goto _L3; else goto _L2
_L2:
        aa aaa[];
        if (s != null)
        {
            s.close();
        }
        aaa = new aa[0];
_L7:
        return aaa;
_L3:
        aa aaa1[] = new aa[s.getCount()];
        i = 0;
_L5:
        if (!s.moveToNext())
        {
            break; /* Loop/switch isn't completed */
        }
        aaa1[i] = new aa(s);
        i++;
        if (true) goto _L5; else goto _L4
_L4:
        aaa = aaa1;
        if (s == null) goto _L7; else goto _L6
_L6:
        s.close();
        return aaa1;
        Exception exception;
        exception;
        s = null;
_L9:
        if (s != null)
        {
            s.close();
        }
        throw exception;
        exception;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public void b(String s)
    {
        c().delete("station_history", String.format("%s!=?", new Object[] {
            "sessionId"
        }), new String[] {
            s
        });
    }
}
