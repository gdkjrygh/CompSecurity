// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.vim;

import android.widget.Toast;
import com.skype.android.app.Navigation;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncResult;

// Referenced classes of package com.skype.android.app.vim:
//            VideoMessageReviewActivity

final class this._cls0
    implements AsyncCallback
{

    final VideoMessageReviewActivity this$0;

    public final void done(AsyncResult asyncresult)
    {
        boolean flag;
        if (!asyncresult.e())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag && !((Boolean)asyncresult.a()).booleanValue())
        {
            asyncresult = getString(0x7f08044b);
            Toast.makeText(VideoMessageReviewActivity.this, asyncresult, 1).show();
        }
        navigation.chat(VideoMessageReviewActivity.access$000(VideoMessageReviewActivity.this));
    }

    ()
    {
        this$0 = VideoMessageReviewActivity.this;
        super();
    }
}
