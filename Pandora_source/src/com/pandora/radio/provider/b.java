// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.radio.provider;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.pandora.radio.data.s;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package com.pandora.radio.provider:
//            d

public class com.pandora.radio.provider.b
{
    private static class a
    {

        String a;
        String b[];
        d.a c[];
        b d;

        a(String s1, String as[], d.a aa[], b b1)
        {
            a = s1;
            b = as;
            c = aa;
            d = b1;
        }
    }

    private static interface b
    {

        public abstract ContentValues a(Object obj);

        public abstract Object a(Cursor cursor);
    }

    public static interface c
    {

        public abstract void a(long l, Object obj);
    }

    private static class d
        implements d.b
    {

        public Collection a()
        {
            ArrayList arraylist = new ArrayList(1);
            a aa[] = com.pandora.radio.provider.b.c();
            int j = aa.length;
            for (int i = 0; i < j; i++)
            {
                a a1 = aa[i];
                arraylist.add(new d.c(a1.a, a1.c));
            }

            return arraylist;
        }

        public void a(SQLiteDatabase sqlitedatabase)
        {
        }

        public void a(SQLiteDatabase sqlitedatabase, int i, int j)
        {
        }

        private d()
        {
        }

    }


    static a a;
    private static final String c[] = {
        "_id", "type", "url", "eventTime", "ttl"
    };
    private static a e[];
    private final com.pandora.radio.provider.d b;
    private ConcurrentHashMap d;

    public com.pandora.radio.provider.b(com.pandora.radio.provider.d d1)
    {
        d = new ConcurrentHashMap();
        b = d1;
    }

    private int a(a a1, long l)
    {
        int i;
        synchronized (a1.a)
        {
            i = b.a().delete(a1.a, "_id=?", new String[] {
                String.valueOf(l)
            });
        }
        return i;
        a1;
        s1;
        JVM INSTR monitorexit ;
        throw a1;
    }

    private long a(a a1, Object obj, boolean flag)
    {
        String s1 = a1.a;
        s1;
        JVM INSTR monitorenter ;
        c c1 = (c)d.get(a1.a);
        if (!flag) goto _L2; else goto _L1
_L1:
        long l;
        SQLiteDatabase sqlitedatabase = b.a();
        ContentValues contentvalues = a1.d.a(obj);
        l = sqlitedatabase.insert(a1.a, "", contentvalues);
        if (l <= 0L || c1 == null)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        c1.a(l, obj);
_L4:
        s1;
        JVM INSTR monitorexit ;
        return l;
_L2:
        if (c1 == null)
        {
            break MISSING_BLOCK_LABEL_124;
        }
        c1.a(-1L, obj);
        break MISSING_BLOCK_LABEL_124;
        a1;
        s1;
        JVM INSTR monitorexit ;
        throw a1;
        l = -1L;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private List a(a a1)
    {
        Cursor cursor = null;
        String s1 = a1.a;
        s1;
        JVM INSTR monitorenter ;
        Object obj;
        ArrayList arraylist;
        obj = b.a();
        arraylist = new ArrayList();
        obj = ((SQLiteDatabase) (obj)).query(a1.a, a1.b, null, null, null, null, null);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        int i = ((Cursor) (obj)).getCount();
        if (i != 0)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        ((Cursor) (obj)).close();
        s1;
        JVM INSTR monitorexit ;
        return null;
        for (; ((Cursor) (obj)).moveToNext(); arraylist.add(a1.d.a(((Cursor) (obj))))) { }
          goto _L1
        a1;
        cursor = ((Cursor) (obj));
_L3:
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_121;
        }
        cursor.close();
        throw a1;
        a1;
        s1;
        JVM INSTR monitorexit ;
        throw a1;
_L1:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_139;
        }
        ((Cursor) (obj)).close();
        s1;
        JVM INSTR monitorexit ;
        return arraylist;
        a1;
        if (true) goto _L3; else goto _L2
_L2:
    }

    static a[] c()
    {
        return e;
    }

    public long a(s s1)
    {
        a a1 = a;
        boolean flag;
        if (s1.d() == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return a(a1, s1, flag);
    }

    public d.b a()
    {
        return new d();
    }

    public void a(c c1, String s1)
    {
        d.put(s1, c1);
    }

    public int b(s s1)
    {
        long l = s1.c();
        if (l >= 0L)
        {
            return a(a, l);
        } else
        {
            return -1;
        }
    }

    public List b()
    {
        return a(a);
    }

    static 
    {
        String as[] = c;
        d.a a1 = com.pandora.radio.provider.d.a.b("type");
        d.a a2 = com.pandora.radio.provider.d.a.b("url");
        d.a a3 = com.pandora.radio.provider.d.a.a("eventTime");
        d.a a4 = com.pandora.radio.provider.d.a.a("ttl");
        b b1 = new b() {

            public ContentValues a(Object obj)
            {
                return ((s)obj).a();
            }

            public Object a(Cursor cursor)
            {
                return new s(cursor);
            }

        };
        a = new a("ping_urls", as, new d.a[] {
            a1, a2, a3, a4
        }, b1);
        e = (new a[] {
            a
        });
    }
}
