// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util;

import android.graphics.Bitmap;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncResult;
import com.skype.android.widget.PathClippedImageView;

// Referenced classes of package com.skype.android.util:
//            ContactUtil

final class a
    implements AsyncCallback
{

    final ContactUtil a;

    public final void done(AsyncResult asyncresult)
    {
        if (!asyncresult.d())
        {
            Bitmap bitmap = (Bitmap)asyncresult.a();
            asyncresult = (PathClippedImageView)asyncresult.b();
            if (bitmap != null)
            {
                asyncresult.setImageBitmap(bitmap);
                asyncresult.a(true);
            }
        }
    }

    ult(ContactUtil contactutil)
    {
        a = contactutil;
        super();
    }
}
