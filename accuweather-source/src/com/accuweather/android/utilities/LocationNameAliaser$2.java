// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.utilities;

import android.content.DialogInterface;
import com.accuweather.android.models.location.LocationModel;

// Referenced classes of package com.accuweather.android.utilities:
//            LocationNameAliaser, ILocationNameAliaser

class val.locationModel
    implements android.content.kListener
{

    final LocationNameAliaser this$0;
    final LocationModel val$locationModel;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        LocationNameAliaser.access$200(LocationNameAliaser.this, val$locationModel);
        dialoginterface.dismiss();
        LocationNameAliaser.access$100(LocationNameAliaser.this).onAliasChanged(val$locationModel);
    }

    ()
    {
        this$0 = final_locationnamealiaser;
        val$locationModel = LocationModel.this;
        super();
    }
}
