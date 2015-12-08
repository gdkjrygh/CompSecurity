// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.sqlite.SQLiteDatabase;

final class esg
    implements err
{

    private String a;

    public esg(String s)
    {
        a = s;
    }

    public final Object a(SQLiteDatabase sqlitedatabase)
    {
        if (sqlitedatabase.delete("collections", "collection_media_key = ?", new String[] {
    a
}) != 0)
        {
            return a;
        } else
        {
            return null;
        }
    }

    public final String a()
    {
        return a;
    }
}
