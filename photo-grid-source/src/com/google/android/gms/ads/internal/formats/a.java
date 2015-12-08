// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.formats;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.common.internal.bl;
import com.google.android.gms.internal.qd;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.ads.internal.formats:
//            zza

final class a extends RelativeLayout
{

    private static final float a[] = {
        5F, 5F, 5F, 5F, 5F, 5F, 5F, 5F
    };
    private final RelativeLayout b;
    private AnimationDrawable c;

    public a(Context context, com.google.android.gms.ads.internal.formats.zza zza1)
    {
        Object obj;
        super(context);
        bl.a(zza1);
        obj = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(10);
        ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(11);
        ShapeDrawable shapedrawable = new ShapeDrawable(new RoundRectShape(a, null, null));
        shapedrawable.getPaint().setColor(zza1.getBackgroundColor());
        b = new RelativeLayout(context);
        b.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        zzp.zzbx().a(b, shapedrawable);
        obj = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        if (!TextUtils.isEmpty(zza1.getText()))
        {
            android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
            TextView textview = new TextView(context);
            textview.setLayoutParams(layoutparams);
            textview.setId(0x47470001);
            textview.setTypeface(Typeface.DEFAULT);
            textview.setText(zza1.getText());
            textview.setTextColor(zza1.getTextColor());
            textview.setTextSize(zza1.getTextSize());
            textview.setPadding(zzl.zzcF().zzb(context, 4), 0, zzl.zzcF().zzb(context, 4), 0);
            b.addView(textview);
            ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(1, textview.getId());
        }
        context = new ImageView(context);
        context.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        context.setId(0x47470002);
        obj = zza1.zzds();
        if (((List) (obj)).size() <= 1) goto _L2; else goto _L1
_L1:
        c = new AnimationDrawable();
        Drawable drawable;
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); c.addFrame(drawable, zza1.zzdt()))
        {
            drawable = (Drawable)((Iterator) (obj)).next();
        }

        zzp.zzbx().a(context, c);
_L4:
        b.addView(context);
        addView(b);
        return;
_L2:
        if (((List) (obj)).size() == 1)
        {
            context.setImageDrawable((Drawable)((List) (obj)).get(0));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final ViewGroup a()
    {
        return b;
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
