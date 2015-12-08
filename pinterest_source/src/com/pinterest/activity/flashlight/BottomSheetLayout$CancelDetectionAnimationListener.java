// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.flashlight;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// Referenced classes of package com.pinterest.activity.flashlight:
//            BottomSheetLayout

class <init> extends AnimatorListenerAdapter
{

    protected boolean canceled;
    final BottomSheetLayout this$0;

    public void onAnimationCancel(Animator animator)
    {
        canceled = true;
    }

    private ()
    {
        this$0 = BottomSheetLayout.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
