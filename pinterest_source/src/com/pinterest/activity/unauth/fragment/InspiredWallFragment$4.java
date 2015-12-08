// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.unauth.fragment;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import com.pinterest.ui.text.PTextView;

// Referenced classes of package com.pinterest.activity.unauth.fragment:
//            InspiredWallFragment

class > extends com.pinterest.kit.utils.nListener
{

    final InspiredWallFragment this$0;
    final ObjectAnimator val$fadeInAnimator;
    final String val$text;

    public void onAnimationEnd(Animator animator)
    {
        _titleTv.setText(val$text);
        val$fadeInAnimator.start();
    }

    ()
    {
        this$0 = final_inspiredwallfragment;
        val$text = s;
        val$fadeInAnimator = ObjectAnimator.this;
        super();
    }
}
