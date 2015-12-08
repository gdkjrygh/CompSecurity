// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.media;

import com.skype.MediaDocument;
import com.skype.android.event.EventBus;

// Referenced classes of package com.skype.android.app.media:
//            MediaDocumentUploadUtil, OnMediaUploadRetry

final class val.messageId
    implements Runnable
{

    final MediaDocumentUploadUtil this$0;
    final MediaDocument val$mediaDocument;
    final int val$messageId;

    public final void run()
    {
        boolean flag = MediaDocumentUploadUtil.access$400(MediaDocumentUploadUtil.this, val$mediaDocument);
        MediaDocumentUploadUtil.access$500(MediaDocumentUploadUtil.this).a(new OnMediaUploadRetry(val$messageId, val$mediaDocument.getObjectID(), flag));
    }

    ()
    {
        this$0 = final_mediadocumentuploadutil;
        val$mediaDocument = mediadocument;
        val$messageId = I.this;
        super();
    }
}
