// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.graphics.Bitmap;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncResult;

// Referenced classes of package com.skype.android.app.chat:
//            MediaMessageViewAdapter

final class this._cls0
    implements AsyncCallback
{

    final MediaMessageViewAdapter this$0;

    public final void done(AsyncResult asyncresult)
    {
        diaMessageViewHolder diamessageviewholder;
        Object obj;
label0:
        {
            if (asyncresult.e())
            {
                diamessageviewholder = (diaMessageViewHolder)asyncresult.b();
                obj = (com.skype.android.app.media.GetMediaLinkResult)asyncresult.a();
                asyncresult = (Bitmap)((com.skype.android.app.media.GetMediaLinkResult) (obj)).getMedia();
                obj = ((com.skype.android.app.media.GetMediaLinkResult) (obj)).getStatus();
                if (asyncresult == null)
                {
                    break label0;
                }
                setThumbnailView(asyncresult, diamessageviewholder);
            }
            return;
        }
        MediaMessageViewAdapter.access$000(MediaMessageViewAdapter.this, ((com.skype.) (obj)), diamessageviewholder);
    }

    .GetMediaLinkResult()
    {
        this$0 = MediaMessageViewAdapter.this;
        super();
    }
}
