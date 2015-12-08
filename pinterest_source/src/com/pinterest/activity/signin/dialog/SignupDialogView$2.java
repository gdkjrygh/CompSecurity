// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.signin.dialog;

import android.view.View;
import android.widget.RadioGroup;

// Referenced classes of package com.pinterest.activity.signin.dialog:
//            SignupDialogView

class _lastGenderBt
    implements android.view.r
{

    public int _lastGenderBt;
    final SignupDialogView this$0;

    public void onClick(View view)
    {
        if (_lastGenderBt == view.getId() && view.getId() == _genderGp.getCheckedRadioButtonId())
        {
            _genderGp.clearCheck();
            _lastGenderBt = -1;
            return;
        } else
        {
            _lastGenderBt = _genderGp.getCheckedRadioButtonId();
            return;
        }
    }

    ()
    {
        this$0 = SignupDialogView.this;
        super();
        _lastGenderBt = -1;
    }
}
