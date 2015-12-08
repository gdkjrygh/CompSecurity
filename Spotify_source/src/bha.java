// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.Iterator;
import java.util.List;

final class bha extends RelativeLayout
{

    private static final float b[] = {
        5F, 5F, 5F, 5F, 5F, 5F, 5F, 5F
    };
    final RelativeLayout a;
    private AnimationDrawable c;

    public bha(Context context, bgz bgz1)
    {
        Object obj;
        super(context);
        btl.a(bgz1);
        obj = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(10);
        ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(11);
        ShapeDrawable shapedrawable = new ShapeDrawable(new RoundRectShape(b, null, null));
        shapedrawable.getPaint().setColor(bgz1.c);
        a = new RelativeLayout(context);
        a.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        bkv.g().a(a, shapedrawable);
        obj = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        if (!TextUtils.isEmpty(bgz1.a))
        {
            android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
            TextView textview = new TextView(context);
            textview.setLayoutParams(layoutparams);
            textview.setId(0x47470001);
            textview.setTypeface(Typeface.DEFAULT);
            textview.setText(bgz1.a);
            textview.setTextColor(bgz1.d);
            textview.setTextSize(bgz1.e);
            bfq.a();
            int i = bjz.a(context, 4);
            bfq.a();
            textview.setPadding(i, 0, bjz.a(context, 4), 0);
            a.addView(textview);
            ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(1, textview.getId());
        }
        context = new ImageView(context);
        context.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        context.setId(0x47470002);
        obj = bgz1.b;
        if (((List) (obj)).size() <= 1) goto _L2; else goto _L1
_L1:
        c = new AnimationDrawable();
        Drawable drawable;
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); c.addFrame(drawable, bgz1.f))
        {
            drawable = (Drawable)((Iterator) (obj)).next();
        }

        bkv.g().a(context, c);
_L4:
        a.addView(context);
        addView(a);
        return;
_L2:
        if (((List) (obj)).size() == 1)
        {
            context.setImageDrawable((Drawable)((List) (obj)).get(0));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void onAttachedToWindow()
    {
        if (c != null)
        {
            c.start();
        }
        super.onAttachedToWindow();
    }

}
