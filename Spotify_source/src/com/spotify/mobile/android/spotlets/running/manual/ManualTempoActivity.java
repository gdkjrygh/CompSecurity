// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.running.manual;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.android.paste.widget.EmptyView;
import com.spotify.android.paste.widget.SpotifyIconView;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.ui.stuff.ContentViewManager;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import dfz;
import dgo;
import dmz;
import eda;
import edb;
import fac;
import fad;
import fdy;
import fdz;
import fea;
import feb;
import fec;
import fed;
import few;
import fop;
import fos;
import fou;
import gaa;
import gcg;

public class ManualTempoActivity extends fou
    implements eda, fed
{

    private TextView d;
    private ImageButton i;
    private ImageButton j;
    private fad k;
    private fdz l;
    private ContentViewManager m;
    private View n;

    public ManualTempoActivity()
    {
        dmz.a(fop);
    }

    public static Intent a(Context context, SpotifyLink spotifylink, String s)
    {
        context = new Intent(context, com/spotify/mobile/android/spotlets/running/manual/ManualTempoActivity);
        context.putExtra("link", spotifylink.d());
        context.putExtra("username", s);
        return context;
    }

    private dfz a(ColorStateList colorstatelist, SpotifyIcon spotifyicon)
    {
        spotifyicon = new dfz(this, spotifyicon);
        spotifyicon.a(colorstatelist);
        return spotifyicon;
    }

    static fdz a(ManualTempoActivity manualtempoactivity)
    {
        return manualtempoactivity.l;
    }

    static void a(ManualTempoActivity manualtempoactivity, ClientEvent clientevent)
    {
        manualtempoactivity.a(clientevent);
    }

    private void a(ClientEvent clientevent)
    {
        fop.a(this, ViewUri.l, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.W, clientevent);
    }

    public final void a(int i1)
    {
        d.setText(String.valueOf(i1));
    }

    public final void a(Uri uri)
    {
        k.a(uri);
    }

    public final void a(SessionState sessionstate)
    {
        if (sessionstate != null)
        {
            ContentViewManager contentviewmanager = m;
            boolean flag;
            if (!sessionstate.j)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            contentviewmanager.a(flag);
        }
    }

    public final void b(boolean flag)
    {
        i.setEnabled(flag);
    }

    public final void c(boolean flag)
    {
        n.setEnabled(flag);
    }

    public final void d(boolean flag)
    {
        j.setEnabled(flag);
    }

    public final void f()
    {
        dmz.a(fos);
        fos.a(this, ViewUri.l.toString());
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        Object obj1 = getIntent().getExtras();
        Object obj = ((Bundle) (obj1)).getString("link");
        obj1 = ((Bundle) (obj1)).getString("username");
        h.a(this);
        new fea();
        obj = new few(this, (new SpotifyLink(((String) (obj)))).c(), ((String) (obj1)));
        l = new feb(this, new fdy(), ((few) (obj)), new fec(this));
        setContentView(0x7f030025);
        d = (TextView)findViewById(0x7f11040f);
        i = (ImageButton)findViewById(0x7f110411);
        j = (ImageButton)findViewById(0x7f110410);
        k = (new fac(getApplicationContext())).a();
        dgo.a(findViewById(0x7f11040e), k);
        obj = gcg.c(this, 0x7f0f015e);
        obj1 = a(((ColorStateList) (obj)), SpotifyIcon.bh);
        i.setImageDrawable(((android.graphics.drawable.Drawable) (obj1)));
        obj = a(((ColorStateList) (obj)), SpotifyIcon.bf);
        j.setImageDrawable(((android.graphics.drawable.Drawable) (obj)));
        i.setOnClickListener(new android.view.View.OnClickListener() {

            private ManualTempoActivity a;

            public final void onClick(View view)
            {
                int i1 = ManualTempoActivity.a(a).d();
                ManualTempoActivity.a(a).a();
                view = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.O, com.spotify.mobile.android.util.ClientEvent.SubEvent.dz);
                view.a("new-tempo", String.valueOf(ManualTempoActivity.a(a).d()));
                view.a("old-tempo", String.valueOf(i1));
                ManualTempoActivity.a(a, view);
            }

            
            {
                a = ManualTempoActivity.this;
                super();
            }
        });
        j.setOnClickListener(new android.view.View.OnClickListener() {

            private ManualTempoActivity a;

            public final void onClick(View view)
            {
                ManualTempoActivity.a(a).b();
            }

            
            {
                a = ManualTempoActivity.this;
                super();
            }
        });
        n = findViewById(0x7f110412);
        n.setOnClickListener(new android.view.View.OnClickListener() {

            private ManualTempoActivity a;

            public final void onClick(View view)
            {
                ManualTempoActivity.a(a, new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.O, com.spotify.mobile.android.util.ClientEvent.SubEvent.dx));
                ManualTempoActivity.a(a).c();
            }

            
            {
                a = ManualTempoActivity.this;
                super();
            }
        });
        ((SpotifyIconView)findViewById(0x7f1102b9)).setOnClickListener(new android.view.View.OnClickListener() {

            private ManualTempoActivity a;

            public final void onClick(View view)
            {
                a.finish();
            }

            
            {
                a = ManualTempoActivity.this;
                super();
            }
        });
        obj = findViewById(0x7f11040e);
        m = (new gaa(this, (EmptyView)findViewById(0x7f1102b8), ((View) (obj)))).a(0x7f0802ad, 0x7f0802ac).a();
        m.b(null);
        a(new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.O, com.spotify.mobile.android.util.ClientEvent.SubEvent.dy));
        l.b(bundle);
    }

    public void onDestroy()
    {
        l.e();
        super.onDestroy();
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        l.a(bundle);
    }
}
