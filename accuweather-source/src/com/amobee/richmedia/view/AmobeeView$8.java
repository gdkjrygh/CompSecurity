// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.richmedia.view;

import android.view.View;
import android.widget.FrameLayout;

// Referenced classes of package com.amobee.richmedia.view:
//            AmobeeView

class this._cls0
    implements android.view.istener
{

    final AmobeeView this$0;

    public void onClick(View view)
    {
        ((FrameLayout)view).removeAllViews();
        ((FrameLayout)view.getParent()).removeView(view);
        AmobeeView.access$2(AmobeeView.this);
    }

    ()
    {
        this$0 = AmobeeView.this;
        super();
    }
}
