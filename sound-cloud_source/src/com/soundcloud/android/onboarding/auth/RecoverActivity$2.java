// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.onboarding.auth;

import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import com.soundcloud.android.utils.AndroidUtils;

// Referenced classes of package com.soundcloud.android.onboarding.auth:
//            RecoverActivity

class val.emailField
    implements android.view.er
{

    final RecoverActivity this$0;
    final EditText val$emailField;

    public void onClick(View view)
    {
        if (val$emailField.getText().length() == 0)
        {
            AndroidUtils.showToast(RecoverActivity.this, 0x7f07008c, new Object[0]);
            return;
        } else
        {
            RecoverActivity.access$000(RecoverActivity.this, val$emailField.getText().toString());
            return;
        }
    }

    ()
    {
        this$0 = final_recoveractivity;
        val$emailField = EditText.this;
        super();
    }
}
