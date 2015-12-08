// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import android.media.MediaPlayer;
import java.lang.ref.WeakReference;

// Referenced classes of package com.millennialmedia.android:
//            InlineVideoView, MMLayout, MMLog

class this._cls0
    implements android.media.rListener
{

    final InlineVideoView this$0;

    public boolean onError(MediaPlayer mediaplayer, int i, int j)
    {
        mediaplayer = (MMLayout)InlineVideoView.access$600(InlineVideoView.this).get();
        if (mediaplayer == null)
        {
            MMLog.e("InlineVideoView", "Unable to handle error, MMLayout weak reference broken");
            return true;
        } else
        {
            mediaplayer.loadUrl((new StringBuilder()).append("javascript:MMJS.setError(").append(String.format("Error while playing, %d - %d", new Object[] {
                Integer.valueOf(i), Integer.valueOf(j)
            })).append(");").toString());
            return true;
        }
    }

    ()
    {
        this$0 = InlineVideoView.this;
        super();
    }
}
