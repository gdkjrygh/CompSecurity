// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.library;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.Log;
import com.aviary.android.feather.common.a;
import com.aviary.android.feather.common.b.b;
import com.aviary.android.feather.common.utils.f;
import com.aviary.android.feather.common.utils.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import junit.framework.Assert;

public class MonitoredActivity extends Activity
{
    public static class a
        implements b
    {

        public void a(MonitoredActivity monitoredactivity)
        {
        }

        public void b(MonitoredActivity monitoredactivity)
        {
        }

        public void c(MonitoredActivity monitoredactivity)
        {
        }

        public void d(MonitoredActivity monitoredactivity)
        {
        }

        public a()
        {
        }
    }

    public static interface b
    {

        public abstract void a(MonitoredActivity monitoredactivity);

        public abstract void b(MonitoredActivity monitoredactivity);

        public abstract void c(MonitoredActivity monitoredactivity);

        public abstract void d(MonitoredActivity monitoredactivity);
    }


    protected com.aviary.android.feather.common.b.b a;
    private final ArrayList b = new ArrayList();
    private BroadcastReceiver c;

    public MonitoredActivity()
    {
    }

    private AlertDialog a(Bundle bundle)
    {
        Log.i("MonitoredActivity", "generateAlertDialog");
        if (bundle != null) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        String s;
        java.io.Serializable serializable;
        s = bundle.getString("android.intent.extra.TITLE");
        serializable = bundle.getSerializable("EXTRA_EXCEPTIONS");
        if (s == null || !bundle.containsKey("EXTRA_EXCEPTIONS") && !bundle.containsKey("android.intent.extra.TEXT")) goto _L1; else goto _L3
_L3:
        if (!bundle.containsKey("EXTRA_EXCEPTIONS")) goto _L5; else goto _L4
_L4:
        if (serializable == null || !(serializable instanceof ArrayList)) goto _L7; else goto _L6
_L6:
        bundle = m.a((Collection)serializable, "\n\n");
_L9:
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(this);
        builder.setTitle(s);
        builder.setIcon(0x1080027);
        if (bundle != null)
        {
            builder.setMessage(bundle);
        }
        builder.setPositiveButton(0x1040000, new android.content.DialogInterface.OnClickListener() {

            final MonitoredActivity a;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                dialoginterface.dismiss();
            }

            
            {
                a = MonitoredActivity.this;
                super();
            }
        });
        return builder.create();
_L5:
        if (bundle.containsKey("android.intent.extra.TEXT"))
        {
            bundle = bundle.getString("android.intent.extra.TEXT");
            continue; /* Loop/switch isn't completed */
        }
_L7:
        bundle = null;
        if (true) goto _L9; else goto _L8
_L8:
    }

    private void a()
    {
        Thread thread = new Thread(new Runnable() {

            final MonitoredActivity a;

            public void run()
            {
                com.aviary.android.feather.library.MonitoredActivity.a(a);
                com.aviary.android.feather.library.MonitoredActivity.b(a);
                com.aviary.android.feather.a.b b1 = com.aviary.android.feather.a.b.a(a.getApplicationContext());
                b1.a();
                b1.c();
            }

            
            {
                a = MonitoredActivity.this;
                super();
            }
        });
        thread.setPriority(1);
        thread.start();
    }

    private void a(Intent intent)
    {
        Log.i("MonitoredActivity", (new StringBuilder()).append("onAlertMessage: ").append(intent).toString());
        if (intent != null)
        {
            String s = intent.getAction();
            intent = intent.getExtras();
            if (intent != null && "aviary.intent.action.ALERT".equals(s))
            {
                intent = a(((Bundle) (intent)));
                if (intent != null)
                {
                    intent.show();
                }
            }
        }
    }

    static void a(MonitoredActivity monitoredactivity)
    {
        monitoredactivity.c();
    }

    static void a(MonitoredActivity monitoredactivity, Intent intent)
    {
        monitoredactivity.a(intent);
    }

    private void b()
    {
        Log.w("MonitoredActivity", (new StringBuilder()).append("onKill: ").append(getPackageName()).toString());
        (new android.app.AlertDialog.Builder(this)).setTitle("Removed").setMessage("We're sorry but the application has been banned. Please contact the developer.").setCancelable(false).setPositiveButton(0x104000a, new android.content.DialogInterface.OnClickListener() {

            final MonitoredActivity a;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                dialoginterface.dismiss();
                a.finish();
            }

            
            {
                a = MonitoredActivity.this;
                super();
            }
        }).show();
    }

    static void b(MonitoredActivity monitoredactivity)
    {
        monitoredactivity.d();
    }

    private void c()
    {
        IntentFilter intentfilter = new IntentFilter("aviary.intent.action.ALERT");
        if (!f.c(this))
        {
            intentfilter.addAction("aviary.intent.action.KILL");
        }
        c = new BroadcastReceiver() {

            final MonitoredActivity a;

            public void onReceive(Context context, Intent intent)
            {
                Log.i("MonitoredActivity", (new StringBuilder()).append("onReceive: ").append(intent).toString());
                if (intent != null && context != null)
                {
                    context = intent.getAction();
                    if ("aviary.intent.action.KILL".equals(context))
                    {
                        MonitoredActivity.c(a);
                    } else
                    if ("aviary.intent.action.ALERT".equals(context))
                    {
                        com.aviary.android.feather.library.MonitoredActivity.a(a, intent);
                        return;
                    }
                }
            }

            
            {
                a = MonitoredActivity.this;
                super();
            }
        };
        registerReceiver(c, intentfilter);
    }

    static void c(MonitoredActivity monitoredactivity)
    {
        monitoredactivity.b();
    }

    private void d()
    {
        Object obj = null;
        Intent intent = getIntent();
        String s;
        if (intent != null)
        {
            s = intent.getStringExtra("extra-api-key-secret");
            obj = intent.getStringExtra("extra-billing-public-key");
        } else
        {
            s = null;
        }
        obj = startService(com.aviary.android.feather.common.a.a(getBaseContext(), s, ((String) (obj))));
        if (obj == null)
        {
            com.aviary.android.feather.common.a.a.a("'AviaryCdsService' not found, did you forget to add to your AndroidManifest.xml file?");
        }
        Assert.assertNotNull(obj);
    }

    public void a(b b1)
    {
        b.remove(b1);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        for (bundle = b.iterator(); bundle.hasNext(); ((b)bundle.next()).a(this)) { }
        bundle = it.sephiroth.android.library.a.a.a(this).b();
        a = com.aviary.android.feather.common.b.b.a(this);
        a.a("ab-group", bundle.name());
        a.a();
        a.b();
        a();
    }

    protected void onDestroy()
    {
        super.onDestroy();
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((b)iterator.next()).b(this)) { }
        if (c != null)
        {
            unregisterReceiver(c);
            c = null;
        }
    }

    protected void onPause()
    {
        a.c();
        a.b();
        com.aviary.android.feather.a.b.a(this).b();
        com.aviary.android.feather.a.b.a(this).c();
        super.onPause();
    }

    protected void onResume()
    {
        super.onResume();
        a.a();
        com.aviary.android.feather.a.b.a(this).a();
    }

    protected void onStart()
    {
        super.onStart();
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((b)iterator.next()).c(this)) { }
    }

    protected void onStop()
    {
        super.onStop();
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((b)iterator.next()).d(this)) { }
    }
}
