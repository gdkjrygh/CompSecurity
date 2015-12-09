// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.panels;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import it.sephiroth.android.library.imagezoom.ImageViewTouch;

// Referenced classes of package com.aviary.android.feather.sdk.panels:
//            m

class a
    implements it.sephiroth.android.library.imagezoom.eViewTouchBase.b
{

    final m a;

    public void a(Drawable drawable)
    {
        a.q.b("onDrawableChanged");
        drawable = m.a(a.c.getImageViewMatrix());
        float f = a.g.getHeight();
        int i = (int)(drawable[4] * f);
        drawable = a.b().findViewById(com.aviary.android.feather.sdk..aviary_meme_dumb);
        android.widget.arLayout.LayoutParams layoutparams = (android.widget.arLayout.LayoutParams)drawable.getLayoutParams();
        layoutparams.height = i - 50;
        drawable.setLayoutParams(layoutparams);
        drawable.requestLayout();
    }

    geViewTouch(m m1)
    {
        a = m1;
        super();
    }
}
