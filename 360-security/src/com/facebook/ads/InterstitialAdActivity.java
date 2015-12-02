// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.g;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.adapters.view.b;

public class InterstitialAdActivity extends Activity
{

    private RelativeLayout a;
    private com.facebook.ads.internal.g b;
    private int c;
    private int d;
    private int e;
    private boolean f;
    private String g;
    private com.facebook.ads.internal.adapters.view.b.b h;
    private b i;
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
        android.support.v4.content.g.a(this).a(s);
    }

    static com.facebook.ads.internal.g b(InterstitialAdActivity interstitialadactivity)
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
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setFlags(1024, 1024);
        a = new RelativeLayout(this);
        a.setBackgroundColor(0xff000000);
        setContentView(a, new android.widget.RelativeLayout.LayoutParams(-1, -1));
        Intent intent = getIntent();
        if (intent.getBooleanExtra("useNativeCloseButton", false))
        {
            b = new com.facebook.ads.internal.g(this);
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
        h = (com.facebook.ads.internal.adapters.view.b.b)intent.getSerializableExtra("viewType");
        i = com.facebook.ads.internal.adapters.view.b.b.a(h, this, new com.facebook.ads.internal.adapters.view.b.a() {

            final InterstitialAdActivity a;

            public void a(View view)
            {
                InterstitialAdActivity.a(a).addView(view);
                if (com.facebook.ads.InterstitialAdActivity.b(a) != null)
                {
                    InterstitialAdActivity.a(a).addView(com.facebook.ads.InterstitialAdActivity.b(a));
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
        j = intent.getIntExtra("predefinedOrientationKey", -1);
        a(intent, bundle);
        a("com.facebook.ads.interstitial.displayed");
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
        bundle.putSerializable("viewType", h);
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
