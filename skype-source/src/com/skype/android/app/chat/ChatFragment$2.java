// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.widget.Toast;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncResult;

// Referenced classes of package com.skype.android.app.chat:
//            ChatFragment

final class this._cls0
    implements AsyncCallback
{

    final ChatFragment this$0;

    public final void done(AsyncResult asyncresult)
    {
        if (asyncresult.e() && !((Boolean)asyncresult.a()).booleanValue())
        {
            asyncresult = getString(0x7f080449);
            Toast.makeText(getContext(), asyncresult, 1).show();
        }
    }

    ()
    {
        this$0 = ChatFragment.this;
        super();
    }
}
