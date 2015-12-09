// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.paymentcard.widgets;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.squareup.picasso.Target;

// Referenced classes of package com.google.android.apps.wallet.paymentcard.widgets:
//            CardDrawable

final class val.bounds
    implements Target
{

    final CardDrawable this$0;
    final Rect val$bounds;

    public final void onBitmapFailed(Drawable drawable)
    {
        CardDrawable.access$002(CardDrawable.this, false);
        fetchFromCardColor(CardDrawable.access$100(CardDrawable.this), val$bounds);
        invalidateSelf();
    }

    public final void onBitmapLoaded(Bitmap bitmap, com.squareup.picasso.rom rom)
    {
        CardDrawable.access$002(CardDrawable.this, false);
        CardDrawable.access$202(CardDrawable.this, new BitmapDrawable(CardDrawable.access$300(CardDrawable.this), bitmap));
        CardDrawable.access$402(CardDrawable.this, false);
        invalidateSelf();
    }

    ()
    {
        this$0 = final_carddrawable;
        val$bounds = Rect.this;
        super();
    }
}
