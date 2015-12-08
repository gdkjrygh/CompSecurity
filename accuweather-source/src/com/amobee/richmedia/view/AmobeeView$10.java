// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.richmedia.view;

import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package com.amobee.richmedia.view:
//            AmobeeView

class this._cls0
    implements android.view.stener
{

    final AmobeeView this$0;

    public void onClick(View view)
    {
        ((ViewGroup)view).removeAllViews();
        ((ViewGroup)view.getParent()).removeView(view);
        if (mViewState == wState.INTERSTITIAL)
        {
            closeInterstitial();
            return;
        } else
        {
            closeExpanded();
            return;
        }
    }

    wState()
    {
        this$0 = AmobeeView.this;
        super();
    }
}
