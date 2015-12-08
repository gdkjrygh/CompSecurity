// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget;

import android.graphics.Bitmap;
import com.skype.Contact;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncResult;
import com.skype.android.util.ContactUtil;

// Referenced classes of package com.skype.android.widget:
//            GridListAdapterViewBuilder

private final class b
    implements AsyncCallback
{

    final GridListAdapterViewBuilder a;
    private final Contact b;

    public final void done(AsyncResult asyncresult)
    {
        if (!asyncresult.d())
        {
            Object obj = (Bitmap)asyncresult.a();
            asyncresult = (older)asyncresult.b();
            if (obj != null)
            {
                obj = GridListAdapterViewBuilder.a(a).a(b, ((Bitmap) (obj)));
                GridListAdapterViewBuilder.a(a, asyncresult, b, ((android.graphics.drawable.Drawable) (obj)));
            }
        }
    }

    public older(GridListAdapterViewBuilder gridlistadapterviewbuilder, Contact contact)
    {
        a = gridlistadapterviewbuilder;
        super();
        b = contact;
    }
}
