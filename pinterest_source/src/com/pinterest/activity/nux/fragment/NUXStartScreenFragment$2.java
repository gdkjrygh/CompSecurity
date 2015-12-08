// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.nux.fragment;

import android.view.View;
import android.view.ViewTreeObserver;
import com.pinterest.ui.anim.FanAnimationUtil;

// Referenced classes of package com.pinterest.activity.nux.fragment:
//            NUXStartScreenFragment

class val.v
    implements android.view.LayoutListener
{

    final NUXStartScreenFragment this$0;
    final View val$v;

    public void onGlobalLayout()
    {
        val$v.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        com.pinterest.ui.anim.arams arams = getFanUtilParams();
        FanAnimationUtil.animate(_leftIv, _centerIv, _rightIv, _container, arams);
    }

    ()
    {
        this$0 = final_nuxstartscreenfragment;
        val$v = View.this;
        super();
    }
}
