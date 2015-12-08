// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.ui.app.market.storage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.cleanmaster.ui.app.market.Ad;
import com.cleanmaster.ui.app.market.d;
import com.cleanmaster.ui.app.market.data.MarketResponse;
import com.cleanmaster.ui.app.market.data.a;
import com.picksinit.PicksMob;
import com.picksinit.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.cleanmaster.ui.app.market.storage:
//            a

public class MarketStorage
{

    private static boolean a = false;
    private static MarketStorage b = new MarketStorage();
    private com.cleanmaster.ui.app.market.storage.a c;

    private MarketStorage()
    {
        c = new com.cleanmaster.ui.app.market.storage.a(PicksMob.getInstance().getContext());
    }

    public static MarketStorage a()
    {
        return b;
    }

    public static boolean a(SQLiteDatabase sqlitedatabase, String s)
    {
        SQLiteDatabase sqlitedatabase1;
        boolean flag;
        sqlitedatabase1 = null;
        flag = true;
        sqlitedatabase = sqlitedatabase.rawQuery(String.format("SELECT * FROM sqlite_master WHERE type='table' AND name='%s';", new Object[] {
            s
        }), null);
        if (sqlitedatabase == null) goto _L2; else goto _L1
_L1:
        sqlitedatabase1 = sqlitedatabase;
        int i = sqlitedatabase.getCount();
        if (i <= 0) goto _L2; else goto _L3
_L3:
        if (sqlitedatabase != null)
        {
            sqlitedatabase.close();
        }
        return flag;
_L2:
        flag = false;
        if (true) goto _L3; else goto _L4
_L4:
        sqlitedatabase;
        sqlitedatabase = null;
_L6:
        if (sqlitedatabase != null)
        {
            sqlitedatabase.close();
        }
        return false;
        sqlitedatabase;
        if (sqlitedatabase1 != null)
        {
            sqlitedatabase1.close();
        }
        throw sqlitedatabase;
        s;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private SQLiteDatabase c()
    {
        SQLiteDatabase sqlitedatabase;
        try
        {
            sqlitedatabase = c.getWritableDatabase();
        }
        catch (Exception exception)
        {
            a(exception);
            return null;
        }
        return sqlitedatabase;
    }

    public int a(String s, List list)
    {
        this;
        JVM INSTR monitorenter ;
        SQLiteDatabase sqlitedatabase = c();
        if (sqlitedatabase != null) goto _L2; else goto _L1
_L1:
        int i = -1;
_L6:
        this;
        JVM INSTR monitorexit ;
        return i;
_L2:
        String s1 = (new StringBuilder("tbl_")).append(s).toString();
        int j;
        boolean flag;
        flag = false;
        i = 0;
        j = ((flag) ? 1 : 0);
        sqlitedatabase.beginTransaction();
        j = ((flag) ? 1 : 0);
        Ad.createTable(sqlitedatabase, s1);
        j = ((flag) ? 1 : 0);
        list = list.iterator();
_L4:
        j = i;
        if (!list.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        j = i;
        if (sqlitedatabase.insert(s1, "", ((Ad)list.next()).toContentValues(s)) > 0L)
        {
            i++;
        }
        if (true) goto _L4; else goto _L3
_L3:
        j = i;
        sqlitedatabase.setTransactionSuccessful();
        try
        {
            sqlitedatabase.endTransaction();
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        finally
        {
            this;
        }
        a(((Exception) (s)));
        continue; /* Loop/switch isn't completed */
        throw s;
        s;
        a(((Exception) (s)));
        sqlitedatabase.endTransaction();
        i = j;
        continue; /* Loop/switch isn't completed */
        s;
        a(((Exception) (s)));
        i = j;
        if (true) goto _L6; else goto _L5
_L5:
        s;
        sqlitedatabase.endTransaction();
_L7:
        throw s;
        list;
        a(((Exception) (list)));
          goto _L7
    }

    public long a(String s, MarketResponse marketresponse)
    {
        long l1 = -1L;
        this;
        JVM INSTR monitorenter ;
        SQLiteDatabase sqlitedatabase = c();
        if (sqlitedatabase != null) goto _L2; else goto _L1
_L1:
        long l = l1;
_L4:
        this;
        JVM INSTR monitorexit ;
        return l;
_L2:
        l = l1;
        marketresponse.getHeader().h = s;
        l = l1;
        marketresponse = marketresponse.getHeader().a(s);
        l = l1;
        l1 = sqlitedatabase.update("tbl_market_globel_property", marketresponse, "pos_id = ?", new String[] {
            s
        });
        l = l1;
        if (l1 != 0L)
        {
            continue; /* Loop/switch isn't completed */
        }
        l = l1;
        l1 = sqlitedatabase.insert("tbl_market_globel_property", null, marketresponse);
        l = l1;
        continue; /* Loop/switch isn't completed */
        s;
        a(((Exception) (s)));
        if (true) goto _L4; else goto _L3
_L3:
        s;
        throw s;
    }

    public List a(String s, String as[], String s1, String as1[])
    {
        this;
        JVM INSTR monitorenter ;
        ArrayList arraylist;
        SQLiteDatabase sqlitedatabase;
        arraylist = new ArrayList();
        sqlitedatabase = c();
        if (sqlitedatabase != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return arraylist;
_L2:
        String s2;
        boolean flag;
        s2 = (new StringBuilder("tbl_")).append(s).toString();
        flag = a(sqlitedatabase, s2);
        if (!flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        s1 = sqlitedatabase.query(s2, as, s1, as1, null, null, null);
        if (s1 == null) goto _L4; else goto _L3
_L3:
        as = s1;
        if (s1.getCount() <= 0) goto _L4; else goto _L5
_L5:
        as = s1;
        s1.moveToFirst();
_L6:
        as = s1;
        arraylist.add((new Ad()).fromCursor(s1));
        as = s1;
        flag = s1.moveToNext();
        if (flag) goto _L6; else goto _L4
_L4:
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_147;
        }
        s1.close();
_L9:
        if (com.cleanmaster.ui.app.market.transport.CmMarketHttpClient.MarketRequestBuilder.isAppRequest(s))
        {
            d.a(arraylist);
        }
        if (true) goto _L1; else goto _L7
_L7:
        as1;
        s1 = null;
_L12:
        as = s1;
        a(((Exception) (as1)));
        if (s1 == null) goto _L9; else goto _L8
_L8:
        s1.close();
          goto _L9
        s;
        throw s;
        s;
        as = null;
_L11:
        if (as == null)
        {
            break MISSING_BLOCK_LABEL_205;
        }
        as.close();
        throw s;
        s;
        if (true) goto _L11; else goto _L10
_L10:
        as1;
          goto _L12
    }

    public void a(Exception exception)
    {
        if (a)
        {
            throw new RuntimeException(exception);
        } else
        {
            exception.printStackTrace();
            return;
        }
    }

    public void a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        SQLiteDatabase sqlitedatabase = c();
        if (sqlitedatabase != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        try
        {
            sqlitedatabase.delete("tbl_market_globel_property", "pos_id = ?", new String[] {
                s
            });
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        finally
        {
            this;
        }
        s.printStackTrace();
        if (true) goto _L1; else goto _L3
_L3:
        throw s;
    }

    public boolean a(long l)
    {
        boolean flag = false;
        this;
        JVM INSTR monitorenter ;
        SQLiteDatabase sqlitedatabase;
        Object obj;
        obj = b();
        sqlitedatabase = c();
        if (sqlitedatabase != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        client.core.model.a a1 = new client.core.model.a();
        long l1 = System.currentTimeMillis();
        obj = ((ArrayList) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            a a2 = (a)((Iterator) (obj)).next();
            if (l1 - a2.g > l)
            {
                a1.a().a("removeRecentCache");
                String s = a2.h;
                com.cleanmaster.ui.app.market.storage.a.a(sqlitedatabase, (new StringBuilder("tbl_")).append(s).toString());
                a1.a(String.format("START DROP '%s' (EXPIRED=%d)", new Object[] {
                    a2.h, Long.valueOf(l1 - a2.g)
                }));
                a(a2.h);
                a1.a((new StringBuilder("deleteMarketResponseHeader(")).append(a2.h).append(")").toString());
            }
        } while (true);
        break MISSING_BLOCK_LABEL_205;
        Exception exception;
        exception;
        throw exception;
        flag = true;
        if (true) goto _L1; else goto _L3
_L3:
    }

    public ArrayList b()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        ArrayList arraylist;
        arraylist = new ArrayList();
        obj = c();
        if (obj != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return arraylist;
_L2:
        Cursor cursor = ((SQLiteDatabase) (obj)).query("tbl_market_globel_property", null, null, null, null, null, null);
        if (cursor == null) goto _L4; else goto _L3
_L3:
        obj = cursor;
        if (cursor.getCount() <= 0) goto _L4; else goto _L5
_L5:
        obj = cursor;
        cursor.moveToFirst();
_L6:
        obj = cursor;
        arraylist.add((new a()).a(cursor));
        obj = cursor;
        boolean flag = cursor.moveToNext();
        if (flag) goto _L6; else goto _L4
_L4:
        if (cursor == null) goto _L1; else goto _L7
_L7:
        cursor.close();
          goto _L1
        Exception exception1;
        exception1;
        cursor = null;
_L11:
        obj = cursor;
        a(exception1);
        if (cursor == null) goto _L1; else goto _L8
_L8:
        cursor.close();
          goto _L1
        obj;
        throw obj;
        Exception exception;
        exception;
        obj = null;
_L10:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_150;
        }
        ((Cursor) (obj)).close();
        throw exception;
        exception;
        if (true) goto _L10; else goto _L9
_L9:
        exception1;
          goto _L11
    }

    public void b(String s)
    {
        this;
        JVM INSTR monitorenter ;
        SQLiteDatabase sqlitedatabase;
        s = (new StringBuilder("tbl_")).append(s).toString();
        sqlitedatabase = c();
        if (sqlitedatabase != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        com.cleanmaster.ui.app.market.storage.a.a(sqlitedatabase, s);
        if (true) goto _L1; else goto _L3
_L3:
        s;
        throw s;
    }

    public int c(String s)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = c();
        if (obj != null) goto _L2; else goto _L1
_L1:
        int i = 0;
_L4:
        this;
        JVM INSTR monitorexit ;
        return i;
_L2:
        s = (new StringBuilder("tbl_")).append(s).toString();
        if (!a(((SQLiteDatabase) (obj)), s))
        {
            i = 0;
            continue; /* Loop/switch isn't completed */
        }
        obj = ((SQLiteDatabase) (obj)).query(s, new String[] {
            "_id"
        }, "_id", null, null, null, null);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_124;
        }
        s = ((String) (obj));
        if (((Cursor) (obj)).getCount() <= 0)
        {
            break MISSING_BLOCK_LABEL_124;
        }
        s = ((String) (obj));
        int j = ((Cursor) (obj)).getCount();
        i = j;
        if (obj == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        ((Cursor) (obj)).close();
        i = j;
        continue; /* Loop/switch isn't completed */
        s;
        throw s;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_134;
        }
        ((Cursor) (obj)).close();
_L6:
        i = 0;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception1;
        exception1;
        obj = null;
_L8:
        s = ((String) (obj));
        a(exception1);
        if (obj == null) goto _L6; else goto _L5
_L5:
        ((Cursor) (obj)).close();
          goto _L6
_L7:
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_173;
        }
        s.close();
        Exception exception;
        throw exception;
        exception;
          goto _L7
        exception1;
          goto _L8
        exception;
        s = null;
          goto _L7
    }

}
