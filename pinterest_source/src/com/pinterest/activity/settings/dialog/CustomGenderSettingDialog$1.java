// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.settings.dialog;

import android.view.KeyEvent;
import android.widget.TextView;
import com.pinterest.ui.text.PEditText;

// Referenced classes of package com.pinterest.activity.settings.dialog:
//            CustomGenderSettingDialog

class this._cls0
    implements android.widget.ner
{

    final CustomGenderSettingDialog this$0;

    public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        if (i == 6)
        {
            CustomGenderSettingDialog.access$000(CustomGenderSettingDialog.this).setCustomGender(_customGenderEt.getText().toString());
        } else
        if (i == 5)
        {
            if (_customGenderEt != null)
            {
                _customGenderEt.requestFocus();
                return true;
            }
        } else
        {
            return false;
        }
        return true;
    }

    stomGenderListener()
    {
        this$0 = CustomGenderSettingDialog.this;
        super();
    }
}
