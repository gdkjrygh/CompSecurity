// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.library.b;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import java.io.File;

public class a
{

    public a()
    {
    }

    public static Uri a(Context context, File file)
        throws IllegalStateException
    {
        if (file == null)
        {
            return null;
        } else
        {
            ContentValues contentvalues = new ContentValues();
            contentvalues.put("_data", file.getAbsolutePath());
            contentvalues.put("date_added", Long.valueOf(System.currentTimeMillis()));
            contentvalues.put("datetaken", Long.valueOf(System.currentTimeMillis()));
            contentvalues.put("description", "Edited with Aviary");
            return context.getContentResolver().insert(android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentvalues);
        }
    }
}
