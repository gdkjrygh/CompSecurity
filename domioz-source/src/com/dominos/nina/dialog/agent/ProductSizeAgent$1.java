// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.dialog.agent;

import android.app.Activity;
import com.dominos.activities.LabsFlavorListActivity;
import com.dominos.adapters.LabsVariantListAdapter;
import com.dominos.android.sdk.core.product.ProductWizardManager;

// Referenced classes of package com.dominos.nina.dialog.agent:
//            ProductSizeAgent

class dManager
    implements Runnable
{

    final ProductSizeAgent this$0;
    final ProductWizardManager val$controller;
    final Activity val$currentActivity;

    public void run()
    {
        LabsVariantListAdapter labsvariantlistadapter = (LabsVariantListAdapter)((LabsFlavorListActivity)val$currentActivity).getListAdapter();
        labsvariantlistadapter.setVariantList(val$controller.getCurrentVariants());
        labsvariantlistadapter.notifyDataSetChanged();
    }

    dManager()
    {
        this$0 = final_productsizeagent;
        val$currentActivity = activity;
        val$controller = ProductWizardManager.this;
        super();
    }
}
