// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.view.View;
import com.skype.MediaDocument;
import com.skype.android.app.NavigationUrl;

// Referenced classes of package com.skype.android.app.chat:
//            TextMessageViewAdapter

final class l.UrlPreviewResult
    implements android.view.ViewAdapter._cls3
{

    final TextMessageViewAdapter this$0;
    final com.skype.android.app.media..UrlPreviewResult val$urlPreviewResult;

    public final void onClick(View view)
    {
        navigationUrl.goToUrl(getContext(), val$urlPreviewResult.getMediaDocument().getWebUrlProp(), false);
        TextMessageViewAdapter.access$400(TextMessageViewAdapter.this, TextMessageViewAdapter.access$300());
    }

    l.UrlPreviewResult()
    {
        this$0 = final_textmessageviewadapter;
        val$urlPreviewResult = com.skype.android.app.media..UrlPreviewResult.this;
        super();
    }
}
