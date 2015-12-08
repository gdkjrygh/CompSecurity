// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import android.app.NotificationManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import com.skype.Contact;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncResult;
import com.skype.android.util.ImageCache;

// Referenced classes of package com.skype.android.app.contacts:
//            ContactAgent

final class val.contact
    implements AsyncCallback
{

    final ContactAgent this$0;
    final Contact val$contact;
    final Context val$context;

    public final void done(AsyncResult asyncresult)
    {
        Bitmap bitmap = (Bitmap)asyncresult.a();
        android.support.v4.app.lt lt = (android.support.v4.app.lt.a)asyncresult.b();
        if (bitmap == null)
        {
            asyncresult = imageCache.a();
        } else
        {
            asyncresult = Bitmap.createScaledBitmap(bitmap, val$context.getResources().getDimensionPixelSize(0x1050005), val$context.getResources().getDimensionPixelSize(0x1050006), true);
        }
        lt.sionPixelSize = asyncresult;
        notificationManager.notify(val$contact.getObjectID(), lt.contact());
    }

    ()
    {
        this$0 = final_contactagent;
        val$context = context1;
        val$contact = Contact.this;
        super();
    }
}
