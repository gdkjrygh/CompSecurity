// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.dominos.MobileSession;
import com.dominos.android.sdk.common.NumberUtil;
import com.dominos.android.sdk.common.dom.order.GiftCard;
import com.dominos.android.sdk.core.giftcard.GiftCardFormattingTextWatcher;
import com.dominos.android.sdk.core.giftcard.GiftCardManager;
import com.dominos.android.sdk.core.models.LabsOrder;
import com.dominos.android.sdk.core.order.OrderManager;
import com.dominos.controllers.GiftCardController;
import com.dominos.controllers.interfaces.IAddGiftCardActivity;
import com.dominos.controllers.utils.ControllerLocator;
import com.dominos.inputfilters.DecimalDigitsInputFilter;
import com.dominos.model.EditTextModel;
import com.dominos.utils.ActivityHelper;
import com.dominos.utils.AlertType;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.dominos.activities:
//            BaseActivity, GiftCardInfoActivity_

public class AddGiftCardActivity extends BaseActivity
    implements android.view.View.OnClickListener, IAddGiftCardActivity
{

    private static final int CURRENTAPIVERSION;
    private final float ALERT_TEXT_SIZE = 14F;
    private final float DISABLEALPHA = 0.5F;
    private final float ENABLEALPHA = 1.0F;
    private final int NUMBERMAXLENGTH = 23;
    private final int PINMAXLENGTH = 4;
    private final String TAG = com/dominos/activities/AddGiftCardActivity.getName();
    Button btnAddGiftCard;
    Button btnDeleteGiftCard;
    Button btnUpdateGiftCard;
    ControllerLocator controllerLocator;
    RelativeLayout editArea;
    GiftCard editGiftCard;
    private ArrayList editTexts;
    ImageButton imgNumberInfo;
    ImageButton imgPinInfo;
    TextView lblBalanceDue;
    TextView lblBalanceOfCard;
    TextView lblOrderTotal;
    private com.dominos.utils.ActivityHelper.AlertActionCallback mAlertActionCallback;
    private GiftCardController mGiftCardController;
    private GiftCardManager mGiftCardManager;
    private NumberUtil numUtil;
    ImageButton numberInfo;
    ImageButton pinInfo;
    EditText txtAmountToApply;
    EditText txtGiftCardNumber;
    EditText txtGiftCardPin;

    public AddGiftCardActivity()
    {
        mAlertActionCallback = new _cls1();
    }

    private void showAlertDialogs(int i)
    {
        switch (i)
        {
        case 4: // '\004'
        case 5: // '\005'
        default:
            return;

        case 6: // '\006'
            mActivityHelper.showOptionAlert(AlertType.GIFT_CARD_REMOVE, null, new _cls2());
            return;

        case 7: // '\007'
            mActivityHelper.showAlert(AlertType.GIFT_CARD_DUPLICATE);
            return;

        case 8: // '\b'
            mActivityHelper.showAlert(AlertType.GIFT_CARD_MORE_BALANCE);
            return;

        case 9: // '\t'
            mActivityHelper.showAlert(AlertType.GIFT_CARD_MORE_THAN_ORDER);
            return;

        case 10: // '\n'
            mActivityHelper.showAlert(AlertType.GIFT_CARD_ERROR);
            return;

        case 3: // '\003'
            mActivityHelper.showAlert(AlertType.GIFT_CARD_NUMBER_ERROR);
            return;

        case 11: // '\013'
            mActivityHelper.showAlert(AlertType.GIFT_CARD_AMOUNT_LOW, mAlertActionCallback);
            break;
        }
    }

    public void addTextWatcher(EditText edittext, int i, Button button)
    {
        editTexts.add(new EditTextModel(edittext, i));
        edittext.addTextChangedListener(new TextWatcherHelper(i, button));
    }

    public void applyGiftCard()
    {
        Object obj = txtGiftCardNumber.getText().toString().replaceAll(" ", "");
        obj = (new com.dominos.android.sdk.common.dom.order.GiftCard.Builder()).setFullNumber(((String) (obj))).setPin(txtGiftCardPin.getText().toString()).build();
        mGiftCardController.getBalance(((GiftCard) (obj)));
    }

    public boolean checkIfFieldsComplete()
    {
        for (Iterator iterator = editTexts.iterator(); iterator.hasNext();)
        {
            EditTextModel edittextmodel = (EditTextModel)iterator.next();
            if (edittextmodel.getEditText().getText().length() != edittextmodel.getMaxLength())
            {
                return false;
            }
        }

        return true;
    }

    public void determineView()
    {
        if (editGiftCard == null)
        {
            setUpAddView();
            return;
        } else
        {
            setUpEditView();
            return;
        }
    }

    public void disableButton(Button button)
    {
        setAlpha(button, 0.5F);
    }

    public void dismissProgressSpinner()
    {
        hideLoading();
    }

    public void enableButton(Button button)
    {
        setAlpha(button, 1.0F);
    }

    public Activity getActivity()
    {
        return this;
    }

    public boolean handleHomeButtonClicked()
    {
        return false;
    }

    void init()
    {
        lblOrderTotal.setText(getString(0x7f080217, new Object[] {
            NumberUtil.formatPrice(Double.valueOf(mOrderManager.getOrder().getPrice()))
        }));
        mGiftCardController.setupFonts();
        determineView();
        pinInfo.setOnClickListener(this);
        numberInfo.setOnClickListener(this);
    }

    void onAfterInject()
    {
        mGiftCardController = controllerLocator.getGiftCardController(this);
        mGiftCardManager = (GiftCardManager)mMobileSession.getManager("gift_card_manager");
    }

    public void onBackPressed()
    {
        setResult(0);
        finish();
    }

    public void onClick(View view)
    {
        switch (view.getId())
        {
        default:
            return;

        case 2131689607: 
        case 2131689610: 
            ((GiftCardInfoActivity_.IntentBuilder_)GiftCardInfoActivity_.intent(this).flags(0x4000000)).start();
            return;

        case 2131689611: 
            applyGiftCard();
            return;

        case 2131689620: 
            String s = txtAmountToApply.getText().toString();
            view = s;
            if (s.length() == 0)
            {
                view = "0.00";
            }
            mGiftCardController.updateGiftCard(editGiftCard, view);
            return;

        case 2131689621: 
            showAlertDialog(6);
            return;

        case 2131689619: 
            txtAmountToApply.setText("");
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        editTexts = new ArrayList();
        numUtil = new NumberUtil();
    }

    public void removeGiftCards()
    {
        setResult(6);
        finish();
    }

    public void setAlpha(View view, float f)
    {
        if (CURRENTAPIVERSION <= 10)
        {
            AlphaAnimation alphaanimation = new AlphaAnimation(f, f);
            alphaanimation.setDuration(0L);
            alphaanimation.setFillAfter(true);
            view.startAnimation(alphaanimation);
            return;
        } else
        {
            view.setAlpha(f);
            return;
        }
    }

    public void setUpAddView()
    {
        disableButton(btnAddGiftCard);
        txtGiftCardNumber.addTextChangedListener(new GiftCardFormattingTextWatcher());
        addTextWatcher(txtGiftCardNumber, 23, btnAddGiftCard);
        addTextWatcher(txtGiftCardPin, 4, btnAddGiftCard);
        btnAddGiftCard.setOnClickListener(this);
    }

    public void setUpEditView()
    {
        txtAmountToApply.setFocusableInTouchMode(true);
        txtAmountToApply.requestFocus();
        txtGiftCardNumber.setText(editGiftCard.getLastThree());
        txtGiftCardPin.setText(editGiftCard.getPin());
        btnAddGiftCard.setVisibility(8);
        editArea.setVisibility(0);
        btnUpdateGiftCard.setOnClickListener(this);
        btnDeleteGiftCard.setOnClickListener(this);
        txtGiftCardNumber.setEnabled(false);
        txtGiftCardPin.setEnabled(false);
        lblBalanceOfCard.setText(getString(0x7f08015a, new Object[] {
            NumberUtil.formatPrice(Double.valueOf(editGiftCard.getBalance()))
        }));
        txtAmountToApply.setFilters(new InputFilter[] {
            new DecimalDigitsInputFilter(3, 2, txtAmountToApply)
        });
        imgNumberInfo.setVisibility(8);
        imgPinInfo.setVisibility(8);
        lblBalanceDue.setVisibility(0);
        lblBalanceDue.setText(getString(0x7f080069, new Object[] {
            NumberUtil.formatPrice(Double.valueOf(mGiftCardManager.getRemainingBalaceMinusThisCard(mOrderManager.getOrder(), editGiftCard))), NumberUtil.formatPrice(Double.valueOf(mGiftCardManager.getOtherCardAmount(editGiftCard)))
        }));
    }

    public void showAlertDialog(int i)
    {
        showAlertDialogs(i);
    }

    public void showProgressSpinner()
    {
        showLoading();
    }

    public void showToast(int i)
    {
        switch (i)
        {
        default:
            return;

        case 0: // '\0'
            showShortToast(getString(0x7f0801d2));
            break;
        }
    }

    public void updateViews()
    {
        setResult(-1);
        finish();
    }

    static 
    {
        CURRENTAPIVERSION = android.os.Build.VERSION.SDK_INT;
    }


    private class _cls1 extends com.dominos.utils.ActivityHelper.AlertActionCallback
    {

        final AddGiftCardActivity this$0;

        public void onAlertDismissed()
        {
            updateViews();
        }

        _cls1()
        {
            this$0 = AddGiftCardActivity.this;
            super();
        }
    }


    private class _cls2 extends com.dominos.utils.ActivityHelper.OptionAlertActionCallback
    {

        final AddGiftCardActivity this$0;

        public void onNegativeButtonClicked()
        {
        }

        public void onNeutralButtonClicked()
        {
        }

        public void onPositiveButtonClicked()
        {
            mGiftCardController.deleteGiftCard(editGiftCard);
        }

        _cls2()
        {
            this$0 = AddGiftCardActivity.this;
            super();
        }
    }


    private class TextWatcherHelper
        implements TextWatcher
    {

        private int maxLength;
        private Button slaveButton;
        final AddGiftCardActivity this$0;

        public void afterTextChanged(Editable editable)
        {
        }

        public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
        {
        }

        public void onTextChanged(CharSequence charsequence, int i, int j, int k)
        {
            if (charsequence.length() == maxLength)
            {
                if (checkIfFieldsComplete())
                {
                    enableButton(slaveButton);
                }
                return;
            } else
            {
                disableButton(slaveButton);
                return;
            }
        }

        public TextWatcherHelper(int i, Button button)
        {
            this$0 = AddGiftCardActivity.this;
            super();
            maxLength = i;
            slaveButton = button;
        }
    }

}
