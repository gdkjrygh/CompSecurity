// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.account;

import android.view.View;
import android.widget.CompoundButton;

// Referenced classes of package com.skype.android.app.account:
//            CallForwardingActivity

final class this._cls0
    implements android.view.ardingActivity._cls2
{

    final CallForwardingActivity this$0;

    public final void onClick(View view)
    {
        if (!forwardCallsCheckBox.isChecked())
        {
            forwardCallsCheckBox.setChecked(true);
            return;
        } else
        {
            CallForwardingActivity.access$000(CallForwardingActivity.this, 13, false, null);
            return;
        }
    }

    ()
    {
        this$0 = CallForwardingActivity.this;
        super();
    }
}
