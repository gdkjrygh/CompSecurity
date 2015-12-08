// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.dialogs;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

// Referenced classes of package me.lyft.android.ui.dialogs:
//            UpdateAppDialogView

public class 
    implements butterknife...ViewInjector
{

    public volatile void inject(butterknife...ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (UpdateAppDialogView)obj, obj1);
    }

    public void inject(butterknife...ViewInjector viewinjector, UpdateAppDialogView updateappdialogview, Object obj)
    {
        updateappdialogview.okButton = (Button)viewinjector.okButton((View)viewinjector.okButton(obj, 0x7f0d014c, "field 'okButton'"), 0x7f0d014c, "field 'okButton'");
        updateappdialogview.messageTextView = (TextView)viewinjector.messageTextView((View)viewinjector.messageTextView(obj, 0x7f0d01ec, "field 'messageTextView'"), 0x7f0d01ec, "field 'messageTextView'");
    }

    public volatile void reset(Object obj)
    {
        reset((UpdateAppDialogView)obj);
    }

    public void reset(UpdateAppDialogView updateappdialogview)
    {
        updateappdialogview.okButton = null;
        updateappdialogview.messageTextView = null;
    }

    public ()
    {
    }
}
