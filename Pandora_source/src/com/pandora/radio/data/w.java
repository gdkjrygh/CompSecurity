// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.radio.data;

import android.content.ContentValues;
import android.database.Cursor;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.pandora.radio.data:
//            m

public class w extends m
    implements Serializable
{

    private final String a;
    private String b;

    public w(Cursor cursor)
    {
        super(cursor);
        a = cursor.getString(0);
        b = cursor.getString(1);
    }

    public w(String s, JSONObject jsonobject)
        throws JSONException
    {
        super(jsonobject);
        a = s;
        b = jsonobject.optString("seedId");
    }

    public String a()
    {
        return b;
    }

    public String b()
    {
        return a;
    }

    public ContentValues d()
    {
        ContentValues contentvalues = super.d();
        contentvalues.put("stationToken", a);
        contentvalues.put("seedId", b);
        return contentvalues;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (w)obj;
            if (!super.equals(obj))
            {
                return false;
            }
            if (a == null ? ((w) (obj)).a != null : !a.equals(((w) (obj)).a))
            {
                return false;
            }
            if (b == null ? ((w) (obj)).b != null : !b.equals(((w) (obj)).b))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        int j = 0;
        int k = super.hashCode();
        int i;
        if (a != null)
        {
            i = a.hashCode();
        } else
        {
            i = 0;
        }
        if (b != null)
        {
            j = b.hashCode();
        }
        return (i + k * 31) * 31 + j;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("<").append(i());
        stringbuilder.append(", Artist:").append(f());
        if (i() == m.a.b)
        {
            stringbuilder.append(", SongName:").append(g());
        }
        stringbuilder.append(", SeedId:").append(b);
        stringbuilder.append(">");
        return stringbuilder.toString();
    }
}
