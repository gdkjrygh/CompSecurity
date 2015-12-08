// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.menu;

import android.view.View;
import com.pinterest.activity.task.fragment.BaseFragment;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.Pin;
import com.pinterest.kit.utils.PinUtils;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;

// Referenced classes of package com.pinterest.ui.menu:
//            PinContextMenu

class this._cls0
    implements android.view.ner
{

    final PinContextMenu this$0;

    public void onClick(View view)
    {
        Pinalytics.a(ElementType.PIN_REPIN_BUTTON, ComponentType.CONTEXTUAL_MENU, PinContextMenu.access$000(PinContextMenu.this).getUid());
        Pin pin = PinContextMenu.access$000(PinContextMenu.this);
        if (PinContextMenu.access$100(PinContextMenu.this) != null)
        {
            view = PinContextMenu.access$100(PinContextMenu.this).getApiTag();
        } else
        {
            view = null;
        }
        PinUtils.repinOrSavePin(pin, null, view);
    }

    seFragment()
    {
        this$0 = PinContextMenu.this;
        super();
    }
}
