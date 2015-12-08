// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.widget.route;

import android.view.animation.Animation;

// Referenced classes of package com.thetransitapp.droid.widget.route:
//            RouteItemListener, RouteUiHandlers

class this._cls0
    implements android.view.animation.istener
{

    final RouteItemListener this$0;

    public void onAnimationEnd(Animation animation)
    {
        RouteItemListener.access$1(RouteItemListener.this).onClick(kType.MENU_OPEN, RouteItemListener.access$2(RouteItemListener.this));
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
    }

    kType()
    {
        this$0 = RouteItemListener.this;
        super();
    }
}
