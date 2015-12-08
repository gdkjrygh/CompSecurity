// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.l;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import kik.a.d.a.a;
import kik.a.d.a.g;
import kik.a.d.d;
import kik.a.d.o;
import kik.a.d.s;
import kik.a.e.v;
import kik.android.f.a.f;
import kik.android.util.bx;
import org.c.b;
import org.c.c;

// Referenced classes of package com.kik.l:
//            ad, af, o, ag, 
//            as, ah, z, ai, 
//            ao, aj, ak

public final class ae
{

    private static final b a = org.c.c.a("MessageStorage");
    private static File c;
    private static File d;
    private final SQLiteOpenHelper b;
    private File e;
    private v f;

    public ae(SQLiteOpenHelper sqliteopenhelper, File file, File file1, File file2, v v1)
    {
        b = sqliteopenhelper;
        c = file;
        d = file1;
        e = file2;
        f = v1;
    }

    private void a(String s1, int i, boolean flag)
    {
        SQLiteDatabase sqlitedatabase = b.getWritableDatabase();
        if (flag)
        {
            ContentValues contentvalues = new ContentValues(2);
            contentvalues.put("content_id", s1);
            contentvalues.put("retain_count", Integer.valueOf(i));
            sqlitedatabase.insert("KIKContentRetainCountTable", null, contentvalues);
            return;
        } else
        {
            ContentValues contentvalues1 = new ContentValues(2);
            contentvalues1.put("retain_count", Integer.valueOf(i));
            sqlitedatabase.update("KIKContentRetainCountTable", contentvalues1, (new StringBuilder("content_id=\"")).append(s1).append("\"").toString(), null);
            return;
        }
    }

    private int c(String s1)
    {
        int i = -500;
        s1 = b.getWritableDatabase().rawQuery(String.format("SELECT `retain_count` FROM %s WHERE `content_id`=\"%s\"", new Object[] {
            "KIKContentRetainCountTable", s1
        }), null);
        if (s1.moveToNext())
        {
            i = s1.getInt(s1.getColumnIndex("retain_count"));
        }
        s1.close();
        return i;
    }

    private void d(String s1)
    {
        File file = new File(e, (new StringBuilder()).append(s1).append(".jpg").toString());
        if (file.exists())
        {
            file.delete();
        }
        file = new File(c, (new StringBuilder()).append(s1).append(".jpg").toString());
        if (file.exists())
        {
            file.delete();
        }
        s1 = new File(d, s1);
        if (s1.exists())
        {
            s1.delete();
        }
    }

    private void e(String s1)
    {
        boolean flag = false;
        int j = c(s1);
        int i;
        if (j == -500)
        {
            i = 0;
        } else
        {
            i = j;
        }
        if (j == -500)
        {
            flag = true;
        }
        a(s1, i + 1, flag);
    }

    private int f(String s1)
    {
        boolean flag = true;
        int j = c(s1);
        int i;
        int k;
        if (j == -500)
        {
            i = 1;
        } else
        {
            i = j;
        }
        k = i - 1;
        i = k;
        if (k < 0)
        {
            i = 0;
        }
        if (j != -500)
        {
            flag = false;
        }
        a(s1, i, flag);
        return i;
    }

    public final Hashtable a()
    {
        Object obj;
        Hashtable hashtable;
        HashMap hashmap;
        HashMap hashmap1;
        obj = null;
        hashtable = new Hashtable();
        hashmap1 = new HashMap();
        hashmap = new HashMap();
        SQLiteOpenHelper sqliteopenhelper = b;
        sqliteopenhelper;
        JVM INSTR monitorenter ;
        SQLiteDatabase sqlitedatabase = b.getWritableDatabase();
        Cursor cursor = sqlitedatabase.query("messagesTable", null, null, null, null, null, "bin_id,_id");
        Object obj1;
        obj = cursor;
        obj1 = cursor;
        (new ad(cursor)).a(new af(this, hashtable, hashmap1, hashmap));
        obj = cursor;
        obj1 = cursor;
        cursor = sqlitedatabase.query("KIKContentTable", null, null, null, null, null, "content_id");
        obj = cursor;
        obj1 = cursor;
        (new com.kik.l.o(cursor)).a(new ag(this, hashmap1));
        obj = cursor;
        obj1 = cursor;
        cursor = sqlitedatabase.query("KIKContentURITable", null, null, null, null, null, "content_id");
        obj = cursor;
        obj1 = cursor;
        (new as(cursor)).a(new ah(this, hashmap1));
        obj = cursor;
        obj1 = cursor;
        cursor = sqlitedatabase.query("KikFriendAttributionTableName", null, null, null, null, null, "timestamp");
        obj = cursor;
        obj1 = obj;
        (new z(((Cursor) (obj)))).a(new ai(this, hashmap, new HashSet()));
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_249;
        }
        if (!((Cursor) (obj)).isClosed())
        {
            ((Cursor) (obj)).close();
        }
_L2:
        sqliteopenhelper;
        JVM INSTR monitorexit ;
        return hashtable;
        Object obj2;
        obj2;
        obj = null;
_L6:
        obj1 = obj;
        (new StringBuilder("Error in getting conversations: ")).append(((Exception) (obj2)).getMessage());
        obj1 = obj;
        ((Exception) (obj2)).printStackTrace();
        if (obj == null) goto _L2; else goto _L1
_L1:
        if (((Cursor) (obj)).isClosed()) goto _L2; else goto _L3
_L3:
        ((Cursor) (obj)).close();
          goto _L2
        obj;
        sqliteopenhelper;
        JVM INSTR monitorexit ;
        throw obj;
        obj2;
        obj1 = obj;
        obj = obj2;
_L5:
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_335;
        }
        if (!((Cursor) (obj1)).isClosed())
        {
            ((Cursor) (obj1)).close();
        }
        throw obj;
        obj;
        if (true) goto _L5; else goto _L4
_L4:
        obj2;
        obj = obj1;
          goto _L6
        obj2;
          goto _L6
    }

    public final boolean a(String s1)
    {
        SQLiteOpenHelper sqliteopenhelper = b;
        sqliteopenhelper;
        JVM INSTR monitorenter ;
        SQLiteDatabase sqlitedatabase = b.getWritableDatabase();
        Cursor cursor = sqlitedatabase.query("messagesTable", new String[] {
            "uid", "content_id"
        }, "bin_id = ? AND content_id IS NOT NULL", new String[] {
            s1
        }, null, null, null);
        if (!cursor.moveToFirst()) goto _L2; else goto _L1
_L1:
        String s2;
        String s3;
        s2 = cursor.getString(cursor.getColumnIndex("content_id"));
        s3 = cursor.getString(cursor.getColumnIndex("uid"));
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_235;
        }
        Cursor cursor1;
        if (f(s2) > 0)
        {
            break MISSING_BLOCK_LABEL_235;
        }
        d(s2);
        cursor1 = sqlitedatabase.query("KIKContentTable", new String[] {
            "content_string"
        }, "content_id = ? AND content_name = 'preview' AND content_type = ?", new String[] {
            s2, "3"
        }, null, null, null);
        if (!cursor1.moveToFirst()) goto _L4; else goto _L3
_L3:
        String s4 = cursor1.getString(cursor1.getColumnIndex("content_string"));
        if (s4 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (f(s4) <= 0)
        {
            d(s4);
        }
        if (cursor1.moveToNext()) goto _L3; else goto _L4
_L4:
        cursor1.close();
        sqlitedatabase.delete("KIKContentTable", "content_id = ?", new String[] {
            s2
        });
        if (s3 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        f.h(s3);
        if (cursor.moveToNext()) goto _L1; else goto _L2
_L2:
        cursor.close();
        sqlitedatabase.delete("messagesTable", "bin_id = ?", new String[] {
            s1
        });
        boolean flag = true;
_L5:
        sqliteopenhelper;
        JVM INSTR monitorexit ;
        return flag;
        s1;
        (new StringBuilder("Error deleting conversation: ")).append(s1.getMessage());
        flag = false;
          goto _L5
        s1;
        throw s1;
        s1;
        sqliteopenhelper;
        JVM INSTR monitorexit ;
        throw s1;
    }

    public final boolean a(List list)
    {
        SQLiteOpenHelper sqliteopenhelper = b;
        sqliteopenhelper;
        JVM INSTR monitorenter ;
        SQLiteDatabase sqlitedatabase = b.getWritableDatabase();
        Object obj1;
        String as1[];
        Iterator iterator;
        obj1 = new ArrayList();
        as1 = new String[list.size()];
        iterator = list.iterator();
        int i = 0;
_L4:
        a a1;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_184;
        }
        s s1 = (s)iterator.next();
        a1 = (a)g.a(s1, kik/a/d/a/a);
        as1[i] = s1.b();
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_368;
        }
        d d1;
        if (f(a1.o()) > 0)
        {
            break MISSING_BLOCK_LABEL_368;
        }
        d1 = (d)a1.a("preview");
        if (d1 == null)
        {
            break MISSING_BLOCK_LABEL_155;
        }
        if (d1.b() != null && f(d1.b()) <= 0)
        {
            d(d1.b());
        }
        ((List) (obj1)).add(a1.o());
        kik.android.f.a.f.a();
        d(kik.android.f.a.f.a(a1));
        break MISSING_BLOCK_LABEL_368;
        sqlitedatabase.delete("messagesTable", (new StringBuilder("uid in (")).append(com.kik.l.ao.a(list.size())).append(")").toString(), as1);
        sqlitedatabase.delete("KIKContentTable", (new StringBuilder("content_id IN (")).append(com.kik.l.ao.a(((List) (obj1)).size())).append(")").toString(), (String[])((List) (obj1)).toArray(new String[0]));
        f.a(list);
        boolean flag = true;
_L1:
        sqliteopenhelper;
        JVM INSTR monitorexit ;
        return flag;
        Object obj;
        obj;
        obj1 = new StringBuilder("deleteKIKContact failed: ");
        if (((Exception) (obj)).getMessage() != null)
        {
            break MISSING_BLOCK_LABEL_342;
        }
        obj = "NPE!";
_L2:
        ((StringBuilder) (obj1)).append(((String) (obj)));
        f.a(list);
        flag = false;
          goto _L1
        obj = ((Exception) (obj)).getMessage();
          goto _L2
        obj;
        f.a(list);
        throw obj;
        list;
        sqliteopenhelper;
        JVM INSTR monitorexit ;
        throw list;
        i++;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final boolean a(s s1)
    {
        SQLiteOpenHelper sqliteopenhelper = b;
        sqliteopenhelper;
        JVM INSTR monitorenter ;
        SQLiteDatabase sqlitedatabase;
        Object obj;
        sqlitedatabase = b.getWritableDatabase();
        obj = (a)g.a(s1, kik/a/d/a/a);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_266;
        }
        Object obj1;
        Object obj2;
        obj2 = com.kik.l.o.a(((a) (obj)));
        obj1 = com.kik.l.as.a(((a) (obj)));
        sqlitedatabase.beginTransaction();
        for (obj2 = ((ArrayList) (obj2)).iterator(); ((Iterator) (obj2)).hasNext(); sqlitedatabase.insert("KIKContentTable", null, (ContentValues)((Iterator) (obj2)).next())) { }
        break MISSING_BLOCK_LABEL_160;
        s1;
        int i = c(((a) (obj)).o());
        if (i != -500 && i != 0)
        {
            break MISSING_BLOCK_LABEL_140;
        }
        obj1 = ((a) (obj)).a("preview");
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_140;
        }
        e((String)((o) (obj1)).a());
        e(((a) (obj)).o());
        sqlitedatabase.endTransaction();
        throw s1;
        s1;
        sqliteopenhelper;
        JVM INSTR monitorexit ;
        throw s1;
        for (obj1 = ((ArrayList) (obj1)).iterator(); ((Iterator) (obj1)).hasNext(); sqlitedatabase.insert("KIKContentURITable", null, (ContentValues)((Iterator) (obj1)).next())) { }
        sqlitedatabase.setTransactionSuccessful();
        i = c(((a) (obj)).o());
        if (i != -500 && i != 0)
        {
            break MISSING_BLOCK_LABEL_253;
        }
        obj1 = ((a) (obj)).a("preview");
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_253;
        }
        e((String)((o) (obj1)).a());
        e(((a) (obj)).o());
        sqlitedatabase.endTransaction();
        obj = (kik.a.d.a.d)g.a(s1, kik/a/d/a/d);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_323;
        }
        sqlitedatabase.beginTransaction();
        i = (int)sqlitedatabase.insert("KikFriendAttributionTableName", null, com.kik.l.z.a(((kik.a.d.a.d) (obj))));
        if (i == -1)
        {
            break MISSING_BLOCK_LABEL_319;
        }
        ((kik.a.d.a.d) (obj)).a(i);
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        sqlitedatabase.insert("messagesTable", null, com.kik.l.ad.a(s1));
        boolean flag = true;
_L1:
        sqliteopenhelper;
        JVM INSTR monitorexit ;
        return flag;
        s1;
        bx.d(s1);
        (new StringBuilder("Storage Failure: ")).append(s1.getMessage());
        flag = false;
          goto _L1
        s1;
        throw s1;
    }

    protected final a b(String s1)
    {
        a a1;
        synchronized (b)
        {
            SQLiteDatabase sqlitedatabase = b.getWritableDatabase();
            Cursor cursor = sqlitedatabase.query("KIKContentTable", null, "content_id = ?", new String[] {
                s1
            }, null, null, null);
            a1 = new a(s1, null, "2", null, null, null, null);
            (new com.kik.l.o(cursor)).a(new aj(this, a1));
            (new as(sqlitedatabase.query("KIKContentURITable", null, "content_id = ?", new String[] {
                s1
            }, null, null, null))).a(new ak(this, a1));
        }
        return a1;
        s1;
        sqliteopenhelper;
        JVM INSTR monitorexit ;
        throw s1;
    }

    public final boolean b(s s1)
    {
        SQLiteOpenHelper sqliteopenhelper = b;
        sqliteopenhelper;
        JVM INSTR monitorenter ;
        SQLiteDatabase sqlitedatabase = b.getWritableDatabase();
        Object obj1 = s1.b();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        sqlitedatabase.delete("messagesTable", (new StringBuilder("uid ='")).append(((String) (obj1))).append("'").toString(), null);
        obj1 = (a)g.a(s1, kik/a/d/a/a);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_182;
        }
        d d1;
        if (f(((a) (obj1)).o()) > 0)
        {
            break MISSING_BLOCK_LABEL_182;
        }
        d1 = (d)((a) (obj1)).a("preview");
        if (d1 == null)
        {
            break MISSING_BLOCK_LABEL_134;
        }
        if (d1.b() != null && f(d1.b()) <= 0)
        {
            d(d1.b());
        }
        kik.android.f.a.f.a();
        d(kik.android.f.a.f.a(((a) (obj1))));
        sqlitedatabase.delete("KIKContentTable", (new StringBuilder("content_id = '")).append(((a) (obj1)).o()).append("'").toString(), null);
        f.h(s1.b());
        boolean flag = true;
_L1:
        sqliteopenhelper;
        JVM INSTR monitorexit ;
        return flag;
        Object obj;
        obj;
        (new StringBuilder("deleteKIKContact failed: ")).append(((Exception) (obj)).getMessage());
        flag = false;
        f.h(s1.b());
          goto _L1
        s1;
        sqliteopenhelper;
        JVM INSTR monitorexit ;
        throw s1;
        obj;
        f.h(s1.b());
        throw obj;
    }

    public final boolean c(s s1)
    {
        SQLiteOpenHelper sqliteopenhelper = b;
        sqliteopenhelper;
        JVM INSTR monitorenter ;
        Object obj;
        SQLiteDatabase sqlitedatabase;
        sqlitedatabase = b.getWritableDatabase();
        obj = (a)g.a(s1, kik/a/d/a/a);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_141;
        }
        obj = com.kik.l.o.a(((a) (obj)));
        sqlitedatabase.beginTransaction();
        ContentValues contentvalues;
        for (obj = ((ArrayList) (obj)).iterator(); ((Iterator) (obj)).hasNext(); sqlitedatabase.update("KIKContentTable", contentvalues, "content_id = ? AND content_type = ? AND content_name = ?", new String[] {
    contentvalues.getAsString("content_id"), contentvalues.getAsString("content_type"), contentvalues.getAsString("content_name")
}))
        {
            contentvalues = (ContentValues)((Iterator) (obj)).next();
        }

        break MISSING_BLOCK_LABEL_131;
        s1;
        sqlitedatabase.endTransaction();
        throw s1;
        s1;
        sqliteopenhelper;
        JVM INSTR monitorexit ;
        throw s1;
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        String s2 = s1.b();
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_191;
        }
        boolean flag;
        if (s1.d())
        {
            obj = "1";
        } else
        {
            obj = "0";
        }
        sqlitedatabase.update("messagesTable", com.kik.l.ad.a(s1), "uid = ? AND was_me = ?", new String[] {
            s2, obj
        });
        flag = true;
_L1:
        sqliteopenhelper;
        JVM INSTR monitorexit ;
        return flag;
        s1;
        if ((new StringBuilder("KikMessage update failed: ")).append(s1.getMessage()).toString() != null)
        {
            s1.getMessage();
        }
        flag = false;
          goto _L1
        s1;
        throw s1;
    }

}
