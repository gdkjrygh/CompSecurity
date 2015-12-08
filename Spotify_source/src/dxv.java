// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.viewuri.ViewUri;

public final class dxv
{

    public MediaPlayer a;
    public boolean b;
    private final android.media.MediaPlayer.OnPreparedListener c = new android.media.MediaPlayer.OnPreparedListener() {

        private dxv a;

        public final void onPrepared(MediaPlayer mediaplayer)
        {
            if (gcl.f)
            {
                try
                {
                    mediaplayer.setVideoScalingMode(2);
                }
                // Misplaced declaration of an exception variable
                catch (MediaPlayer mediaplayer)
                {
                    a.a("Unable to set video scaling mode for Media Player", mediaplayer);
                    return;
                }
            }
            mediaplayer.start();
        }

            
            {
                a = dxv.this;
                super();
            }
    };
    private final android.media.MediaPlayer.OnErrorListener d = new android.media.MediaPlayer.OnErrorListener() {

        private dxv a;

        public final boolean onError(MediaPlayer mediaplayer, int i, int j)
        {
            a.c();
            if (i == 1)
            {
                mediaplayer = JsonNodeFactory.instance.objectNode();
                mediaplayer.put("what", i);
                mediaplayer.put("extra", j);
                ClientEvent clientevent = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.aw);
                clientevent.a("extras", mediaplayer);
                dmz.a(fop);
                fop.a(ViewUri.aw, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.a, clientevent);
                return true;
            } else
            {
                Assertion.b((new StringBuilder("Media player error (")).append(i).append(", ").append(j).append(")").toString());
                return true;
            }
        }

            
            {
                a = dxv.this;
                super();
            }
    };
    private final dxw e;
    private SurfaceView f;

    public dxv(SurfaceView surfaceview, dxw dxw1)
    {
        e = (dxw)ctz.a(dxw1);
        f = (SurfaceView)ctz.a(surfaceview);
        surfaceview = new android.view.SurfaceHolder.Callback() {

            private dxv a;

            public final void surfaceChanged(SurfaceHolder surfaceholder, int i, int j, int k)
            {
            }

            public final void surfaceCreated(SurfaceHolder surfaceholder)
            {
                surfaceholder.setSizeFromLayout();
                a.b = true;
                a.a();
            }

            public final void surfaceDestroyed(SurfaceHolder surfaceholder)
            {
                a.b = false;
            }

            
            {
                a = dxv.this;
                super();
            }
        };
        f.getHolder().addCallback(surfaceview);
    }

    private void a(String s)
    {
        c();
        Assertion.b(s);
    }

    public final void a()
    {
        if (!b)
        {
            a("Attempted to initialize video without a display surface");
            return;
        }
        Context context;
        Uri uri;
        try
        {
            context = e.j();
        }
        catch (NullPointerException nullpointerexception)
        {
            a("Attempted to initialize video without context");
            return;
        }
        if (a != null)
        {
            b();
        }
        a = new MediaPlayer();
        try
        {
            a.setLooping(true);
            a.setDisplay(f.getHolder());
        }
        catch (IllegalStateException illegalstateexception1)
        {
            a("Illegal modification of MediaPlayer", ((Exception) (illegalstateexception1)));
            return;
        }
        a.setScreenOnWhilePlaying(false);
        a.setOnErrorListener(d);
        a.setOnPreparedListener(c);
        uri = Uri.parse((new StringBuilder("android.resource://")).append(context.getPackageName()).append('/').append(0x7f070003).toString());
        try
        {
            a.setDataSource(context, uri);
        }
        catch (Exception exception)
        {
            a("Failed to set data source", exception);
            return;
        }
        try
        {
            a.prepareAsync();
            return;
        }
        catch (IllegalStateException illegalstateexception)
        {
            a("Failed to prepare MediaPlayer", ((Exception) (illegalstateexception)));
        }
    }

    public final void a(String s, Exception exception)
    {
        c();
        Assertion.a(s, exception);
    }

    public final void b()
    {
        if (a != null)
        {
            a.release();
            a = null;
        }
    }

    final void c()
    {
        b();
        f.setVisibility(8);
        e.a();
    }
}
