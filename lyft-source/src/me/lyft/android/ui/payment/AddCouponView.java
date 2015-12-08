// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import me.lyft.android.application.payment.IPaymentService;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Strings;
import me.lyft.android.common.Unit;
import me.lyft.android.controls.AdvancedEditText;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.rx.Binder;
import me.lyft.android.rx.MessageBus;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.dialogs.Toast;
import me.lyft.android.utils.Keyboard;

// Referenced classes of package me.lyft.android.ui.payment:
//            IPaymentErrorHandler

public class AddCouponView extends LinearLayout
{

    Button applyCouponButton;
    private android.view.View.OnClickListener applyCouponClickListener;
    private Binder binder;
    private android.view.View.OnFocusChangeListener couponEditFocusListener;
    AdvancedEditText couponEditText;
    private android.widget.TextView.OnEditorActionListener couponEditorActionListener;
    private TextWatcher couponTextChangedListener;
    DialogFlow dialogFlow;
    TextView inlineCouponError;
    MessageBus messageBus;
    IPaymentErrorHandler paymentErrorHandler;
    IPaymentService paymentService;
    IProgressController progressController;

    public AddCouponView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        couponTextChangedListener = new TextWatcher() {

            public boolean avoidLoop;
            final AddCouponView this$0;

            public void afterTextChanged(Editable editable)
            {
                if (!avoidLoop)
                {
                    avoidLoop = true;
                    editable.replace(0, editable.length(), editable.toString().toUpperCase(), 0, editable.length());
                    avoidLoop = false;
                }
            }

            public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
            {
            }

            public void onTextChanged(CharSequence charsequence, int i, int j, int k)
            {
                boolean flag = true;
                Button button = applyCouponButton;
                if (charsequence.length() <= 1)
                {
                    flag = false;
                }
                button.setEnabled(flag);
                inlineCouponError.setVisibility(8);
            }

            
            {
                this$0 = AddCouponView.this;
                super();
            }
        };
        applyCouponClickListener = new android.view.View.OnClickListener() {

            final AddCouponView this$0;

            public void onClick(View view)
            {
                applyCoupon();
            }

            
            {
                this$0 = AddCouponView.this;
                super();
            }
        };
        couponEditorActionListener = new android.widget.TextView.OnEditorActionListener() {

            final AddCouponView this$0;

            public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
            {
                if (i == 6 && applyCouponButton.isEnabled())
                {
                    applyCoupon();
                    return true;
                } else
                {
                    return false;
                }
            }

            
            {
                this$0 = AddCouponView.this;
                super();
            }
        };
        couponEditFocusListener = new android.view.View.OnFocusChangeListener() {

            final AddCouponView this$0;

            public void onFocusChange(View view, boolean flag)
            {
                boolean flag1 = true;
                if (flag)
                {
                    applyCouponButton.setVisibility(0);
                    view = applyCouponButton;
                    if (couponEditText.length() > 1)
                    {
                        flag = flag1;
                    } else
                    {
                        flag = false;
                    }
                    view.setEnabled(flag);
                }
            }

            
            {
                this$0 = AddCouponView.this;
                super();
            }
        };
        Scoop.a(this).b(this);
    }

    private void applyCoupon()
    {
        progressController.disableUI();
        progressController.showProgress();
        Keyboard.hideKeyboard(couponEditText);
        applyCouponButton.setEnabled(false);
        String s = couponEditText.getText().toString();
        binder.bind(paymentService.applyCoupon(s), new AsyncCall() {

            final AddCouponView this$0;

            public void onFail(Throwable throwable)
            {
                super.onFail(throwable);
                applyCouponButton.setEnabled(false);
                Keyboard.hideKeyboard(couponEditText);
                paymentErrorHandler.handleCouponError(throwable, couponEditText);
                inlineCouponError.setVisibility(0);
            }

            public volatile void onSuccess(Object obj)
            {
                onSuccess((Unit)obj);
            }

            public void onSuccess(Unit unit)
            {
                super.onSuccess(unit);
                resetCouponEditTextAndApplyButton();
                dialogFlow.show(new Toast(getContext().getString(0x7f07024e)));
                messageBus.post(me/lyft/android/ui/payment/PaymentView$ReloadCardListEvent, null);
            }

            public void onUnsubscribe()
            {
                super.onUnsubscribe();
                progressController.enableUI();
                progressController.hideProgress();
            }

            
            {
                this$0 = AddCouponView.this;
                super();
            }
        });
    }

    private void resetCouponEditTextAndApplyButton()
    {
        couponEditText.setText("");
        couponEditText.clearFocus();
        applyCouponButton.setEnabled(false);
        applyCouponButton.setVisibility(8);
        inlineCouponError.setVisibility(8);
    }

    private void setCouponEditTextAndApplyButton()
    {
        if (couponEditText.length() < 1)
        {
            applyCouponButton.setEnabled(false);
            applyCouponButton.setVisibility(8);
            return;
        } else
        {
            Keyboard.showKeyboard(couponEditText);
            applyCouponButton.setVisibility(0);
            return;
        }
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (!isInEditMode())
        {
            binder = Binder.attach(this);
            couponEditText.addTextChangedListener(couponTextChangedListener);
            couponEditText.setOnEditorActionListener(couponEditorActionListener);
            couponEditText.setOnFocusChangeListener(couponEditFocusListener);
            couponEditText.setValidationMessageView(inlineCouponError);
            applyCouponButton.setOnClickListener(applyCouponClickListener);
            setCouponEditTextAndApplyButton();
            if (!Strings.isNullOrEmpty(couponEditText.getText().toString()))
            {
                applyCoupon();
                return;
            }
        }
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        couponEditText.removeTextChangedListener(couponTextChangedListener);
        couponEditText.setOnEditorActionListener(null);
        couponEditText.setOnFocusChangeListener(null);
        Keyboard.hideKeyboard(couponEditText);
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        if (isInEditMode())
        {
            return;
        } else
        {
            ButterKnife.a(this);
            return;
        }
    }

    public void setCoupon(String s)
    {
        couponEditText.setText(s.trim().toUpperCase());
    }


}
