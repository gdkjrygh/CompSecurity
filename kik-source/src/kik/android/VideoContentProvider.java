// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.FileNotFoundException;

public class VideoContentProvider extends ContentProvider
{

    private static final Uri a = Uri.parse("content://kik.android.VideoContentProvider/");

    public VideoContentProvider()
    {
    }

    public static Uri a(File file)
    {
        if (file == null)
        {
            return null;
        } else
        {
            return Uri.parse((new StringBuilder()).append(a).append(Uri.encode(file.getPath())).toString());
        }
    }

    public static Uri a(String s)
    {
        if (s == null)
        {
            return null;
        } else
        {
            return Uri.parse((new StringBuilder()).append(a).append(Uri.encode(s)).toString());
        }
    }

    public int delete(Uri uri, String s, String as[])
    {
        throw new UnsupportedOperationException();
    }

    public String getType(Uri uri)
    {
        return "video/mp4";
    }

    public Uri insert(Uri uri, ContentValues contentvalues)
    {
        throw new UnsupportedOperationException();
    }

    public boolean onCreate()
    {
        return true;
    }

    public ParcelFileDescriptor openFile(Uri uri, String s)
    {
        s = new File(uri.getPath());
        if (s.exists())
        {
            return ParcelFileDescriptor.open(s, 0x30000000);
        } else
        {
            throw new FileNotFoundException(uri.getPath());
        }
    }

    public Cursor query(Uri uri, String as[], String s, String as1[], String s1)
    {
        return null;
    }

    public int update(Uri uri, ContentValues contentvalues, String s, String as[])
    {
        throw new UnsupportedOperationException();
    }

}
