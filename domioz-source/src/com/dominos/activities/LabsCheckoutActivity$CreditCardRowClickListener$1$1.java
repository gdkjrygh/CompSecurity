// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import android.widget.RadioButton;
import com.dominos.android.sdk.core.user.UserProfileManager;

// Referenced classes of package com.dominos.activities:
//            LabsCheckoutActivity

class this._cls2
    implements Runnable
{

    final is._cls1 this$2;

    public void run()
    {
        if (mProfileManager.isAuthorizedUser())
        {
            LabsCheckoutActivity.access$400(_fld0);
            LabsCheckoutActivity.access$200(_fld0);
            rb.setChecked(true);
            LabsCheckoutActivity.access$300(_fld0, ss._mth1500(_fld1));
        }
    }

    ()
    {
        this$2 = this._cls2.this;
        super();
    }
}
