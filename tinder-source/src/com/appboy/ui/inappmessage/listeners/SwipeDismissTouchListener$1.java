// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage.listeners;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// Referenced classes of package com.appboy.ui.inappmessage.listeners:
//            SwipeDismissTouchListener

class this._cls0 extends AnimatorListenerAdapter
{

    final SwipeDismissTouchListener this$0;

    public void onAnimationEnd(Animator animator)
    {
        performDismiss();
    }

    ()
    {
        this$0 = SwipeDismissTouchListener.this;
        super();
    }
}
