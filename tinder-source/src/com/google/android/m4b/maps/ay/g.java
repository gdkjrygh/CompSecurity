// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ay;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;

// Referenced classes of package com.google.android.m4b.maps.ay:
//            ab

public class g
{

    private static volatile String a = null;
    private static final String b = com/google/android/m4b/maps/ay/g.getSimpleName();

    private g()
    {
    }

    public static String a(Context context)
    {
        String s = a;
        if (s != null)
        {
            return s;
        }
        if (android.os.Build.VERSION.SDK.equals("deskdroid"))
        {
            return null;
        }
        String s1 = android.provider.Settings.Secure.getString(context.getContentResolver(), "logging_id2");
        s = s1;
        if (s1 == null)
        {
            s = com.google.android.m4b.maps.de.a.b.a(context.getContentResolver(), "logging_id2");
        }
        a = s;
        return s;
    }

    private static String a(Context context, String s)
    {
        Object obj;
        context = context.getContentResolver();
        obj = Uri.parse("content://com.google.settings/partner");
        String s1 = (new StringBuilder(String.valueOf(s).length() + 7)).append("name='").append(s).append("'").toString();
        obj = context.query(((Uri) (obj)), new String[] {
            "value"
        }, s1, null, null);
        if (obj == null) goto _L2; else goto _L1
_L1:
        context = ((Context) (obj));
        if (!((Cursor) (obj)).moveToFirst()) goto _L2; else goto _L3
_L3:
        context = ((Context) (obj));
        String s2 = ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndexOrThrow("value"));
        context = s2;
_L8:
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        return context;
        Throwable throwable;
        throwable;
        obj = null;
_L6:
        context = ((Context) (obj));
        if (!ab.a(b, 3))
        {
            break MISSING_BLOCK_LABEL_193;
        }
        context = ((Context) (obj));
        String s3 = b;
        context = ((Context) (obj));
        throwable = String.valueOf(throwable);
        context = ((Context) (obj));
        Log.d(s3, (new StringBuilder(String.valueOf(s).length() + 45 + String.valueOf(throwable).length())).append("Error getting distribution channel for key ").append(s).append(": ").append(throwable).toString());
        if (obj != null)
        {
            ((Cursor) (obj)).close();
            return null;
        } else
        {
            return null;
        }
        s;
        context = null;
_L5:
        if (context != null)
        {
            context.close();
        }
        throw s;
        s;
        if (true) goto _L5; else goto _L4
_L4:
        throwable;
        if (true) goto _L6; else goto _L2
_L2:
        context = null;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public static String b(Context context)
    {
        context = a(context, "maps_client_id");
        StringBuilder stringbuilder = new StringBuilder();
        if (context == null || context.length() == 0)
        {
            stringbuilder.append("Web");
        } else
        {
            stringbuilder.append(context);
        }
        return stringbuilder.toString();
    }

}
