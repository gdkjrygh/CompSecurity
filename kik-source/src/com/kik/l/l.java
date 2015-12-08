// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.l;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kik.a.d.j;
import kik.a.d.k;
import kik.a.d.n;
import org.c.b;
import org.c.c;

// Referenced classes of package com.kik.l:
//            e, m, aa, n

public final class l
{

    private static final b a = org.c.c.a("ContactsStorage");
    private final SQLiteOpenHelper b;
    private final int c = 19;

    public l(SQLiteOpenHelper sqliteopenhelper)
    {
        b = sqliteopenhelper;
    }

    private Hashtable a(boolean flag)
    {
        Hashtable hashtable = new Hashtable();
        SQLiteOpenHelper sqliteopenhelper = b;
        sqliteopenhelper;
        JVM INSTR monitorenter ;
        Object obj2;
        Object obj3;
        Object obj4;
        obj4 = new HashMap();
        obj2 = b.getWritableDatabase();
        obj3 = (e)e.a(((SQLiteDatabase) (obj2)), com/kik/l/e, "KIKcontactsTable");
        Object obj;
        Object obj1;
        obj1 = obj3;
        obj = obj2;
        if (c < c)
        {
            break MISSING_BLOCK_LABEL_113;
        }
        obj1 = obj3;
        obj = obj2;
        if (((e) (obj3)).getColumnCount() < 12)
        {
            ((e) (obj3)).close();
            ((SQLiteDatabase) (obj2)).close();
            obj = b.getWritableDatabase();
            obj1 = (e)e.a(((SQLiteDatabase) (obj)), com/kik/l/e, "KIKcontactsTable");
        }
        Iterator iterator;
        ((e) (obj1)).a(new m(this, flag, hashtable));
        ((aa)aa.a(((SQLiteDatabase) (obj)), com/kik/l/aa, "memberTable")).a(new com.kik.l.n(this, ((Map) (obj4))));
        iterator = ((Map) (obj4)).entrySet().iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        String s;
        kik.a.d.n.a a1;
        obj = (java.util.Map.Entry)iterator.next();
        s = (String)((java.util.Map.Entry) (obj)).getKey();
        a1 = (kik.a.d.n.a)((java.util.Map.Entry) (obj)).getValue();
        if (s == null) goto _L4; else goto _L3
_L3:
        k k1 = (k)hashtable.get(s);
        boolean flag2;
        flag = true;
        flag2 = false;
        obj4 = null;
        obj = null;
        obj3 = null;
        obj2 = null;
        if (k1 == null)
        {
            break MISSING_BLOCK_LABEL_384;
        }
        boolean flag1;
        obj1 = k1.c();
        flag1 = k1.p();
        obj = obj1;
        flag = flag1;
        boolean flag3;
        if (!(k1 instanceof n))
        {
            break MISSING_BLOCK_LABEL_384;
        }
        flag2 = ((n)k1).A();
        flag3 = ((n)k1).B();
        obj4 = ((n)k1).J();
        obj3 = ((n)k1).r();
        obj2 = ((n)k1).s();
        flag = flag1;
        obj = obj1;
_L5:
        obj = new n(j.a(s), ((String) (obj)), a1, false, flag, flag2, ((String) (obj2)), ((String) (obj3)), ((String) (obj4)));
        ((n) (obj)).i(flag3);
        hashtable.put(s, obj);
          goto _L4
        Exception exception;
        exception;
        sqliteopenhelper;
        JVM INSTR monitorexit ;
        throw exception;
_L2:
        sqliteopenhelper;
        JVM INSTR monitorexit ;
        return hashtable;
        flag3 = false;
          goto _L5
    }

    public final Cursor a(String s)
    {
        synchronized (b)
        {
            s = b.getWritableDatabase().rawQuery(String.format("SELECT %4$s._id, display_name as %1$s, user_name as %2$s, jid as %3$s FROM %4$s join %5$s ON jid = bin_id WHERE %6$s GROUP BY jid ORDER BY timestamp DESC, display_name COLLATE NOCASE COLLATE LOCALIZED ASC LIMIT %7$s", new Object[] {
                "suggest_text_1", "suggest_text_2", "suggest_intent_data_id", "KIKcontactsTable", "messagesTable", s, Integer.valueOf(7)
            }), null);
        }
        return s;
        s;
        sqliteopenhelper;
        JVM INSTR monitorexit ;
        throw s;
    }

    public final Cursor a(String s, String as[])
    {
        synchronized (b)
        {
            s = b.getWritableDatabase().rawQuery(String.format("SELECT _id, display_name as %s, user_name as %s, jid as %s FROM %s WHERE %s ORDER BY display_name COLLATE NOCASE COLLATE LOCALIZED ASC", new Object[] {
                "suggest_text_1", "suggest_text_2", "suggest_intent_data_id", "KIKcontactsTable", s
            }), as);
        }
        return s;
        s;
        sqliteopenhelper;
        JVM INSTR monitorexit ;
        throw s;
    }

    public final Hashtable a()
    {
        return a(false);
    }

    public final boolean a(List list)
    {
        SQLiteOpenHelper sqliteopenhelper = b;
        sqliteopenhelper;
        JVM INSTR monitorenter ;
        SQLiteDatabase sqlitedatabase = b.getWritableDatabase();
        sqlitedatabase.beginTransaction();
        list = list.iterator();
_L4:
        if (!list.hasNext()) goto _L2; else goto _L1
_L1:
        String s;
        Object obj;
        obj = (k)list.next();
        s = ((k) (obj)).b();
        if (s == null) goto _L4; else goto _L3
_L3:
        obj = e.a(((k) (obj)));
        if (sqlitedatabase.update("KIKcontactsTable", ((ContentValues) (obj)), (new StringBuilder("jid ='")).append(s).append("'").toString(), null) == 0)
        {
            sqlitedatabase.insert("KIKcontactsTable", null, ((ContentValues) (obj)));
        }
          goto _L4
        list;
        (new StringBuilder("Kikcontact update failed:")).append(list.getMessage());
        boolean flag = false;
        sqlitedatabase.endTransaction();
_L5:
        sqliteopenhelper;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        flag = true;
          goto _L5
        list;
        sqlitedatabase.endTransaction();
        throw list;
        list;
        sqliteopenhelper;
        JVM INSTR monitorexit ;
        throw list;
    }

    public final boolean a(k k1)
    {
label0:
        {
            boolean flag;
            synchronized (b)
            {
                if (!(k1 instanceof n))
                {
                    break label0;
                }
                ArrayList arraylist = new ArrayList();
                arraylist.add((n)k1);
                flag = b(arraylist);
            }
            return flag;
        }
        boolean flag1;
        ArrayList arraylist1 = new ArrayList();
        arraylist1.add(k1);
        flag1 = a(((List) (arraylist1)));
        sqliteopenhelper;
        JVM INSTR monitorexit ;
        return flag1;
        k1;
        sqliteopenhelper;
        JVM INSTR monitorexit ;
        throw k1;
    }

    public final Hashtable b()
    {
        return a(true);
    }

    public final k b(String s)
    {
        Object obj = null;
        SQLiteOpenHelper sqliteopenhelper = b;
        sqliteopenhelper;
        JVM INSTR monitorenter ;
        SQLiteDatabase sqlitedatabase = b.getWritableDatabase();
        s = (e)e.a(sqlitedatabase, com/kik/l/e, "KIKcontactsTable", "user_name=? COLLATE NOCASE", new String[] {
            s
        });
        boolean flag = s.moveToFirst();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        s.close();
        sqliteopenhelper;
        JVM INSTR monitorexit ;
        return null;
        obj = s.a();
        s.close();
        sqliteopenhelper;
        JVM INSTR monitorexit ;
        return ((k) (obj));
_L2:
        ((e) (obj)).close();
        throw s;
        s;
        sqliteopenhelper;
        JVM INSTR monitorexit ;
        throw s;
        Exception exception;
        exception;
        obj = s;
        s = exception;
        continue; /* Loop/switch isn't completed */
        s;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final boolean b(List list)
    {
        SQLiteOpenHelper sqliteopenhelper = b;
        sqliteopenhelper;
        JVM INSTR monitorenter ;
        SQLiteDatabase sqlitedatabase = b.getWritableDatabase();
        Iterator iterator;
        sqlitedatabase.beginTransaction();
        iterator = list.iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        String s;
        n n1;
        List list1;
        Object obj;
        n1 = (n)iterator.next();
        s = n1.b();
        obj = n1.w();
        list1 = n1.y();
        if (s == null) goto _L4; else goto _L3
_L3:
        sqlitedatabase.delete("memberTable", (new StringBuilder("group_id ='")).append(s).append("'").toString(), null);
        obj = ((List) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            String s2 = (String)((Iterator) (obj)).next();
            ContentValues contentvalues1 = new ContentValues();
            contentvalues1.put("group_id", s);
            contentvalues1.put("member_jid", s2);
            contentvalues1.put("is_admin", Boolean.valueOf(n1.g(s2)));
            contentvalues1.put("is_banned", Boolean.valueOf(false));
            if (sqlitedatabase.update("memberTable", contentvalues1, (new StringBuilder("group_id ='")).append(s).append("' AND member_jid = '").append(s2).append("'").toString(), null) == 0)
            {
                sqlitedatabase.insert("memberTable", null, contentvalues1);
            }
        } while (true);
          goto _L5
        Exception exception;
        exception;
        (new StringBuilder("KikGroup update failed:")).append(exception.getMessage());
        sqlitedatabase.endTransaction();
        boolean flag = false;
_L6:
        a(new ArrayList(list));
        sqliteopenhelper;
        JVM INSTR monitorexit ;
        return flag;
_L5:
        Iterator iterator1 = list1.iterator();
        while (iterator1.hasNext()) 
        {
            String s1 = (String)iterator1.next();
            ContentValues contentvalues = new ContentValues();
            contentvalues.put("group_id", s);
            contentvalues.put("member_jid", s1);
            contentvalues.put("is_admin", Boolean.valueOf(false));
            contentvalues.put("is_banned", Boolean.valueOf(true));
            if (sqlitedatabase.update("memberTable", contentvalues, (new StringBuilder("group_id ='")).append(s).append("' AND member_jid = '").append(s1).append("'").toString(), null) == 0)
            {
                sqlitedatabase.insert("memberTable", null, contentvalues);
            }
        }
          goto _L4
        list;
        sqlitedatabase.endTransaction();
        throw list;
        list;
        sqliteopenhelper;
        JVM INSTR monitorexit ;
        throw list;
_L2:
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        flag = true;
          goto _L6
    }

    public final boolean c(String s)
    {
        boolean flag1 = true;
        SQLiteOpenHelper sqliteopenhelper = b;
        sqliteopenhelper;
        JVM INSTR monitorenter ;
        SQLiteDatabase sqlitedatabase = b.getWritableDatabase();
        boolean flag;
        flag = flag1;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        sqlitedatabase.delete("KIKcontactsTable", "jid = ?", new String[] {
            s
        });
        flag = flag1;
_L1:
        sqliteopenhelper;
        JVM INSTR monitorexit ;
        return flag;
        s;
        (new StringBuilder("deleteKIKContact failed: ")).append(s.getMessage());
        flag = false;
          goto _L1
        s;
        throw s;
        s;
        sqliteopenhelper;
        JVM INSTR monitorexit ;
        throw s;
    }

}
