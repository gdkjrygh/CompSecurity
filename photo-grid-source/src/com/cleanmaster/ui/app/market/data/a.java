// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.ui.app.market.data;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import org.json.JSONObject;

public class a
{

    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public long g;
    public String h;

    public a()
    {
        a = -1;
        b = 0;
        c = -1;
        d = -1;
        e = -1;
        f = -1;
        g = 0L;
        h = "";
    }

    public static void a(SQLiteDatabase sqlitedatabase, String s)
    {
        sqlitedatabase.execSQL((new StringBuilder("CREATE TABLE IF NOT EXISTS ")).append(s).append("(_id INTEGER PRIMARY KEY,pos_id TEXT,show_type TEXT,total_ads INTEGER ,x_mtime INTEGER );").toString());
    }

    public ContentValues a()
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("pos_id", h);
        contentvalues.put("total_ads", Integer.valueOf(f));
        contentvalues.put("show_type", Integer.valueOf(e));
        contentvalues.put("x_mtime", Long.valueOf(System.currentTimeMillis()));
        return contentvalues;
    }

    public ContentValues a(String s)
    {
        return a();
    }

    public a a(Cursor cursor)
    {
        a a1 = new a();
        a1.h = cursor.getString(cursor.getColumnIndex("pos_id"));
        a1.f = cursor.getInt(cursor.getColumnIndex("total_ads"));
        a1.e = cursor.getInt(cursor.getColumnIndex("show_type"));
        a1.g = cursor.getLong(cursor.getColumnIndex("x_mtime"));
        return a1;
    }

    public Object a(JSONObject jsonobject)
    {
        try
        {
            a = jsonobject.getInt("code");
            b = jsonobject.getInt("adn");
            c = jsonobject.getInt("offset");
            d = jsonobject.getInt("show_rating");
            e = jsonobject.getInt("show_type");
            f = jsonobject.getInt("total_ads");
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            jsonobject.printStackTrace();
            return this;
        }
        return this;
    }

    public String toString()
    {
        return String.format("(:pos_id %s :code %d :total_ads %d :show_type %d :show_rating %d :x_mtime %d)", new Object[] {
            h, Integer.valueOf(a), Integer.valueOf(f), Integer.valueOf(e), Integer.valueOf(d), Long.valueOf(g)
        });
    }
}
