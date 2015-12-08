// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.appboy.Constants;
import com.appboy.support.AppboyLogger;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package bo.app:
//            ev

public final class dy extends SQLiteOpenHelper
{

    private static final String a;
    private static volatile Map b = new HashMap();
    private static final String c = String.format("CREATE TABLE %s (%s INTEGER PRIMARY KEY AUTOINCREMENT, %s TEXT UNIQUE NOT NULL, %s INTEGER NOT NULL, %s INTEGER, %s TEXT, %s TEXT, %s REAL, %s REAL, %s INTEGER NOT NULL CHECK(%s IN (%s, %s)), %s INTEGER NOT NULL CHECK(%s IN (%s, %s)), %s INTEGER NOT NULL CHECK(%s IN (%s, %s)));", new Object[] {
        "ab_sessions", "_id", "session_id", "start_time", "end_time", "latitude", "longitude", "altitude", "accuracy", "new_sent", 
        "new_sent", Integer.valueOf(1), Integer.valueOf(0), "sealed", "sealed", Integer.valueOf(1), Integer.valueOf(0), "endtime_sent", "endtime_sent", Integer.valueOf(1), 
        Integer.valueOf(0)
    });
    private static final String d = String.format("CREATE TABLE %s (%s INTEGER PRIMARY KEY AUTOINCREMENT, %s TEXT, %s TEXT NOT NULL, %s TEXT NOT NULL, %s INTEGER NOT NULL);", new Object[] {
        "ab_events", "_id", "session_id", "event_type", "event_data", "timestamp"
    });

    private dy(Context context, String s)
    {
        super(context, s, null, 2);
    }

    public static dy a(Context context, String s)
    {
        if (ev.c(s))
        {
            s = "appboy.db";
        } else
        {
            s = String.format("%s.%s", new Object[] {
                "appboy.db", s
            });
        }
        if (b.containsKey(s)) goto _L2; else goto _L1
_L1:
        bo/app/dy;
        JVM INSTR monitorenter ;
        if (b.containsKey(s))
        {
            break MISSING_BLOCK_LABEL_85;
        }
        context = new dy(context, s);
        b.put(s, context);
        bo/app/dy;
        JVM INSTR monitorexit ;
        return context;
        bo/app/dy;
        JVM INSTR monitorexit ;
_L2:
        return (dy)b.get(s);
        context;
        throw context;
    }

    public final void onCreate(SQLiteDatabase sqlitedatabase)
    {
        AppboyLogger.i(a, String.format("Creating %s table", new Object[] {
            "ab_sessions"
        }));
        sqlitedatabase.execSQL(c);
        AppboyLogger.i(a, String.format("Creating %s table", new Object[] {
            "ab_events"
        }));
        sqlitedatabase.execSQL(d);
    }

    public final void onDowngrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        AppboyLogger.i(a, String.format("Downgrading storage from version %d to %d. Dropping all current tables.", new Object[] {
            Integer.valueOf(i), Integer.valueOf(j)
        }));
        sqlitedatabase.execSQL(String.format("DROP TABLE IF EXISTS %s;", new Object[] {
            "ab_events"
        }));
        sqlitedatabase.execSQL(String.format("DROP TABLE IF EXISTS %s;", new Object[] {
            "ab_sessions"
        }));
        onCreate(sqlitedatabase);
    }

    public final void onOpen(SQLiteDatabase sqlitedatabase)
    {
        super.onOpen(sqlitedatabase);
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            sqlitedatabase.setForeignKeyConstraintsEnabled(true);
        } else
        if (!sqlitedatabase.isReadOnly())
        {
            sqlitedatabase.execSQL("PRAGMA foreign_keys = ON;");
            return;
        }
    }

    public final void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        if (j == 2)
        {
            sqlitedatabase.execSQL("DROP TABLE IF EXISTS sessions");
            sqlitedatabase.execSQL("DROP TABLE IF EXISTS appboy_events");
            sqlitedatabase.execSQL("DROP TABLE IF EXISTS ab_sessions");
            sqlitedatabase.execSQL("DROP TABLE IF EXISTS ab_events");
            onCreate(sqlitedatabase);
            return;
        } else
        {
            AppboyLogger.e(a, String.format("Received call to onUpgrade with unknown upgrade version %d.  Please contact Appboy to report this error.", new Object[] {
                Integer.valueOf(j)
            }));
            return;
        }
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            Constants.APPBOY_LOG_TAG_PREFIX, bo/app/dy.getName()
        });
    }
}
