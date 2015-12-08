// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

final class ewf
    implements eut
{

    ewf()
    {
    }

    public final void a(SQLiteDatabase sqlitedatabase)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("key", Integer.valueOf(5));
        contentvalues.put("value", Integer.valueOf(1));
        sqlitedatabase.insert("metadata_sync", null, contentvalues);
    }
}
