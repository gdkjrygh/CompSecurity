// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;

public final class nle
    implements nlo
{

    private static final String a[] = {
        "media_store_token"
    };
    private final Context b;

    public nle(Context context)
    {
        b = context;
    }

    public final nlp a(int i, Uri uri, Class class1)
    {
        Cursor cursor;
        class1 = null;
        cursor = mvj.b(b, i).query("all_photos_local_sync", a, "media_store_uri = ?", new String[] {
            uri.toString()
        }, null, null, null);
        uri = class1;
        if (cursor.moveToFirst())
        {
            uri = cursor.getString(0);
        }
        cursor.close();
        return nlp.a(uri, b);
        uri;
        cursor.close();
        throw uri;
    }

}
