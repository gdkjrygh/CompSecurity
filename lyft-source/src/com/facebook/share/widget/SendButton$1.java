// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.widget;

import android.view.View;

// Referenced classes of package com.facebook.share.widget:
//            SendButton, MessageDialog

class this._cls0
    implements android.view.istener
{

    final SendButton this$0;

    public void onClick(View view)
    {
        SendButton.access$000(SendButton.this, view);
        if (getFragment() != null)
        {
            view = new MessageDialog(getFragment(), getRequestCode());
        } else
        {
            view = new MessageDialog(SendButton.access$100(SendButton.this), getRequestCode());
        }
        view.show(getShareContent());
    }

    ()
    {
        this$0 = SendButton.this;
        super();
    }
}
