// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.calling;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.skype.Message;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncResult;
import com.skype.android.util.ContactUtil;

// Referenced classes of package com.skype.android.app.calling:
//            InCallMessagePopup

final class val.m
    implements AsyncCallback
{

    final InCallMessagePopup this$0;
    final Message val$m;

    public final void done(AsyncResult asyncresult)
    {
        Bitmap bitmap = (Bitmap)asyncresult.a();
        asyncresult = (ImageView)asyncresult.b();
        if (bitmap != null)
        {
            asyncresult.setImageBitmap(bitmap);
            return;
        } else
        {
            asyncresult.setImageDrawable(contactUtil.a(InCallMessagePopup.access$000(InCallMessagePopup.this, val$m), com.skype.android.res.Size.b));
            return;
        }
    }

    ()
    {
        this$0 = final_incallmessagepopup;
        val$m = Message.this;
        super();
    }
}
