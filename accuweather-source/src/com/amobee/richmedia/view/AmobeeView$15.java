// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.richmedia.view;

import android.view.MotionEvent;
import android.view.View;
import com.amobee.adsdk.Log;

// Referenced classes of package com.amobee.richmedia.view:
//            AmobeeView

class this._cls0
    implements android.view.stener
{

    final AmobeeView this$0;

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        Log.i("AmobeeView", "background touch called");
        return true;
    }

    ()
    {
        this$0 = AmobeeView.this;
        super();
    }
}
