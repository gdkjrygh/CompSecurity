// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import com.skype.Contact;
import com.skype.ContactImpl;
import com.skype.SkyLib;
import com.skype.android.SkypeActivity;
import com.skype.android.SkypeActivityComponent;
import com.skype.android.app.ActionBarCustomizer;
import com.skype.android.app.InfoDialogFragment;
import com.skype.android.app.LayoutExperience;
import com.skype.android.app.Navigation;
import com.skype.android.app.dialer.SelectCountryActivity;
import com.skype.android.inject.LifecycleSupport;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.CountryCode;
import com.skype.android.util.ViewUtil;
import com.skype.android.widget.AccessibleEditText;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.app.contacts:
//            ContactPhoneNumbersTypeAdapter

public class ContactAddNumberActivity extends SkypeActivity
    implements TextWatcher, android.widget.TextView.OnEditorActionListener
{

    public static String EXTRA_COUNTRY_CODE = "extra_code";
    public static String EXTRA_NUMBER = "extra_number";
    public static final int SELECT_COUNTRY_ACTIVITY_REQUEST_CODE = 1;
    ActionBarCustomizer actionBarCustomizer;
    private Contact contact;
    private ContactPhoneNumbersTypeAdapter contactPhoneNumbersTypeAdapter;
    ContactUtil contactUtil;
    TextView countryPrefix;
    private boolean firstLaunch;
    private String homeLabel;
    private boolean isBuddy;
    private boolean isSkypeOut;
    LayoutExperience layoutExperience;
    SkyLib lib;
    private String mobileLabel;
    Spinner modeSelector;
    EditText name;
    Navigation navigation;
    private String officeLabel;
    AccessibleEditText phone;
    Button selectCountryButton;
    private CountryCode selectedCode;

    public ContactAddNumberActivity()
    {
        firstLaunch = true;
    }

    private boolean isValidPhoneNumber()
    {
        for (String s = phone.getText().toString(); selectedCode == null || lib.normalizePSTNWithCountry(s, selectedCode.c()).m_return != com.skype.SkyLib.NORMALIZERESULT.IDENTITY_OK;)
        {
            return false;
        }

        return true;
    }

    private void saveContactAndFinish()
    {
        String s;
        Object obj;
        String s1;
        s = phone.getText().toString();
        s1 = modeSelector.getSelectedItem().toString();
        obj = lib.normalizePSTNWithCountry(s, selectedCode.c());
        if (((com.skype.SkyLib.NormalizePSTNWithCountry_Result) (obj)).m_return != com.skype.SkyLib.NORMALIZERESULT.IDENTITY_OK)
        {
            log.info((new StringBuilder("Invalid phone number - unable to normalize for reason: ")).append(((com.skype.SkyLib.NormalizePSTNWithCountry_Result) (obj)).m_return).toString());
            return;
        }
        if (contactUtil.a(s, selectedCode.c()))
        {
            InfoDialogFragment.create(getString(0x7f0804b2), getString(0x7f0804b3), getString(0x7f0802f6)).show(getSupportFragmentManager());
            return;
        }
        obj = ((com.skype.SkyLib.NormalizePSTNWithCountry_Result) (obj)).m_normalized;
        s = name.getText().toString();
        ContactImpl contactimpl;
        if (TextUtils.isEmpty(s))
        {
            s = ((String) (obj));
        }
        if (contact != null) goto _L2; else goto _L1
_L1:
        contactimpl = new ContactImpl();
        lib.getContact(((String) (obj)), contactimpl);
        contactimpl.giveDisplayName(s);
        contactimpl.setBuddyStatus(true, true);
        contactimpl.setPhoneNumber(1, contactUtil.b(s1), ((String) (obj)));
        navigation.chat(contactimpl);
        contact = contactimpl;
_L4:
        Toast.makeText(getApplicationContext(), String.format(getString(0x7f0803ad), new Object[] {
            contactUtil.l(contact)
        }), 0).show();
        finish();
        return;
_L2:
        s1 = contactUtil.b(s1);
        int i = ContactUtil.k(contact);
        if (i > 0)
        {
            contact.setPhoneNumber(i, s1, ((String) (obj)));
        }
        if (isSkypeOut && !isBuddy)
        {
            contact.giveDisplayName(s);
            contact.setBuddyStatus(true, true);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void updateContentDescription(String s)
    {
        countryPrefix.setContentDescription(s);
        phone.setContentDescription(s);
    }

    private void updateSelectedCountry(CountryCode countrycode)
    {
        if (countrycode != null)
        {
            String s = contactUtil.b(countrycode);
            selectedCode = countrycode;
            selectCountryButton.setText(s);
            countryPrefix.setText(countrycode.d());
        }
    }

    public void afterTextChanged(Editable editable)
    {
        supportInvalidateOptionsMenu();
        updateContentDescription((new StringBuilder()).append(countryPrefix.getText()).append(editable.toString()).toString());
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onActionModeStarted(ActionMode actionmode)
    {
        if (!layoutExperience.isMultipane()) goto _L2; else goto _L1
_L1:
        Menu menu;
        int i;
        menu = actionmode.getMenu();
        i = 0;
_L7:
        if (i >= menu.size()) goto _L2; else goto _L3
_L3:
        MenuItem menuitem = menu.getItem(i);
        menuitem.getItemId();
        JVM INSTR tableswitch 16908319 16908322: default 76
    //                   16908319 85
    //                   16908320 85
    //                   16908321 85
    //                   16908322 85;
           goto _L4 _L5 _L5 _L5 _L5
_L4:
        i++;
        continue; /* Loop/switch isn't completed */
_L5:
        menuitem.setShowAsAction(2);
        if (true) goto _L4; else goto _L2
_L2:
        super.onActionModeStarted(actionmode);
        return;
        if (true) goto _L7; else goto _L6
_L6:
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        if (i == 1 && intent != null && intent.hasExtra("country_list_item"))
        {
            i = intent.getIntExtra("country_list_item", 0);
            updateSelectedCountry(contactUtil.a(i));
        }
    }

    public void onCreate(Bundle bundle)
    {
        boolean flag1;
        String s = null;
        super.onCreate(bundle);
        getComponent().inject(this);
        contact = (Contact)getObjectInterface(com/skype/Contact);
        lifecycleSupport.addListener(actionBarCustomizer);
        flag1 = layoutExperience.isMultipane();
        bundle = getSupportActionBar();
        CountryCode countrycode;
        Intent intent;
        boolean flag;
        if (!flag1 || contact != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bundle.b(flag);
        phone.addTextChangedListener(this);
        phone.setOnEditorActionListener(this);
        selectCountryButton.setOnClickListener(new android.view.View.OnClickListener() {

            final ContactAddNumberActivity this$0;

            public final void onClick(View view)
            {
                view = new Intent(ContactAddNumberActivity.this, com/skype/android/app/dialer/SelectCountryActivity);
                startActivityForResult(view, 1);
            }

            
            {
                this$0 = ContactAddNumberActivity.this;
                super();
            }
        });
        intent = getIntent();
        countrycode = (CountryCode)getLastCustomNonConfigurationInstance();
        bundle = countrycode;
        if (countrycode == null)
        {
            Object obj;
            if (intent != null)
            {
                obj = (CountryCode)intent.getParcelableExtra(EXTRA_COUNTRY_CODE);
            } else
            {
                obj = null;
            }
            bundle = ((Bundle) (obj));
            if (obj == null)
            {
                bundle = contactUtil.b();
            }
        }
        updateSelectedCountry(bundle);
        bundle = s;
        if (intent != null)
        {
            bundle = intent.getStringExtra(EXTRA_NUMBER);
        }
        if (!TextUtils.isEmpty(bundle))
        {
            s = selectedCode.d();
            obj = bundle;
            if (bundle.startsWith(s))
            {
                obj = bundle.replace(s, "");
            }
            phone.setText(((CharSequence) (obj)));
        }
        if (contact != null) goto _L2; else goto _L1
_L1:
        name.setVisibility(0);
        actionBarCustomizer.setTitle(0x7f08022b);
_L4:
        mobileLabel = getString(0x7f0802dc);
        homeLabel = getString(0x7f0802c3);
        officeLabel = getString(0x7f0802f4);
        bundle = new ArrayList();
        bundle.add(mobileLabel);
        bundle.add(homeLabel);
        bundle.add(officeLabel);
        contactPhoneNumbersTypeAdapter = new ContactPhoneNumbersTypeAdapter(this, bundle);
        modeSelector.setAdapter(contactPhoneNumbersTypeAdapter);
        ViewUtil.a(modeSelector, getResources().getDrawable(0x7f0201ca));
        if (TextUtils.isEmpty(phone.getText()))
        {
            updateContentDescription((new StringBuilder()).append(countryPrefix.getText()).append(phone.getHint().toString()).toString());
        }
        return;
_L2:
        isBuddy = contact.isMemberOfHardwiredGroup(com.skype.ContactGroup.TYPE.ALL_BUDDIES);
        isSkypeOut = ContactUtil.g(contact);
        if (isBuddy)
        {
            name.setVisibility(8);
        } else
        if (isSkypeOut)
        {
            name.setVisibility(0);
            bundle = contact.getIdentity();
            Object obj1 = lib.getISOCountryCodebyPhoneNo(bundle);
            obj1 = contactUtil.g(((String) (obj1)));
            updateSelectedCountry(((CountryCode) (obj1)));
            bundle = bundle.substring(((CountryCode) (obj1)).d().length());
            phone.setText(bundle);
            phone.setSelection(phone.getText().length());
            if (flag1)
            {
                actionBarCustomizer.setTitle(0x7f08017b);
            } else
            {
                actionBarCustomizer.setTitleWithRecents(0x7f08017b);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(0x7f11001a, menu);
        return true;
    }

    public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        if (textview == phone)
        {
            if (isValidPhoneNumber())
            {
                saveContactAndFinish();
            }
            return true;
        } else
        {
            return false;
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return false;

        case 2131756475: 
            saveContactAndFinish();
            break;
        }
        return true;
    }

    public boolean onPrepareOptionsMenu(Menu menu)
    {
        menu.findItem(0x7f1005bb).setEnabled(isValidPhoneNumber());
        return true;
    }

    protected void onResume()
    {
        super.onResume();
        if (firstLaunch)
        {
            phone.postDelayed(new Runnable() {

                final ContactAddNumberActivity this$0;

                public final void run()
                {
                    phone.requestFocus();
                }

            
            {
                this$0 = ContactAddNumberActivity.this;
                super();
            }
            }, 100L);
            firstLaunch = false;
            return;
        } else
        {
            phone.postDelayed(new Runnable() {

                final ContactAddNumberActivity this$0;

                public final void run()
                {
                    ((InputMethodManager)getApplicationContext().getSystemService("input_method")).showSoftInput(phone, 2);
                }

            
            {
                this$0 = ContactAddNumberActivity.this;
                super();
            }
            }, 100L);
            return;
        }
    }

    public Object onRetainCustomNonConfigurationInstance()
    {
        return selectedCode;
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

}
