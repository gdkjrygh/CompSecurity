// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jirbo.adcolony;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import android.widget.ImageView;
import java.io.FileInputStream;

// Referenced classes of package com.jirbo.adcolony:
//            AdColonyNativeAdView, l, a, q, 
//            ADCImage, d, AdColonyInterstitialAd, c, 
//            ADCVideo, AdColonyNativeAdListener, u, AdColonyOverlay, 
//            ag, t, AdColonyFullscreen

class a extends TextureView
    implements android.view.ureListener
{

    boolean a;
    boolean b;
    final AdColonyNativeAdView c;

    public void onSurfaceTextureAvailable(SurfaceTexture surfacetexture, int i, int j)
    {
        if (surfacetexture == null)
        {
            c.u = true;
            c.Q.setVisibility(8);
        } else
        {
            c.R.setVisibility(0);
            c.h = surfacetexture;
            if (!c.u && !a)
            {
                c.ae = new Surface(surfacetexture);
                if (c.ad != null)
                {
                    c.ad.release();
                }
                c.i = i;
                c.j = j;
                c.ad = new MediaPlayer();
                try
                {
                    c.aB = new FileInputStream(c.f);
                    c.ad.setDataSource(c.aB.getFD());
                    c.ad.setSurface(c.ae);
                    c.ad.setOnCompletionListener(c);
                    c.ad.setOnPreparedListener(c);
                    c.ad.setOnErrorListener(c);
                    c.ad.prepareAsync();
                    l.c.b("[ADC] Native Ad Prepare called.");
                    b = true;
                    surfacetexture = new Handler();
                    class _cls1
                        implements Runnable
                    {

                        final AdColonyNativeAdView.a a;

                        public void run()
                        {
                            if (!a.c.z && !a.c.A)
                            {
                                a.b = false;
                                a.c.u = true;
                                a.c.Q.setVisibility(8);
                            }
                        }

            _cls1()
            {
                a = AdColonyNativeAdView.a.this;
                super();
            }
                    }

                    _cls1 _lcls1 = new _cls1();
                    if (!b)
                    {
                        surfacetexture.postDelayed(_lcls1, 1800L);
                        return;
                    }
                }
                // Misplaced declaration of an exception variable
                catch (SurfaceTexture surfacetexture)
                {
                    c.u = true;
                    c.Q.setVisibility(8);
                    return;
                }
            }
        }
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfacetexture)
    {
        l.c.b("[ADC] Native surface destroyed");
        c.z = false;
        c.Q.setVisibility(4);
        c.R.setVisibility(0);
        return true;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfacetexture, int i, int j)
    {
        l.c.b("[ADC] onSurfaceTextureSizeChanged");
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfacetexture)
    {
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        int i = motionevent.getAction();
        float f = motionevent.getX();
        float f1 = motionevent.getY();
        if (i == 1 && a.v && q.c() && (f <= (float)((c.aq - c.O.f) + 8) || f1 >= (float)(c.O.g + 8) || c.u || c.ad == null || !c.ad.isPlaying()))
        {
            a.J = c.K;
            a.l.a.a(c.e, c.K.i);
            ADCVideo.a();
            c.K.j = "native";
            c.K.k = "fullscreen";
            c.K.r = true;
            c.K.s = c.C;
            if ((c.z || c.u) && q.c())
            {
                if (c.L != null)
                {
                    c.L.onAdColonyNativeAdStarted(true, c);
                }
                if (c.ad != null && c.ad.isPlaying())
                {
                    ADCVideo.c = c.ad.getCurrentPosition();
                    c.K.o = c.K.n;
                    c.ad.pause();
                    c.u = true;
                } else
                {
                    c.K.o = 0.0D;
                    ADCVideo.c = 0;
                }
                a.v = false;
                a.l.d.b("video_expanded", c.K);
                if (a.m)
                {
                    l.a.b("Launching AdColonyOverlay");
                    com.jirbo.adcolony.a.b().startActivity(new Intent(com.jirbo.adcolony.a.b(), com/jirbo/adcolony/AdColonyOverlay));
                } else
                {
                    l.a.b("Launching AdColonyFullscreen");
                    com.jirbo.adcolony.a.b().startActivity(new Intent(com.jirbo.adcolony.a.b(), com/jirbo/adcolony/AdColonyFullscreen));
                }
                if (c.u)
                {
                    motionevent = c.K.h.h;
                    motionevent.d = ((ag) (motionevent)).d + 1;
                    a.l.a("start", (new StringBuilder("{\"ad_slot\":")).append(c.K.h.h.d).append(", \"replay\":").append(c.K.s).append("}").toString(), c.K);
                    a.l.h.a(c.K.g, c.K.i.i);
                }
                c.C = true;
                return true;
            }
        }
        return true;
    }

    r(AdColonyNativeAdView adcolonynativeadview, Context context)
    {
        this(adcolonynativeadview, context, false);
    }

    tener(AdColonyNativeAdView adcolonynativeadview, Context context, boolean flag)
    {
        c = adcolonynativeadview;
        super(context);
        a = false;
        b = false;
        setSurfaceTextureListener(this);
        setWillNotDraw(false);
        a = flag;
    }
}
