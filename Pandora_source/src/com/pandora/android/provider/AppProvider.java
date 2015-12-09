// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.provider;

import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import android.text.TextUtils;
import com.pandora.android.inbox.b;
import com.tjeannin.provigen.ProviGenOpenHelper;
import com.tjeannin.provigen.ProviGenProvider;
import com.tjeannin.provigen.model.Contract;

public class AppProvider extends ProviGenProvider
{

    private final Class a[] = {
        com/pandora/android/inbox/b, com/pandora/android/inbox/b$a
    };

    public AppProvider()
    {
    }

    public int bulkInsert(Uri uri, ContentValues acontentvalues[])
    {
        beginBatching();
        int j = acontentvalues.length;
        int i = 0;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        insert(uri, acontentvalues[i]);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        endBatching();
        return acontentvalues.length;
        uri;
        endBatching();
        throw uri;
    }

    public Class[] contractClasses()
    {
        return a;
    }

    public int delete(Uri uri, String s, String as[])
    {
        Long along[];
        Object obj2;
        Object obj1 = null;
        Object obj = null;
        obj2 = findMatchingContract(uri);
        along = obj1;
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_158;
        }
        along = obj1;
        if (!"inbox_messages".equals(((Contract) (obj2)).getTable()))
        {
            break MISSING_BLOCK_LABEL_158;
        }
        obj2 = query(b.a, new String[] {
            "_id", "isSeen"
        }, s, as, null);
        along = obj1;
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_158;
        }
        along = obj;
        if (!((Cursor) (obj2)).moveToFirst()) goto _L2; else goto _L1
_L1:
        int j;
        along = new Long[((Cursor) (obj2)).getCount()];
        j = ((Cursor) (obj2)).getColumnIndex("_id");
        int i = 0;
_L3:
        along[i] = Long.valueOf(((Cursor) (obj2)).getLong(j));
        i++;
        boolean flag = ((Cursor) (obj2)).moveToNext();
        if (flag) goto _L3; else goto _L2
_L2:
        ((Cursor) (obj2)).close();
        beginBatching();
        i = super.delete(uri, s, as);
        if (along == null)
        {
            break MISSING_BLOCK_LABEL_218;
        }
        uri = new StringBuilder("_id IN (");
        uri.append(TextUtils.join(", ", along));
        uri.append(")");
        super.delete(com.pandora.android.inbox.b.a.a, uri.toString(), null);
        endBatching();
        return i;
        uri;
        ((Cursor) (obj2)).close();
        throw uri;
        uri;
        endBatching();
        throw uri;
    }

    public Uri insert(Uri uri, ContentValues contentvalues)
    {
        ContentValues contentvalues1;
        Contract contract;
        boolean flag;
        contract = findMatchingContract(uri);
        if (contract != null && "inbox_messages".equals(contract.getTable()))
        {
            com.pandora.android.inbox.b.b.a(this, contentvalues);
        }
        flag = false;
        contentvalues1 = contentvalues;
        if (contentvalues.containsKey("com.pandora.android.provider.AppProvider.INSERT_OR_REPLACE"))
        {
            flag = contentvalues.getAsBoolean("com.pandora.android.provider.AppProvider.INSERT_OR_REPLACE").booleanValue();
            contentvalues1 = new ContentValues(contentvalues);
            contentvalues1.remove("com.pandora.android.provider.AppProvider.INSERT_OR_REPLACE");
        }
        beginBatching();
        contentvalues = openHelper.getWritableDatabase();
        uriMatcher.match(uri);
        JVM INSTR tableswitch 1 1: default 229
    //                   1 142;
           goto _L1 _L2
_L1:
        throw new IllegalArgumentException((new StringBuilder()).append("Unknown uri ").append(uri).toString());
        uri;
        endBatching();
        throw uri;
_L2:
        if (!flag) goto _L4; else goto _L3
_L3:
        long l = contentvalues.replace(contract.getTable(), null, contentvalues1);
_L5:
        notify(uri);
        if ("inbox_seen_messages".equals(contract.getTable()))
        {
            notify(ContentUris.withAppendedId(b.a, contentvalues1.getAsLong("_id").longValue()));
        }
        uri = Uri.withAppendedPath(uri, String.valueOf(l));
        endBatching();
        return uri;
_L4:
        l = contentvalues.insert(contract.getTable(), null, contentvalues1);
          goto _L5
    }

    public SQLiteOpenHelper openHelper(Context context)
    {
        return new ProviGenOpenHelper(getContext(), "appProvider", null, 2, contractClasses());
    }

    public Cursor query(Uri uri, String as[], String s, String as1[], String s1)
    {
        Contract contract = findMatchingContract(uri);
        if (contract != null && "inbox_messages".equals(contract.getTable()))
        {
            as = com.pandora.android.inbox.b.b.a(as);
        }
        return super.query(uri, as, s, as1, s1);
    }

    public int update(Uri uri, ContentValues contentvalues, String s, String as[])
    {
        Contract contract = findMatchingContract(uri);
        if (contract != null && "inbox_messages".equals(contract.getTable()))
        {
            com.pandora.android.inbox.b.b.a(this, contentvalues);
        }
        return super.update(uri, contentvalues, s, as);
    }
}
