// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import android.view.animation.Animation;
import android.widget.ImageView;

// Referenced classes of package com.millennialmedia.android:
//            MMAdView

class val.animFinal
    implements Runnable
{

    final val.animFinal this$1;
    final Animation val$animFinal;

    public void run()
    {
        refreshAnimationimageView.startAnimation(val$animFinal);
    }

    ()
    {
        this$1 = final_;
        val$animFinal = Animation.this;
        super();
    }
}
