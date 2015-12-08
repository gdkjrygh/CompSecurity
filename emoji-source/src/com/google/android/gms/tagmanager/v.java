// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import com.google.android.gms.internal.ij;
import com.google.android.gms.internal.il;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

// Referenced classes of package com.google.android.gms.tagmanager:
//            bh, ak

class v
    implements DataLayer.c
{
    class a extends SQLiteOpenHelper
    {

        final v afp;

        private void a(SQLiteDatabase sqlitedatabase)
        {
            Object obj;
            sqlitedatabase = sqlitedatabase.rawQuery("SELECT * FROM datalayer WHERE 0", null);
            obj = new HashSet();
            String as[] = sqlitedatabase.getColumnNames();
            int i = 0;
_L2:
            if (i >= as.length)
            {
                break; /* Loop/switch isn't completed */
            }
            ((Set) (obj)).add(as[i]);
            i++;
            if (true) goto _L2; else goto _L1
_L1:
            sqlitedatabase.close();
            if (!((Set) (obj)).remove("key") || !((Set) (obj)).remove("value") || !((Set) (obj)).remove("ID") || !((Set) (obj)).remove("expires"))
            {
                throw new SQLiteException("Database column missing");
            }
            break MISSING_BLOCK_LABEL_122;
            obj;
            sqlitedatabase.close();
            throw obj;
            if (!((Set) (obj)).isEmpty())
            {
                throw new SQLiteException("Database has extra columns");
            } else
            {
                return;
            }
        }

        private boolean a(String s, SQLiteDatabase sqlitedatabase)
        {
            Object obj = null;
            sqlitedatabase = sqlitedatabase.query("SQLITE_MASTER", new String[] {
                "name"
            }, "name=?", new String[] {
                s
            }, null, null, null);
            boolean flag = sqlitedatabase.moveToFirst();
            if (sqlitedatabase != null)
            {
                sqlitedatabase.close();
            }
            return flag;
            sqlitedatabase;
            sqlitedatabase = null;
_L4:
            bh.D((new StringBuilder()).append("Error querying for table ").append(s).toString());
            if (sqlitedatabase != null)
            {
                sqlitedatabase.close();
            }
            return false;
            s;
            sqlitedatabase = obj;
_L2:
            if (sqlitedatabase != null)
            {
                sqlitedatabase.close();
            }
            throw s;
            s;
            continue; /* Loop/switch isn't completed */
            s;
            if (true) goto _L2; else goto _L1
_L1:
            SQLiteException sqliteexception;
            sqliteexception;
            if (true) goto _L4; else goto _L3
_L3:
        }

        public SQLiteDatabase getWritableDatabase()
        {
            SQLiteDatabase sqlitedatabase = null;
            SQLiteDatabase sqlitedatabase1 = super.getWritableDatabase();
            sqlitedatabase = sqlitedatabase1;
_L2:
            SQLiteDatabase sqlitedatabase2 = sqlitedatabase;
            if (sqlitedatabase == null)
            {
                sqlitedatabase2 = super.getWritableDatabase();
            }
            return sqlitedatabase2;
            SQLiteException sqliteexception;
            sqliteexception;
            v.b(afp).getDatabasePath("google_tagmanager.db").delete();
            if (true) goto _L2; else goto _L1
_L1:
        }

        public void onCreate(SQLiteDatabase sqlitedatabase)
        {
            ak.N(sqlitedatabase.getPath());
        }

        public void onOpen(SQLiteDatabase sqlitedatabase)
        {
            Cursor cursor;
            if (android.os.Build.VERSION.SDK_INT >= 15)
            {
                break MISSING_BLOCK_LABEL_29;
            }
            cursor = sqlitedatabase.rawQuery("PRAGMA journal_mode=memory", null);
            cursor.moveToFirst();
            cursor.close();
            if (!a("datalayer", sqlitedatabase))
            {
                sqlitedatabase.execSQL(v.lG());
                return;
            } else
            {
                a(sqlitedatabase);
                return;
            }
            sqlitedatabase;
            cursor.close();
            throw sqlitedatabase;
        }

        public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int k)
        {
        }

        a(Context context, String s)
        {
            afp = v.this;
            super(context, s, null, 1);
        }
    }

    private static class b
    {

        final String JL;
        final byte afs[];

        public String toString()
        {
            return (new StringBuilder()).append("KeyAndSerialized: key = ").append(JL).append(" serialized hash = ").append(Arrays.hashCode(afs)).toString();
        }

        b(String s, byte abyte0[])
        {
            JL = s;
            afs = abyte0;
        }
    }


    private static final String afj = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' STRING NOT NULL, '%s' BLOB NOT NULL, '%s' INTEGER NOT NULL);", new Object[] {
        "datalayer", "ID", "key", "value", "expires"
    });
    private ij aef;
    private final Executor afk;
    private a afl;
    private int afm;
    private final Context mContext;

    public v(Context context)
    {
        this(context, il.gb(), "google_tagmanager.db", 2000, ((Executor) (Executors.newSingleThreadExecutor())));
    }

    v(Context context, ij ij1, String s, int i, Executor executor)
    {
        mContext = context;
        aef = ij1;
        afm = i;
        afk = executor;
        afl = new a(mContext, s);
    }

    private SQLiteDatabase S(String s)
    {
        SQLiteDatabase sqlitedatabase;
        try
        {
            sqlitedatabase = afl.getWritableDatabase();
        }
        catch (SQLiteException sqliteexception)
        {
            bh.D(s);
            return null;
        }
        return sqlitedatabase;
    }

    static List a(v v1)
    {
        return v1.lC();
    }

    static void a(v v1, String s)
    {
        v1.bQ(s);
    }

    static void a(v v1, List list, long l)
    {
        v1.b(list, l);
    }

    static Context b(v v1)
    {
        return v1.mContext;
    }

    private void b(List list, long l)
    {
        this;
        JVM INSTR monitorenter ;
        long l1 = aef.currentTimeMillis();
        x(l1);
        _mthdo(list.size());
        c(list, l1 + l);
        lF();
        this;
        JVM INSTR monitorexit ;
        return;
        list;
        lF();
        throw list;
        list;
        this;
        JVM INSTR monitorexit ;
        throw list;
    }

    private void bQ(String s)
    {
        SQLiteDatabase sqlitedatabase;
        sqlitedatabase = S("Error opening database for clearKeysWithPrefix.");
        if (sqlitedatabase == null)
        {
            return;
        }
        int i = sqlitedatabase.delete("datalayer", "key = ? OR key LIKE ?", new String[] {
            s, (new StringBuilder()).append(s).append(".%").toString()
        });
        bh.C((new StringBuilder()).append("Cleared ").append(i).append(" items").toString());
        lF();
        return;
        SQLiteException sqliteexception;
        sqliteexception;
        bh.D((new StringBuilder()).append("Error deleting entries with key prefix: ").append(s).append(" (").append(sqliteexception).append(").").toString());
        lF();
        return;
        s;
        lF();
        throw s;
    }

    private void c(List list, long l)
    {
        SQLiteDatabase sqlitedatabase = S("Error opening database for writeEntryToDatabase.");
        if (sqlitedatabase != null)
        {
            list = list.iterator();
            while (list.hasNext()) 
            {
                b b1 = (b)list.next();
                ContentValues contentvalues = new ContentValues();
                contentvalues.put("expires", Long.valueOf(l));
                contentvalues.put("key", b1.JL);
                contentvalues.put("value", b1.afs);
                sqlitedatabase.insert("datalayer", null, contentvalues);
            }
        }
    }

    private void _mthdo(int i)
    {
        i = (lE() - afm) + i;
        if (i > 0)
        {
            List list = dp(i);
            bh.B((new StringBuilder()).append("DataLayer store full, deleting ").append(list.size()).append(" entries to make room.").toString());
            g((String[])list.toArray(new String[0]));
        }
    }

    private List dp(int i)
    {
        Object obj;
        ArrayList arraylist;
        arraylist = new ArrayList();
        if (i <= 0)
        {
            bh.D("Invalid maxEntries specified. Skipping.");
            return arraylist;
        }
        obj = S("Error opening database for peekEntryIds.");
        if (obj == null)
        {
            return arraylist;
        }
        Object obj1;
        obj1 = String.format("%s ASC", new Object[] {
            "ID"
        });
        String s = Integer.toString(i);
        obj1 = ((SQLiteDatabase) (obj)).query("datalayer", new String[] {
            "ID"
        }, null, null, null, null, ((String) (obj1)), s);
        obj = obj1;
        if (!((Cursor) (obj1)).moveToFirst()) goto _L2; else goto _L1
_L1:
        obj = obj1;
        arraylist.add(String.valueOf(((Cursor) (obj1)).getLong(0)));
        obj = obj1;
        boolean flag = ((Cursor) (obj1)).moveToNext();
        if (flag) goto _L1; else goto _L2
_L2:
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
_L3:
        return arraylist;
        SQLiteException sqliteexception;
        sqliteexception;
        obj1 = null;
_L6:
        obj = obj1;
        bh.D((new StringBuilder()).append("Error in peekEntries fetching entryIds: ").append(sqliteexception.getMessage()).toString());
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
          goto _L3
        Exception exception;
        exception;
        obj = null;
_L5:
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        throw exception;
        exception;
        if (true) goto _L5; else goto _L4
_L4:
        sqliteexception;
          goto _L6
    }

    private List e(List list)
    {
        ArrayList arraylist = new ArrayList();
        b b1;
        for (list = list.iterator(); list.hasNext(); arraylist.add(new DataLayer.a(b1.JL, j(b1.afs))))
        {
            b1 = (b)list.next();
        }

        return arraylist;
    }

    private List f(List list)
    {
        ArrayList arraylist = new ArrayList();
        DataLayer.a a1;
        for (list = list.iterator(); list.hasNext(); arraylist.add(new b(a1.JL, j(a1.afh))))
        {
            a1 = (DataLayer.a)list.next();
        }

        return arraylist;
    }

    private void g(String as[])
    {
        SQLiteDatabase sqlitedatabase;
        if (as != null && as.length != 0)
        {
            if ((sqlitedatabase = S("Error opening database for deleteEntries.")) != null)
            {
                String s = String.format("%s in (%s)", new Object[] {
                    "ID", TextUtils.join(",", Collections.nCopies(as.length, "?"))
                });
                try
                {
                    sqlitedatabase.delete("datalayer", s, as);
                    return;
                }
                catch (SQLiteException sqliteexception)
                {
                    bh.D((new StringBuilder()).append("Error deleting entries ").append(Arrays.toString(as)).toString());
                }
                return;
            }
        }
    }

    private Object j(byte abyte0[])
    {
        ByteArrayInputStream bytearrayinputstream = new ByteArrayInputStream(abyte0);
        abyte0 = new ObjectInputStream(bytearrayinputstream);
        Object obj = abyte0.readObject();
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_31;
        }
        abyte0.close();
        bytearrayinputstream.close();
        return obj;
        abyte0;
        abyte0 = null;
_L8:
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        abyte0.close();
        bytearrayinputstream.close();
        return null;
        abyte0;
        return null;
        abyte0;
        abyte0 = null;
_L6:
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        abyte0.close();
        bytearrayinputstream.close();
        return null;
        abyte0;
        return null;
        obj;
        abyte0 = null;
_L4:
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_88;
        }
        abyte0.close();
        bytearrayinputstream.close();
_L2:
        throw obj;
        abyte0;
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        if (true) goto _L4; else goto _L3
_L3:
        obj;
        if (true) goto _L6; else goto _L5
_L5:
        obj;
        if (true) goto _L8; else goto _L7
_L7:
        abyte0;
        return obj;
    }

    private byte[] j(Object obj)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        ObjectOutputStream objectoutputstream = new ObjectOutputStream(bytearrayoutputstream);
        objectoutputstream.writeObject(obj);
        obj = bytearrayoutputstream.toByteArray();
        if (objectoutputstream == null)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        objectoutputstream.close();
        bytearrayoutputstream.close();
        return ((byte []) (obj));
        obj;
        objectoutputstream = null;
_L6:
        if (objectoutputstream == null)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        objectoutputstream.close();
        bytearrayoutputstream.close();
        return null;
        obj;
        return null;
        obj;
        objectoutputstream = null;
_L4:
        if (objectoutputstream == null)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        objectoutputstream.close();
        bytearrayoutputstream.close();
_L2:
        throw obj;
        IOException ioexception;
        ioexception;
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        if (true) goto _L4; else goto _L3
_L3:
        obj;
        if (true) goto _L6; else goto _L5
_L5:
        ioexception;
        return ((byte []) (obj));
    }

    private List lC()
    {
        List list;
        x(aef.currentTimeMillis());
        list = e(lD());
        lF();
        return list;
        Exception exception;
        exception;
        lF();
        throw exception;
    }

    private List lD()
    {
        Object obj;
        Object obj1;
        obj1 = S("Error opening database for loadSerialized.");
        obj = new ArrayList();
        if (obj1 == null)
        {
            return ((List) (obj));
        }
        obj1 = ((SQLiteDatabase) (obj1)).query("datalayer", new String[] {
            "key", "value"
        }, null, null, null, null, "ID", null);
        while (((Cursor) (obj1)).moveToNext()) 
        {
            ((List) (obj)).add(new b(((Cursor) (obj1)).getString(0), ((Cursor) (obj1)).getBlob(1)));
        }
        break MISSING_BLOCK_LABEL_99;
        obj;
        ((Cursor) (obj1)).close();
        throw obj;
        ((Cursor) (obj1)).close();
        return ((List) (obj));
    }

    private int lE()
    {
        Cursor cursor;
        Object obj;
        Object obj1;
        int i;
        int k;
        obj = null;
        cursor = null;
        i = 0;
        k = 0;
        obj1 = S("Error opening database for getNumStoredEntries.");
        if (obj1 != null) goto _L2; else goto _L1
_L1:
        return k;
_L2:
        obj1 = ((SQLiteDatabase) (obj1)).rawQuery("SELECT COUNT(*) from datalayer", null);
        cursor = ((Cursor) (obj1));
        obj = obj1;
        if (!((Cursor) (obj1)).moveToFirst())
        {
            break MISSING_BLOCK_LABEL_65;
        }
        cursor = ((Cursor) (obj1));
        obj = obj1;
        long l = ((Cursor) (obj1)).getLong(0);
        i = (int)l;
        k = i;
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
            return i;
        }
        if (true) goto _L1; else goto _L3
_L3:
        obj;
        obj = cursor;
        bh.D("Error getting numStoredEntries");
        if (cursor == null) goto _L1; else goto _L4
_L4:
        cursor.close();
        return 0;
        Exception exception;
        exception;
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        throw exception;
    }

    private void lF()
    {
        try
        {
            afl.close();
            return;
        }
        catch (SQLiteException sqliteexception)
        {
            return;
        }
    }

    static String lG()
    {
        return afj;
    }

    private void x(long l)
    {
        SQLiteDatabase sqlitedatabase = S("Error opening database for deleteOlderThan.");
        if (sqlitedatabase == null)
        {
            return;
        }
        try
        {
            int i = sqlitedatabase.delete("datalayer", "expires <= ?", new String[] {
                Long.toString(l)
            });
            bh.C((new StringBuilder()).append("Deleted ").append(i).append(" expired items").toString());
            return;
        }
        catch (SQLiteException sqliteexception)
        {
            bh.D("Error deleting old entries.");
        }
    }

    public void a(DataLayer.c.a a1)
    {
        afk.execute(new Runnable(a1) {

            final v afp;
            final DataLayer.c.a afq;

            public void run()
            {
                afq.d(v.a(afp));
            }

            
            {
                afp = v.this;
                afq = a1;
                super();
            }
        });
    }

    public void a(List list, long l)
    {
        list = f(list);
        afk.execute(new Runnable(list, l) {

            final List afn;
            final long afo;
            final v afp;

            public void run()
            {
                v.a(afp, afn, afo);
            }

            
            {
                afp = v.this;
                afn = list;
                afo = l;
                super();
            }
        });
    }

    public void bP(String s)
    {
        afk.execute(new Runnable(s) {

            final v afp;
            final String afr;

            public void run()
            {
                v.a(afp, afr);
            }

            
            {
                afp = v.this;
                afr = s;
                super();
            }
        });
    }

}
