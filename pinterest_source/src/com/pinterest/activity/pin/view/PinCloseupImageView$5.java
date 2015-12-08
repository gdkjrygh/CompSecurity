// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.view;

import android.view.View;
import com.pinterest.base.Events;
import com.pinterest.ui.menu.ShowPinContextMenuEvent;

// Referenced classes of package com.pinterest.activity.pin.view:
//            PinCloseupImageView

class this._cls0
    implements android.view.er
{

    final PinCloseupImageView this$0;

    public boolean onLongClick(View view)
    {
        if (PinCloseupImageView.access$500(PinCloseupImageView.this))
        {
            Events.post(new ShowPinContextMenuEvent(_galleryItem.()));
        }
        return true;
    }

    ()
    {
        this$0 = PinCloseupImageView.this;
        super();
    }
}
