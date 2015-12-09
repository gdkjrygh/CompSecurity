// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.service;

import android.content.ContentProvider;
import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.UriMatcher;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.logging.Logger;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.music.internal.provider.SpotifyProvider;
import duy;
import duz;
import dvv;
import gmm;
import java.util.Iterator;
import java.util.List;

public class LoggerProvider extends ContentProvider
{

    private static String a;
    private static Uri b;
    private static final UriMatcher c;
    private duy d;

    public LoggerProvider()
    {
    }

    private static int a(SQLiteDatabase sqlitedatabase, long l)
    {
        int i;
        try
        {
            i = sqlitedatabase.delete("log", "_ID = ?", new String[] {
                String.valueOf(l)
            });
        }
        // Misplaced declaration of an exception variable
        catch (SQLiteDatabase sqlitedatabase)
        {
            Assertion.a("Exception while clearing log cache.", sqlitedatabase);
            return 0;
        }
        return i;
    }

    private SQLiteDatabase a()
    {
        SQLiteDatabase sqlitedatabase;
        try
        {
            sqlitedatabase = d.getWritableDatabase();
        }
        catch (Exception exception)
        {
            Logger.b(exception, "Can't open the database. Trying to recreate it.", new Object[0]);
            duy duy1 = d;
            getContext().deleteDatabase("cached_logs.db");
            duy1.close();
            return d.getWritableDatabase();
        }
        return sqlitedatabase;
    }

    public static Uri a(Context context, Bundle bundle)
    {
        Assertion.a(bundle);
        Verified verified = (Verified)bundle.getParcelable("uri");
        String s = bundle.getString("context");
        String s1 = bundle.getString("event");
        String s2 = bundle.getString("event_version");
        String s3 = bundle.getString("test_version");
        String s4 = bundle.getString("json_data");
        if (verified == null || s == null || s1 == null || s2 == null || s3 == null || s4 == null)
        {
            Assertion.a("Not all values were provided via bundle.", String.format("SOURCE_URI=%s\nCONTEXT=%s\nEVENT=%s\nEVENT_VERSION=%s\nTEST_VERSION=%s\nEVENT_DATA=%s", new Object[] {
                verified, s, s1, s2, s3, s4
            }));
            bundle = null;
        } else
        {
            Assertion.a(verified);
            Assertion.a(s);
            Assertion.a(s1);
            Assertion.a(s2);
            Assertion.a(s3);
            Assertion.a(s4);
            bundle = new ContentValues();
            bundle.put("source_uri", verified.toString());
            bundle.put("context", s);
            bundle.put("event", s1);
            bundle.put("event_version", s2);
            bundle.put("test_version", s3);
            bundle.put("data", s4);
        }
        if (bundle != null)
        {
            return context.getContentResolver().insert(b, bundle);
        } else
        {
            return null;
        }
    }

    static void a(Context context)
    {
        try
        {
            context.getContentResolver().delete(b, null, null);
            return;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            Assertion.a(b(context), illegalargumentexception);
        }
    }

    private static String b(Context context)
    {
        Object obj;
        boolean flag = false;
        ProviderInfo providerinfo;
        try
        {
            obj = context.getContentResolver().acquireContentProviderClient(b);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return (new StringBuilder("Can't generate message: ")).append(context.getMessage()).toString();
        }
        if (obj != null)
        {
            flag = true;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        ((ContentProviderClient) (obj)).release();
        obj = new StringBuilder(128);
        ((StringBuilder) (obj)).append("Uri: [").append(b).append(']').append(", provider is found: ").append(flag).append(", context class name: ").append(context.getClass().getName());
        context = context.getPackageManager();
        if (context != null)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        return ((StringBuilder) (obj)).append(" PackageManager is null. ").toString();
        context = context.queryContentProviders("com.spotify.music.service", Process.myUid(), 0);
        if (context != null)
        {
            break MISSING_BLOCK_LABEL_125;
        }
        return ((StringBuilder) (obj)).append(" List of providers is null. ").toString();
        for (context = context.iterator(); context.hasNext(); ((StringBuilder) (obj)).append(", ").append(providerinfo.toString()))
        {
            providerinfo = (ProviderInfo)context.next();
        }

        context = ((StringBuilder) (obj)).toString();
        return context;
    }

    public int delete(Uri uri, String s, String as[])
    {
        switch (c.match(uri))
        {
        default:
            Assertion.a((new StringBuilder("Unsupported uri: [")).append(uri.toString()).append("]").toString());
            return 0;

        case 1: // '\001'
            s = a();
            break;
        }
        s.beginTransaction();
        uri = s.query("log", duz.a, null, null, null, null, null);
        int i = 0;
_L2:
        int j;
        if (!uri.moveToNext())
        {
            break; /* Loop/switch isn't completed */
        }
        j = uri.getColumnIndexOrThrow("_ID");
        int k = uri.getColumnIndexOrThrow("source_uri");
        int l = uri.getColumnIndexOrThrow("context");
        int i1 = uri.getColumnIndexOrThrow("event");
        int j1 = uri.getColumnIndexOrThrow("event_version");
        int k1 = uri.getColumnIndexOrThrow("test_version");
        int l1 = uri.getColumnIndexOrThrow("data");
        as = uri.getString(k);
        String s1 = uri.getString(l);
        String s2 = uri.getString(i1);
        String s3 = uri.getString(j1);
        String s4 = uri.getString(k1);
        String s5 = uri.getString(l1);
        TextUtils.join(", ", new String[] {
            as, s1, s2, s3, s4, s5
        });
        Context context = getContext();
        Intent intent = dvv.a(context, "com.spotify.mobile.android.service.action.session.LOG_EVENT");
        intent.putExtra("uri-string", as);
        intent.putExtra("context", s1);
        intent.putExtra("event", s2);
        intent.putExtra("event_version", s3);
        intent.putExtra("test_version", s4);
        intent.putExtra("json_data", s5);
        context.startService(intent);
        j = i + a(s, uri.getLong(j));
        i = j;
        if (true) goto _L2; else goto _L1
_L1:
        uri.close();
        s.setTransactionSuccessful();
        s.endTransaction();
        s.close();
_L3:
        return i;
        uri;
        i = 0;
_L4:
        Assertion.a("Something went wrong while sending and deleting cached logs", uri);
        s.endTransaction();
        s.close();
          goto _L3
        uri;
        s.endTransaction();
        s.close();
        throw uri;
        uri;
          goto _L4
    }

    public String getType(Uri uri)
    {
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentvalues)
    {
        uri.toString();
        contentvalues.toString();
        long l;
        switch (c.match(uri))
        {
        default:
            Assertion.a((new StringBuilder("Unsupported uri: [")).append(uri.toString()).append("]").toString());
            return null;

        case 1: // '\001'
            l = a().insert("log", null, contentvalues);
            break;
        }
        if (l < 0L)
        {
            Assertion.a((new StringBuilder("Log not inserted: uri:[")).append(uri).append("], content values:[").append(contentvalues.toString()).append("]").toString());
        }
        return Uri.withAppendedPath(uri, String.valueOf(l));
    }

    public boolean onCreate()
    {
        gmm.a(getContext());
        d = new duy(getContext(), (byte)0);
        return true;
    }

    public Cursor query(Uri uri, String as[], String s, String as1[], String s1)
    {
        return d.getReadableDatabase().query("log", duz.a, null, null, null, null, null);
    }

    public int update(Uri uri, ContentValues contentvalues, String s, String as[])
    {
        return 0;
    }

    static 
    {
        a = (new StringBuilder()).append(SpotifyProvider.a).append(".logger").toString();
        b = Uri.parse((new StringBuilder("content://")).append(a).append("/log").toString());
        UriMatcher urimatcher = new UriMatcher(-1);
        c = urimatcher;
        urimatcher.addURI("*", "log", 1);
    }
}
