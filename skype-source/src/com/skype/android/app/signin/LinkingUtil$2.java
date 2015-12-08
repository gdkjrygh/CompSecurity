// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import android.graphics.Bitmap;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncResult;
import com.skype.android.widget.CircleImageView;

// Referenced classes of package com.skype.android.app.signin:
//            LinkingUtil

final class this._cls0
    implements AsyncCallback
{

    final LinkingUtil this$0;

    public final void done(AsyncResult asyncresult)
    {
        Bitmap bitmap = (Bitmap)asyncresult.a();
        asyncresult = (CircleImageView)asyncresult.b();
        if (bitmap != null)
        {
            asyncresult.setImageBitmap(bitmap);
        }
    }

    ()
    {
        this$0 = LinkingUtil.this;
        super();
    }
}
