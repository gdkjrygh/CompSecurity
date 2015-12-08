// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import android.view.Display;
import android.view.Window;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.adapters.view.a;
import com.facebook.ads.internal.adapters.view.b;
import com.facebook.ads.internal.g;

public class InterstitialAdActivity extends Activity
{

    public static final String PREDEFINED_ORIENTATION_KEY = "predefinedOrientationKey";
    private RelativeLayout a;
    private g b;
    private int c;
    private int d;
    private int e;
    private boolean f;
    private String g;
    private b h;
    private int i;

    public InterstitialAdActivity()
    {
        f = false;
        i = -1;
    }

    static RelativeLayout a(InterstitialAdActivity interstitialadactivity)
    {
        return interstitialadactivity.a;
    }

    private void a(int j, int k)
    {
        if (k >= j)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        k = ((WindowManager)getSystemService("window")).getDefaultDisplay().getRotation();
        if (j != 0)
        {
            switch (k)
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
        switch (k)
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
            h.a(intent, bundle);
            f = true;
            return;
        } else
        {
            d = intent.getIntExtra("displayWidth", 0);
            e = intent.getIntExtra("displayHeight", 0);
            g = intent.getStringExtra("adInterstitialUniqueId");
            h.a(intent, bundle);
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
        h.c();
        a("com.facebook.ads.interstitial.dismissed");
        super.finish();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setFlags(1024, 1024);
        a = new RelativeLayout(this);
        a.setBackgroundColor(0xff000000);
        setContentView(a, new android.widget.RelativeLayout.LayoutParams(-1, -1));
        Intent intent = getIntent();
        if (intent.getBooleanExtra("useNativeCloseButton", false))
        {
            b = new g(this);
            b.setId(0x186a2);
            b.setOnClickListener(new _cls1());
        }
        h = new a(this, new _cls2());
        i = intent.getIntExtra("predefinedOrientationKey", -1);
        a(intent, bundle);
        a("com.facebook.ads.interstitial.displayed");
    }

    public void onPause()
    {
        super.onPause();
        h.a();
    }

    public void onRestart()
    {
        super.onRestart();
        f = true;
    }

    public void onResume()
    {
        super.onResume();
        h.b();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        h.a(bundle);
        bundle.putInt("lastRequestedOrientation", c);
        bundle.putString("adInterstitialUniqueId", g);
    }

    public void onStart()
    {
        super.onStart();
        if (i == -1) goto _L2; else goto _L1
_L1:
        setRequestedOrientation(i);
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

    public void setRequestedOrientation(int j)
    {
        c = j;
        super.setRequestedOrientation(j);
    }

    private class _cls1
        implements android.view.View.OnClickListener
    {

        final InterstitialAdActivity a;

        public void onClick(View view)
        {
            a.finish();
        }

        _cls1()
        {
            a = InterstitialAdActivity.this;
            super();
        }
    }


    private class _cls2
        implements com.facebook.ads.internal.adapters.view.b.a
    {

        final InterstitialAdActivity a;

        public void a(View view)
        {
            com.facebook.ads.InterstitialAdActivity.a(a).addView(view);
            if (com.facebook.ads.InterstitialAdActivity.b(a) != null)
            {
                com.facebook.ads.InterstitialAdActivity.a(a).addView(com.facebook.ads.InterstitialAdActivity.b(a));
            }
        }

        public void a(String s)
        {
            com.facebook.ads.InterstitialAdActivity.a(a, s);
        }

        _cls2()
        {
            a = InterstitialAdActivity.this;
            super();
        }
    }

}
