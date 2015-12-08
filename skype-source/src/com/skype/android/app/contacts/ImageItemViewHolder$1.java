// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import android.graphics.Bitmap;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncResult;
import com.skype.android.widget.SkypeAvatarView;

// Referenced classes of package com.skype.android.app.contacts:
//            ImageItemViewHolder

final class this._cls0
    implements AsyncCallback
{

    final ImageItemViewHolder this$0;

    public final void done(AsyncResult asyncresult)
    {
        if (!asyncresult.d())
        {
            SkypeAvatarView skypeavatarview = (SkypeAvatarView)asyncresult.b();
            asyncresult = (Bitmap)asyncresult.a();
            if (asyncresult != null)
            {
                skypeavatarview.setImageBitmap(asyncresult);
                skypeavatarview.a(true);
            }
        }
    }

    ()
    {
        this$0 = ImageItemViewHolder.this;
        super();
    }
}
