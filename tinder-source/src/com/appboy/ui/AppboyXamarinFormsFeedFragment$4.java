// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui;

import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.appboy.ui:
//            AppboyXamarinFormsFeedFragment

class this._cls0
    implements android.view.
{

    final AppboyXamarinFormsFeedFragment this$0;

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        return view.getVisibility() == 0;
    }

    ()
    {
        this$0 = AppboyXamarinFormsFeedFragment.this;
        super();
    }
}
