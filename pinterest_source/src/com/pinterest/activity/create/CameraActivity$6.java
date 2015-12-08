// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.create;

import android.view.animation.Animation;
import android.widget.LinearLayout;

// Referenced classes of package com.pinterest.activity.create:
//            CameraActivity

class this._cls0
    implements android.view.animation.onListener
{

    final CameraActivity this$0;

    public void onAnimationEnd(Animation animation)
    {
        _settingsLayout.setVisibility(8);
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
    }

    ner()
    {
        this$0 = CameraActivity.this;
        super();
    }
}
