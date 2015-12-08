// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.radio.data;

import android.content.ContentValues;
import android.database.Cursor;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

public class g
    implements Serializable
{

    private final String a;
    private int b;
    private int c;
    private int d;

    public g(Cursor cursor)
    {
        a = cursor.getString(1);
        b = cursor.getInt(25);
        d = cursor.getInt(26);
        c = cursor.getInt(27);
    }

    public g(JSONObject jsonobject, String s)
        throws JSONException
    {
        a = s;
        b = jsonobject.optInt("stationPersonalizationPercent");
        d = jsonobject.optInt("totalThumbsDown");
        c = jsonobject.optInt("totalThumbsUp");
    }

    public ContentValues a()
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("stationToken", a);
        contentvalues.put("personalizationProgress", Integer.valueOf(b));
        contentvalues.put("totalThumbsUp", Integer.valueOf(c));
        contentvalues.put("totalThumbsDown", Integer.valueOf(d));
        contentvalues.put("dateCached", Long.valueOf(System.currentTimeMillis()));
        return contentvalues;
    }

    public int b()
    {
        return b;
    }

    public int c()
    {
        return d;
    }

    public int d()
    {
        return c;
    }

    public String e()
    {
        return a;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (g)obj;
            if (b != ((g) (obj)).b)
            {
                return false;
            }
            if (d != ((g) (obj)).d)
            {
                return false;
            }
            if (c != ((g) (obj)).c)
            {
                return false;
            }
            if (a == null ? ((g) (obj)).a != null : !a.equals(((g) (obj)).a))
            {
                return false;
            }
        }
        return true;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("ExtendedStationData <percent = ").append(b);
        stringbuilder.append(", totalsThumbsUp = ").append(c);
        stringbuilder.append(", totalsThumbsDown = ").append(d);
        stringbuilder.append(">");
        return stringbuilder.toString();
    }
}
