// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.fragment;

import android.animation.Animator;
import android.view.View;

// Referenced classes of package com.kohls.mcommerce.opal.wallet.fragment:
//            MainActivity

class this._cls0
    implements android.animation.orListener
{

    final MainActivity this$0;

    public void onAnimationCancel(Animator animator)
    {
    }

    public void onAnimationEnd(Animator animator)
    {
        MainActivity.access$1100(MainActivity.this).findViewById(0x7f0d00ab).setVisibility(8);
    }

    public void onAnimationRepeat(Animator animator)
    {
    }

    public void onAnimationStart(Animator animator)
    {
    }

    ()
    {
        this$0 = MainActivity.this;
        super();
    }
}
