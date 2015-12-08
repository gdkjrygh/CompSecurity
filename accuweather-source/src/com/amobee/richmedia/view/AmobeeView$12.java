// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.richmedia.view;


// Referenced classes of package com.amobee.richmedia.view:
//            AmobeeView

class val.urlExpanded
    implements Runnable
{

    final AmobeeView this$0;
    private final AmobeeView val$ormmaView;
    private final String val$urlExpanded;

    public void run()
    {
        val$ormmaView.loadExpandUrl(val$urlExpanded);
    }

    ()
    {
        this$0 = final_amobeeview;
        val$ormmaView = amobeeview1;
        val$urlExpanded = String.this;
        super();
    }
}
