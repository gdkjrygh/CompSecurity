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
import com.google.android.gms.internal.ld;
import com.google.android.gms.internal.lf;
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

        final v arg;

        private void a(SQLiteDatabase sqlitedatabase)
        {
            Object obj;
            sqlitedatabase = sqlitedatabase.rawQuery("SELECT * FROM datalayer WHERE 0", null);
            obj = new HashSet();
            String as[] = sqlitedatabase.getColumnNames();
            int k = 0;
_L2:
            if (k >= as.length)
            {
                break; /* Loop/switch isn't completed */
            }
            ((Set) (obj)).add(as[k]);
            k++;
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
            bh.W((new StringBuilder()).append("Error querying for table ").append(s).toString());
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
            v.b(arg).getDatabasePath("google_tagmanager.db").delete();
            if (true) goto _L2; else goto _L1
_L1:
        }

        public void onCreate(SQLiteDatabase sqlitedatabase)
        {
            ak.ag(sqlitedatabase.getPath());
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
                sqlitedatabase.execSQL(v.pD());
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

        public void onUpgrade(SQLiteDatabase sqlitedatabase, int k, int l)
        {
        }

        a(Context context, String s)
        {
            arg = v.this;
            super(context, s, null, 1);
        }
    }

    private static class b
    {

        final String KP;
        final byte arj[];

        public String toString()
        {
            return (new StringBuilder()).append("KeyAndSerialized: key = ").append(KP).append(" serialized hash = ").append(Arrays.hashCode(arj)).toString();
        }

        b(String s, byte abyte0[])
        {
            KP = s;
            arj = abyte0;
        }
    }


    private static final String ara = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' STRING NOT NULL, '%s' BLOB NOT NULL, '%s' INTEGER NOT NULL);", new Object[] {
        "datalayer", "ID", "key", "value", "expires"
    });
    private final Executor arb;
    private a arc;
    private int ard;
    private final Context mContext;
    private ld wb;

    public v(Context context)
    {
        this(context, lf._mthif(), "google_tagmanager.db", 2000, ((Executor) (Executors.newSingleThreadExecutor())));
    }

    v(Context context, ld ld1, String s, int k, Executor executor)
    {
        mContext = context;
        wb = ld1;
        ard = k;
        arb = executor;
        arc = new a(mContext, s);
    }

    static List a(v v1)
    {
        return v1.pz();
    }

    static void a(v v1, String s)
    {
        v1.cA(s);
    }

    static void a(v v1, List list, long l)
    {
        v1.b(list, l);
    }

    private SQLiteDatabase al(String s)
    {
        SQLiteDatabase sqlitedatabase;
        try
        {
            sqlitedatabase = arc.getWritableDatabase();
        }
        catch (SQLiteException sqliteexception)
        {
            bh.W(s);
            return null;
        }
        return sqlitedatabase;
    }

    static Context b(v v1)
    {
        return v1.mContext;
    }

    private void b(List list, long l)
    {
        this;
        JVM INSTR monitorenter ;
        long l1 = wb.currentTimeMillis();
        x(l1);
        fI(list.size());
        c(list, l1 + l);
        pC();
        this;
        JVM INSTR monitorexit ;
        return;
        list;
        pC();
        throw list;
        list;
        this;
        JVM INSTR monitorexit ;
        throw list;
    }

    private void c(List list, long l)
    {
        SQLiteDatabase sqlitedatabase = al("Error opening database for writeEntryToDatabase.");
        if (sqlitedatabase != null)
        {
            list = list.iterator();
            while (list.hasNext()) 
            {
                b b1 = (b)list.next();
                ContentValues contentvalues = new ContentValues();
                contentvalues.put("expires", Long.valueOf(l));
                contentvalues.put("key", b1.KP);
                contentvalues.put("value", b1.arj);
                sqlitedatabase.insert("datalayer", null, contentvalues);
            }
        }
    }

    private void cA(String s)
    {
        SQLiteDatabase sqlitedatabase;
        sqlitedatabase = al("Error opening database for clearKeysWithPrefix.");
        if (sqlitedatabase == null)
        {
            return;
        }
        int k = sqlitedatabase.delete("datalayer", "key = ? OR key LIKE ?", new String[] {
            s, (new StringBuilder()).append(s).append(".%").toString()
        });
        bh.V((new StringBuilder()).append("Cleared ").append(k).append(" items").toString());
        pC();
        return;
        SQLiteException sqliteexception;
        sqliteexception;
        bh.W((new StringBuilder()).append("Error deleting entries with key prefix: ").append(s).append(" (").append(sqliteexception).append(").").toString());
        pC();
        return;
        s;
        pC();
        throw s;
    }

    private void fI(int k)
    {
        k = (pB() - ard) + k;
        if (k > 0)
        {
            List list = fJ(k);
            bh.U((new StringBuilder()).append("DataLayer store full, deleting ").append(list.size()).append(" entries to make room.").toString());
            h((String[])list.toArray(new String[0]));
        }
    }

    private List fJ(int k)
    {
        Object obj;
        ArrayList arraylist;
        arraylist = new ArrayList();
        if (k <= 0)
        {
            bh.W("Invalid maxEntries specified. Skipping.");
            return arraylist;
        }
        obj = al("Error opening database for peekEntryIds.");
        if (obj == null)
        {
            return arraylist;
        }
        Object obj1;
        obj1 = String.format("%s ASC", new Object[] {
            "ID"
        });
        String s = Integer.toString(k);
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
        bh.W((new StringBuilder()).append("Error in peekEntries fetching entryIds: ").append(sqliteexception.getMessage()).toString());
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

    private void h(String as[])
    {
        SQLiteDatabase sqlitedatabase;
        if (as != null && as.length != 0)
        {
            if ((sqlitedatabase = al("Error opening database for deleteEntries.")) != null)
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
                    bh.W((new StringBuilder()).append("Error deleting entries ").append(Arrays.toString(as)).toString());
                }
                return;
            }
        }
    }

    private List i(List list)
    {
        ArrayList arraylist = new ArrayList();
        b b1;
        for (list = list.iterator(); list.hasNext(); arraylist.add(new DataLayer.a(b1.KP, j(b1.arj))))
        {
            b1 = (b)list.next();
        }

        return arraylist;
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

    private List j(List list)
    {
        ArrayList arraylist = new ArrayList();
        DataLayer.a a1;
        for (list = list.iterator(); list.hasNext(); arraylist.add(new b(a1.KP, m(a1.wF))))
        {
            a1 = (DataLayer.a)list.next();
        }

        return arraylist;
    }

    private byte[] m(Object obj)
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

    private List pA()
    {
        Object obj;
        Object obj1;
        obj1 = al("Error opening database for loadSerialized.");
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

    private int pB()
    {
        Cursor cursor;
        Object obj;
        Object obj1;
        int k;
        int l;
        obj = null;
        cursor = null;
        k = 0;
        l = 0;
        obj1 = al("Error opening database for getNumStoredEntries.");
        if (obj1 != null) goto _L2; else goto _L1
_L1:
        return l;
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
        long l1 = ((Cursor) (obj1)).getLong(0);
        k = (int)l1;
        l = k;
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
            return k;
        }
        if (true) goto _L1; else goto _L3
_L3:
        obj;
        obj = cursor;
        bh.W("Error getting numStoredEntries");
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

    private void pC()
    {
        try
        {
            arc.close();
            return;
        }
        catch (SQLiteException sqliteexception)
        {
            return;
        }
    }

    static String pD()
    {
        return ara;
    }

    private List pz()
    {
        List list;
        x(wb.currentTimeMillis());
        list = i(pA());
        pC();
        return list;
        Exception exception;
        exception;
        pC();
        throw exception;
    }

    private void x(long l)
    {
        SQLiteDatabase sqlitedatabase = al("Error opening database for deleteOlderThan.");
        if (sqlitedatabase == null)
        {
            return;
        }
        try
        {
            int k = sqlitedatabase.delete("datalayer", "expires <= ?", new String[] {
                Long.toString(l)
            });
            bh.V((new StringBuilder()).append("Deleted ").append(k).append(" expired items").toString());
            return;
        }
        catch (SQLiteException sqliteexception)
        {
            bh.W("Error deleting old entries.");
        }
    }

    public void a(DataLayer.c.a a1)
    {
        arb.execute(new Runnable(a1) {

            final v arg;
            final DataLayer.c.a arh;

            public void run()
            {
                arh.h(v.a(arg));
            }

            
            {
                arg = v.this;
                arh = a1;
                super();
            }
        });
    }

    public void a(List list, long l)
    {
        list = j(list);
        arb.execute(new Runnable(list, l) {

            final List are;
            final long arf;
            final v arg;

            public void run()
            {
                v.a(arg, are, arf);
            }

            
            {
                arg = v.this;
                are = list;
                arf = l;
                super();
            }
        });
    }

    public void cz(String s)
    {
        arb.execute(new Runnable(s) {

            final v arg;
            final String ari;

            public void run()
            {
                v.a(arg, ari);
            }

            
            {
                arg = v.this;
                ari = s;
                super();
            }
        });
    }

}
