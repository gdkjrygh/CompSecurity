// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncResult;

// Referenced classes of package com.skype.android.app.chat:
//            ParticipantListFragment

final class this._cls0
    implements AsyncCallback
{

    final ParticipantListFragment this$0;

    public final void done(AsyncResult asyncresult)
    {
        if (!asyncresult.d())
        {
            asyncresult = (Bitmap)asyncresult.a();
            ParticipantListFragment.access$000(ParticipantListFragment.this, asyncresult);
            ParticipantListFragment.access$100(ParticipantListFragment.this).setVisibility(0);
        }
    }

    ()
    {
        this$0 = ParticipantListFragment.this;
        super();
    }
}
