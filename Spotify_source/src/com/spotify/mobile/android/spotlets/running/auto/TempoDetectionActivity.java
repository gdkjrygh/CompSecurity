// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.running.auto;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.mobile.android.spotlets.running.service.RunningService;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import ctz;
import dgo;
import dmz;
import fac;
import fad;
import fdt;
import fdu;
import fdx;
import fec;
import few;
import fos;
import fou;
import java.util.Set;

public class TempoDetectionActivity extends fou
    implements fdx
{

    private TextView d;
    private TextView i;
    private TextView j;
    private ImageView k;
    private fdt l;
    private fad m;

    public TempoDetectionActivity()
    {
    }

    public static Intent a(Context context, String s, String s1)
    {
        ctz.a(context);
        Assertion.a(s, "Uri is empty");
        context = new Intent(context, com/spotify/mobile/android/spotlets/running/auto/TempoDetectionActivity);
        context.putExtra("uri", s);
        context.putExtra("username", s1);
        return context;
    }

    static fdt a(TempoDetectionActivity tempodetectionactivity)
    {
        return tempodetectionactivity.l;
    }

    static ImageView b(TempoDetectionActivity tempodetectionactivity)
    {
        return tempodetectionactivity.k;
    }

    public final void a(int i1)
    {
        d.setText(i1);
    }

    public final void a(Uri uri)
    {
        m.a(uri);
    }

    public final void b(int i1)
    {
        i.setText(i1);
        b(true);
    }

    public final void b(boolean flag)
    {
        if (flag)
        {
            i.setVisibility(0);
            return;
        } else
        {
            i.setVisibility(4);
            return;
        }
    }

    public final void c(int i1)
    {
        j.setText(String.valueOf(i1));
    }

    public final void d(int i1)
    {
        ObjectAnimator objectanimator = ObjectAnimator.ofFloat(k, "alpha", new float[] {
            0.0F, 1.0F
        });
        objectanimator.setDuration(100L);
        ObjectAnimator objectanimator1 = ObjectAnimator.ofFloat(k, "alpha", new float[] {
            1.0F, 0.0F
        });
        objectanimator1.setDuration(100L);
        objectanimator1.addListener(new AnimatorListenerAdapter(i1, objectanimator) {

            private int a;
            private ObjectAnimator b;
            private TempoDetectionActivity c;

            public final void onAnimationEnd(Animator animator)
            {
                TempoDetectionActivity.b(c).setImageResource(a);
                b.start();
            }

            
            {
                c = TempoDetectionActivity.this;
                a = i1;
                b = objectanimator;
                super();
            }
        });
        objectanimator1.start();
    }

    public final void f()
    {
        j.setText(getText(0x7f080653));
    }

    public final void g()
    {
        dmz.a(fos);
        fos.a(this, ViewUri.l.toString());
        finish();
    }

    public final void h()
    {
        finish();
    }

    public void onBackPressed()
    {
        l.a();
        super.onBackPressed();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030033);
        d = (TextView)findViewById(0x7f1104b0);
        i = (TextView)findViewById(0x7f1104b1);
        j = (TextView)findViewById(0x7f1104b2);
        k = (ImageView)findViewById(0x7f1104b3);
        bundle = findViewById(0x7f1104b4);
        Object obj = findViewById(0x7f1102b9);
        bundle.setOnClickListener(new android.view.View.OnClickListener() {

            private TempoDetectionActivity a;

            public final void onClick(View view)
            {
                view = TempoDetectionActivity.a(a);
                view.a();
                view.c = ((fdt) (view)).b.a();
                int i1 = ((fdt) (view)).c;
                ((fdt) (view)).a.a(i1);
            }

            
            {
                a = TempoDetectionActivity.this;
                super();
            }
        });
        ((View) (obj)).setOnClickListener(new android.view.View.OnClickListener() {

            private TempoDetectionActivity a;

            public final void onClick(View view)
            {
                TempoDetectionActivity.a(a).a();
                a.finish();
            }

            
            {
                a = TempoDetectionActivity.this;
                super();
            }
        });
        m = (new fac(this)).a();
        dgo.a(findViewById(0x7f11040e), m);
        obj = getIntent();
        bundle = ((Intent) (obj)).getStringExtra("uri");
        obj = ((Intent) (obj)).getStringExtra("username");
        Assertion.a(bundle, "Uri is empty");
        new fdu();
        bundle = new SpotifyLink(bundle);
        ctz.a(this);
        ctz.a(this);
        ctz.a(bundle);
        bundle = new few(this, bundle.c(), ((String) (obj)));
        l = new fdt(this, new fec(this), bundle);
        bundle = l;
        ((fdt) (bundle)).a.c = new fdt._cls1(bundle);
        ((fdt) (bundle)).a.d = new fdt._cls2(bundle);
        obj = ((fdt) (bundle)).a;
        obj.b = new fdt._cls3(bundle);
        ((few) (obj)).a();
    }

    protected void onDestroy()
    {
        fdt fdt1 = l;
        fdt1.d.removeCallbacksAndMessages(null);
        few few1 = fdt1.a;
        if (few1.e != null)
        {
            few1.e.d.remove(fdt1);
        }
        fdt1.a.b();
        super.onDestroy();
    }
}
