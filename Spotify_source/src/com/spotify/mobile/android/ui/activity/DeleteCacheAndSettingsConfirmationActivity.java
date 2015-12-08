// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import com.spotify.android.paste.widget.DialogLayout;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import com.spotify.music.MainActivity;
import com.spotify.music.internal.service.DeleteCacheService;
import dmb;
import dmz;
import dvw;
import dwa;
import fop;
import fou;
import geh;
import gin;
import gio;
import gmt;
import java.io.File;

public class DeleteCacheAndSettingsConfirmationActivity extends fou
{

    private Button d;
    private DialogLayout i;
    private AsyncTask j;
    private dvw k;
    private String l;
    private long m;
    private android.view.View.OnClickListener n;
    private android.view.View.OnClickListener o;

    public DeleteCacheAndSettingsConfirmationActivity()
    {
        dmz.a(fop);
        n = new android.view.View.OnClickListener() {

            private DeleteCacheAndSettingsConfirmationActivity a;

            public final void onClick(View view)
            {
                fop.a(a, ViewUri.bh, new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.g));
                a.finish();
            }

            
            {
                a = DeleteCacheAndSettingsConfirmationActivity.this;
                super();
            }
        };
        o = new android.view.View.OnClickListener() {

            private DeleteCacheAndSettingsConfirmationActivity a;

            public final void onClick(View view)
            {
                fop.a(a, ViewUri.bh, new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.H));
                DeleteCacheService.a(a);
                view = DeleteCacheAndSettingsConfirmationActivity.d(a);
                String s = DeleteCacheAndSettingsConfirmationActivity.b(a);
                long l1 = DeleteCacheAndSettingsConfirmationActivity.c(a);
                ((dvw) (view)).c.b().a(dvw.h, s).a(dvw.i, l1).a();
                a.startActivity(DeleteCacheAndSettingsConfirmationActivity.a(a));
                dmz.a(dwa);
                dwa.a();
            }

            
            {
                a = DeleteCacheAndSettingsConfirmationActivity.this;
                super();
            }
        };
    }

    static long a(DeleteCacheAndSettingsConfirmationActivity deletecacheandsettingsconfirmationactivity, long l1)
    {
        deletecacheandsettingsconfirmationactivity.m = l1;
        return l1;
    }

    static Intent a(Context context)
    {
        context = new Intent("android.intent.action.MAIN", null, context, com/spotify/music/MainActivity);
        context.addFlags(0x10008000);
        context.addCategory("android.intent.category.DEFAULT");
        return context;
    }

    static Button a(DeleteCacheAndSettingsConfirmationActivity deletecacheandsettingsconfirmationactivity)
    {
        return deletecacheandsettingsconfirmationactivity.d;
    }

    static String b(DeleteCacheAndSettingsConfirmationActivity deletecacheandsettingsconfirmationactivity)
    {
        return deletecacheandsettingsconfirmationactivity.l;
    }

    static long c(DeleteCacheAndSettingsConfirmationActivity deletecacheandsettingsconfirmationactivity)
    {
        return deletecacheandsettingsconfirmationactivity.m;
    }

    static dvw d(DeleteCacheAndSettingsConfirmationActivity deletecacheandsettingsconfirmationactivity)
    {
        return deletecacheandsettingsconfirmationactivity.k;
    }

    protected void onCreate(Bundle bundle)
    {
        File file = null;
        super.onCreate(bundle);
        i = new DialogLayout(this);
        setContentView(i);
        i.a(0x7f08026f);
        i.c(0x7f08026e);
        i.a(0x7f0805a1, o);
        i.b(0x7f08059f, n);
        d = i.a();
        d.setEnabled(false);
        k = new dvw(this);
        l = k.b();
        String s;
        if (l != null)
        {
            bundle = new File(l);
        } else
        {
            bundle = null;
        }
        s = k.c();
        if (s != null)
        {
            file = new File(s);
        }
        j = new AsyncTask(bundle, file) {

            private File a;
            private File b;
            private DeleteCacheAndSettingsConfirmationActivity c;

            private transient Long a()
            {
                long l1 = 0L;
                long l3 = SystemClock.elapsedRealtime();
                File file1 = a;
                File file2 = b;
                if (!gmt.a())
                {
                    geh.a("This hits the file system");
                }
                if (file1 != null)
                {
                    l1 = 0L + dmb.a(file1);
                }
                long l2 = l1;
                if (file2 != null)
                {
                    l2 = l1 + dmb.a(file2);
                }
                l1 = SystemClock.elapsedRealtime() - l3;
                if (l1 < 2000L)
                {
                    try
                    {
                        Thread.sleep(2000L - l1);
                    }
                    catch (InterruptedException interruptedexception) { }
                }
                return Long.valueOf(l2);
            }

            protected final Object doInBackground(Object aobj[])
            {
                return a();
            }

            protected final void onPostExecute(Object obj)
            {
                obj = (Long)obj;
                DeleteCacheAndSettingsConfirmationActivity.a(c).setEnabled(true);
                DeleteCacheAndSettingsConfirmationActivity.a(c, ((Long) (obj)).longValue());
            }

            
            {
                c = DeleteCacheAndSettingsConfirmationActivity.this;
                a = file;
                b = file1;
                super();
            }
        };
        j.execute(new Void[0]);
    }

    protected void onDestroy()
    {
        super.onDestroy();
        j.cancel(true);
    }
}
