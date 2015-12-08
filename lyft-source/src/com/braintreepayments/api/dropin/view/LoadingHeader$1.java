// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api.dropin.view;

import android.view.animation.Animation;
import android.widget.TextView;

// Referenced classes of package com.braintreepayments.api.dropin.view:
//            LoadingHeader

class this._cls0
    implements android.view.animation.ionListener
{

    final LoadingHeader this$0;

    public void onAnimationEnd(Animation animation)
    {
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
        LoadingHeader.access$000(LoadingHeader.this).setVisibility(0);
    }

    ()
    {
        this$0 = LoadingHeader.this;
        super();
    }
}
