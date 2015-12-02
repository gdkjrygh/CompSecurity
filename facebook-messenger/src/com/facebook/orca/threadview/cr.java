// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;

import com.google.android.maps.ItemizedOverlay;
import com.google.android.maps.OverlayItem;

// Referenced classes of package com.facebook.orca.threadview:
//            ThreadViewMapActivityImpl

class cr
    implements com.google.android.maps.ItemizedOverlay.OnFocusChangeListener
{

    final ThreadViewMapActivityImpl a;

    cr(ThreadViewMapActivityImpl threadviewmapactivityimpl)
    {
        a = threadviewmapactivityimpl;
        super();
    }

    public void onFocusChanged(ItemizedOverlay itemizedoverlay, OverlayItem overlayitem)
    {
        ThreadViewMapActivityImpl.a(a, overlayitem);
    }
}
