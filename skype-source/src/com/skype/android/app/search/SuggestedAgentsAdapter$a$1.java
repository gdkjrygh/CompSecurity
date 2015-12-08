// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.search;

import android.graphics.Bitmap;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncResult;
import com.skype.android.widget.SkypeAvatarView;

// Referenced classes of package com.skype.android.app.search:
//            SuggestedAgentsAdapter

final class this._cls1
    implements AsyncCallback
{

    final this._cls1 this$1;

    public final void done(AsyncResult asyncresult)
    {
        SkypeAvatarView skypeavatarview = (SkypeAvatarView)asyncresult.b();
        asyncresult = (Bitmap)asyncresult.a();
        if (asyncresult != null)
        {
            skypeavatarview.setImageBitmap(asyncresult);
        }
    }

    ()
    {
        this$1 = this._cls1.this;
        super();
    }
}
