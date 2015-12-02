// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;

import android.graphics.drawable.Drawable;
import com.google.android.maps.ItemizedOverlay;
import com.google.android.maps.OverlayItem;
import com.google.common.a.hq;
import java.util.List;

// Referenced classes of package com.facebook.orca.threadview:
//            ThreadViewMapActivityImpl

class ct extends ItemizedOverlay
{

    final ThreadViewMapActivityImpl a;
    private List b;

    public ct(ThreadViewMapActivityImpl threadviewmapactivityimpl, Drawable drawable)
    {
        a = threadviewmapactivityimpl;
        super(boundCenterBottom(drawable));
        b = hq.a();
    }

    public void a()
    {
        b.clear();
    }

    public void a(List list)
    {
        b.addAll(list);
        populate();
    }

    protected OverlayItem createItem(int i)
    {
        return (OverlayItem)b.get(i);
    }

    public int size()
    {
        return b.size();
    }
}
