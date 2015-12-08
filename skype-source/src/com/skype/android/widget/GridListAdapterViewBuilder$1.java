// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget;

import android.graphics.Bitmap;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncResult;

// Referenced classes of package com.skype.android.widget:
//            GridListAdapterViewBuilder, SkypeAvatarView

final class a
    implements AsyncCallback
{

    final older a;
    final GridListAdapterViewBuilder b;

    public final void done(AsyncResult asyncresult)
    {
        if (!asyncresult.d())
        {
            SkypeAvatarView skypeavatarview = (SkypeAvatarView)asyncresult.b();
            asyncresult = (Bitmap)asyncresult.a();
            if (asyncresult != null)
            {
                skypeavatarview.setImageBitmap(asyncresult);
                GridListAdapterViewBuilder.a(a);
            }
        }
    }

    older(GridListAdapterViewBuilder gridlistadapterviewbuilder, older older)
    {
        b = gridlistadapterviewbuilder;
        a = older;
        super();
    }
}
