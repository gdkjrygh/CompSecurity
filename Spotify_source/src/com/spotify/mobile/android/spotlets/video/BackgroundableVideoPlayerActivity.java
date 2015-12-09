// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.video;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.exoplayer.AspectRatioFrameLayout;
import com.spotify.android.paste.app.FontSupport;
import dvv;
import flb;
import flc;
import fld;
import fle;
import fli;
import gcl;
import java.util.Map;

public class BackgroundableVideoPlayerActivity extends Activity
{

    private AspectRatioFrameLayout a;
    private flb b;
    private fld c;
    private boolean d;
    private View e;
    private View f;
    private fli g;
    private ServiceConnection h;

    public BackgroundableVideoPlayerActivity()
    {
        g = new fli() {

            final BackgroundableVideoPlayerActivity a;

            public final void a()
            {
                BackgroundableVideoPlayerActivity.b(a).a(BackgroundableVideoPlayerActivity.a(a), a.getWindowManager().getDefaultDisplay());
                BackgroundableVideoPlayerActivity.c(a).a();
            }

            public final void a(LegacyAdsVideoPlayerService.AdsVideoPlaybackState adsvideoplaybackstate)
            {
                final class _cls5
                {

                    static final int a[];

                    static 
                    {
                        a = new int[LegacyAdsVideoPlayerService.AdsVideoPlaybackState.values().length];
                        try
                        {
                            a[LegacyAdsVideoPlayerService.AdsVideoPlaybackState.c.ordinal()] = 1;
                        }
                        catch (NoSuchFieldError nosuchfielderror) { }
                    }
                }

                switch (_cls5.a[adsvideoplaybackstate.ordinal()])
                {
                default:
                    a.runOnUiThread(new Runnable(this) {

                        private _cls1 a;

                        public final void run()
                        {
                            BackgroundableVideoPlayerActivity.e(a.a).setVisibility(8);
                        }

            
            {
                a = _pcls1;
                super();
            }
                    });
                    return;

                case 1: // '\001'
                    a.runOnUiThread(new Runnable(this) {

                        private _cls1 a;

                        public final void run()
                        {
                            BackgroundableVideoPlayerActivity.e(a.a).setVisibility(0);
                        }

            
            {
                a = _pcls1;
                super();
            }
                    });
                    break;
                }
            }

            public final void a(Map map)
            {
                BackgroundableVideoPlayerActivity.d(a);
            }

            public final void a(boolean flag)
            {
                if (flag)
                {
                    a.getWindow().addFlags(128);
                    return;
                } else
                {
                    a.getWindow().clearFlags(128);
                    return;
                }
            }

            public final void b()
            {
                if (BackgroundableVideoPlayerActivity.f(a) != null)
                {
                    a.runOnUiThread(new Runnable(this) {

                        private _cls1 a;

                        public final void run()
                        {
                            BackgroundableVideoPlayerActivity.f(a.a).setVisibility(8);
                        }

            
            {
                a = _pcls1;
                super();
            }
                    });
                }
            }

            public final void b(Map map)
            {
                BackgroundableVideoPlayerActivity.d(a);
            }

            
            {
                a = BackgroundableVideoPlayerActivity.this;
                super();
            }
        };
        h = new ServiceConnection() {

            private BackgroundableVideoPlayerActivity a;

            public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
            {
                BackgroundableVideoPlayerActivity.a(a, ((flc)ibinder).a);
                BackgroundableVideoPlayerActivity.b(a).a(BackgroundableVideoPlayerActivity.g(a));
                componentname = BackgroundableVideoPlayerActivity.c(a);
                componentname.b = BackgroundableVideoPlayerActivity.b(a);
                if (((fld) (componentname)).b != null)
                {
                    ((fld) (componentname)).d.setText(componentname.a(((fld) (componentname)).b.f()));
                    componentname.c();
                }
                componentname = a.getIntent().getStringExtra("com.spotify.mobile.android.spotlets.video.BackgroundableVideoPlayerActivityEXTRA_TITLE");
                BackgroundableVideoPlayerActivity.c(a).f.setText(componentname);
                if (BackgroundableVideoPlayerActivity.b(a).a())
                {
                    BackgroundableVideoPlayerActivity.e(a).setVisibility(8);
                }
                a.a();
            }

            public final void onServiceDisconnected(ComponentName componentname)
            {
                BackgroundableVideoPlayerActivity.a(a, null);
            }

            
            {
                a = BackgroundableVideoPlayerActivity.this;
                super();
            }
        };
    }

    static AspectRatioFrameLayout a(BackgroundableVideoPlayerActivity backgroundablevideoplayeractivity)
    {
        return backgroundablevideoplayeractivity.a;
    }

    static flb a(BackgroundableVideoPlayerActivity backgroundablevideoplayeractivity, flb flb1)
    {
        backgroundablevideoplayeractivity.b = flb1;
        return flb1;
    }

    static boolean a(BackgroundableVideoPlayerActivity backgroundablevideoplayeractivity, boolean flag)
    {
        backgroundablevideoplayeractivity.d = flag;
        return flag;
    }

    static flb b(BackgroundableVideoPlayerActivity backgroundablevideoplayeractivity)
    {
        return backgroundablevideoplayeractivity.b;
    }

    static fld c(BackgroundableVideoPlayerActivity backgroundablevideoplayeractivity)
    {
        return backgroundablevideoplayeractivity.c;
    }

    static void d(BackgroundableVideoPlayerActivity backgroundablevideoplayeractivity)
    {
        fld fld1 = backgroundablevideoplayeractivity.c;
        fld1.e.removeMessages(1);
        fld1.e.removeMessages(2);
        Message message = Message.obtain();
        message.what = 3;
        fld1.e.sendMessageAtFrontOfQueue(message);
        backgroundablevideoplayeractivity.finish();
    }

    static View e(BackgroundableVideoPlayerActivity backgroundablevideoplayeractivity)
    {
        return backgroundablevideoplayeractivity.e;
    }

    static View f(BackgroundableVideoPlayerActivity backgroundablevideoplayeractivity)
    {
        return backgroundablevideoplayeractivity.f;
    }

    static fli g(BackgroundableVideoPlayerActivity backgroundablevideoplayeractivity)
    {
        return backgroundablevideoplayeractivity.g;
    }

    public final void a()
    {
        if (b != null && d)
        {
            b.a(false, a, getWindowManager().getDefaultDisplay());
        }
    }

    public void onBackPressed()
    {
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        if (b != null && a != null)
        {
            if (gcl.f)
            {
                if (configuration.orientation == 2)
                {
                    char c1 = '\u0706';
                    if (gcl.i)
                    {
                        c1 = '\u1706';
                    }
                    getWindow().getDecorView().setSystemUiVisibility(c1);
                } else
                {
                    getWindow().getDecorView().setSystemUiVisibility(256);
                }
            }
            b.b();
        }
    }

    public void onCreate(Bundle bundle)
    {
        FontSupport.a(this);
        super.onCreate(bundle);
        setContentView(0x7f030039);
        a = (AspectRatioFrameLayout)findViewById(0x7f1102e5);
        bundle = (SurfaceView)findViewById(0x7f1102e6);
        c = new fld(this);
        FrameLayout framelayout = (FrameLayout)findViewById(0x7f1102e4);
        fld fld1 = c;
        fld1.c = framelayout;
        int i = (int)fld1.a.getResources().getDimension(0x7f0c003e);
        Object obj = new android.view.ViewGroup.MarginLayoutParams(framelayout.getLayoutParams());
        ((android.view.ViewGroup.MarginLayoutParams) (obj)).setMargins(0, 0, 0, i);
        obj = new android.widget.FrameLayout.LayoutParams(((android.view.ViewGroup.MarginLayoutParams) (obj)));
        obj.gravity = 80;
        framelayout.addView(fld1, ((android.view.ViewGroup.LayoutParams) (obj)));
        f = findViewById(0x7f1102e7);
        e = findViewById(0x7f1102c3);
        e.setVisibility(8);
        bundle.getHolder().addCallback(new android.view.SurfaceHolder.Callback() {

            private BackgroundableVideoPlayerActivity a;

            public final void surfaceChanged(SurfaceHolder surfaceholder, int j, int k, int l)
            {
            }

            public final void surfaceCreated(SurfaceHolder surfaceholder)
            {
                BackgroundableVideoPlayerActivity.a(a, true);
                a.a();
            }

            public final void surfaceDestroyed(SurfaceHolder surfaceholder)
            {
                BackgroundableVideoPlayerActivity.a(a, false);
                if (BackgroundableVideoPlayerActivity.b(a) != null)
                {
                    BackgroundableVideoPlayerActivity.b(a).a(true, null, a.getWindowManager().getDefaultDisplay());
                }
            }

            
            {
                a = BackgroundableVideoPlayerActivity.this;
                super();
            }
        });
        framelayout.setOnClickListener(new android.view.View.OnClickListener() {

            private BackgroundableVideoPlayerActivity a;

            public final void onClick(View view)
            {
                BackgroundableVideoPlayerActivity.c(a).a();
            }

            
            {
                a = BackgroundableVideoPlayerActivity.this;
                super();
            }
        });
        flb.a(this, h);
    }

    protected void onDestroy()
    {
        if (b != null)
        {
            b.b(g);
            b.c();
            unbindService(h);
            b = null;
        }
        super.onDestroy();
    }

    protected void onResume()
    {
        super.onResume();
        startService(dvv.a(this, "com.spotify.mobile.android.service.action.client.FOREGROUND"));
    }
}
