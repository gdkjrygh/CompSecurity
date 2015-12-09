// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.view.View;
import android.widget.ExpandableListView;

// Referenced classes of package com.jcp.fragments:
//            TrackPackageFragment

public class 
    implements butterknife.ector
{

    public void inject(butterknife.ector ector, TrackPackageFragment trackpackagefragment, Object obj)
    {
        trackpackagefragment.trackListView = (ExpandableListView)ector.tView((View)ector.(obj, 0x7f0e0323, "field 'trackListView'"), 0x7f0e0323, "field 'trackListView'");
    }

    public volatile void inject(butterknife.ector ector, Object obj, Object obj1)
    {
        inject(ector, (TrackPackageFragment)obj, obj1);
    }

    public void reset(TrackPackageFragment trackpackagefragment)
    {
        trackpackagefragment.trackListView = null;
    }

    public volatile void reset(Object obj)
    {
        reset((TrackPackageFragment)obj);
    }

    public ()
    {
    }
}
