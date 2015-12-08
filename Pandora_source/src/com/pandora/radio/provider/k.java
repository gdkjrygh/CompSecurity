// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.radio.provider;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.pandora.radio.data.PromotedStation;
import com.pandora.radio.data.StationRecommendation;
import com.pandora.radio.data.StationRecommendations;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p.cw.c;
import p.dd.aw;

// Referenced classes of package com.pandora.radio.provider:
//            d

public class k
{
    private static class a
        implements d.b
    {

        public Collection a()
        {
            ArrayList arraylist = new ArrayList(1);
            arraylist.add(new d.c("station_recommendation", k.d()));
            return arraylist;
        }

        public void a(SQLiteDatabase sqlitedatabase)
        {
        }

        public void a(SQLiteDatabase sqlitedatabase, int i, int j)
        {
        }

        private a()
        {
        }

    }


    public static final StationRecommendation a = new StationRecommendation();
    public static final StationRecommendation b = new StationRecommendation();
    public static final StationRecommendation c = new StationRecommendation();
    private static final Object d = new Object();
    private static final String f[] = {
        "_id", String.format("%s.%s", new Object[] {
            "station_recommendation", "type"
        }), String.format("%s.%s", new Object[] {
            "station_recommendation", "name"
        }), String.format("%s.%s", new Object[] {
            "station_recommendation", "stationArtUrl"
        }), String.format("%s.%s", new Object[] {
            "station_recommendation", "musicToken"
        }), String.format("%s.%s", new Object[] {
            "station_recommendation", "explanation"
        })
    };
    private final d e;

    public k(d d1)
    {
        e = d1;
    }

    public static StationRecommendation[] a(StationRecommendations stationrecommendations, PromotedStation promotedstation, StationRecommendation stationrecommendation, boolean flag)
    {
        stationrecommendation = new ArrayList();
        if (flag)
        {
            stationrecommendation.add(a);
        }
        if (stationrecommendations != null && !stationrecommendations.e())
        {
            stationrecommendation.add(b);
            if (promotedstation != null)
            {
                stationrecommendation.add(promotedstation);
            }
            int i = stationrecommendation.size();
            stationrecommendations = stationrecommendations.b().iterator();
            do
            {
                if (!stationrecommendations.hasNext())
                {
                    break;
                }
                stationrecommendation.add((StationRecommendation)stationrecommendations.next());
            } while (stationrecommendation.size() < i + 3);
            stationrecommendation.add(c);
        }
        return (StationRecommendation[])stationrecommendation.toArray(new StationRecommendation[stationrecommendation.size()]);
    }

    public static StationRecommendation[] b(StationRecommendations stationrecommendations)
    {
        ArrayList arraylist = new ArrayList();
        if (stationrecommendations != null && !stationrecommendations.e())
        {
            stationrecommendations = stationrecommendations.a();
            if (stationrecommendations != null)
            {
                arraylist.add(stationrecommendations);
            }
        }
        return (StationRecommendation[])arraylist.toArray(new StationRecommendation[arraylist.size()]);
    }

    static d.a[] d()
    {
        return e();
    }

    private static d.a[] e()
    {
        return (new d.a[] {
            com.pandora.radio.provider.d.a.b("type"), com.pandora.radio.provider.d.a.b("name"), com.pandora.radio.provider.d.a.b("stationArtUrl"), com.pandora.radio.provider.d.a.b("musicToken"), com.pandora.radio.provider.d.a.b("explanation")
        });
    }

    public d.b a()
    {
        return new a();
    }

    public void a(StationRecommendation stationrecommendation)
    {
        Object obj1 = d;
        obj1;
        JVM INSTR monitorenter ;
        SQLiteDatabase sqlitedatabase;
        int i;
        sqlitedatabase = e.a();
        i = sqlitedatabase.delete("station_recommendation", "musicToken=?", new String[] {
            stationrecommendation.n()
        });
        if (i <= 0) goto _L2; else goto _L1
_L1:
        Object obj;
        if (stationrecommendation.j() != com.pandora.radio.data.StationRecommendations.b.a)
        {
            break MISSING_BLOCK_LABEL_176;
        }
        obj = com.pandora.radio.data.StationRecommendations.b.b;
_L4:
        obj = ((com.pandora.radio.data.StationRecommendations.b) (obj)).toString();
        obj = sqlitedatabase.query("station_recommendation", new String[] {
            "_id"
        }, "type=?", new String[] {
            obj
        }, null, null, "_id ASC", "1");
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_163;
        }
        if (((Cursor) (obj)).moveToFirst())
        {
            long l = ((Cursor) (obj)).getLong(0);
            ContentValues contentvalues = new ContentValues();
            contentvalues.put("type", stationrecommendation.j().toString());
            sqlitedatabase.update("station_recommendation", contentvalues, "_id=?", new String[] {
                String.valueOf(l)
            });
        }
        if (obj == null) goto _L2; else goto _L3
_L3:
        ((Cursor) (obj)).close();
_L2:
        obj1;
        JVM INSTR monitorexit ;
        return;
        obj = com.pandora.radio.data.StationRecommendations.b.d;
          goto _L4
        stationrecommendation;
        obj = null;
_L6:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_196;
        }
        ((Cursor) (obj)).close();
        throw stationrecommendation;
        stationrecommendation;
        obj1;
        JVM INSTR monitorexit ;
        throw stationrecommendation;
        stationrecommendation;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void a(StationRecommendations stationrecommendations)
    {
        e.a(d, new d.d(stationrecommendations) {

            final StationRecommendations a;
            final k b;

            public int a(SQLiteDatabase sqlitedatabase)
            {
                int i1 = sqlitedatabase.delete("station_recommendation", "1", null);
                ContentValues acontentvalues[] = a.g();
                int j1 = acontentvalues.length;
                int i = 0;
                int j;
                int l;
                for (j = 0; i < j1; j = l)
                {
                    l = j;
                    if (sqlitedatabase.insert("station_recommendation", "", acontentvalues[i]) >= 0L)
                    {
                        l = j + 1;
                    }
                    i++;
                }

                if (i1 > 0 || j > 0)
                {
                    c.z.a(new aw(a));
                }
                return 0;
            }

            
            {
                b = k.this;
                a = stationrecommendations;
                super();
            }
        });
    }

    public StationRecommendations b()
    {
        Object obj = null;
        Object obj2 = d;
        obj2;
        JVM INSTR monitorenter ;
        Object obj1 = e.a().query("station_recommendation", f, null, null, null, null, null);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        int i = ((Cursor) (obj1)).getCount();
        if (i != 0)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        ((Cursor) (obj1)).close();
        obj2;
        JVM INSTR monitorexit ;
        return null;
        obj = new StationRecommendations(c.z, ((Cursor) (obj1)));
        c.z.a(new aw(((StationRecommendations) (obj))));
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_99;
        }
        ((Cursor) (obj1)).close();
        obj2;
        JVM INSTR monitorexit ;
        return ((StationRecommendations) (obj));
        obj;
        obj2;
        JVM INSTR monitorexit ;
        throw obj;
        Exception exception;
        exception;
        obj1 = obj;
        obj = exception;
_L2:
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_125;
        }
        ((Cursor) (obj1)).close();
        throw obj;
        obj;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void c()
    {
        synchronized (d)
        {
            e.a().delete("station_recommendation", "1", null);
            c.z.a(new aw(null));
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Object clone()
        throws CloneNotSupportedException
    {
        throw new CloneNotSupportedException();
    }

}
