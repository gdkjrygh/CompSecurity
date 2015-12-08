// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.megaphone;

import android.view.animation.Animation;
import android.widget.ListView;

// Referenced classes of package com.pinterest.ui.megaphone:
//            MegaphoneView

class this._cls0
    implements android.view.animation.ionListener
{

    final MegaphoneView this$0;

    public void onAnimationEnd(Animation animation)
    {
        setVisibility(8);
        if (MegaphoneView.access$200(MegaphoneView.this) != null)
        {
            MegaphoneView.access$200(MegaphoneView.this).removeHeaderView(MegaphoneView.this);
        }
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
    }

    istener()
    {
        this$0 = MegaphoneView.this;
        super();
    }
}
