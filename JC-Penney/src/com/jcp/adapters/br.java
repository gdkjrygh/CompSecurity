// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.jcp.activities.StoreDetailsActivity;
import com.jcp.storepickup.pojo.Stores;

// Referenced classes of package com.jcp.adapters:
//            PickUpFromStoreAdapter

class br
    implements android.view.View.OnClickListener
{

    final Stores a;
    final PickUpFromStoreAdapter b;

    br(PickUpFromStoreAdapter pickupfromstoreadapter, Stores stores)
    {
        b = pickupfromstoreadapter;
        a = stores;
        super();
    }

    public void onClick(View view)
    {
        StoreDetailsActivity.a(a);
        StoreDetailsActivity.a(PickUpFromStoreAdapter.c(b));
        view = new Intent((Activity)PickUpFromStoreAdapter.d(b), com/jcp/activities/StoreDetailsActivity);
        view.putExtras(new Bundle());
        ((Activity)PickUpFromStoreAdapter.d(b)).startActivity(view);
    }
}
