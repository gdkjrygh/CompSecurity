// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import android.content.Intent;
import android.widget.Button;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncResult;

// Referenced classes of package com.skype.android.app.contacts:
//            OffNetworkInviteActivity

final class this._cls0
    implements AsyncCallback
{

    final OffNetworkInviteActivity this$0;

    public final void done(AsyncResult asyncresult)
    {
        if (asyncresult.e())
        {
            startActivityForResult((Intent)asyncresult.a(), 1);
            OffNetworkInviteActivity.access$302(OffNetworkInviteActivity.this, true);
        }
        inviteButton.setEnabled(true);
    }

    ()
    {
        this$0 = OffNetworkInviteActivity.this;
        super();
    }
}
