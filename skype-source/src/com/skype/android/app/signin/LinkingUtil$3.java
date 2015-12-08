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

final class val.cid
    implements AsyncCallback
{

    final LinkingUtil this$0;
    final CircleImageView val$avatarImg;
    final String val$cid;

    public final void done(final AsyncResult bitmap)
    {
        if (bitmap != null && bitmap.e())
        {
            bitmap = (byte[])bitmap.a();
            bitmap = BitmapFactory.decodeByteArray(bitmap, 0, bitmap.length);
            LinkingUtil.access$000(LinkingUtil.this).runOnUiThread(new Runnable() {

                final LinkingUtil._cls3 this$1;
                final Bitmap val$bitmap;

                public final void run()
                {
                    if (bitmap != null)
                    {
                        avatarImg.setImageBitmap(bitmap);
                        avatarImg.setTag(0x7f100012, cid);
                    }
                }

            
            {
                this$1 = LinkingUtil._cls3.this;
                bitmap = bitmap1;
                super();
            }
            });
            return;
        }
        Logger logger = LinkingUtil.access$100();
        if ((new StringBuilder("getAvatarAsync error ")).append(bitmap).toString() != null)
        {
            bitmap = bitmap.c().getMessage();
        } else
        {
            bitmap = "";
        }
        logger.warning(bitmap);
    }

    _cls1.val.bitmap()
    {
        this$0 = final_linkingutil;
        val$avatarImg = circleimageview;
        val$cid = String.this;
        super();
    }
}
