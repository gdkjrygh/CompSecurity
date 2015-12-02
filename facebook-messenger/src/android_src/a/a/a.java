// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android_src.a.a;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import com.facebook.debug.log.b;

public final class a
{

    private a()
    {
    }

    public static int a(Context context, ContentResolver contentresolver, Uri uri, ContentValues contentvalues, String s, String as[])
    {
        int i;
        try
        {
            i = contentresolver.update(uri, contentvalues, s, as);
        }
        // Misplaced declaration of an exception variable
        catch (ContentResolver contentresolver)
        {
            b.d("SqliteWrapper", "Catch a SQLiteException when update: ", contentresolver);
            a(context, ((SQLiteException) (contentresolver)));
            return -1;
        }
        return i;
    }

    public static Cursor a(Context context, ContentResolver contentresolver, Uri uri, String as[], String s, String as1[], String s1)
    {
        try
        {
            contentresolver = contentresolver.query(uri, as, s, as1, s1);
        }
        // Misplaced declaration of an exception variable
        catch (ContentResolver contentresolver)
        {
            b.d("SqliteWrapper", "Catch a SQLiteException when query: ", contentresolver);
            a(context, ((SQLiteException) (contentresolver)));
            return null;
        }
        return contentresolver;
    }

    public static Uri a(Context context, ContentResolver contentresolver, Uri uri, ContentValues contentvalues)
    {
        try
        {
            contentresolver = contentresolver.insert(uri, contentvalues);
        }
        // Misplaced declaration of an exception variable
        catch (ContentResolver contentresolver)
        {
            b.d("SqliteWrapper", "Catch a SQLiteException when insert: ", contentresolver);
            a(context, ((SQLiteException) (contentresolver)));
            return null;
        }
        return contentresolver;
    }

    public static void a(Context context, SQLiteException sqliteexception)
    {
        throw sqliteexception;
    }
}
