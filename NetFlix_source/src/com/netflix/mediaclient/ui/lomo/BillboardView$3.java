// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.lomo;

import android.view.View;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.service.webclient.model.BillboardDetails;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.details.DetailsActivity;

// Referenced classes of package com.netflix.mediaclient.ui.lomo:
//            BillboardView

class BillboardDetails
    implements android.view.ener
{

    final BillboardView this$0;
    final ServiceManager val$serviceMan;
    final BillboardDetails val$video;

    public void onClick(View view)
    {
        if (val$serviceMan != null && val$serviceMan.isReady())
        {
            val$serviceMan.logBillboardActivity(val$video, com.netflix.mediaclient.service.browse.boardActivityType.ACTION);
        }
        DetailsActivity.show((NetflixActivity)getContext(), val$video, BillboardView.access$300(BillboardView.this));
    }

    BillboardDetails()
    {
        this$0 = final_billboardview;
        val$serviceMan = servicemanager;
        val$video = BillboardDetails.this;
        super();
    }
}
