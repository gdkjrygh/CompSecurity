// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import android.animation.Animator;
import android.animation.AnimatorSet;

// Referenced classes of package com.skype.android.app.signin:
//            LinkingAccountsAnimationActivity

final class this._cls1
    implements android.animation.tivity.a._cls1
{

    final is._cls0 this$1;

    public final void onAnimationCancel(Animator animator)
    {
    }

    public final void onAnimationEnd(Animator animator)
    {
        if (!LinkingAccountsAnimationActivity.access$200(_fld0))
        {
            cess._mth300(this._cls1.this).start();
            return;
        } else
        {
            LinkingAccountsAnimationActivity.access$100(_fld0);
            cess._mth400(this._cls1.this).start();
            return;
        }
    }

    public final void onAnimationRepeat(Animator animator)
    {
    }

    public final void onAnimationStart(Animator animator)
    {
        LinkingAccountsAnimationActivity.access$100(_fld0);
    }

    ()
    {
        this$1 = this._cls1.this;
        super();
    }
}
