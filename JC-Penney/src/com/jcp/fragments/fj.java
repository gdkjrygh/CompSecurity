// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.ViewTreeObserver;
import android.widget.ImageView;

// Referenced classes of package com.jcp.fragments:
//            ff

class fj
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener
{

    final DisplayMetrics a;
    final ImageView b;
    final ff c;

    fj(ff ff, DisplayMetrics displaymetrics, ImageView imageview)
    {
        c = ff;
        a = displaymetrics;
        b = imageview;
        super();
    }

    public void onGlobalLayout()
    {
        int i = a.widthPixels;
        int j = (int)Math.ceil((b.getDrawable().getIntrinsicHeight() * i) / b.getDrawable().getIntrinsicWidth());
        b.setLayoutParams(new android.widget.FrameLayout.LayoutParams(i, j));
        b.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        b.getViewTreeObserver().removeGlobalOnLayoutListener(this);
    }
}
