// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.dialer;

import android.widget.TextView;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncResult;

// Referenced classes of package com.skype.android.app.dialer:
//            DialpadActivity

final class this._cls0
    implements AsyncCallback
{

    final DialpadActivity this$0;

    public final void done(AsyncResult asyncresult)
    {
        contactText.setText((CharSequence)asyncresult.a());
    }

    ()
    {
        this$0 = DialpadActivity.this;
        super();
    }
}
