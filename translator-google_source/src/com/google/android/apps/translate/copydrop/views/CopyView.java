// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.copydrop.views;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.apps.translate.g;
import com.google.android.apps.translate.m;

// Referenced classes of package com.google.android.apps.translate.copydrop.views:
//            b

public class CopyView extends RelativeLayout
{

    public ImageView a;
    private TextView b;
    private Handler c;
    private Animation d;
    private Animation e;

    public CopyView(Context context)
    {
        super(context);
        c = new Handler();
    }

    public CopyView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        c = new Handler();
    }

    public CopyView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        c = new Handler();
    }

    static void a(CopyView copyview)
    {
        copyview.b.setVisibility(0);
        copyview.c.postDelayed(new b(copyview), 3500L);
    }

    public final void a()
    {
        b.setVisibility(8);
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        b = (TextView)findViewById(m.text_box);
        a = (ImageView)findViewById(m.persistent_icon);
        if (!isInEditMode())
        {
            setVisibility(8);
        }
        d = AnimationUtils.loadAnimation(getContext(), g.scale_up_in);
        d.setInterpolator(new OvershootInterpolator(1.2F));
        e = AnimationUtils.loadAnimation(getContext(), g.scale_down_out);
        e.setInterpolator(new AnticipateInterpolator(1.2F));
    }
}
