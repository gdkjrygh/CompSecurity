// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.mpmetrics;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.android.slyce.report.mpmetrics:
//            ae, ad

class ac
{

    private static final String a;
    private static final String b;
    private static final String c;
    private static final String d;
    private final ad e;

    public ac(Context context)
    {
        this(context, "mixpanel");
    }

    public ac(Context context, String s)
    {
        e = new ad(context, s);
    }

    static String b()
    {
        return a;
    }

    static String c()
    {
        return b;
    }

    static String d()
    {
        return c;
    }

    static String e()
    {
        return d;
    }

    public int a(JSONObject jsonobject, ae ae1)
    {
        Object obj;
        Object obj1;
        String s;
        obj = null;
        obj1 = null;
        s = ae1.a();
        ae1 = obj;
        SQLiteDatabase sqlitedatabase = e.getWritableDatabase();
        ae1 = obj;
        ContentValues contentvalues = new ContentValues();
        ae1 = obj;
        contentvalues.put("data", jsonobject.toString());
        ae1 = obj;
        contentvalues.put("created_at", Long.valueOf(System.currentTimeMillis()));
        ae1 = obj;
        sqlitedatabase.insert(s, null, contentvalues);
        ae1 = obj;
        jsonobject = sqlitedatabase.rawQuery((new StringBuilder()).append("SELECT COUNT(*) FROM ").append(s).toString(), null);
        ae1 = jsonobject;
        jsonobject.moveToFirst();
        ae1 = jsonobject;
        int i = jsonobject.getInt(0);
        if (jsonobject != null)
        {
            jsonobject.close();
        }
        e.close();
        return i;
        SQLiteException sqliteexception;
        sqliteexception;
        jsonobject = null;
_L4:
        ae1 = jsonobject;
        Log.e("MixpanelAPI.Database", (new StringBuilder()).append("Could not add Mixpanel data to table ").append(s).append(". Re-initializing database.").toString(), sqliteexception);
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_195;
        }
        ae1 = jsonobject;
        jsonobject.close();
        jsonobject = obj1;
        ae1 = jsonobject;
        e.a();
        if (jsonobject != null)
        {
            jsonobject.close();
        }
        e.close();
        return -1;
        jsonobject;
_L2:
        if (ae1 != null)
        {
            ae1.close();
        }
        e.close();
        throw jsonobject;
        jsonobject;
        if (true) goto _L2; else goto _L1
_L1:
        sqliteexception;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void a()
    {
        e.a();
    }

    public void a(long l, ae ae1)
    {
        ae1 = ae1.a();
        e.getWritableDatabase().delete(ae1, (new StringBuilder()).append("created_at <= ").append(l).toString(), null);
        e.close();
        return;
        SQLiteException sqliteexception;
        sqliteexception;
        Log.e("MixpanelAPI.Database", (new StringBuilder()).append("Could not clean timed-out Mixpanel records from ").append(ae1).append(". Re-initializing database.").toString(), sqliteexception);
        e.a();
        e.close();
        return;
        ae1;
        e.close();
        throw ae1;
    }

    public void a(String s, ae ae1)
    {
        ae1 = ae1.a();
        e.getWritableDatabase().delete(ae1, (new StringBuilder()).append("_id <= ").append(s).toString(), null);
        e.close();
        return;
        s;
        Log.e("MixpanelAPI.Database", (new StringBuilder()).append("Could not clean sent Mixpanel records from ").append(ae1).append(". Re-initializing database.").toString(), s);
        e.a();
        e.close();
        return;
        s;
        e.close();
        throw s;
    }

    public String[] a(ae ae1)
    {
        Object obj1;
        String s;
        obj1 = null;
        s = ae1.a();
        String as[] = e.getReadableDatabase().rawQuery((new StringBuilder()).append("SELECT * FROM ").append(s).append(" ORDER BY ").append("created_at").append(" ASC LIMIT 50").toString(), null);
        Object obj = as;
        Object obj2 = new JSONArray();
        ae1 = null;
_L2:
        obj = as;
        if (!as.moveToNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = as;
        if (!as.isLast())
        {
            break MISSING_BLOCK_LABEL_108;
        }
        obj = as;
        ae1 = as.getString(as.getColumnIndex("_id"));
        obj = as;
        ((JSONArray) (obj2)).put(new JSONObject(as.getString(as.getColumnIndex("data"))));
        continue; /* Loop/switch isn't completed */
        obj;
        if (true) goto _L2; else goto _L1
_L1:
        obj = as;
        if (((JSONArray) (obj2)).length() <= 0) goto _L4; else goto _L3
_L3:
        obj = as;
        obj2 = ((JSONArray) (obj2)).toString();
        obj = obj2;
_L10:
        e.close();
        if (as != null)
        {
            as.close();
        }
_L5:
        as = obj1;
        if (ae1 != null)
        {
            as = obj1;
            if (obj != null)
            {
                as = new String[2];
                as[0] = ae1;
                as[1] = obj;
            }
        }
        return as;
        ae1;
        as = null;
_L8:
        obj = as;
        Log.e("MixpanelAPI.Database", (new StringBuilder()).append("Could not pull records for Mixpanel out of database ").append(s).append(". Waiting to send.").toString(), ae1);
        e.close();
        if (as != null)
        {
            as.close();
            ae1 = null;
            obj = null;
        } else
        {
            ae1 = null;
            obj = null;
        }
          goto _L5
        ae1;
        obj = null;
_L7:
        e.close();
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        throw ae1;
        ae1;
        if (true) goto _L7; else goto _L6
_L6:
        ae1;
          goto _L8
_L4:
        obj = null;
        if (true) goto _L10; else goto _L9
_L9:
    }

    static 
    {
        a = (new StringBuilder()).append("CREATE TABLE ").append(ae.a.a()).append(" (_id INTEGER PRIMARY KEY AUTOINCREMENT, ").append("data").append(" STRING NOT NULL, ").append("created_at").append(" INTEGER NOT NULL);").toString();
        b = (new StringBuilder()).append("CREATE TABLE ").append(ae.b.a()).append(" (_id INTEGER PRIMARY KEY AUTOINCREMENT, ").append("data").append(" STRING NOT NULL, ").append("created_at").append(" INTEGER NOT NULL);").toString();
        c = (new StringBuilder()).append("CREATE INDEX IF NOT EXISTS time_idx ON ").append(ae.a.a()).append(" (").append("created_at").append(");").toString();
        d = (new StringBuilder()).append("CREATE INDEX IF NOT EXISTS time_idx ON ").append(ae.b.a()).append(" (").append("created_at").append(");").toString();
    }
}
