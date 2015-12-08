// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.calling;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.skype.Conversation;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncResult;
import com.skype.android.res.DefaultAvatars;
import com.skype.android.util.ContactUtil;
import com.skype.android.widget.CircleImageView;

// Referenced classes of package com.skype.android.app.calling:
//            PreCallActivity

final class this._cls0
    implements AsyncCallback
{

    final PreCallActivity this$0;

    public final void done(AsyncResult asyncresult)
    {
        ImageView imageview = (ImageView)asyncresult.b();
        asyncresult = (Bitmap)asyncresult.a();
        if (asyncresult != null)
        {
            imageview.setImageBitmap(asyncresult);
        } else
        if (PreCallActivity.access$200(PreCallActivity.this))
        {
            avatarImage.setImageDrawable(contactUtil.c(PreCallActivity.access$300(PreCallActivity.this)));
        } else
        {
            avatarImage.setImageDrawable(defaultAvatars.a(com.skype.android.res.tarType.d, com.skype.android.res.tarSize.c, PreCallActivity.access$400(PreCallActivity.this).getIdentityProp()));
        }
        imageview.setVisibility(0);
    }

    ()
    {
        this$0 = PreCallActivity.this;
        super();
    }
}
