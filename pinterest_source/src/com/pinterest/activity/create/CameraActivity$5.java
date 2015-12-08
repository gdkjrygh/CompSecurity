// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.create;

import android.graphics.drawable.Drawable;
import android.view.animation.Animation;
import android.widget.ImageView;

// Referenced classes of package com.pinterest.activity.create:
//            CameraActivity

class val.in
    implements android.view.animation.onListener
{

    final CameraActivity this$0;
    final Drawable val$drawable;
    final Animation val$in;
    final ImageView val$view;

    public void onAnimationEnd(Animation animation)
    {
        val$view.setImageDrawable(val$drawable);
        val$view.startAnimation(val$in);
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
    }

    ner()
    {
        this$0 = final_cameraactivity;
        val$view = imageview;
        val$drawable = drawable1;
        val$in = Animation.this;
        super();
    }
}
