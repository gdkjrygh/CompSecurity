// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.view;

import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;

// Referenced classes of package com.pandora.android.view:
//            TrackView, SlidingDrawer

class a
    implements android.view.rver.OnGlobalLayoutListener
{

    final TrackView a;

    public void onGlobalLayout()
    {
        android.view.youtParams youtparams;
        if (android.os.N.SDK_INT < 16)
        {
            a.a.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        } else
        {
            a.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
        TrackView.a(a, a.a.getMeasuredHeight() - TrackView.a(a).getMeasuredHeight() - a.d.getMeasuredHeight());
        a.d.setTranslationY(-1F * (TrackView.b(a) / 2.0F));
        youtparams = a.a.getLayoutParams();
        youtparams.height = (int)a.getContext().getResources().getDimension(0x7f090114) + a.a.getMeasuredHeight();
        a.a.setLayoutParams(youtparams);
    }

    r(TrackView trackview)
    {
        a = trackview;
        super();
    }
}
