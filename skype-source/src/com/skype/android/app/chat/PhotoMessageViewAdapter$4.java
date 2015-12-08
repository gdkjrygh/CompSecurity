// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.view.View;
import com.skype.MediaDocument;

// Referenced classes of package com.skype.android.app.chat:
//            PhotoMessageViewAdapter

final class val.mediaDocument
    implements android.view.ViewAdapter._cls4
{

    final PhotoMessageViewAdapter this$0;
    final MediaDocument val$mediaDocument;
    final int val$messageId;

    public final void onClick(View view)
    {
        PhotoMessageViewAdapter.access$000(PhotoMessageViewAdapter.this, val$messageId, val$mediaDocument.getObjectID());
    }

    ()
    {
        this$0 = final_photomessageviewadapter;
        val$messageId = i;
        val$mediaDocument = MediaDocument.this;
        super();
    }
}
