// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.view;

import android.view.View;
import com.pinterest.base.Events;
import com.pinterest.events.VariantUpdatedEvent;

// Referenced classes of package com.pinterest.activity.pin.view:
//            PinCloseupVariantSelector

class val.swatchVariant
    implements android.view.riantAttrAdapter._cls1
{

    final tifyDataSetChanged this$1;
    final com.pinterest.api.model.apter val$swatchVariant;

    public void onClick(View view)
    {
        Events.post(new VariantUpdatedEvent(val$swatchVariant, PinCloseupVariantSelector.access$100(_fld0)));
        cess._mth202(this._cls1.this, val$swatchVariant);
        tifyDataSetChanged();
    }

    ()
    {
        this$1 = final_;
        val$swatchVariant = com.pinterest.api.model.apter._cls1.val.swatchVariant.this;
        super();
    }
}
