// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.activities;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

// Referenced classes of package com.jcp.activities:
//            SelectPickUpStoreActivity, bl, bm

public class 
    implements butterknife.jector
{

    public void inject(butterknife.jector jector, SelectPickUpStoreActivity selectpickupstoreactivity, Object obj)
    {
        selectpickupstoreactivity.mSearchView = (EditText)jector.View((View)jector.View(obj, 0x7f0e01a2, "field 'mSearchView'"), 0x7f0e01a2, "field 'mSearchView'");
        View view = (View)jector.View(obj, 0x7f0e01a4, "field 'mLocationView' and method 'loadZipCode'");
        selectpickupstoreactivity.mLocationView = (ImageView)jector.onView(view, 0x7f0e01a4, "field 'mLocationView'");
        view.setOnClickListener(new bl(this, selectpickupstoreactivity));
        selectpickupstoreactivity.mProgressBar = (ProgressBar)jector.ssBar((View)jector.ssBar(obj, 0x7f0e01a5, "field 'mProgressBar'"), 0x7f0e01a5, "field 'mProgressBar'");
        view = (View)jector.ssBar(obj, 0x7f0e01a6, "field 'sort' and method 'sortList'");
        selectpickupstoreactivity.sort = (Button)jector.ssBar(view, 0x7f0e01a6, "field 'sort'");
        view.setOnClickListener(new bm(this, selectpickupstoreactivity));
        selectpickupstoreactivity.tvselectedstore = (TextView)jector.tedstore((View)jector.tedstore(obj, 0x7f0e01a9, "field 'tvselectedstore'"), 0x7f0e01a9, "field 'tvselectedstore'");
        selectpickupstoreactivity.name = (TextView)jector.tedstore((View)jector.tedstore(obj, 0x7f0e01ac, "field 'name'"), 0x7f0e01ac, "field 'name'");
        selectpickupstoreactivity.street = (TextView)jector.tedstore((View)jector.tedstore(obj, 0x7f0e01ad, "field 'street'"), 0x7f0e01ad, "field 'street'");
        selectpickupstoreactivity.address = (TextView)jector.((View)jector.(obj, 0x7f0e01af, "field 'address'"), 0x7f0e01af, "field 'address'");
        selectpickupstoreactivity.distance = (TextView)jector.e((View)jector.e(obj, 0x7f0e01ae, "field 'distance'"), 0x7f0e01ae, "field 'distance'");
        selectpickupstoreactivity.inventorystat = (TextView)jector.rystat((View)jector.rystat(obj, 0x7f0e01b1, "field 'inventorystat'"), 0x7f0e01b1, "field 'inventorystat'");
        selectpickupstoreactivity.nearbystoresstat = (TextView)jector.toresstat((View)jector.toresstat(obj, 0x7f0e01b2, "field 'nearbystoresstat'"), 0x7f0e01b2, "field 'nearbystoresstat'");
        selectpickupstoreactivity.lvnearbystores = (ListView)jector.ystores((View)jector.ystores(obj, 0x7f0e01b3, "field 'lvnearbystores'"), 0x7f0e01b3, "field 'lvnearbystores'");
        selectpickupstoreactivity.separatorviewtop = (View)jector.orviewtop(obj, 0x7f0e01aa, "field 'separatorviewtop'");
        selectpickupstoreactivity.separatorviewbottom = (View)jector.orviewbottom(obj, 0x7f0e01b0, "field 'separatorviewbottom'");
        selectpickupstoreactivity.rlselectedstore = (RelativeLayout)jector.tedstore((View)jector.tedstore(obj, 0x7f0e01ab, "field 'rlselectedstore'"), 0x7f0e01ab, "field 'rlselectedstore'");
        selectpickupstoreactivity.emptyview = (RelativeLayout)jector.ew((View)jector.ew(obj, 0x7f0e01a7, "field 'emptyview'"), 0x7f0e01a7, "field 'emptyview'");
    }

    public volatile void inject(butterknife.jector jector, Object obj, Object obj1)
    {
        inject(jector, (SelectPickUpStoreActivity)obj, obj1);
    }

    public void reset(SelectPickUpStoreActivity selectpickupstoreactivity)
    {
        selectpickupstoreactivity.mSearchView = null;
        selectpickupstoreactivity.mLocationView = null;
        selectpickupstoreactivity.mProgressBar = null;
        selectpickupstoreactivity.sort = null;
        selectpickupstoreactivity.tvselectedstore = null;
        selectpickupstoreactivity.name = null;
        selectpickupstoreactivity.street = null;
        selectpickupstoreactivity.address = null;
        selectpickupstoreactivity.distance = null;
        selectpickupstoreactivity.inventorystat = null;
        selectpickupstoreactivity.nearbystoresstat = null;
        selectpickupstoreactivity.lvnearbystores = null;
        selectpickupstoreactivity.separatorviewtop = null;
        selectpickupstoreactivity.separatorviewbottom = null;
        selectpickupstoreactivity.rlselectedstore = null;
        selectpickupstoreactivity.emptyview = null;
    }

    public volatile void reset(Object obj)
    {
        reset((SelectPickUpStoreActivity)obj);
    }

    public ()
    {
    }
}
