// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui;

import android.support.v4.view.GestureDetectorCompat;
import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.appboy.ui:
//            AppboyFeedFragment

class this._cls0
    implements android.view.
{

    final AppboyFeedFragment this$0;

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        return AppboyFeedFragment.access$200(AppboyFeedFragment.this).a(motionevent);
    }

    ctorCompat()
    {
        this$0 = AppboyFeedFragment.this;
        super();
    }
}
