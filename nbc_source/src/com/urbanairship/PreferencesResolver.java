// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

// Referenced classes of package com.urbanairship:
//            UrbanAirshipResolver, UrbanAirshipProvider

class PreferencesResolver extends UrbanAirshipResolver
{

    protected static final String WHERE_CLAUSE_KEY = "_id = ?";

    public PreferencesResolver(Context context)
    {
        super(context);
    }

    public Cursor get(String s)
    {
        return query(UrbanAirshipProvider.getPreferencesContentUri(), new String[] {
            "value"
        }, "_id = ?", new String[] {
            s
        }, null);
    }

    public Uri put(String s, String s1)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("_id", s);
        contentvalues.put("value", s1);
        return insert(UrbanAirshipProvider.getPreferencesContentUri(), contentvalues);
    }

    public int remove(String s)
    {
        return delete(UrbanAirshipProvider.getPreferencesContentUri(), "_id = ?", new String[] {
            s
        });
    }
}
