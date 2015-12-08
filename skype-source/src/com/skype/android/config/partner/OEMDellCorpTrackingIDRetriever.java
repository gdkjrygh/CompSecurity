// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.config.partner;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.skype.android.util.chained.AbstractChainedStringRetriever;

public class OEMDellCorpTrackingIDRetriever extends AbstractChainedStringRetriever
{

    public static final String COOKIE_COLUMN_NAME = "value";
    private static final String DELL_COOKIE_URI = "content://com.dell.provider.PartnerPersistentStore/cookie";
    private ContentResolver contentResolver;

    public OEMDellCorpTrackingIDRetriever(Context context)
    {
        contentResolver = context.getContentResolver();
    }

    protected volatile Object tryGetValue()
    {
        return tryGetValue();
    }

    protected String tryGetValue()
    {
        String s;
        Object obj;
        s = null;
        obj = Uri.parse("content://com.dell.provider.PartnerPersistentStore/cookie");
        obj = contentResolver.query(((Uri) (obj)), null, null, null, null);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        if (!((Cursor) (obj)).moveToFirst())
        {
            break MISSING_BLOCK_LABEL_57;
        }
        s = ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndex("value"));
        ((Cursor) (obj)).close();
        return s;
        ((Cursor) (obj)).close();
        return null;
        Exception exception;
        exception;
        ((Cursor) (obj)).close();
        throw exception;
    }
}
