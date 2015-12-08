// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public final class etw
{

    private final Context a;
    private final boolean b;

    public etw(Context context)
    {
        this(context, true);
    }

    private etw(Context context, boolean flag)
    {
        a = context;
        b = true;
    }

    private static boolean a(Long long1, Long long2)
    {
        return long1 == null || long2 == null || long1.equals(long2);
    }

    public final boolean a(int i, etx etx1, erb erb1)
    {
        SQLiteDatabase sqlitedatabase;
        sqlitedatabase = mvj.a(a, i);
        sqlitedatabase.beginTransactionNonExclusive();
        boolean flag;
        flag = a(sqlitedatabase, i, etx1, erb1);
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        return flag;
        etx1;
        sqlitedatabase.endTransaction();
        throw etx1;
    }

    public final boolean a(SQLiteDatabase sqlitedatabase, int i, etx etx1, erb erb1)
    {
        evh evh1;
        esx esx1;
        String as[];
label0:
        {
            boolean flag2;
            if (!b || sqlitedatabase.inTransaction())
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            p.b(flag2, "You must call mutateRowInTransaction inside of a database transaction");
            evh1 = etx1.a(sqlitedatabase);
            if (evh1 == null)
            {
                return false;
            }
            as = new String[1];
            as[0] = evh1.a;
            esx1 = esx.a(sqlitedatabase, evh1.a);
            flag2 = etx1.a(a, i, sqlitedatabase);
            boolean flag = false;
            if (!flag2)
            {
                return false;
            }
            Long long1 = esx1.a.c;
            Long long2 = esx1.a.d;
            Long long3 = etx1.a();
            etx1 = etx1.b();
            if (a(long1, long3))
            {
                i = ((flag) ? 1 : 0);
                if (a(long2, ((Long) (etx1))))
                {
                    break label0;
                }
            }
            long l = long3.longValue();
            long l2 = etx1.longValue();
            etx1 = new ContentValues();
            long l3 = ivc.a(l, l2);
            etx1.put("utc_timestamp", Long.valueOf(l));
            etx1.put("timezone_offset", Long.valueOf(l2));
            etx1.put("capture_timestamp", Long.valueOf(l3));
            sqlitedatabase.update("media", etx1, "dedup_key = ?", as);
            etx1.clear();
            etx1.put("capture_timestamp", Long.valueOf(l3));
            sqlitedatabase.update("search_results", etx1, "dedup_key = ?", as);
            i = ((flag) ? 1 : 0);
            if (esx1.b())
            {
                long l1 = ivc.a(long1.longValue(), long2.longValue());
                erb1.a(evh1.a, l1);
                erb1.a(evh1);
                i = 1;
            }
        }
        etx1 = esx.a(sqlitedatabase, evh1.a);
        if (((esx) (etx1)).a.a) goto _L2; else goto _L1
_L1:
        if (sqlitedatabase.delete("media", "dedup_key = ?", as) != 0 && etx1.a(esx1).a())
        {
            erb1.a(as[0], evh1.b);
        }
_L4:
        return true;
_L2:
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("has_local", Boolean.valueOf(((esx) (etx1)).a.e));
        contentvalues.put("is_deleted", Boolean.valueOf(etx1.a()));
        contentvalues.put("is_hidden", Boolean.valueOf(((esx) (etx1)).a.f));
        sqlitedatabase.update("media", contentvalues, "dedup_key = ?", as);
        sqlitedatabase = etx1.a(esx1);
        boolean flag1;
        if (((esy) (sqlitedatabase)).a.b() && !((esy) (sqlitedatabase)).b.b())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1)
        {
            erb1.a(evh1);
        } else
        if (etx1.a(esx1).a())
        {
            erb1.a(evh1.a, evh1.b);
        } else
        if (i == 0 && evh1.c != null && etx1.b())
        {
            erb1.b(evh1);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
