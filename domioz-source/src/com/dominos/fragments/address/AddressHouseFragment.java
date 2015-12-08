// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fragments.address;

import android.content.Context;
import android.text.InputFilter;
import android.widget.EditText;
import android.widget.Spinner;
import com.dominos.android.sdk.common.FontManager;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.core.models.LabsAddress;
import com.dominos.inputfilters.NoNumberInputFilter;
import com.dominos.utils.AddressFormValidation;
import com.dominos.utils.AddressType;
import com.dominos.utils.States;
import com.dominos.views.DominosArrayAdapter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.dominos.fragments.address:
//            AddressBaseFragment

public class AddressHouseFragment extends AddressBaseFragment
{

    EditText mCityEntry;
    private Context mContext;
    EditText mDeliveryInstEntry;
    private boolean mIsInitializing;
    Spinner mStateSpinner;
    EditText mStreetAddressEntry;
    EditText mSuitAptEntry;
    EditText mZipEntry;

    public AddressHouseFragment()
    {
        mIsInitializing = true;
    }

    private void initStateSpinner(Context context)
    {
        Object obj = new ArrayList(Arrays.asList(States.getStateNameArray()));
        ((List) (obj)).add(0, context.getString(0x7f0802a0));
        obj = new DominosArrayAdapter(context, 0x1090008, (String[])((List) (obj)).toArray(new String[0]));
        ((DominosArrayAdapter) (obj)).setDropDownViewResource(0x1090009);
        mStateSpinner.setAdapter(((android.widget.SpinnerAdapter) (obj)));
        context = new NoNumberInputFilter(context);
        mCityEntry.setFilters(new InputFilter[] {
            context
        });
        mCityEntry.setOnEditorActionListener(new _cls1());
        mStateSpinner.setOnItemSelectedListener(new _cls2());
    }

    protected void afterView()
    {
        mContext = getActivity();
        initStateSpinner(mContext);
        FontManager.applyDominosFont(this);
    }

    public void clearAddressForm()
    {
        mStreetAddressEntry.setText("");
        mSuitAptEntry.setText("");
        mCityEntry.setText("");
        mStateSpinner.setSelection(0);
        mZipEntry.setText("");
        mDeliveryInstEntry.setText("");
    }

    public void fillAddressFrom(LabsAddress labsaddress)
    {
    }

    public LabsAddress getFormObject()
    {
        LabsAddress labsaddress = new LabsAddress();
        String s = mStateSpinner.getSelectedItem().toString().trim();
        String s1 = mSuitAptEntry.getText().toString().trim().replace("#", " ");
        labsaddress.setOrganizationName("");
        labsaddress.setStreet(mStreetAddressEntry.getText().toString().trim());
        labsaddress.setUnitNumber(s1);
        labsaddress.setLine2(s1);
        labsaddress.setCity(mCityEntry.getText().toString().trim());
        labsaddress.setRegion(States.getStateAbbrev(s));
        labsaddress.setPostalCode(mZipEntry.getText().toString().trim());
        labsaddress.setDeliveryInstructions(mDeliveryInstEntry.getText().toString().trim());
        labsaddress.setAddressType(AddressType.TYPE_HOUSE.getName());
        return labsaddress;
    }

    public volatile Object getFormObject()
    {
        return getFormObject();
    }

    public List validate()
    {
        ArrayList arraylist = new ArrayList();
        int i = mStateSpinner.getSelectedItemPosition();
        if (StringHelper.isEmpty(mStreetAddressEntry.getText().toString()))
        {
            arraylist.add(AddressFormValidation.EMPTY_STREET_ADDRESS);
        }
        if (StringHelper.isEmpty(mCityEntry.getText().toString()))
        {
            arraylist.add(AddressFormValidation.EMPTY_CITY);
        }
        if (i <= 0)
        {
            arraylist.add(AddressFormValidation.EMPTY_STATE);
        }
        if (StringHelper.isEmpty(mZipEntry.getText().toString()))
        {
            arraylist.add(AddressFormValidation.EMPTY_ZIP_CODE);
        }
        return arraylist;
    }



/*
    static boolean access$002(AddressHouseFragment addresshousefragment, boolean flag)
    {
        addresshousefragment.mIsInitializing = flag;
        return flag;
    }

*/

    private class _cls1
        implements android.widget.TextView.OnEditorActionListener
    {

        final AddressHouseFragment this$0;

        public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
        {
            mStateSpinner.performClick();
            return true;
        }

        _cls1()
        {
            this$0 = AddressHouseFragment.this;
            super();
        }
    }


    private class _cls2
        implements android.widget.AdapterView.OnItemSelectedListener
    {

        final AddressHouseFragment this$0;

        public void onItemSelected(AdapterView adapterview, View view, int i, long l)
        {
            if (!mIsInitializing)
            {
                mZipEntry.requestFocus();
            }
            mIsInitializing = false;
        }

        public void onNothingSelected(AdapterView adapterview)
        {
        }

        _cls2()
        {
            this$0 = AddressHouseFragment.this;
            super();
        }
    }

}
