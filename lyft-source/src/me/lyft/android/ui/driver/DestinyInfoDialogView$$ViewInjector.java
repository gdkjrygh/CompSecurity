// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

// Referenced classes of package me.lyft.android.ui.driver:
//            DestinyInfoDialogView

public class 
    implements butterknife..ViewInjector
{

    public volatile void inject(butterknife..ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (DestinyInfoDialogView)obj, obj1);
    }

    public void inject(butterknife..ViewInjector viewinjector, DestinyInfoDialogView destinyinfodialogview, Object obj)
    {
        destinyinfodialogview.cancelButton = (ImageView)viewinjector.cancelButton((View)viewinjector.cancelButton(obj, 0x7f0d00b2, "field 'cancelButton'"), 0x7f0d00b2, "field 'cancelButton'");
        destinyinfodialogview.destinyHeaderLabel = (TextView)viewinjector.destinyHeaderLabel((View)viewinjector.destinyHeaderLabel(obj, 0x7f0d017b, "field 'destinyHeaderLabel'"), 0x7f0d017b, "field 'destinyHeaderLabel'");
        destinyinfodialogview.destinyHeaderText = (TextView)viewinjector.destinyHeaderText((View)viewinjector.destinyHeaderText(obj, 0x7f0d017d, "field 'destinyHeaderText'"), 0x7f0d017d, "field 'destinyHeaderText'");
        destinyinfodialogview.destinySectionOneLabel = (TextView)viewinjector.destinySectionOneLabel((View)viewinjector.destinySectionOneLabel(obj, 0x7f0d017e, "field 'destinySectionOneLabel'"), 0x7f0d017e, "field 'destinySectionOneLabel'");
        destinyinfodialogview.destinySectionOneText = (TextView)viewinjector.destinySectionOneText((View)viewinjector.destinySectionOneText(obj, 0x7f0d017f, "field 'destinySectionOneText'"), 0x7f0d017f, "field 'destinySectionOneText'");
        destinyinfodialogview.destinySectionTwoLabel = (TextView)viewinjector.destinySectionTwoLabel((View)viewinjector.destinySectionTwoLabel(obj, 0x7f0d0180, "field 'destinySectionTwoLabel'"), 0x7f0d0180, "field 'destinySectionTwoLabel'");
        destinyinfodialogview.destinySectionTwoText = (TextView)viewinjector.destinySectionTwoText((View)viewinjector.destinySectionTwoText(obj, 0x7f0d0181, "field 'destinySectionTwoText'"), 0x7f0d0181, "field 'destinySectionTwoText'");
    }

    public volatile void reset(Object obj)
    {
        reset((DestinyInfoDialogView)obj);
    }

    public void reset(DestinyInfoDialogView destinyinfodialogview)
    {
        destinyinfodialogview.cancelButton = null;
        destinyinfodialogview.destinyHeaderLabel = null;
        destinyinfodialogview.destinyHeaderText = null;
        destinyinfodialogview.destinySectionOneLabel = null;
        destinyinfodialogview.destinySectionOneText = null;
        destinyinfodialogview.destinySectionTwoLabel = null;
        destinyinfodialogview.destinySectionTwoText = null;
    }

    public ()
    {
    }
}
