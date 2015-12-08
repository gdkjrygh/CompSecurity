// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.sqlite.SQLiteDatabase;

final class ewx
    implements eut
{

    ewx()
    {
    }

    public final void a(SQLiteDatabase sqlitedatabase)
    {
        mvj.a(sqlitedatabase, new String[] {
            "explore_suggestions"
        });
        sqlitedatabase.execSQL("CREATE TABLE explore_suggestions (category INTEGER PRIMARY KEY NOT NULL, auto_complete_items_response BLOB NOT NULL)");
    }
}
