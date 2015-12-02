// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.appbox.bi;

import android.content.ContentProvider;
import android.content.ContentProviderResult;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.OperationApplicationException;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;

// Referenced classes of package com.qihoo.security.appbox.bi:
//            c, b

public class AppBoxStatisticianProvider extends ContentProvider
{

    private static final String a = com/qihoo/security/appbox/bi/c.getSimpleName();
    private static final UriMatcher b;
    private static final HashMap c;
    private c d;

    public AppBoxStatisticianProvider()
    {
    }

    private String a(Uri uri)
    {
        uri = uri.getQueryParameter("limit");
        if (uri != null)
        {
            int i;
            try
            {
                i = Integer.parseInt(uri);
            }
            // Misplaced declaration of an exception variable
            catch (Uri uri)
            {
                return null;
            }
            if (i >= 0)
            {
                return String.valueOf(i);
            }
        }
        return null;
    }

    public ContentProviderResult[] applyBatch(ArrayList arraylist)
        throws OperationApplicationException
    {
        SQLiteDatabase sqlitedatabase;
        sqlitedatabase = d.a();
        sqlitedatabase.beginTransaction();
        arraylist = super.applyBatch(arraylist);
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        return arraylist;
        arraylist;
        sqlitedatabase.endTransaction();
        throw arraylist;
    }

    public int delete(Uri uri, String s, String as[])
    {
        int j = b.match(uri);
        int i = 0;
        if (1 == j)
        {
            i = d.a(s, as);
        }
        return i;
    }

    public String getType(Uri uri)
    {
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentvalues)
    {
        long l;
label0:
        {
            if (1 == b.match(uri))
            {
                l = d.a(contentvalues);
                if (l >= 0L)
                {
                    break label0;
                }
            }
            return null;
        }
        return ContentUris.withAppendedId(uri, l);
    }

    public boolean onCreate()
    {
        boolean flag = false;
        c c1;
        try
        {
            d = new c(getContext());
            c1 = d;
        }
        catch (RuntimeException runtimeexception)
        {
            return false;
        }
        if (c1 != null)
        {
            flag = true;
        }
        return flag;
    }

    public Cursor query(Uri uri, String as[], String s, String as1[], String s1)
    {
        Object obj = null;
        int i = b.match(uri);
        SQLiteQueryBuilder sqlitequerybuilder = new SQLiteQueryBuilder();
        String s2 = a(uri);
        uri = obj;
        if (1 == i)
        {
            sqlitequerybuilder.setTables("bilog");
            sqlitequerybuilder.setProjectionMap(c);
            as = d.a(sqlitequerybuilder, as, s, as1, s1, null, s2);
            uri = as;
            if (as != null)
            {
                as.setNotificationUri(getContext().getContentResolver(), b.a);
                uri = as;
            }
        }
        return uri;
    }

    public int update(Uri uri, ContentValues contentvalues, String s, String as[])
    {
        int j = b.match(uri);
        int i = 0;
        if (1 == j)
        {
            i = d.a(contentvalues, s, as);
        }
        return i;
    }

    static 
    {
        b = new UriMatcher(-1);
        b.addURI("com.qihoo.security.lite.appbox.bi", "log", 1);
        c = new HashMap();
        c.put("_id", "_id");
        c.put("tp", "tp");
        c.put("pn", "pn");
        c.put("ts", "ts");
        c.put("rn", "rn");
        c.put("r0", "r0");
        c.put("r1", "r1");
    }
}
