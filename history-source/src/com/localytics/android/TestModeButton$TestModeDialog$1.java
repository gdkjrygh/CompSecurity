// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.localytics.android;

import android.view.View;
import android.widget.RelativeLayout;
import java.util.Map;

// Referenced classes of package com.localytics.android:
//            TestModeButton, AmpCallable

class this._cls1
    implements android.view.eDialog._cls1
{

    final is._cls0 this$1;

    public void onClick(View view)
    {
        cess._mth100(this._cls1.this).startAnimation(cess._mth000(this._cls1.this));
        if (TestModeButton.access$200(_fld0) != null)
        {
            view = (AmpCallable)TestModeButton.access$200(_fld0).get(Integer.valueOf(9));
            if (view != null)
            {
                view.call(null);
            }
        }
    }

    ()
    {
        this$1 = this._cls1.this;
        super();
    }
}
