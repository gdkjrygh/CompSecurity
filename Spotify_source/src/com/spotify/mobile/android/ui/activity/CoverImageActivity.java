// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;
import dmz;
import gft;
import gwb;

public class CoverImageActivity extends Activity
{

    private static final TimeInterpolator a = new DecelerateInterpolator();
    private ImageView b;
    private int c;
    private ColorDrawable d;
    private int e;
    private int f;
    private float g;
    private float h;

    public CoverImageActivity()
    {
    }

    static float a(CoverImageActivity coverimageactivity, float f1)
    {
        coverimageactivity.g = f1;
        return f1;
    }

    static int a(CoverImageActivity coverimageactivity, int i)
    {
        coverimageactivity.e = i;
        return i;
    }

    static ImageView a(CoverImageActivity coverimageactivity)
    {
        return coverimageactivity.b;
    }

    private void a()
    {
        Object obj = new Runnable() {

            private CoverImageActivity a;

            public final void run()
            {
                a.finish();
            }

            
            {
                a = CoverImageActivity.this;
                super();
            }
        };
        boolean flag;
        if (getResources().getConfiguration().orientation != c)
        {
            b.setPivotX((float)b.getWidth() / 2.0F);
            b.setPivotY((float)b.getHeight() / 2.0F);
            e = 0;
            f = 0;
            flag = true;
        } else
        {
            flag = false;
        }
        b.animate().setDuration(300L).scaleX(g).scaleY(h).translationX(e).translationY(f).setListener(new AnimatorListenerAdapter(((Runnable) (obj))) {

            private Runnable a;

            public final void onAnimationEnd(Animator animator)
            {
                a.run();
            }

            
            {
                a = runnable;
                super();
            }
        });
        if (flag)
        {
            b.animate().alpha(0.0F);
        }
        obj = ObjectAnimator.ofInt(d, "alpha", new int[] {
            0
        });
        ((ObjectAnimator) (obj)).setDuration(300L);
        ((ObjectAnimator) (obj)).start();
    }

    public static void a(Activity activity, int i, int j, int k, int l, Uri uri, int i1)
    {
        Intent intent = new Intent(activity, com/spotify/mobile/android/ui/activity/CoverImageActivity);
        intent.putExtra("ARGUMENT_LEFT", i);
        intent.putExtra("ARGUMENT_TOP", j);
        intent.putExtra("ARGUMENT_WIDTH", k);
        intent.putExtra("ARGUMENT_HEIGHT", l);
        intent.putExtra("ARGUMENT_IMAGE_URI", uri);
        intent.putExtra("ARGUMENT_ORIENTATION", i1);
        activity.startActivity(intent);
        activity.overridePendingTransition(0, 0);
    }

    public static void a(Activity activity, ImageView imageview, Uri uri)
    {
        imageview.setOnClickListener(new android.view.View.OnClickListener(imageview, activity, uri) {

            private ImageView a;
            private Activity b;
            private Uri c;

            public final void onClick(View view)
            {
                view = new int[2];
                a.getLocationOnScreen(view);
                CoverImageActivity.a(b, view[0], view[1], a.getWidth(), a.getHeight(), c, b.getResources().getConfiguration().orientation);
            }

            
            {
                a = imageview;
                b = activity;
                c = uri;
                super();
            }
        });
    }

    static float b(CoverImageActivity coverimageactivity, float f1)
    {
        coverimageactivity.h = f1;
        return f1;
    }

    static int b(CoverImageActivity coverimageactivity, int i)
    {
        coverimageactivity.f = i;
        return i;
    }

    static void b(CoverImageActivity coverimageactivity)
    {
        coverimageactivity.b.setPivotX(0.0F);
        coverimageactivity.b.setPivotY(0.0F);
        coverimageactivity.b.setScaleX(coverimageactivity.g);
        coverimageactivity.b.setScaleY(coverimageactivity.h);
        coverimageactivity.b.setTranslationX(coverimageactivity.e);
        coverimageactivity.b.setTranslationY(coverimageactivity.f);
        coverimageactivity.d.setAlpha(0);
        coverimageactivity.b.animate().setDuration(300L).scaleX(1.0F).scaleY(1.0F).translationX(0.0F).translationY(0.0F).setInterpolator(a);
        coverimageactivity = ObjectAnimator.ofInt(coverimageactivity.d, "alpha", new int[] {
            0, 255
        });
        coverimageactivity.setDuration(300L);
        coverimageactivity.start();
    }

    static void c(CoverImageActivity coverimageactivity)
    {
        coverimageactivity.a();
    }

    public void finish()
    {
        super.finish();
        overridePendingTransition(0, 0);
    }

    public void onBackPressed()
    {
        a();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f03001d);
        b = (ImageView)findViewById(0x7f1102a9);
        Object obj = getWindow().getDecorView().getRootView();
        d = new ColorDrawable(0xff000000);
        ((View) (obj)).setBackgroundDrawable(d);
        obj = getIntent().getExtras();
        int i = ((Bundle) (obj)).getInt("ARGUMENT_LEFT");
        int j = ((Bundle) (obj)).getInt("ARGUMENT_TOP");
        int k = ((Bundle) (obj)).getInt("ARGUMENT_WIDTH");
        int l = ((Bundle) (obj)).getInt("ARGUMENT_HEIGHT");
        Uri uri = (Uri)((Bundle) (obj)).getParcelable("ARGUMENT_IMAGE_URI");
        c = ((Bundle) (obj)).getInt("ARGUMENT_ORIENTATION");
        obj = ((gft)dmz.a(gft)).a().a(uri);
        obj.b = true;
        ((gwb) (obj)).a(b, null);
        if (bundle == null)
        {
            b.getViewTreeObserver().addOnPreDrawListener(new android.view.ViewTreeObserver.OnPreDrawListener(i, j, k, l) {

                private int a;
                private int b;
                private int c;
                private int d;
                private CoverImageActivity e;

                public final boolean onPreDraw()
                {
                    CoverImageActivity.a(e).getViewTreeObserver().removeOnPreDrawListener(this);
                    int ai[] = new int[2];
                    CoverImageActivity.a(e).getLocationOnScreen(ai);
                    CoverImageActivity.a(e, a - ai[0]);
                    CoverImageActivity.b(e, b - ai[1]);
                    CoverImageActivity.a(e, (float)c / (float)CoverImageActivity.a(e).getWidth());
                    CoverImageActivity.b(e, (float)d / (float)CoverImageActivity.a(e).getHeight());
                    CoverImageActivity.b(e);
                    return true;
                }

            
            {
                e = CoverImageActivity.this;
                a = i;
                b = j;
                c = k;
                d = l;
                super();
            }
            });
        }
        b.setOnClickListener(new android.view.View.OnClickListener() {

            private CoverImageActivity a;

            public final void onClick(View view)
            {
                CoverImageActivity.c(a);
            }

            
            {
                a = CoverImageActivity.this;
                super();
            }
        });
    }

}
