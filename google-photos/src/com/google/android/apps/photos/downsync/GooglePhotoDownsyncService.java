// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.photos.downsync;

import android.accounts.Account;
import android.app.Service;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.IBinder;
import android.text.TextUtils;
import ffb;
import ffe;
import gct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import mmv;
import mmx;
import mvj;
import noz;
import nxu;
import nyk;
import olm;

// Referenced classes of package com.google.android.apps.photos.downsync:
//            GooglePhotoDownsyncProvider

public class GooglePhotoDownsyncService extends Service
{

    private static final Object a = new Object();
    private static ffb b;
    private static final Map c = new HashMap();
    private static noz d;

    public GooglePhotoDownsyncService()
    {
    }

    public static long a(Context context, int i, ffe ffe1)
    {
        return b(context, i, ffe1);
    }

    public static gct a(String s)
    {
        Map map = c;
        map;
        JVM INSTR monitorenter ;
        gct gct2 = (gct)c.get(s);
        gct gct1;
        gct1 = gct2;
        if (gct2 != null)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        gct1 = new gct();
        gct1.d = "PhotoSyncService";
        c.put(s, gct1);
        map;
        JVM INSTR monitorexit ;
        return gct1;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
    }

    private static noz a(Context context)
    {
        com/google/android/apps/photos/downsync/GooglePhotoDownsyncService;
        JVM INSTR monitorenter ;
        if (d == null)
        {
            d = noz.a(context.getApplicationContext(), 2, "PhotoSyncService", new String[] {
                "sync"
            });
        }
        context = d;
        com/google/android/apps/photos/downsync/GooglePhotoDownsyncService;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    public static void a(Context context, int i, ffe ffe1, long l)
    {
        context = mvj.a(context, i);
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("sync_data_kind", Integer.valueOf(ffe1.b));
        contentvalues.put("last_sync", Long.valueOf(l));
        context.insertWithOnConflict("sync_status", null, contentvalues, 5);
    }

    public static void a(Context context, String s)
    {
        if (a(context).a())
        {
            a(context);
        }
        s = new Account(s, "com.google");
        context = GooglePhotoDownsyncProvider.a(context);
        ContentResolver.setIsSyncable(s, context, 1);
        ContentResolver.setSyncAutomatically(s, context, true);
    }

    public static boolean a(Exception exception)
    {
        boolean flag;
label0:
        {
            boolean flag1 = false;
            flag = flag1;
            if (!(exception instanceof nxu))
            {
                break label0;
            }
            int i = ((nxu)exception).a;
            if (i != 500 && i != 502 && i != 503)
            {
                flag = flag1;
                if (i != 504)
                {
                    break label0;
                }
            }
            flag = true;
        }
        return flag;
    }

    private static long b(Context context, int i, ffe ffe1)
    {
        context = mvj.b(context, i);
        i = ffe1.b;
        context = context.query("sync_status", new String[] {
            "last_sync"
        }, "sync_data_kind = ?", new String[] {
            String.valueOf(i)
        }, null, null, null);
        if (!context.moveToNext()) goto _L2; else goto _L1
_L1:
        long l = context.getLong(0);
_L4:
        context.close();
        return l;
_L2:
        l = 0L;
        if (true) goto _L4; else goto _L3
_L3:
        ffe1;
        context.close();
        throw ffe1;
    }

    public static Account b(String s)
    {
        return new Account(s, "com.google");
    }

    public static void b(Context context, String s)
    {
        s = new Account(s, "com.google");
        context = GooglePhotoDownsyncProvider.a(context);
        ContentResolver.setIsSyncable(s, context, 0);
        ContentResolver.cancelSync(s, context);
    }

    public static boolean c(Context context, String s)
    {
        context = (mmv)olm.a(context, mmv);
        int i = context.a(s);
        return context.c(i) && context.a(i).a();
    }

    public static List d(Context context, String s)
    {
        context = (mmv)olm.a(context, mmv);
        ArrayList arraylist = new ArrayList();
        Iterator iterator = context.a(new String[] {
            "logged_in"
        }).iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            int i = ((Integer)iterator.next()).intValue();
            if (TextUtils.equals(context.a(i).b("account_name"), s))
            {
                arraylist.add(Integer.valueOf(i));
            }
        } while (true);
        return arraylist;
    }

    public IBinder onBind(Intent intent)
    {
        return b.getSyncAdapterBinder();
    }

    public void onCreate()
    {
        if (a(this).a())
        {
            a(this);
        }
        synchronized (a)
        {
            if (b == null)
            {
                b = new ffb(getApplicationContext());
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

}
