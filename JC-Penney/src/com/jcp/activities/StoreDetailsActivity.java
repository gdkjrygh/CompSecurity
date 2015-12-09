// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.aj;
import android.support.v4.app.ay;
import com.jcp.fragments.FindStoreDetailsFragment;
import com.jcp.storepickup.pojo.Stores;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.jcp.activities:
//            ao

public class StoreDetailsActivity extends ao
{

    private static Stores i;
    private static List j;
    private FindStoreDetailsFragment k;

    public StoreDetailsActivity()
    {
    }

    public static void a(Stores stores)
    {
        i = stores;
    }

    public static void a(List list)
    {
        j = list;
    }

    protected String h()
    {
        return "STOREDETAILSACIVITY";
    }

    public void onBackPressed()
    {
        k.V();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030031);
        bundle = getIntent().getExtras();
        if (i == null || j == null)
        {
            finish();
            return;
        }
        if ("fromheader".equalsIgnoreCase(bundle.getString("fromlisttype")))
        {
            bundle.putString("fromStoreList", "fromdefaultstore");
        } else
        {
            bundle.putString("fromStoreList", "fromStoreList");
        }
        bundle.putParcelable("arrayStoreList", i);
        bundle.putParcelableArrayList("arrayStoreFullList", (ArrayList)j);
        k = new FindStoreDetailsFragment();
        k.g(bundle);
        f().a().a(0x7f0e01b6, k).b();
    }
}
