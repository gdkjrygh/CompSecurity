// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;

public final class doa
    implements dof
{

    public static final String a[] = {
        "_id", "name", "username", "uri", "icon_uri", "is_relation_spotify", "is_friend", "is_available", "facebook_uid"
    };
    public String b;
    public boolean c;
    public String d;
    private String e;

    public doa()
    {
    }

    public static doa a(Cursor cursor, String s)
    {
        ctz.a(cursor);
        doa doa1 = new doa();
        doa1.b(cursor, s);
        return doa1;
    }

    public final String a()
    {
        return e;
    }

    public final void b(Cursor cursor, String s)
    {
        b = gcw.a(cursor, 1, s);
        e = gcw.a(cursor, 2, s);
        cursor.getString(3);
        d = cursor.getString(4);
        gcw.a(cursor, 5);
        gcw.a(cursor, 6);
        c = gcw.a(cursor, 7);
        gcw.a(cursor, 8, s);
    }

}
