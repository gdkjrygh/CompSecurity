// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.loyalty;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;

// Referenced classes of package com.kohls.mcommerce.opal.loyalty:
//            EditRewardsAddressActivity

class this._cls0
    implements android.widget.er
{

    final EditRewardsAddressActivity this$0;

    public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        if (i == 6)
        {
            findViewById(0x7f0d004a).setVisibility(0);
        }
        return false;
    }

    ()
    {
        this$0 = EditRewardsAddressActivity.this;
        super();
    }
}
