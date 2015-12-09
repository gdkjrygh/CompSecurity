// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.spotify.mobile.android.connect.ConnectManager;
import com.spotify.mobile.android.service.ConnectDevice;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import ctz;
import dkz;
import dmz;
import dwh;
import dwk;
import ern;
import fop;
import fou;
import gcg;
import ggi;
import ggl;
import ggn;
import gjk;
import java.util.List;

public class RemotePlaybackActivity extends fou
    implements dwk
{

    private long d;
    private com.spotify.mobile.android.util.ClientEvent.SubEvent i;
    private ggl j;
    private ConnectDevice k;
    private dwh l;
    private boolean m;
    private boolean n;
    private ern o;
    private ImageView p;
    private TextView q;
    private boolean r;
    private Button s;
    private Button t;
    private boolean u;
    private dkz v;

    public RemotePlaybackActivity()
    {
        dmz.a(fop);
        i = com.spotify.mobile.android.util.ClientEvent.SubEvent.a;
        u = true;
        v = new dkz() {

            private RemotePlaybackActivity a;

            public final void a()
            {
            }

            public final void a(List list, com.spotify.mobile.android.connect.ConnectManager.ConnectState connectstate)
            {
                if (RemotePlaybackActivity.b(a) && RemotePlaybackActivity.c(a))
                {
                    if ((list = ((ConnectManager)RemotePlaybackActivity.a(a).f()).d()) != null)
                    {
                        if (((ConnectDevice) (list)).f)
                        {
                            RemotePlaybackActivity.a(a, com.spotify.mobile.android.util.ClientEvent.SubEvent.ag);
                            a.finish();
                            return;
                        }
                        if (!list.equals(RemotePlaybackActivity.d(a)))
                        {
                            RemotePlaybackActivity.a(a, list);
                            return;
                        }
                    }
                }
            }

            
            {
                a = RemotePlaybackActivity.this;
                super();
            }
        };
    }

    public static Intent a(Context context, ConnectDevice connectdevice)
    {
        ctz.a(context);
        ctz.a(connectdevice);
        context = new Intent(context, com/spotify/mobile/android/ui/activity/RemotePlaybackActivity);
        context.putExtra("active_device", connectdevice);
        return context;
    }

    static com.spotify.mobile.android.util.ClientEvent.SubEvent a(RemotePlaybackActivity remoteplaybackactivity, com.spotify.mobile.android.util.ClientEvent.SubEvent subevent)
    {
        remoteplaybackactivity.i = subevent;
        return subevent;
    }

    static dwh a(RemotePlaybackActivity remoteplaybackactivity)
    {
        return remoteplaybackactivity.l;
    }

    private void a(ConnectDevice connectdevice)
    {
        Assertion.a(connectdevice);
        k = connectdevice;
        String s1 = k.d;
        q.setText(s1);
        if (r)
        {
            int i1 = gcg.b(this, 0x7f0f0092);
            int j1 = getResources().getDimensionPixelSize(0x7f0c00bf);
            p.setImageDrawable(o.a(connectdevice, i1, j1));
        }
    }

    static void a(RemotePlaybackActivity remoteplaybackactivity, ConnectDevice connectdevice)
    {
        remoteplaybackactivity.a(connectdevice);
    }

    static boolean a(RemotePlaybackActivity remoteplaybackactivity, boolean flag)
    {
        remoteplaybackactivity.u = flag;
        return flag;
    }

    static boolean b(RemotePlaybackActivity remoteplaybackactivity)
    {
        return remoteplaybackactivity.n;
    }

    static boolean c(RemotePlaybackActivity remoteplaybackactivity)
    {
        return remoteplaybackactivity.m;
    }

    static ConnectDevice d(RemotePlaybackActivity remoteplaybackactivity)
    {
        return remoteplaybackactivity.k;
    }

    public final void a(Object obj)
    {
        m = true;
        ((ConnectManager)l.f()).a(v);
    }

    public final void b()
    {
        m = false;
    }

    public void onBackPressed()
    {
        if (l.c())
        {
            ((ConnectManager)l.f()).h();
        }
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        o = new ern(this);
        setContentView(0x7f030125);
        j = ggn.a(this, ViewUri.bB);
        s = (Button)findViewById(0x7f110471);
        t = (Button)findViewById(0x7f110472);
        bundle = s;
        int i1;
        if (ggi.c(this))
        {
            i1 = 0x7f0801c8;
        } else
        {
            i1 = 0x7f0801c7;
        }
        bundle.setText(i1);
        (new gjk(s)).a();
        t.setText(0x7f0801e7);
        t.setOnClickListener(new android.view.View.OnClickListener() {

            private RemotePlaybackActivity a;

            public final void onClick(View view)
            {
                RemotePlaybackActivity.a(a, com.spotify.mobile.android.util.ClientEvent.SubEvent.ae);
                RemotePlaybackActivity.a(a, true);
                a.finish();
            }

            
            {
                a = RemotePlaybackActivity.this;
                super();
            }
        });
        s.setOnClickListener(new android.view.View.OnClickListener() {

            private RemotePlaybackActivity a;

            public final void onClick(View view)
            {
                RemotePlaybackActivity.a(a, com.spotify.mobile.android.util.ClientEvent.SubEvent.af);
                RemotePlaybackActivity.a(a, false);
                if (RemotePlaybackActivity.a(a).c())
                {
                    ((ConnectManager)RemotePlaybackActivity.a(a).f()).h();
                }
                a.finish();
            }

            
            {
                a = RemotePlaybackActivity.this;
                super();
            }
        });
        (new LinearLayout(this)).setOrientation(1);
        r = getResources().getBoolean(0x7f0a0003);
        p = (ImageView)findViewById(0x7f1104ae);
        bundle = p;
        if (r)
        {
            i1 = 0;
        } else
        {
            i1 = 8;
        }
        bundle.setVisibility(i1);
        q = (TextView)findViewById(0x7f1104af);
    }

    protected void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    protected void onPause()
    {
        super.onPause();
        n = false;
        j.b();
        if (k != null && u && l.c())
        {
            ((ConnectManager)l.f()).d(k.m);
        }
        setResult(-1);
        if (k != null)
        {
            long l1 = SystemClock.elapsedRealtime();
            long l2 = d;
            ClientEvent clientevent;
            boolean flag;
            if (2 == getResources().getConfiguration().orientation)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            clientevent = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.O, i);
            clientevent.a("popup-duration", String.valueOf(l1 - l2));
            clientevent.a("device-type", String.valueOf(k.l.ordinal()));
            clientevent.a("landscape-orientation", String.valueOf(flag));
            fop.a(this, ViewUri.bB, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.y, clientevent);
        }
    }

    protected void onResume()
    {
        super.onResume();
        n = true;
        d = SystemClock.elapsedRealtime();
        j.a();
        Object obj = getIntent();
        ConnectDevice connectdevice = (ConnectDevice)((Intent) (obj)).getParcelableExtra("active_device");
        if (connectdevice != null && connectdevice.b != null && connectdevice.c != null)
        {
            obj = (ConnectDevice)((Intent) (obj)).getParcelableExtra("active_device");
            Assertion.a(obj);
            a(((ConnectDevice) (obj)));
            return;
        } else
        {
            i = com.spotify.mobile.android.util.ClientEvent.SubEvent.ag;
            finish();
            return;
        }
    }

    public void onStart()
    {
        super.onStart();
        l = new dwh(this);
        l.a(this);
        l.a();
    }

    public void onStop()
    {
        super.onStop();
        if (l.c())
        {
            ((ConnectManager)l.f()).b(v);
            l.b();
        }
    }
}
