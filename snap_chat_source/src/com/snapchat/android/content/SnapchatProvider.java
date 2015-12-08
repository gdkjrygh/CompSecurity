// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.content;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import android.text.TextUtils;
import com.snapchat.android.Timber;
import com.snapchat.android.database.DatabaseHelper;
import com.snapchat.android.database.schema.HttpMetricSchema;
import com.snapchat.android.database.schema.VerifiedDeviceSchema;
import com.snapchat.android.database.table.ChatTable;
import com.snapchat.android.discover.model.database.vtable.DSnapPageVirtualTable;
import com.snapchat.android.discover.model.database.vtable.PublisherAndEditionVirtualTable;
import java.util.List;
import tP;
import ul;

public class SnapchatProvider extends ContentProvider
{

    public static final Uri a = Uri.parse("content://com.snapchat.android.content.SnapchatProvider/HttpMetrics");
    public static final Uri b = Uri.parse("content://com.snapchat.android.content.SnapchatProvider/PublisherAndEdition");
    public static final Uri c = Uri.parse("content://com.snapchat.android.content.SnapchatProvider/DSnapPage");
    public static final Uri d = Uri.parse("content://com.snapchat.android.content.SnapchatProvider/VerifiedDeviceTable");
    private static final UriMatcher e;

    public SnapchatProvider()
    {
    }

    private static transient String[] a(String as[], String as1[])
    {
        String as2[];
        int i;
        if (as == null)
        {
            i = 0;
        } else
        {
            i = as.length;
        }
        as2 = new String[i + 1];
        System.arraycopy(as1, 0, as2, 0, 1);
        if (i > 0)
        {
            System.arraycopy(as, 0, as2, 1, i);
        }
        return as2;
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
        return false;
    }

    public Cursor query(Uri uri, String as[], String s, String as1[], String s1)
    {
        Object obj;
        String s3;
        SQLiteQueryBuilder sqlitequerybuilder;
        int i;
        i = e.match(uri);
        Timber.a("SnapchatProvider", (new StringBuilder("query ")).append(uri).append(" -> ").append(i).toString(), new Object[0]);
        s3 = uri.getQueryParameter("limit");
        sqlitequerybuilder = new SQLiteQueryBuilder();
        obj = as1;
        i;
        JVM INSTR tableswitch 3 15: default 132
    //                   3 231
    //                   4 156
    //                   5 132
    //                   6 132
    //                   7 132
    //                   8 132
    //                   9 132
    //                   10 310
    //                   11 132
    //                   12 458
    //                   13 521
    //                   14 641
    //                   15 384;
           goto _L1 _L2 _L3 _L1 _L1 _L1 _L1 _L1 _L4 _L1 _L5 _L6 _L7 _L8
_L1:
        throw new IllegalArgumentException((new StringBuilder("Unknown URI ")).append(uri).toString());
_L3:
        obj = (String)uri.getPathSegments().get(1);
        Timber.a("SnapchatProvider", (new StringBuilder("CODE_CHAT_BY_CONVERSATION_ID ")).append(((String) (obj))).toString(), new Object[0]);
        sqlitequerybuilder.appendWhere(com.snapchat.android.database.table.ChatTable.ChatSchema.CONVERSATION_ID.getColumnName());
        sqlitequerybuilder.appendWhere("=?");
        obj = a(as1, new String[] {
            obj
        });
_L2:
        Timber.a("SnapchatProvider", "CODE_CHAT_ALL", new Object[0]);
        sqlitequerybuilder.setTables("Chat");
        sqlitequerybuilder.setProjectionMap(ChatTable.a);
        as1 = null;
_L11:
        String s2;
        if (TextUtils.isEmpty(s1))
        {
            s1 = as1;
        }
        as = sqlitequerybuilder.query(DatabaseHelper.a(getContext()).getReadableDatabase(), as, s, ((String []) (obj)), null, null, s1, s3);
        as.setNotificationUri(getContext().getContentResolver(), uri);
        return as;
_L4:
        Timber.a("SnapchatProvider", "CODE_HTTP_METRICS_ALL", new Object[0]);
        sqlitequerybuilder.setTables("HttpMetrics");
        sqlitequerybuilder.setProjectionMap(tP.b);
        if (TextUtils.isEmpty(s1))
        {
            s1 = (new StringBuilder()).append(HttpMetricSchema.TIMESTAMP.getColumnName()).append(" DESC").toString();
            s2 = null;
            obj = as1;
            as1 = s2;
            continue; /* Loop/switch isn't completed */
        }
          goto _L9
_L8:
        Timber.a("SnapchatProvider", "CODE_VERIFIED_DEVICE_ALL", new Object[0]);
        sqlitequerybuilder.setTables("VerifiedDeviceTable");
        sqlitequerybuilder.setProjectionMap(ul.a);
        if (TextUtils.isEmpty(s1))
        {
            s1 = (new StringBuilder()).append(VerifiedDeviceSchema.LAST_LOGIN.getColumnName()).append(" DESC").toString();
            s2 = null;
            obj = as1;
            as1 = s2;
            continue; /* Loop/switch isn't completed */
        }
          goto _L9
_L5:
        Timber.a("SnapchatProvider", "CODE_DISCOVER_PUBLISHER_EDITION_ALL", new Object[0]);
        sqlitequerybuilder.setTables("PublisherAndEdition");
        sqlitequerybuilder.setProjectionMap(PublisherAndEditionVirtualTable.b);
        s2 = (new StringBuilder()).append(com.snapchat.android.discover.model.database.vtable.PublisherAndEditionVirtualTable.ChannelSchema.POSITION.getColumnName()).append(" ASC").toString();
        obj = as1;
        as1 = s2;
        continue; /* Loop/switch isn't completed */
_L6:
        obj = (String)uri.getPathSegments().get(1);
        Timber.a("SnapchatProvider", (new StringBuilder("CODE_DISCOVER_DSNAPS_BY_EDITION_ID ")).append(((String) (obj))).toString(), new Object[0]);
        sqlitequerybuilder.appendWhere(com.snapchat.android.discover.model.database.vtable.DSnapPageVirtualTable.DSnapPageSchema.EDITION_ID.getColumnName());
        sqlitequerybuilder.appendWhere("=?");
        obj = a(as1, new String[] {
            obj
        });
        sqlitequerybuilder.setTables("DSnapPage");
        sqlitequerybuilder.setProjectionMap(DSnapPageVirtualTable.b);
        as1 = (new StringBuilder()).append(com.snapchat.android.discover.model.database.vtable.DSnapPageVirtualTable.DSnapPageSchema.POSITION.getColumnName()).append(" ASC").toString();
        continue; /* Loop/switch isn't completed */
_L7:
        Timber.a("SnapchatProvider", "CODE_DISCOVER_DSNAPS_ALL", new Object[0]);
        sqlitequerybuilder.setTables("DSnapPage");
        sqlitequerybuilder.setProjectionMap(DSnapPageVirtualTable.b);
        obj = (new StringBuilder()).append(com.snapchat.android.discover.model.database.vtable.DSnapPageVirtualTable.DSnapPageSchema.EDITION_ID.getColumnName()).append(" ASC").toString();
        s2 = (new StringBuilder()).append(((String) (obj))).append(", ").append(com.snapchat.android.discover.model.database.vtable.DSnapPageVirtualTable.DSnapPageSchema.POSITION.getColumnName()).append(" ASC").toString();
        obj = as1;
        as1 = s2;
        continue; /* Loop/switch isn't completed */
_L9:
        Object obj1 = null;
        obj = as1;
        as1 = obj1;
        if (true) goto _L11; else goto _L10
_L10:
    }

    public int update(Uri uri, ContentValues contentvalues, String s, String as[])
    {
        return 0;
    }

    static 
    {
        UriMatcher urimatcher = new UriMatcher(-1);
        e = urimatcher;
        urimatcher.addURI("com.snapchat.android.content.SnapchatProvider", "Chat", 3);
        e.addURI("com.snapchat.android.content.SnapchatProvider", "Chat/*", 4);
        e.addURI("com.snapchat.android.content.SnapchatProvider", "HttpMetrics", 10);
        e.addURI("com.snapchat.android.content.SnapchatProvider", "VerifiedDeviceTable", 15);
        e.addURI("com.snapchat.android.content.SnapchatProvider", "PublisherAndEdition", 12);
        e.addURI("com.snapchat.android.content.SnapchatProvider", "DSnapPage/*", 13);
        e.addURI("com.snapchat.android.content.SnapchatProvider", "DSnapPage", 14);
    }
}
