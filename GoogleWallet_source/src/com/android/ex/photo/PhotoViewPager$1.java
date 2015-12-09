// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.ex.photo;

import android.view.View;

// Referenced classes of package com.android.ex.photo:
//            PhotoViewPager

final class this._cls0
    implements android.support.v4.view.nsformer
{

    final PhotoViewPager this$0;

    public final void transformPage(View view, float f)
    {
        if (f < 0.0F || f >= 1.0F)
        {
            view.setTranslationX(0.0F);
            view.setAlpha(1.0F);
            view.setScaleX(1.0F);
            view.setScaleY(1.0F);
            return;
        } else
        {
            view.setTranslationX(-f * (float)view.getWidth());
            view.setAlpha(Math.max(0.0F, 1.0F - f));
            f = Math.max(0.0F, 1.0F - 0.3F * f);
            view.setScaleX(f);
            view.setScaleY(f);
            return;
        }
    }

    Transformer()
    {
        this$0 = PhotoViewPager.this;
        super();
    }
}
