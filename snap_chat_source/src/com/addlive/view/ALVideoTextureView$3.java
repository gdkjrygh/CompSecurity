// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.addlive.view;


// Referenced classes of package com.addlive.view:
//            ALVideoTextureView, VideoRenderer

class val.height
    implements Runnable
{

    final ALVideoTextureView this$0;
    final int val$height;
    final int val$width;

    public void run()
    {
        renderer.onResolutionChanged(val$width, val$height);
    }

    ()
    {
        this$0 = final_alvideotextureview;
        val$width = i;
        val$height = I.this;
        super();
    }
}
