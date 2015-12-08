// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.graphics.Bitmap;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncResult;
import com.skype.android.widget.SkypeAvatarView;

// Referenced classes of package com.skype.android.app.chat:
//            TranslatorSettingDialog

final class this._cls0
    implements AsyncCallback
{

    final TranslatorSettingDialog this$0;

    public final void done(AsyncResult asyncresult)
    {
        Bitmap bitmap = (Bitmap)asyncresult.a();
        asyncresult = (SkypeAvatarView)asyncresult.b();
        if (bitmap != null)
        {
            asyncresult.setImageBitmap(bitmap);
        }
    }

    ()
    {
        this$0 = TranslatorSettingDialog.this;
        super();
    }
}
