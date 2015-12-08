// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.module.messagecenter.view;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;

// Referenced classes of package com.apptentive.android.sdk.module.messagecenter.view:
//            MessageCenterIntroDialog

class val.sendButton
    implements TextWatcher
{

    final MessageCenterIntroDialog this$0;
    final Button val$sendButton;

    public void afterTextChanged(Editable editable)
    {
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        MessageCenterIntroDialog.access$002(MessageCenterIntroDialog.this, charsequence);
        MessageCenterIntroDialog.access$100(MessageCenterIntroDialog.this, val$sendButton);
    }

    ()
    {
        this$0 = final_messagecenterintrodialog;
        val$sendButton = Button.this;
        super();
    }
}
