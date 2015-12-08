// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.settings.dialog;

import android.view.KeyEvent;
import android.widget.TextView;
import com.pinterest.ui.text.PEditText;

// Referenced classes of package com.pinterest.activity.settings.dialog:
//            DeactivateSettingReasonDialog

class this._cls0
    implements android.widget.teSettingReasonDialog._cls1
{

    final DeactivateSettingReasonDialog this$0;

    public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        if (i == 6)
        {
            DeactivateSettingReasonDialog.access$000(DeactivateSettingReasonDialog.this).startDeactivateAccountProcess(_deactivationReasonEt.getText().toString());
        } else
        if (i == 5)
        {
            if (_deactivationReasonEt != null)
            {
                _deactivationReasonEt.requestFocus();
                return true;
            }
        } else
        {
            return false;
        }
        return true;
    }

    activationExplanationListener()
    {
        this$0 = DeactivateSettingReasonDialog.this;
        super();
    }
}
