// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.account;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.skype.Account;
import com.skype.PROPKEY;
import com.skype.android.SkypeActivity;
import com.skype.android.SkypeActivityComponent;
import com.skype.android.app.ActionBarCustomizer;
import com.skype.android.app.Navigation;
import com.skype.android.app.dialer.SelectCountryActivity;
import com.skype.android.app.main.EditPropertyActivity;
import com.skype.android.inject.LifecycleSupport;
import com.skype.android.util.AccountUtil;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.CountryCode;
import com.skype.android.util.TimeUtil;
import com.skype.android.util.ViewUtil;

// Referenced classes of package com.skype.android.app.account:
//            ChangeBirthdayDialog, ChangeGenderDialog, ChangeLanguageDialog, EditEmailActivity

public class AccountProfileInfoActivity extends SkypeActivity
    implements android.view.View.OnClickListener
{

    private static final int ACCOUNT_BUTTON_IDS[] = {
        0x7f1001fa, 0x7f1001fb, 0x7f1001fd, 0x7f1001fe, 0x7f1001ff, 0x7f100200, 0x7f100201, 0x7f100202, 0x7f100203, 0x7f100204, 
        0x7f100206, 0x7f100207, 0x7f100208, 0x7f100209
    };
    private static final PROPKEY DISPLAYED_PROPKEYS[];
    private static final int MINOR_TITLES[] = {
        0x7f08025d, 0x7f08027b, 0x7f08024e, 0x7f08024f, 0x7f080230, 0x7f080253, 0x7f08023a, 0x7f08027d, 0x7f080241, 0x7f080225, 
        0x7f08024a, 0x7f08025b, 0x7f080250, 0x7f080263
    };
    private static final int SELECT_COUNTRY_ACTIVITY_REQUEST_CODE = 1;
    Account account;
    ActionBarCustomizer actionBarCustomizer;
    ContactUtil contactUtil;
    Navigation nav;
    TimeUtil timeUtil;

    public AccountProfileInfoActivity()
    {
    }

    private void fillAccountField(View view, String s, String s1)
    {
        TextView textview1 = (TextView)view.findViewById(0x7f10020a);
        TextView textview = (TextView)view.findViewById(0x7f10020b);
        textview1.setText(s);
        view = s1;
        if (TextUtils.isEmpty(s1))
        {
            view = getString(0x7f0802e9);
        }
        textview.setText(view);
    }

    private String getStringForKey(PROPKEY propkey)
    {
        static final class _cls1
        {

            static final int $SwitchMap$com$skype$PROPKEY[];

            static 
            {
                $SwitchMap$com$skype$PROPKEY = new int[PROPKEY.values().length];
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.CONTACT_GENDER.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.CONTACT_BIRTHDAY.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.CONTACT_LANGUAGES.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.CONTACT_COUNTRY.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.CONTACT_EMAILS.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.CONTACT_PHONE_HOME.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.CONTACT_PHONE_MOBILE.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.CONTACT_PHONE_OFFICE.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.com.skype.PROPKEY[propkey.ordinal()])
        {
        default:
            return account.getStrProperty(propkey).trim();

        case 1: // '\001'
            if (account.getGenderProp() == 1)
            {
                return getString(0x7f0802ce);
            }
            if (account.getGenderProp() == 2)
            {
                return getString(0x7f0802b5);
            } else
            {
                return getString(0x7f0802e9);
            }

        case 2: // '\002'
            return TimeUtil.a(account.getBirthdayProp(), getString(0x7f0802e9), 1);

        case 3: // '\003'
            propkey = account.getLanguagesProp();
            propkey = contactUtil.i(propkey);
            if (TextUtils.isEmpty(propkey))
            {
                return getString(0x7f0802e9);
            } else
            {
                return propkey;
            }

        case 4: // '\004'
            propkey = account.getCountryProp();
            CountryCode countrycode = contactUtil.g(propkey);
            propkey = "";
            if (countrycode != null)
            {
                propkey = countrycode.a();
            }
            if (TextUtils.isEmpty(propkey))
            {
                return getString(0x7f0802e9);
            } else
            {
                return propkey;
            }

        case 5: // '\005'
            propkey = account.getEmailsProp().replaceAll(" ", System.getProperty("line.separator"));
            if (TextUtils.isEmpty(propkey))
            {
                return getString(0x7f080289);
            } else
            {
                return propkey;
            }

        case 6: // '\006'
            propkey = account.getPhoneHomeProp();
            if (TextUtils.isEmpty(propkey))
            {
                return getString(0x7f08028a);
            } else
            {
                return propkey;
            }

        case 7: // '\007'
            propkey = account.getPhoneMobileProp();
            if (TextUtils.isEmpty(propkey))
            {
                return getString(0x7f08028a);
            } else
            {
                return propkey;
            }

        case 8: // '\b'
            propkey = account.getPhoneOfficeProp();
            break;
        }
        if (TextUtils.isEmpty(propkey))
        {
            return getString(0x7f08028a);
        } else
        {
            return propkey;
        }
    }

    private void initDividers()
    {
        ((TextView)findViewById(0x7f1001fc).findViewById(0x7f10035f)).setText(0x7f080265);
        ((TextView)findViewById(0x7f100205).findViewById(0x7f10035f)).setText(0x7f08023d);
    }

    private boolean isEditable(PROPKEY propkey)
    {
        switch (_cls1..SwitchMap.com.skype.PROPKEY[propkey.ordinal()])
        {
        default:
            return false;

        case 6: // '\006'
            return !TextUtils.isEmpty(account.getPhoneHomeProp());

        case 7: // '\007'
            return !TextUtils.isEmpty(account.getPhoneMobileProp());

        case 8: // '\b'
            break;
        }
        return !TextUtils.isEmpty(account.getPhoneOfficeProp());
    }

    private void updateAccountFields()
    {
        int i;
        int j;
        j = ACCOUNT_BUTTON_IDS.length;
        i = 0;
_L6:
        if (i >= j) goto _L2; else goto _L1
_L1:
        boolean flag;
        int k;
        boolean flag1;
        k = ACCOUNT_BUTTON_IDS[i];
        flag1 = true;
        flag = false;
        MINOR_TITLES[i];
        JVM INSTR lookupswitch 2: default 56
    //                   2131231325: 139
    //                   2131231355: 153;
           goto _L3 _L4 _L5
_L3:
        Object obj = findViewById(k);
        if (flag1)
        {
            fillAccountField(((View) (obj)), getString(MINOR_TITLES[i]), getStringForKey(DISPLAYED_PROPKEYS[i]));
            if (!flag)
            {
                obj = (RelativeLayout)obj;
                ((RelativeLayout) (obj)).setTag(Integer.valueOf(i));
                ((RelativeLayout) (obj)).setFocusable(true);
                ViewUtil.a(((View) (obj)), getResources().getDrawable(0x7f020173));
                ((RelativeLayout) (obj)).setOnClickListener(this);
            }
        } else
        {
            ((View) (obj)).setVisibility(8);
        }
        i++;
          goto _L6
_L4:
        flag1 = AccountUtil.a(account);
_L7:
        flag = true;
          goto _L3
_L5:
        if (AccountUtil.b(account) || AccountUtil.e(account))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
          goto _L7
_L2:
          goto _L3
    }

    private void updateAccountInfo(CountryCode countrycode)
    {
        account.setStrProperty(PROPKEY.CONTACT_COUNTRY, countrycode.b());
        account.setServersideStrProperty(PROPKEY.CONTACT_COUNTRY, countrycode.b());
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        if (i == 1 && j == -1 && intent != null && intent.hasExtra("country_list_item"))
        {
            i = intent.getIntExtra("country_list_item", 0);
            updateAccountInfo(contactUtil.a(i));
        }
    }

    public void onClick(View view)
    {
        PROPKEY propkey;
label0:
        {
            view = (Integer)view.getTag();
            if (view != null)
            {
                propkey = DISPLAYED_PROPKEYS[view.intValue()];
                if (propkey != PROPKEY.CONTACT_BIRTHDAY)
                {
                    break label0;
                }
                (new ChangeBirthdayDialog()).show(getSupportFragmentManager());
            }
            return;
        }
        if (propkey == PROPKEY.CONTACT_GENDER)
        {
            (new ChangeGenderDialog()).show(getSupportFragmentManager());
            return;
        }
        if (propkey == PROPKEY.CONTACT_LANGUAGES)
        {
            (new ChangeLanguageDialog()).show(getSupportFragmentManager());
            return;
        }
        if (propkey == PROPKEY.CONTACT_COUNTRY)
        {
            startActivityForResult(new Intent(this, com/skype/android/app/dialer/SelectCountryActivity), 1);
            return;
        }
        if (propkey != PROPKEY.CONTACT_EMAILS) goto _L2; else goto _L1
_L1:
        view = nav.intentFor(account, com/skype/android/app/account/EditEmailActivity);
        view.putExtra("com.skype.propkey", propkey);
_L4:
        startActivity(view);
        return;
_L2:
        Intent intent = nav.intentFor(account, com/skype/android/app/main/EditPropertyActivity);
        intent.putExtra("com.skype.propkey", propkey);
        boolean flag = isEditable(propkey);
        view = intent;
        if (flag)
        {
            intent.putExtra("editMode", flag);
            view = intent;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
        lifecycleSupport.addListener(actionBarCustomizer);
        actionBarCustomizer.setTitleWithRecents(0x7f080227);
        initDividers();
    }

    public void onEvent(com.skype.android.gen.AccountListener.OnPropertyChange onpropertychange)
    {
        updateAccountFields();
    }

    public void onResume()
    {
        updateAccountFields();
        super.onResume();
    }

    static 
    {
        DISPLAYED_PROPKEYS = (new PROPKEY[] {
            PROPKEY.ACCOUNT_SIGNIN_NAME, PROPKEY.CONTACT_SKYPENAME, PROPKEY.CONTACT_FULLNAME, PROPKEY.CONTACT_GENDER, PROPKEY.CONTACT_BIRTHDAY, PROPKEY.CONTACT_LANGUAGES, PROPKEY.CONTACT_CITY, PROPKEY.CONTACT_PROVINCE, PROPKEY.CONTACT_COUNTRY, PROPKEY.CONTACT_ABOUT, 
            PROPKEY.CONTACT_EMAILS, PROPKEY.CONTACT_PHONE_MOBILE, PROPKEY.CONTACT_PHONE_HOME, PROPKEY.CONTACT_PHONE_OFFICE
        });
    }
}
