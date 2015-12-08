// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.caption.adapter;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

// Referenced classes of package com.phunware.nbc.sochi.caption.adapter:
//            UndoBarController

class this._cls0 extends AnimatorListenerAdapter
{

    final UndoBarController this$0;

    public void onAnimationEnd(Animator animator)
    {
        UndoBarController.access$200(UndoBarController.this).setVisibility(8);
        UndoBarController.access$302(UndoBarController.this, null);
        UndoBarController.access$002(UndoBarController.this, null);
    }

    ()
    {
        this$0 = UndoBarController.this;
        super();
    }
}
