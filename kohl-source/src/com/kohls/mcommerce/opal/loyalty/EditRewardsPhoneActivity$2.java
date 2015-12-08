// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.loyalty;

import android.view.KeyEvent;
import android.view.View;

// Referenced classes of package com.kohls.mcommerce.opal.loyalty:
//            EditRewardsPhoneActivity

class this._cls0
    implements android.view.ardsPhoneActivity._cls2
{

    final EditRewardsPhoneActivity this$0;

    public boolean onKey(View view, int i, KeyEvent keyevent)
    {
        switch (i)
        {
        default:
            EditRewardsPhoneActivity.access$002(EditRewardsPhoneActivity.this, false);
            return false;

        case 67: // 'C'
            EditRewardsPhoneActivity.access$002(EditRewardsPhoneActivity.this, true);
            break;
        }
        return false;
    }

    A()
    {
        this$0 = EditRewardsPhoneActivity.this;
        super();
    }
}
