// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.database.table;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.AsyncTask;
import com.snapchat.android.database.DatabaseHelper;
import com.snapchat.android.model.chat.CashFeedItem;

// Referenced classes of package com.snapchat.android.database.table:
//            CashFeedItemTable

static final class b extends AsyncTask
{

    private Context a;
    private CashFeedItem b;

    private transient Void a()
    {
        SQLiteDatabase sqlitedatabase;
        sqlitedatabase = DatabaseHelper.a(a).getWritableDatabase();
        sqlitedatabase.beginTransaction();
        Cursor cursor = sqlitedatabase.query("CashFeedItem", CashFeedItemTable.a, (new StringBuilder()).append(shSchema.ID.getColumnName()).append("=? AND ").append(shSchema.TARGET_VIEW.getColumnName()).append("=?").toString(), new String[] {
            b.d(), com.snapchat.android.model..()
        }, null, null, null);
        if (cursor == null) goto _L2; else goto _L1
_L1:
        int i;
        i = cursor.getCount();
        cursor.close();
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_190;
        }
        ContentValues contentvalues = new ContentValues();
        contentvalues.put(shSchema.TARGET_VIEW.getColumnName(), com.snapchat.android.model._AND_FEED.());
        sqlitedatabase.update("CashFeedItem", contentvalues, (new StringBuilder()).append(shSchema.ID.getColumnName()).append("=?").toString(), new String[] {
            b.d()
        });
_L3:
        sqlitedatabase.setTransactionSuccessful();
_L2:
        sqlitedatabase.endTransaction();
        return null;
        CashFeedItemTable.a(sqlitedatabase, b, com.snapchat.android.model.);
          goto _L3
        Exception exception;
        exception;
        sqlitedatabase.endTransaction();
        throw exception;
    }

    protected final Object doInBackground(Object aobj[])
    {
        return a();
    }

    shSchema(Context context, CashFeedItem cashfeeditem)
    {
        a = context;
        b = cashfeeditem;
        super();
    }
}
