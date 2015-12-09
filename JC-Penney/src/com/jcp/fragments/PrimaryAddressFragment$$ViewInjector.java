// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.RelativeLayout;

// Referenced classes of package com.jcp.fragments:
//            PrimaryAddressFragment, ch, ci, cj

public class 
    implements butterknife.ector
{

    public void inject(butterknife.ector ector, PrimaryAddressFragment primaryaddressfragment, Object obj)
    {
        View view = (View)ector.r(obj, 0x7f0e0191, "field 'primaryAddressListview' and method 'onPrimaryAddressListItemClick'");
        primaryaddressfragment.primaryAddressListview = (ListView)ector.ddressListview(view, 0x7f0e0191, "field 'primaryAddressListview'");
        ((AdapterView)view).setOnItemClickListener(new ch(this, primaryaddressfragment));
        view = (View)ector.ector(obj, 0x7f0e0194, "field 'additonalAddressListview', method 'onAdditionalAddressListItemClick', and method 'onAdditionalAddressListItemLongClick'");
        primaryaddressfragment.additonalAddressListview = (ListView)ector.lAddressListview(view, 0x7f0e0194, "field 'additonalAddressListview'");
        ((AdapterView)view).setOnItemClickListener(new ci(this, primaryaddressfragment));
        ((AdapterView)view).setOnItemLongClickListener(new cj(this, primaryaddressfragment));
        primaryaddressfragment.additonalHeader = (RelativeLayout)ector.lHeader((View)ector.lHeader(obj, 0x7f0e0192, "field 'additonalHeader'"), 0x7f0e0192, "field 'additonalHeader'");
    }

    public volatile void inject(butterknife.ector ector, Object obj, Object obj1)
    {
        inject(ector, (PrimaryAddressFragment)obj, obj1);
    }

    public void reset(PrimaryAddressFragment primaryaddressfragment)
    {
        primaryaddressfragment.primaryAddressListview = null;
        primaryaddressfragment.additonalAddressListview = null;
        primaryaddressfragment.additonalHeader = null;
    }

    public volatile void reset(Object obj)
    {
        reset((PrimaryAddressFragment)obj);
    }

    public ()
    {
    }
}
