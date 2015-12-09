// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.view.pagingindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// Referenced classes of package com.google.android.libraries.view.pagingindicator:
//            PagingIndicator

final class val.this._cls0 extends AnimatorListenerAdapter
{

    final n this$1;
    final PagingIndicator val$this$0;

    public final void onAnimationEnd(Animator animator)
    {
        PagingIndicator.access$1600(_fld0, cess._mth1700(this._cls1.this), 0.0F);
        postInvalidateOnAnimation();
    }

    ()
    {
        this$1 = final_;
        val$this$0 = PagingIndicator.this;
        super();
    }
}
