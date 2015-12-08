// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.ViewFlipper;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            bk, ct, gd, gi, 
//            gh, fh

public class gg
{
    class a extends TableLayout
        implements fh
    {

        View a;
        gd b;
        int c;
        final gg d;

        private int c()
        {
            int i = c;
            if (c == 0)
            {
                i = gg.a(d, getContext());
            }
            return i - b.a(gd.b.H).getWidth() - b.a(gd.b.J).getWidth() - 10;
        }

        public void a()
        {
            b();
        }

        public void a(View view)
        {
            a = view;
        }

        public void b()
        {
            int i = c();
            int j = b.a(gd.b.J).getHeight();
            a.setLayoutParams(new android.widget.TableRow.LayoutParams(i, j));
        }

        a(Context context, gd gd1, int i)
        {
            d = gg.this;
            super(context);
            c = i;
            b = gd1;
        }
    }

    public static interface b
    {

        public abstract void a(gg gg1, boolean flag);
    }


    final int a = 5;
    final int b = 5;
    final int c = 5;
    boolean d;
    List e;
    b f;
    int g;
    bk h;

    public gg(bk bk1)
    {
        d = false;
        e = new ArrayList();
        g = 0;
        h = bk1;
    }

    private int a(Context context)
    {
        int j = ((WindowManager)context.getSystemService("window")).getDefaultDisplay().getWidth();
        int i = j;
        if (h.N() != null)
        {
            i = j - h.N().a();
        }
        return i;
    }

    static int a(gg gg1, Context context)
    {
        return gg1.a(context);
    }

    private TextView a(Context context, gd gd1)
    {
        context = new TextView(context);
        context.setTextSize(ct.G());
        context.setTypeface(Typeface.create("helvetica", 1));
        context.setEllipsize(android.text.TextUtils.TruncateAt.END);
        context.setTextColor(gd1.a(gd.a.g));
        context.setShadowLayer(1.2F, 1.0F, 1.0F, gd1.a(gd.a.h));
        context.setPadding(0, 0, 5, 0);
        context.setGravity(19);
        context.setVerticalFadingEdgeEnabled(true);
        context.setFadingEdgeLength(10);
        context.setLinksClickable(true);
        return context;
    }

    public View a(Context context, int i, gd gd1)
    {
        Object obj = new ImageView(context);
        ((ImageView) (obj)).setImageDrawable(new gi(this, gd1.a(gd.b.G)));
        ((ImageView) (obj)).setPadding(0, 5, 0, 0);
        ImageView imageview = new ImageView(context);
        imageview.setImageDrawable(new gi(this, gd1.a(gd.b.H)));
        ImageView imageview1 = new ImageView(context);
        imageview1.setImageDrawable(new gi(this, gd1.a(gd.b.J)));
        ViewFlipper viewflipper = new ViewFlipper(context);
        int j = 0;
        while (j < Math.min(10, e.size())) 
        {
            try
            {
                TextView textview = a(context, gd1);
                textview.setText((CharSequence)e.get(j));
                viewflipper.addView(textview);
            }
            catch (Exception exception)
            {
                ct.a(exception);
            }
            j++;
        }
        viewflipper.setFlipInterval(5000);
        viewflipper.startFlipping();
        viewflipper.setBackgroundDrawable(new BitmapDrawable(gd1.a(gd.b.I)));
        Object obj1 = new AlphaAnimation(0.0F, 1.0F);
        ((Animation) (obj1)).setDuration(300L);
        ((Animation) (obj1)).setStartOffset(300L);
        viewflipper.setInAnimation(((Animation) (obj1)));
        obj1 = new AlphaAnimation(1.0F, 0.0F);
        ((Animation) (obj1)).setDuration(300L);
        viewflipper.setOutAnimation(((Animation) (obj1)));
        obj1 = new TableRow(context);
        android.widget.TableRow.LayoutParams layoutparams = new android.widget.TableRow.LayoutParams();
        layoutparams.gravity = 51;
        ((TableRow) (obj1)).addView(((View) (obj)), layoutparams);
        obj = new TableRow(context);
        ((TableRow) (obj)).addView(imageview);
        ((TableRow) (obj)).addView(viewflipper);
        ((TableRow) (obj)).addView(imageview1);
        context = new a(context, gd1, i);
        context.setPadding(5, 0, 5, 0);
        context.addView(((View) (obj1)));
        context.addView(((View) (obj)));
        context.a(viewflipper);
        context.b();
        context.setFocusable(false);
        return context;
    }

    public void a(String s, b b1)
    {
        if (!d)
        {
            f = b1;
            (new Thread(new gh(this, s))).run();
        }
    }
}
