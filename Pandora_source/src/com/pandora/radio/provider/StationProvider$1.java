// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.radio.provider;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;

// Referenced classes of package com.pandora.radio.provider:
//            StationProvider

class b
    implements b
{

    final ContentValues a[];
    final Uri b;
    final StationProvider c;

    public int a(SQLiteDatabase sqlitedatabase)
    {
        for (int i = 0; i < a.length; i++)
        {
            c.a(b, a[i]);
        }

        c.getContext().getContentResolver().notifyChange(b, null);
        return a.length;
    }

    (StationProvider stationprovider, ContentValues acontentvalues[], Uri uri)
    {
        c = stationprovider;
        a = acontentvalues;
        b = uri;
        super();
    }
}
