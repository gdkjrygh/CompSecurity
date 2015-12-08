// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.appboy.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package bo.app:
//            ee, cr, ci, ae, 
//            cf, gr, cm, gs, 
//            el, ct, ds

public class ef
    implements ee
{

    private static final String a;
    private static final String b[] = {
        "session_id", "start_time", "end_time", "new_sent", "endtime_sent"
    };
    private static final String c[] = {
        "session_id", "event_type", "event_data", "timestamp"
    };
    private SQLiteDatabase d;
    private final ds e;

    public ef(ds ds1)
    {
        e = ds1;
    }

    private static ContentValues a(cr cr1, ci ci1)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("session_id", cr1.toString());
        contentvalues.put("event_type", ci1.b().r);
        contentvalues.put("event_data", ci1.c().toString());
        contentvalues.put("timestamp", Double.valueOf(ci1.a()));
        return contentvalues;
    }

    private cm a(Cursor cursor)
    {
        Object obj1 = String.format("%s = ?", new Object[] {
            "session_id"
        });
        if (!cursor.moveToFirst()) goto _L2; else goto _L1
_L1:
        double d1;
        Object obj;
        Object obj2;
        obj2 = cursor.getString(cursor.getColumnIndex("session_id"));
        d1 = cursor.getDouble(cursor.getColumnIndex("start_time"));
        int i = cursor.getColumnIndex("end_time");
        if (cursor.isNull(i))
        {
            break MISSING_BLOCK_LABEL_298;
        }
        obj = Double.valueOf(cursor.getDouble(i));
_L7:
        int j = cursor.getColumnIndex("new_sent");
        if (cursor.isNull(j)) goto _L4; else goto _L3
_L3:
        j = cursor.getInt(j);
_L6:
        cursor.close();
        obj1 = d().query("ab_events", c, ((String) (obj1)), new String[] {
            obj2
        }, null, null, null);
        Object obj3;
        obj3 = c(((Cursor) (obj1)));
        obj2 = cr.a(((String) (obj2)));
        obj3 = new cf(gr.a(((Collection) (obj3))));
        boolean flag;
        if (!a(j))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj = new cm(((cr) (obj2)), d1, ((Double) (obj)), ((cf) (obj3)), flag, false, false);
        if (cursor != null)
        {
            cursor.close();
        }
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
        return ((cm) (obj));
_L2:
        if (cursor != null)
        {
            cursor.close();
        }
        return null;
        obj;
        obj1 = null;
_L5:
        if (cursor != null)
        {
            cursor.close();
        }
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
        throw obj;
        obj;
        if (true) goto _L5; else goto _L4
_L4:
        j = 0;
          goto _L6
        obj = null;
          goto _L7
    }

    private static boolean a(int i)
    {
        return i == 1;
    }

    private static Collection b(Cursor cursor)
    {
        ArrayList arraylist = new ArrayList();
        int i = cursor.getColumnIndex("session_id");
        int j = cursor.getColumnIndex("start_time");
        int k = cursor.getColumnIndex("end_time");
        int l = cursor.getColumnIndex("new_sent");
        int i1 = cursor.getColumnIndex("endtime_sent");
        while (cursor.moveToNext()) 
        {
            Object obj = cursor.getString(i);
            double d1 = cursor.getDouble(j);
            double d2 = cursor.getDouble(k);
            int j1 = cursor.getInt(l);
            int k1 = cursor.getInt(i1);
            cf cf1 = new cf(gr.h().a());
            obj = cr.a(((String) (obj)));
            boolean flag;
            if (!a(j1))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            arraylist.add(new cm(((cr) (obj)), d1, Double.valueOf(d2), cf1, flag, true, a(k1)));
        }
        return arraylist;
    }

    private static Double c(cm cm1)
    {
        Double double1 = cm1.a();
        cm1 = double1;
        if (double1 == null)
        {
            cm1 = Double.valueOf(el.b());
        }
        return cm1;
    }

    private static Collection c(Cursor cursor)
    {
        ArrayList arraylist = new ArrayList();
        int i = cursor.getColumnIndex("event_type");
        int j = cursor.getColumnIndex("event_data");
        int k = cursor.getColumnIndex("timestamp");
        while (cursor.moveToNext()) 
        {
            String s = cursor.getString(i);
            String s1 = cursor.getString(j);
            double d1 = cursor.getDouble(k);
            try
            {
                arraylist.add(ct.a(s, s1, d1));
            }
            catch (JSONException jsonexception)
            {
                String.format("Could not create AppboyEvent from [type=%s, data=%s, timestamp=%f] ... Skipping", new Object[] {
                    s, s1, Double.valueOf(d1)
                });
            }
        }
        return arraylist;
    }

    public final cm a()
    {
        Object obj;
        try
        {
            obj = String.format("%s = ?", new Object[] {
                "sealed"
            });
            obj = d().query("ab_sessions", b, ((String) (obj)), new String[] {
                "0"
            }, null, null, null);
            if (((Cursor) (obj)).getCount() > 1)
            {
                (new StringBuilder("Got > 1 session while trying to get stored open session. ")).append(((Cursor) (obj)).getCount()).append(" open sessions in database");
            }
            obj = a(((Cursor) (obj)));
        }
        catch (Exception exception)
        {
            return null;
        }
        return ((cm) (obj));
    }

    public final void a(cm cm1)
    {
        boolean flag;
        flag = true;
        if (cm1 == null)
        {
            break MISSING_BLOCK_LABEL_299;
        }
        d().beginTransaction();
        Object obj;
        ContentValues contentvalues;
        b(cm1);
        obj = cm1.e();
        contentvalues = new ContentValues();
        contentvalues.put("session_id", cm1.d.toString());
        contentvalues.put("start_time", Double.valueOf(cm1.e));
        contentvalues.put("end_time", c(cm1));
        int i;
        if (cm1.b())
        {
            i = 1;
        } else
        {
            i = 0;
        }
        contentvalues.put("new_sent", Integer.valueOf(i));
        if (cm1.d())
        {
            i = 1;
        } else
        {
            i = 0;
        }
        contentvalues.put("endtime_sent", Integer.valueOf(i));
        if (cm1.c())
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 0;
        }
        contentvalues.put("sealed", Integer.valueOf(i));
        d().beginTransaction();
        String.format("Inserted session into row %d", new Object[] {
            Long.valueOf(d().insertWithOnConflict("ab_sessions", null, contentvalues, 5))
        });
        ci ci1;
        for (obj = ((cf) (obj)).a.a(); ((Iterator) (obj)).hasNext(); String.format("Inserted event into row %d", new Object[] {
    Long.valueOf(d().insert("ab_events", null, a(cm1.d, ci1)))
}))
        {
            ci1 = (ci)((Iterator) (obj)).next();
        }

        break MISSING_BLOCK_LABEL_271;
        cm1;
        d().endTransaction();
        throw cm1;
        cm1;
        d().endTransaction();
        throw cm1;
        d().setTransactionSuccessful();
        d().endTransaction();
        d().setTransactionSuccessful();
        d().endTransaction();
    }

    public final void a(cm cm1, ci ci1)
    {
        if (!ct.a(ci1))
        {
            Object obj = cm1.d;
            if (d().insert("ab_events", null, a(((cr) (obj)), ci1)) == -1L)
            {
                String.format("Failed to insert event [%s] for session with ID [%s]", new Object[] {
                    ci1.toString(), ((cr) (obj)).toString()
                });
            }
            ci1 = new ContentValues();
            ci1.put("end_time", c(cm1));
            obj = String.format("%s = ? AND %s = ?", new Object[] {
                "sealed", "session_id"
            });
            String s = String.valueOf(cm1.d);
            int i = d().updateWithOnConflict("ab_sessions", ci1, ((String) (obj)), new String[] {
                "0", s
            }, 2);
            if (cm1.c())
            {
                if (i != 0);
            } else
            if (i != 1)
            {
                String.format("Attempt to update end time affected %d rows, expected just one.", new Object[] {
                    Integer.valueOf(i)
                });
                return;
            }
        }
    }

    public final cm b()
    {
        Object obj;
        try
        {
            obj = String.format("%s = ?", new Object[] {
                "sealed"
            });
            obj = d().query("ab_sessions", b, ((String) (obj)), new String[] {
                "1"
            }, null, null, null);
            if (((Cursor) (obj)).getCount() > 1)
            {
                (new StringBuilder("Got > 1 session while trying to get stored closed session. ")).append(((Cursor) (obj)).getCount()).append(" closed sessions in database");
            }
            obj = a(((Cursor) (obj)));
        }
        catch (Exception exception)
        {
            return null;
        }
        return ((cm) (obj));
    }

    public final void b(cm cm1)
    {
        d().beginTransaction();
        String s = String.format("%s = ?", new Object[] {
            "session_id"
        });
        String as[] = new String[1];
        as[0] = cm1.d.toString();
        String.format("Deleting session removed %d rows.", new Object[] {
            Integer.valueOf(d().delete("ab_sessions", s, as))
        });
        cm1 = String.format("%s = ?", new Object[] {
            "session_id"
        });
        String.format("Deleting session events removed %d rows.", new Object[] {
            Integer.valueOf(d().delete("ab_events", cm1, as))
        });
        d().setTransactionSuccessful();
        d().endTransaction();
        return;
        cm1;
        d().endTransaction();
        throw cm1;
    }

    public final Collection c()
    {
        Object obj;
        Object obj1;
        String s;
        obj = new ArrayList();
        obj1 = String.format("%s = ?", new Object[] {
            "sealed"
        });
        s = String.format("%s = ?", new Object[] {
            "session_id"
        });
        Cursor cursor = d().query("ab_sessions", b, ((String) (obj1)), new String[] {
            "1"
        }, null, null, null);
        Iterator iterator;
        String.format("Found %d sealed session rows.", new Object[] {
            Integer.valueOf(cursor.getCount())
        });
        obj1 = b(cursor);
        cursor.close();
        iterator = ((Collection) (obj1)).iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        cm cm1;
        cm1 = (cm)iterator.next();
        obj1 = cm1.d.toString();
        obj1 = d().query("ab_events", c, s, new String[] {
            obj1
        }, null, null, null);
        double d1;
        cf cf1;
        cr cr1;
        Double double1;
        cf1 = new cf(gr.a(c(((Cursor) (obj1)))));
        cr1 = cm1.d;
        d1 = cm1.e;
        double1 = cm1.a();
        boolean flag;
        if (!cm1.b())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((Collection) (obj)).add(new cm(cr1, d1, double1, cf1, flag, true, cm1.d()));
        if (obj1 == null) goto _L4; else goto _L3
_L3:
        ((Cursor) (obj1)).close();
          goto _L4
        obj;
        obj1 = cursor;
_L5:
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
        throw obj;
        obj;
        obj1 = null;
_L6:
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_309;
        }
        ((Cursor) (obj1)).close();
        throw obj;
_L2:
        if (cursor != null)
        {
            cursor.close();
        }
        return ((Collection) (obj));
        obj;
        obj1 = null;
          goto _L5
        obj;
          goto _L6
    }

    public final SQLiteDatabase d()
    {
        this;
        JVM INSTR monitorenter ;
        SQLiteDatabase sqlitedatabase;
        if (d == null || !d.isOpen())
        {
            d = e.getWritableDatabase();
        }
        sqlitedatabase = d;
        this;
        JVM INSTR monitorexit ;
        return sqlitedatabase;
        Exception exception;
        exception;
        throw exception;
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            d.a, bo/app/ef.getName()
        });
    }
}
