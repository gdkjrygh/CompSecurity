// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.social.albumupload.impl;

import android.app.AlarmManager;
import android.app.IntentService;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.SystemClock;
import android.util.SparseArray;
import b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import mmv;
import mql;
import mqm;
import mqr;
import mra;
import mrb;
import mrf;
import mrh;
import mri;
import mrm;
import mro;
import mrq;
import mrr;
import mrs;
import mvj;
import olm;

public class UploadSchedulerService extends IntentService
{

    private static final long a;
    private final BroadcastReceiver b = new mrs(this);
    private final SparseArray c = new SparseArray();
    private mql d;
    private mmv e;
    private mrh f;
    private mro g;

    public UploadSchedulerService()
    {
        super("AlbumUploadService");
    }

    private mrm a(int i)
    {
        if (c.get(i) == null)
        {
            c.put(i, new mrm(getApplicationContext(), i));
        }
        return (mrm)c.get(i);
    }

    public static void a(Context context, int i)
    {
        context.startService(b(context, i));
    }

    private static Intent b(Context context, int i)
    {
        context = new Intent(context, com/google/android/libraries/social/albumupload/impl/UploadSchedulerService);
        context.putExtra("account_id", i);
        return context;
    }

    public void onCreate()
    {
        super.onCreate();
        Context context = getApplicationContext();
        d = (mql)olm.b(context, mql);
        if (d == null)
        {
            d = mri.a;
        }
        e = (mmv)olm.a(context, mmv);
        f = (mrh)olm.a(context, mrh);
        g = (mro)olm.a(context, mro);
    }

    protected void onHandleIntent(Intent intent)
    {
        int i;
        int j;
        if (intent != null)
        {
            i = intent.getIntExtra("account_id", -1);
        } else
        {
            i = -1;
        }
_L8:
        intent = new ArrayList();
        intent.addAll(e.a(new String[] {
            "logged_in"
        }));
        if (i != -1)
        {
            intent.remove(Integer.valueOf(i));
            intent.add(0, Integer.valueOf(i));
        }
        intent = intent.iterator();
_L4:
        if (!intent.hasNext()) goto _L2; else goto _L1
_L1:
        int k = ((Integer)intent.next()).intValue();
        mrm mrm1 = a(k);
        if (mrf.a(mvj.b(mrm1.a, mrm1.b)) == -1L)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        if (j != 0) goto _L4; else goto _L3
_L3:
        j = k;
_L6:
        if (j != -1)
        {
            if (b.w(getApplicationContext()))
            {
                break; /* Loop/switch isn't completed */
            }
            intent = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
            getApplicationContext().registerReceiver(b, intent);
        }
        return;
_L2:
        j = -1;
        if (true) goto _L6; else goto _L5
_L5:
        mrm mrm2 = a(j);
        long l1 = mrm2.a(g.a);
        int l;
        if (l1 == -1L)
        {
            l = mrr.d;
        } else
        {
            intent = mvj.b(mrm2.a, mrm2.b);
            Object obj = mrm2.c.a(intent, l1);
            long l2 = ((mqr) (obj)).b;
            intent = mrb.a(mvj.b(mrm2.a, mrm2.b), l2);
            mqm mqm1;
            String s;
            if (intent == null)
            {
                intent = null;
            } else
            {
                intent = ((mra) (intent)).a;
            }
            s = ((mqr) (obj)).a;
            mqm1 = mqm.a(j, intent, l2);
            f.a(mqm1);
            obj = g.a(j, intent, s);
            if (((mrq) (obj)).a == mrr.a || ((mrq) (obj)).a == mrr.d || ((mrq) (obj)).a == mrr.e)
            {
                intent = ((Intent) (obj));
            } else
            {
                intent = g.b(j, intent, s);
            }
            if (((mrq) (intent)).a == mrr.a)
            {
                mrm2.a(l1, ((mrq) (intent)).b, ((mrq) (intent)).c);
            } else
            if (((mrq) (intent)).a == mrr.d)
            {
                mrm2.a(l1, 0);
            } else
            if (((mrq) (intent)).a == mrr.e)
            {
                mrm2.a(l1);
            } else
            {
                mrm2.a(l1, d.a());
            }
            f.a(mqm1);
            l = ((mrq) (intent)).a;
        }
        if (l == mrr.c)
        {
            l1 = d.b();
            if (l1 < a)
            {
                try
                {
                    Thread.sleep(l1);
                }
                // Misplaced declaration of an exception variable
                catch (Intent intent) { }
            } else
            {
                intent = getApplicationContext();
                Intent intent1 = b(intent, j);
                ((AlarmManager)intent.getSystemService("alarm")).set(3, l1 + SystemClock.elapsedRealtime(), PendingIntent.getService(intent, 0, intent1, 0));
                return;
            }
        }
        if (true) goto _L8; else goto _L7
_L7:
    }

    static 
    {
        a = TimeUnit.SECONDS.toMillis(10L);
    }
}
