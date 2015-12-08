// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.radio.provider;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteQueryBuilder;
import android.text.TextUtils;
import com.pandora.radio.util.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p.cw.c;

// Referenced classes of package com.pandora.radio.provider:
//            b, c, f, i, 
//            k, StationProvider

public class com.pandora.radio.provider.d extends SQLiteOpenHelper
{
    public static class a
    {

        private final String a;
        private final int b;
        private final String c;

        public static a a(String s)
        {
            return new a(s, 1, null);
        }

        public static a a(String s, String s1)
        {
            return new a(s, 2, s1);
        }

        public static a b(String s)
        {
            return new a(s, 2, null);
        }

        public static a c(String s)
        {
            return new a(s, 3, null);
        }

        public String a()
        {
            return a;
        }

        public int b()
        {
            return b;
        }

        public String c()
        {
            return c;
        }

        private a(String s, int j, String s1)
        {
            a = s;
            b = j;
            c = s1;
        }
    }

    public static interface b
    {

        public abstract Collection a();

        public abstract void a(SQLiteDatabase sqlitedatabase);

        public abstract void a(SQLiteDatabase sqlitedatabase, int j, int l);
    }

    public static class c
    {

        private String a;
        private a b[];

        public String a()
        {
            return a;
        }

        public a[] b()
        {
            return b;
        }

        public c(String s, a aa[])
        {
            a = s;
            b = aa;
        }
    }

    public static interface d
    {

        public abstract int a(SQLiteDatabase sqlitedatabase);
    }


    private Context a;
    private ArrayList b;
    private final com.pandora.radio.provider.b c = new com.pandora.radio.provider.b(this);
    private final com.pandora.radio.provider.c d = new com.pandora.radio.provider.c(this);
    private final f e = new f(this);
    private final com.pandora.radio.provider.i f;
    private final k g = new k(this);

    public com.pandora.radio.provider.d(p.cw.c c1, List list)
    {
        super(c1.s(), "pandora.db", null, 42);
        a = c1.s();
        f = new com.pandora.radio.provider.i(c1);
        h();
        if (list != null)
        {
            b.addAll(list);
        }
        onCreate(getWritableDatabase());
        StationProvider.a(c1);
    }

    public static Cursor a(SQLiteDatabase sqlitedatabase, String s, HashMap hashmap, String as[], String s1, String as1[], String s2, String s3, 
            String s4)
    {
        SQLiteQueryBuilder sqlitequerybuilder = new SQLiteQueryBuilder();
        sqlitequerybuilder.setTables(s);
        sqlitequerybuilder.setProjectionMap(hashmap);
        return sqlitequerybuilder.query(sqlitedatabase, as, s1, as1, s2, s3, s4);
    }

    private List a(String as[], a aa[])
    {
        boolean flag = false;
        HashSet hashset = new HashSet();
        int i1 = aa.length;
        for (int j = 0; j < i1; j++)
        {
            hashset.add(aa[j].a());
        }

        aa = new ArrayList(aa.length);
        i1 = as.length;
        for (int l = ((flag) ? 1 : 0); l < i1; l++)
        {
            String s = as[l];
            if (hashset.contains(s))
            {
                aa.add(s);
            }
        }

        return aa;
    }

    private void a(SQLiteDatabase sqlitedatabase)
    {
        b b1;
        for (Iterator iterator = g().iterator(); iterator.hasNext(); b1.a(sqlitedatabase))
        {
            b1 = (b)iterator.next();
            StringBuffer stringbuffer;
            for (Iterator iterator1 = b1.a().iterator(); iterator1.hasNext(); sqlitedatabase.execSQL(stringbuffer.toString()))
            {
                c c1 = (c)iterator1.next();
                stringbuffer = new StringBuffer();
                stringbuffer.append(String.format("CREATE TABLE IF NOT EXISTS %s (_id INTEGER PRIMARY KEY", new Object[] {
                    c1.a()
                }));
                a aa[] = c1.b();
                int l = aa.length;
                int j = 0;
                while (j < l) 
                {
                    a a1 = aa[j];
                    String s;
                    if (a1.b() == 3)
                    {
                        s = "BLOB";
                    } else
                    if (a1.b() == 1)
                    {
                        s = "INTEGER DEFAULT 0";
                    } else
                    if (a1.b() == 2)
                    {
                        s = a1.c();
                        if (i.a(s))
                        {
                            s = "TEXT";
                        } else
                        {
                            s = String.format("TEXT DEFAULT \"%s\"", new Object[] {
                                s
                            });
                        }
                    } else
                    {
                        throw new RuntimeException((new StringBuilder()).append("invalid type: ").append(a1.b()).toString());
                    }
                    stringbuffer.append(String.format(", %s %s", new Object[] {
                        a1.a(), s
                    }));
                    j++;
                }
                stringbuffer.append(");");
            }

        }

    }

    private String[] a(SQLiteDatabase sqlitedatabase, String s)
    {
        SQLiteDatabase sqlitedatabase1 = null;
        sqlitedatabase = sqlitedatabase.rawQuery((new StringBuilder()).append("select * from ").append(s).append(" limit 1").toString(), null);
        sqlitedatabase1 = sqlitedatabase;
        s = sqlitedatabase.getColumnNames();
        if (sqlitedatabase != null)
        {
            sqlitedatabase.close();
        }
        return s;
        sqlitedatabase;
        if (sqlitedatabase1 != null)
        {
            sqlitedatabase1.close();
        }
        throw sqlitedatabase;
    }

    private ArrayList g()
    {
        return b;
    }

    private ArrayList h()
    {
        b = new ArrayList(6);
        b.add(d.a());
        b.add(e.b());
        b.add(f.e());
        b.add(c.a());
        b.add(g.a());
        return b;
    }

    public int a(Object obj, d d1)
    {
        obj;
        JVM INSTR monitorenter ;
        SQLiteDatabase sqlitedatabase;
        sqlitedatabase = a();
        sqlitedatabase.beginTransaction();
        int j;
        j = d1.a(sqlitedatabase);
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        obj;
        JVM INSTR monitorexit ;
        return j;
        d1;
        sqlitedatabase.endTransaction();
        throw d1;
        d1;
        obj;
        JVM INSTR monitorexit ;
        throw d1;
    }

    public SQLiteDatabase a()
    {
        this;
        JVM INSTR monitorenter ;
        SQLiteDatabase sqlitedatabase = getWritableDatabase();
        this;
        JVM INSTR monitorexit ;
        return sqlitedatabase;
        Exception exception;
        exception;
        throw exception;
    }

    public com.pandora.radio.provider.b b()
    {
        return c;
    }

    public com.pandora.radio.provider.c c()
    {
        return d;
    }

    public f d()
    {
        return e;
    }

    public com.pandora.radio.provider.i e()
    {
        return f;
    }

    public k f()
    {
        return g;
    }

    public final void onCreate(SQLiteDatabase sqlitedatabase)
    {
        a(sqlitedatabase);
    }

    public final void onUpgrade(SQLiteDatabase sqlitedatabase, int j, int l)
    {
        sqlitedatabase.beginTransaction();
        Iterator iterator;
        a(sqlitedatabase);
        iterator = g().iterator();
_L1:
        b b1;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_246;
        }
        b1 = (b)iterator.next();
        String s;
        for (Iterator iterator1 = b1.a().iterator(); iterator1.hasNext(); sqlitedatabase.execSQL(String.format("DROP TABLE %s", new Object[] {
    s
})))
        {
            c c1 = (c)iterator1.next();
            String as[] = a(sqlitedatabase, c1.a());
            s = (new StringBuilder()).append("temp_").append(c1.a()).toString();
            sqlitedatabase.execSQL(String.format("ALTER TABLE %s RENAME TO %s", new Object[] {
                c1.a(), s
            }));
            onCreate(sqlitedatabase);
            String s1 = TextUtils.join(",", a(as, c1.b()));
            sqlitedatabase.execSQL(String.format("INSERT INTO %s (%s) SELECT %s FROM %s", new Object[] {
                c1.a(), s1, s1, s
            }));
        }

        break MISSING_BLOCK_LABEL_233;
        Exception exception;
        exception;
        sqlitedatabase.endTransaction();
        throw exception;
        b1.a(sqlitedatabase, j, l);
          goto _L1
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        return;
    }
}
