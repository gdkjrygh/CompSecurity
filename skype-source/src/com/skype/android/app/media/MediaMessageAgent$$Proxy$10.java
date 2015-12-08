// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.media;

import com.skype.android.event.EventFilter;

// Referenced classes of package com.skype.android.app.media:
//            MediaMessageAgent, OnMediaUploadRetry

final class this._cls0
    implements EventFilter
{

    final accept this$0;

    public final boolean accept(OnMediaUploadRetry onmediauploadretry)
    {
        return ((MediaMessageAgent)Target()).onAcceptEvent(onmediauploadretry);
    }

    public final volatile boolean accept(Object obj)
    {
        return accept((OnMediaUploadRetry)obj);
    }

    ()
    {
        this$0 = this._cls0.this;
        super();
    }
}
