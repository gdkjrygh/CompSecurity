// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jirbo.adcolony;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.FileInputStream;
import java.util.ArrayList;

// Referenced classes of package com.jirbo.adcolony:
//            AdColonyIAPEngagement, ADCImage, a, d, 
//            u, AdColonyInterstitialAd, c, AdColonyNativeAdListener, 
//            AdColony, l, ag, q, 
//            ADCVideo, AdColonyOverlay, t, AdColonyFullscreen, 
//            AdColonyNativeAdMutedListener

public class AdColonyNativeAdView extends FrameLayout
    implements android.media.MediaPlayer.OnCompletionListener, android.media.MediaPlayer.OnErrorListener, android.media.MediaPlayer.OnPreparedListener
{

    boolean A;
    boolean B;
    boolean C;
    boolean D;
    boolean E;
    boolean F;
    boolean G;
    boolean H;
    boolean I;
    boolean J;
    AdColonyInterstitialAd K;
    AdColonyNativeAdListener L;
    AdColonyNativeAdMutedListener M;
    ADCImage N;
    ADCImage O;
    ADCImage P;
    ImageView Q;
    b R;
    View S;
    Bitmap T;
    ADCImage U;
    ImageView V;
    boolean W;
    Button Z;
    TextView a;
    float aA;
    FileInputStream aB;
    String aa;
    String ab;
    String ac;
    MediaPlayer ad;
    Surface ae;
    String af;
    String ag;
    String ah;
    String ai;
    String aj;
    String ak;
    String al;
    String am;
    AdColonyIAPEngagement an;
    int ao;
    int ap;
    int aq;
    int ar;
    int as;
    int at;
    int au;
    int av;
    n.ab aw;
    n.a ax;
    float ay;
    float az;
    TextView b;
    TextView c;
    Activity d;
    String e;
    String f;
    ViewGroup g;
    SurfaceTexture h;
    int i;
    int j;
    int k;
    int l;
    boolean m;
    boolean n;
    boolean o;
    boolean p;
    boolean q;
    boolean r;
    boolean s;
    boolean t;
    boolean u;
    boolean v;
    boolean w;
    boolean x;
    boolean y;
    boolean z;

    public AdColonyNativeAdView(Activity activity, String s1, int i1)
    {
        super(activity);
        B = true;
        D = true;
        W = false;
        aa = "";
        ab = "";
        ac = "";
        am = "";
        an = AdColonyIAPEngagement.NONE;
        ar = -1;
        at = 0xffcccccc;
        au = 0xff000000;
        ay = 0.25F;
        az = 0.25F;
        a(activity, s1, i1);
        a();
    }

    public AdColonyNativeAdView(Activity activity, String s1, int i1, int j1)
    {
        super(activity);
        B = true;
        D = true;
        W = false;
        aa = "";
        ab = "";
        ac = "";
        am = "";
        an = AdColonyIAPEngagement.NONE;
        ar = -1;
        at = 0xffcccccc;
        au = 0xff000000;
        ay = 0.25F;
        az = 0.25F;
        a(activity, s1, i1, j1);
        a(false);
    }

    AdColonyNativeAdView(Activity activity, String s1, int i1, boolean flag)
    {
        super(activity);
        B = true;
        D = true;
        W = false;
        aa = "";
        ab = "";
        ac = "";
        am = "";
        an = AdColonyIAPEngagement.NONE;
        ar = -1;
        at = 0xffcccccc;
        au = 0xff000000;
        ay = 0.25F;
        az = 0.25F;
        G = flag;
        a(activity, s1, i1);
        a();
    }

    void a()
    {
        a(true);
    }

    void a(float f1, boolean flag)
    {
        if (android.os.Build.VERSION.SDK_INT >= 14) goto _L2; else goto _L1
_L1:
        return;
_L2:
        az = f1;
        if (ad == null || (double)f1 < 0.0D || (double)f1 > 1.0D)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!x)
        {
            ad.setVolume(f1, f1);
        }
        if (!z) goto _L1; else goto _L3
_L3:
        if (T == P.a && (double)f1 > 0.0D && !x)
        {
            ADCData.g g1 = new ADCData.g();
            g1.b("user_action", flag);
            Q.setImageBitmap(O.a);
            T = O.a;
            a.l.d.a("sound_unmute", g1, K);
            r = true;
            return;
        }
        if (T != O.a || (double)f1 != 0.0D) goto _L1; else goto _L4
_L4:
        ADCData.g g2 = new ADCData.g();
        g2.b("user_action", flag);
        Q.setImageBitmap(P.a);
        T = P.a;
        a.l.d.a("sound_mute", g2, K);
        r = false;
        return;
        if ((double)f1 < 0.0D || (double)f1 > 1.0D) goto _L1; else goto _L5
_L5:
        ay = f1;
        return;
    }

    void a(Activity activity, String s1, int i1)
    {
        a(activity, s1, i1, 0);
    }

    void a(Activity activity, String s1, int i1, int j1)
    {
        com.jirbo.adcolony.a.e();
        if (!G)
        {
            a.ag.add(this);
        }
        a.ac = 0;
        d = activity;
        e = s1;
        aq = i1;
        k = i1;
        if (j1 != 0)
        {
            l = j1;
            ar = j1;
            o = true;
        }
        r = true;
        aA = com.jirbo.adcolony.a.b().getResources().getDisplayMetrics().density;
        activity = com.jirbo.adcolony.a.b().getWindowManager().getDefaultDisplay();
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            Point point = new Point();
            activity.getSize(point);
            i1 = point.x;
            j1 = point.y;
        } else
        {
            i1 = activity.getWidth();
            j1 = activity.getHeight();
        }
        if (i1 >= j1)
        {
            i1 = j1;
        }
        av = i1;
        K = new AdColonyInterstitialAd(s1);
        K.j = "native";
        K.k = "native";
        a.l.d.a(s1, K);
        setBackgroundColor(0xff000000);
    }

    void a(boolean flag)
    {
        z = false;
        q = false;
        setWillNotDraw(false);
        K.x = this;
        if (!B)
        {
            break MISSING_BLOCK_LABEL_1292;
        }
        if (com.jirbo.adcolony.a.l != null && com.jirbo.adcolony.a.l.a != null && K != null && K.g != null && com.jirbo.adcolony.a.l.a(K.g, true, false))
        {
            com.jirbo.adcolony.a.l.a.b(e);
        } else
        {
            u = true;
        }
        K.b(true);
        aw = K.h;
        f = com.jirbo.adcolony.a.j("video_filepath");
        af = com.jirbo.adcolony.a.j("advertiser_name");
        ag = com.jirbo.adcolony.a.j("description");
        ah = com.jirbo.adcolony.a.j("title");
        ai = com.jirbo.adcolony.a.j("poster_image");
        aj = com.jirbo.adcolony.a.j("unmute");
        ak = com.jirbo.adcolony.a.j("mute");
        al = com.jirbo.adcolony.a.j("thumb_image");
        W = com.jirbo.adcolony.a.i("native_engagement_enabled");
        aa = com.jirbo.adcolony.a.j("native_engagement_label");
        ab = com.jirbo.adcolony.a.j("native_engagement_command");
        ac = com.jirbo.adcolony.a.j("native_engagement_type");
        J = com.jirbo.adcolony.a.i("v4iap_enabled");
        if (J)
        {
            an = AdColonyIAPEngagement.AUTOMATIC;
        }
        am = com.jirbo.adcolony.a.j("product_id");
        if (K.i != null && K.i.w != null)
        {
            y = K.i.w.b;
        } else
        {
            y = true;
        }
        if (aw != null)
        {
            aw.k();
        }
        if (K.i != null && K.i.w != null && K.i.w.a && K.h != null) goto _L2; else goto _L1
_L1:
        com.jirbo.adcolony.a.ac = 13;
_L4:
        return;
_L2:
        s = true;
        if (G) goto _L4; else goto _L3
_L3:
        B = false;
_L6:
        ao = K.i.v.b;
        ap = K.i.v.c;
        if (ar == -1)
        {
            ar = (int)((double)ap * ((double)aq / (double)ao));
            l = ar;
        }
        float f1 = (float)aq / (float)ao;
        float f2 = (float)ar / (float)ap;
        float f3 = (float)ao / (float)ap;
        android.widget.FrameLayout.LayoutParams layoutparams;
        android.widget.FrameLayout.LayoutParams layoutparams2;
        byte byte0;
        if (f1 > f2)
        {
            aq = (int)((float)ar * f3);
        } else
        {
            ar = (int)((float)aq / f3);
        }
        if (W)
        {
            Z = new Button(com.jirbo.adcolony.a.b());
            Z.setText(aa);
            Z.setGravity(17);
            Z.setTextSize((int)(18D * ((double)aq / (double)av)));
            Z.setPadding(0, 0, 0, 0);
            Z.setBackgroundColor(at);
            Z.setTextColor(au);
            Z.setOnTouchListener(new _cls1());
        }
        N = new ADCImage(ai, true, false);
        if (1.0F / ((float)N.f / (float)k) > 1.0F / ((float)N.g / (float)l))
        {
            f1 = 1.0F / ((float)N.g / (float)l);
        } else
        {
            f1 = 1.0F / ((float)N.f / (float)k);
        }
        N.a(f1, true);
        P = new ADCImage(aj, true, false);
        O = new ADCImage(ak, true, false);
        U = new ADCImage(al, true, false);
        U.a(1.0F / (float)((double)((float)U.f / (float)aq) / ((double)aq / 5.5D / (double)(float)aq)), true);
        O.a(aA / 2.0F, true);
        P.a(aA / 2.0F, true);
        R = new b(com.jirbo.adcolony.a.b());
        V = new ImageView(com.jirbo.adcolony.a.b());
        Q = new ImageView(com.jirbo.adcolony.a.b());
        V.setImageBitmap(U.a);
        if (r)
        {
            Q.setImageBitmap(O.a);
        } else
        {
            Q.setImageBitmap(P.a);
        }
        layoutparams = new android.widget.FrameLayout.LayoutParams(O.f, O.g, 48);
        layoutparams.setMargins(k - O.f, 0, 0, 0);
        Q.setOnClickListener(new _cls2());
        T = O.a;
        if (u)
        {
            Q.setVisibility(8);
        }
        if (v)
        {
            Q.setVisibility(4);
        }
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            S = new a(com.jirbo.adcolony.a.b(), u);
        }
        if (W)
        {
            byte0 = 48;
        } else
        {
            byte0 = 17;
        }
        layoutparams2 = new android.widget.FrameLayout.LayoutParams(aq, ar, byte0);
        if (byte0 == 48)
        {
            layoutparams2.setMargins((k - aq) / 2, (l - ar) / 2, 0, 0);
        }
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            addView(S, layoutparams2);
        }
        if (android.os.Build.VERSION.SDK_INT < 14)
        {
            u = true;
        }
        layoutparams2 = new android.widget.FrameLayout.LayoutParams(k, l, byte0);
        layoutparams2.setMargins((k - aq) / 2, (l - ar) / 2, 0, 0);
        addView(R, layoutparams2);
        if (y && android.os.Build.VERSION.SDK_INT >= 14 && D)
        {
            addView(Q, layoutparams);
        }
        if (!W) goto _L4; else goto _L5
_L5:
        android.widget.FrameLayout.LayoutParams layoutparams1;
        if (flag)
        {
            layoutparams1 = new android.widget.FrameLayout.LayoutParams(k, l / 5, 80);
        } else
        {
            layoutparams1 = new android.widget.FrameLayout.LayoutParams(k, ar / 5, 80);
        }
        addView(Z, layoutparams1);
        return;
        if (android.os.Build.VERSION.SDK_INT < 14)
        {
            return;
        }
          goto _L6
    }

    void a(boolean flag, boolean flag1)
    {
        if (flag)
        {
            Q.setImageBitmap(P.a);
            r = false;
            a(0.0F, flag1);
            T = P.a;
        } else
        if (!x && T == P.a)
        {
            Q.setImageBitmap(O.a);
            r = true;
            if (ad != null)
            {
                if ((double)az != 0.0D)
                {
                    a(az, flag1);
                } else
                {
                    a(0.25F, flag1);
                }
            }
            T = O.a;
            return;
        }
    }

    void b()
    {
        this;
        JVM INSTR monitorenter ;
        if (!u && ad != null && ad.isPlaying()) goto _L2; else goto _L1
_L1:
        MediaPlayer mediaplayer = ad;
        if (mediaplayer != null) goto _L3; else goto _L2
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L3:
        setVolume(az);
        ad.start();
        com.jirbo.adcolony.a.l.a(K);
        K.q = true;
        if (L != null)
        {
            L.onAdColonyNativeAdStarted(false, this);
        }
        if (true) goto _L2; else goto _L4
_L4:
        Exception exception;
        exception;
        throw exception;
    }

    boolean b(boolean flag)
    {
        return K.a(true) && AdColony.isZoneNative(e);
    }

    void c()
    {
        if (!u && ad != null && ad.isPlaying() && !v)
        {
            com.jirbo.adcolony.a.l.d.b("video_paused", K);
            ad.pause();
        }
    }

    void c(boolean flag)
    {
label0:
        {
            if (ad != null && Q != null)
            {
                if (!flag)
                {
                    break label0;
                }
                ad.setVolume(0.0F, 0.0F);
                Q.setImageBitmap(P.a);
                T = P.a;
            }
            return;
        }
        ad.setVolume(az, az);
        Q.setImageBitmap(O.a);
        T = O.a;
    }

    public boolean canceled()
    {
        return I;
    }

    public void destroy()
    {
        l.c.b("[ADC] Native Ad Destroy called.");
        if (ae != null)
        {
            ae.release();
        }
        if (ad != null)
        {
            ad.release();
        }
        ad = null;
        com.jirbo.adcolony.a.ag.remove(this);
    }

    public ImageView getAdvertiserImage()
    {
        if (U == null)
        {
            U = new ADCImage(al, true, false);
            U.a(aA / 2.0F, true);
        }
        if (V == null)
        {
            V = new ImageView(com.jirbo.adcolony.a.b());
            V.setImageBitmap(U.a);
        }
        return V;
    }

    public String getAdvertiserName()
    {
        return af;
    }

    public String getDescription()
    {
        return ag;
    }

    public int getNativeAdHeight()
    {
        if (W)
        {
            return l + l / 5;
        } else
        {
            return l;
        }
    }

    public int getNativeAdWidth()
    {
        return k;
    }

    public String getTitle()
    {
        return ah;
    }

    public boolean iapEnabled()
    {
        return J;
    }

    public AdColonyIAPEngagement iapEngagementType()
    {
        if (K != null && K.u == AdColonyIAPEngagement.END_CARD)
        {
            return AdColonyIAPEngagement.END_CARD;
        } else
        {
            return an;
        }
    }

    public String iapProductID()
    {
        return am;
    }

    public boolean isReady()
    {
        return K.a(true) && s && !F;
    }

    public void notifyAddedToListView()
    {
        if (!m)
        {
            m = true;
            return;
        } else
        {
            ((a)S).onSurfaceTextureAvailable(h, i, j);
            return;
        }
    }

    public void onCompletion(MediaPlayer mediaplayer)
    {
        try
        {
            aB.close();
        }
        // Misplaced declaration of an exception variable
        catch (MediaPlayer mediaplayer) { }
        R.setVisibility(0);
        Q.setVisibility(8);
        K.j = "native";
        K.k = "native";
        K.q = true;
        u = true;
        if (ad != null)
        {
            ad.release();
        }
        ad = null;
        K.p = 0;
        mediaplayer = new ADCData.g();
        mediaplayer.b("ad_slot", K.h.k.d);
        mediaplayer.b("replay", false);
        com.jirbo.adcolony.a.l.d.a("native_complete", mediaplayer, K);
        if (L != null)
        {
            L.onAdColonyNativeAdFinished(false, this);
        }
        C = true;
    }

    public void onDraw(Canvas canvas)
    {
        if (g != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Rect rect = new Rect();
        if (!g.hasFocus())
        {
            g.requestFocus();
        }
        if (!u && ad != null)
        {
            as = ad.getCurrentPosition();
        }
        if (as != 0)
        {
            K.p = as;
        }
        getLocalVisibleRect(rect);
        boolean flag;
        if (rect.bottom - rect.top > getNativeAdHeight() / 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if ((flag || n) && (!n || flag && (rect.bottom - rect.top >= getNativeAdHeight() || rect.top == 0)))
        {
            break; /* Loop/switch isn't completed */
        }
        if (!u && ad != null && ad.isPlaying() && !v)
        {
            l.c.b("[ADC] Scroll Pause");
            com.jirbo.adcolony.a.l.d.b("video_paused", K);
            ad.pause();
            R.setVisibility(0);
        }
_L4:
        if (!A && !u)
        {
            invalidate();
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (!u && ad != null && ad.isPlaying())
        {
            if (!z)
            {
                canvas.drawARGB(255, 0, 0, 0);
            } else
            {
                K.j = "native";
                K.k = "native";
                com.jirbo.adcolony.a.l.a((double)ad.getCurrentPosition() / (double)ad.getDuration(), K);
                if (!H && ad.getCurrentPosition() > 2000)
                {
                    H = true;
                    com.jirbo.adcolony.a.l.a("native_start", (new StringBuilder("{\"ad_slot\":")).append(K.h.k.d).append(", \"replay\":false}").toString(), K);
                }
            }
        } else
        if (!R.a)
        {
            canvas.drawARGB(255, 0, 0, 0);
        }
          goto _L4
        if (true) goto _L1; else goto _L5
_L5:
    }

    public boolean onError(MediaPlayer mediaplayer, int i1, int j1)
    {
        R.setVisibility(0);
        Q.setVisibility(8);
        u = true;
        z = true;
        ad = null;
        K.p = 0;
        return true;
    }

    public void onPrepared(MediaPlayer mediaplayer)
    {
        l.c.b("[ADC] Native Ad onPrepared called.");
        z = true;
        if (T == null || O.a == null)
        {
            R.setVisibility(0);
            Q.setVisibility(8);
            u = true;
            ad = null;
            K.p = 0;
            return;
        }
        if (!r && T.equals(O.a))
        {
            c(true);
            return;
        } else
        {
            setVolume(az);
            return;
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            return false;
        }
        if (motionevent.getAction() == 1 && com.jirbo.adcolony.a.v && com.jirbo.adcolony.q.c())
        {
            com.jirbo.adcolony.a.J = K;
            com.jirbo.adcolony.a.l.a.a(e, K.i);
            ADCVideo.a();
            K.s = C;
            K.r = true;
            K.j = "native";
            K.k = "fullscreen";
            com.jirbo.adcolony.a.v = false;
            com.jirbo.adcolony.a.l.d.b("video_expanded", K);
            if (L != null)
            {
                L.onAdColonyNativeAdStarted(true, this);
            }
            if (com.jirbo.adcolony.a.m)
            {
                l.a.b("Launching AdColonyOverlay");
                com.jirbo.adcolony.a.b().startActivity(new Intent(com.jirbo.adcolony.a.b(), com/jirbo/adcolony/AdColonyOverlay));
            } else
            {
                l.a.b("Launching AdColonyFullscreen");
                com.jirbo.adcolony.a.b().startActivity(new Intent(com.jirbo.adcolony.a.b(), com/jirbo/adcolony/AdColonyFullscreen));
            }
            if (u)
            {
                K.f = -1;
                motionevent = K.h.k;
                motionevent.d = ((ag) (motionevent)).d + 1;
                com.jirbo.adcolony.a.l.a("start", (new StringBuilder("{\"ad_slot\":")).append(K.h.k.d).append(", \"replay\":").append(K.s).append("}").toString(), K);
                com.jirbo.adcolony.a.l.h.a(K.g, K.i.d);
            }
            u = true;
            C = true;
        }
        return true;
    }

    public void pause()
    {
        l.c.b("[ADC] Native Ad Pause called.");
        if (ad != null && !u && ad.isPlaying() && android.os.Build.VERSION.SDK_INT >= 14)
        {
            com.jirbo.adcolony.a.l.d.b("video_paused", K);
            v = true;
            ad.pause();
            R.setVisibility(0);
            Q.setVisibility(4);
        }
    }

    public void prepareForListView()
    {
        n = true;
    }

    public void resume()
    {
        l.c.b("[ADC] Native Ad Resume called.");
        if (ad != null && v && !u && android.os.Build.VERSION.SDK_INT >= 14)
        {
            com.jirbo.adcolony.a.l.d.b("video_resumed", K);
            v = false;
            ad.seekTo(K.p);
            ad.start();
            R.setVisibility(4);
            Q.setVisibility(0);
        }
    }

    public void setMuted(boolean flag)
    {
        a(flag, false);
    }

    public void setOverlayButtonColor(int i1)
    {
        if (W)
        {
            Z.setBackgroundColor(i1);
        }
        at = i1;
    }

    public void setOverlayButtonTextColor(int i1)
    {
        if (W)
        {
            Z.setTextColor(i1);
        }
        au = i1;
    }

    public void setOverlayButtonTypeface(Typeface typeface, int i1)
    {
        if (W)
        {
            Z.setTypeface(typeface, i1);
        }
    }

    public void setVolume(float f1)
    {
        a(f1, false);
    }

    public AdColonyNativeAdView withListener(AdColonyNativeAdListener adcolonynativeadlistener)
    {
        L = adcolonynativeadlistener;
        K.w = adcolonynativeadlistener;
        return this;
    }

    public AdColonyNativeAdView withMutedListener(AdColonyNativeAdMutedListener adcolonynativeadmutedlistener)
    {
        M = adcolonynativeadmutedlistener;
        return this;
    }

    private class _cls1
        implements android.view.View.OnTouchListener
    {

        final AdColonyNativeAdView a;

        public boolean onTouch(View view, MotionEvent motionevent)
        {
            int i1 = motionevent.getAction();
            if (i1 == 0)
            {
                view = new float[3];
                Color.colorToHSV(a.at, view);
                view[2] = view[2] * 0.8F;
                a.Z.setBackgroundColor(Color.HSVToColor(view));
            } else
            {
                if (i1 == 3)
                {
                    a.Z.setBackgroundColor(a.at);
                    return true;
                }
                if (i1 == 1)
                {
                    if (a.J)
                    {
                        a.an = AdColonyIAPEngagement.OVERLAY;
                        a.u = true;
                        return true;
                    }
                    if (a.ac.equals("install") || a.ac.equals("url"))
                    {
                        com.jirbo.adcolony.a.l.d.b("native_overlay_click", a.K);
                        try
                        {
                            view = new Intent("android.intent.action.VIEW", Uri.parse(a.ab));
                            com.jirbo.adcolony.a.b().startActivity(view);
                        }
                        // Misplaced declaration of an exception variable
                        catch (View view)
                        {
                            Toast.makeText(com.jirbo.adcolony.a.b(), "Unable to open store.", 0).show();
                        }
                    }
                    a.Z.setBackgroundColor(a.at);
                    return true;
                }
            }
            return true;
        }

        _cls1()
        {
            a = AdColonyNativeAdView.this;
            super();
        }
    }


    private class b extends View
    {

        boolean a;
        final AdColonyNativeAdView b;

        public void onDraw(Canvas canvas)
        {
            b.g = (ViewGroup)getParent().getParent();
            Rect rect = new Rect();
            if (b.ad != null && !b.ad.isPlaying() && b.n)
            {
                a = false;
            }
            if (getLocalVisibleRect(rect) && android.os.Build.VERSION.SDK_INT >= 14 && b.z)
            {
                if ((!b.n || b.n && (rect.top == 0 || rect.bottom - rect.top > b.getNativeAdHeight())) && rect.bottom - rect.top > b.getNativeAdHeight() / 2)
                {
                    if (!a && !b.u && b.ad != null && !b.ad.isPlaying() && !b.A)
                    {
                        b.K.a(true);
                    }
                    if (!b.t)
                    {
                        l.c.b("[ADC] Native Ad Starting");
                        b.b();
                        b.t = true;
                        b.K.j = "native";
                        b.K.k = "native";
                    } else
                    if (!b.v && b.ad != null && com.jirbo.adcolony.q.c() && !b.ad.isPlaying() && !com.jirbo.adcolony.a.t)
                    {
                        l.c.b("[ADC] Native Ad Resuming");
                        com.jirbo.adcolony.a.l.d.b("video_resumed", b.K);
                        if (!b.r)
                        {
                            b.c(true);
                        }
                        b.setVolume(b.az);
                        b.ad.seekTo(b.K.p);
                        b.ad.start();
                    } else
                    if (!b.u && !b.t && !com.jirbo.adcolony.a.l.a(b.K.g, true, false))
                    {
                        b.u = true;
                        setVisibility(0);
                        b.Q.setVisibility(8);
                    }
                }
                a = true;
            } else
            {
                a = false;
            }
            if (!b.u && !com.jirbo.adcolony.q.c() && b.ad != null && !b.ad.isPlaying())
            {
                setVisibility(0);
                b.Q.setVisibility(8);
                b.u = true;
            }
            if (!b.u && b.ad != null && b.ad.isPlaying())
            {
                setVisibility(8);
                b.Q.setVisibility(0);
            } else
            if (b.u || b.v)
            {
                canvas.drawARGB(255, 0, 0, 0);
                b.Q.setVisibility(8);
                b.N.a(canvas, (b.aq - b.N.f) / 2, (b.ar - b.N.g) / 2);
            }
            if (!b.A && !b.u)
            {
                invalidate();
            }
        }

        public b(Context context)
        {
            b = AdColonyNativeAdView.this;
            super(context);
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final AdColonyNativeAdView a;

        public void onClick(View view)
        {
            if (a.r)
            {
                if (a.M != null)
                {
                    a.M.onAdColonyNativeAdMuted(a, true);
                }
                a.a(true, true);
                a.x = true;
            } else
            if (a.T == a.P.a)
            {
                if (a.M != null)
                {
                    a.M.onAdColonyNativeAdMuted(a, false);
                }
                a.x = false;
                a.a(false, true);
                return;
            }
        }

        _cls2()
        {
            a = AdColonyNativeAdView.this;
            super();
        }
    }


    private class a extends TextureView
        implements android.view.TextureView.SurfaceTextureListener
    {

        boolean a;
        boolean b;
        final AdColonyNativeAdView c;

        public void onSurfaceTextureAvailable(SurfaceTexture surfacetexture, int i1, int j1)
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
                    c.i = i1;
                    c.j = j1;
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

                            final a a;

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
                    a = a.this;
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

        public void onSurfaceTextureSizeChanged(SurfaceTexture surfacetexture, int i1, int j1)
        {
            l.c.b("[ADC] onSurfaceTextureSizeChanged");
        }

        public void onSurfaceTextureUpdated(SurfaceTexture surfacetexture)
        {
        }

        public boolean onTouchEvent(MotionEvent motionevent)
        {
            int i1 = motionevent.getAction();
            float f1 = motionevent.getX();
            float f2 = motionevent.getY();
            if (i1 == 1 && com.jirbo.adcolony.a.v && com.jirbo.adcolony.q.c() && (f1 <= (float)((c.aq - c.O.f) + 8) || f2 >= (float)(c.O.g + 8) || c.u || c.ad == null || !c.ad.isPlaying()))
            {
                com.jirbo.adcolony.a.J = c.K;
                com.jirbo.adcolony.a.l.a.a(c.e, c.K.i);
                ADCVideo.a();
                c.K.j = "native";
                c.K.k = "fullscreen";
                c.K.r = true;
                c.K.s = c.C;
                if ((c.z || c.u) && com.jirbo.adcolony.q.c())
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
                    com.jirbo.adcolony.a.v = false;
                    com.jirbo.adcolony.a.l.d.b("video_expanded", c.K);
                    if (com.jirbo.adcolony.a.m)
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
                        motionevent = c.K.h.k;
                        motionevent.d = ((ag) (motionevent)).d + 1;
                        com.jirbo.adcolony.a.l.a("start", (new StringBuilder("{\"ad_slot\":")).append(c.K.h.k.d).append(", \"replay\":").append(c.K.s).append("}").toString(), c.K);
                        com.jirbo.adcolony.a.l.h.a(c.K.g, c.K.i.d);
                    }
                    c.C = true;
                    return true;
                }
            }
            return true;
        }

        a(Context context)
        {
            this(context, false);
        }

        a(Context context, boolean flag)
        {
            c = AdColonyNativeAdView.this;
            super(context);
            a = false;
            b = false;
            setSurfaceTextureListener(this);
            setWillNotDraw(false);
            a = flag;
        }
    }

}
