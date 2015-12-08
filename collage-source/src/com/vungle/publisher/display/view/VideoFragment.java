// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.display.view;

import android.app.AlertDialog;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.graphics.Bitmap;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.VideoView;
import com.nineoldandroids.a.d;
import com.nineoldandroids.a.k;
import com.nineoldandroids.a.n;
import com.nineoldandroids.view.a;
import com.vungle.log.Logger;
import com.vungle.publisher.ad;
import com.vungle.publisher.ah;
import com.vungle.publisher.al;
import com.vungle.publisher.am;
import com.vungle.publisher.an;
import com.vungle.publisher.ap;
import com.vungle.publisher.aq;
import com.vungle.publisher.audio.VolumeChangeContentObserver;
import com.vungle.publisher.bq;
import com.vungle.publisher.bt;
import com.vungle.publisher.by;
import com.vungle.publisher.db.model.Ad;
import com.vungle.publisher.db.model.Video;
import com.vungle.publisher.device.AudioHelper;
import com.vungle.publisher.event.EventBus;
import com.vungle.publisher.image.BitmapFactory;
import com.vungle.publisher.o;
import com.vungle.publisher.p;
import com.vungle.publisher.util.ViewUtils;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Provider;

// Referenced classes of package com.vungle.publisher.display.view:
//            AdFragment, MuteButton, PrivacyButton, ProgressBar, 
//            DisplayUtils, AlertDialogFactory

public class VideoFragment extends AdFragment
    implements android.media.MediaPlayer.OnCompletionListener, android.media.MediaPlayer.OnErrorListener, android.media.MediaPlayer.OnPreparedListener
{
    public static class Factory
    {

        public Provider a;

        public static VideoFragment a(FragmentActivity fragmentactivity)
        {
            return (VideoFragment)fragmentactivity.getSupportFragmentManager().findFragmentByTag("videoFragment");
        }

        public static VideoFragment a(VideoFragment videofragment, Ad ad1, com.vungle.publisher.a a1)
        {
            String s1 = ad1.f();
            ad1 = ad1.k();
            if (ad1 != null)
            {
                videofragment.a = a1;
                videofragment.b = ad1;
                com.vungle.publisher.display.view.VideoFragment.a(videofragment, s1);
                return videofragment;
            } else
            {
                return null;
            }
        }

        public static void a(VideoFragment videofragment, Bundle bundle)
        {
            if (bundle != null)
            {
                com.vungle.publisher.display.view.VideoFragment.a(videofragment, bundle.getBoolean("adStarted"));
            }
        }

        Factory()
        {
        }
    }

    static class VideoEventListener extends by
    {

        private VideoFragment a;

        static VideoFragment a(VideoEventListener videoeventlistener, VideoFragment videofragment)
        {
            videoeventlistener.a = videofragment;
            return videofragment;
        }

        public void onEvent(aq aq1)
        {
            boolean flag = true;
            MuteButton mutebutton = VideoFragment.h(a);
            boolean flag1;
            if (aq1.b != 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (aq1.a == 0)
            {
                if (aq1.b == 0)
                {
                    flag = false;
                }
            } else
            if (aq1.b != 0)
            {
                flag = false;
            }
            if (flag)
            {
                StringBuilder stringbuilder = new StringBuilder("volume change ");
                if (flag1)
                {
                    aq1 = "un";
                } else
                {
                    aq1 = "";
                }
                Logger.d("VungleAd", stringbuilder.append(aq1).append("mute").toString());
                mutebutton.b();
                mutebutton.a(flag1);
            }
        }

        public VideoEventListener()
        {
        }
    }

    public static class VideoEventListener.Factory
    {

        VideoEventListener a;

        public VideoEventListener.Factory()
        {
        }
    }


    private ViewGroup A;
    private Bitmap B;
    private Bitmap C;
    private final n D = new d();
    private final Handler E = new Handler();
    private final Runnable F = new b();
    private AlertDialog G;
    private VideoEventListener H;
    private String I;
    private int J;
    private boolean K;
    private int L;
    private boolean M;
    private AtomicBoolean N;
    private int O;
    com.vungle.publisher.a a;
    Video b;
    ImageView c;
    k d;
    k e;
    TouchDelegate f;
    k g;
    AlertDialogFactory h;
    BitmapFactory i;
    DisplayUtils j;
    EventBus k;
    Factory l;
    PrivacyButton.Factory m;
    ProgressBar.Factory n;
    MuteButton.Factory o;
    com.vungle.publisher.db.model.LoggedException.Factory p;
    bt q;
    ViewUtils r;
    VolumeChangeContentObserver s;
    VideoEventListener.Factory t;
    AudioHelper u;
    private ImageView v;
    private ProgressBar w;
    private MuteButton x;
    private RelativeLayout y;
    private VideoView z;

    public VideoFragment()
    {
    /* block-local class not found */
    class b {}

        N = new AtomicBoolean();
    }

    private Bitmap a(String s1)
    {
        Bitmap bitmap;
        try
        {
            bitmap = i.getBitmap(s1);
        }
        catch (IOException ioexception)
        {
            p.b("VungleAd", (new StringBuilder("error loading ")).append(s1).toString(), ioexception);
            return null;
        }
        return bitmap;
    }

    private static k a(View view)
    {
        k k1 = new k();
        k1.a("backgroundColor");
        k1.a(view);
        return k1;
    }

    static String a(VideoFragment videofragment, String s1)
    {
        videofragment.I = s1;
        return s1;
    }

    private static void a(View view, int i1, int j1)
    {
        float f2 = com.nineoldandroids.view.a.a(view);
        i1 *= 1000;
        float f1 = 0.0F;
        int k1 = i1 - 750;
        if (j1 > k1)
        {
            if (j1 >= i1)
            {
                f1 = 1.0F;
            } else
            {
                f1 = (float)(j1 - k1) / (float)(i1 - k1);
            }
        }
        if (f1 != f2)
        {
            com.nineoldandroids.view.a.a(view, f1);
        }
    }

    private void a(k k1, int i1)
    {
        a(k1, 0x44000000, 0, i1, 0.0F);
    }

    private void a(k k1, int i1, int j1, int l1, float f1)
    {
        Logger.v("VungleAd", (new StringBuilder("animateBar startColor: ")).append(i1).append(", endColor: ").append(j1).append(", durationMillis: ").append(l1).append(", startPercent: ").append(f1).toString());
        k1.c(l1);
        k1.a(new int[] {
            i1, j1
        });
        k1.e(Math.round((float)l1 * f1));
        k1.a(D);
        k1.a();
    }

    static boolean a(VideoFragment videofragment)
    {
        return videofragment.K;
    }

    static boolean a(VideoFragment videofragment, boolean flag)
    {
        videofragment.M = flag;
        return flag;
    }

    static void b(VideoFragment videofragment)
    {
        videofragment.f(false);
    }

    private void c()
    {
        E.removeCallbacks(F);
    }

    static void c(VideoFragment videofragment)
    {
        videofragment.g();
    }

    static VideoView d(VideoFragment videofragment)
    {
        return videofragment.z;
    }

    private void d()
    {
        boolean flag1 = true;
        boolean flag;
        if (!M)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        M = true;
        if (G == null || !G.isShowing())
        {
            flag1 = false;
        }
        if (!flag1)
        {
            c(z.getCurrentPosition());
            z.requestFocus();
            z.start();
            b(2000);
            E.post(F);
            if (flag)
            {
                k.a(new ah());
                return;
            }
        }
    }

    private void d(boolean flag)
    {
        Object obj;
        Object obj1;
        if (flag && I != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj1 = new StringBuilder("cta button ");
        if (flag)
        {
            obj = "enabled";
        } else
        {
            obj = "disabled";
        }
        Logger.v("VungleAd", ((StringBuilder) (obj1)).append(((String) (obj))).toString());
        K = flag;
        obj1 = c;
        if (flag)
        {
            obj = B;
        } else
        {
            obj = C;
        }
        ((ImageView) (obj1)).setImageBitmap(((Bitmap) (obj)));
    }

    static AtomicBoolean e(VideoFragment videofragment)
    {
        return videofragment.N;
    }

    private void e()
    {
        z.pause();
        c();
    }

    private void e(boolean flag)
    {
        if (flag != K)
        {
            d(flag);
        }
    }

    static ProgressBar f(VideoFragment videofragment)
    {
        return videofragment.w;
    }

    private void f(boolean flag)
    {
        if (!flag) goto _L2; else goto _L1
_L1:
        boolean flag1;
        if (f() || a.isBackButtonImmediatelyEnabled())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (!flag1) goto _L4; else goto _L3
_L3:
        if (!N.compareAndSet(false, true)) goto _L4; else goto _L5
_L5:
        Logger.d("VungleAd", "exiting video");
        if (!a.isIncentivized()) goto _L7; else goto _L6
_L6:
        z.pause();
        Object obj;
        if (G != null)
        {
            obj = G;
        } else
        {
            obj = h;
            Object obj1 = getActivity();
            com.vungle.publisher.a a1 = a;
            _cls4 _lcls4 = new _cls4();
            obj1 = new android.app.AlertDialog.Builder(new ContextThemeWrapper(((Context) (obj1)), ((Context) (obj1)).getApplicationInfo().theme));
            ((android.app.AlertDialog.Builder) (obj1)).setTitle(a1.getIncentivizedCancelDialogTitle());
            ((android.app.AlertDialog.Builder) (obj1)).setMessage(a1.getIncentivizedCancelDialogBodyText());
            ((android.app.AlertDialog.Builder) (obj1)).setPositiveButton(a1.getIncentivizedCancelDialogKeepWatchingButtonText(), new AlertDialogFactory._cls1(((AlertDialogFactory) (obj)), _lcls4));
            ((android.app.AlertDialog.Builder) (obj1)).setNegativeButton(a1.getIncentivizedCancelDialogCloseButtonText(), new AlertDialogFactory._cls2(((AlertDialogFactory) (obj)), _lcls4));
            ((android.app.AlertDialog.Builder) (obj1)).setOnCancelListener(new AlertDialogFactory._cls3(((AlertDialogFactory) (obj)), _lcls4));
            obj = ((android.app.AlertDialog.Builder) (obj1)).create();
        }
        G = ((AlertDialog) (obj));
        ((AlertDialog) (obj)).show();
_L4:
        return;
_L2:
        if (!f()) goto _L4; else goto _L3
_L7:
        v.setOnClickListener(null);
        g();
        return;
    }

    private boolean f()
    {
        return com.nineoldandroids.view.a.a(v) == 1.0F;
    }

    static Handler g(VideoFragment videofragment)
    {
        return videofragment.E;
    }

    private void g()
    {
        b(false);
        z.stopPlayback();
        k.a(new al());
    }

    static MuteButton h(VideoFragment videofragment)
    {
        return videofragment.x;
    }

    public final void a()
    {
        Logger.v("VungleAd", "back button pressed");
        f(true);
    }

    final void a(k k1, float f1)
    {
        a(k1, 0, 0x44000000, 749, f1);
    }

    public final void a(boolean flag)
    {
        super.a(flag);
        if (flag)
        {
            try
            {
                d();
                return;
            }
            catch (Exception exception)
            {
                p.a("VungleAd", "exception in onWindowFocusChanged", exception);
            }
            break MISSING_BLOCK_LABEL_33;
        }
        e();
        return;
    }

    public final boolean a(int i1)
    {
        if (i1 == 24 && u.b() == 0)
        {
            Logger.d("VungleAd", "volume up - unmuting");
            u.a(true);
        }
        return false;
    }

    public final String b()
    {
        return "videoFragment";
    }

    final void b(int i1)
    {
        a(d, i1);
        a(g, i1);
    }

    final void b(boolean flag)
    {
        c();
        int i1 = c(flag);
        EventBus eventbus = k;
        Object obj;
        if (flag)
        {
            obj = new com.vungle.publisher.k(i1);
        } else
        {
            obj = new p(i1);
        }
        eventbus.a(obj);
        M = false;
        O = 0;
        N.set(false);
    }

    final int c(boolean flag)
    {
        int i1;
        int j1;
        if (flag)
        {
            i1 = z.getDuration();
        } else
        {
            i1 = z.getCurrentPosition();
        }
        j1 = O;
        if (i1 > j1)
        {
            O = i1;
            return i1;
        }
        if (i1 < j1)
        {
            Logger.w("VungleAd", (new StringBuilder("watched millis decreased from ")).append(j1).append(" --> ").append(i1).toString());
        }
        return j1;
    }

    final void c(int i1)
    {
        boolean flag2 = true;
        boolean flag = true;
        Integer integer;
        if (Boolean.TRUE.equals(b.h))
        {
            if (Boolean.TRUE.equals(b.i))
            {
                if (com.nineoldandroids.view.a.a(c) < 1.0F)
                {
                    flag = false;
                }
                e(flag);
            } else
            {
                a(c, L, i1);
                boolean flag1;
                if (i1 >= J * 1000)
                {
                    flag1 = flag2;
                } else
                {
                    flag1 = false;
                }
                e(flag1);
            }
        }
        if (a.isIncentivized())
        {
            integer = b.k;
        } else
        {
            integer = b.l;
        }
        if (integer != null)
        {
            a(v, integer.intValue(), i1);
        }
    }

    public void onActivityCreated(Bundle bundle)
    {
        Object obj;
    /* block-local class not found */
    class a {}

        Object obj1;
        VideoView videoview;
        bq bq1;
        int j1;
        try
        {
            super.onActivityCreated(bundle);
            com.vungle.publisher.display.view.Factory.a(this, bundle);
            if (M)
            {
                k.a(new an());
            }
            obj = getActivity();
            bundle = t;
            com.vungle.publisher.display.view.VideoEventListener.a(((VideoEventListener.Factory) (bundle)).a, this);
            H = ((VideoEventListener.Factory) (bundle)).a;
            videoview = new VideoView(((Context) (obj)));
            z = videoview;
            bq1 = new bq(((Context) (obj)));
            v = bq1;
            obj1 = o;
            boolean flag = a.isSoundEnabled();
            bundle = new MuteButton(((MuteButton.Factory) (obj1)).a, (byte)0);
            com.vungle.publisher.display.view.MuteButton.a(bundle, ((MuteButton.Factory) (obj1)).b.a("vg_mute_on.png"));
            MuteButton.b(bundle, ((MuteButton.Factory) (obj1)).b.a("vg_mute_off.png"));
            com.vungle.publisher.display.view.MuteButton.a(bundle, ((MuteButton.Factory) (obj1)).c);
            com.vungle.publisher.display.view.MuteButton.a(bundle, flag);
            com.vungle.publisher.display.view.MuteButton.a(bundle, ((MuteButton.Factory) (obj1)).d);
            bundle.setOnClickListener(new MuteButton.Factory._cls1(((MuteButton.Factory) (obj1)), bundle));
            x = bundle;
            obj1 = m;
            Object obj3 = new PrivacyButton(((Context) (obj)));
            ((PrivacyButton) (obj3)).setGravity(16);
            Object obj4 = new bq(((Context) (obj)));
            ViewUtils.a(((ImageView) (obj4)), ((PrivacyButton.Factory) (obj1)).a.a("vg_privacy.png"));
            Object obj5 = new TextView(((Context) (obj)));
            ((TextView) (obj5)).setText("privacy");
            ((TextView) (obj5)).setTextSize(16F);
            ((TextView) (obj5)).setTextColor(-1);
            ((TextView) (obj5)).setVisibility(8);
            ((TextView) (obj5)).setPadding(10, 0, 10, 0);
            ((PrivacyButton) (obj3)).addView(((View) (obj5)));
            ((PrivacyButton) (obj3)).addView(((View) (obj4)));
            com.vungle.publisher.display.view.PrivacyButton.a(((PrivacyButton) (obj3)), ((PrivacyButton.Factory) (obj1)).b);
            com.vungle.publisher.display.view.PrivacyButton.a(((PrivacyButton) (obj3)), ((TextView) (obj5)));
            obj1 = n;
            obj4 = new ProgressBar(((ProgressBar.Factory) (obj1)).a, (byte)0);
            com.vungle.publisher.display.view.ProgressBar.a(((ProgressBar) (obj4)));
            com.vungle.publisher.display.view.ProgressBar.a(((ProgressBar) (obj4)), (int)((ProgressBar.Factory) (obj1)).b.a(2));
            w = ((ProgressBar) (obj4));
            A.addView(videoview);
            obj1 = (android.widget.RelativeLayout.LayoutParams)videoview.getLayoutParams();
            obj1.height = -1;
            obj1.width = -1;
            ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(13);
            obj1 = new RelativeLayout(((Context) (obj)));
            A.addView(((View) (obj1)));
            obj5 = (android.widget.RelativeLayout.LayoutParams)((ViewGroup) (obj1)).getLayoutParams();
            obj5.width = -1;
            ((android.widget.RelativeLayout.LayoutParams) (obj5)).addRule(10);
            ((ViewGroup) (obj1)).addView(bq1);
            obj5 = (android.widget.RelativeLayout.LayoutParams)bq1.getLayoutParams();
            ((android.widget.RelativeLayout.LayoutParams) (obj5)).addRule(9);
            ((android.widget.RelativeLayout.LayoutParams) (obj5)).addRule(15);
            com.nineoldandroids.view.a.a(bq1, 0.0F);
            ((ViewGroup) (obj1)).addView(((View) (obj3)));
            obj3 = (android.widget.RelativeLayout.LayoutParams)((PrivacyButton) (obj3)).getLayoutParams();
            ((android.widget.RelativeLayout.LayoutParams) (obj3)).addRule(11);
            ((android.widget.RelativeLayout.LayoutParams) (obj3)).addRule(15);
            obj3 = new android.widget.RelativeLayout.LayoutParams(-1, ((ProgressBar) (obj4)).getScreenHeight());
            ((android.widget.RelativeLayout.LayoutParams) (obj3)).addRule(12);
            A.addView(((View) (obj4)), ((android.view.ViewGroup.LayoutParams) (obj3)));
            obj = new RelativeLayout(((Context) (obj)));
            y = ((RelativeLayout) (obj));
            A.addView(((View) (obj)));
            obj3 = (android.widget.RelativeLayout.LayoutParams)((RelativeLayout) (obj)).getLayoutParams();
            obj3.width = -1;
            ((android.widget.RelativeLayout.LayoutParams) (obj3)).addRule(2, 1);
            ((RelativeLayout) (obj)).addView(bundle);
            bundle = (android.widget.RelativeLayout.LayoutParams)bundle.getLayoutParams();
            bundle.addRule(11);
            bundle.addRule(15);
            int i1 = Math.round(j.a(2));
            int k1 = Math.round(j.a(1));
            ((ViewGroup) (obj1)).setPadding(i1, k1, i1, k1);
            ((RelativeLayout) (obj)).setPadding(i1, k1, i1, k1);
            v.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
            x.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
            bundle = a("vg_close.png");
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            Logger.e("VungleAd", "exception in onActivityCreated", bundle);
            return;
        }
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_696;
        }
        bq1.setImageBitmap(bundle);
        Logger.i("VungleAd", (new StringBuilder("video play URI = ")).append(b.i()).toString());
        videoview.setVideoURI(b.i());
        d = a(((View) (obj)));
        g = a(((View) (obj1)));
        if (!Boolean.TRUE.equals(b.h)) goto _L2; else goto _L1
_L1:
        B = a("vg_cta.png");
        C = a("vg_cta_disabled.png");
        bundle = b.f;
        obj = b.j;
        if (bundle != null) goto _L4; else goto _L3
_L3:
        if (obj == null) goto _L6; else goto _L5
_L5:
        Logger.v("VungleAd", (new StringBuilder("overriding cta enabled from null to ")).append(obj).toString());
        bundle = ((Bundle) (obj));
_L22:
        Logger.d("VungleAd", (new StringBuilder("cta shown at ")).append(bundle).append(" seconds; enabled at ").append(obj).append(" seconds").toString());
        if (obj != null) goto _L8; else goto _L7
_L7:
        j1 = 0;
_L17:
        J = j1;
        if (bundle != null) goto _L10; else goto _L9
_L9:
        j1 = 0;
_L18:
        L = j1;
        bundle = new bq(getActivity());
        c = bundle;
        y.addView(bundle);
        obj = (android.widget.RelativeLayout.LayoutParams)bundle.getLayoutParams();
        ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(9);
        ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(15);
        bundle.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        obj = b.e;
        if (obj == null) goto _L12; else goto _L11
_L11:
        if (((Float) (obj)).floatValue() > 1.0F) goto _L13; else goto _L12
_L12:
        Logger.v("VungleAd", "cta clickable area not scaled");
_L19:
        if (!Boolean.TRUE.equals(b.i)) goto _L15; else goto _L14
_L14:
        com.nineoldandroids.view.a.a(bundle, 0.0F);
        bundle.setImageBitmap(B);
        e = com.nineoldandroids.a.k.a(bundle, "alpha", new float[] {
            0.0F, 1.0F
        });
        e.c(750L);
_L20:
        bundle.setOnClickListener(new _cls3(bundle));
_L2:
        bq1.setOnClickListener(new a());
        videoview.setOnTouchListener(new _cls1());
        videoview.setOnCompletionListener(this);
        videoview.setOnErrorListener(this);
        videoview.setOnPreparedListener(this);
        return;
_L4:
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_1134;
        }
        Logger.v("VungleAd", (new StringBuilder("overriding cta shown from null to ")).append(bundle).toString());
        obj = bundle;
        continue; /* Loop/switch isn't completed */
        if (((Integer) (obj)).intValue() <= bundle.intValue()) goto _L6; else goto _L16
_L16:
        Logger.v("VungleAd", (new StringBuilder("overriding cta shown from ")).append(obj).append(" to ").append(bundle).toString());
        obj = bundle;
        continue; /* Loop/switch isn't completed */
_L8:
        j1 = ((Integer) (obj)).intValue();
          goto _L17
_L10:
        j1 = bundle.intValue();
          goto _L18
_L13:
        bundle.post(new _cls2(((Float) (obj)), bundle));
          goto _L19
_L15:
        boolean flag1;
        if (L >= J)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        d(flag1);
          goto _L20
_L6:
        Object obj2 = obj;
        obj = bundle;
        bundle = ((Bundle) (obj2));
        if (true) goto _L22; else goto _L21
_L21:
    }

    public void onCompletion(MediaPlayer mediaplayer)
    {
        Logger.d("VungleAd", "video.onCompletion");
        b(true);
        k.a(new am());
    }

    public void onCreate(Bundle bundle)
    {
        try
        {
            super.onCreate(bundle);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            Logger.e("VungleAd", "exception in onCreate", bundle);
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = new RelativeLayout(getActivity());
        A = layoutinflater;
        return layoutinflater;
    }

    public boolean onError(MediaPlayer mediaplayer, int i1, int j1)
    {
        Logger.e("VungleAd", (new StringBuilder("video.onError: ")).append(i1).append(", ").append(j1).toString());
        b(false);
        k.a(new am());
        return true;
    }

    public void onPause()
    {
        Logger.d("VungleAd", "video onPause");
        try
        {
            super.onPause();
            e();
            VolumeChangeContentObserver volumechangecontentobserver = s;
            volumechangecontentobserver.f.getContentResolver().unregisterContentObserver(volumechangecontentobserver);
            H.unregister();
            u.a(true);
            if (M)
            {
                k.a(new ad(z.getCurrentPosition()));
            }
            return;
        }
        catch (Exception exception)
        {
            p.a("VungleAd", "error in VideoFragment.onPause()", exception);
        }
        c();
    }

    public void onPrepared(MediaPlayer mediaplayer)
    {
        int i1 = mediaplayer.getDuration();
        Logger.d("VungleAd", (new StringBuilder("video ready: duration ")).append(i1).append(" ms").toString());
        w.setMaxTimeMillis(i1);
        k.a(new o(i1));
        if (!q.a(getActivity()))
        {
            d();
        }
    }

    public void onResume()
    {
        boolean flag = true;
        Object obj;
        StringBuilder stringbuilder;
        super.onResume();
        Logger.d("VungleAd", "video onResume");
        O = 0;
        obj = x;
        stringbuilder = new StringBuilder("refresh mute state. is muted? ");
        if (((MuteButton) (obj)).a)
        {
            flag = false;
        }
        Logger.d("VungleAd", stringbuilder.append(flag).toString());
        ((MuteButton) (obj)).setSoundEnabled(((MuteButton) (obj)).a);
        ((MuteButton) (obj)).c.a(new ap(((MuteButton) (obj)).b.c()));
        obj = s;
        if (!((VolumeChangeContentObserver) (obj)).b)
        {
            obj.a = ((VolumeChangeContentObserver) (obj)).c.b();
            obj.b = true;
        }
        ((VolumeChangeContentObserver) (obj)).f.getContentResolver().registerContentObserver(android.provider.Settings.System.CONTENT_URI, true, ((android.database.ContentObserver) (obj)));
        H.register();
        return;
        Exception exception;
        exception;
        p.a("VungleAd", "error resuming VideoFragment", exception);
        c();
        return;
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        try
        {
            super.onSaveInstanceState(bundle);
            bundle.putString("adId", b.d());
            bundle.putParcelable("adConfig", (Parcelable)a);
            bundle.putBoolean("adStarted", M);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            p.a("VungleAd", "exception in onSaveInstanceState", bundle);
        }
    }

    /* member class not found */
    class _cls4 {}


    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}

}
