// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.graphics.Bitmap;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncResult;
import com.skype.android.util.ContactUtil;
import com.skype.android.widget.PathClippedImageView;

// Referenced classes of package com.skype.android.app.chat:
//            a

final class this._cls0
    implements AsyncCallback
{

    final a this$0;

    public final void done(AsyncResult asyncresult)
    {
        ble ble;
label0:
        {
            if (!asyncresult.d())
            {
                ble = (yncResult.d)asyncresult.b();
                if (asyncresult.a() != null)
                {
                    break label0;
                }
                asyncresult = contactUtil.b(ble.getContact());
                ble.contactImage.setImageDrawable(asyncresult);
                ble.contactImage.a(false);
            }
            return;
        }
        ble.contactImage.setImageBitmap((Bitmap)asyncresult.a());
        ble.contactImage.a(true);
    }

    yncResult()
    {
        this$0 = a.this;
        super();
    }
}
