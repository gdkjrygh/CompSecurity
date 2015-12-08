// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.VideoView;

// Referenced classes of package com.microsoft.advertising.android:
//            bh, PlayerProperties, av, bd

public class OrmmaPlayer extends VideoView
    implements android.media.MediaPlayer.OnCompletionListener, android.media.MediaPlayer.OnErrorListener, android.media.MediaPlayer.OnPreparedListener
{

    private PlayerProperties a;
    private AudioManager b;
    private bd c;
    private int d;
    private String e;
    private RelativeLayout f;
    private boolean g;
    private Runnable h;
    private Runnable i;
    private final boolean j;

    public OrmmaPlayer(Context context, boolean flag)
    {
        super(context);
        b = (AudioManager)getContext().getSystemService("audio");
        j = flag;
    }

    private void d()
    {
        e = e.trim();
        e = bh.a(e);
        if (e == null && c != null)
        {
            e();
        } else
        {
            setVideoURI(Uri.parse(e));
            if (a.b)
            {
                MediaController mediacontroller = new MediaController(getContext());
                setMediaController(mediacontroller);
                mediacontroller.setAnchorView(this);
            }
            setOnCompletionListener(this);
            setOnErrorListener(this);
            setOnPreparedListener(this);
            if (!a.e && !a.e)
            {
                f = new RelativeLayout(getContext());
                f.setLayoutParams(getLayoutParams());
                TextView textview = new TextView(getContext());
                textview.setText("Loading. Please Wait..");
                textview.setTextColor(-1);
                android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
                layoutparams.addRule(13);
                f.addView(textview, layoutparams);
                ((ViewGroup)getParent()).addView(f);
            }
            if (a.a)
            {
                start();
                return;
            }
        }
    }

    private void e()
    {
        ViewGroup viewgroup = (ViewGroup)getParent();
        if (viewgroup != null)
        {
            viewgroup.removeView(this);
        }
    }

    private void f()
    {
        if (f != null)
        {
            ((ViewGroup)getParent()).removeView(f);
        }
    }

    public final void a()
    {
        if (j)
        {
            if (a.d)
            {
                d = b.getStreamVolume(3);
                b.setStreamVolume(3, 0, 4);
            }
            d();
            return;
        } else
        {
            d();
            return;
        }
    }

    public final boolean b()
    {
        return j;
    }

    public final void c()
    {
        if (!g)
        {
            g = true;
            stopPlayback();
            e();
            if (a != null && a.d)
            {
                b.setStreamVolume(3, d, 4);
                return;
            }
        }
    }

    public void onCompletion(MediaPlayer mediaplayer)
    {
        if (a.c)
        {
            start();
        } else
        {
            if (a.f.equalsIgnoreCase("exit") || a.e)
            {
                c();
            }
            if (h != null)
            {
                (new Handler()).post(h);
                return;
            }
        }
    }

    public boolean onError(MediaPlayer mediaplayer, int k, int l)
    {
        av.c("OrmmaPlayer", String.format("Player error : %d", new Object[] {
            Integer.valueOf(k)
        }));
        f();
        e();
        if (i != null)
        {
            (new Handler()).post(i);
        }
        return false;
    }

    public void onPrepared(MediaPlayer mediaplayer)
    {
        f();
    }

    public void setListener(bd bd)
    {
        c = bd;
    }

    public void setOnCompletionRunnable(Runnable runnable)
    {
        h = runnable;
    }

    public void setOnErrorRunnable(Runnable runnable)
    {
        i = runnable;
    }

    public void setPlayData(Bundle bundle)
    {
        setPlayData((PlayerProperties)bundle.getParcelable("player_properties"), bundle.getString("expand_url"));
    }

    public void setPlayData(PlayerProperties playerproperties, String s)
    {
        g = false;
        a = playerproperties;
        e = s;
    }
}
