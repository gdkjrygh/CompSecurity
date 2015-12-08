// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.flashlight;

import android.view.View;
import android.widget.AdapterView;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.schemas.event.ElementType;
import com.pinterest.ui.TopicAnnotationCell;
import java.util.HashMap;
import java.util.List;

// Referenced classes of package com.pinterest.activity.flashlight:
//            FlashlightResultsFragment

class this._cls0
    implements android.widget.ner
{

    final FlashlightResultsFragment this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        if (FlashlightResultsFragment.access$100(FlashlightResultsFragment.this) == null || view == null || !(view instanceof TopicAnnotationCell) || FlashlightResultsFragment.access$200(FlashlightResultsFragment.this) == null || FlashlightResultsFragment.access$200(FlashlightResultsFragment.this).isEmpty() || i < 0 || i >= FlashlightResultsFragment.access$200(FlashlightResultsFragment.this).size())
        {
            return;
        }
        adapterview = (String)FlashlightResultsFragment.access$200(FlashlightResultsFragment.this).get(i);
        if (adapterview != null)
        {
            view = new HashMap();
            view.put("label", adapterview);
            Pinalytics.a(ElementType.FLASHLIGHT_ANNOTATION, view);
        }
        if (adapterview == null || !FlashlightResultsFragment.access$300(FlashlightResultsFragment.this).contains(adapterview)) goto _L2; else goto _L1
_L1:
        FlashlightResultsFragment.access$300(FlashlightResultsFragment.this).remove(adapterview);
_L4:
        FlashlightResultsFragment.access$400(FlashlightResultsFragment.this, false);
        FlashlightResultsFragment.access$500(FlashlightResultsFragment.this);
        return;
_L2:
        if (FlashlightResultsFragment.access$300(FlashlightResultsFragment.this).size() < 3)
        {
            FlashlightResultsFragment.access$300(FlashlightResultsFragment.this).add(adapterview);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    ()
    {
        this$0 = FlashlightResultsFragment.this;
        super();
    }
}
