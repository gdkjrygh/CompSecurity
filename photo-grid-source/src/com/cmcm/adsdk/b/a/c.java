// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cmcm.adsdk.b.a;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.cmcm.adsdk.b.c.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

// Referenced classes of package com.cmcm.adsdk.b.a:
//            d, b

public final class c extends d
    implements Comparable
{

    public int a;
    public int b;
    public String c;
    public String d;
    public Integer e;
    public List f;

    public c()
    {
        f = new ArrayList();
    }

    public static c a(Cursor cursor)
    {
        c c1 = new c();
        c1.a = cursor.getInt(cursor.getColumnIndex("adtype"));
        c1.b = cursor.getInt(cursor.getColumnIndex("placeid"));
        c1.d = cursor.getString(cursor.getColumnIndex("name"));
        c1.c = cursor.getString(cursor.getColumnIndex("parameter"));
        c1.e = Integer.valueOf(cursor.getInt(cursor.getColumnIndex("weight")));
        return c1;
    }

    public static void a(SQLiteDatabase sqlitedatabase, String s)
    {
        sqlitedatabase.execSQL((new StringBuilder("CREATE TABLE IF NOT EXISTS ")).append(s).append("(_id INTEGER PRIMARY KEY,adtype INTEGER,placeid INTEGER ,weight INTEGER,name TEXT,parameter INTEGER );").toString());
    }

    public static void b(SQLiteDatabase sqlitedatabase, String s)
    {
        sqlitedatabase.execSQL((new StringBuilder("DROP TABLE IF EXISTS ")).append(s).toString());
    }

    public final ContentValues a()
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("adtype", Integer.valueOf(a));
        contentvalues.put("placeid", Integer.valueOf(b));
        contentvalues.put("name", d);
        contentvalues.put("parameter", c);
        contentvalues.put("weight", e);
        return contentvalues;
    }

    public final Object a(JSONObject jsonobject)
    {
        try
        {
            a = jsonobject.getInt("adtype");
            b = jsonobject.getInt("placeid");
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            com.cmcm.adsdk.b.c.b.c("PosBean", (new StringBuilder("parse json error...")).append(jsonobject.getMessage()).toString());
            return this;
        }
        return this;
    }

    public final volatile int compareTo(Object obj)
    {
        return ((c)obj).e.compareTo(e);
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append((new StringBuilder(" adtype:")).append(a).toString());
        stringbuilder.append((new StringBuilder(" placeid:")).append(b).toString());
        stringbuilder.append((new StringBuilder(" name:")).append(d).toString());
        stringbuilder.append((new StringBuilder(" parameter:")).append(c).toString());
        stringbuilder.append((new StringBuilder(" weight:")).append(e).toString());
        stringbuilder.append(" info:");
        for (Iterator iterator = f.iterator(); iterator.hasNext(); stringbuilder.append("]"))
        {
            com.cmcm.adsdk.b.a.b b1 = (com.cmcm.adsdk.b.a.b)iterator.next();
            stringbuilder.append("[");
            stringbuilder.append((new StringBuilder(" name:")).append(b1.a).toString());
            stringbuilder.append((new StringBuilder(" parameter:")).append(b1.b).toString());
        }

        return stringbuilder.toString();
    }
}
