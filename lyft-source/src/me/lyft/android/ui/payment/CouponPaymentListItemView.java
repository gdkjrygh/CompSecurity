// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import android.content.Context;
import android.content.res.Resources;
import com.lyft.scoop.Scoop;
import java.util.List;
import me.lyft.android.application.checkout.ICheckoutSession;
import me.lyft.android.application.ride.IRideFareRepository;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Strings;
import me.lyft.android.domain.payment.Credit;

// Referenced classes of package me.lyft.android.ui.payment:
//            PaymentListItemView

public abstract class CouponPaymentListItemView extends PaymentListItemView
{

    AppFlow appFlow;
    ICheckoutSession checkoutSession;
    Credit credit;
    DialogFlow dialogFlow;
    IRideFareRepository fareRepository;
    private final int mode;

    public CouponPaymentListItemView(Context context, Credit credit1, int i)
    {
        super(context);
        Scoop.a(this).b(this);
        setCredit(credit1);
        mode = i;
    }

    private String getInvalidCreditMessage()
    {
        List list = credit.getInvalidRestrictions();
        if (list.isEmpty())
        {
            return getResources().getString(0x7f070276);
        } else
        {
            return listToString(list);
        }
    }

    private String getInvalidCreditTitle()
    {
        String s1 = credit.getInvalidTitle();
        String s = s1;
        if (Strings.isNullOrEmpty(s1))
        {
            s = getResources().getString(0x7f070274);
        }
        return s;
    }

    private static String listToString(List list)
    {
        int i = 1;
        String s = (String)list.get(0);
        String s1 = s;
        if (!Strings.isNullOrEmpty(s))
        {
            s1 = s;
            if (list.size() > 1)
            {
                while (i < list.size()) 
                {
                    s1 = s;
                    if (!Strings.isNullOrEmpty((String)list.get(i)))
                    {
                        s1 = (new StringBuilder()).append(s).append(". ").append((String)list.get(i)).toString();
                    }
                    i++;
                    s = s1;
                }
                s1 = s;
            }
        }
        return s1;
    }

    private void showInvalidCreditDialog()
    {
        me.lyft.android.ui.Dialogs.AlertDialog alertdialog = (new me.lyft.android.ui.Dialogs.AlertDialog("invalid_credit_dialog")).setTitle(getInvalidCreditTitle()).setTitleColorResource(0x7f0c00b7).setMessage(getInvalidCreditMessage()).addPositiveButton(getResources().getString(0x7f070212));
        dialogFlow.show(alertdialog);
    }

    protected int getIcon()
    {
        return 0x7f020075;
    }

    protected int getMode()
    {
        return mode;
    }

    protected String getSubTitle()
    {
        return credit.getDescription();
    }

    protected String getTitle()
    {
        return credit.getTitle();
    }

    protected boolean isFailed()
    {
        return false;
    }

    protected boolean isSelectedPayment()
    {
        return credit.getId().equals(checkoutSession.getSelectedPaymentMethodId());
    }

    protected abstract void onOpenCreditDetails();

    public boolean performClick()
    {
        if (mode == 1)
        {
            if (credit.isValid() && checkoutSession.selectCoupon(credit.getId()))
            {
                appFlow.resetTo(new me.lyft.android.ui.MainScreens.RideScreen());
                return true;
            } else
            {
                showInvalidCreditDialog();
                return true;
            }
        } else
        {
            onOpenCreditDetails();
            return true;
        }
    }

    protected void setCredit(Credit credit1)
    {
        credit = credit1;
    }
}
