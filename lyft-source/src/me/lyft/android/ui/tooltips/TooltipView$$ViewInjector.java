// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.tooltips;

import android.view.View;
import android.widget.TextView;

// Referenced classes of package me.lyft.android.ui.tooltips:
//            TooltipView

public class 
    implements butterknife.w..ViewInjector
{

    public volatile void inject(butterknife.w..ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (TooltipView)obj, obj1);
    }

    public void inject(butterknife.w..ViewInjector viewinjector, TooltipView tooltipview, Object obj)
    {
        tooltipview.tooltipTopArrow = (View)viewinjector.tooltipTopArrow(obj, 0x7f0d040b, "field 'tooltipTopArrow'");
        tooltipview.tooltipBottomArrow = (View)viewinjector.tooltipBottomArrow(obj, 0x7f0d040d, "field 'tooltipBottomArrow'");
        tooltipview.tooltipText = (TextView)viewinjector.tooltipText((View)viewinjector.tooltipText(obj, 0x7f0d040c, "field 'tooltipText'"), 0x7f0d040c, "field 'tooltipText'");
    }

    public volatile void reset(Object obj)
    {
        reset((TooltipView)obj);
    }

    public void reset(TooltipView tooltipview)
    {
        tooltipview.tooltipTopArrow = null;
        tooltipview.tooltipBottomArrow = null;
        tooltipview.tooltipText = null;
    }

    public ()
    {
    }
}
