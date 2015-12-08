// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncResult;
import com.skype.android.widget.CircleImageView;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.app.signin:
//            LinkingUtil

final class val.bitmap
    implements Runnable
{

    final l.cid this$1;
    final Bitmap val$bitmap;

    public final void run()
    {
        if (val$bitmap != null)
        {
            avatarImg.setImageBitmap(val$bitmap);
            avatarImg.setTag(0x7f100012, cid);
        }
    }

    l.cid()
    {
        this$1 = final_cid;
        val$bitmap = Bitmap.this;
        super();
    }

    // Unreferenced inner class com/skype/android/app/signin/LinkingUtil$3

/* anonymous class */
    final class LinkingUtil._cls3
        implements AsyncCallback
    {

        final LinkingUtil this$0;
        final CircleImageView val$avatarImg;
        final String val$cid;

        public final void done(AsyncResult asyncresult)
        {
            if (asyncresult != null && asyncresult.e())
            {
                asyncresult = (byte[])asyncresult.a();
                asyncresult = BitmapFactory.decodeByteArray(asyncresult, 0, asyncresult.length);
                LinkingUtil.access$000(LinkingUtil.this).runOnUiThread(asyncresult. new LinkingUtil._cls3._cls1());
                return;
            }
            Logger logger = LinkingUtil.access$100();
            if ((new StringBuilder("getAvatarAsync error ")).append(asyncresult).toString() != null)
            {
                asyncresult = asyncresult.c().getMessage();
            } else
            {
                asyncresult = "";
            }
            logger.warning(asyncresult);
        }

            
            {
                this$0 = final_linkingutil;
                avatarImg = circleimageview;
                cid = String.this;
                super();
            }
    }

}
