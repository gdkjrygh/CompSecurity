// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;

final class iuu
    implements nkx
{

    private final iur a;
    private final gbd b;

    iuu(iur iur1, gbd gbd1)
    {
        a = iur1;
        b = gbd1;
    }

    public final void a(Uri uri)
    {
        Object obj = b.a(uri.toString());
        if (obj == null)
        {
            return;
        } else
        {
            uri = a;
            obj = ((nko) (obj)).b();
            SQLiteDatabase sqlitedatabase = ((iur) (uri)).a.getWritableDatabase();
            ContentValues contentvalues = new ContentValues();
            contentvalues.put("local_dedup_key", ((String) (obj)));
            contentvalues.put("deleted_timestamp", Long.valueOf(((iur) (uri)).b.a()));
            sqlitedatabase.insertWithOnConflict("media_store_extra_deleted_media", null, contentvalues, 5);
            return;
        }
    }
}
