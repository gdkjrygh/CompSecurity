// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import com.spotify.mobile.android.spotlets.collection.util.CollectionState;
import com.spotify.mobile.android.ui.fragments.logic.Flags;

public final class dnw
    implements dnv
{

    public static final String a[] = {
        "_id", "name", "uri", "collection_uri", "artist_name", "artist_uri", "image_small_uri", "year", "type", "is_available", 
        "is_artist_browsable", "is_radio_available", "is_queueable", "tracks_count", "tracks_in_collection_count", "is_playing", "is_paused", "offline_state", "sync_progress", "can_undownload", 
        "sort_name", "image_uri", "is_complete_in_collection", "image_large_uri", "copyright", "artist_image_uri"
    };
    public String b;
    public String c;
    public String d;
    public String e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public int j;
    public int k;
    public boolean l;
    public int m;
    public int n;
    public String o;
    public String p;
    public String q;
    private String r;
    private boolean s;
    private String t;
    private String u;

    public dnw()
    {
    }

    public final CollectionState a(Flags flags)
    {
        return CollectionState.a(flags, n, s);
    }

    public final String a()
    {
        return r;
    }

    public final void a(Cursor cursor)
    {
        cursor.getInt(0);
        b = gcw.a(cursor, 1, "");
        r = cursor.getString(2);
        c = cursor.getString(3);
        f = gcw.a(cursor, 9);
        g = gcw.a(cursor, 10);
        h = gcw.a(cursor, 11);
        i = gcw.a(cursor, 12);
        l = gcw.a(cursor, 15);
        gcw.a(cursor, 16);
        gcw.a(cursor, 19);
        j = cursor.getInt(17);
        k = cursor.getInt(18);
        d = gcw.a(cursor, 4, "");
        e = cursor.getString(5);
        q = gcw.a(cursor, 7, "");
        m = cursor.getInt(13);
        n = cursor.getInt(14);
        s = gcw.a(cursor, 22);
        o = cursor.getString(21);
        cursor.getString(6);
        p = cursor.getString(23);
        t = cursor.getString(24);
        u = cursor.getString(25);
    }

    public final int b()
    {
        return j;
    }

    public final String c()
    {
        return c;
    }

    public final int d()
    {
        return k;
    }

    public final String e()
    {
        return d;
    }

    public final boolean f()
    {
        return g;
    }

    public final String g()
    {
        return e;
    }

    public final String h()
    {
        return b;
    }

    public final boolean i()
    {
        return f;
    }

    public final String j()
    {
        return q;
    }

    public final String k()
    {
        return p;
    }

    public final String l()
    {
        return t;
    }

    public final String m()
    {
        return u;
    }

}
