// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.appboy.Constants;
import com.appboy.support.AppboyLogger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package bo.app:
//            ek, cx, co, aj, 
//            cl, gw, cs, gx, 
//            er, cz, dy

public class el
    implements ek
{

    private static final String a;
    private static final String b[] = {
        "session_id", "start_time", "end_time", "new_sent", "endtime_sent"
    };
    private static final String c[] = {
        "session_id", "event_type", "event_data", "timestamp"
    };
    private SQLiteDatabase d;
    private final dy e;

    public el(dy dy1)
    {
        e = dy1;
    }

    private static ContentValues a(cx cx1, co co1)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("session_id", cx1.toString());
        contentvalues.put("event_type", co1.b().s);
        contentvalues.put("event_data", co1.c().toString());
        contentvalues.put("timestamp", Double.valueOf(co1.a()));
        return contentvalues;
    }

    private cs a(Cursor cursor)
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
        obj2 = cx.a(((String) (obj2)));
        obj3 = new cl(gw.a(((Collection) (obj3))));
        boolean flag;
        if (!a(j))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj = new cs(((cx) (obj2)), d1, ((Double) (obj)), ((cl) (obj3)), flag, false, false);
        if (cursor != null)
        {
            cursor.close();
        }
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
        return ((cs) (obj));
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
            cl cl1 = new cl(gw.h().a());
            obj = cx.a(((String) (obj)));
            boolean flag;
            if (!a(j1))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            arraylist.add(new cs(((cx) (obj)), d1, Double.valueOf(d2), cl1, flag, true, a(k1)));
        }
        return arraylist;
    }

    private static Double c(cs cs1)
    {
        Double double1 = cs1.a();
        cs1 = double1;
        if (double1 == null)
        {
            cs1 = Double.valueOf(er.b());
        }
        return cs1;
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
                arraylist.add(cz.a(s, s1, d1));
            }
            catch (JSONException jsonexception)
            {
                AppboyLogger.e(a, String.format("Could not create AppboyEvent from [type=%s, data=%s, timestamp=%f] ... Skipping", new Object[] {
                    s, s1, Double.valueOf(d1)
                }));
            }
        }
        return arraylist;
    }

    public final cs a()
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
                AppboyLogger.e(a, (new StringBuilder("Got > 1 session while trying to get stored open session. ")).append(((Cursor) (obj)).getCount()).append(" open sessions in database").toString());
            }
            obj = a(((Cursor) (obj)));
        }
        catch (Exception exception)
        {
            AppboyLogger.e(a, "Failed to retrieve stored open session.", exception);
            return null;
        }
        return ((cs) (obj));
    }

    public final void a(cs cs1)
    {
        boolean flag;
        flag = true;
        if (cs1 == null)
        {
            break MISSING_BLOCK_LABEL_316;
        }
        d().beginTransaction();
        Object obj;
        Object obj1;
        b(cs1);
        obj = cs1.e();
        obj1 = new ContentValues();
        ((ContentValues) (obj1)).put("session_id", cs1.d.toString());
        ((ContentValues) (obj1)).put("start_time", Double.valueOf(cs1.e));
        ((ContentValues) (obj1)).put("end_time", c(cs1));
        int i;
        if (cs1.b())
        {
            i = 1;
        } else
        {
            i = 0;
        }
        ((ContentValues) (obj1)).put("new_sent", Integer.valueOf(i));
        if (cs1.d())
        {
            i = 1;
        } else
        {
            i = 0;
        }
        ((ContentValues) (obj1)).put("endtime_sent", Integer.valueOf(i));
        if (cs1.c())
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 0;
        }
        ((ContentValues) (obj1)).put("sealed", Integer.valueOf(i));
        d().beginTransaction();
        long l = d().insertWithOnConflict("ab_sessions", null, ((ContentValues) (obj1)), 5);
        obj1 = a;
        String.format("Inserted session into row %d", new Object[] {
            Long.valueOf(l)
        });
        long l1;
        for (obj = ((cl) (obj)).a.iterator(); ((Iterator) (obj)).hasNext(); String.format("Inserted event into row %d", new Object[] {
    Long.valueOf(l1)
}))
        {
            Object obj2 = (co)((Iterator) (obj)).next();
            l1 = d().insert("ab_events", null, a(cs1.d, ((co) (obj2))));
            obj2 = a;
        }

        break MISSING_BLOCK_LABEL_287;
        cs1;
        d().endTransaction();
        throw cs1;
        cs1;
        d().endTransaction();
        throw cs1;
        d().setTransactionSuccessful();
        d().endTransaction();
        d().setTransactionSuccessful();
        d().endTransaction();
        return;
        AppboyLogger.e(a, "Erroneously received upsertSession call with null session value.  Please report this result to Appboy.");
        return;
    }

    public final void a(cs cs1, co co1)
    {
        if (!cz.a(co1))
        {
            Object obj = cs1.d;
            if (d().insert("ab_events", null, a(((cx) (obj)), co1)) == -1L)
            {
                AppboyLogger.w(a, String.format("Failed to insert event [%s] for session with ID [%s]", new Object[] {
                    co1.toString(), ((cx) (obj)).toString()
                }));
            }
            co1 = new ContentValues();
            co1.put("end_time", c(cs1));
            obj = String.format("%s = ? AND %s = ?", new Object[] {
                "sealed", "session_id"
            });
            String s = String.valueOf(cs1.d);
            int i = d().updateWithOnConflict("ab_sessions", co1, ((String) (obj)), new String[] {
                "0", s
            }, 2);
            if (cs1.c())
            {
                if (i == 0)
                {
                    cs1 = a;
                }
            } else
            if (i != 1)
            {
                AppboyLogger.w(a, String.format("Attempt to update end time affected %d rows, expected just one.", new Object[] {
                    Integer.valueOf(i)
                }));
                return;
            }
        }
    }

    public final cs b()
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
                AppboyLogger.e(a, (new StringBuilder("Got > 1 session while trying to get stored closed session. ")).append(((Cursor) (obj)).getCount()).append(" closed sessions in database").toString());
            }
            obj = a(((Cursor) (obj)));
        }
        catch (Exception exception)
        {
            AppboyLogger.e(a, "Failed to retrieve stored closed session.", exception);
            return null;
        }
        return ((cs) (obj));
    }

    public final void b(cs cs1)
    {
        d().beginTransaction();
        String s = String.format("%s = ?", new Object[] {
            "session_id"
        });
        String as[] = new String[1];
        as[0] = cs1.d.toString();
        int i = d().delete("ab_sessions", s, as);
        cs1 = a;
        String.format("Deleting session removed %d rows.", new Object[] {
            Integer.valueOf(i)
        });
        cs1 = String.format("%s = ?", new Object[] {
            "session_id"
        });
        i = d().delete("ab_events", cs1, as);
        cs1 = a;
        String.format("Deleting session events removed %d rows.", new Object[] {
            Integer.valueOf(i)
        });
        d().setTransactionSuccessful();
        d().endTransaction();
        return;
        cs1;
        d().endTransaction();
        throw cs1;
    }

    public final Collection c()
    {
        Object obj;
        Object obj1;
        String s1;
        obj = new ArrayList();
        obj1 = String.format("%s = ?", new Object[] {
            "sealed"
        });
        s1 = String.format("%s = ?", new Object[] {
            "session_id"
        });
        String s = a;
        Cursor cursor = d().query("ab_sessions", b, ((String) (obj1)), new String[] {
            "1"
        }, null, null, null);
        Iterator iterator;
        AppboyLogger.i(a, String.format("Found %d sealed session rows.", new Object[] {
            Integer.valueOf(cursor.getCount())
        }));
        obj1 = b(cursor);
        cursor.close();
        iterator = ((Collection) (obj1)).iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        cs cs1;
        cs1 = (cs)iterator.next();
        obj1 = cs1.d.toString();
        obj1 = d().query("ab_events", c, s1, new String[] {
            obj1
        }, null, null, null);
        double d1;
        cl cl1;
        cx cx1;
        Double double1;
        cl1 = new cl(gw.a(c(((Cursor) (obj1)))));
        cx1 = cs1.d;
        d1 = cs1.e;
        double1 = cs1.a();
        boolean flag;
        if (!cs1.b())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((Collection) (obj)).add(new cs(cx1, d1, double1, cl1, flag, true, cs1.d()));
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
            break MISSING_BLOCK_LABEL_320;
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
            Constants.APPBOY_LOG_TAG_PREFIX, bo/app/el.getName()
        });
    }
}
