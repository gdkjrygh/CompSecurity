// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import android.content.res.Resources;
import android.widget.TextView;
import me.lyft.android.application.payment.InvalidCardException;
import me.lyft.android.application.payment.InvalidFacebookCardException;
import me.lyft.android.application.payment.InvalidPayPalException;
import me.lyft.android.application.payment.InvalidWalletException;
import me.lyft.android.application.payment.PaymentException;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Strings;
import me.lyft.android.controls.AdvancedEditText;
import me.lyft.android.infrastructure.lyft.coupon.CouponException;
import me.lyft.android.ui.IViewErrorHandler;
import me.lyft.android.ui.payment.cardinput.CreditCardInput;

// Referenced classes of package me.lyft.android.ui.payment:
//            IPaymentErrorHandler

public class PaymentErrorHandler
    implements IPaymentErrorHandler
{

    private CreditCardInput cardInput;
    private DialogFlow dialogFlow;
    private TextView errorDescriptionTextView;
    private int originalValidationViewColor;
    private String originalValidationViewMessage;
    private Resources resources;
    private IViewErrorHandler viewErrorHandler;

    public PaymentErrorHandler(IViewErrorHandler iviewerrorhandler, Resources resources1, DialogFlow dialogflow)
    {
        viewErrorHandler = iviewerrorhandler;
        resources = resources1;
        dialogFlow = dialogflow;
    }

    private void resetInlineError()
    {
        if (errorDescriptionTextView != null)
        {
            errorDescriptionTextView.setTextColor(originalValidationViewColor);
            errorDescriptionTextView.setText(originalValidationViewMessage);
        } else
        if (cardInput != null)
        {
            cardInput.resetHighlight();
            return;
        }
    }

    private static int resolveCouponFailureReasonResource(String s)
    {
        byte byte0;
        if (s == null)
        {
            return 0x7f070275;
        }
        byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 6: default 72
    //                   -2117799681: 146
    //                   -656622178: 118
    //                   -200365452: 174
    //                   480057248: 188
    //                   661334036: 160
    //                   950412341: 132;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        break; /* Loop/switch isn't completed */
_L5:
        break MISSING_BLOCK_LABEL_188;
_L8:
        switch (byte0)
        {
        default:
            return 0x7f070275;

        case 0: // '\0'
            return 0x7f07026a;

        case 1: // '\001'
            return 0x7f070248;

        case 2: // '\002'
            return 0x7f070277;

        case 3: // '\003'
            return 0x7f07027d;

        case 4: // '\004'
            return 0x7f070279;

        case 5: // '\005'
            return 0x7f070284;
        }
_L3:
        if (s.equals("noneRemaining"))
        {
            byte0 = 0;
        }
          goto _L8
_L7:
        if (s.equals("alreadyUsed"))
        {
            byte0 = 1;
        }
          goto _L8
_L2:
        if (s.equals("outsideCouponRegion"))
        {
            byte0 = 2;
        }
          goto _L8
_L6:
        if (s.equals("newUsersOnly"))
        {
            byte0 = 3;
        }
          goto _L8
_L4:
        if (s.equals("locationRequired"))
        {
            byte0 = 4;
        }
          goto _L8
        if (s.equals("transientFailure"))
        {
            byte0 = 5;
        }
          goto _L8
    }

    private void showChargeFailDialog()
    {
        me.lyft.android.ui.Dialogs.AlertDialog alertdialog = (new me.lyft.android.ui.Dialogs.AlertDialog("debt_charge_failed_dialog")).setMessage(resources.getString(0x7f0700f8)).addPositiveButton(resources.getString(0x7f070212));
        dialogFlow.show(alertdialog);
    }

    private void showGenericPaymentFailedDialog(String s)
    {
        dialogFlow.show(new me.lyft.android.ui.Dialogs.ErrorDialog(resources.getString(0x7f0700c2), resources.getString(0x7f070212), s));
    }

    private void showInlineInvalidCardError(Throwable throwable)
    {
        String s = resources.getString(0x7f0701a6);
        if (!(throwable instanceof InvalidCardException)) goto _L2; else goto _L1
_L1:
        me.lyft.android.application.payment.InvalidCardException.Reason reason = ((InvalidCardException)throwable).getValidationReason();
        if (reason != me.lyft.android.application.payment.InvalidCardException.Reason.CLIENT_VALIDATION_ERROR) goto _L4; else goto _L3
_L3:
        cardInput.highlightErrorFields();
        throwable = s;
_L10:
        if (cardInput == null) goto _L6; else goto _L5
_L5:
        if (errorDescriptionTextView != null) goto _L8; else goto _L7
_L7:
        cardInput.showCreditCardInlineError(throwable);
_L6:
        return;
_L4:
        if (reason == me.lyft.android.application.payment.InvalidCardException.Reason.SERVER_VALIDATION_ERROR && !Strings.isNullOrEmpty(throwable.getMessage()))
        {
            s = throwable.getMessage();
            throwable = InvalidCardException.getServerLastInvalidReason(throwable.getCause());
            cardInput.highlightErrorFields(throwable);
            throwable = s;
            continue; /* Loop/switch isn't completed */
        }
        if (reason == me.lyft.android.application.payment.InvalidCardException.Reason.STRIPE_ERROR)
        {
            throwable = resources.getString(0x7f070271);
            cardInput.highlightCreditCardFields();
            continue; /* Loop/switch isn't completed */
        }
          goto _L2
_L8:
        errorDescriptionTextView.setVisibility(0);
        errorDescriptionTextView.setTextColor(resources.getColor(0x7f0c008f));
        errorDescriptionTextView.setText(throwable);
        errorDescriptionTextView.setCompoundDrawables(null, null, null, null);
        return;
_L2:
        throwable = s;
        if (true) goto _L10; else goto _L9
_L9:
    }

    public void attach(CreditCardInput creditcardinput, TextView textview)
    {
        cardInput = creditcardinput;
        cardInput.addOnInputChangedListener(new me.lyft.android.ui.payment.cardinput.CreditCardInput.OnInputChangedListener() {

            final PaymentErrorHandler this$0;

            public void onInputChanged()
            {
                resetInlineError();
            }

            
            {
                this$0 = PaymentErrorHandler.this;
                super();
            }
        });
        if (textview != null)
        {
            errorDescriptionTextView = textview;
            originalValidationViewColor = textview.getCurrentTextColor();
            originalValidationViewMessage = textview.getText().toString();
        }
    }

    public void handleCardError(Throwable throwable)
    {
        if (me/lyft/android/application/payment/PaymentException.isAssignableFrom(throwable.getClass()))
        {
            if ((PaymentException)throwable instanceof InvalidCardException)
            {
                showInlineInvalidCardError(throwable);
                return;
            } else
            {
                showGenericPaymentFailedDialog("failed_save_card_dialog");
                return;
            }
        } else
        {
            viewErrorHandler.handle(throwable);
            return;
        }
    }

    public void handleCouponError(Throwable throwable, AdvancedEditText advancededittext)
    {
        int j = 0x7f07020b;
        if (!(throwable instanceof CouponException)) goto _L2; else goto _L1
_L1:
        int i = resolveCouponFailureReasonResource(((CouponException)throwable).getFailureReason());
_L4:
        advancededittext.setValidationErrorId(Integer.valueOf(i));
        return;
_L2:
        i = j;
        if (!(throwable instanceof PaymentException))
        {
            viewErrorHandler.handle(throwable);
            i = j;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void handleFacebookCardError(Throwable throwable)
    {
        if (me/lyft/android/application/payment/PaymentException.isAssignableFrom(throwable.getClass()))
        {
            throwable = (PaymentException)throwable;
            if ((throwable instanceof InvalidCardException) || (throwable instanceof InvalidFacebookCardException))
            {
                dialogFlow.show(new me.lyft.android.ui.Dialogs.ErrorDialog(resources.getString(0x7f07026c), resources.getString(0x7f07026b), resources.getString(0x7f070212), "facebook_card_error_dialog"));
                return;
            } else
            {
                showGenericPaymentFailedDialog("failed_set_as_default_card_dialog");
                return;
            }
        } else
        {
            viewErrorHandler.handle(throwable);
            return;
        }
    }

    public void handlePayDebtError(Throwable throwable)
    {
        if (throwable instanceof PaymentException)
        {
            showChargeFailDialog();
            return;
        } else
        {
            viewErrorHandler.handle(throwable);
            return;
        }
    }

    public void handlePayPalError(Throwable throwable)
    {
        if (me/lyft/android/application/payment/PaymentException.isAssignableFrom(throwable.getClass()))
        {
            if ((PaymentException)throwable instanceof InvalidPayPalException)
            {
                dialogFlow.show(new me.lyft.android.ui.Dialogs.ErrorDialog(resources.getString(0x7f070288), resources.getString(0x7f070287), resources.getString(0x7f070212), "paypal_dialog"));
                return;
            } else
            {
                showGenericPaymentFailedDialog("failed_save_paypal_dialog");
                return;
            }
        } else
        {
            viewErrorHandler.handle(throwable);
            return;
        }
    }

    public void handleSaveDebtCardError(Throwable throwable)
    {
        if (throwable instanceof InvalidCardException)
        {
            showInlineInvalidCardError(throwable);
            return;
        }
        if (throwable instanceof PaymentException)
        {
            showChargeFailDialog();
            return;
        } else
        {
            viewErrorHandler.handle(throwable);
            return;
        }
    }

    public void handleWalletError(Throwable throwable)
    {
        if (me/lyft/android/application/payment/PaymentException.isAssignableFrom(throwable.getClass()))
        {
            throwable = (PaymentException)throwable;
            if ((throwable instanceof InvalidCardException) || (throwable instanceof InvalidWalletException))
            {
                dialogFlow.show(new me.lyft.android.ui.Dialogs.ErrorDialog(resources.getString(0x7f070186), resources.getString(0x7f070185), resources.getString(0x7f070212), "google_wallet_card_error_dialog"));
                return;
            } else
            {
                showGenericPaymentFailedDialog("failed_save_wallet_card_dialog");
                return;
            }
        } else
        {
            viewErrorHandler.handle(throwable);
            return;
        }
    }

}
