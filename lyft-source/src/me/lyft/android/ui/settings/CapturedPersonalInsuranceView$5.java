// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.settings;

import android.content.res.Resources;
import java.util.List;
import me.lyft.android.application.driverdocuments.StatesProvider;
import me.lyft.android.controls.AdvancedTextView;
import me.lyft.android.domain.driverdocuments.State;
import me.lyft.android.ui.dialogs.DialogResult;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.settings:
//            CapturedPersonalInsuranceView

class this._cls0
    implements Action1
{

    final CapturedPersonalInsuranceView this$0;

    public volatile void call(Object obj)
    {
        call((DialogResult)obj);
    }

    public void call(DialogResult dialogresult)
    {
        if (dialogresult.getSelectedIndex() >= 0)
        {
            List list = statesProvider.getStates();
            String s = ((State)list.get(dialogresult.getSelectedIndex())).getCode();
            if (!s.equals(CapturedPersonalInsuranceView.access$300(CapturedPersonalInsuranceView.this)))
            {
                CapturedPersonalInsuranceView.access$302(CapturedPersonalInsuranceView.this, s);
                dialogresult = ((State)list.get(dialogresult.getSelectedIndex())).getLabel();
                insuranceStateTextView.setText(getResources().getString(0x7f0700a5, new Object[] {
                    dialogresult
                }));
            }
        }
        CapturedPersonalInsuranceView.access$400(CapturedPersonalInsuranceView.this);
    }

    A()
    {
        this$0 = CapturedPersonalInsuranceView.this;
        super();
    }
}
