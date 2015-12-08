// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.b;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.tinder.utils.v;

// Referenced classes of package com.tinder.b:
//            a, g, h, j, 
//            m, e, n, i, 
//            d, k, l

public final class f extends SQLiteOpenHelper
{

    private static a a;
    private static g b;
    private static h c;
    private static j d;
    private static m e;
    private static n f;
    private static e g;
    private static i h;
    private static d i;
    private static k j;

    public f(Context context)
    {
        super(context, "tinder.db", null, 18);
        a = new a();
        b = new g();
        c = new h();
        d = new j();
        e = new m();
        g = new e();
        f = new n();
        h = new i();
        i = new d();
        j = new k();
    }

    public static void a()
    {
        l.a().c("matches");
        l.a().c("messages");
        l.a().c("photos_processed");
        l.a().c("photos");
        l.a().c("users");
        l.a().c("ratings_failed");
        l.a().c("tinder_locations");
        l.a().c("CRASHES");
        l.a().c(j.a);
        a(l.a().a);
    }

    public static void a(Cursor cursor)
    {
        if (cursor != null && !cursor.isClosed())
        {
            cursor.close();
        }
    }

    private static void a(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL(a.d());
        sqlitedatabase.execSQL(b.d());
        sqlitedatabase.execSQL(c.d());
        sqlitedatabase.execSQL(d.d());
        sqlitedatabase.execSQL(e.d());
        sqlitedatabase.execSQL(f.d());
        sqlitedatabase.execSQL(g.d());
        sqlitedatabase.execSQL(h.d());
        sqlitedatabase.execSQL(i.d());
        sqlitedatabase.execSQL(j.d());
    }

    public final void onCreate(SQLiteDatabase sqlitedatabase)
    {
        a(sqlitedatabase);
    }

    public final void onUpgrade(SQLiteDatabase sqlitedatabase, int i1, int j1)
    {
        v.a((new StringBuilder("Database upgrade from old: ")).append(i1).append(" to: ").append(j1).toString());
        if (i1 < 3)
        {
            sqlitedatabase.execSQL("alter table photos add column photo_order integer");
            sqlitedatabase.execSQL("ALTER TABLE matches ADD COLUMN draft_msg TEXT");
        }
        if (i1 < 4)
        {
            sqlitedatabase.execSQL("alter table users add column last_activity_date text");
        }
        if (i1 < 6)
        {
            sqlitedatabase.execSQL("alter table matches add column reported_for integer");
        }
        if (i1 < 7)
        {
            sqlitedatabase.execSQL(a.d());
        }
        if (i1 < 8)
        {
            sqlitedatabase.execSQL("alter table matches add column gender integer");
            sqlitedatabase.execSQL("alter table matches add column following integer default 1");
            sqlitedatabase.execSQL(g.d());
        }
        if (i1 < 11)
        {
            sqlitedatabase.execSQL("alter table users add column traveling integer default 0");
            sqlitedatabase.execSQL(h.d());
        }
        if (i1 < 12)
        {
            sqlitedatabase.execSQL(i.d());
            sqlitedatabase.execSQL(j.d());
        }
        if (i1 < 13)
        {
            sqlitedatabase.execSQL("alter table users add column is_verified integer");
            sqlitedatabase.execSQL("alter table matches add column is_verified integer");
        }
        if (i1 < 14)
        {
            sqlitedatabase.execSQL("alter table users add column is_superlike integer");
            sqlitedatabase.execSQL("alter table matches add column is_superlike integer");
            sqlitedatabase.execSQL("alter table matches add column superliker text");
            sqlitedatabase.execSQL("alter table ratings_failed add column is_superlike integer");
        }
        if (i1 < 15)
        {
            sqlitedatabase.execSQL("DROP TABLE IF EXISTS moments");
            sqlitedatabase.execSQL("DROP TABLE IF EXISTS moment_likes");
            sqlitedatabase.execSQL("DROP TABLE IF EXISTS photos_moments");
        }
        if (i1 < 16)
        {
            sqlitedatabase.execSQL("alter table users add column badges text");
            sqlitedatabase.execSQL("alter table matches add column badges text");
            sqlitedatabase.execSQL("alter table users add column username text");
            sqlitedatabase.execSQL("alter table matches add column username text");
        }
        if (i1 < 17)
        {
            sqlitedatabase.execSQL("DROP TABLE IF EXISTS recommendations");
            sqlitedatabase.execSQL("DROP TABLE IF EXISTS facebook_friends");
            sqlitedatabase.execSQL("alter table users add column birthdate date");
        }
        if (i1 < 18)
        {
            sqlitedatabase.execSQL("alter table users add column teaser text");
        }
    }
}
