// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.widget;

import android.util.SparseArray;
import android.view.View;
import com.thetransitapp.droid.model.TransitMode;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.thetransitapp.droid.widget:
//            TransitModeAdapter, OptionItem

class val.groupPosition
    implements android.view.nsitModeAdapter._cls2
{

    final TransitModeAdapter this$0;
    private final int val$groupPosition;
    private final OptionItem val$item;

    public void onClick(View view)
    {
        view = val$item.getMode();
        boolean flag;
        if (val$item.getMode().isSelected())
        {
            flag = false;
        } else
        {
            flag = true;
        }
        view.setSelected(flag);
        if (TransitModeAdapter.access$3(TransitModeAdapter.this).get(val$groupPosition) == null) goto _L2; else goto _L1
_L1:
        view = ((List)TransitModeAdapter.access$3(TransitModeAdapter.this).get(val$groupPosition)).iterator();
_L5:
        if (view.hasNext()) goto _L3; else goto _L2
_L2:
        notifyDataSetChanged();
        return;
_L3:
        ((OptionItem)view.next()).getMode().setSelected(val$item.getMode().isSelected());
        if (true) goto _L5; else goto _L4
_L4:
    }

    _cls9()
    {
        this$0 = final_transitmodeadapter;
        val$item = optionitem;
        val$groupPosition = I.this;
        super();
    }
}
