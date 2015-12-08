// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.widgets.address;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.wallet.data.StringValidators;
import com.google.android.apps.wallet.userscope.UserInjector;
import com.google.android.apps.wallet.util.async.ActionExecutor;
import com.google.android.apps.wallet.util.async.AsyncCallback;
import com.google.android.apps.wallet.util.view.Views;
import com.google.android.apps.wallet.widgets.validation.ValidatedAutoCompleteEditText;
import com.google.android.apps.wallet.widgets.validation.ValidatedEditText;
import com.google.android.apps.wallet.widgets.validation.ValidationGroup;
import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.widgets.address:
//            AddressFormatter, AddressSourceResultAdapter, AddressSource, GooglePlacesAddressSource, 
//            AddressSourceResult

public class AddressView extends LinearLayout
{

    private static final char ADDRESS_FIELD_IDS[] = {
        '1', '2', 'C', 'S', 'Z'
    };
    ActionExecutor actionExecutor;
    private final Map addressFields;
    GooglePlacesAddressSource addressSource;
    private List addressSources;
    private final ValidatedAutoCompleteEditText city;
    private final TextView countryCode;
    private final ValidatedEditText state;
    private final ValidatedAutoCompleteEditText streetAddress;
    private final ValidatedEditText streetAddress2;
    private final ValidatedEditText zipCode;

    public AddressView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        UserInjector.inject(this, context);
        setOrientation(1);
        context = LayoutInflater.from(context).inflate(com.google.android.apps.walletnfcrel.R.layout.address_view, this);
        streetAddress = (ValidatedAutoCompleteEditText)Views.findViewById(context, com.google.android.apps.walletnfcrel.R.id.AddressViewStreetAddress);
        streetAddress2 = (ValidatedEditText)Views.findViewById(context, com.google.android.apps.walletnfcrel.R.id.AddressViewStreetAddress2);
        city = (ValidatedAutoCompleteEditText)Views.findViewById(context, com.google.android.apps.walletnfcrel.R.id.AddressViewCity);
        state = (ValidatedEditText)Views.findViewById(context, com.google.android.apps.walletnfcrel.R.id.AddressViewState);
        zipCode = (ValidatedEditText)Views.findViewById(context, com.google.android.apps.walletnfcrel.R.id.AddressViewZipCode);
        countryCode = (TextView)Views.findViewById(context, com.google.android.apps.walletnfcrel.R.id.AddressViewCountryCode);
        addressFields = (new com.google.common.collect.ImmutableMap.Builder()).put(Character.valueOf('1'), streetAddress).put(Character.valueOf('2'), streetAddress2).put(Character.valueOf('C'), city).put(Character.valueOf('S'), state).put(Character.valueOf('Z'), zipCode).build();
        setInputTypesAndValidators();
        setUpAutoCompleteFields();
        setEnabled(true);
        setFocusable(true);
        setFocusableInTouchMode(true);
    }

    private void fetchAddress(final AddressSourceResult addressSourceResult, final char currentField)
    {
        actionExecutor.executeAction(new Callable() {

            final AddressView this$0;
            final AddressSourceResult val$addressSourceResult;

            private com.google.location.country.NanoPostaladdress.PostalAddress call()
                throws Exception
            {
                for (Iterator iterator = addressSources.iterator(); iterator.hasNext();)
                {
                    AddressSource addresssource = (AddressSource)iterator.next();
                    if (addressSourceResult.getSourceName().equals(addresssource.getName()))
                    {
                        return addresssource.getAddress(addressSourceResult.getReference(), "en");
                    }
                }

                return null;
            }

            public final volatile Object call()
                throws Exception
            {
                return call();
            }

            
            {
                this$0 = AddressView.this;
                addressSourceResult = addresssourceresult;
                super();
            }
        }, new AsyncCallback() {

            final AddressView this$0;
            final char val$currentField;

            private void onSuccess(com.google.location.country.NanoPostaladdress.PostalAddress postaladdress)
            {
                if (postaladdress != null)
                {
                    fillAddressFieldsAndUpdateFocus(postaladdress, currentField);
                }
            }

            public final void onFailure(Exception exception)
            {
            }

            public final volatile void onSuccess(Object obj)
            {
                onSuccess((com.google.location.country.NanoPostaladdress.PostalAddress)obj);
            }

            
            {
                this$0 = AddressView.this;
                currentField = c;
                super();
            }
        });
    }

    private void fillAddressFieldsAndUpdateFocus(com.google.location.country.NanoPostaladdress.PostalAddress postaladdress, char c)
    {
        java.util.ArrayList arraylist = Lists.newArrayList();
        boolean flag = false;
        char ac[] = ADDRESS_FIELD_IDS;
        int j = ac.length;
        for (int i = 0; i < j;)
        {
            char c1 = ac[i];
            boolean flag1 = flag;
            if (!flag)
            {
                flag1 = flag;
                if (c1 == c)
                {
                    flag1 = true;
                }
            }
            if (flag1)
            {
                String s = AddressFormatter.formatAddressValue(postaladdress, c1);
                EditText edittext1 = (EditText)addressFields.get(Character.valueOf(c1));
                edittext1.setText(s);
                arraylist.add(edittext1);
            }
            i++;
            flag = flag1;
        }

        for (postaladdress = arraylist.iterator(); postaladdress.hasNext();)
        {
            EditText edittext = (EditText)postaladdress.next();
            if (Strings.isNullOrEmpty(edittext.getText().toString()) || ((com.google.android.apps.wallet.widgets.validation.ValidationGroup.Groupable)edittext).checkForError())
            {
                edittext.requestFocus();
                return;
            }
        }

        postaladdress = zipCode.focusSearch(66);
        if (postaladdress != null)
        {
            postaladdress.requestFocus();
            return;
        } else
        {
            zipCode.requestFocus();
            return;
        }
    }

    private int getNextFocus()
    {
        return zipCode.getNextFocusForwardId();
    }

    private void setInputTypesAndValidators()
    {
        streetAddress.setInputType(8305);
        streetAddress2.setInputType(8305);
        city.setInputType(8193);
        state.setInputType(0x81001);
        streetAddress.setValidator(StringValidators.NON_EMPTY);
        streetAddress2.setValidator(StringValidators.NO_VALIDATION);
        city.setValidator(StringValidators.NON_EMPTY);
        state.setValidator(StringValidators.STATE_CODE);
        zipCode.setValidator(StringValidators.ZIP_CODE);
    }

    private void setUpAutoCompleteField(ValidatedAutoCompleteEditText validatedautocompleteedittext, final char currentField, char ac[])
    {
        validatedautocompleteedittext.setAdapter(new AddressSourceResultAdapter(getContext(), 0x1090009, "US", "en", currentField, ac, "ACSZ", addressSources));
        validatedautocompleteedittext.setThreshold(1);
        validatedautocompleteedittext.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final AddressView this$0;
            final char val$currentField;

            public final void onItemClick(AdapterView adapterview, View view, int i, long l)
            {
                adapterview = (AddressSourceResult)adapterview.getItemAtPosition(i);
                view = adapterview.getAddress();
                if (view != null)
                {
                    fillAddressFieldsAndUpdateFocus(view, currentField);
                } else
                if (!TextUtils.isEmpty(adapterview.getReference()))
                {
                    fetchAddress(adapterview, currentField);
                    return;
                }
            }

            
            {
                this$0 = AddressView.this;
                currentField = c;
                super();
            }
        });
    }

    private void setUpAutoCompleteFields()
    {
        addressSources = Lists.newArrayList(new AddressSource[] {
            addressSource
        });
        setUpAutoCompleteField(streetAddress, '1', ADDRESS_FIELD_IDS);
        setUpAutoCompleteField(city, 'C', new char[] {
            'C', 'S', 'Z'
        });
    }

    public final void addValidator(ValidationGroup validationgroup)
    {
        validationgroup.addInput(streetAddress);
        validationgroup.addInput(streetAddress2);
        validationgroup.addInput(city);
        validationgroup.addInput(state);
        validationgroup.addInput(zipCode);
    }

    public final com.google.wallet.proto.NanoWalletEntities.Address getAddress()
    {
        com.google.wallet.proto.NanoWalletEntities.Address address = new com.google.wallet.proto.NanoWalletEntities.Address();
        address.line1 = streetAddress.getValue();
        address.city = city.getValue();
        address.state = state.getValue();
        address.postalCode = zipCode.getValue();
        String s = streetAddress2.getValue();
        if (!Strings.isNullOrEmpty(s))
        {
            address.line2 = s;
        }
        if (countryCode.getText() != null)
        {
            address.countryCode = String.valueOf(countryCode.getText());
        }
        return address;
    }

    public int getNextFocusDownId()
    {
        return getNextFocus();
    }

    public int getNextFocusRightId()
    {
        return getNextFocus();
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        actionExecutor.cancelAll();
    }

    public void onFocusChanged(boolean flag, int i, Rect rect)
    {
        if (flag)
        {
            streetAddress.requestFocus(i, rect);
        }
    }

    public void setAddress(com.google.wallet.proto.NanoWalletEntities.Address address)
    {
        if ("US".equals(address.countryCode))
        {
            state.setValidator(StringValidators.STATE_CODE);
            zipCode.setValidator(StringValidators.ZIP_CODE);
            zipCode.setInputType(2);
            zipCode.setMaxLength(5);
            streetAddress.setThreshold(1);
            city.setThreshold(1);
        } else
        {
            state.setValidator(StringValidators.NO_VALIDATION);
            zipCode.setValidator(StringValidators.NO_VALIDATION);
            zipCode.setInputType(1);
            zipCode.setMaxLength(8);
            streetAddress.setThreshold(0x7fffffff);
            city.setThreshold(0x7fffffff);
        }
        if (address.line1 != null)
        {
            streetAddress.setValue(address.line1);
        }
        if (address.line2 != null)
        {
            streetAddress2.setValue(address.line2);
        }
        if (address.city != null)
        {
            city.setValue(address.city);
        }
        if (address.state != null)
        {
            state.setValue(address.state);
        }
        if (address.postalCode != null)
        {
            zipCode.setValue(address.postalCode);
        }
        if (address.countryCode != null)
        {
            countryCode.setText(address.countryCode);
        }
    }

    public void setNextFocus(int i)
    {
        zipCode.setNextFocusForwardId(i);
    }

    public void setNextFocusDownId(int i)
    {
        throw new UnsupportedOperationException("Please use AddressView.setNextFocus()");
    }

    public void setNextFocusRightId(int i)
    {
        throw new UnsupportedOperationException("Please use AddressView.setNextFocus()");
    }




}
