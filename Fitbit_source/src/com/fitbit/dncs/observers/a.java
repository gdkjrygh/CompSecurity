// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.dncs.observers;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.fitbit.FitBitApplication;

public class a
{

    public a()
    {
    }

    public static String a(String s)
    {
        Object obj;
        Cursor cursor;
        obj = s;
        if (TextUtils.isEmpty(s))
        {
            break MISSING_BLOCK_LABEL_86;
        }
        obj = Uri.withAppendedPath(android.provider.ContactsContract.PhoneLookup.CONTENT_FILTER_URI, Uri.encode(s));
        cursor = FitBitApplication.a().getContentResolver().query(((Uri) (obj)), new String[] {
            "display_name"
        }, null, null, null);
        obj = s;
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        if (cursor.getCount() <= 0)
        {
            break MISSING_BLOCK_LABEL_88;
        }
        cursor.moveToFirst();
        obj = cursor.getString(cursor.getColumnIndex("display_name"));
        cursor.close();
        return ((String) (obj));
        cursor.close();
        return s;
        s;
        cursor.close();
        throw s;
    }
}
