// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.graphics.drawable.Drawable;

// Referenced classes of package android.support.v4.widget:
//            MaterialProgressDrawable

class this._cls0
    implements android.graphics.drawable.this._cls0
{

    final MaterialProgressDrawable this$0;

    public void invalidateDrawable(Drawable drawable)
    {
        invalidateSelf();
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long l)
    {
        scheduleSelf(runnable, l);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable)
    {
        unscheduleSelf(runnable);
    }

    ()
    {
        this$0 = MaterialProgressDrawable.this;
        super();
    }
}
