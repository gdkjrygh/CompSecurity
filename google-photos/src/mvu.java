// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public final class mvu
{

    public String a;
    public String b[];
    public String c;
    public String d[];
    public String e;
    public String f;
    public String g;
    private final SQLiteDatabase h;

    public mvu(SQLiteDatabase sqlitedatabase)
    {
        h = sqlitedatabase;
    }

    public final Cursor a()
    {
        return h.query(false, a, b, c, d, e, null, f, g);
    }
}
