// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.data;

import com.phunware.nbc.sochi.content.AlertOption;
import org.apache.commons.collections4.Predicate;

// Referenced classes of package com.phunware.nbc.sochi.data:
//            AlertOptionAdapter

class this._cls0
    implements Predicate
{

    final AlertOptionAdapter this$0;

    public boolean evaluate(AlertOption alertoption)
    {
        return alertoption.isSelected();
    }

    public volatile boolean evaluate(Object obj)
    {
        return evaluate((AlertOption)obj);
    }

    ()
    {
        this$0 = AlertOptionAdapter.this;
        super();
    }
}
