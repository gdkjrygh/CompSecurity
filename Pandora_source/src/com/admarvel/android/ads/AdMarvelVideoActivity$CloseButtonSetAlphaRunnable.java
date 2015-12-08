// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelVideoActivity

private class mCloseButtonRefernce
    implements Runnable
{

    private WeakReference mCloseButtonRefernce;
    final AdMarvelVideoActivity this$0;

    public void run()
    {
        ImageView imageview = (ImageView)mCloseButtonRefernce.get();
        if (imageview != null && imageview.getDrawable() != null)
        {
            imageview.getDrawable().setAlpha(25);
            if (AdMarvelVideoActivity.access$8(AdMarvelVideoActivity.this) != null && AdMarvelVideoActivity.access$8(AdMarvelVideoActivity.this)._mth0())
            {
                AdMarvelVideoActivity.access$8(AdMarvelVideoActivity.this)._mth0();
            }
        }
    }

    public (ImageView imageview)
    {
        this$0 = AdMarvelVideoActivity.this;
        super();
        mCloseButtonRefernce = null;
        mCloseButtonRefernce = new WeakReference(imageview);
    }
}
