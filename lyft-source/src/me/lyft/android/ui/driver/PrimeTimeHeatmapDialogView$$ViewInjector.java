// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

// Referenced classes of package me.lyft.android.ui.driver:
//            PrimeTimeHeatmapDialogView

public class 
    implements butterknife..ViewInjector
{

    public volatile void inject(butterknife..ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (PrimeTimeHeatmapDialogView)obj, obj1);
    }

    public void inject(butterknife..ViewInjector viewinjector, PrimeTimeHeatmapDialogView primetimeheatmapdialogview, Object obj)
    {
        primetimeheatmapdialogview.cancelButton = (ImageView)viewinjector.cancelButton((View)viewinjector.cancelButton(obj, 0x7f0d00b2, "field 'cancelButton'"), 0x7f0d00b2, "field 'cancelButton'");
        primetimeheatmapdialogview.heatmapDialogBody = (TextView)viewinjector.heatmapDialogBody((View)viewinjector.heatmapDialogBody(obj, 0x7f0d0354, "field 'heatmapDialogBody'"), 0x7f0d0354, "field 'heatmapDialogBody'");
    }

    public volatile void reset(Object obj)
    {
        reset((PrimeTimeHeatmapDialogView)obj);
    }

    public void reset(PrimeTimeHeatmapDialogView primetimeheatmapdialogview)
    {
        primetimeheatmapdialogview.cancelButton = null;
        primetimeheatmapdialogview.heatmapDialogBody = null;
    }

    public ()
    {
    }
}
