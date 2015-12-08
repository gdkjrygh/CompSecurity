// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.view;

import com.pinterest.ui.imageview.WebImageView;

// Referenced classes of package com.pinterest.activity.pin.view:
//            PinCloseupImageView

class this._cls1
    implements Runnable
{

    final is._cls0 this$1;

    public void run()
    {
        PinCloseupImageView.access$400(_fld0);
        if (PinCloseupImageView.access$000(_fld0) != null)
        {
            removeView(PinCloseupImageView.access$000(_fld0));
            PinCloseupImageView.access$000(_fld0).setBitmap(null, false);
            PinCloseupImageView.access$002(_fld0, null);
        }
    }

    ()
    {
        this$1 = this._cls1.this;
        super();
    }
}
