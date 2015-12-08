// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.payment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import me.lyft.android.common.Objects;
import me.lyft.android.infrastructure.lyft.payment.ChargeAccountDTO;

// Referenced classes of package me.lyft.android.domain.payment:
//            ChargeAccount, NullChargeAccount, CreditCardChargeAccount, WalletChargeAccount, 
//            PayPalChargeAccount, CreditLineChargeAccount, FacebookChargeAccount

public class ChargeAccountMapper
{

    public static final String METHOD_CARD = "card";
    public static final String METHOD_CREDITLINE = "creditLine";
    public static final String METHOD_FACEBOOK = "facebook";
    public static final String METHOD_GOOGLE_WALLET = "googleWallet";
    public static final String METHOD_PAYPAL = "paypal";

    public ChargeAccountMapper()
    {
    }

    public static List fromChargeAccountDTO(List list)
    {
        if (list == null || list.isEmpty())
        {
            return Collections.emptyList();
        }
        ArrayList arraylist = new ArrayList(list.size());
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            ChargeAccount chargeaccount = fromChargeAccountDTO((ChargeAccountDTO)list.next());
            if (!chargeaccount.isNull())
            {
                arraylist.add(chargeaccount);
            }
        } while (true);
        return arraylist;
    }

    public static ChargeAccount fromChargeAccountDTO(ChargeAccountDTO chargeaccountdto)
    {
        Object obj = (String)Objects.firstNonNull(chargeaccountdto.getMethod(), "");
        ((String) (obj)).hashCode();
        JVM INSTR lookupswitch 5: default 68
    //                   -2032709742: 122
    //                   -995205389: 136
    //                   -564548979: 150
    //                   3046160: 108
    //                   497130182: 164;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        byte byte0 = -1;
_L14:
        byte0;
        JVM INSTR tableswitch 0 4: default 104
    //                   0 178
    //                   1 262
    //                   2 289
    //                   3 316
    //                   4 344;
           goto _L7 _L8 _L9 _L10 _L11 _L12
_L7:
        return NullChargeAccount.getInstance();
_L5:
        if (!((String) (obj)).equals("card")) goto _L1; else goto _L13
_L13:
        byte0 = 0;
          goto _L14
_L2:
        if (!((String) (obj)).equals("googleWallet")) goto _L1; else goto _L15
_L15:
        byte0 = 1;
          goto _L14
_L3:
        if (!((String) (obj)).equals("paypal")) goto _L1; else goto _L16
_L16:
        byte0 = 2;
          goto _L14
_L4:
        if (!((String) (obj)).equals("creditLine")) goto _L1; else goto _L17
_L17:
        byte0 = 3;
          goto _L14
_L6:
        if (!((String) (obj)).equals("facebook")) goto _L1; else goto _L18
_L18:
        byte0 = 4;
          goto _L14
_L8:
        obj = new CreditCardChargeAccount();
        ((CreditCardChargeAccount) (obj)).setLastFour(chargeaccountdto.getLastFour());
        ((CreditCardChargeAccount) (obj)).setType(chargeaccountdto.getType());
_L20:
        ((ChargeAccount) (obj)).setId(chargeaccountdto.getId());
        ((ChargeAccount) (obj)).setDefault((Boolean)Objects.firstNonNull(chargeaccountdto.isDefault(), Boolean.FALSE));
        ((ChargeAccount) (obj)).setFailed((Boolean)Objects.firstNonNull(chargeaccountdto.isFailed(), Boolean.FALSE));
        ((ChargeAccount) (obj)).setLabel(chargeaccountdto.getLabel());
        ((ChargeAccount) (obj)).setLabelType(chargeaccountdto.getLabelType());
        return ((ChargeAccount) (obj));
_L9:
        obj = new WalletChargeAccount();
        ((WalletChargeAccount) (obj)).setLastFour(chargeaccountdto.getLastFour());
        ((WalletChargeAccount) (obj)).setType(chargeaccountdto.getType());
        continue; /* Loop/switch isn't completed */
_L10:
        obj = new PayPalChargeAccount();
        ((PayPalChargeAccount) (obj)).setEmail((String)Objects.firstNonNull(chargeaccountdto.getEmail(), ""));
        continue; /* Loop/switch isn't completed */
_L11:
        obj = new CreditLineChargeAccount();
        ((CreditLineChargeAccount) (obj)).setRequestNotes((Boolean)Objects.firstNonNull(chargeaccountdto.isRequestNotes(), Boolean.FALSE));
        continue; /* Loop/switch isn't completed */
_L12:
        obj = new FacebookChargeAccount(chargeaccountdto.getLastFour(), chargeaccountdto.getType());
        if (true) goto _L20; else goto _L19
_L19:
    }
}
