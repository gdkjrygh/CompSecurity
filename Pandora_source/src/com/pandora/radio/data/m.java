// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.radio.data;

import android.content.ContentValues;
import android.database.Cursor;
import com.pandora.radio.util.i;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

public class m
    implements Serializable
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        private static final a c[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/pandora/radio/data/m$a, s);
        }

        public static a[] values()
        {
            return (a[])c.clone();
        }

        static 
        {
            a = new a("ARTIST", 0);
            b = new a("SONG", 1);
            c = (new a[] {
                a, b
            });
        }

        private a(String s, int k)
        {
            super(s, k);
        }
    }


    private String a;
    private String b;
    private String c;
    private String d;
    private long e;
    private a f;
    private String g;

    public m()
    {
    }

    public m(Cursor cursor)
    {
        b = cursor.getString(2);
        a = cursor.getString(3);
        c = cursor.getString(4);
        d = cursor.getString(5);
        e = cursor.getLong(6);
        f = a();
    }

    public m(JSONObject jsonobject)
        throws JSONException
    {
        b = jsonobject.optString("songName");
        a = jsonobject.getString("artistName");
        JSONObject jsonobject1;
        long l;
        if (jsonobject.has("artUrl"))
        {
            c = jsonobject.getString("artUrl");
        } else
        if (jsonobject.has("albumArtUrl"))
        {
            c = jsonobject.getString("albumArtUrl");
        }
        jsonobject1 = jsonobject.optJSONObject("dateCreated");
        if (jsonobject1 != null)
        {
            l = jsonobject1.optLong("time");
        } else
        {
            l = 0L;
        }
        e = l;
        f = a();
        d = jsonobject.optString("musicToken");
        g = jsonobject.optString("songIdentity");
    }

    private a a()
    {
        if (b != null && !com.pandora.radio.util.i.a(b))
        {
            return a.b;
        } else
        {
            return a.a;
        }
    }

    public ContentValues d()
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("titleName", b);
        contentvalues.put("artistName", a);
        contentvalues.put("artUrl", c);
        contentvalues.put("musicToken", d);
        contentvalues.put("dateCreated", Long.valueOf(e));
        return contentvalues;
    }

    public String e()
    {
        return d;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (m)obj;
            if (a == null ? ((m) (obj)).a != null : !a.equals(((m) (obj)).a))
            {
                return false;
            }
            if (b == null ? ((m) (obj)).b != null : !b.equals(((m) (obj)).b))
            {
                return false;
            }
            if (c == null ? ((m) (obj)).c != null : !c.equals(((m) (obj)).c))
            {
                return false;
            }
            if (d == null ? ((m) (obj)).d != null : !d.equals(((m) (obj)).d))
            {
                return false;
            }
            if (e != ((m) (obj)).e)
            {
                return false;
            }
            if (f != ((m) (obj)).f)
            {
                return false;
            }
        }
        return true;
    }

    public String f()
    {
        return a;
    }

    public String g()
    {
        return b;
    }

    public String h()
    {
        return c;
    }

    public int hashCode()
    {
        int k1 = 0;
        int k;
        int l;
        int i1;
        int j1;
        int l1;
        if (a != null)
        {
            k = a.hashCode();
        } else
        {
            k = 0;
        }
        if (b != null)
        {
            l = b.hashCode();
        } else
        {
            l = 0;
        }
        if (c != null)
        {
            i1 = c.hashCode();
        } else
        {
            i1 = 0;
        }
        if (d != null)
        {
            j1 = d.hashCode();
        } else
        {
            j1 = 0;
        }
        l1 = (int)(e ^ e >>> 32);
        if (f != null)
        {
            k1 = f.hashCode();
        }
        return ((j1 + (i1 + (l + k * 31) * 31) * 31) * 31 + l1) * 31 + k1;
    }

    public a i()
    {
        return f;
    }

    public String j()
    {
        return g;
    }
}
