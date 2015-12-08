// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.view.View;
import com.skype.MediaDocument;

// Referenced classes of package com.skype.android.app.chat:
//            MojiMediaMessageViewAdapter, ChatFragmentProvider, ChatFragment

final class val.mediaDocument
    implements android.view.ViewAdapter._cls4
{

    final MojiMediaMessageViewAdapter this$0;
    final MediaDocument val$mediaDocument;

    public final void onClick(View view)
    {
        ((ChatFragmentProvider)getContext()).getChatFragment().forwardMoji(val$mediaDocument.getObjectID(), 6, .BUTTON);
    }

    ()
    {
        this$0 = final_mojimediamessageviewadapter;
        val$mediaDocument = MediaDocument.this;
        super();
    }
}
