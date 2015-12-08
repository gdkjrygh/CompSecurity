// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import android.view.View;
import com.pinterest.activity.pin.view.modules.util.ClickThroughUtil;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;

// Referenced classes of package com.pinterest.api.model:
//            BoostablePinMetadata, Pin

class val.apiTag
    implements android.view.Metadata._cls1
{

    final BoostablePinMetadata this$0;
    final String val$apiTag;
    final ComponentType val$componentType;

    public void onClick(View view)
    {
        Pinalytics.a(ElementType.CARD_ATTRIBUTION_LINK, val$componentType, getPin().getUid());
        ClickThroughUtil.gotoPinLink(getUrl(), null, val$apiTag);
    }

    ickThroughUtil()
    {
        this$0 = final_boostablepinmetadata;
        val$componentType = componenttype;
        val$apiTag = String.this;
        super();
    }
}
