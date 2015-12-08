// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.dialer;

import android.content.ContentResolver;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.media.ToneGenerator;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v7.app.ActionBar;
import android.text.Editable;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import com.skype.Contact;
import com.skype.ContactImpl;
import com.skype.SkyLib;
import com.skype.android.SkypeActivity;
import com.skype.android.SkypeActivityComponent;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.AnalyticsEvent;
import com.skype.android.app.InfoDialogFragment;
import com.skype.android.app.LayoutExperience;
import com.skype.android.app.Navigation;
import com.skype.android.app.contacts.ContactAddNumberActivity;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncResult;
import com.skype.android.concurrent.AsyncService;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.CountryCode;
import com.skype.android.util.ViewUtil;
import com.skype.android.util.permission.Permission;
import com.skype.android.util.permission.PermissionHandlerAdapter;
import com.skype.android.util.permission.PermissionRequest;
import com.skype.android.widget.SymbolView;
import java.util.EnumSet;
import java.util.concurrent.Callable;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.app.dialer:
//            NoImeEditText, EmergencyCallDialog, DialKey, DialpadButton, 
//            SelectCountryActivity

public class DialpadActivity extends SkypeActivity
    implements TextWatcher, android.view.View.OnClickListener, android.view.View.OnLongClickListener, android.view.View.OnTouchListener
{

    public static final String PHONE_KEY = "phone";
    private static final int SELECT_COUNTRY_ACTIVITY_REQUEST_CODE = 1;
    private static final int SELECT_NATIVE_CONTACT_ACTIVITY_REQUEST_CODE = 2;
    private static final int TONE_DURATION_MS = 100;
    private static final int TONE_VOLUME = 80;
    SymbolView addNumberButton;
    Analytics analytics;
    AsyncService asyncService;
    private DialpadButton buttons[];
    ImageButton callButton;
    TextView contactText;
    ContactUtil contactUtil;
    Button countryButton;
    private boolean dtmfSoundsEnabled;
    NoImeEditText editText;
    SymbolView eraseButton;
    LayoutExperience layoutExperience;
    SkyLib lib;
    Navigation nav;
    PermissionRequest permissionRequest;
    private CountryCode selectedCode;
    private ToneGenerator toneGenerator;
    AsyncCallback updateContactTextCallback;
    Vibrator vibrator;

    public DialpadActivity()
    {
        updateContactTextCallback = new AsyncCallback() {

            final DialpadActivity this$0;

            public final void done(AsyncResult asyncresult)
            {
                contactText.setText((CharSequence)asyncresult.a());
            }

            
            {
                this$0 = DialpadActivity.this;
                super();
            }
        };
    }

    private void dial()
    {
        Object obj;
        Object obj1;
label0:
        {
label1:
            {
                obj = editText.getText().toString().trim();
                if (!TextUtils.isEmpty(((CharSequence) (obj))))
                {
                    if (selectedCode == null)
                    {
                        setCountryCodeAndName(getDefaultCountryCode());
                        setSpannable(editText, selectedCode);
                    }
                    int i = selectedCode.c();
                    obj1 = lib.normalizePSTNWithCountry(((String) (obj)), i);
                    if (((com.skype.SkyLib.NormalizePSTNWithCountry_Result) (obj1)).m_return != com.skype.SkyLib.NORMALIZERESULT.IDENTITY_OK)
                    {
                        break label0;
                    }
                    if (!contactUtil.a(((String) (obj)), i))
                    {
                        break label1;
                    }
                    obj1 = new Bundle();
                    ((Bundle) (obj1)).putString("com.skype.identitiy", ((String) (obj)));
                    obj = new EmergencyCallDialog();
                    ((EmergencyCallDialog) (obj)).setArguments(((Bundle) (obj1)));
                    ((EmergencyCallDialog) (obj)).show(getSupportFragmentManager());
                }
                return;
            }
            if (isValidNumber(((com.skype.SkyLib.NormalizePSTNWithCountry_Result) (obj1)).m_normalized))
            {
                initiateCall(((String) (obj)), ((com.skype.SkyLib.NormalizePSTNWithCountry_Result) (obj1)).m_normalized);
                return;
            } else
            {
                displayInvalidNumberError(((String) (obj)), ((com.skype.SkyLib.NormalizePSTNWithCountry_Result) (obj1)).m_return.toString());
                return;
            }
        }
        displayInvalidNumberError(((String) (obj)), ((com.skype.SkyLib.NormalizePSTNWithCountry_Result) (obj1)).m_return.toString());
    }

    private void displayInvalidNumberError(String s, String s1)
    {
        log.info((new StringBuilder()).append(s).append(" validity: ").append(s1).toString());
        InfoDialogFragment.create(getString(0x7f080252), getString(0x7f0803e1), getString(0x7f0802f6)).show(getSupportFragmentManager());
    }

    private void erasePhoneNumber(boolean flag)
    {
        Editable editable = editText.getText();
        String s = editable.toString().trim();
        if (flag)
        {
            editable.clear();
        } else
        {
            int i = s.length();
            if (i > 0)
            {
                editText.getText().delete(i - 1, i);
                return;
            }
        }
    }

    private String getCountryText()
    {
        String s1 = contactUtil.b(selectedCode);
        String s = s1;
        if (TextUtils.isEmpty(s1))
        {
            s = getString(0x7f0804c3);
        }
        return s;
    }

    private CountryCode getDefaultCountryCode()
    {
        CountryCode countrycode1 = contactUtil.b();
        CountryCode countrycode = countrycode1;
        if (countrycode1 == null)
        {
            countrycode = contactUtil.g("");
        }
        return countrycode;
    }

    private String getISOCountryCode(String s)
    {
        return lib.getISOCountryCodebyPhoneNo(s);
    }

    private void initDialerUi(Intent intent)
    {
        Object obj = null;
        CountryCode countrycode = obj;
        if (intent != null)
        {
            intent = intent.getStringExtra("phone");
            countrycode = obj;
            if (intent != null)
            {
                editText.setText(intent);
                intent = getISOCountryCode(intent);
                countrycode = contactUtil.h(intent);
            }
        }
        intent = countrycode;
        if (countrycode == null)
        {
            intent = getDefaultCountryCode();
        }
        setCountryCodeAndName(intent);
        setSpannable(editText, intent);
        updatePhoneNumber();
        setSelectionToEnd();
    }

    private void initDialpadButtons()
    {
        DialKey adialkey[] = DialKey.values();
        for (int i = 0; i < adialkey.length; i++)
        {
            DialKey dialkey = adialkey[i];
            buttons[i] = (DialpadButton)findViewById(dialkey.getButtonId());
            buttons[i].setOnTouchListener(this);
            buttons[i].setOnClickListener(this);
            if (dialkey == DialKey.ZERO)
            {
                buttons[i].setOnLongClickListener(new android.view.View.OnLongClickListener() {

                    final DialpadActivity this$0;

                    public final boolean onLongClick(View view)
                    {
                        if (editText.getSelectionStart() == 0 && !editText.getText().toString().contains("+"))
                        {
                            keyPressed(81);
                        }
                        return true;
                    }

            
            {
                this$0 = DialpadActivity.this;
                super();
            }
                });
            }
        }

    }

    private void initiateCall(final String phoneNumber, final String normalizedNumber)
    {
        permissionRequest.a(Permission.n, true, new PermissionHandlerAdapter() {

            final DialpadActivity this$0;
            final String val$normalizedNumber;
            final String val$phoneNumber;

            public final void onGranted()
            {
                if (nav.placeCall(normalizedNumber))
                {
                    analytics.c(AnalyticsEvent.i);
                    return;
                } else
                {
                    displayInvalidNumberError(phoneNumber, normalizedNumber);
                    return;
                }
            }

            
            {
                this$0 = DialpadActivity.this;
                normalizedNumber = s;
                phoneNumber = s1;
                super();
            }
        });
    }

    private boolean isContactBookNotEmpty()
    {
        Cursor cursor;
        boolean flag;
        boolean flag1;
        boolean flag2;
        flag1 = false;
        flag2 = false;
        if (!permissionRequest.a(Permission.d))
        {
            break MISSING_BLOCK_LABEL_78;
        }
        cursor = getContentResolver().query(android.provider.ContactsContract.Contacts.CONTENT_URI, null, null, null, null);
        flag = flag2;
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        int i = cursor.getCount();
        flag = flag2;
        if (i > 0)
        {
            flag = true;
        }
        flag1 = flag;
        if (cursor != null)
        {
            cursor.close();
            flag1 = flag;
        }
        return flag1;
        Exception exception;
        exception;
        if (cursor != null)
        {
            cursor.close();
        }
        throw exception;
    }

    private boolean isValidNumber(String s)
    {
        return lib.getIdentityType(s) != com.skype.SkyLib.IDENTITYTYPE.UNRECOGNIZED;
    }

    private void keyPressed(int i)
    {
        KeyEvent keyevent = new KeyEvent(0, i);
        editText.onKeyDown(i, keyevent);
    }

    private void lookupContactAsync(final String number)
    {
        asyncService.a(new Callable() {

            final DialpadActivity this$0;
            final String val$number;

            public final volatile Object call()
                throws Exception
            {
                return call();
            }

            public final String call()
                throws Exception
            {
                ContactImpl contactimpl = new ContactImpl();
                if (lib.findContactByPstnNumber(number, contactimpl).m_return && contactimpl.isMemberOfHardwiredGroup(com.skype.ContactGroup.TYPE.ALL_BUDDIES))
                {
                    return contactUtil.l(contactimpl);
                } else
                {
                    return "";
                }
            }

            
            {
                this$0 = DialpadActivity.this;
                number = s;
                super();
            }
        }, updateContactTextCallback);
    }

    private void refreshSpannables()
    {
        editText.removeTextChangedListener(this);
        Editable editable = editText.getEditableText();
        int j;
        for (int i = 0; i < editable.length(); i = j + 1)
        {
            char c = editable.charAt(i);
            j = i;
            if (c == '+')
            {
                continue;
            }
            j = i;
            if (c == '#')
            {
                continue;
            }
            j = i;
            if (c == '*')
            {
                continue;
            }
            j = i;
            if (!Character.isDigit(c))
            {
                editable.delete(i, i + 1);
                j = i - 1;
            }
        }

        String s = "";
        if (selectedCode != null)
        {
            s = selectedCode.d();
        }
        ForegroundColorSpan aforegroundcolorspan[] = (ForegroundColorSpan[])editable.getSpans(0, editable.length(), android/text/style/ForegroundColorSpan);
        if (aforegroundcolorspan != null && aforegroundcolorspan.length > 0)
        {
            editable.setSpan(aforegroundcolorspan[0], 0, s.length(), 0);
        }
        editText.addTextChangedListener(this);
    }

    private void setCountryCodeAndName(CountryCode countrycode)
    {
        if (countrycode == null)
        {
            selectedCode = getDefaultCountryCode();
        } else
        {
            selectedCode = countrycode;
        }
        setCountryName(getCountryText());
    }

    private void setCountryName(String s)
    {
        countryButton.setText(s);
    }

    private void setSelectionToEnd()
    {
        editText.setSelection(editText.getText().length());
        editText.setCursorVisible(false);
    }

    private void setSpannable(NoImeEditText noimeedittext, CountryCode countrycode)
    {
        String s = noimeedittext.getText().toString();
        int i;
        if (countrycode != null)
        {
            noimeedittext = countrycode.d();
        } else
        {
            noimeedittext = "";
        }
        if (s.startsWith(noimeedittext))
        {
            i = noimeedittext.length();
        } else
        {
            i = 0;
        }
        editText.getText().setSpan(new ForegroundColorSpan(getResources().getColor(0x7f0f0117)), 0, i, 0);
    }

    private void updateCountryName()
    {
        String s = editText.getText().toString().trim();
        String s1 = getISOCountryCode(s);
        selectedCode = null;
        if (TextUtils.isEmpty(s1))
        {
            if (s.length() == 0 || !s.substring(0, 1).equalsIgnoreCase("+"))
            {
                s = getCountryText();
            } else
            {
                s = getString(0x7f080480);
            }
        } else
        {
            if (s.substring(0, 1).equalsIgnoreCase("+"))
            {
                selectedCode = contactUtil.g(s1);
            }
            s = getCountryText();
        }
        setCountryName(s);
    }

    private void updatePhoneNumber()
    {
        String s = "";
        if (selectedCode != null)
        {
            s = selectedCode.d();
        }
        updatePhoneNumberWithSpan(s);
        editText.setContentDescription(editText.getText());
    }

    private void updatePhoneNumberWithSpan(String s)
    {
        Editable editable;
        ForegroundColorSpan aforegroundcolorspan[];
label0:
        {
            editable = editText.getEditableText();
            ForegroundColorSpan aforegroundcolorspan1[] = (ForegroundColorSpan[])editable.getSpans(0, editable.length(), android/text/style/ForegroundColorSpan);
            if (aforegroundcolorspan1 != null)
            {
                aforegroundcolorspan = aforegroundcolorspan1;
                if (aforegroundcolorspan1.length != 0)
                {
                    break label0;
                }
            }
            editable = editText.getEditableText();
            aforegroundcolorspan = (ForegroundColorSpan[])editable.getSpans(0, editable.length(), android/text/style/ForegroundColorSpan);
        }
        if (aforegroundcolorspan != null && aforegroundcolorspan.length > 0)
        {
            ForegroundColorSpan foregroundcolorspan = aforegroundcolorspan[0];
            editable = editable.replace(editable.getSpanStart(foregroundcolorspan), editable.getSpanEnd(foregroundcolorspan), s, 0, s.length());
            editable.setSpan(foregroundcolorspan, 0, s.length(), 0);
            editText.setText(editable);
        }
    }

    public void afterTextChanged(Editable editable)
    {
        boolean flag = true;
        editable = editable.toString();
        lookupContactAsync(editable);
        if (editable.length() == 0)
        {
            selectedCode = null;
            setSpannable(editText, selectedCode);
        }
        callButton.setEnabled(true);
        updateCountryName();
        refreshSpannables();
        NoImeEditText noimeedittext = editText;
        if (editText.getSelectionEnd() == editText.getText().length())
        {
            flag = false;
        }
        noimeedittext.setCursorVisible(flag);
        editText.setContentDescription(editable);
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        if (i == 1)
        {
            if (intent != null && intent.hasExtra("country_list_item"))
            {
                i = intent.getIntExtra("country_list_item", 0);
                selectedCode = contactUtil.a(i);
                editText.removeTextChangedListener(this);
                updatePhoneNumber();
                setSelectionToEnd();
                setCountryName(getCountryText());
                editText.addTextChangedListener(this);
            }
        } else
        if (i == 2 && j == -1)
        {
            Object obj = null;
            intent = intent.getData();
            Cursor cursor = getContentResolver().query(intent, null, null, null, null);
            intent = obj;
            if (cursor.moveToFirst())
            {
                intent = cursor.getString(cursor.getColumnIndexOrThrow("data1"));
            }
            cursor.close();
            editText.setText(intent);
            if (TextUtils.isEmpty(intent))
            {
                selectedCode = null;
            }
            setSpannable(editText, selectedCode);
            setSelectionToEnd();
            return;
        }
    }

    public void onClick(View view)
    {
        String s;
        switch (view.getId())
        {
        case 2131755845: 
        case 2131755847: 
        default:
            if (view instanceof DialpadButton)
            {
                view = ((DialpadButton)view).getDialKey();
                keyPressed(view.getKeyCode());
                updateCountryName();
                if (dtmfSoundsEnabled)
                {
                    toneGenerator.stopTone();
                    toneGenerator.startTone(view.getDtmfTone(), 100);
                }
            }
            return;

        case 2131755848: 
            dial();
            return;

        case 2131755843: 
            keyPressed(67);
            return;

        case 2131755846: 
            startActivityForResult(new Intent(this, com/skype/android/app/dialer/SelectCountryActivity), 1);
            return;

        case 2131755844: 
            editText.setCursorVisible(true);
            return;

        case 2131755849: 
            view = new Intent(this, com/skype/android/app/contacts/ContactAddNumberActivity);
            s = editText.getText().toString();
            break;
        }
        if (!TextUtils.isEmpty(s))
        {
            view.putExtra(ContactAddNumberActivity.EXTRA_NUMBER, s);
        }
        if (selectedCode != null)
        {
            view.putExtra(ContactAddNumberActivity.EXTRA_COUNTRY_CODE, selectedCode);
        }
        startActivity(view);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
        bundle = permissionRequest;
        Permission permission = Permission.d;
        com.skype.android.util.permission.PermissionHandler permissionhandler = PermissionRequest.b;
        bundle.a(EnumSet.of(permission), true, permissionhandler);
        if (!layoutExperience.isMultipane())
        {
            setRequestedOrientation(7);
        }
        setVolumeControlStream(5);
        getSupportActionBar().a("");
        toneGenerator = new ToneGenerator(5, 80);
        buttons = new DialpadButton[DialKey.values().length];
        initDialpadButtons();
        editText.setInputType(3);
        editText.setOnLongClickListener(this);
        editText.setOnClickListener(this);
        ViewUtil.a(this, new View[] {
            eraseButton, countryButton, callButton, addNumberButton
        });
        eraseButton.setOnLongClickListener(this);
        initDialerUi(getIntent());
        editText.addTextChangedListener(this);
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(0x7f110011, menu);
        return true;
    }

    protected void onDestroy()
    {
        toneGenerator.release();
        super.onDestroy();
    }

    public boolean onLongClick(View view)
    {
        if (view != eraseButton) goto _L2; else goto _L1
_L1:
        erasePhoneNumber(true);
_L4:
        return false;
_L2:
        if (view == editText)
        {
            editText.setCursorVisible(true);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        initDialerUi(intent);
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return false;

        case 2131756508: 
            menuitem = new Intent("android.intent.action.PICK");
            break;
        }
        menuitem.setType("vnd.android.cursor.dir/phone_v2");
        startActivityForResult(menuitem, 2);
        return true;
    }

    public boolean onPrepareOptionsMenu(Menu menu)
    {
        menu.findItem(0x7f1005dc).setVisible(isContactBookNotEmpty());
        return true;
    }

    protected void onResume()
    {
        boolean flag = true;
        super.onResume();
        if (android.provider.Settings.System.getInt(getContentResolver(), "dtmf_tone", 1) != 1)
        {
            flag = false;
        }
        dtmfSoundsEnabled = flag;
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        while (motionevent.getAction() == 2 || !(view instanceof Button) || motionevent.getAction() != 0 || !vibrator.hasVibrator()) 
        {
            return false;
        }
        vibrator.vibrate(50L);
        return false;
    }


}
