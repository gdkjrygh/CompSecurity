// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import android.text.TextUtils;

public final class dnz
    implements doe
{

    public static final String a[] = {
        "_id", "name", "uri", "album_name", "album_uri", "album_image_uri", "artist_name", "artist_uri", "is_playing", "is_available", 
        "is_queued", "offline_state", "is_artist_browsable", "is_album_browsable", "is_radio_available", "is_queueable", "album_collection_uri", "artist_collection_uri", "is_in_collection", "length", 
        "added_by_name", "can_add_to_collection", "is_explicit"
    };
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public boolean l;
    private String m;
    private String n;

    public dnz()
    {
        b = "";
        c = "";
        d = "";
        e = "";
        f = "";
        m = "";
        n = "";
        g = "";
    }

    public final void a(Cursor cursor, String s)
    {
        a(cursor, s, s, s);
    }

    public final void a(Cursor cursor, String s, String s1, String s2)
    {
        h = cursor.getInt(0);
        if (TextUtils.isEmpty(s))
        {
            s = "";
        }
        b = gcw.a(cursor, 1, s);
        if (TextUtils.isEmpty(s1))
        {
            s1 = "";
        }
        c = gcw.a(cursor, 3, s1);
        if (TextUtils.isEmpty(s2))
        {
            s2 = "";
        }
        d = gcw.a(cursor, 6, s2);
        e = gcw.a(cursor, 2, "");
        f = gcw.a(cursor, 4, "");
        gcw.a(cursor, 7, "");
        n = gcw.a(cursor, 16, "");
        gcw.a(cursor, 17, "");
        m = gcw.a(cursor, 5, "");
        g = gcw.a(cursor, 20, "");
        j = gcw.a(cursor, 8);
        k = gcw.a(cursor, 9);
        gcw.a(cursor, 12);
        gcw.a(cursor, 13);
        gcw.a(cursor, 14);
        gcw.a(cursor, 10);
        gcw.a(cursor, 15);
        gcw.a(cursor, 18);
        gcw.a(cursor, 21);
        l = gcw.a(cursor, 22);
        i = cursor.getInt(11);
    }

    public final boolean a()
    {
        return j;
    }

    public final String b()
    {
        return m;
    }

    public final boolean c()
    {
        return k;
    }

    public final long d()
    {
        return (long)h;
    }

    public final String e()
    {
        return e;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (dnz)obj;
            if (h != ((dnz) (obj)).h)
            {
                return false;
            }
        }
        return true;
    }

    public final int f()
    {
        return i;
    }

    public final String g()
    {
        return d;
    }

    public final String h()
    {
        return f;
    }

    public final int hashCode()
    {
        return h;
    }

    public final String i()
    {
        return c;
    }

    public final String j()
    {
        return b;
    }

    public final String k()
    {
        return n;
    }

}
