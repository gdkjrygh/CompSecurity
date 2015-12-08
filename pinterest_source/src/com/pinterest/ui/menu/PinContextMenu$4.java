// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.menu;

import android.view.View;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.Pin;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;
import com.pinterest.ui.feedback.PinFeedbackBase;
import org.apache.commons.lang3.StringUtils;

// Referenced classes of package com.pinterest.ui.menu:
//            PinContextMenu, ContextMenuItemView

class ew
    implements android.view.ner
{

    final PinContextMenu this$0;
    final ContextMenuItemView val$view;

    public void onClick(View view1)
    {
        if (StringUtils.isNotEmpty(PinContextMenu.access$000(PinContextMenu.this).getUid()))
        {
            Pinalytics.a(ElementType.PIN_HIDE_BUTTON, ComponentType.CONTEXTUAL_MENU);
            PinFeedbackBase.get(val$view.getContext(), PinContextMenu.access$000(PinContextMenu.this), PinContextMenu.access$100(PinContextMenu.this)).showFeedBack();
        }
    }

    ew()
    {
        this$0 = final_pincontextmenu;
        val$view = ContextMenuItemView.this;
        super();
    }
}
