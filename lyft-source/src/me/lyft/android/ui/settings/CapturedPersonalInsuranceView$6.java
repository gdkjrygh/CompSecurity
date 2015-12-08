// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.settings;

import java.text.DateFormat;
import me.lyft.android.common.DateUtils;
import me.lyft.android.controls.AdvancedTextView;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.settings:
//            CapturedPersonalInsuranceView

class this._cls0
    implements Action1
{

    final CapturedPersonalInsuranceView this$0;

    public volatile void call(Object obj)
    {
        call((me.lyft.android.ui.dialogs.dEventArgs)obj);
    }

    public void call(me.lyft.android.ui.dialogs.dEventArgs deventargs)
    {
        CapturedPersonalInsuranceView.access$502(CapturedPersonalInsuranceView.this, DateUtils.createDate(deventargs.getYear(), deventargs.getMonth(), deventargs.getDay()));
        deventargs = CapturedPersonalInsuranceView.DATE_UI_FORMAT.format(CapturedPersonalInsuranceView.access$500(CapturedPersonalInsuranceView.this));
        if (!insuranceExpirationTextView.getText().toString().equals(deventargs))
        {
            insuranceExpirationTextView.setText(deventargs);
        }
        CapturedPersonalInsuranceView.access$400(CapturedPersonalInsuranceView.this);
    }

    EventArgs()
    {
        this$0 = CapturedPersonalInsuranceView.this;
        super();
    }
}
