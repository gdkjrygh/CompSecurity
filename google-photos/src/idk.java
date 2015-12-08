// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.sqlite.SQLiteDatabase;

final class idk
    implements mvi
{

    idk()
    {
    }

    public final String a()
    {
        return "settings_storage";
    }

    public final void a(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("CREATE TABLE settings(setting_name TEXT PRIMARY KEY, is_enabled INTEGER NOT NULL)");
    }

    public final boolean a(SQLiteDatabase sqlitedatabase, int i, int j, int k)
    {
        return false;
    }

    public final void b(SQLiteDatabase sqlitedatabase)
    {
    }

    public final String[] b()
    {
        return (new String[] {
            "settings"
        });
    }

    public final String[] c()
    {
        return new String[0];
    }

    public final int d()
    {
        return 1;
    }
}
