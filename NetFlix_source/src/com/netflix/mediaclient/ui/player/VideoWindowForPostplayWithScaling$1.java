// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.player;


// Referenced classes of package com.netflix.mediaclient.ui.player:
//            VideoWindowForPostplayWithScaling

class val.scale
    implements Runnable
{

    final VideoWindowForPostplayWithScaling this$0;
    final int val$leftMargin;
    final float val$scale;
    final int val$topMargin;

    public void run()
    {
        resizeSurfaceView(val$leftMargin, val$topMargin, val$scale);
        resizeTextureView(val$leftMargin, val$topMargin);
    }

    ()
    {
        this$0 = final_videowindowforpostplaywithscaling;
        val$leftMargin = i;
        val$topMargin = j;
        val$scale = F.this;
        super();
    }
}
