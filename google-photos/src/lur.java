// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

final class lur
    implements lpz
{

    private static final String a = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' STRING NOT NULL, '%s' BLOB NOT NULL, '%s' INTEGER NOT NULL);", new Object[] {
        "datalayer", "ID", "key", "value", "expires"
    });
    private final Executor b;
    private final Context c;
    private luv d;
    private kdh e;
    private int f;

    public lur(Context context)
    {
        this(context, kdj.c(), "google_tagmanager.db", 2000, ((Executor) (Executors.newSingleThreadExecutor())));
    }

    private lur(Context context, kdh kdh1, String s, int i, Executor executor)
    {
        c = context;
        e = kdh1;
        f = 2000;
        b = executor;
        d = new luv(this, c, s);
    }

    private static Object a(byte abyte0[])
    {
        ByteArrayInputStream bytearrayinputstream = new ByteArrayInputStream(abyte0);
        abyte0 = new ObjectInputStream(bytearrayinputstream);
        Object obj = abyte0.readObject();
        try
        {
            abyte0.close();
            bytearrayinputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            return obj;
        }
        return obj;
        abyte0;
        abyte0 = null;
_L8:
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_44;
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
            break MISSING_BLOCK_LABEL_64;
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
            break MISSING_BLOCK_LABEL_84;
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
    }

    static String a()
    {
        return a;
    }

    private List a(int i)
    {
        Object obj;
        ArrayList arraylist;
        arraylist = new ArrayList();
        if (i <= 0)
        {
            lqh.b("Invalid maxEntries specified. Skipping.");
            return arraylist;
        }
        obj = b("Error opening database for peekEntryIds.");
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
        lqh.b((new StringBuilder("Error in peekEntries fetching entryIds: ")).append(sqliteexception.getMessage()).toString());
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

    static List a(lur lur1)
    {
        return lur1.b();
    }

    private void a(long l)
    {
        SQLiteDatabase sqlitedatabase = b("Error opening database for deleteOlderThan.");
        if (sqlitedatabase == null)
        {
            return;
        }
        try
        {
            int i = sqlitedatabase.delete("datalayer", "expires <= ?", new String[] {
                Long.toString(l)
            });
            lqh.d((new StringBuilder("Deleted ")).append(i).append(" expired items").toString());
            return;
        }
        catch (SQLiteException sqliteexception)
        {
            lqh.b("Error deleting old entries.");
        }
    }

    static void a(lur lur1, String s)
    {
        SQLiteDatabase sqlitedatabase;
        sqlitedatabase = lur1.b("Error opening database for clearKeysWithPrefix.");
        if (sqlitedatabase == null)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        int i = sqlitedatabase.delete("datalayer", "key = ? OR key LIKE ?", new String[] {
            s, (new StringBuilder()).append(s).append(".%").toString()
        });
        lqh.d((new StringBuilder("Cleared ")).append(i).append(" items").toString());
        lur1.e();
        return;
        SQLiteException sqliteexception;
        sqliteexception;
        lqh.b((new StringBuilder("Error deleting entries with key prefix: ")).append(s).append(" (").append(sqliteexception).append(").").toString());
        lur1.e();
        return;
        s;
        lur1.e();
        throw s;
    }

    static void a(lur lur1, List list, long l)
    {
        lur1.b(list, l);
    }

    private void a(String as[])
    {
        SQLiteDatabase sqlitedatabase;
        if (as != null && as.length != 0)
        {
            if ((sqlitedatabase = b("Error opening database for deleteEntries.")) != null)
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
                    lqh.b((new StringBuilder("Error deleting entries ")).append(Arrays.toString(as)).toString());
                }
                return;
            }
        }
    }

    private static byte[] a(Object obj)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        ObjectOutputStream objectoutputstream = new ObjectOutputStream(bytearrayoutputstream);
        objectoutputstream.writeObject(obj);
        obj = bytearrayoutputstream.toByteArray();
        IOException ioexception;
        try
        {
            objectoutputstream.close();
            bytearrayoutputstream.close();
        }
        catch (IOException ioexception1)
        {
            return ((byte []) (obj));
        }
        return ((byte []) (obj));
        obj;
        objectoutputstream = null;
_L6:
        if (objectoutputstream == null)
        {
            break MISSING_BLOCK_LABEL_48;
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
            break MISSING_BLOCK_LABEL_68;
        }
        objectoutputstream.close();
        bytearrayoutputstream.close();
_L2:
        throw obj;
        ioexception;
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        if (true) goto _L4; else goto _L3
_L3:
        obj;
        if (true) goto _L6; else goto _L5
_L5:
    }

    static Context b(lur lur1)
    {
        return lur1.c;
    }

    private SQLiteDatabase b(String s)
    {
        SQLiteDatabase sqlitedatabase;
        try
        {
            sqlitedatabase = d.getWritableDatabase();
        }
        catch (SQLiteException sqliteexception)
        {
            lqh.b(s);
            return null;
        }
        return sqlitedatabase;
    }

    private List b()
    {
        Object obj;
        a(e.a());
        Object obj1 = c();
        obj = new ArrayList();
        luw luw1;
        for (obj1 = ((List) (obj1)).iterator(); ((Iterator) (obj1)).hasNext(); ((List) (obj)).add(new lpx(luw1.a, a(luw1.b))))
        {
            luw1 = (luw)((Iterator) (obj1)).next();
        }

        break MISSING_BLOCK_LABEL_87;
        obj;
        e();
        throw obj;
        e();
        return ((List) (obj));
    }

    private void b(List list, long l)
    {
        this;
        JVM INSTR monitorenter ;
        int i;
        long l1;
        l1 = e.a();
        a(l1);
        i = list.size() + (d() - f);
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        List list1 = a(i);
        lqh.c((new StringBuilder("DataLayer store full, deleting ")).append(list1.size()).append(" entries to make room.").toString());
        a((String[])list1.toArray(new String[0]));
        c(list, l1 + l);
        e();
        this;
        JVM INSTR monitorexit ;
        return;
        list;
        e();
        throw list;
        list;
        this;
        JVM INSTR monitorexit ;
        throw list;
    }

    private List c()
    {
        Object obj;
        Object obj1;
        obj1 = b("Error opening database for loadSerialized.");
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
            ((List) (obj)).add(new luw(((Cursor) (obj1)).getString(0), ((Cursor) (obj1)).getBlob(1)));
        }
        break MISSING_BLOCK_LABEL_99;
        obj;
        ((Cursor) (obj1)).close();
        throw obj;
        ((Cursor) (obj1)).close();
        return ((List) (obj));
    }

    private void c(List list, long l)
    {
        SQLiteDatabase sqlitedatabase = b("Error opening database for writeEntryToDatabase.");
        if (sqlitedatabase != null)
        {
            list = list.iterator();
            while (list.hasNext()) 
            {
                luw luw1 = (luw)list.next();
                ContentValues contentvalues = new ContentValues();
                contentvalues.put("expires", Long.valueOf(l));
                contentvalues.put("key", luw1.a);
                contentvalues.put("value", luw1.b);
                sqlitedatabase.insert("datalayer", null, contentvalues);
            }
        }
    }

    private int d()
    {
        Cursor cursor;
        Object obj;
        Object obj1;
        int i;
        int j;
        obj = null;
        cursor = null;
        i = 0;
        j = 0;
        obj1 = b("Error opening database for getNumStoredEntries.");
        if (obj1 != null) goto _L2; else goto _L1
_L1:
        return j;
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
        j = i;
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
            return i;
        }
        if (true) goto _L1; else goto _L3
_L3:
        obj;
        obj = cursor;
        lqh.b("Error getting numStoredEntries");
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

    private void e()
    {
        try
        {
            d.close();
            return;
        }
        catch (SQLiteException sqliteexception)
        {
            return;
        }
    }

    public final void a(String s)
    {
        b.execute(new luu(this, s));
    }

    public final void a(List list, long l)
    {
        ArrayList arraylist = new ArrayList();
        lpx lpx1;
        for (list = list.iterator(); list.hasNext(); arraylist.add(new luw(lpx1.a, a(lpx1.b))))
        {
            lpx1 = (lpx)list.next();
        }

        b.execute(new lus(this, arraylist, l));
    }

    public final void a(lqa lqa)
    {
        b.execute(new lut(this, lqa));
    }

}
