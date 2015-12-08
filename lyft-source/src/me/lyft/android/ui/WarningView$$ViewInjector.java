// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui;

import android.view.View;
import android.widget.TextView;

// Referenced classes of package me.lyft.android.ui:
//            WarningView

public class 
    implements butterknife.jector
{

    public volatile void inject(butterknife.jector jector, Object obj, Object obj1)
    {
        inject(jector, (WarningView)obj, obj1);
    }

    public void inject(butterknife.jector jector, WarningView warningview, Object obj)
    {
        warningview.warningBanner = (TextView)jector.Banner((View)jector.Banner(obj, 0x7f0d041b, "field 'warningBanner'"), 0x7f0d041b, "field 'warningBanner'");
    }

    public volatile void reset(Object obj)
    {
        reset((WarningView)obj);
    }

    public void reset(WarningView warningview)
    {
        warningview.warningBanner = null;
    }

    public ()
    {
    }
}
