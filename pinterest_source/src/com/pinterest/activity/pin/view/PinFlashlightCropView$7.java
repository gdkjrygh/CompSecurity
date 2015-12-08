// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.view;

import com.pinterest.base.Events;

// Referenced classes of package com.pinterest.activity.pin.view:
//            PinFlashlightCropView

class val.oldWidth
    implements Runnable
{

    final PinFlashlightCropView this$0;
    final int val$oldHeight;
    final int val$oldWidth;

    public void run()
    {
        int i = getHeight();
        int j = getWidth();
        if (i != val$oldHeight || j != val$oldWidth)
        {
            Events.post(new nCloseupImageViewResizeEvent(_galleryItem._galleryItem()));
        }
    }

    nCloseupImageViewResizeEvent()
    {
        this$0 = final_pinflashlightcropview;
        val$oldHeight = i;
        val$oldWidth = I.this;
        super();
    }
}
