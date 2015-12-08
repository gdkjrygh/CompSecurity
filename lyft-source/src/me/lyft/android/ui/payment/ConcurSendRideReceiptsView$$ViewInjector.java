// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import me.lyft.android.controls.Toggle;
import me.lyft.android.controls.Toolbar;

// Referenced classes of package me.lyft.android.ui.payment:
//            ConcurSendRideReceiptsView

public class I
    implements butterknife...ViewInjector
{

    public volatile void inject(butterknife...ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (ConcurSendRideReceiptsView)obj, obj1);
    }

    public void inject(butterknife...ViewInjector viewinjector, ConcurSendRideReceiptsView concursendridereceiptsview, Object obj)
    {
        concursendridereceiptsview.sendToConcurToggle = (Toggle)viewinjector.sendToConcurToggle((View)viewinjector.sendToConcurToggle(obj, 0x7f0d0133, "field 'sendToConcurToggle'"), 0x7f0d0133, "field 'sendToConcurToggle'");
        concursendridereceiptsview.unlinkConcurButton = (Button)viewinjector.unlinkConcurButton((View)viewinjector.unlinkConcurButton(obj, 0x7f0d0137, "field 'unlinkConcurButton'"), 0x7f0d0137, "field 'unlinkConcurButton'");
        concursendridereceiptsview.sendToConcurDescription = (TextView)viewinjector.sendToConcurDescription((View)viewinjector.sendToConcurDescription(obj, 0x7f0d0136, "field 'sendToConcurDescription'"), 0x7f0d0136, "field 'sendToConcurDescription'");
        concursendridereceiptsview.toolbar = (Toolbar)viewinjector.toolbar((View)viewinjector.toolbar(obj, 0x7f0d002c, "field 'toolbar'"), 0x7f0d002c, "field 'toolbar'");
    }

    public volatile void reset(Object obj)
    {
        reset((ConcurSendRideReceiptsView)obj);
    }

    public void reset(ConcurSendRideReceiptsView concursendridereceiptsview)
    {
        concursendridereceiptsview.sendToConcurToggle = null;
        concursendridereceiptsview.unlinkConcurButton = null;
        concursendridereceiptsview.sendToConcurDescription = null;
        concursendridereceiptsview.toolbar = null;
    }

    public I()
    {
    }
}
