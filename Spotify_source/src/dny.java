// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;

public final class dny
    implements dob, doc
{

    public static final String a[] = {
        "_id", "name", "item_count", "uri", "owner_name", "is_own", "is_subscribed", "is_collaborative", "offline_state", "sync_progress", 
        "subscriber_count", "is_published", "is_available", "is_loaded", "is_loadable", "is_folder", "folder_count", "is_radio_available", "is_playing", "is_paused", 
        "image_uri", "lookup_included", "owner_uri", "description", "time_modified", "length", "playable_item_count", "image_is_annotated", "description_is_annotated", "image_large_uri", 
        "is_special_exported_starred"
    };
    private boolean A;
    private String B;
    public String b;
    public String c;
    public String d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    private String k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;
    private int r;
    private int s;
    private int t;
    private int u;
    private String v;
    private String w;
    private long x;
    private int y;
    private boolean z;

    public dny()
    {
        this("", "", "");
    }

    public dny(String s1, String s2, String s3)
    {
        c = s1;
        v = s2;
        b = s3;
    }

    public final boolean A()
    {
        return l || e;
    }

    public final boolean B()
    {
        return r > 0;
    }

    public final boolean C()
    {
        return l;
    }

    public final String D()
    {
        return w;
    }

    public final long E()
    {
        return x;
    }

    public final int F()
    {
        return y;
    }

    public final String G()
    {
        return B;
    }

    public final boolean H()
    {
        return !B();
    }

    public final String a()
    {
        return c;
    }

    public final void a(Cursor cursor, String s1)
    {
        cursor.getInt(0);
        b = gcw.a(cursor, 1, s1);
        c = gcw.a(cursor, 3, "");
        k = gcw.a(cursor, 4, "");
        d = gcw.a(cursor, 20, "");
        l = gcw.a(cursor, 5);
        m = gcw.a(cursor, 6);
        e = gcw.a(cursor, 7);
        n = gcw.a(cursor, 11);
        o = gcw.a(cursor, 12);
        p = gcw.a(cursor, 17);
        f = gcw.a(cursor, 15);
        g = gcw.a(cursor, 18);
        gcw.a(cursor, 19);
        q = gcw.a(cursor, 30);
        gcw.a(cursor, 13);
        h = gcw.a(cursor, 14);
        r = cursor.getInt(2);
        s = cursor.getInt(10);
        t = cursor.getInt(16);
        i = cursor.getInt(8);
        j = cursor.getInt(9);
        u = cursor.getInt(21);
        v = gcw.a(cursor, 22, "");
        w = gcw.a(cursor, 23, "");
        x = Long.decode(gcw.a(cursor, 24, "0")).longValue();
        y = cursor.getInt(25);
        cursor.getInt(26);
        z = gcw.a(cursor, 27);
        A = gcw.a(cursor, 28);
        B = gcw.a(cursor, 29, "");
    }

    public final String b()
    {
        return b;
    }

    public final String c()
    {
        return k;
    }

    public final String d()
    {
        return d;
    }

    public final int e()
    {
        return r;
    }

    public final int f()
    {
        return t;
    }

    public final int g()
    {
        return s;
    }

    public final int h()
    {
        return i;
    }

    public final int i()
    {
        return j;
    }

    public final int j()
    {
        return u;
    }

    public final boolean k()
    {
        return q;
    }

    public final boolean l()
    {
        return m;
    }

    public final boolean m()
    {
        return f;
    }

    public final boolean n()
    {
        return l;
    }

    public final boolean o()
    {
        return (l || m) && !f;
    }

    public final boolean p()
    {
        return o;
    }

    public final boolean q()
    {
        return p && o && !y() && !f;
    }

    public final boolean r()
    {
        return e;
    }

    public final boolean s()
    {
        return n;
    }

    public final boolean t()
    {
        return h;
    }

    public final boolean u()
    {
        return z || A;
    }

    public final boolean v()
    {
        return !l && !m;
    }

    public final String w()
    {
        return v;
    }

    public final boolean x()
    {
        return "local".equals(c);
    }

    public final boolean y()
    {
        return "queue".equals(c);
    }

    public final boolean z()
    {
        return !l || n;
    }

}
