// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.addlive.view;


// Referenced classes of package com.addlive.view:
//            VideoView, VideoRenderer

class this._cls0
    implements Runnable
{

    final VideoView this$0;

    public void run()
    {
        renderer.onStopRendering();
        requestRender();
    }

    r()
    {
        this$0 = VideoView.this;
        super();
    }
}
