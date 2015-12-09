// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.details;


// Referenced classes of package com.netflix.mediaclient.ui.details:
//            EpisodeListFrag

class this._cls0
    implements com.netflix.mediaclient.android.widget.ack
{

    final EpisodeListFrag this$0;

    public void onRetryRequested()
    {
        android.app.Activity activity = getActivity();
        if (activity instanceof com.netflix.mediaclient.android.widget.ack)
        {
            ((com.netflix.mediaclient.android.widget.ack)activity).onRetryRequested();
        }
    }

    allback()
    {
        this$0 = EpisodeListFrag.this;
        super();
    }
}
