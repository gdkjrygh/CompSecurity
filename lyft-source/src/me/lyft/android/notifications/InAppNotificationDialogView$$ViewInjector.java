// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.notifications;

import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;

// Referenced classes of package me.lyft.android.notifications:
//            InAppNotificationDialogView

public class 
    implements butterknife.iew..ViewInjector
{

    public volatile void inject(butterknife.iew..ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (InAppNotificationDialogView)obj, obj1);
    }

    public void inject(butterknife.iew..ViewInjector viewinjector, InAppNotificationDialogView inappnotificationdialogview, Object obj)
    {
        inappnotificationdialogview.webView = (WebView)viewinjector.webView((View)viewinjector.webView(obj, 0x7f0d0297, "field 'webView'"), 0x7f0d0297, "field 'webView'");
        inappnotificationdialogview.cancelButton = (ImageView)viewinjector.cancelButton((View)viewinjector.cancelButton(obj, 0x7f0d00b2, "field 'cancelButton'"), 0x7f0d00b2, "field 'cancelButton'");
    }

    public volatile void reset(Object obj)
    {
        reset((InAppNotificationDialogView)obj);
    }

    public void reset(InAppNotificationDialogView inappnotificationdialogview)
    {
        inappnotificationdialogview.webView = null;
        inappnotificationdialogview.cancelButton = null;
    }

    public ()
    {
    }
}
