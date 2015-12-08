// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.view.View;
import com.skype.MediaDocument;
import com.skype.android.analytics.LogEvent;
import com.skype.android.analytics.SkypeTelemetryEvent;
import com.skype.android.app.NavigationUrl;

// Referenced classes of package com.skype.android.app.chat:
//            MojiMediaMessageViewAdapter

final class val.ctaTitle
    implements android.view.ViewAdapter._cls3
{

    final MojiMediaMessageViewAdapter this$0;
    final String val$ctaTitle;
    final MediaDocument val$mediaDocument;
    final String val$url;

    public final void onClick(View view)
    {
        navigationUrl.goToUrl(getContext(), val$url, true);
        MojiMediaMessageViewAdapter.access$100(MojiMediaMessageViewAdapter.this, new SkypeTelemetryEvent(LogEvent.O), val$mediaDocument, val$ctaTitle);
    }

    ()
    {
        this$0 = final_mojimediamessageviewadapter;
        val$url = s;
        val$mediaDocument = mediadocument;
        val$ctaTitle = String.this;
        super();
    }
}
