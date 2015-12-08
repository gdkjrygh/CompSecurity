// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.CheckBox;
import android.widget.RelativeLayout;
import java.util.regex.Pattern;

// Referenced classes of package com.dominos.activities:
//            AddCreditCardActivity

class saveToProfileCheckBox
    implements TextWatcher
{

    private CheckBox saveToProfileCheckBox;
    private RelativeLayout saveToProfileLayout;
    final AddCreditCardActivity this$0;

    private boolean isZipValid(Editable editable)
    {
        return Pattern.matches("\\d{5}", editable.toString().trim());
    }

    public void afterTextChanged(Editable editable)
    {
        boolean flag = isZipValid(editable);
        editable = saveToProfileLayout;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        editable.setVisibility(i);
        if (!flag)
        {
            saveToProfileCheckBox.setChecked(false);
            onSaveToProfileClick();
        }
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public (RelativeLayout relativelayout, CheckBox checkbox)
    {
        this$0 = AddCreditCardActivity.this;
        super();
        saveToProfileLayout = relativelayout;
        saveToProfileCheckBox = checkbox;
    }
}
