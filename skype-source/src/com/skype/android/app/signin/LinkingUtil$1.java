// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncResult;
import com.skype.android.widget.CircleImageView;

// Referenced classes of package com.skype.android.app.signin:
//            LinkingUtil

final class val.avatarImg
    implements AsyncCallback
{

    final LinkingUtil this$0;
    final CircleImageView val$avatarImg;
    final String val$avatarUrl;

    public final void done(AsyncResult asyncresult)
    {
        ImageView imageview = (ImageView)asyncresult.b();
        if (asyncresult.a() != null && hasQueryParam(val$avatarUrl))
        {
            imageview.setImageBitmap((Bitmap)asyncresult.a());
            val$avatarImg.setTag(0x7f100012, val$avatarUrl);
        }
    }

    ()
    {
        this$0 = final_linkingutil;
        val$avatarUrl = s;
        val$avatarImg = CircleImageView.this;
        super();
    }
}
