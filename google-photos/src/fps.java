// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.apps.photos.jobqueue.JobService;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class fps
{

    public final Context a;
    private final fpy b;
    private final muz c;
    private final HashMap d = new HashMap();
    private final Map e = new ConcurrentHashMap();
    private final noz f;
    private boolean g;

    fps(Context context)
    {
        g = false;
        a = context;
        b = (fpy)olm.a(context, fpy);
        c = (muz)olm.a(context, muz);
        f = noz.a(context, 3, "JobQueue", new String[0]);
    }

    private static long a(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase = sqlitedatabase.rawQuery("SELECT MAX(_id) FROM job_queue_table", null);
        long l;
        if (!sqlitedatabase.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_33;
        }
        l = sqlitedatabase.getLong(0);
        sqlitedatabase.close();
        return l;
        sqlitedatabase.close();
        return 0x8000000000000000L;
        Exception exception;
        exception;
        sqlitedatabase.close();
        throw exception;
    }

    private long b(int i, fpr fpr1)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("subsystem_id", fpr1.a());
        contentvalues.put("network_required", Boolean.valueOf(fpr1.b()));
        contentvalues.put("job_data", ((fpx)b.a(fpr1.a())).a(fpr1));
        return mvj.a(a, i).insert("job_queue_table", null, contentvalues);
    }

    public final long a(int i, fpr fpr1, long l)
    {
        boolean flag = true;
        p.a(true, "Can't add a null job!");
        long l1;
        long l2;
        if (l <= 0L)
        {
            flag = false;
        }
        p.a(flag, "Can't have 0 or less delay!");
        l1 = c.b();
        l2 = b(i, fpr1);
        e.put(Long.valueOf(l2), Long.valueOf(l1 + l));
        JobService.a(a);
        return l2;
    }

    public final void a(int i, fpr fpr1)
    {
        p.a(true, "Can't add a null job!");
        b(i, fpr1);
        JobService.a(a);
    }

    public final void a(int i, String s, int j, fpt fpt1)
    {
        this;
        JVM INSTR monitorenter ;
        g = true;
        SQLiteDatabase sqlitedatabase = mvj.a(a, i);
        i = 1;
        long l = a(sqlitedatabase);
        int k = 0;
_L6:
        if (i == 0) goto _L2; else goto _L1
_L1:
        if (j != 0)
        {
            break MISSING_BLOCK_LABEL_445;
        }
        Object obj;
        String as[] = fpu.a;
        String s1 = (new StringBuilder(14)).append(k).append(", 1").toString();
        obj = sqlitedatabase.query("job_queue_table", as, "subsystem_id = ?", new String[] {
            s
        }, null, null, "_id ASC", s1);
_L7:
        if (!((Cursor) (obj)).moveToFirst()) goto _L4; else goto _L3
_L3:
        Object obj1;
        long l1 = ((Cursor) (obj)).getLong(0);
        obj1 = ((Cursor) (obj)).getString(1);
        byte abyte0[] = ((Cursor) (obj)).getBlob(2);
        obj1 = new Pair(((fpx)b.a(obj1)).a(abyte0), Long.valueOf(l1));
        ((Cursor) (obj)).close();
        if (f.a())
        {
            obj = String.valueOf(((Pair) (obj1)).first);
            String s3 = String.valueOf(((Pair) (obj1)).second);
            (new StringBuilder(String.valueOf(obj).length() + 31 + String.valueOf(s3).length())).append("Read job from cursor: ").append(((String) (obj))).append(" --- id: ").append(s3);
        }
        d.put(((Pair) (obj1)).first, ((Pair) (obj1)).second);
        obj = (fpr)((Pair) (obj1)).first;
        if (((Long)((Pair) (obj1)).second).longValue() <= l)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (!fpt1.a(((fpr) (obj)), (Long)e.get(((Pair) (obj1)).second))) goto _L2; else goto _L5
_L5:
        k++;
          goto _L6
_L8:
        obj = fpu.a;
        String s2 = (new StringBuilder(14)).append(k).append(", 1").toString();
        obj = sqlitedatabase.query("job_queue_table", ((String []) (obj)), "subsystem_id = ? AND network_required = ?", new String[] {
            s, String.valueOf(i)
        }, null, null, "_id ASC", s2);
          goto _L7
_L4:
        ((Cursor) (obj)).close();
_L2:
        g = false;
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        ((Cursor) (obj)).close();
        throw s;
        s;
        g = false;
        throw s;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
        if (1 == j)
        {
            i = 1;
        } else
        {
            i = 0;
        }
          goto _L8
    }

    public final void a(int i, List list)
    {
        p.a(true, "Can't remove a null jobs!");
        if (list.size() == 0)
        {
            return;
        }
        Long along[] = new Long[list.size()];
        for (int j = 0; j < along.length; j++)
        {
            Long long1 = (Long)d.get(list.get(j));
            if (long1 == null)
            {
                throw new IllegalArgumentException("Don't have an id for this job.");
            }
            along[j] = long1;
        }

        a(i, along);
    }

    public void a(int i, Long along[])
    {
        boolean flag = false;
        this;
        JVM INSTR monitorenter ;
        if (g)
        {
            throw new ConcurrentModificationException("Can't remove a job while iterating over jobs!");
        }
        break MISSING_BLOCK_LABEL_28;
        along;
        this;
        JVM INSTR monitorexit ;
        throw along;
        int j;
        mvj.a(a, i).execSQL(String.format("DELETE FROM job_queue_table WHERE _id IN (%s)", new Object[] {
            TextUtils.join(",", along)
        }));
        j = along.length;
        i = ((flag) ? 1 : 0);
_L2:
        Long long1;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        long1 = along[i];
        e.remove(long1);
        d.values().remove(long1);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }
}
