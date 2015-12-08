// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.photos.allphotos.ui;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.DecelerateInterpolator;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import c;

public class AllPhotosBar extends RelativeLayout
{

    public TextView a;
    public ProgressBar b;

    public AllPhotosBar(Context context)
    {
        super(context);
    }

    public AllPhotosBar(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public AllPhotosBar(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public final void a(int i)
    {
        if (b.isIndeterminate())
        {
            b.setIndeterminate(false);
            b.setProgress(0);
        }
        b(i);
    }

    public void b(int i)
    {
        ObjectAnimator objectanimator = ObjectAnimator.ofInt(b, "progress", new int[] {
            i
        });
        objectanimator.setDuration(200L);
        objectanimator.setInterpolator(new DecelerateInterpolator());
        objectanimator.start();
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        a = (TextView)findViewById(c.cj);
        b = (ProgressBar)findViewById(c.ci);
        b.setIndeterminate(true);
    }
}
