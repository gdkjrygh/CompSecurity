// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.util.Pair;
import com.facebook.internal.al;
import java.io.FileNotFoundException;
import java.util.UUID;

public class FacebookContentProvider extends ContentProvider
{

    private static final String a = com/facebook/FacebookContentProvider.getName();

    public FacebookContentProvider()
    {
    }

    private static Pair a(Uri uri)
    {
        String as[];
        String s;
        try
        {
            as = uri.getPath().substring(1).split("/");
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            return null;
        }
        uri = as[0];
        s = as[1];
        uri = new Pair(UUID.fromString(uri), s);
        return uri;
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
    {
        uri = a(uri);
        if (uri == null)
        {
            throw new FileNotFoundException();
        }
        try
        {
            uri = ParcelFileDescriptor.open(al.a((UUID)((Pair) (uri)).first, (String)((Pair) (uri)).second), 0x10000000);
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            Log.e(a, (new StringBuilder("Got unexpected exception:")).append(uri).toString());
            throw uri;
        }
        return uri;
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
