// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.wearable.view;

import android.graphics.drawable.Drawable;

// Referenced classes of package android.support.wearable.view:
//            BackgroundView

class this._cls0
    implements android.graphics.drawable.
{

    final BackgroundView this$0;

    public void invalidateDrawable(Drawable drawable)
    {
        BackgroundView.access$200(BackgroundView.this, BackgroundView.access$000(BackgroundView.this), BackgroundView.access$100(BackgroundView.this));
        invalidate();
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long l)
    {
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable)
    {
    }

    ()
    {
        this$0 = BackgroundView.this;
        super();
    }
}
