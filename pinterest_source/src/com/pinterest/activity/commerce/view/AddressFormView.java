// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.view;

import android.content.Context;
import android.telephony.PhoneNumberFormattingTextWatcher;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.pinterest.activity.commerce.util.BuyableProductHelper;
import com.pinterest.activity.commerce.viewmodel.AddressFormViewModel;
import com.pinterest.kit.application.Resources;
import com.pinterest.ui.text.PEditText;
import com.pinterest.ui.text.PTextView;
import org.apache.commons.lang3.StringUtils;

// Referenced classes of package com.pinterest.activity.commerce.view:
//            CommerceFormView

public class AddressFormView extends LinearLayout
    implements android.widget.TextView.OnEditorActionListener, CommerceFormView
{

    private AddressBookButtonClickListener addressBookButtonClickListener;
    PEditText city;
    PTextView disclaimer;
    PEditText email;
    PEditText firstName;
    PEditText lastName;
    private OnAddressFormSubmitListener onAddressFormSubmitListener;
    PEditText phoneNumber;
    PEditText state;
    PEditText streetLine1;
    PEditText streetLine2;
    PEditText zip;

    public AddressFormView(Context context)
    {
        super(context);
        init(context);
    }

    public AddressFormView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init(context);
    }

    public AddressFormView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init(context);
    }

    private void init(Context context)
    {
        inflate(context, 0x7f03002c, this);
        ButterKnife.a(this);
        setOrientation(1);
        phoneNumber.setImeOptions(2);
        phoneNumber.setImeActionLabel(Resources.string(0x7f0704be), 2);
        phoneNumber.setOnEditorActionListener(this);
        phoneNumber.addTextChangedListener(new PhoneNumberFormattingTextWatcher());
        zip.setInputType(2);
        phoneNumber.setInputType(2);
        state.setFilters(new InputFilter[] {
            new android.text.InputFilter.AllCaps()
        });
    }

    public AddressFormViewModel getData()
    {
        if (StringUtils.isEmpty(firstName.getText()) || StringUtils.isEmpty(lastName.getText()) || StringUtils.isEmpty(streetLine1.getText()) || StringUtils.isEmpty(zip.getText()) || StringUtils.isEmpty(city.getText()) || StringUtils.isEmpty(state.getText()) || StringUtils.isEmpty(email.getText()) || StringUtils.isEmpty(phoneNumber.getText()))
        {
            return null;
        } else
        {
            return new AddressFormViewModel(firstName.getText().toString(), lastName.getText().toString(), streetLine1.getText().toString(), streetLine2.getText().toString(), zip.getText().toString(), city.getText().toString(), state.getText().toString(), email.getText().toString(), phoneNumber.getText().toString());
        }
    }

    public volatile Object getData()
    {
        return getData();
    }

    public void handleContactsButtonClicked()
    {
        if (addressBookButtonClickListener != null)
        {
            addressBookButtonClickListener.onAddressBookButtonClicked();
        }
    }

    public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        if (i == 2 && onAddressFormSubmitListener != null)
        {
            onAddressFormSubmitListener.onAddressFormSubmit();
            return true;
        } else
        {
            return false;
        }
    }

    public void requestFocusForFirstField()
    {
        firstName.requestFocus();
    }

    public void setAddressBookButtonClickListener(AddressBookButtonClickListener addressbookbuttonclicklistener)
    {
        addressBookButtonClickListener = addressbookbuttonclicklistener;
    }

    public void setData(AddressFormViewModel addressformviewmodel)
    {
        firstName.setText(addressformviewmodel.getFirstName());
        lastName.setText(addressformviewmodel.getLastName());
        streetLine1.setText(addressformviewmodel.getStreetLine1());
        streetLine2.setText(addressformviewmodel.getStreetLine2());
        zip.setText(addressformviewmodel.getZip());
        city.setText(addressformviewmodel.getCity());
        state.setText(addressformviewmodel.getState());
        email.setText(addressformviewmodel.getEmail());
        phoneNumber.setText(addressformviewmodel.getPhoneNumber());
        if (addressformviewmodel.showDisclaimer())
        {
            Object obj;
            SpannableStringBuilder spannablestringbuilder;
            int i;
            if (StringUtils.isEmpty(addressformviewmodel.getMerchantName()))
            {
                addressformviewmodel = Resources.string(0x7f070100);
                obj = addressformviewmodel;
            } else
            {
                obj = Resources.string(0x7f0700ff);
                String s = Resources.string(0x7f0700fd, new Object[] {
                    addressformviewmodel.getMerchantName(), obj
                });
                addressformviewmodel = ((AddressFormViewModel) (obj));
                obj = s;
            }
            spannablestringbuilder = new SpannableStringBuilder(((CharSequence) (obj)));
            i = ((String) (obj)).indexOf(addressformviewmodel);
            spannablestringbuilder.setSpan(BuyableProductHelper.getClickablePrivacyPolicySpan(), i, addressformviewmodel.length() + i, 33);
            disclaimer.setText(spannablestringbuilder);
            disclaimer.setMovementMethod(LinkMovementMethod.getInstance());
            return;
        } else
        {
            disclaimer.setVisibility(8);
            return;
        }
    }

    public volatile void setData(Object obj)
    {
        setData((AddressFormViewModel)obj);
    }

    public void setOnAddressFormSubmitListener(OnAddressFormSubmitListener onaddressformsubmitlistener)
    {
        onAddressFormSubmitListener = onaddressformsubmitlistener;
    }

    private class AddressBookButtonClickListener
    {

        public abstract void onAddressBookButtonClicked();
    }


    private class OnAddressFormSubmitListener
    {

        public abstract void onAddressFormSubmit();
    }

}
