// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.appboy.f;
import com.appboy.f.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package a.a:
//            dd, bs, bg, fm, 
//            bn, bj, j, fn, 
//            dj, bu, cq

public class de
    implements dd
{

    private static final String a;
    private static final String b[] = {
        "session_id", "start_time", "end_time", "new_sent", "endtime_sent"
    };
    private static final String c[] = {
        "session_id", "event_type", "event_data", "timestamp"
    };
    private SQLiteDatabase d;
    private final cq e;

    public de(cq cq1)
    {
        e = cq1;
    }

    private bn a(Cursor cursor)
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
        int k = cursor.getColumnIndex("new_sent");
        if (cursor.isNull(k)) goto _L4; else goto _L3
_L3:
        k = cursor.getInt(k);
_L6:
        cursor.close();
        obj1 = d().query("ab_events", c, ((String) (obj1)), new String[] {
            obj2
        }, null, null, null);
        Object obj3;
        obj3 = c(((Cursor) (obj1)));
        obj2 = a.a.bs.a(((String) (obj2)));
        obj3 = new bg(a.a.fm.a(((Collection) (obj3))));
        boolean flag;
        if (!a(k))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj = new bn(((bs) (obj2)), d1, ((Double) (obj)), ((bg) (obj3)), flag, false, false);
        if (cursor != null)
        {
            cursor.close();
        }
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
        return ((bn) (obj));
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
        k = 0;
          goto _L6
        obj = null;
          goto _L7
    }

    private static ContentValues a(bs bs1, bj bj1)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("session_id", bs1.toString());
        contentvalues.put("event_type", bj1.c().r);
        contentvalues.put("event_data", bj1.d().toString());
        contentvalues.put("timestamp", Double.valueOf(bj1.b()));
        return contentvalues;
    }

    private static boolean a(int i)
    {
        return i == 1;
    }

    private static Collection b(Cursor cursor)
    {
        ArrayList arraylist = new ArrayList();
        int i = cursor.getColumnIndex("session_id");
        int k = cursor.getColumnIndex("start_time");
        int l = cursor.getColumnIndex("end_time");
        int i1 = cursor.getColumnIndex("new_sent");
        int j1 = cursor.getColumnIndex("endtime_sent");
        while (cursor.moveToNext()) 
        {
            Object obj = cursor.getString(i);
            double d1 = cursor.getDouble(k);
            double d2 = cursor.getDouble(l);
            int k1 = cursor.getInt(i1);
            int l1 = cursor.getInt(j1);
            bg bg1 = new bg(fm.h().a());
            obj = a.a.bs.a(((String) (obj)));
            boolean flag;
            if (!a(k1))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            arraylist.add(new bn(((bs) (obj)), d1, Double.valueOf(d2), bg1, flag, true, a(l1)));
        }
        return arraylist;
    }

    private static Double c(bn bn1)
    {
        Double double1 = bn1.a();
        bn1 = double1;
        if (double1 == null)
        {
            bn1 = Double.valueOf(dj.b());
        }
        return bn1;
    }

    private static Collection c(Cursor cursor)
    {
        ArrayList arraylist = new ArrayList();
        int i = cursor.getColumnIndex("event_type");
        int k = cursor.getColumnIndex("event_data");
        int l = cursor.getColumnIndex("timestamp");
        while (cursor.moveToNext()) 
        {
            String s = cursor.getString(i);
            String s1 = cursor.getString(k);
            double d1 = cursor.getDouble(l);
            try
            {
                arraylist.add(a.a.bu.a(s, s1, d1));
            }
            catch (JSONException jsonexception)
            {
                com.appboy.f.a.d(a, String.format("Could not create AppboyEvent from [type=%s, data=%s, timestamp=%f] ... Skipping", new Object[] {
                    s, s1, Double.valueOf(d1)
                }));
            }
        }
        return arraylist;
    }

    public final bn a()
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
                com.appboy.f.a.d(a, (new StringBuilder("Got > 1 session while trying to get stored open session. ")).append(((Cursor) (obj)).getCount()).append(" open sessions in database").toString());
            }
            obj = a(((Cursor) (obj)));
        }
        catch (Exception exception)
        {
            com.appboy.f.a.c(a, "Failed to retrieve stored open session.", exception);
            return null;
        }
        return ((bn) (obj));
    }

    public final void a(bn bn1)
    {
        boolean flag;
        flag = true;
        if (bn1 == null)
        {
            break MISSING_BLOCK_LABEL_300;
        }
        d().beginTransaction();
        Object obj;
        ContentValues contentvalues;
        b(bn1);
        obj = bn1.e();
        contentvalues = new ContentValues();
        contentvalues.put("session_id", bn1.d.toString());
        contentvalues.put("start_time", Double.valueOf(bn1.e));
        contentvalues.put("end_time", c(bn1));
        int i;
        if (bn1.b())
        {
            i = 1;
        } else
        {
            i = 0;
        }
        contentvalues.put("new_sent", Integer.valueOf(i));
        if (bn1.d())
        {
            i = 1;
        } else
        {
            i = 0;
        }
        contentvalues.put("endtime_sent", Integer.valueOf(i));
        if (bn1.c())
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
        bj bj1;
        for (obj = ((bg) (obj)).a.iterator(); ((Iterator) (obj)).hasNext(); String.format("Inserted event into row %d", new Object[] {
    Long.valueOf(d().insert("ab_events", null, a(bn1.d, bj1)))
}))
        {
            bj1 = (bj)((Iterator) (obj)).next();
        }

        break MISSING_BLOCK_LABEL_271;
        bn1;
        d().endTransaction();
        throw bn1;
        bn1;
        d().endTransaction();
        throw bn1;
        d().setTransactionSuccessful();
        d().endTransaction();
        d().setTransactionSuccessful();
        d().endTransaction();
        return;
        com.appboy.f.a.d(a, "Erroneously received upsertSession call with null session value.  Please report this result to Appboy.");
        return;
    }

    public final void a(bn bn1, bj bj1)
    {
        int i;
        if (bj1.c() == j.g && bj1.d().optBoolean("nop", false))
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i == 0)
        {
            Object obj = bn1.d;
            if (d().insert("ab_events", null, a(((bs) (obj)), bj1)) == -1L)
            {
                com.appboy.f.a.c(a, String.format("Failed to insert event [%s] for session with ID [%s]", new Object[] {
                    bj1.toString(), ((bs) (obj)).toString()
                }));
            }
            bj1 = new ContentValues();
            bj1.put("end_time", c(bn1));
            obj = String.format("%s = ? AND %s = ?", new Object[] {
                "sealed", "session_id"
            });
            String s = String.valueOf(bn1.d);
            i = d().updateWithOnConflict("ab_sessions", bj1, ((String) (obj)), new String[] {
                "0", s
            }, 2);
            if (bn1.c())
            {
                if (i != 0);
            } else
            if (i != 1)
            {
                com.appboy.f.a.c(a, String.format("Attempt to update end time affected %d rows, expected just one.", new Object[] {
                    Integer.valueOf(i)
                }));
                return;
            }
        }
    }

    public final bn b()
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
                com.appboy.f.a.d(a, (new StringBuilder("Got > 1 session while trying to get stored closed session. ")).append(((Cursor) (obj)).getCount()).append(" closed sessions in database").toString());
            }
            obj = a(((Cursor) (obj)));
        }
        catch (Exception exception)
        {
            com.appboy.f.a.c(a, "Failed to retrieve stored closed session.", exception);
            return null;
        }
        return ((bn) (obj));
    }

    public final void b(bn bn1)
    {
        d().beginTransaction();
        String s = String.format("%s = ?", new Object[] {
            "session_id"
        });
        String as[] = new String[1];
        as[0] = bn1.d.toString();
        String.format("Deleting session removed %d rows.", new Object[] {
            Integer.valueOf(d().delete("ab_sessions", s, as))
        });
        bn1 = String.format("%s = ?", new Object[] {
            "session_id"
        });
        String.format("Deleting session events removed %d rows.", new Object[] {
            Integer.valueOf(d().delete("ab_events", bn1, as))
        });
        d().setTransactionSuccessful();
        d().endTransaction();
        return;
        bn1;
        d().endTransaction();
        throw bn1;
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
        com.appboy.f.a.b(a, String.format("Found %d sealed session rows.", new Object[] {
            Integer.valueOf(cursor.getCount())
        }));
        obj1 = b(cursor);
        cursor.close();
        iterator = ((Collection) (obj1)).iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        bn bn1;
        bn1 = (bn)iterator.next();
        obj1 = bn1.d.toString();
        obj1 = d().query("ab_events", c, s, new String[] {
            obj1
        }, null, null, null);
        double d1;
        bg bg1;
        bs bs1;
        Double double1;
        bg1 = new bg(a.a.fm.a(c(((Cursor) (obj1)))));
        bs1 = bn1.d;
        d1 = bn1.e;
        double1 = bn1.a();
        boolean flag;
        if (!bn1.b())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((Collection) (obj)).add(new bn(bs1, d1, double1, bg1, flag, true, bn1.d()));
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
            break MISSING_BLOCK_LABEL_315;
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
        if (d == null)
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
            f.a, a/a/de.getName()
        });
    }
}
