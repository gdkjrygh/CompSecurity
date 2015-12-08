// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.signin.dialog;

import android.animation.Animator;
import com.pinterest.ui.progress.LoadingView;

// Referenced classes of package com.pinterest.activity.signin.dialog:
//            PinvitationalRequestInviteDialogView

class val.spinning extends com.pinterest.kit.utils.DialogView._cls3
{

    final PinvitationalRequestInviteDialogView this$0;
    final boolean val$spinning;

    public void onAnimationEnd(Animator animator)
    {
        super.ationEnd(animator);
        animator = _loadingView;
        int i;
        if (val$spinning)
        {
            i = 0;
        } else
        {
            i = 2;
        }
        animator.setState(i);
    }

    Q()
    {
        this$0 = final_pinvitationalrequestinvitedialogview;
        val$spinning = Z.this;
        super();
    }
}
