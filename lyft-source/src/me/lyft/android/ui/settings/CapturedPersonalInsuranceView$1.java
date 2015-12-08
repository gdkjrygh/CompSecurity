// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.settings;

import android.content.Context;
import android.content.res.Resources;
import android.widget.CompoundButton;

// Referenced classes of package me.lyft.android.ui.settings:
//            CapturedPersonalInsuranceView

class this._cls0
    implements android.widget.stener
{

    final CapturedPersonalInsuranceView this$0;

    public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        if (flag)
        {
            compoundbutton.setTextColor(getContext().getResources().getColor(0x7f0c0001));
            compoundbutton.setButtonDrawable(0x7f020080);
        }
    }

    A()
    {
        this$0 = CapturedPersonalInsuranceView.this;
        super();
    }
}
