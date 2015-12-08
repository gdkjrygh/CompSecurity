// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;

// Referenced classes of package com.urbanairship:
//            Logger

public abstract class UrbanAirshipResolver
{

    private Context context;

    public UrbanAirshipResolver(Context context1)
    {
        context = context1;
    }

    private ContentResolver getResolver()
    {
        return context.getContentResolver();
    }

    protected int bulkInsert(Uri uri, ContentValues acontentvalues[])
    {
        int i;
        try
        {
            i = getResolver().bulkInsert(uri, acontentvalues);
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            Logger.error("Failed to bulk insert in UrbanAirshipProvider.", uri);
            return 0;
        }
        return i;
    }

    protected int delete(Uri uri, String s, String as[])
    {
        int i;
        try
        {
            i = getResolver().delete(uri, s, as);
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            Logger.error("Failed to perform a delete in UrbanAirshipProvider.", uri);
            return -1;
        }
        return i;
    }

    protected Uri insert(Uri uri, ContentValues contentvalues)
    {
        try
        {
            uri = getResolver().insert(uri, contentvalues);
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            Logger.error("Failed to insert in UrbanAirshipProvider.", uri);
            return null;
        }
        return uri;
    }

    protected Cursor query(Uri uri, String as[], String s, String as1[], String s1)
    {
        try
        {
            uri = getResolver().query(uri, as, s, as1, s1);
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            Logger.error("Failed to query the UrbanAirshipProvider.", uri);
            return null;
        }
        return uri;
    }

    public void registerContentObserver(Uri uri, boolean flag, ContentObserver contentobserver)
    {
        getResolver().registerContentObserver(uri, flag, contentobserver);
    }

    public void unregisterContentObserver(ContentObserver contentobserver)
    {
        getResolver().unregisterContentObserver(contentobserver);
    }

    protected int update(Uri uri, ContentValues contentvalues, String s, String as[])
    {
        int i;
        try
        {
            i = getResolver().update(uri, contentvalues, s, as);
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            Logger.error("Failed to perform an update in UrbanAirshipProvider.", uri);
            return 0;
        }
        return i;
    }
}
