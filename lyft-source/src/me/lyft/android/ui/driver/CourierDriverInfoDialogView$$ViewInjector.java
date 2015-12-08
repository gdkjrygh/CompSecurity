// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

// Referenced classes of package me.lyft.android.ui.driver:
//            CourierDriverInfoDialogView

public class I
    implements butterknife..ViewInjector
{

    public volatile void inject(butterknife..ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (CourierDriverInfoDialogView)obj, obj1);
    }

    public void inject(butterknife..ViewInjector viewinjector, CourierDriverInfoDialogView courierdriverinfodialogview, Object obj)
    {
        courierdriverinfodialogview.infoDialogHeader = (ImageView)viewinjector.infoDialogHeader((View)viewinjector.infoDialogHeader(obj, 0x7f0d014b, "field 'infoDialogHeader'"), 0x7f0d014b, "field 'infoDialogHeader'");
        courierdriverinfodialogview.okButton = (Button)viewinjector.okButton((View)viewinjector.okButton(obj, 0x7f0d014c, "field 'okButton'"), 0x7f0d014c, "field 'okButton'");
    }

    public volatile void reset(Object obj)
    {
        reset((CourierDriverInfoDialogView)obj);
    }

    public void reset(CourierDriverInfoDialogView courierdriverinfodialogview)
    {
        courierdriverinfodialogview.infoDialogHeader = null;
        courierdriverinfodialogview.okButton = null;
    }

    public I()
    {
    }
}
