// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.dialogs;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

// Referenced classes of package me.lyft.android.ui.dialogs:
//            InsuranceExpiringDialogView

public class 
    implements butterknife...ViewInjector
{

    public volatile void inject(butterknife...ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (InsuranceExpiringDialogView)obj, obj1);
    }

    public void inject(butterknife...ViewInjector viewinjector, InsuranceExpiringDialogView insuranceexpiringdialogview, Object obj)
    {
        insuranceexpiringdialogview.titleTextView = (TextView)viewinjector.titleTextView((View)viewinjector.titleTextView(obj, 0x7f0d0238, "field 'titleTextView'"), 0x7f0d0238, "field 'titleTextView'");
        insuranceexpiringdialogview.messageTextView = (TextView)viewinjector.messageTextView((View)viewinjector.messageTextView(obj, 0x7f0d0239, "field 'messageTextView'"), 0x7f0d0239, "field 'messageTextView'");
        insuranceexpiringdialogview.updateInsuranceButton = (Button)viewinjector.updateInsuranceButton((View)viewinjector.updateInsuranceButton(obj, 0x7f0d023a, "field 'updateInsuranceButton'"), 0x7f0d023a, "field 'updateInsuranceButton'");
        insuranceexpiringdialogview.notNowButton = (Button)viewinjector.notNowButton((View)viewinjector.notNowButton(obj, 0x7f0d023b, "field 'notNowButton'"), 0x7f0d023b, "field 'notNowButton'");
    }

    public volatile void reset(Object obj)
    {
        reset((InsuranceExpiringDialogView)obj);
    }

    public void reset(InsuranceExpiringDialogView insuranceexpiringdialogview)
    {
        insuranceexpiringdialogview.titleTextView = null;
        insuranceexpiringdialogview.messageTextView = null;
        insuranceexpiringdialogview.updateInsuranceButton = null;
        insuranceexpiringdialogview.notNowButton = null;
    }

    public ()
    {
    }
}
