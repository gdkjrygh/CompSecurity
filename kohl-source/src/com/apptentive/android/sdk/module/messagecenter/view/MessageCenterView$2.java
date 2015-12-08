// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.module.messagecenter.view;

import android.text.Editable;
import android.text.TextWatcher;

// Referenced classes of package com.apptentive.android.sdk.module.messagecenter.view:
//            MessageCenterView

class this._cls0
    implements TextWatcher
{

    final MessageCenterView this$0;

    public void afterTextChanged(Editable editable)
    {
        CharSequence _tmp = MessageCenterView.access$002(editable.toString());
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    ()
    {
        this$0 = MessageCenterView.this;
        super();
    }
}
