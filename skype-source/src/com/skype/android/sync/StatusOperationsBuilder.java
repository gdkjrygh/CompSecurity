// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.sync;

import android.content.ContentProviderOperation;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;

// Referenced classes of package com.skype.android.sync:
//            BaseOperationsBuilder

public class StatusOperationsBuilder extends BaseOperationsBuilder
{

    public StatusOperationsBuilder(Context context, String s, String s1)
    {
        super(context, s, s1);
    }

    private void addCurrentOpAsInsert(ContentValues contentvalues, Uri uri)
    {
        contentvalues.put("data_sync1", identity);
        if (TextUtils.isEmpty(contentvalues.getAsString("data_sync2")))
        {
            contentvalues.put("data_sync2", Long.valueOf(System.currentTimeMillis()));
        }
        uri = ContentProviderOperation.newInsert(uri);
        uri.withValues(contentvalues);
        operations.add(uri.build());
    }

    public void addMood(long l, String s, long l1)
    {
        Uri uri = getUriForStatusOperation();
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("presence_data_id", Long.valueOf(l));
        contentvalues.put("protocol", Integer.valueOf(3));
        contentvalues.put("im_account", accountName);
        contentvalues.put("im_handle", identity);
        contentvalues.put("status", s);
        contentvalues.put("status_res_package", context.getPackageName());
        contentvalues.put("status_icon", Integer.valueOf(0x7f0201f7));
        contentvalues.put("status_label", Integer.valueOf(0x7f0801a9));
        addCurrentOpAsInsert(contentvalues, uri);
    }

    public void addStatus(long l, int i)
    {
        Uri uri = getUriForStatusOperation();
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("presence_data_id", Long.valueOf(l));
        contentvalues.put("protocol", Integer.valueOf(3));
        contentvalues.put("im_account", accountName);
        contentvalues.put("im_handle", identity);
        contentvalues.put("mode", Integer.valueOf(i));
        addCurrentOpAsInsert(contentvalues, uri);
    }
}
