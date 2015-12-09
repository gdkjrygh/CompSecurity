// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.dialog.agent;

import android.app.Activity;
import com.dominos.activities.LabsSizeListActivity;
import com.dominos.adapters.LabsVariantListAdapter;
import com.dominos.android.sdk.core.product.ProductWizardManager;

// Referenced classes of package com.dominos.nina.dialog.agent:
//            ProductFlavorAgent

class anager
    implements Runnable
{

    final ProductFlavorAgent this$0;
    final Activity val$currentActivity;
    final ProductWizardManager val$productWizardManager;

    public void run()
    {
        LabsVariantListAdapter labsvariantlistadapter = (LabsVariantListAdapter)((LabsSizeListActivity)val$currentActivity).getListAdapter();
        labsvariantlistadapter.setVariantList(val$productWizardManager.getCurrentVariants());
        labsvariantlistadapter.notifyDataSetChanged();
    }

    anager()
    {
        this$0 = final_productflavoragent;
        val$currentActivity = activity;
        val$productWizardManager = ProductWizardManager.this;
        super();
    }
}
