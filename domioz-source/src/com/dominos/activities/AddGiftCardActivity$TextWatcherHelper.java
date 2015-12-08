// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;

// Referenced classes of package com.dominos.activities:
//            AddGiftCardActivity

class slaveButton
    implements TextWatcher
{

    private int maxLength;
    private Button slaveButton;
    final AddGiftCardActivity this$0;

    public void afterTextChanged(Editable editable)
    {
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        if (charsequence.length() == maxLength)
        {
            if (checkIfFieldsComplete())
            {
                enableButton(slaveButton);
            }
            return;
        } else
        {
            disableButton(slaveButton);
            return;
        }
    }

    public (int i, Button button)
    {
        this$0 = AddGiftCardActivity.this;
        super();
        maxLength = i;
        slaveButton = button;
    }
}
