// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver.expresspay;

import android.content.res.Resources;
import android.view.View;
import me.lyft.android.application.driver.expresspay.IExpressPayRepository;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.domain.driver.ExpressPay;

// Referenced classes of package me.lyft.android.ui.driver.expresspay:
//            ExpressPayView

class this._cls0
    implements android.view.ner
{

    final ExpressPayView this$0;

    public void onClick(View view)
    {
        dialogFlow.show(new .ExpressPayInfoDialog(expressPayRepository.getExpressPay().getPayoutInfoText(), getResources().getString(0x7f070188), false));
    }

    PayRepository()
    {
        this$0 = ExpressPayView.this;
        super();
    }
}
