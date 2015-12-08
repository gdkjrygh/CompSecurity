// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.report;

import com.pinterest.api.model.Pin;
import java.util.ArrayList;

// Referenced classes of package com.pinterest.activity.report:
//            ReportPinBaseFragment, ReportPinFragment

class add extends ArrayList
{

    final ReportPinFragment this$0;

    t()
    {
        this$0 = ReportPinFragment.this;
        super();
        add("ignoreThisPin");
        add("spam");
        add("policies");
        add("notUseful");
        add("IP");
        if (ReportPinBaseFragment.getPin() != null && ReportPinBaseFragment.getPin().getHasPlace().booleanValue())
        {
            add("location");
        }
    }
}
