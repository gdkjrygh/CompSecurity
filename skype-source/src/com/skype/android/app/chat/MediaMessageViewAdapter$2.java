// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.graphics.Bitmap;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncResult;

// Referenced classes of package com.skype.android.app.chat:
//            MediaMessageViewAdapter

final class this._cls0
    implements AsyncCallback
{

    final MediaMessageViewAdapter this$0;

    public final void done(AsyncResult asyncresult)
    {
        if (asyncresult.e())
        {
            diaMessageViewHolder diamessageviewholder = (diaMessageViewHolder)asyncresult.b();
            asyncresult = (Bitmap)asyncresult.a();
            if (asyncresult != null)
            {
                setThumbnailBitmap(asyncresult, diamessageviewholder);
            }
        }
    }

    diaMessageViewHolder()
    {
        this$0 = MediaMessageViewAdapter.this;
        super();
    }
}
