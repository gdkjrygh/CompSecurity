// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.radio.provider;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.pandora.radio.data.j;
import com.pandora.radio.util.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

// Referenced classes of package com.pandora.radio.provider:
//            d

public class c
{
    private static class a
        implements d.b
    {

        public Collection a()
        {
            ArrayList arraylist = new ArrayList(1);
            arraylist.add(new d.c("genre_stations", c.c()));
            return arraylist;
        }

        public void a(SQLiteDatabase sqlitedatabase)
        {
        }

        public void a(SQLiteDatabase sqlitedatabase, int k, int l)
        {
        }

        private a()
        {
        }

    }


    private static final Object a = new Object();
    private static final String b[] = {
        "categoryName", "stationId", "stationName", "stationToken", "artUrl", "categoryAdUrl", "gcat"
    };
    private static final String c;
    private final d d;

    public c(d d1)
    {
        d = d1;
    }

    private j a(List list)
    {
        if (list != null && list.size() > 0)
        {
            return (j)list.get(0);
        } else
        {
            return null;
        }
    }

    private List a(String s, String as[])
    {
        Object obj = null;
        Object obj1 = a;
        obj1;
        JVM INSTR monitorenter ;
        as = d.a().query("genre_stations", b, s, as, null, null, c);
        if (as == null)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        boolean flag = as.moveToFirst();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        if (as == null)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        as.close();
        obj1;
        JVM INSTR monitorexit ;
        return null;
        LinkedHashMap linkedhashmap = new LinkedHashMap();
_L2:
        String s1;
        s1 = as.getString(0);
        obj = (j)linkedhashmap.get(s1);
        s = ((String) (obj));
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_136;
        }
        s = as.getString(5);
        s = new j(s1, as.getString(6), s);
        linkedhashmap.put(s1, s);
        obj = new com.pandora.radio.data.j.a(as.getString(1), as.getString(2), as.getString(3), as.getString(4));
        s.d().add(obj);
        if (as.moveToNext()) goto _L2; else goto _L1
_L1:
        s = new ArrayList(linkedhashmap.size());
        obj = (j)linkedhashmap.get("Top Stations");
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_232;
        }
        s.add(obj);
        linkedhashmap.remove("Top Stations");
        s.addAll(linkedhashmap.values());
        if (as == null)
        {
            break MISSING_BLOCK_LABEL_252;
        }
        as.close();
        obj1;
        JVM INSTR monitorexit ;
        return s;
_L4:
        if (as == null)
        {
            break MISSING_BLOCK_LABEL_267;
        }
        as.close();
        throw s;
        s;
        obj1;
        JVM INSTR monitorexit ;
        throw s;
        s;
        continue; /* Loop/switch isn't completed */
        s;
        as = ((String []) (obj));
        if (true) goto _L4; else goto _L3
_L3:
    }

    static void a(SQLiteDatabase sqlitedatabase, String s, String s1, String s2, com.pandora.radio.data.j.a a1)
    {
        b(sqlitedatabase, s, s1, s2, a1);
    }

    private static void b(SQLiteDatabase sqlitedatabase, String s, String s1, String s2, com.pandora.radio.data.j.a a1)
    {
        ContentValues contentvalues = new ContentValues(4);
        contentvalues.put("categoryName", s);
        contentvalues.put("stationId", a1.a());
        contentvalues.put("stationName", a1.b());
        contentvalues.put("stationToken", a1.c());
        contentvalues.put("artUrl", a1.d());
        contentvalues.put("categoryAdUrl", s2);
        contentvalues.put("gcat", s1);
        sqlitedatabase.insert("genre_stations", "", contentvalues);
    }

    static d.a[] c()
    {
        return d();
    }

    private static d.a[] d()
    {
        return (new d.a[] {
            com.pandora.radio.provider.d.a.b("categoryName"), com.pandora.radio.provider.d.a.b("stationId"), com.pandora.radio.provider.d.a.b("stationName"), com.pandora.radio.provider.d.a.b("stationToken"), com.pandora.radio.provider.d.a.b("artUrl"), com.pandora.radio.provider.d.a.b("categoryAdUrl"), com.pandora.radio.provider.d.a.b("gcat")
        });
    }

    public j a(String s)
    {
        String s1 = null;
        if (!i.a(s))
        {
            String s2 = s.replace('_', ' ');
            s1 = "UPPER(categoryName) = UPPER(?)";
            s = new String[1];
            s[0] = s2;
        } else
        {
            Object obj = null;
            s = s1;
            s1 = obj;
        }
        return a(a(s1, ((String []) (s))));
    }

    public d.b a()
    {
        return new a();
    }

    public void a(ArrayList arraylist)
    {
        d.a(a, new d.d(arraylist) {

            final ArrayList a;
            final c b;

            public int a(SQLiteDatabase sqlitedatabase)
            {
                sqlitedatabase.delete("genre_stations", null, null);
                for (Iterator iterator = a.iterator(); iterator.hasNext();)
                {
                    Object obj = (j)iterator.next();
                    String s = ((j) (obj)).a();
                    String s1 = ((j) (obj)).b();
                    String s2 = ((j) (obj)).c();
                    obj = ((j) (obj)).d().iterator();
                    while (((Iterator) (obj)).hasNext()) 
                    {
                        c.a(sqlitedatabase, s, s1, s2, (com.pandora.radio.data.j.a)((Iterator) (obj)).next());
                    }
                }

                return 0;
            }

            
            {
                b = c.this;
                a = arraylist;
                super();
            }
        });
    }

    public j b(String s)
    {
        String s1 = null;
        if (!i.a(s))
        {
            s1 = "UPPER(gcat) = UPPER(?)";
            String as[] = new String[1];
            as[0] = s;
            s = as;
        } else
        {
            Object obj = null;
            s = s1;
            s1 = obj;
        }
        return a(a(s1, s));
    }

    public List b()
    {
        return a(null, null);
    }

    static 
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("categoryName");
        stringbuilder.append(" ASC, ");
        stringbuilder.append("stationName");
        stringbuilder.append(" ASC");
        c = stringbuilder.toString();
    }
}
