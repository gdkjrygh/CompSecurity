// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.onboarding;

import android.widget.RadioButton;
import android.widget.RadioGroup;

// Referenced classes of package com.soundcloud.android.onboarding:
//            OnboardActivity

class this._cls0
    implements android.support.v4.view.angeListener
{

    final OnboardActivity this$0;

    public void onPageScrollStateChanged(int i)
    {
    }

    public void onPageScrolled(int i, float f, int j)
    {
    }

    public void onPageSelected(int i)
    {
        RadioGroup radiogroup = (RadioGroup)findViewById(0x7f0f0269);
        int j = 0;
        while (j < radiogroup.getChildCount()) 
        {
            RadioButton radiobutton = (RadioButton)radiogroup.getChildAt(j);
            boolean flag;
            if (j == i)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            radiobutton.setChecked(flag);
            j++;
        }
    }

    er()
    {
        this$0 = OnboardActivity.this;
        super();
    }
}
