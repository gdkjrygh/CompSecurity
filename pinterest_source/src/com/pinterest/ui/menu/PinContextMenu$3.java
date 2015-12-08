// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.menu;

import android.view.View;
import com.pinterest.activity.sendapin.SendPinActivity;
import com.pinterest.activity.sendshare.util.SendShareUtils;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.Pin;
import com.pinterest.experiment.Experiments;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;
import org.apache.commons.lang3.StringUtils;

// Referenced classes of package com.pinterest.ui.menu:
//            PinContextMenu

class this._cls0
    implements android.view.ner
{

    final PinContextMenu this$0;

    public void onClick(View view)
    {
label0:
        {
            if (StringUtils.isNotEmpty(PinContextMenu.access$000(PinContextMenu.this).getUid()))
            {
                Pinalytics.a(ElementType.SEND_BUTTON, ComponentType.CONTEXTUAL_MENU);
                if (!Experiments.K())
                {
                    break label0;
                }
                SendShareUtils.getInstance().postSendShareNavigation(PinContextMenu.access$000(PinContextMenu.this));
            }
            return;
        }
        SendPinActivity.startSendPin(view.getContext(), PinContextMenu.access$000(PinContextMenu.this).getUid());
    }

    Activity()
    {
        this$0 = PinContextMenu.this;
        super();
    }
}
