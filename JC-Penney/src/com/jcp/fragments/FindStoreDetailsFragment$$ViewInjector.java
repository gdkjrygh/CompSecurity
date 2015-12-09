// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.view.View;
import android.widget.TextView;
import android.widget.ToggleButton;

// Referenced classes of package com.jcp.fragments:
//            FindStoreDetailsFragment, an, ao, ap

public class 
    implements butterknife.ector
{

    public void inject(butterknife.ector ector, FindStoreDetailsFragment findstoredetailsfragment, Object obj)
    {
        findstoredetailsfragment.nametv = (TextView)ector.ector((View)ector.ector(obj, 0x7f0e030d, "field 'nametv'"), 0x7f0e030d, "field 'nametv'");
        findstoredetailsfragment.distancetv = (TextView)ector.tv((View)ector.tv(obj, 0x7f0e030e, "field 'distancetv'"), 0x7f0e030e, "field 'distancetv'");
        findstoredetailsfragment.addresstv = (TextView)ector.v((View)ector.v(obj, 0x7f0e0311, "field 'addresstv'"), 0x7f0e0311, "field 'addresstv'");
        findstoredetailsfragment.phonetv = (TextView)ector.v((View)ector.v(obj, 0x7f0e0313, "field 'phonetv'"), 0x7f0e0313, "field 'phonetv'");
        findstoredetailsfragment.timingstv = (TextView)ector.v((View)ector.v(obj, 0x7f0e0314, "field 'timingstv'"), 0x7f0e0314, "field 'timingstv'");
        findstoredetailsfragment.servicestv = (TextView)ector.tv((View)ector.tv(obj, 0x7f0e0316, "field 'servicestv'"), 0x7f0e0316, "field 'servicestv'");
        View view = (View)ector.tv(obj, 0x7f0e030f, "field 'toggleButton' and method 'toggleButtonClick'");
        findstoredetailsfragment.toggleButton = (ToggleButton)ector.tton(view, 0x7f0e030f, "field 'toggleButton'");
        view.setOnClickListener(new an(this, findstoredetailsfragment));
        ((View)ector.ector(obj, 0x7f0e0312, "method 'phoneClick'")).setOnClickListener(new ao(this, findstoredetailsfragment));
        ((View)ector.ector(obj, 0x7f0e0310, "method 'addressLayoutClick'")).setOnClickListener(new ap(this, findstoredetailsfragment));
    }

    public volatile void inject(butterknife.ector ector, Object obj, Object obj1)
    {
        inject(ector, (FindStoreDetailsFragment)obj, obj1);
    }

    public void reset(FindStoreDetailsFragment findstoredetailsfragment)
    {
        findstoredetailsfragment.nametv = null;
        findstoredetailsfragment.distancetv = null;
        findstoredetailsfragment.addresstv = null;
        findstoredetailsfragment.phonetv = null;
        findstoredetailsfragment.timingstv = null;
        findstoredetailsfragment.servicestv = null;
        findstoredetailsfragment.toggleButton = null;
    }

    public volatile void reset(Object obj)
    {
        reset((FindStoreDetailsFragment)obj);
    }

    public ()
    {
    }
}
