// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.core.c;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.mobvista.sdk.m.a.a.a.a;

// Referenced classes of package com.mobvista.sdk.m.core.c:
//            e, h

public final class f extends a
{

    private static f a;

    private f(Context context)
    {
        super(context);
    }

    public static f a(Context context)
    {
        com/mobvista/sdk/m/core/c/f;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            a = new f(context.getApplicationContext());
        }
        context = a;
        com/mobvista/sdk/m/core/c/f;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    private static void c(SQLiteDatabase sqlitedatabase)
    {
        try
        {
            sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS campaign (id TEXT,unitid TEXT,tab INTEGER,package_name TEXT,app_name TEXT,app_desc TEXT,app_size TEXT,icon_url TEXT,image_url TEXT,impression_url TEXT,notice_url TEXT,download_url TEXT,only_impression TEXT,bg_image TEXT,preclick INTEGER,ts INTEGER )");
            sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS frequence (id TEXT,unitid TEXT,fc_a INTEGER,fc_b INTEGER,impression_count INTEGER,click_count INTEGER,ts INTEGER )");
            sqlitedatabase.execSQL(com.mobvista.sdk.m.core.c.e.a);
            sqlitedatabase.execSQL(com.mobvista.sdk.m.core.c.h.a);
            sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS campaignclick (id TEXT,unitid TEXT,result TEXT,ts INTEGER )");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (SQLiteDatabase sqlitedatabase)
        {
            sqlitedatabase.printStackTrace();
        }
    }

    private static void d(SQLiteDatabase sqlitedatabase)
    {
        try
        {
            sqlitedatabase.execSQL("DROP TABLE IF EXISTS 'campaign'");
            sqlitedatabase.execSQL("DROP TABLE IF EXISTS 'frequence'");
            sqlitedatabase.execSQL("DROP TABLE IF EXISTS 'Profile'");
            sqlitedatabase.execSQL("DROP TABLE IF EXISTS 'Weight'");
            sqlitedatabase.execSQL("DROP TABLE IF EXISTS 'campaignclick'");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (SQLiteDatabase sqlitedatabase)
        {
            sqlitedatabase.printStackTrace();
        }
    }

    protected final String a()
    {
        return "mobvista.adn.sdk.m.db";
    }

    protected final void a(SQLiteDatabase sqlitedatabase)
    {
        c(sqlitedatabase);
    }

    protected final void b(SQLiteDatabase sqlitedatabase)
    {
        d(sqlitedatabase);
        c(sqlitedatabase);
    }
}
