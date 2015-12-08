// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api.dropin.view;

import android.view.animation.Animation;
import android.widget.ImageView;

// Referenced classes of package com.braintreepayments.api.dropin.view:
//            LoadingHeader

class this._cls0
    implements android.view.animation.ionListener
{

    final LoadingHeader this$0;

    public void onAnimationEnd(Animation animation)
    {
        LoadingHeader.access$100(LoadingHeader.this).setVisibility(8);
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
    }

    ()
    {
        this$0 = LoadingHeader.this;
        super();
    }
}
