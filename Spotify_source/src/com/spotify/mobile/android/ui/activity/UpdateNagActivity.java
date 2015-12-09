// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import com.spotify.mobile.android.util.ClientInfo;
import com.spotify.mobile.android.util.logging.Logger;
import dmz;
import fou;
import fpj;
import gcf;
import ggb;
import gin;
import gio;
import giq;
import gqe;

public class UpdateNagActivity extends fou
{

    public UpdateNagActivity()
    {
    }

    public static void a(Context context)
    {
        Logger.a("UpdateNag: Inside showIfNeeded", new Object[0]);
        gqe gqe1 = (gqe)dmz.a(gqe);
        long l = ((giq)dmz.a(giq)).a(gqe1.a).a(gqe.c, 0L);
        dmz.a(ggb);
        ggb.a();
        boolean flag;
        if (gcf.a() < l + 0x5265c00L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            Logger.a("UpdateNag: App was recently checked.", new Object[0]);
            return;
        } else
        {
            (new fpj(context)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            return;
        }
    }

    static void a(UpdateNagActivity updatenagactivity)
    {
        updatenagactivity.startActivity(ClientInfo.a(updatenagactivity));
        updatenagactivity.finish();
    }

    static void b(UpdateNagActivity updatenagactivity)
    {
        Object obj = (gqe)dmz.a(gqe);
        obj = ((giq)dmz.a(giq)).a(((gqe) (obj)).a);
        dmz.a(ggb);
        ggb.a();
        long l = gcf.a();
        ((gin) (obj)).b().a(gqe.b, l + 0x240c8400L).b();
        updatenagactivity.finish();
    }

    protected void onCreate(Bundle bundle)
    {
        Logger.a("UPDATENAG: UpdateNag onCreate", new Object[0]);
        super.onCreate(bundle);
        setContentView(0x7f030037);
        "com.spotify.music.release".equals("com.spotify.music.canary");
        findViewById(0x7f1102df).setOnClickListener(new android.view.View.OnClickListener() {

            private UpdateNagActivity a;

            public final void onClick(View view)
            {
                UpdateNagActivity.a(a);
            }

            
            {
                a = UpdateNagActivity.this;
                super();
            }
        });
        findViewById(0x7f1102e0).setOnClickListener(new android.view.View.OnClickListener() {

            private UpdateNagActivity a;

            public final void onClick(View view)
            {
                UpdateNagActivity.b(a);
            }

            
            {
                a = UpdateNagActivity.this;
                super();
            }
        });
    }
}
