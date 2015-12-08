// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.g;
import com.facebook.ads.internal.view.f;
import com.facebook.ads.internal.view.h;
import com.facebook.ads.internal.view.m;

public class InterstitialAdActivity extends Activity
{
    public static final class Type extends Enum
    {

        public static final Type DISPLAY;
        public static final Type VIDEO;
        private static final Type a[];

        public static Type valueOf(String s)
        {
            return (Type)Enum.valueOf(com/facebook/ads/InterstitialAdActivity$Type, s);
        }

        public static Type[] values()
        {
            return (Type[])a.clone();
        }

        static 
        {
            DISPLAY = new Type("DISPLAY", 0);
            VIDEO = new Type("VIDEO", 1);
            a = (new Type[] {
                DISPLAY, VIDEO
            });
        }

        private Type(String s, int k)
        {
            super(s, k);
        }
    }


    public static final String PREDEFINED_ORIENTATION_KEY = "predefinedOrientationKey";
    public static final String VIDEO_PLAY_REPORT_URL = "videoPlayReportURL";
    public static final String VIDEO_TIME_REPORT_URL = "videoTimeReportURL";
    public static final String VIDEO_URL = "videoURL";
    public static final String VIEW_TYPE = "viewType";
    private RelativeLayout a;
    private g b;
    private int c;
    private int d;
    private int e;
    private boolean f;
    private String g;
    private Type h;
    private h i;
    private int j;

    public InterstitialAdActivity()
    {
        f = false;
        j = -1;
    }

    static RelativeLayout a(InterstitialAdActivity interstitialadactivity)
    {
        return interstitialadactivity.a;
    }

    private void a(int k, int l)
    {
        if (l >= k)
        {
            k = 1;
        } else
        {
            k = 0;
        }
        l = ((WindowManager)getSystemService("window")).getDefaultDisplay().getRotation();
        if (k != 0)
        {
            switch (l)
            {
            default:
                setRequestedOrientation(1);
                return;

            case 1: // '\001'
            case 2: // '\002'
                setRequestedOrientation(9);
                break;
            }
            return;
        }
        switch (l)
        {
        default:
            setRequestedOrientation(0);
            return;

        case 2: // '\002'
        case 3: // '\003'
            setRequestedOrientation(8);
            break;
        }
    }

    private void a(Intent intent, Bundle bundle)
    {
        if (bundle != null)
        {
            c = bundle.getInt("lastRequestedOrientation", -1);
            g = bundle.getString("adInterstitialUniqueId");
            i.a(intent, bundle);
            f = true;
            return;
        } else
        {
            d = intent.getIntExtra("displayWidth", 0);
            e = intent.getIntExtra("displayHeight", 0);
            g = intent.getStringExtra("adInterstitialUniqueId");
            i.a(intent, bundle);
            return;
        }
    }

    static void a(InterstitialAdActivity interstitialadactivity, String s)
    {
        interstitialadactivity.a(s);
    }

    private void a(String s)
    {
        s = new Intent((new StringBuilder()).append(s).append(":").append(g).toString());
        LocalBroadcastManager.getInstance(this).sendBroadcast(s);
    }

    static g b(InterstitialAdActivity interstitialadactivity)
    {
        return interstitialadactivity.b;
    }

    public void finish()
    {
        a.removeAllViews();
        i.c();
        a("com.facebook.ads.interstitial.dismissed");
        super.finish();
    }

    public void onCreate(Bundle bundle)
    {
        Intent intent;
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setFlags(1024, 1024);
        a = new RelativeLayout(this);
        a.setBackgroundColor(0xff000000);
        setContentView(a, new android.widget.RelativeLayout.LayoutParams(-1, -1));
        intent = getIntent();
        if (intent.getBooleanExtra("useNativeCloseButton", false))
        {
            b = new g(this);
            b.setId(0x186a2);
            b.setOnClickListener(new android.view.View.OnClickListener() {

                final InterstitialAdActivity a;

                public void onClick(View view)
                {
                    a.finish();
                }

            
            {
                a = InterstitialAdActivity.this;
                super();
            }
            });
        }
        h = (Type)intent.getSerializableExtra("viewType");
        static class _cls4
        {

            static final int a[];

            static 
            {
                a = new int[Type.values().length];
                try
                {
                    a[Type.VIDEO.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[Type.DISPLAY.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls4.a[h.ordinal()];
        JVM INSTR tableswitch 1 1: default 156
    //                   1 200;
           goto _L1 _L2
_L1:
        i = new f(this, new com.facebook.ads.internal.view.h.a() {

            final InterstitialAdActivity a;

            public void a(View view)
            {
                InterstitialAdActivity.a(a).addView(view);
                if (InterstitialAdActivity.b(a) != null)
                {
                    InterstitialAdActivity.a(a).addView(InterstitialAdActivity.b(a));
                }
            }

            public void a(String s)
            {
                InterstitialAdActivity.a(a, s);
            }

            
            {
                a = InterstitialAdActivity.this;
                super();
            }
        });
_L4:
        j = intent.getIntExtra("predefinedOrientationKey", -1);
        a(intent, bundle);
        a("com.facebook.ads.interstitial.displayed");
        return;
_L2:
        i = new m(this, new com.facebook.ads.internal.view.h.a() {

            final InterstitialAdActivity a;

            public void a(View view)
            {
                InterstitialAdActivity.a(a).addView(view);
                if (InterstitialAdActivity.b(a) != null)
                {
                    InterstitialAdActivity.a(a).addView(InterstitialAdActivity.b(a));
                }
            }

            public void a(String s)
            {
                InterstitialAdActivity.a(a, s);
            }

            
            {
                a = InterstitialAdActivity.this;
                super();
            }
        });
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onPause()
    {
        super.onPause();
        i.a();
    }

    public void onRestart()
    {
        super.onRestart();
        f = true;
    }

    public void onResume()
    {
        super.onResume();
        i.b();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        i.a(bundle);
        bundle.putInt("lastRequestedOrientation", c);
        bundle.putString("adInterstitialUniqueId", g);
    }

    public void onStart()
    {
        super.onStart();
        if (j == -1) goto _L2; else goto _L1
_L1:
        setRequestedOrientation(j);
_L4:
        f = false;
        return;
_L2:
        if (d != 0 && e != 0)
        {
            if (!f)
            {
                a(d, e);
            } else
            if (c >= 0)
            {
                setRequestedOrientation(c);
                c = -1;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void setRequestedOrientation(int k)
    {
        c = k;
        super.setRequestedOrientation(k);
    }
}
