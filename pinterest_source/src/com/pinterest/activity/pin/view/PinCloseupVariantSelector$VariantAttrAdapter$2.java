// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.view;

import android.view.View;
import com.pinterest.base.Events;
import com.pinterest.events.VariantUpdatedEvent;
import java.util.List;

// Referenced classes of package com.pinterest.activity.pin.view:
//            PinCloseupVariantSelector

class val.attrVariant
    implements android.view.riantAttrAdapter._cls2
{

    final tifyDataSetChanged this$1;
    final com.pinterest.api.model.apter val$attrVariant;

    public void onClick(View view)
    {
        cess._mth202(this._cls1.this, val$attrVariant);
        Events.post(new VariantUpdatedEvent(val$attrVariant, PinCloseupVariantSelector.access$300(_fld0)));
        if (tItemViewType(1) == 0)
        {
            tifyItemChanged(cess._mth400(this._cls1.this).indexOf(val$attrVariant));
            cess._mth400(this._cls1.this).remove(1);
            tifyItemRemoved(1);
            return;
        } else
        {
            tifyDataSetChanged();
            return;
        }
    }

    ()
    {
        this$1 = final_;
        val$attrVariant = com.pinterest.api.model.apter._cls2.val.attrVariant.this;
        super();
    }
}
