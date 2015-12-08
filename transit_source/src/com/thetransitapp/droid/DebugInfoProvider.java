// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.FileNotFoundException;

public class DebugInfoProvider extends ContentProvider
{

    public static final String DEBUG_INFO_FILENAME = "/Debugging_info.txt";

    public DebugInfoProvider()
    {
    }

    public static String getDebugInfoPath(Context context)
    {
        if (context.getCacheDir() != null)
        {
            return (new StringBuilder(String.valueOf(context.getCacheDir().getAbsolutePath()))).append("/Debugging_info.txt").toString();
        } else
        {
            return null;
        }
    }

    public int delete(Uri uri, String s, String as[])
    {
        return 0;
    }

    public String getType(Uri uri)
    {
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentvalues)
    {
        return null;
    }

    public boolean onCreate()
    {
        return true;
    }

    public ParcelFileDescriptor openFile(Uri uri, String s)
        throws FileNotFoundException
    {
        return ParcelFileDescriptor.open(new File(getContext().getCacheDir(), "/Debugging_info.txt"), 0x10000000);
    }

    public Cursor query(Uri uri, String as[], String s, String as1[], String s1)
    {
        return null;
    }

    public int update(Uri uri, ContentValues contentvalues, String s, String as[])
    {
        return 0;
    }
}
