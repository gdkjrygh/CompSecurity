// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.dialogs;

import android.view.View;
import android.widget.Button;

// Referenced classes of package me.lyft.android.ui.dialogs:
//            CallConfirmationDialogView

public class I
    implements butterknife...ViewInjector
{

    public volatile void inject(butterknife...ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (CallConfirmationDialogView)obj, obj1);
    }

    public void inject(butterknife...ViewInjector viewinjector, CallConfirmationDialogView callconfirmationdialogview, Object obj)
    {
        callconfirmationdialogview.confirmCallButton = (Button)viewinjector.confirmCallButton((View)viewinjector.confirmCallButton(obj, 0x7f0d00b1, "field 'confirmCallButton'"), 0x7f0d00b1, "field 'confirmCallButton'");
    }

    public volatile void reset(Object obj)
    {
        reset((CallConfirmationDialogView)obj);
    }

    public void reset(CallConfirmationDialogView callconfirmationdialogview)
    {
        callconfirmationdialogview.confirmCallButton = null;
    }

    public I()
    {
    }
}
