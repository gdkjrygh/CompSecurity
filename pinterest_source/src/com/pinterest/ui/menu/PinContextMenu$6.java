// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.menu;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.pinterest.activity.ActivityHelper;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.Pin;
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
        Pinalytics.a(ElementType.PIN_EDIT_BUTTON, ComponentType.CONTEXTUAL_MENU, PinContextMenu.access$000(PinContextMenu.this).getUid());
        view = view.getContext();
        if (view != null)
        {
            Intent intent = ActivityHelper.getPinEditIntent(view);
            intent.putExtra("com.pinterest.EXTRA_PIN_ID", PinContextMenu.access$000(PinContextMenu.this).getUid());
            view.startActivity(intent);
        }
    }

    pe()
    {
        this$0 = PinContextMenu.this;
        super();
    }
}
