// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class mvq extends SQLiteOpenHelper
{

    private static onh a = new onh("debug.social.database");
    private static final mvo b = mvo.e();
    private final List c;
    private boolean d;
    private final Context e;
    private final int f;
    private final String g;
    private final obl h;

    public mvq(Context context, String s, int i, android.database.sqlite.SQLiteDatabase.CursorFactory cursorfactory, int j)
    {
        cursorfactory = null;
        Context context1 = context.getApplicationContext();
        if (s == null)
        {
            s = null;
        } else
        {
            s = oqs.b(oqs.a().append(s).append(i).append(".db"));
        }
        super(context1, s, null, 1);
        s = (mmv)olm.a(context, mmv);
        e = context;
        f = i;
        c = olm.c(context, mvi);
        h = (obl)olm.b(context, obl);
        context = cursorfactory;
        if (s.c(i))
        {
            context = s.a(i).b("account_name");
        }
        g = context;
        context = c;
    }

    private void a(SQLiteDatabase sqlitedatabase)
    {
        mvj.b(sqlitedatabase);
        mvj.c(sqlitedatabase);
        onCreate(sqlitedatabase);
    }

    private static void a(SQLiteDatabase sqlitedatabase, String s)
    {
label0:
        {
            String as[];
            String as1[];
            if (Log.isLoggable("PartitionedDatabase", 4))
            {
                String s1 = String.valueOf(s);
                mvo mvo1;
                if (s1.length() != 0)
                {
                    "Dropping partition: ".concat(s1);
                } else
                {
                    new String("Dropping partition: ");
                }
            }
            as1 = mvo.a(sqlitedatabase, s);
            mvj.a(sqlitedatabase, as1);
            as = mvo.b(sqlitedatabase, s);
            mvj.b(sqlitedatabase, as);
            mvo1 = b;
            if (TextUtils.equals(s, "__master_partition__"))
            {
                throw new IllegalArgumentException("Cannot delete the master partition");
            }
            String as2[] = new String[1];
            as2[0] = s;
            sqlitedatabase.delete("partition_versions", "partition_name=?", as2);
            sqlitedatabase.delete("partition_tables", "partition_name=?", as2);
            if (Log.isLoggable("PartitionedDatabase", 3))
            {
                sqlitedatabase = String.valueOf(Arrays.toString(as1));
                if (sqlitedatabase.length() != 0)
                {
                    "Dropped tables: ".concat(sqlitedatabase);
                } else
                {
                    new String("Dropped tables: ");
                }
                sqlitedatabase = String.valueOf(Arrays.toString(as));
                if (sqlitedatabase.length() == 0)
                {
                    break label0;
                }
                "Dropped views: ".concat(sqlitedatabase);
            }
            return;
        }
        new String("Dropped views: ");
    }

    private void a(SQLiteDatabase sqlitedatabase, mvi mvi1)
    {
        if (Log.isLoggable("PartitionedDatabase", 4))
        {
            String s = String.valueOf(mvi1.a());
            if (s.length() != 0)
            {
                "Rebuilding partition: ".concat(s);
            } else
            {
                new String("Rebuilding partition: ");
            }
        }
        a(sqlitedatabase, mvi1.a());
        mvi1.a(sqlitedatabase);
        mvi1.b(sqlitedatabase);
    }

    private boolean a(SQLiteDatabase sqlitedatabase, mvi mvi1, int i)
    {
        int j;
        j = mvi1.d();
        if (i == j)
        {
            return false;
        }
        if (i != 0) goto _L2; else goto _L1
_L1:
        mvi1.a(sqlitedatabase);
        mvi1.b(sqlitedatabase);
_L4:
        mvo mvo1 = b;
        ContentValues contentvalues = new ContentValues(2);
        contentvalues.put("partition_name", mvi1.a());
        contentvalues.put("version", Integer.valueOf(mvi1.d()));
        sqlitedatabase.replace("partition_versions", null, contentvalues);
        mvo1.a(sqlitedatabase, mvi1);
        mvo1.b(sqlitedatabase, mvi1);
        return true;
_L2:
        if (i > j)
        {
            a(sqlitedatabase, mvi1);
        } else
        {
            try
            {
                if (!mvi1.a(sqlitedatabase, f, i, j))
                {
                    a(sqlitedatabase, mvi1);
                }
            }
            catch (SQLiteException sqliteexception)
            {
                (new obw(g, mvi1.a(), i, j, i)).b(e);
                if (h != null)
                {
                    h.a(sqliteexception, "Database Upgrade Failures");
                }
                String s = String.valueOf(mvi1.a());
                Log.e("PartitionedDatabase", (new StringBuilder(String.valueOf(s).length() + 57)).append("Failed to upgrade partition: ").append(s).append(" ").append(i).append(" --> ").append(j).toString(), sqliteexception);
                a(sqlitedatabase, mvi1);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void b()
    {
        if (d)
        {
            int i = f;
            throw new mvr((new StringBuilder(38)).append("Database deleted. Account: ").append(i).toString());
        } else
        {
            return;
        }
    }

    private void b(SQLiteDatabase sqlitedatabase)
    {
        for (Iterator iterator = c.iterator(); iterator.hasNext(); ((mvi)iterator.next()).b(sqlitedatabase)) { }
    }

    public void a()
    {
        this;
        JVM INSTR monitorenter ;
        if (!d)
        {
            break MISSING_BLOCK_LABEL_12;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        d = true;
        this;
        JVM INSTR monitorexit ;
        SQLiteDatabase sqlitedatabase;
        int i;
        sqlitedatabase = super.getWritableDatabase();
        i = 0;
_L2:
        if (i >= 3)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        sqlitedatabase.beginTransaction();
        sqlitedatabase.endTransaction();
        sqlitedatabase.close();
        (new File(sqlitedatabase.getPath())).delete();
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        Throwable throwable;
        throwable;
        Log.e("PartitionedDatabase", "Cannot close database", throwable);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public SQLiteDatabase getReadableDatabase()
    {
        this;
        JVM INSTR monitorenter ;
        SQLiteDatabase sqlitedatabase;
        b();
        sqlitedatabase = super.getReadableDatabase();
        this;
        JVM INSTR monitorexit ;
        return sqlitedatabase;
        Exception exception;
        exception;
        throw exception;
    }

    public SQLiteDatabase getWritableDatabase()
    {
        this;
        JVM INSTR monitorenter ;
        SQLiteDatabase sqlitedatabase;
        b();
        sqlitedatabase = super.getWritableDatabase();
        this;
        JVM INSTR monitorexit ;
        return sqlitedatabase;
        Exception exception;
        exception;
        throw exception;
    }

    public void onCreate(SQLiteDatabase sqlitedatabase)
    {
        a(sqlitedatabase, b, 0);
        for (Iterator iterator = c.iterator(); iterator.hasNext(); a(sqlitedatabase, (mvi)iterator.next(), 0)) { }
    }

    public void onDowngrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        a(sqlitedatabase);
    }

    public void onOpen(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.beginTransaction();
        Object obj = mvo.c(sqlitedatabase);
        boolean flag = false;
        mvo mvo1 = b;
        int i = b.a((Integer)((Map) (obj)).get("__master_partition__"));
        if (!a(sqlitedatabase, b, i))
        {
            break MISSING_BLOCK_LABEL_53;
        }
        obj = mvo.c(sqlitedatabase);
        flag = true;
        mvo mvo2 = b;
        ((Map) (obj)).remove("__master_partition__");
        if (Log.isLoggable("PartitionedDatabase", 4))
        {
            int j = c.size();
            int k = ((Map) (obj)).size();
            (new StringBuilder(70)).append("Partitions in Binder: ").append(j).append(", Partitions in database: ").append(k);
        }
        for (Iterator iterator = c.iterator(); iterator.hasNext();)
        {
            mvi mvi1 = (mvi)iterator.next();
            flag |= a(sqlitedatabase, mvi1, b.a((Integer)((Map) (obj)).remove(mvi1.a())));
        }

        for (Iterator iterator1 = ((Map) (obj)).keySet().iterator(); iterator1.hasNext(); a(sqlitedatabase, (String)iterator1.next())) { }
          goto _L1
        obj;
        Log.e("PartitionedDatabase", "Failed to init database partitions", ((Throwable) (obj)));
        a(sqlitedatabase);
_L3:
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        mvj.a(sqlitedatabase);
        return;
_L1:
        if (!((Map) (obj)).isEmpty())
        {
            flag = true;
        }
        if (!flag) goto _L3; else goto _L2
_L2:
        mvj.c(sqlitedatabase);
        b(sqlitedatabase);
          goto _L3
        Exception exception;
        exception;
        sqlitedatabase.endTransaction();
        throw exception;
    }

    public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
    }

}
