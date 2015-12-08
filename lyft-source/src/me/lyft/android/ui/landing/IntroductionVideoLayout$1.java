// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.landing;

import android.media.MediaPlayer;
import me.lyft.android.logging.L;

// Referenced classes of package me.lyft.android.ui.landing:
//            IntroductionVideoLayout

class this._cls0
    implements android.media.r
{

    final IntroductionVideoLayout this$0;

    public boolean onError(MediaPlayer mediaplayer, int i, int j)
    {
        L.d((new StringBuilder()).append("video view error:").append(i).append("|").append(j).toString(), new Object[0]);
        IntroductionVideoLayout.access$000(IntroductionVideoLayout.this);
        return true;
    }

    ()
    {
        this$0 = IntroductionVideoLayout.this;
        super();
    }
}
