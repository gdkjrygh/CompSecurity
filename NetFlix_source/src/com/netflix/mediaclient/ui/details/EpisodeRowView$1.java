// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.details;

import android.view.View;

// Referenced classes of package com.netflix.mediaclient.ui.details:
//            EpisodeRowView

class Callback
    implements android.view.ner
{

    final EpisodeRowView this$0;
    final com.netflix.mediaclient.android.widget.back val$callback;

    public void onClick(View view)
    {
        val$callback.onRetryRequested();
    }

    Callback()
    {
        this$0 = final_episoderowview;
        val$callback = com.netflix.mediaclient.android.widget.back.this;
        super();
    }
}
