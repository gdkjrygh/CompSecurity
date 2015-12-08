// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.module.messagecenter.view;

import android.view.View;
import android.widget.EditText;
import com.apptentive.android.sdk.util.Util;

// Referenced classes of package com.apptentive.android.sdk.module.messagecenter.view:
//            MessageCenterView

class this._cls0
    implements android.view.
{

    final MessageCenterView this$0;

    public void onClick(View view)
    {
        String s = messageEditText.getText().toString().trim();
        if (s.length() == 0)
        {
            return;
        } else
        {
            messageEditText.setText("");
            MessageCenterView.onSendMessageListener.onSendTextMessage(s);
            CharSequence _tmp = MessageCenterView.access$002(null);
            Util.hideSoftKeyboard(context, view);
            return;
        }
    }

    SendMessageListener()
    {
        this$0 = MessageCenterView.this;
        super();
    }
}
