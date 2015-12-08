// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;

final class ati
    implements ann
{

    private static final String a[] = {
        "_data"
    };
    private final Context b;
    private final Uri c;

    ati(Context context, Uri uri)
    {
        b = context;
        c = uri;
    }

    public final void a()
    {
    }

    public final void a(amb amb, ano ano1)
    {
        Cursor cursor;
        amb = null;
        Object obj = null;
        cursor = b.getContentResolver().query(c, a, null, null, null);
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        amb = obj;
        if (cursor.moveToFirst())
        {
            amb = cursor.getString(cursor.getColumnIndexOrThrow("_data"));
        }
        cursor.close();
        if (TextUtils.isEmpty(amb))
        {
            amb = String.valueOf(c);
            ano1.a(new FileNotFoundException((new StringBuilder(String.valueOf(amb).length() + 30)).append("Failed to find file path for: ").append(amb).toString()));
            return;
        } else
        {
            ano1.a(new File(amb));
            return;
        }
        amb;
        cursor.close();
        throw amb;
    }

    public final void b()
    {
    }

    public final amz c()
    {
        return amz.a;
    }

    public final Class d()
    {
        return java/io/File;
    }

}
