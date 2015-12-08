// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.create;

import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;

// Referenced classes of package com.pinterest.activity.create:
//            CameraActivity

class this._cls0
    implements android.view.er
{

    final CameraActivity this$0;

    public void onClick(View view)
    {
        _settingsLayout.clearAnimation();
        _settingsLayout.setVisibility(0);
        _settingsLayout.startAnimation(AnimationUtils.loadAnimation(CameraActivity.this, 0x7f040015));
        _settingsButton.setVisibility(8);
    }

    ()
    {
        this$0 = CameraActivity.this;
        super();
    }
}
