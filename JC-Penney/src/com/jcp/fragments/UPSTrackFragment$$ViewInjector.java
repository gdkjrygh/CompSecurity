// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.view.View;
import android.widget.ExpandableListView;

// Referenced classes of package com.jcp.fragments:
//            UPSTrackFragment

public class 
    implements butterknife.ector
{

    public void inject(butterknife.ector ector, UPSTrackFragment upstrackfragment, Object obj)
    {
        upstrackfragment.mPackagesShipmentStatusList = (ExpandableListView)ector.sShipmentStatusList((View)ector.View(obj, 0x7f0e0324, "field 'mPackagesShipmentStatusList'"), 0x7f0e0324, "field 'mPackagesShipmentStatusList'");
    }

    public volatile void inject(butterknife.ector ector, Object obj, Object obj1)
    {
        inject(ector, (UPSTrackFragment)obj, obj1);
    }

    public void reset(UPSTrackFragment upstrackfragment)
    {
        upstrackfragment.mPackagesShipmentStatusList = null;
    }

    public volatile void reset(Object obj)
    {
        reset((UPSTrackFragment)obj);
    }

    public ()
    {
    }
}
