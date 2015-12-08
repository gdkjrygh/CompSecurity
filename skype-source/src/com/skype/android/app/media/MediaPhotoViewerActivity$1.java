// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.media;

import android.graphics.Bitmap;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncResult;
import com.skype.android.util.NetworkUtil;
import com.skype.android.widget.ProgressCircleView;
import com.skype.android.widget.SqueezeableImageView;

// Referenced classes of package com.skype.android.app.media:
//            MediaPhotoViewerActivity

final class this._cls0
    implements AsyncCallback
{

    final MediaPhotoViewerActivity this$0;

    public final void done(AsyncResult asyncresult)
    {
label0:
        {
            if (asyncresult.e())
            {
                asyncresult = (etMediaLinkResult)asyncresult.a();
                Bitmap bitmap = (Bitmap)asyncresult.getMedia();
                if (bitmap == null)
                {
                    break label0;
                }
                imageView.setBitmap(bitmap);
                imageView.setVisibility(0);
                progressIndicator.setVisibility(8);
                supportInvalidateOptionsMenu();
            }
            return;
        }
        if (asyncresult.getStatus() == com.skype.MEDIA_LOADING && !networkUtil.a())
        {
            MediaPhotoViewerActivity.access$000(MediaPhotoViewerActivity.this);
            return;
        } else
        {
            MediaPhotoViewerActivity.access$100(MediaPhotoViewerActivity.this, asyncresult.getStatus());
            return;
        }
    }

    etMediaLinkResult()
    {
        this$0 = MediaPhotoViewerActivity.this;
        super();
    }
}
