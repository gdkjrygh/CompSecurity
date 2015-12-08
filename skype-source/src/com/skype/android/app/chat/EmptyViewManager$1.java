// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.graphics.Bitmap;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncResult;
import com.skype.android.widget.PathClippedImageView;

// Referenced classes of package com.skype.android.app.chat:
//            EmptyViewManager

final class this._cls0
    implements AsyncCallback
{

    final EmptyViewManager this$0;

    public final void done(AsyncResult asyncresult)
    {
        if (!asyncresult.d())
        {
            PathClippedImageView pathclippedimageview = (PathClippedImageView)asyncresult.b();
            asyncresult = (Bitmap)asyncresult.a();
            if (asyncresult != null)
            {
                pathclippedimageview.setImageBitmap(asyncresult);
                pathclippedimageview.a(true);
            } else
            {
                EmptyViewManager.access$000(EmptyViewManager.this, pathclippedimageview);
                pathclippedimageview.a(false);
            }
            pathclippedimageview.setVisibility(0);
        }
    }

    ()
    {
        this$0 = EmptyViewManager.this;
        super();
    }
}
