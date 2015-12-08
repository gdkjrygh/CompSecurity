// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.view.View;
import com.skype.MediaDocument;
import com.skype.Message;

// Referenced classes of package com.skype.android.app.chat:
//            AsyncMediaViewAdapter

final class val.message
    implements android.view.ViewAdapter._cls1
{

    final AsyncMediaViewAdapter this$0;
    final MediaDocument val$mediaDocument;
    final Message val$message;

    public final void onClick(View view)
    {
        onMediaItemClick(val$mediaDocument, val$message);
    }

    ()
    {
        this$0 = final_asyncmediaviewadapter;
        val$mediaDocument = mediadocument;
        val$message = Message.this;
        super();
    }
}
