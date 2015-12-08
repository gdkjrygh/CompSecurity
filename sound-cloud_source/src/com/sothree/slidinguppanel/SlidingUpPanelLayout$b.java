// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sothree.slidinguppanel;

import android.view.View;

// Referenced classes of package com.sothree.slidinguppanel:
//            SlidingUpPanelLayout

public static interface 
{

    public abstract void onPanelAnchored(View view);

    public abstract void onPanelCollapsed(View view);

    public abstract void onPanelExpanded(View view);

    public abstract void onPanelHidden(View view);

    public abstract void onPanelSlide(View view, float f);
}
