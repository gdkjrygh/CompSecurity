// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.common;

import android.content.Context;
import android.os.Bundle;
import com.dominos.android.sdk.core.models.LabsOrder;
import com.dominos.android.sdk.core.models.LabsPayment;
import com.dominos.android.sdk.core.models.LabsProduct;
import com.dominos.android.sdk.core.models.LabsProductLine;
import com.google.android.gms.common.e;
import com.google.android.gms.wallet.Address;
import com.google.android.gms.wallet.Cart;
import com.google.android.gms.wallet.FullWalletRequest;
import com.google.android.gms.wallet.LineItem;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;
import com.google.android.gms.wallet.a;
import com.google.android.gms.wallet.b;
import com.google.android.gms.wallet.c;
import com.google.android.gms.wallet.d;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.dominos.android.sdk.common:
//            NumberUtil, FormUtil

public class GoogleWalletUtil
{

    private static final String CURRENCY_CODE = "USD";
    private static final String MERCHANT_NAME = "Domino's Pizza";
    private static final double TIP_PADDING_MINIMUM = 1D;
    private static final double TIP_PADDING_PERCENTAGE = 0.01D;

    public GoogleWalletUtil()
    {
    }

    public static double getGwTipPaddingAsPercent(int i)
    {
        return (double)i * 0.01D + 1.0D;
    }

    public Cart buildCartForWallet(LabsOrder labsorder)
    {
        a a1 = Cart.a().b("USD");
        String s2;
        Object obj;
        for (Iterator iterator = labsorder.getProductLineList().iterator(); iterator.hasNext(); a1.a(LineItem.a().e("USD").a(((String) (obj))).d(s2).a()))
        {
            obj = (LabsProductLine)iterator.next();
            s2 = (new NumberUtil()).doubleToCurrencyString(Double.valueOf(((LabsProductLine) (obj)).getPrice()));
            obj = (new StringBuilder()).append(String.valueOf(((LabsProductLine) (obj)).getQuantity())).append(" ").append(((LabsProductLine) (obj)).getProduct().getName()).toString();
        }

        if (labsorder.getServiceMethod().equalsIgnoreCase("Delivery"))
        {
            String s = (new NumberUtil()).doubleToCurrencyString(Double.valueOf(labsorder.getDeliveryAmount()));
            a1.a(LineItem.a().e("USD").a("Delivery Charge").b("1").c(s).d(s).a());
        }
        String s1 = (new NumberUtil()).doubleToCurrencyString(Double.valueOf(labsorder.getTaxAmount()));
        a1.a(LineItem.a().e("USD").a("Shipping").a(2).d("0.00").a()).a(LineItem.a().e("USD").a("Tax").a(1).d(s1).a());
        a1.a((new NumberUtil()).doubleToCurrencyString(Double.valueOf(labsorder.getPrice())));
        return a1.a();
    }

    public void checkForGooglePlayServices(Context context, GooglePlayServiceCheckCallback googleplayservicecheckcallback)
    {
        int i = e.a(context);
        if (i == 0)
        {
            googleplayservicecheckcallback.onGooglePlayServiceAvailable();
            return;
        }
        if (i == 1 || i == 2 || i == 3)
        {
            googleplayservicecheckcallback.onGooglePlayServiceNotAvailable(i);
            return;
        } else
        {
            googleplayservicecheckcallback.onGooglePlayServiceNotAvailable(i);
            return;
        }
    }

    public FullWalletRequest createFullWalletRequest(LabsOrder labsorder, String s)
    {
        labsorder = buildCartForWallet(labsorder);
        return FullWalletRequest.a().a(s).a(labsorder).a();
    }

    public MaskedWalletRequest createMaskedWalletRequest(LabsOrder labsorder, int i)
    {
        Cart cart = buildCartForWallet(labsorder);
        double d1 = getGwTipPaddingAsPercent(i);
        double d2 = labsorder.getPrice();
        labsorder = (new NumberUtil()).doubleToCurrencyString(Double.valueOf(d1 * d2));
        return MaskedWalletRequest.a().c("Domino's Pizza").a().b().b("USD").a(cart).a(labsorder).c();
    }

    public String getCardLastFour(String as[])
    {
        if (as == null)
        {
            return "";
        }
        if (as.length <= 0)
        {
            return "";
        }
        as = as[0];
        if (as.lastIndexOf('-') == as.length() - 5)
        {
            return as.substring(as.lastIndexOf('-') + 1);
        } else
        {
            return "";
        }
    }

    public String getCardType(String as[])
    {
        if (as == null)
        {
            return "";
        }
        if (as.length <= 0)
        {
            return "";
        }
        as = as[0].split("-");
        if (as != null && as.length > 0)
        {
            return as[0].split(" ")[0];
        } else
        {
            return "";
        }
    }

    public Bundle getValuesFormMaskedWallet(MaskedWallet maskedwallet)
    {
        String s;
        String s1;
        Object obj;
        Object obj1;
        obj = maskedwallet.f();
        s1 = ((Address) (obj)).b();
        obj1 = s1.split(" ");
        s = "";
        if (obj1.length <= 2) goto _L2; else goto _L1
_L1:
        s1 = obj1[0];
        s = String.format("%s %s", new Object[] {
            obj1[1], obj1[2]
        });
_L4:
        obj = (new FormUtil()).parseTenDigitPhoneNumber(((Address) (obj)).d());
        maskedwallet = maskedwallet.e();
        obj1 = new Bundle();
        ((Bundle) (obj1)).putString("first_name", s1);
        ((Bundle) (obj1)).putString("last_name", s);
        ((Bundle) (obj1)).putString("phone", ((String) (obj)));
        ((Bundle) (obj1)).putString("phone_ext", "");
        ((Bundle) (obj1)).putString("email", maskedwallet);
        return ((Bundle) (obj1));
_L2:
        if (obj1.length == 2)
        {
            s1 = obj1[0];
            s = obj1[1];
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public boolean isGoogleWalletPayment(LabsOrder labsorder)
    {
        return labsorder != null && labsorder.getPaymentList() != null && labsorder.getPaymentList().size() > 0 && ((LabsPayment)labsorder.getPaymentList().get(0)).getWalletPayment() != null;
    }

    private class GooglePlayServiceCheckCallback extends BaseCallback
    {

        public abstract void onGooglePlayServiceAvailable();

        public abstract void onGooglePlayServiceNotAvailable(int i);

        public GooglePlayServiceCheckCallback()
        {
        }
    }

}
