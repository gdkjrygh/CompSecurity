// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.frontinginstrument;

import com.google.android.apps.wallet.paymentcard.api.PaymentCard;
import java.util.Iterator;
import java.util.List;

public final class TapAndPayModel
{

    private final List fundingSources;

    public TapAndPayModel(List list)
    {
        fundingSources = list;
    }

    public final PaymentCard getSelectedCredential(List list)
    {
        list = list.iterator();
        PaymentCard paymentcard;
label0:
        do
        {
            if (list.hasNext())
            {
                paymentcard = (PaymentCard)list.next();
                Iterator iterator = fundingSources.iterator();
                com.google.wallet.proto.NanoWalletEntities.CdpIdData cdpiddata;
                do
                {
                    if (!iterator.hasNext())
                    {
                        continue label0;
                    }
                    cdpiddata = (com.google.wallet.proto.NanoWalletEntities.CdpIdData)iterator.next();
                } while (!paymentcard.getCdpId().subId.equals(cdpiddata.subId));
                break;
            } else
            {
                return null;
            }
        } while (true);
        return paymentcard;
    }

    public final boolean isStoredValueEnabled(com.google.wallet.proto.NanoWalletEntities.StoredValue storedvalue)
    {
        if (storedvalue != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        Iterator iterator = fundingSources.iterator();
        com.google.wallet.proto.NanoWalletEntities.CdpIdData cdpiddata;
        do
        {
            if (!iterator.hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
            cdpiddata = (com.google.wallet.proto.NanoWalletEntities.CdpIdData)iterator.next();
        } while (!storedvalue.id.subId.equals(cdpiddata.subId));
        break; /* Loop/switch isn't completed */
        if (true) goto _L1; else goto _L3
_L3:
        return true;
    }
}
