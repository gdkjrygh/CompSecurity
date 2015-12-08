// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import android.util.SparseArray;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class mrm
{

    private static final Collection d;
    private static final SparseArray e = new SparseArray();
    public final Context a;
    public final int b;
    public final mrf c;
    private final mrb f;

    public mrm(Context context, int i)
    {
        p.b(context, "context must be non-null");
        boolean flag;
        if (i >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "accountId must be valid.");
        a = context.getApplicationContext();
        b = i;
        c = (mrf)olm.a(context, mrf);
        f = (mrb)olm.a(context, mrb);
    }

    private int a()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = (Map)e.get(b);
        if (obj != null) goto _L2; else goto _L1
_L1:
        int i = 0;
_L3:
        this;
        JVM INSTR monitorexit ;
        return i;
_L2:
        i = ((Map) (obj)).size();
        for (obj = ((Map) (obj)).values().iterator(); ((Iterator) (obj)).hasNext(); ((Runnable)((Iterator) (obj)).next()).run()) { }
        break MISSING_BLOCK_LABEL_76;
        Exception exception;
        exception;
        throw exception;
        e.remove(b);
          goto _L3
    }

    private static int a(Map map)
    {
        Iterator iterator = d.iterator();
        int i = 0;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            mqu mqu1 = (mqu)iterator.next();
            if (map.containsKey(mqu1))
            {
                i = ((Integer)map.get(mqu1)).intValue() + i;
            }
        } while (true);
        return i;
    }

    private List a(SQLiteDatabase sqlitedatabase, mqm mqm1)
    {
        switch (mrn.a[mqm1.a().ordinal()])
        {
        default:
            sqlitedatabase = String.valueOf(mqm1.a());
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(sqlitedatabase).length() + 20)).append("Unknown Group type: ").append(sqlitedatabase).toString());

        case 1: // '\001'
            return Arrays.asList(new Long[] {
                Long.valueOf(mqm1.c)
            });

        case 2: // '\002'
            mrb mrb1 = f;
            mqm1 = mqm1.b;
            sqlitedatabase = new mvu(sqlitedatabase);
            sqlitedatabase.a = "album_upload_batch";
            sqlitedatabase.b = (new String[] {
                "_id"
            });
            sqlitedatabase.c = "album_id = ?";
            sqlitedatabase.d = (new String[] {
                mqm1
            });
            return mrb.a(sqlitedatabase.a());

        case 3: // '\003'
            mqm1 = f;
            break;
        }
        sqlitedatabase = new mvu(sqlitedatabase);
        sqlitedatabase.a = "album_upload_batch";
        sqlitedatabase.b = (new String[] {
            "_id"
        });
        return mrb.a(sqlitedatabase.a());
    }

    private void a(long l, Runnable runnable)
    {
        this;
        JVM INSTR monitorenter ;
        if (runnable == null)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        Map map = (Map)e.get(b);
        Object obj;
        obj = map;
        if (map != null)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        obj = new HashMap();
        e.put(b, obj);
        ((Map) (obj)).put(Long.valueOf(l), runnable);
        this;
        JVM INSTR monitorexit ;
        return;
        runnable;
        throw runnable;
    }

    private static mqu b(Map map)
    {
        if (map.containsKey(mqu.d) || map.containsKey(mqu.b))
        {
            return mqu.b;
        }
        if (map.containsKey(mqu.a))
        {
            if (map.containsKey(mqu.c) || map.containsKey(mqu.e))
            {
                return mqu.b;
            } else
            {
                return mqu.a;
            }
        }
        if (map.containsKey(mqu.f))
        {
            return mqu.f;
        }
        if (map.containsKey(mqu.e))
        {
            return mqu.e;
        } else
        {
            return mqu.c;
        }
    }

    public final int a(mqm mqm1)
    {
        SQLiteDatabase sqlitedatabase;
        sqlitedatabase = mvj.a(a, b);
        sqlitedatabase.beginTransaction();
        Object obj;
        boolean flag;
        obj = a(sqlitedatabase, mqm1);
        flag = ((List) (obj)).isEmpty();
        if (flag)
        {
            sqlitedatabase.endTransaction();
            return 0;
        }
        mrf mrf1 = c;
        mqm1 = new ContentValues();
        mqm1.put("status", mqu.f.g);
        mqm1.put("update_time", Long.valueOf(mrf1.a.a()));
        obj = (new mrd(((List) (obj)), 500)).iterator();
        int i = 0;
        while (((Iterator) (obj)).hasNext()) 
        {
            List list = (List)((Iterator) (obj)).next();
            String s = mrg.b;
            String s1 = String.valueOf("batch_id");
            String s2 = String.valueOf(b.s(list.size()));
            i = sqlitedatabase.update("album_upload_media", mqm1, (new StringBuilder(String.valueOf(s).length() + 5 + String.valueOf(s1).length() + String.valueOf(s2).length())).append(s).append(" AND ").append(s1).append(s2).toString(), mrf.a(list)) + i;
        }
        int j;
        sqlitedatabase.setTransactionSuccessful();
        j = a();
        sqlitedatabase.endTransaction();
        return j + i;
        mqm1;
        sqlitedatabase.endTransaction();
        throw mqm1;
    }

    public final long a(Runnable runnable)
    {
        SQLiteDatabase sqlitedatabase;
        sqlitedatabase = mvj.a(a, b);
        sqlitedatabase.beginTransaction();
        long l = mrf.a(sqlitedatabase);
        if (l == -1L)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        c.a(sqlitedatabase, l, mqu.b);
        a(l, runnable);
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        return l;
        runnable;
        sqlitedatabase.endTransaction();
        throw runnable;
    }

    public final long a(String s, Collection collection)
    {
        SQLiteDatabase sqlitedatabase;
        boolean flag1 = true;
        mrb mrb1;
        ContentValues contentvalues;
        long l;
        boolean flag;
        if (!TextUtils.isEmpty(s))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "AlbumId can not be empty.");
        if (collection != null && !collection.isEmpty())
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        p.a(flag, "LocalMedia cannot be empty.");
        sqlitedatabase = mvj.a(a, b);
        sqlitedatabase.beginTransaction();
        mrb1 = f;
        contentvalues = new ContentValues();
        contentvalues.put("album_id", s);
        contentvalues.put("created_time", Long.valueOf(mrb1.a.a()));
        l = sqlitedatabase.insert("album_upload_batch", null, contentvalues);
        c.a(sqlitedatabase, l, collection);
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        return l;
        s;
        sqlitedatabase.endTransaction();
        throw s;
    }

    public final mqu a(long l, int i)
    {
        SQLiteDatabase sqlitedatabase;
        sqlitedatabase = mvj.a(a, b);
        sqlitedatabase.beginTransaction();
        b(l);
        mqu mqu1;
        if (c.a(sqlitedatabase, l).c < i)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        mqu1 = mqu.e;
_L1:
        c.a(sqlitedatabase, l, mqu1);
        mrf.b(sqlitedatabase, l);
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        return mqu1;
        mqu1 = mqu.d;
          goto _L1
        Exception exception;
        exception;
        sqlitedatabase.endTransaction();
        throw exception;
    }

    public final void a(long l)
    {
        SQLiteDatabase sqlitedatabase;
        sqlitedatabase = mvj.a(a, b);
        sqlitedatabase.beginTransaction();
        b(l);
        c.a(sqlitedatabase, l, mqu.f);
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        return;
        Exception exception;
        exception;
        sqlitedatabase.endTransaction();
        throw exception;
    }

    public final void a(long l, String s, String s1)
    {
        SQLiteDatabase sqlitedatabase;
        p.a(s, "photoId must be non-empty.");
        sqlitedatabase = mvj.a(a, b);
        sqlitedatabase.beginTransaction();
        b(l);
        mrf mrf1 = c;
        p.a(s, "must specify valid photoId");
        mrf1.a(sqlitedatabase, l, mqu.c, s, s1);
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        return;
        s;
        sqlitedatabase.endTransaction();
        throw s;
    }

    public final List b(mqm mqm1)
    {
        SQLiteDatabase sqlitedatabase;
        boolean flag;
        if (mqm1.a == b)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "Group accountId %d must match queue accountId %D.", new Object[] {
            Integer.valueOf(mqm1.a), Integer.valueOf(b)
        });
        sqlitedatabase = mvj.b(a, b);
        sqlitedatabase.beginTransaction();
        mqm1 = a(sqlitedatabase, mqm1);
        mqm1 = c.a(sqlitedatabase, mqm1);
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        return mqm1;
        mqm1;
        sqlitedatabase.endTransaction();
        throw mqm1;
    }

    void b(long l)
    {
        this;
        JVM INSTR monitorenter ;
        Map map = (Map)e.get(b);
        if (map == null)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        map.remove(Long.valueOf(l));
        if (map.size() == 0)
        {
            e.remove(b);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final mqp c(mqm mqm1)
    {
        SQLiteDatabase sqlitedatabase;
        sqlitedatabase = mvj.b(a, b);
        sqlitedatabase.beginTransaction();
        Object obj;
        obj = a(sqlitedatabase, mqm1);
        if (!((List) (obj)).isEmpty())
        {
            break MISSING_BLOCK_LABEL_58;
        }
        mqm1 = new mqp(mqm1, b(new HashMap()), 0);
        sqlitedatabase.endTransaction();
        return mqm1;
        obj = c.b(sqlitedatabase, ((List) (obj)));
        sqlitedatabase.setTransactionSuccessful();
        mqm1 = new mqp(mqm1, b(((Map) (obj))), a(((Map) (obj))));
        sqlitedatabase.endTransaction();
        return mqm1;
        mqm1;
        sqlitedatabase.endTransaction();
        throw mqm1;
    }

    static 
    {
        d = Collections.unmodifiableList(Arrays.asList(new mqu[] {
            mqu.a, mqu.b, mqu.d
        }));
    }
}
