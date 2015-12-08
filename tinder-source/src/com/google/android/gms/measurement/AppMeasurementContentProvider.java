// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.measurement;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import com.google.android.gms.measurement.internal.ac;

public class AppMeasurementContentProvider extends ContentProvider
{

    public AppMeasurementContentProvider()
    {
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
        ac.a(getContext());
        return false;
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
