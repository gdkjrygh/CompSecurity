// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.calling;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.skype.Contact;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncResult;
import com.skype.android.util.ContactUtil;

// Referenced classes of package com.skype.android.app.calling:
//            CallRosterFragment

final class this._cls1
    implements AsyncCallback
{

    final actUtil this$1;

    public final void done(AsyncResult asyncresult)
    {
        ImageView imageview = (ImageView)asyncresult.b();
        asyncresult = (Bitmap)asyncresult.a();
        if (asyncresult != null)
        {
            imageview.setImageBitmap(asyncresult);
            return;
        } else
        {
            asyncresult = (Contact)imageview.getTag();
            imageview.setImageDrawable(contactUtil.a(asyncresult, com.skype.android.res.ze.b));
            return;
        }
    }

    ()
    {
        this$1 = this._cls1.this;
        super();
    }
}
