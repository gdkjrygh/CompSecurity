// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.Iterator;
import java.util.List;

public final class dos
{

    private static final String b[] = {
        "_id"
    };
    final List a;
    private final Context c;
    private final ContentResolver d;
    private final faa e;

    public dos(Context context)
    {
        new ive();
        c = context;
        a = olm.c(context, eru);
        d = context.getContentResolver();
        e = new faa(evt.a);
    }

    private void a(SQLiteDatabase sqlitedatabase, int i, long l, int j, erv erv1)
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((eru)iterator.next()).a(sqlitedatabase, i, l, j, erv1)) { }
        d.notifyChange(dor.a(i), null);
    }

    void a(SQLiteDatabase sqlitedatabase, int i, ivd ivd1)
    {
        Object obj;
        int j;
        boolean flag1;
        int l;
        flag1 = true;
        l = sqlitedatabase.delete("chapters", "start_timestamp = ? AND end_timestamp = ?", new String[] {
            Long.toString(ivd1.a()), Long.toString(ivd1.b())
        });
        obj = (new erm()).a(b);
        obj.o = false;
        obj.l = false;
        obj.f = 28L;
        faa faa1 = e;
        if (((fac)olm.a(c, fac)).a(faa1.a))
        {
            long l1 = ivd1.a();
            long l2 = ivd1.b();
            ContentValues contentvalues;
            int k;
            int i1;
            boolean flag2;
            if (l1 <= l2)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            p.a(flag2, "startTimestamp (%s) must be less or equal to endTimestamp (%s)", new Object[] {
                Long.valueOf(l1), Long.valueOf(l2)
            });
            ((erm) (obj)).c(String.valueOf(b.b("media", "month_random_timestamp")).concat(" >= ?"));
            ((erm) (obj)).c.add(String.valueOf(l1));
            ((erm) (obj)).c(String.valueOf(b.b("media", "month_random_timestamp")).concat(" <= ?"));
            ((erm) (obj)).c.add(String.valueOf(l2));
            obj.a = "month_random_timestamp DESC, _id DESC";
        } else
        {
            ((erm) (obj)).a(ivd1.a()).b(ivd1.b());
        }
        obj = ((erm) (obj)).b(sqlitedatabase);
        i1 = ((Cursor) (obj)).getColumnIndexOrThrow("_id");
        contentvalues = new ContentValues();
        contentvalues.put("start_timestamp", Long.valueOf(ivd1.a()));
        contentvalues.put("end_timestamp", Long.valueOf(ivd1.b()));
        k = 0;
        j = 0;
_L2:
        if (k >= 28)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!((Cursor) (obj)).moveToNext())
        {
            break; /* Loop/switch isn't completed */
        }
        contentvalues.put("media_id", Long.valueOf(((Cursor) (obj)).getLong(i1)));
        sqlitedatabase.insert("chapters", null, contentvalues);
        j++;
        k++;
        if (true) goto _L2; else goto _L1
_L1:
        ((Cursor) (obj)).close();
        boolean flag;
        if (l == 0 && j > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (l <= 0 || j != 0)
        {
            flag1 = false;
        }
        if (flag)
        {
            a(sqlitedatabase, i, ivd1.a(), j, erv.a);
        } else
        {
            if (flag1)
            {
                a(sqlitedatabase, i, ivd1.a(), j, erv.b);
                return;
            }
            if (l != j)
            {
                a(sqlitedatabase, i, ivd1.a(), j, erv.c);
                return;
            }
        }
        return;
        sqlitedatabase;
        ((Cursor) (obj)).close();
        throw sqlitedatabase;
    }

}
