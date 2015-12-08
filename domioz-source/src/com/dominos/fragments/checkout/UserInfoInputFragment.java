// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fragments.checkout;

import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.dominos.android.sdk.common.FontManager;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.core.models.LabsAddress;
import com.dominos.android.sdk.core.models.LabsOrder;
import com.dominos.android.sdk.core.order.OrderManager;
import com.dominos.android.sdk.data.sharedpref.DominosPrefs_;
import com.dominos.fragments.BaseFragment;
import com.dominos.inputfilters.NameInputFilter;
import com.dominos.utils.EmailValidator;
import com.dominos.utils.PhoneTextWatcher;
import java.util.ArrayList;

// Referenced classes of package com.dominos.fragments.checkout:
//            IDominosFormFragment, UserInfoInputFragment_, DominosFormValidationResult

public class UserInfoInputFragment extends BaseFragment
    implements IDominosFormFragment
{

    public static final String TAG = "user_info_input";
    public static final String WALLET_MASK = "wallet_mask";
    LinearLayout deliveryDivider;
    EditText deliveryInstructionsTextBox;
    EditText emailTextBox;
    EditText firstNameTextBox;
    EditText lastNameTextBox;
    Bundle mData;
    EditText phoneExtensionText;
    EditText phoneTextBox;
    DominosPrefs_ prefs;

    public UserInfoInputFragment()
    {
    }

    public static UserInfoInputFragment newInstance(Bundle bundle)
    {
        return UserInfoInputFragment_.builder().mData(bundle).build();
    }

    public void clearFields()
    {
        firstNameTextBox.setText("");
        lastNameTextBox.setText("");
        phoneTextBox.setText("");
        phoneExtensionText.setText("");
        emailTextBox.setText("");
        mData = null;
    }

    public Bundle getData()
    {
        Bundle bundle = new Bundle();
        bundle.putString("first_name", firstNameTextBox.getText().toString());
        bundle.putString("last_name", lastNameTextBox.getText().toString());
        bundle.putString("phone", phoneTextBox.getText().toString());
        bundle.putString("phone_ext", phoneExtensionText.getText().toString());
        bundle.putString("email", emailTextBox.getText().toString());
        bundle.putString("delivery_instructions", deliveryInstructionsTextBox.getText().toString());
        return bundle;
    }

    public DominosFormValidationResult getValidationResult()
    {
        DominosFormValidationResult dominosformvalidationresult = new DominosFormValidationResult();
        ArrayList arraylist = new ArrayList();
        String s = firstNameTextBox.getText().toString();
        if (s == null || s.trim().length() <= 0)
        {
            dominosformvalidationresult.appendMessage(getString(0x7f08012b));
            arraylist.add(firstNameTextBox);
        } else
        {
            firstNameTextBox.setText(s.trim());
        }
        s = lastNameTextBox.getText().toString();
        if (s == null || s.trim().length() <= 0)
        {
            dominosformvalidationresult.appendMessage(getString(0x7f080188));
            arraylist.add(lastNameTextBox);
        } else
        {
            lastNameTextBox.setText(s.trim());
        }
        s = phoneTextBox.getText().toString();
        if (s == null || s.trim().length() <= 0)
        {
            dominosformvalidationresult.appendMessage(getString(0x7f080229));
            arraylist.add(phoneTextBox);
        } else
        if (s.trim().length() < 10)
        {
            dominosformvalidationresult.appendMessage(getString(0x7f08022a));
            arraylist.add(phoneTextBox);
        } else
        {
            phoneTextBox.setText(s.trim());
        }
        s = emailTextBox.getText().toString();
        if (s == null || s.trim().length() <= 0)
        {
            dominosformvalidationresult.appendMessage(getString(0x7f080110));
            arraylist.add(emailTextBox);
        } else
        if (!EmailValidator.isValidEmail(s))
        {
            dominosformvalidationresult.appendMessage(getString(0x7f080177));
            arraylist.add(emailTextBox);
        } else
        {
            emailTextBox.setText(s.trim());
        }
        if (dominosformvalidationresult.hasError())
        {
            ((View)arraylist.get(0)).requestFocus();
            if (arraylist.get(0) instanceof EditText)
            {
                ((EditText)arraylist.get(0)).selectAll();
            }
        }
        return dominosformvalidationresult;
    }

    void onAfterViews()
    {
        FontManager.applyDominosFont(this);
        firstNameTextBox.setFilters(new InputFilter[] {
            new NameInputFilter(getActivity())
        });
        lastNameTextBox.setFilters(new InputFilter[] {
            new NameInputFilter(getActivity())
        });
        PhoneTextWatcher phonetextwatcher = new PhoneTextWatcher(getActivity());
        phoneTextBox.addTextChangedListener(phonetextwatcher);
        setData(mData);
    }

    public void setData(Bundle bundle)
    {
        if (mData != null)
        {
            firstNameTextBox.setText(bundle.getString("first_name"));
            lastNameTextBox.setText(bundle.getString("last_name"));
            phoneTextBox.setText(bundle.getString("phone"));
            phoneExtensionText.setText(bundle.getString("phone_ext"));
            emailTextBox.setText(bundle.getString("email"));
            if (bundle.getBoolean("is_delivery"))
            {
                bundle = mOrderManager.getOrder().getAddress().getDeliveryInstructions();
                if (StringHelper.isNotBlank(bundle))
                {
                    deliveryInstructionsTextBox.setText(bundle);
                    return;
                }
            } else
            {
                deliveryInstructionsTextBox.setVisibility(8);
                deliveryDivider.setVisibility(8);
                return;
            }
        }
    }
}
