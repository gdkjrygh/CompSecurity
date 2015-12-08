// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.consumerphotoeditor.contentprovider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import b;
import java.io.File;

public class CachedFileProvider extends ContentProvider
{

    private final UriMatcher a = new UriMatcher(-1);

    public CachedFileProvider()
    {
    }

    public static Uri a(Context context, String s)
    {
        return (new android.net.Uri.Builder()).scheme("content").authority(context.getString(b.cl)).appendPath("image").appendPath(s).build();
    }

    public void attachInfo(Context context, ProviderInfo providerinfo)
    {
        super.attachInfo(context, providerinfo);
        context = providerinfo.authority;
        a.addURI(context, "image/*", 1);
    }

    public int delete(Uri uri, String s, String as[])
    {
        throw new UnsupportedOperationException("CachedFileProvider.delete not supported");
    }

    public String getType(Uri uri)
    {
        if (a.match(uri) == 1)
        {
            return "image/jpeg";
        } else
        {
            return null;
        }
    }

    public Uri insert(Uri uri, ContentValues contentvalues)
    {
        throw new UnsupportedOperationException("CachedFileProvider.insert not supported");
    }

    public boolean onCreate()
    {
        return true;
    }

    public ParcelFileDescriptor openFile(Uri uri, String s)
    {
        if (a.match(uri) != 1)
        {
            uri = String.valueOf(uri);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(uri).length() + 17)).append("unsupported uri: ").append(uri).toString());
        } else
        {
            return ParcelFileDescriptor.open(new File(uri.getLastPathSegment()), 0x10000000);
        }
    }

    public Cursor query(Uri uri, String as[], String s, String as1[], String s1)
    {
        throw new UnsupportedOperationException("CachedFileProvider.query not supported");
    }

    public int update(Uri uri, ContentValues contentvalues, String s, String as[])
    {
        throw new UnsupportedOperationException("CachedFileProvider.update not supported");
    }
}
