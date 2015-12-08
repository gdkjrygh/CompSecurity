// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;


// Referenced classes of package com.adobe.mediacore:
//            ContentPlacementCompletedListener, DefaultMediaPlayer, MediaPlayerClient

class this._cls0
    implements ContentPlacementCompletedListener
{

    final DefaultMediaPlayer this$0;

    public void onCompleted()
    {
        if (DefaultMediaPlayer.access$400(DefaultMediaPlayer.this) != null && DefaultMediaPlayer.access$400(DefaultMediaPlayer.this).doneInitialResolving())
        {
            endAdResolving();
        }
    }

    etedListener()
    {
        this$0 = DefaultMediaPlayer.this;
        super();
    }
}
