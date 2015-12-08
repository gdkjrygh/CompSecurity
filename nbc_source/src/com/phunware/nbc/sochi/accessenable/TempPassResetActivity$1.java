// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.accessenable;

import android.widget.EditText;
import android.widget.RadioGroup;

// Referenced classes of package com.phunware.nbc.sochi.accessenable:
//            TempPassResetActivity

class this._cls0
    implements android.widget.geListener
{

    final TempPassResetActivity this$0;

    public void onCheckedChanged(RadioGroup radiogroup, int i)
    {
        i = radiogroup.indexOfChild(radiogroup.findViewById(radiogroup.getCheckedRadioButtonId()));
        radiogroup = TempPassResetActivity.access$000(TempPassResetActivity.this);
        boolean flag;
        if (i == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        radiogroup.setEnabled(flag);
        if (!TempPassResetActivity.access$000(TempPassResetActivity.this).isEnabled())
        {
            TempPassResetActivity.access$000(TempPassResetActivity.this).setText("");
        }
    }

    A()
    {
        this$0 = TempPassResetActivity.this;
        super();
    }
}
