// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.net.Uri;

class izz
{

    private final Context a;

    izz(Context context)
    {
        a = context;
    }

    public final ContentValues a(Uri uri)
    {
        ContentValues contentvalues;
        uri = a.getContentResolver().query(uri, null, null, null, null);
        contentvalues = new ContentValues();
        if (uri == null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        if (uri.moveToFirst())
        {
            DatabaseUtils.cursorRowToContentValues(uri, contentvalues);
        }
        if (uri != null)
        {
            uri.close();
        }
        return contentvalues;
        Exception exception;
        exception;
        if (uri != null)
        {
            uri.close();
        }
        throw exception;
    }
}
