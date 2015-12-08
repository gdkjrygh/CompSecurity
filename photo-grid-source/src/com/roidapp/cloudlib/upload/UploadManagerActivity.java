// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.upload;

import android.app.Activity;
import android.app.Dialog;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import com.roidapp.baselib.c.b;
import com.roidapp.cloudlib.ar;
import com.roidapp.cloudlib.as;
import com.roidapp.cloudlib.at;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Referenced classes of package com.roidapp.cloudlib.upload:
//            c, o, e, m, 
//            g, h, i, j, 
//            l, k

public class UploadManagerActivity extends Activity
{

    ListView a;
    ExecutorService b;
    Handler c;
    c d;
    o e;
    MyBroadcastReceiver f;
    private View g;
    private int h;

    public UploadManagerActivity()
    {
        h = 0;
    }

    static int a(UploadManagerActivity uploadmanageractivity)
    {
        return uploadmanageractivity.h;
    }

    static int a(UploadManagerActivity uploadmanageractivity, int i1)
    {
        uploadmanageractivity.h = i1;
        return i1;
    }

    private void a()
    {
        List list = d.a();
        Collections.reverse(list);
        e.clear();
        e e1;
        for (Iterator iterator = list.iterator(); iterator.hasNext(); e.add(e1))
        {
            e1 = (e)iterator.next();
        }

        e.notifyDataSetChanged();
        View view = g;
        boolean flag;
        if (!list.isEmpty() && !d.f())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view.setEnabled(flag);
    }

    static void a(UploadManagerActivity uploadmanageractivity, ImageView imageview, String s, boolean flag)
    {
        uploadmanageractivity.b.execute(new m(uploadmanageractivity, s, imageview, flag));
    }

    static void b(UploadManagerActivity uploadmanageractivity)
    {
        uploadmanageractivity.a();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(as.g);
        d = com.roidapp.cloudlib.upload.c.a(this);
        bundle = d.a();
        Collections.reverse(bundle);
        bundle.size();
        a = (ListView)findViewById(ar.bx);
        e = new o(this, this, bundle);
        a.setAdapter(e);
        e.notifyDataSetChanged();
        findViewById(ar.bB).setOnClickListener(new g(this));
        g = findViewById(ar.bg);
        g.setOnClickListener(new h(this));
        View view = g;
        boolean flag;
        if (!bundle.isEmpty() && !d.f())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view.setEnabled(flag);
        c = new Handler();
        b = Executors.newFixedThreadPool(1);
    }

    protected Dialog onCreateDialog(int i1)
    {
        switch (i1)
        {
        default:
            return null;

        case 1: // '\001'
            android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(this);
            builder.setPositiveButton(at.bo, new i(this));
            builder.setNegativeButton(at.ab, new j(this));
            builder.setCancelable(false).setMessage(at.u);
            return builder.create();

        case 2: // '\002'
            return (new android.app.AlertDialog.Builder(this)).setPositiveButton(at.bo, new l(this)).setNegativeButton(at.ab, new k(this)).setCancelable(false).setMessage(at.au).create();
        }
    }

    protected void onDestroy()
    {
        super.onDestroy();
    }

    public void onLowMemory()
    {
        super.onLowMemory();
        d.g();
    }

    protected void onPause()
    {
        super.onPause();
        if (f != null)
        {
            unregisterReceiver(f);
        }
    }

    protected void onResume()
    {
        super.onResume();
        IntentFilter intentfilter = new IntentFilter("com.roidapp.photogrid.UploadStatusChanged");
        f = new MyBroadcastReceiver();
        registerReceiver(f, intentfilter);
        a();
    }

    protected void onStart()
    {
        com.roidapp.baselib.c.b.c("UploadManager");
        super.onStart();
    }

    protected void onStop()
    {
        super.onStop();
    }

    private class MyBroadcastReceiver extends BroadcastReceiver
    {

        final UploadManagerActivity a;

        public void onReceive(Context context, Intent intent)
        {
            com.roidapp.cloudlib.upload.UploadManagerActivity.b(a);
        }

        public MyBroadcastReceiver()
        {
            a = UploadManagerActivity.this;
            super();
        }
    }

}
