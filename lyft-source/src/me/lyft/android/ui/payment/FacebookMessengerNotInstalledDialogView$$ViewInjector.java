// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import android.view.View;
import android.widget.ImageView;

// Referenced classes of package me.lyft.android.ui.payment:
//            FacebookMessengerNotInstalledDialogView

public class 
    implements butterknife...ViewInjector
{

    public volatile void inject(butterknife...ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (FacebookMessengerNotInstalledDialogView)obj, obj1);
    }

    public void inject(butterknife...ViewInjector viewinjector, FacebookMessengerNotInstalledDialogView facebookmessengernotinstalleddialogview, Object obj)
    {
        facebookmessengernotinstalleddialogview.closeButton = (ImageView)viewinjector.closeButton((View)viewinjector.closeButton(obj, 0x7f0d0069, "field 'closeButton'"), 0x7f0d0069, "field 'closeButton'");
    }

    public volatile void reset(Object obj)
    {
        reset((FacebookMessengerNotInstalledDialogView)obj);
    }

    public void reset(FacebookMessengerNotInstalledDialogView facebookmessengernotinstalleddialogview)
    {
        facebookmessengernotinstalleddialogview.closeButton = null;
    }

    public ()
    {
    }
}
