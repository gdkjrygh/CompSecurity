// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import android.graphics.Bitmap;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncResult;
import com.skype.android.util.ContactUtil;

// Referenced classes of package com.skype.android.app.contacts:
//            ContactAdapterViewBuilder, ContactItem

final class this._cls0
    implements AsyncCallback
{

    final ContactAdapterViewBuilder this$0;

    public final void done(AsyncResult asyncresult)
    {
        if (!asyncresult.d())
        {
            Object obj = (emHolder)asyncresult.b();
            com.skype.android.widget.SkypeAvatarView skypeavatarview = ((emHolder) (obj)).avatarView;
            asyncresult = (Bitmap)asyncresult.a();
            if (asyncresult != null)
            {
                obj = ((emHolder) (obj)).contact;
                ContactAdapterViewBuilder.access$100(ContactAdapterViewBuilder.this, skypeavatarview, ContactAdapterViewBuilder.access$000(ContactAdapterViewBuilder.this).a(((ContactItem) (obj)).getIdentity(), ((ContactItem) (obj)).getType(), ((ContactItem) (obj)).isBlocked(), asyncresult));
            }
        }
    }

    emHolder()
    {
        this$0 = ContactAdapterViewBuilder.this;
        super();
    }
}
