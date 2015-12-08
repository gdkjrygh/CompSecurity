// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.view.View;
import com.skype.MediaDocument;
import com.skype.android.app.NavigationUrl;

// Referenced classes of package com.skype.android.app.chat:
//            XmmMessageViewAdapter

final class val.mediaDocument
    implements android.view.ViewAdapter._cls1
{

    final XmmMessageViewAdapter this$0;
    final MediaDocument val$mediaDocument;

    public final void onClick(View view)
    {
        if (isLoaded(val$mediaDocument))
        {
            navigationUrl.goToUrl(getContext(), val$mediaDocument.getWebUrlProp(), true);
        }
    }

    ()
    {
        this$0 = final_xmmmessageviewadapter;
        val$mediaDocument = MediaDocument.this;
        super();
    }
}
