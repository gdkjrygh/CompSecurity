// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import android.widget.CompoundButton;

// Referenced classes of package com.dominos.views:
//            LoyaltyEnrollView

class this._cls0
    implements android.widget.ckedChangeListener
{

    final LoyaltyEnrollView this$0;

    public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        if (flag && LoyaltyEnrollView.access$000(LoyaltyEnrollView.this) != null)
        {
            LoyaltyEnrollView.access$000(LoyaltyEnrollView.this).onLoyaltyCheckBoxClick();
        }
    }

    entListener()
    {
        this$0 = LoyaltyEnrollView.this;
        super();
    }
}
