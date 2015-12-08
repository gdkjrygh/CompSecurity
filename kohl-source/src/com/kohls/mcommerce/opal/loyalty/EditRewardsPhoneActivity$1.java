// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.loyalty;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

// Referenced classes of package com.kohls.mcommerce.opal.loyalty:
//            EditRewardsPhoneActivity

class val.phoneEditTxt
    implements TextWatcher
{

    final EditRewardsPhoneActivity this$0;
    final EditText val$phoneEditTxt;

    public void afterTextChanged(Editable editable)
    {
        EditRewardsPhoneActivity.access$002(EditRewardsPhoneActivity.this, false);
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        if (val$phoneEditTxt.getText().length() == 0)
        {
            EditRewardsPhoneActivity.access$002(EditRewardsPhoneActivity.this, false);
        }
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        charsequence = val$phoneEditTxt.getText().toString();
        i = val$phoneEditTxt.getText().length();
        if (!EditRewardsPhoneActivity.access$000(EditRewardsPhoneActivity.this))
        {
            if (i == 1)
            {
                val$phoneEditTxt.setText((new StringBuilder()).append("(").append(charsequence).toString());
            }
            if (i == 4)
            {
                val$phoneEditTxt.setText((new StringBuilder()).append(charsequence).append(")").toString());
            }
            if (i == 8)
            {
                val$phoneEditTxt.setText((new StringBuilder()).append(charsequence).append("-").toString());
            }
            val$phoneEditTxt.setSelection(val$phoneEditTxt.getText().toString().length(), val$phoneEditTxt.getText().toString().length());
        }
    }

    A()
    {
        this$0 = final_editrewardsphoneactivity;
        val$phoneEditTxt = EditText.this;
        super();
    }
}
