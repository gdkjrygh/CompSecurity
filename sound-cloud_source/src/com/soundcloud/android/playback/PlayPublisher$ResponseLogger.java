// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import com.soundcloud.android.api.ApiResponse;
import com.soundcloud.android.rx.observers.DefaultSubscriber;

// Referenced classes of package com.soundcloud.android.playback:
//            PlayPublisher

private static class <init> extends DefaultSubscriber
{

    public void onNext(ApiResponse apiresponse)
    {
        (new StringBuilder("Posted play with response code ")).append(apiresponse.getStatusCode());
    }

    public volatile void onNext(Object obj)
    {
        onNext((ApiResponse)obj);
    }

    private ()
    {
    }

    ( )
    {
        this();
    }
}
