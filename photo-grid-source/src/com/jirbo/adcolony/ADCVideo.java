// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jirbo.adcolony;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;
import com.immersion.hapticmediasdk.HapticContentSDK;
import com.immersion.hapticmediasdk.HapticContentSDKFactory;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.jirbo.adcolony:
//            a, AdColonyNativeAdView, AdColonyIAPEngagement, AdColonyAd, 
//            e, ae, ADCImage, AdColonyBrowser, 
//            w

public abstract class ADCVideo extends Activity
{

    static int a;
    static int b;
    static int c;
    static boolean d;
    static boolean e;
    static boolean f;
    static boolean g;
    static Activity h;
    static boolean i;
    static boolean j;
    String A;
    String B;
    boolean C;
    boolean D;
    e E;
    ae F;
    AdColonyAd G;
    HapticContentSDK H;
    String I;
    boolean J;
    boolean K;
    String L;
    VideoView M;
    FrameLayout N;
    FrameLayout O;
    FrameLayout P;
    Rect Q;
    ADCImage R;
    a S;
    FileInputStream T;
    boolean k;
    boolean l;
    boolean m;
    boolean n;
    boolean o;
    double p;
    double q;
    long r;
    long s;
    int t;
    int u;
    int v;
    int w;
    int x;
    int y;
    int z;

    public ADCVideo()
    {
        A = "";
        B = "";
        C = true;
        D = true;
        K = true;
        L = "Your purchase will begin shortly!";
        Q = new Rect();
    }

    static void a()
    {
        a = 0;
        d = false;
        e = false;
        g = false;
    }

    void a(String s1)
    {
        A = s1;
        g = true;
        M = new VideoView(this);
        s1 = Uri.parse(s1);
        M.setVideoURI(s1);
        (new MediaController(this)).setMediaPlayer(M);
        M.setLayoutParams(new android.widget.FrameLayout.LayoutParams(t, u, 17));
        P.addView(M);
        P.addView(S);
        setContentView(P);
        M.setOnCompletionListener(new _cls2());
        M.setOnPreparedListener(new _cls3());
        M.start();
    }

    boolean b()
    {
        boolean flag = false;
        DisplayMetrics displaymetrics = getResources().getDisplayMetrics();
        t = displaymetrics.widthPixels;
        u = displaymetrics.heightPixels;
        t = displaymetrics.widthPixels;
        u = displaymetrics.heightPixels;
        z = 0xff000000;
        getWindow().setBackgroundDrawable(new ColorDrawable(z));
        int i1 = t;
        int j1 = u;
        x = i1;
        y = j1;
        if (!a.m && x < y)
        {
            t = j1;
            u = i1;
            x = j1;
            y = i1;
        }
        if (a.B)
        {
            a.B = false;
            flag = true;
        }
        return flag;
    }

    public void onCreate(Bundle bundle)
    {
        boolean flag;
        flag = true;
        com.jirbo.adcolony.a.aa = false;
        super.onCreate(bundle);
        J = com.jirbo.adcolony.a.i("haptics_enabled");
        I = com.jirbo.adcolony.a.j("haptics_filepath");
        L = com.jirbo.adcolony.a.j("in_progress");
        B = com.jirbo.adcolony.a.j("video_filepath");
        boolean flag1;
        if (J)
        {
            int i1;
            try
            {
                H = HapticContentSDKFactory.GetNewSDKInstance(0, this);
                H.openHaptics(I);
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                bundle.printStackTrace();
                J = false;
            }
            if (H == null)
            {
                J = false;
            }
        }
        h = this;
        if (!com.jirbo.adcolony.a.i("video_enabled"))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        com.jirbo.adcolony.a.Q = flag1;
        if (!com.jirbo.adcolony.a.i("end_card_enabled"))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        com.jirbo.adcolony.a.P = flag1;
        com.jirbo.adcolony.a.R = com.jirbo.adcolony.a.i("load_timeout_enabled");
        com.jirbo.adcolony.a.S = com.jirbo.adcolony.a.h("load_timeout");
        for (i1 = 0; i1 < com.jirbo.adcolony.a.ag.size(); i1++)
        {
            if (com.jirbo.adcolony.a.ag.get(i1) != null)
            {
                bundle = (AdColonyNativeAdView)com.jirbo.adcolony.a.ag.get(i1);
                if (((AdColonyNativeAdView) (bundle)).ad != null)
                {
                    ((AdColonyNativeAdView) (bundle)).S.setVisibility(4);
                }
                if (((AdColonyNativeAdView) (bundle)).Q != null)
                {
                    ((AdColonyNativeAdView) (bundle)).Q.setVisibility(4);
                }
            }
        }

        G = com.jirbo.adcolony.a.J;
        if (G == null)
        {
            finish();
            return;
        }
        if (com.jirbo.adcolony.a.i("v4iap_enabled"))
        {
            G.u = AdColonyIAPEngagement.AUTOMATIC;
            G.t = true;
            G.m = com.jirbo.adcolony.a.j("product_id");
        }
        e = G.s;
        requestWindowFeature(1);
        getWindow().setFlags(1024, 1024);
        if (com.jirbo.adcolony.a.m) goto _L2; else goto _L1
_L1:
        if (android.os.Build.VERSION.SDK_INT >= 10)
        {
            setRequestedOrientation(6);
        } else
        {
            setRequestedOrientation(0);
        }
_L8:
        setVolumeControlStream(3);
        E = new e(this);
        N = new FrameLayout(this);
        F = new ae(this);
        P = new FrameLayout(this);
        S = new a(this);
        R = new ADCImage(com.jirbo.adcolony.a.j("browser_icon"));
        AdColonyBrowser.A = false;
        com.jirbo.adcolony.a.K = this;
        com.jirbo.adcolony.a.L = this;
        return;
_L2:
        int j1;
        int k1;
        k1 = getResources().getConfiguration().orientation;
        if (k1 == 0 || k1 == 6 || k1 == 2)
        {
            j1 = 6;
        } else
        {
            j1 = 7;
        }
        com.jirbo.adcolony.a.w = j1;
        if (android.os.Build.VERSION.SDK_INT >= 10 && !Build.MODEL.equals("Kindle Fire"))
        {
            setRequestedOrientation(com.jirbo.adcolony.a.w);
            continue; /* Loop/switch isn't completed */
        }
        if (!Build.MODEL.equals("Kindle Fire"))
        {
            break MISSING_BLOCK_LABEL_614;
        }
        getRequestedOrientation();
        j1 = ((flag) ? 1 : 0);
        ((WindowManager)getSystemService("window")).getDefaultDisplay().getRotation();
        JVM INSTR tableswitch 0 2: default 588
    //                   0 591
    //                   1 603
    //                   2 608;
           goto _L3 _L4 _L5 _L6
_L5:
        break; /* Loop/switch isn't completed */
_L4:
        break; /* Loop/switch isn't completed */
_L3:
        j1 = 8;
_L9:
        com.jirbo.adcolony.a.w = j1;
        setRequestedOrientation(j1);
        if (true) goto _L8; else goto _L7
_L7:
        j1 = 0;
          goto _L9
_L6:
        j1 = 9;
          goto _L9
        j1 = k1;
          goto _L9
    }

    public void onDestroy()
    {
        super.onDestroy();
        boolean flag = com.jirbo.adcolony.a.aa;
        com.jirbo.adcolony.a.v = true;
        com.jirbo.adcolony.a.K = null;
        com.jirbo.adcolony.a.aa = true;
    }

    public boolean onKeyDown(int i1, KeyEvent keyevent)
    {
        if (i1 == 4)
        {
            return true;
        } else
        {
            return super.onKeyDown(i1, keyevent);
        }
    }

    public boolean onKeyUp(int i1, KeyEvent keyevent)
    {
        if (w.I != null && w.I.onKeyDown(i1, keyevent))
        {
            return true;
        }
        if (i1 != 4) goto _L2; else goto _L1
_L1:
        if (!d) goto _L4; else goto _L3
_L3:
        if (!g) goto _L6; else goto _L5
_L5:
        M.stopPlayback();
        g = false;
        P.removeAllViews();
        setContentView(N);
_L7:
        return true;
_L6:
        if (F != null && F.t == 0)
        {
            com.jirbo.adcolony.a.aa = true;
            F.f();
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (F != null && w.I != null)
        {
            for (keyevent = w.I.o.iterator(); keyevent.hasNext(); ((ADCImage)keyevent.next()).a()) { }
            w.I = null;
            w.H = false;
            E.start();
        } else
        if (F != null && F.M && F.O)
        {
            com.jirbo.adcolony.a.aa = true;
            F.g();
        }
        if (true) goto _L7; else goto _L2
_L2:
        if (i1 == 82)
        {
            return true;
        } else
        {
            return super.onKeyUp(i1, keyevent);
        }
    }

    public void onPause()
    {
        i = false;
        if (g)
        {
            if (M != null)
            {
                b = M.getCurrentPosition();
                M.stopPlayback();
            }
        } else
        {
            b = 0;
        }
        if (d)
        {
            View view = new View(this);
            view.setBackgroundColor(0xff000000);
            setContentView(view);
            s = System.currentTimeMillis();
            if (!isFinishing())
            {
                q = q + (double)(s - r) / 1000D;
            }
        }
        if (E != null)
        {
            if (E.getCurrentPosition() != 0)
            {
                a = E.getCurrentPosition();
            }
            E.a();
            E.setBackgroundColor(0xff000000);
            if (J)
            {
                H.pause();
            }
        } else
        {
            a = 0;
        }
        F.A = true;
        F.I = false;
        F.H = false;
        F.J = false;
        F.u = 0;
        F.t = 0;
        F.invalidate();
        super.onPause();
    }

    public void onResume()
    {
        i = true;
        super.onResume();
        if (com.jirbo.adcolony.a.a())
        {
            finish();
        }
        b();
        if (C)
        {
            C = false;
            if (!d)
            {
                if (F.Q)
                {
                    O.addView(F.a);
                }
                if (F.Q)
                {
                    O.setVisibility(4);
                }
                if (Build.MODEL.equals("Kindle Fire"))
                {
                    F.m = 20;
                }
                if (Build.MODEL.equals("SCH-I800"))
                {
                    F.m = 25;
                }
                N.addView(E, new android.widget.FrameLayout.LayoutParams(x, y, 17));
                if (F.Q)
                {
                    N.addView(O, new android.widget.FrameLayout.LayoutParams(t, u - F.m, 17));
                }
                N.addView(F, new android.widget.FrameLayout.LayoutParams(t, u, 17));
            }
        }
        if (!g) goto _L2; else goto _L1
_L1:
        P.removeView(S);
        P.addView(S);
        setContentView(P);
_L4:
        E.a(F);
        E.a(F);
        try
        {
            T = new FileInputStream(B);
            E.a(T.getFD());
        }
        catch (IOException ioexception)
        {
            com.jirbo.adcolony.a.e((new StringBuilder("Unable to play video: ")).append(com.jirbo.adcolony.a.j("video_filepath")).toString());
            finish();
            return;
        }
        if (!j)
        {
            onWindowFocusChanged(true);
        }
        if (com.jirbo.adcolony.a.Q)
        {
            F.a();
            F.c();
        }
        return;
_L2:
        setContentView(N);
        if (d)
        {
            r = System.currentTimeMillis();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onWindowFocusChanged(boolean flag)
    {
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_248;
        }
        j = false;
        if (d || !i) goto _L2; else goto _L1
_L1:
        if (E != null)
        {
            if (c != 0)
            {
                a = c;
            }
            c = 0;
            E.seekTo(a);
            if (com.jirbo.adcolony.a.m)
            {
                Handler handler = new Handler();
                _cls1 _lcls1 = new _cls1();
                E.setBackgroundColor(0xff000000);
                handler.postDelayed(_lcls1, 900L);
            } else
            {
                E.setBackgroundColor(0);
            }
            if (!w.H)
            {
                F.S = false;
                E.start();
                if (J)
                {
                    if (K)
                    {
                        H.play();
                    } else
                    {
                        H.resume();
                    }
                    K = false;
                }
            }
            F.requestFocus();
            F.invalidate();
        }
_L4:
        return;
_L2:
        if (g)
        {
            if (M != null)
            {
                M.seekTo(b);
                M.start();
                return;
            }
            if (P != null)
            {
                P.removeAllViews();
            }
            setContentView(N);
            return;
        }
        if (!d) goto _L4; else goto _L3
_L3:
        F.invalidate();
        return;
        if (i)
        {
            if (J)
            {
                H.pause();
            }
            a = E.getCurrentPosition();
            E.pause();
        }
        j = true;
        return;
    }

    private class _cls2
        implements android.media.MediaPlayer.OnCompletionListener
    {

        final ADCVideo a;

        public void onCompletion(MediaPlayer mediaplayer)
        {
            a.setContentView(a.N);
            a.P.removeAllViews();
            ADCVideo.g = false;
        }

        _cls2()
        {
            a = ADCVideo.this;
            super();
        }
    }


    private class _cls3
        implements android.media.MediaPlayer.OnPreparedListener
    {

        final ADCVideo a;

        public void onPrepared(MediaPlayer mediaplayer)
        {
            a.P.removeViewAt(1);
        }

        _cls3()
        {
            a = ADCVideo.this;
            super();
        }
    }


    private class a extends View
    {

        Rect a;
        final ADCVideo b;

        public void onDraw(Canvas canvas)
        {
            canvas.drawARGB(255, 0, 0, 0);
            getDrawingRect(a);
            b.R.a(canvas, (a.width() - b.R.f) / 2, (a.height() - b.R.g) / 2);
            invalidate();
        }

        public a(Activity activity)
        {
            b = ADCVideo.this;
            super(activity);
            a = new Rect();
        }
    }


    private class _cls1
        implements Runnable
    {

        final ADCVideo a;

        public void run()
        {
            a.E.setBackgroundColor(0);
        }

        _cls1()
        {
            a = ADCVideo.this;
            super();
        }
    }

}
