// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.module.engagement.interaction.view;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;

// Referenced classes of package com.apptentive.android.sdk.module.engagement.interaction.view:
//            FeedbackDialogInteractionView

class val.sendButton
    implements TextWatcher
{

    final FeedbackDialogInteractionView this$0;
    final Button val$sendButton;

    public void afterTextChanged(Editable editable)
    {
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        FeedbackDialogInteractionView.access$002(FeedbackDialogInteractionView.this, charsequence);
        FeedbackDialogInteractionView.access$100(FeedbackDialogInteractionView.this, val$sendButton);
    }

    ()
    {
        this$0 = final_feedbackdialoginteractionview;
        val$sendButton = Button.this;
        super();
    }
}
