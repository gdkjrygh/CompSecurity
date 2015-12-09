// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gsf;

import android.content.ContentResolver;
import android.database.Cursor;
import android.database.SQLException;
import android.net.Uri;
import android.util.Log;

// Referenced classes of package com.google.android.gsf:
//            GoogleSettingsContract

public static final class eTable extends eTable
{

    public static final Uri CONTENT_URI = Uri.parse("content://com.google.settings/partner");

    private static String getString(ContentResolver contentresolver, String s)
    {
        Cursor cursor;
        Cursor cursor1;
        Object obj;
        Object obj1;
        obj = null;
        obj1 = null;
        cursor1 = null;
        cursor = null;
        Cursor cursor2 = contentresolver.query(CONTENT_URI, new String[] {
            "value"
        }, "name=?", new String[] {
            s
        }, null);
        contentresolver = obj1;
        if (cursor2 == null)
        {
            break MISSING_BLOCK_LABEL_81;
        }
        contentresolver = obj1;
        cursor = cursor2;
        cursor1 = cursor2;
        if (!cursor2.moveToNext())
        {
            break MISSING_BLOCK_LABEL_81;
        }
        cursor = cursor2;
        cursor1 = cursor2;
        contentresolver = cursor2.getString(0);
        s = contentresolver;
        if (cursor2 != null)
        {
            cursor2.close();
            s = contentresolver;
        }
_L2:
        return s;
        contentresolver;
        cursor1 = cursor;
        Log.e("GoogleSettings", (new StringBuilder("Can't get key ")).append(s).append(" from ").append(CONTENT_URI).toString(), contentresolver);
        s = obj;
        if (cursor == null) goto _L2; else goto _L1
_L1:
        cursor.close();
        return null;
        contentresolver;
        if (cursor1 != null)
        {
            cursor1.close();
        }
        throw contentresolver;
    }

    public static String getString(ContentResolver contentresolver, String s, String s1)
    {
        s = getString(contentresolver, s);
        contentresolver = s;
        if (s == null)
        {
            contentresolver = s1;
        }
        return contentresolver;
    }

}
