// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.graphics.Bitmap;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncResult;

// Referenced classes of package com.skype.android.app.chat:
//            ChangeGroupPictureDialog

final class this._cls0
    implements AsyncCallback
{

    final ChangeGroupPictureDialog this$0;

    public final void done(AsyncResult asyncresult)
    {
        if (!asyncresult.d())
        {
            asyncresult = (Bitmap)asyncresult.a();
            setPicture(asyncresult);
        }
    }

    ()
    {
        this$0 = ChangeGroupPictureDialog.this;
        super();
    }
}
