// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.payment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.lyft.android.common.Objects;
import me.lyft.android.common.Unit;
import me.lyft.android.domain.payment.ChargeAccount;
import me.lyft.android.domain.payment.ChargeAccountMapper;
import me.lyft.android.infrastructure.lyft.AppStateDTO;
import me.lyft.android.infrastructure.lyft.payment.ChargeAccountDTO;
import me.lyft.android.infrastructure.lyft.profile.NullUserDTO;
import me.lyft.android.infrastructure.lyft.profile.UserDTO;
import rx.Observable;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.application.payment:
//            PaymentService, PaymentException

class val.reason
    implements Func1
{

    final PaymentService this$0;
    final String val$chargeAccountId;
    final String val$reason;

    public volatile Object call(Object obj)
    {
        return call((AppStateDTO)obj);
    }

    public Observable call(AppStateDTO appstatedto)
    {
        appstatedto = ((List)Objects.firstNonNull(((UserDTO)Objects.firstNonNull(appstatedto.getUser(), NullUserDTO.getInstance())).getChargeAccounts(), new ArrayList())).iterator();
_L4:
        if (!appstatedto.hasNext()) goto _L2; else goto _L1
_L1:
        ChargeAccountDTO chargeaccountdto = (ChargeAccountDTO)appstatedto.next();
        if (!val$chargeAccountId.equals(chargeaccountdto.getId())) goto _L4; else goto _L3
_L3:
        appstatedto = ChargeAccountMapper.fromChargeAccountDTO(chargeaccountdto);
_L6:
        if (appstatedto != null && appstatedto.isFailed().booleanValue())
        {
            return Observable.error(new PaymentException("Charging debt failed", null, val$reason));
        } else
        {
            return Observable.just(Unit.create());
        }
_L2:
        appstatedto = null;
        if (true) goto _L6; else goto _L5
_L5:
    }

    ountDTO()
    {
        this$0 = final_paymentservice;
        val$chargeAccountId = s;
        val$reason = String.this;
        super();
    }
}
