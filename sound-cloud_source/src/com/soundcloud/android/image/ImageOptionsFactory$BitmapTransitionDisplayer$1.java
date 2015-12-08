// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.image;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

class val.imageView
    implements android.graphics.drawable.._cls1
{

    final val.imageView this$0;
    final ImageView val$imageView;

    public void invalidateDrawable(Drawable drawable)
    {
        val$imageView.invalidate();
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long l)
    {
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable)
    {
    }

    ()
    {
        this$0 = final_;
        val$imageView = ImageView.this;
        super();
    }
}
