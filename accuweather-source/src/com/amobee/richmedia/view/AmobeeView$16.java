// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.richmedia.view;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.amobee.richmedia.controller.util.OrmmaPlayerListener;

// Referenced classes of package com.amobee.richmedia.view:
//            AmobeeView

class this._cls0
    implements OrmmaPlayerListener
{

    final AmobeeView this$0;

    public void onComplete()
    {
        FrameLayout framelayout = (FrameLayout)getRootView().findViewById(BACKGROUND_ID);
        ((ViewGroup)framelayout.getParent()).removeView(framelayout);
        setVisibility(0);
    }

    public void onError()
    {
        onComplete();
    }

    public void onPrepared()
    {
    }

    maPlayerListener()
    {
        this$0 = AmobeeView.this;
        super();
    }
}
