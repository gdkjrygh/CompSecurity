// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

public final class dpd
{

    private List a;
    private TreeMap b;
    private final Context c;
    private final noz d;
    private final int e;

    public dpd(Context context, int i)
    {
        c = context;
        e = i;
        d = noz.a(context, 2, "ChapterCountTracker", new String[] {
            "perf"
        });
    }

    private void a(SQLiteDatabase sqlitedatabase)
    {
        int i;
        long l;
        l = noy.a();
        b = new TreeMap();
        a = new ArrayList();
        sqlitedatabase = sqlitedatabase.rawQuery("SELECT start_timestamp,  COUNT(start_timestamp) FROM chapters GROUP BY start_timestamp ORDER BY start_timestamp DESC", null);
        i = 0;
_L2:
        if (!sqlitedatabase.moveToNext())
        {
            break; /* Loop/switch isn't completed */
        }
        long l1 = sqlitedatabase.getLong(0);
        int j = sqlitedatabase.getInt(1);
        b.put(Long.valueOf(l1), Integer.valueOf(i));
        a.add(Integer.valueOf(j));
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        sqlitedatabase.close();
        if (d.a())
        {
            noy.a("chapters", Integer.valueOf(b.size()));
            noy.a("duration", l);
        }
        return;
        Exception exception;
        exception;
        sqlitedatabase.close();
        throw exception;
    }

    final void a()
    {
        this;
        JVM INSTR monitorenter ;
        a = null;
        b = null;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    final void a(SQLiteDatabase sqlitedatabase, long l, int i, erv erv1)
    {
        this;
        JVM INSTR monitorenter ;
        if (a != null) goto _L2; else goto _L1
_L1:
        a(sqlitedatabase);
_L6:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        dpe.a[erv1.ordinal()];
        JVM INSTR tableswitch 1 3: default 147
    //                   1 100
    //                   2 100
    //                   3 108;
           goto _L3 _L4 _L4 _L5
_L3:
        sqlitedatabase = String.valueOf(erv1);
        throw new IllegalArgumentException((new StringBuilder(String.valueOf(sqlitedatabase).length() + 15)).append("unknown action ").append(sqlitedatabase).toString());
        sqlitedatabase;
        this;
        JVM INSTR monitorexit ;
        throw sqlitedatabase;
_L4:
        a(sqlitedatabase);
          goto _L6
_L5:
        int j = ((Integer)b.get(Long.valueOf(l))).intValue();
        a.set(j, Integer.valueOf(i));
          goto _L6
    }

    public final List b()
    {
        this;
        JVM INSTR monitorenter ;
        List list;
        if (a == null)
        {
            a(mvj.b(c, e));
        }
        list = Collections.unmodifiableList(a);
        this;
        JVM INSTR monitorexit ;
        return list;
        Exception exception;
        exception;
        throw exception;
    }
}
