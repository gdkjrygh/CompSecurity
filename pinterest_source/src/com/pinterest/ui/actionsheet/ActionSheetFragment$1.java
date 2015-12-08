// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.actionsheet;

import android.animation.Animator;
import android.support.v4.app.FragmentActivity;

// Referenced classes of package com.pinterest.ui.actionsheet:
//            ActionSheetFragment

class tener extends com.pinterest.kit.utils.onListener
{

    final ActionSheetFragment this$0;

    public void onAnimationEnd(Animator animator)
    {
        if (getActivity() != null)
        {
            getActivity().onBackPressed();
        }
    }

    tener()
    {
        this$0 = ActionSheetFragment.this;
        super();
    }
}
