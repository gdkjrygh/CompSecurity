// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.support;

import android.content.ContentProvider;
import android.content.ContentProviderResult;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.OperationApplicationException;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;

public class StatisticianProvider extends ContentProvider
{
    private static class a extends SQLiteOpenHelper
    {

        public void onCreate(SQLiteDatabase sqlitedatabase)
        {
            StringBuilder stringbuilder = new StringBuilder(512);
            stringbuilder.append("CREATE TABLE IF NOT EXISTS ").append("logs").append(" (").append("_id").append(" INTEGER PRIMARY KEY autoincrement,").append("sid").append(" INTEGER NOT NULL,").append("sv").append(" TEXT,").append("ts").append(" BIGINT NOT NULL DEFAULT 0,").append("ver").append(" TEXT,").append("r0").append(" TEXT,").append("r1").append(" TEXT);");
            sqlitedatabase.execSQL(stringbuilder.toString());
        }

        public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
        {
            sqlitedatabase.execSQL("ALTER TABLE logs RENAME TO temp_logs");
            sqlitedatabase.execSQL("DROP TABLE IF EXISTS logs");
            onCreate(sqlitedatabase);
            sqlitedatabase.execSQL("INSERT INTO logs (sid,sv,ts,ver,r0,r1)  SELECT sid,sv,ts,ver,r0,r1 FROM temp_logs");
            sqlitedatabase.execSQL("DROP TABLE IF EXISTS temp_logs");
        }

        public a(Context context)
        {
            super(context, "statdb.db", null, 2);
        }
    }


    static final Uri a = Uri.parse("content://com.qihoo.security.lite.provider.stat/logs");
    private static final String c = com/qihoo/security/support/StatisticianProvider.getSimpleName();
    private static final HashMap d;
    private static final UriMatcher e;
    SQLiteDatabase b;

    public StatisticianProvider()
    {
    }

    private String a(Uri uri)
    {
        Object obj = null;
        String s = uri.getQueryParameter("limit");
        uri = obj;
        if (!TextUtils.isEmpty(s))
        {
            int i;
            try
            {
                i = Integer.parseInt(s);
            }
            // Misplaced declaration of an exception variable
            catch (Uri uri)
            {
                return null;
            }
            uri = obj;
            if (i >= 0)
            {
                uri = String.valueOf(i);
            }
        }
        return uri;
    }

    public ContentProviderResult[] applyBatch(ArrayList arraylist)
        throws OperationApplicationException
    {
        b.beginTransaction();
        arraylist = super.applyBatch(arraylist);
        b.setTransactionSuccessful();
        b.endTransaction();
        return arraylist;
        arraylist;
        b.endTransaction();
        throw arraylist;
    }

    public int delete(Uri uri, String s, String as[])
    {
        int i;
        switch (e.match(uri))
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("Unknown URI ").append(uri).toString());

        case 1: // '\001'
            i = b.delete("logs", s, as);
            break;
        }
        s = getContext();
        if (s != null)
        {
            s.getContentResolver().notifyChange(uri, null);
        }
        return i;
    }

    public String getType(Uri uri)
    {
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentvalues)
    {
        long l = b.insert("logs", "", contentvalues);
        if (l > 0L)
        {
            contentvalues = ContentUris.withAppendedId(a, l);
            getContext().getContentResolver().notifyChange(contentvalues, null);
            return uri;
        } else
        {
            throw new SQLException((new StringBuilder()).append("Failed to insert row into ").append(uri).toString());
        }
    }

    public boolean onCreate()
    {
        b = (new a(getContext())).getWritableDatabase();
        return b != null;
    }

    public Cursor query(Uri uri, String as[], String s, String as1[], String s1)
    {
        SQLiteQueryBuilder sqlitequerybuilder = new SQLiteQueryBuilder();
        sqlitequerybuilder.setTables("logs");
        sqlitequerybuilder.setProjectionMap(d);
        String s2 = a(uri);
        if (s1 == null || s1 == "")
        {
            s1 = "_id";
        }
        as = sqlitequerybuilder.query(b, as, s, as1, null, null, s1, s2);
        as.setNotificationUri(getContext().getContentResolver(), uri);
        return as;
    }

    public int update(Uri uri, ContentValues contentvalues, String s, String as[])
    {
        int i;
        switch (e.match(uri))
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("Unknown URI ").append(uri).toString());

        case 1: // '\001'
            i = b.update("logs", contentvalues, s, as);
            break;
        }
        contentvalues = getContext();
        if (contentvalues != null)
        {
            contentvalues.getContentResolver().notifyChange(uri, null);
        }
        return i;
    }

    static 
    {
        e = new UriMatcher(-1);
        e.addURI("com.qihoo.security.lite.provider.stat", "logs", 1);
        d = new HashMap();
        d.put("_id", "_id");
        d.put("sid", "sid");
        d.put("sv", "sv");
        d.put("ts", "ts");
        d.put("ver", "ver");
        d.put("r0", "r0");
        d.put("r1", "r1");
    }
}
