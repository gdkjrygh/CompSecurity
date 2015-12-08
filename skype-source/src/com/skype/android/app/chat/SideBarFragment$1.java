// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncResult;
import com.skype.android.widget.PathClippedImageView;

// Referenced classes of package com.skype.android.app.chat:
//            SideBarFragment

final class this._cls0
    implements AsyncCallback
{

    final SideBarFragment this$0;

    public final void done(AsyncResult asyncresult)
    {
        PathClippedImageView pathclippedimageview = (PathClippedImageView)asyncresult.b();
        if (asyncresult.a() != null)
        {
            pathclippedimageview.setImageBitmap((Bitmap)asyncresult.a());
            pathclippedimageview.a(true);
            if (avatarImageProtection != null)
            {
                avatarImageProtection.setVisibility(0);
            }
        }
    }

    ()
    {
        this$0 = SideBarFragment.this;
        super();
    }
}
