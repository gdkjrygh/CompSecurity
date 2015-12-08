// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.view.View;
import com.skype.MediaDocument;
import com.skype.Message;

// Referenced classes of package com.skype.android.app.chat:
//            AsyncVideoMessageViewAdapter

final class aViewHolder
    implements android.view.ViewAdapter._cls2
{

    final AsyncVideoMessageViewAdapter this$0;
    final aViewHolder val$asyncMediaViewHolder;
    final MediaDocument val$mediaDocument;
    final Message val$message;

    public final void onClick(View view)
    {
        AsyncVideoMessageViewAdapter.access$000(AsyncVideoMessageViewAdapter.this, val$message, val$mediaDocument, val$asyncMediaViewHolder.isOutgoing());
    }

    aViewHolder()
    {
        this$0 = final_asyncvideomessageviewadapter;
        val$message = message1;
        val$mediaDocument = mediadocument;
        val$asyncMediaViewHolder = aViewHolder.this;
        super();
    }
}
