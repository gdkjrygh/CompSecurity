// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncResult;
import com.skype.android.util.ContactUtil;
import com.skype.android.widget.PathClippedImageView;
import com.skype.android.widget.PathType;

// Referenced classes of package com.skype.android.app.contacts:
//            ContactProfileFragment

final class this._cls0
    implements AsyncCallback
{

    final ContactProfileFragment this$0;

    public final void done(AsyncResult asyncresult)
    {
        ImageView imageview = (ImageView)asyncresult.b();
        Object obj = contactUtil;
        boolean flag = ContactUtil.p(ContactProfileFragment.access$100(ContactProfileFragment.this));
        PathClippedImageView pathclippedimageview = avatarImage;
        if (flag)
        {
            obj = PathType.b;
        } else
        {
            obj = PathType.a;
        }
        pathclippedimageview.setPathType(((PathType) (obj)));
        if (asyncresult.a() != null)
        {
            avatarImage.a(true);
            avatarImage.setImageBitmap((Bitmap)asyncresult.a());
        } else
        {
            avatarImage.a(false);
            avatarImage.setImageDrawable(contactUtil.c(ContactProfileFragment.access$100(ContactProfileFragment.this)));
        }
        imageview.setVisibility(0);
    }

    ()
    {
        this$0 = ContactProfileFragment.this;
        super();
    }
}
