// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity.dynamicupsell;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.mobile.android.ui.activity.upsell.CheckOptInTrialEligibilityTask;
import com.spotify.mobile.android.ui.activity.upsell.Reason;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.ClientInfo;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import com.squareup.picasso.Picasso;
import ctz;
import dfz;
import dmz;
import faj;
import fop;
import fou;
import fqa;
import fqe;
import fqf;
import fqg;
import fqh;
import fsr;
import fyw;
import gcz;
import gft;
import gwa;
import gwb;
import gwi;
import java.lang.ref.WeakReference;

public class DynamicUpsellDialogActivity extends fou
{

    private ImageView d;
    private ImageView i;
    private TextView j;
    private Button k;
    private Button l;
    private TextView m;
    private TextView n;
    private FrameLayout o;
    private int p;
    private int q;
    private Handler r;
    private fqf s;
    private final fqh t = new fqh() {

        private DynamicUpsellDialogActivity a;

        private void a(Button button, boolean flag)
        {
            boolean flag2 = true;
            boolean flag1 = false;
            double d1;
            int i1;
            byte byte0;
            int j1;
            if (flag)
            {
                i1 = 0;
            } else
            {
                i1 = 8;
            }
            button.setVisibility(i1);
            if (DynamicUpsellDialogActivity.e(a).getVisibility() == 0)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            j1 = a.getResources().getDimensionPixelSize(0x7f0c0090);
            if (i1 != 0)
            {
                d1 = 0.625D;
            } else
            {
                d1 = 0.125D;
            }
            ((android.view.ViewGroup.MarginLayoutParams)DynamicUpsellDialogActivity.l(a).getLayoutParams()).bottomMargin = (int)Math.ceil(d1 * (double)j1);
            if (i1 != 0)
            {
                byte0 = 2;
            } else
            {
                byte0 = 4;
            }
            j1 /= byte0;
            button = (android.view.ViewGroup.MarginLayoutParams)DynamicUpsellDialogActivity.d(a).getLayoutParams();
            byte0 = flag2;
            if (i1 != 0)
            {
                byte0 = -1;
            }
            button.topMargin = byte0 * j1;
            if (i1 != 0)
            {
                i1 = ((flag1) ? 1 : 0);
            } else
            {
                i1 = j1;
            }
            button.bottomMargin = i1;
            if (DynamicUpsellDialogActivity.e(a).getVisibility() == 0)
            {
                DynamicUpsellDialogActivity.d(a).setOnClickListener(DynamicUpsellDialogActivity.m(a));
                DynamicUpsellDialogActivity.e(a).setOnClickListener(DynamicUpsellDialogActivity.n(a));
                return;
            } else
            {
                DynamicUpsellDialogActivity.d(a).setOnClickListener(DynamicUpsellDialogActivity.n(a));
                return;
            }
        }

        private static void a(TextView textview, TextView textview1)
        {
            fsr.a(textview, textview1, "use-text-shrinking", true);
        }

        private void c(boolean flag)
        {
            int j1 = DynamicUpsellDialogActivity.g(a).getVisibility();
            int i1;
            if (flag)
            {
                i1 = 0;
            } else
            {
                i1 = 8;
            }
            if (j1 == i1)
            {
                return;
            }
            int k1 = a.getResources().getDimensionPixelSize(0x7f0c0165);
            android.view.ViewGroup.LayoutParams layoutparams;
            if (flag)
            {
                j1 = 1;
            } else
            {
                j1 = -1;
            }
            layoutparams = DynamicUpsellDialogActivity.h(a).getLayoutParams();
            layoutparams.height = j1 * k1 + layoutparams.height;
            DynamicUpsellDialogActivity.g(a).setVisibility(i1);
        }

        public final void a()
        {
            a(DynamicUpsellDialogActivity.d(a), true);
        }

        public final void a(faj faj1)
        {
            faj1 = faj1.a(a);
            DynamicUpsellDialogActivity.d(a).setText(faj1);
            a(((TextView) (DynamicUpsellDialogActivity.d(a))), ((TextView) (DynamicUpsellDialogActivity.e(a))));
        }

        public final void a(String s1)
        {
            DynamicUpsellDialogActivity.f(a).setText(s1);
        }

        public final void a(String s1, int i1)
        {
            String s2 = s1;
            if (TextUtils.isEmpty(s1))
            {
                s2 = null;
            }
            s1 = new dfz(a, SpotifyIcon.bt);
            if (i1 != -1 && s2 != null)
            {
                ((gft)dmz.a(gft)).a().a(s2).b(s1).a(DynamicUpsellDialogActivity.g(a), null);
            } else
            {
                DynamicUpsellDialogActivity.g(a).setImageDrawable(s1);
            }
            c(true);
        }

        public final void a(boolean flag)
        {
            a(DynamicUpsellDialogActivity.e(a), flag);
        }

        public final void b()
        {
            c(false);
        }

        public final void b(faj faj1)
        {
            faj1 = faj1.a(a);
            DynamicUpsellDialogActivity.e(a).setText(faj1);
            a(DynamicUpsellDialogActivity.d(a), DynamicUpsellDialogActivity.e(a));
        }

        public final void b(String s1, int i1)
        {
            Object obj = s1;
            if (TextUtils.isEmpty(s1))
            {
                obj = null;
            }
            if (i1 != -1 && obj != null)
            {
                s1 = ((gft)dmz.a(gft)).a();
                DynamicUpsellDialogActivity.h(a).setBackgroundColor(i1);
                s1 = s1.a(((String) (obj)));
                obj = com.squareup.picasso.Picasso.Priority.c;
                ((gwb) (s1)).a.a(((com.squareup.picasso.Picasso.Priority) (obj)));
                s1.b(0, DynamicUpsellDialogActivity.j(a)).a(DynamicUpsellDialogActivity.i(a));
                return;
            } else
            {
                DynamicUpsellDialogActivity.a(a).setImageResource(0x7f020278);
                return;
            }
        }

        public final void b(boolean flag)
        {
            int i1;
            if (flag)
            {
                i1 = 0;
            } else
            {
                i1 = 8;
            }
            DynamicUpsellDialogActivity.f(a).setVisibility(i1);
        }

        public final void c(faj faj1)
        {
            faj1 = faj1.a(a);
            DynamicUpsellDialogActivity.k(a).setText(faj1);
        }

        public final void d(faj faj1)
        {
            faj1 = faj1.a(a);
            DynamicUpsellDialogActivity.l(a).setText(faj1);
        }

            
            {
                a = DynamicUpsellDialogActivity.this;
                super();
            }
    };
    private Runnable u;
    private gwi v;
    private Flags w;
    private final android.view.View.OnClickListener x = new android.view.View.OnClickListener() {

        private DynamicUpsellDialogActivity a;

        public final void onClick(View view)
        {
            if (DynamicUpsellDialogActivity.o(a) == null) goto _L2; else goto _L1
_L1:
            Object obj;
            obj = DynamicUpsellDialogActivity.o(a);
            view = ((fqf) (obj)).d;
            obj = ((fqf) (obj)).b;
            ((fqe) (view)).a.b(((DynamicUpsellConfig.AdSlotConfiguration) (obj)));
            if (((DynamicUpsellConfig.AdSlotConfiguration) (obj)).mActionButton == null) goto _L4; else goto _L3
_L3:
            fqe._cls1.a[((DynamicUpsellConfig.AdSlotConfiguration) (obj)).mActionButton.mType.ordinal()];
            JVM INSTR tableswitch 1 4: default 88
        //                       1 155
        //                       2 273
        //                       3 142
        //                       4 220;
               goto _L4 _L5 _L6 _L7 _L8
_L4:
            ClientEvent clientevent = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.O);
            obj = Reason.a(((DynamicUpsellConfig.AdSlotConfiguration) (obj)).mReason).mSubView;
            dmz.a(fop);
            fop.a((Context)((fqe) (view)).b.get(), ViewUri.aU, ((com.spotify.mobile.android.util.viewuri.ViewUri.SubView) (obj)), clientevent);
_L2:
            a.finish();
            return;
_L7:
            ((fqe) (view)).a.c(((DynamicUpsellConfig.AdSlotConfiguration) (obj)));
            continue; /* Loop/switch isn't completed */
_L5:
            Object obj1 = ((DynamicUpsellConfig.AdSlotConfiguration) (obj)).mActionButton.mUrl;
            Context context = (Context)((fqe) (view)).b.get();
            if (context != null && !TextUtils.isEmpty(((CharSequence) (obj1))))
            {
                obj1 = Uri.parse(((String) (obj1)));
                dmz.a(fop);
                fop.a(context, ((Uri) (obj1)), ViewUri.aU, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.a, null, ((fqe) (view)).c);
            }
            continue; /* Loop/switch isn't completed */
_L8:
            String s1 = ((DynamicUpsellConfig.AdSlotConfiguration) (obj)).mActionButton.mUrl;
            Context context2 = (Context)((fqe) (view)).b.get();
            if (context2 != null && !TextUtils.isEmpty(s1))
            {
                context2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(s1)));
            }
            continue; /* Loop/switch isn't completed */
_L6:
            Context context1 = (Context)((fqe) (view)).b.get();
            if (context1 != null)
            {
                dmz.a(fop);
                fop.a(context1, ViewUri.aU, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.a);
            }
            if (true) goto _L4; else goto _L9
_L9:
        }

            
            {
                a = DynamicUpsellDialogActivity.this;
                super();
            }
    };
    private final android.view.View.OnClickListener y = new android.view.View.OnClickListener() {

        private DynamicUpsellDialogActivity a;

        public final void onClick(View view)
        {
            if (DynamicUpsellDialogActivity.o(a) != null)
            {
                DynamicUpsellDialogActivity.o(a).a();
            }
            a.finish();
        }

            
            {
                a = DynamicUpsellDialogActivity.this;
                super();
            }
    };

    public DynamicUpsellDialogActivity()
    {
        u = new Runnable() {

            private DynamicUpsellDialogActivity a;

            public final void run()
            {
                ObjectAnimator.ofFloat(DynamicUpsellDialogActivity.a(a), View.ALPHA, new float[] {
                    0.0F, 1.0F
                }).setDuration(500L).start();
            }

            
            {
                a = DynamicUpsellDialogActivity.this;
                super();
            }
        };
        v = new gwi() {

            private DynamicUpsellDialogActivity a;

            public final void a(Bitmap bitmap, com.squareup.picasso.Picasso.LoadedFrom loadedfrom)
            {
                DynamicUpsellDialogActivity.a(a).setAlpha(0.0F);
                DynamicUpsellDialogActivity.a(a).setImageBitmap(bitmap);
                DynamicUpsellDialogActivity.c(a).post(DynamicUpsellDialogActivity.b(a));
            }

            public final void a(Drawable drawable)
            {
            }

            public final void b(Drawable drawable)
            {
            }

            
            {
                a = DynamicUpsellDialogActivity.this;
                super();
            }
        };
    }

    public static Intent a(Context context, Reason reason, DynamicUpsellConfig.AdSlotConfiguration adslotconfiguration, Flags flags)
    {
        ctz.a(context);
        context = new Intent(context, com/spotify/mobile/android/ui/activity/dynamicupsell/DynamicUpsellDialogActivity);
        context.putExtra("type", reason);
        context.putExtra("com.spotify.mobile.android.ui.activity.dynamicupsell.DynamicUpsellDialogActivity.config", adslotconfiguration);
        fyw.a(context, flags);
        return context;
    }

    static ImageView a(DynamicUpsellDialogActivity dynamicupselldialogactivity)
    {
        return dynamicupselldialogactivity.i;
    }

    static Runnable b(DynamicUpsellDialogActivity dynamicupselldialogactivity)
    {
        return dynamicupselldialogactivity.u;
    }

    static Handler c(DynamicUpsellDialogActivity dynamicupselldialogactivity)
    {
        return dynamicupselldialogactivity.r;
    }

    static Button d(DynamicUpsellDialogActivity dynamicupselldialogactivity)
    {
        return dynamicupselldialogactivity.k;
    }

    static Button e(DynamicUpsellDialogActivity dynamicupselldialogactivity)
    {
        return dynamicupselldialogactivity.l;
    }

    static TextView f(DynamicUpsellDialogActivity dynamicupselldialogactivity)
    {
        return dynamicupselldialogactivity.m;
    }

    static ImageView g(DynamicUpsellDialogActivity dynamicupselldialogactivity)
    {
        return dynamicupselldialogactivity.d;
    }

    static FrameLayout h(DynamicUpsellDialogActivity dynamicupselldialogactivity)
    {
        return dynamicupselldialogactivity.o;
    }

    static gwi i(DynamicUpsellDialogActivity dynamicupselldialogactivity)
    {
        return dynamicupselldialogactivity.v;
    }

    static int j(DynamicUpsellDialogActivity dynamicupselldialogactivity)
    {
        return dynamicupselldialogactivity.p;
    }

    static TextView k(DynamicUpsellDialogActivity dynamicupselldialogactivity)
    {
        return dynamicupselldialogactivity.j;
    }

    static TextView l(DynamicUpsellDialogActivity dynamicupselldialogactivity)
    {
        return dynamicupselldialogactivity.n;
    }

    static android.view.View.OnClickListener m(DynamicUpsellDialogActivity dynamicupselldialogactivity)
    {
        return dynamicupselldialogactivity.x;
    }

    static android.view.View.OnClickListener n(DynamicUpsellDialogActivity dynamicupselldialogactivity)
    {
        return dynamicupselldialogactivity.y;
    }

    static fqf o(DynamicUpsellDialogActivity dynamicupselldialogactivity)
    {
        return dynamicupselldialogactivity.s;
    }

    public void onBackPressed()
    {
        if (s != null)
        {
            s.a();
        }
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle)
    {
        Object obj;
        Object obj1;
        boolean flag;
        super.onCreate(bundle);
        setResult(0);
        w = fyw.a(this);
        obj = (Reason)getIntent().getSerializableExtra("type");
        Assertion.b(Reason.b, obj);
        obj = (DynamicUpsellConfig.AdSlotConfiguration)getIntent().getParcelableExtra("com.spotify.mobile.android.ui.activity.dynamicupsell.DynamicUpsellDialogActivity.config");
        ctz.a(obj);
        p = (int)TypedValue.applyDimension(1, 320F, getResources().getDisplayMetrics());
        q = (int)TypedValue.applyDimension(1, 340F, getResources().getDisplayMetrics());
        r = new Handler();
        setContentView(0x7f030020);
        d = (ImageView)findViewById(0x7f11026d);
        i = (ImageView)findViewById(0x7f1102ac);
        j = (TextView)findViewById(0x7f11026e);
        k = (Button)findViewById(0x7f1102ae);
        l = (Button)findViewById(0x7f1102af);
        m = (TextView)findViewById(0x7f1102ad);
        n = (TextView)findViewById(0x7f1100b4);
        o = (FrameLayout)findViewById(0x7f1102ab);
        obj1 = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(((DisplayMetrics) (obj1)));
        if (((DisplayMetrics) (obj1)).widthPixels < q)
        {
            o.getLayoutParams().width = ((DisplayMetrics) (obj1)).widthPixels;
        }
        int i1 = getResources().getDimensionPixelSize(0x7f0c0163);
        s = new fqf(new fqe(this, w), t, ((DynamicUpsellConfig.AdSlotConfiguration) (obj)), i1);
        obj1 = s;
        ((fqf) (obj1)).a.b(((fqf) (obj1)).b.mBackgroundImage, ((fqf) (obj1)).b.mBackgroundProminentColor);
        String s1;
        if (TextUtils.isEmpty(((fqf) (obj1)).b.mHeading))
        {
            ((fqf) (obj1)).a.b(false);
        } else
        {
            ((fqf) (obj1)).a.a(((fqf) (obj1)).b.mHeading);
            ((fqf) (obj1)).a.b(true);
        }
        if (((gcz)dmz.a(gcz)).c() >= ((fqf) (obj1)).c)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            ((fqf) (obj1)).a.a(((fqf) (obj1)).b.mIcon, ((fqf) (obj1)).b.mBackgroundProminentColor);
        } else
        {
            ((fqf) (obj1)).a.b();
        }
        obj = new fqg(((fqf) (obj1)).b.mTitle, 0x7f0805c3);
        ((fqf) (obj1)).a.c(((faj) (obj)));
        obj = new fqg(((fqf) (obj1)).b.mMessage, 0x7f0805c2);
        ((fqf) (obj1)).a.d(((faj) (obj)));
        obj = ((fqf) (obj1)).b.mActionButton;
        s1 = ((fqf) (obj1)).b.mCloseTitle;
        if (((fqf) (obj1)).b.mType == DynamicUpsellConfig.AdSlotConfiguration.Type.PREVIEW || obj == null || ((DynamicUpsellConfig.AdSlotConfiguration.ActionButton) (obj)).mType == null) goto _L2; else goto _L1
_L1:
        fqe._cls1.a[((DynamicUpsellConfig.AdSlotConfiguration.ActionButton) (obj)).mType.ordinal()];
        JVM INSTR tableswitch 1 2: default 532
    //                   1 718
    //                   2 739;
           goto _L2 _L3 _L4
_L2:
        flag = true;
_L6:
        fqg fqg1 = new fqg(s1, 0x7f0805b5);
        if (!flag)
        {
            ((fqf) (obj1)).a.a(fqg1);
            ((fqf) (obj1)).a.a();
            ((fqf) (obj1)).a.a(false);
        } else
        {
            if (obj == null)
            {
                obj = null;
            } else
            {
                obj = ((DynamicUpsellConfig.AdSlotConfiguration.ActionButton) (obj)).mTitle;
            }
            obj = new fqg(((String) (obj)), 0x7f0805b4);
            ((fqf) (obj1)).a.a(((faj) (obj)));
            ((fqf) (obj1)).a.b(fqg1);
            ((fqf) (obj1)).a.a();
            ((fqf) (obj1)).a.a(true);
        }
        if (bundle == null)
        {
            obj = s;
            bundle = ((fqf) (obj)).d;
            obj1 = ((fqf) (obj)).b;
            if (((DynamicUpsellConfig.AdSlotConfiguration) (obj1)).mType != DynamicUpsellConfig.AdSlotConfiguration.Type.PREVIEW)
            {
                ((fqe) (bundle)).a.a(((DynamicUpsellConfig.AdSlotConfiguration) (obj1)));
            }
            obj = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.R);
            obj1 = Reason.a(((DynamicUpsellConfig.AdSlotConfiguration) (obj1)).mReason).mSubView;
            dmz.a(fop);
            fop.a((Context)((fqe) (bundle)).b.get(), ViewUri.aU, ((com.spotify.mobile.android.util.viewuri.ViewUri.SubView) (obj1)), ((ClientEvent) (obj)));
        }
        return;
_L3:
        if (((ClientInfo)dmz.a(com/spotify/mobile/android/util/ClientInfo)).a()) goto _L2; else goto _L5
_L5:
        flag = false;
          goto _L6
_L4:
        if (CheckOptInTrialEligibilityTask.a() == com.spotify.mobile.android.ui.activity.upsell.CheckOptInTrialEligibilityTask.State.b) goto _L2; else goto _L7
_L7:
        flag = false;
          goto _L6
    }

    protected void onDestroy()
    {
        super.onDestroy();
        if (s != null)
        {
            s.d.a.a();
        }
        ((gft)dmz.a(gft)).a().a(v);
        r.removeCallbacks(u);
    }
}
