// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.edge;

import com.brightcove.player.model.Video;

// Referenced classes of package com.brightcove.player.edge:
//            ErrorListener

public abstract class VideoListener extends ErrorListener
{

    public VideoListener()
    {
    }

    public abstract void onVideo(Video video);
}
