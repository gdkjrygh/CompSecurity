// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;


// Referenced classes of package com.millennialmedia.android:
//            InlineVideoView, VideoAd

class this._cls0
    implements Runnable
{

    final InlineVideoView this$0;

    public void run()
    {
        VideoAd.downloadVideoFile(getContext(), InlineVideoView.access$000(InlineVideoView.this).cachedVideoURI, InlineVideoView.access$000(InlineVideoView.this).cachedVideoID);
    }

    lineParams()
    {
        this$0 = InlineVideoView.this;
        super();
    }
}
