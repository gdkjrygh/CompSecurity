// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.main;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.h;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.Html;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import com.skype.Account;
import com.skype.Contact;
import com.skype.Conversation;
import com.skype.Message;
import com.skype.ObjectInterface;
import com.skype.PROPKEY;
import com.skype.SkyLib;
import com.skype.Translator;
import com.skype.android.SkypeDialogFragment;
import com.skype.android.SkypeDialogFragmentComponent;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.AnalyticsEvent;
import com.skype.android.analytics.AnalyticsParameter;
import com.skype.android.analytics.AnalyticsParameterContainer;
import com.skype.android.app.ActionBarCustomizer;
import com.skype.android.app.InfoDialogFragment;
import com.skype.android.app.LayoutExperience;
import com.skype.android.app.account.DeletePhoneNumberDialog;
import com.skype.android.app.contacts.ContactDeleteNumberDialog;
import com.skype.android.app.contacts.ContactPhoneNumbersTypeAdapter;
import com.skype.android.app.dialer.SelectCountryActivity;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.inject.LifecycleSupport;
import com.skype.android.res.ChatText;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.CountryCode;
import com.skype.android.util.ViewUtil;
import com.skype.android.util.accessibility.AccessibilityUtil;
import com.skype.android.util.cache.ContactMoodCache;
import com.skype.android.util.cache.FormattedMessageCache;
import java.util.ArrayList;
import java.util.List;

public class EditPropertyFragment extends SkypeDialogFragment
    implements android.content.DialogInterface.OnClickListener, TextWatcher, android.view.View.OnClickListener
{
    public static class ProfileErrorDialogFragment extends h
    {

        public Dialog onCreateDialog(Bundle bundle)
        {
            bundle = new android.app.AlertDialog.Builder(getActivity());
            CharSequence charsequence = getActivity().getTitle();
            bundle.setTitle(getString(0x7f080235, new Object[] {
                charsequence
            }));
            bundle.setMessage(getString(0x7f080387, new Object[] {
                charsequence
            }));
            bundle.setPositiveButton(getString(0x7f080340), null);
            bundle.setNegativeButton(getString(0x7f080120), null);
            return bundle.create();
        }

        public ProfileErrorDialogFragment()
        {
        }
    }


    private static final int ANNOTATION_POST_DELAY = 250;
    public static final String EXTRA_EDIT_MODE = "editMode";
    public static final String EXTRA_PHONE_POSITION = "phonePosition";
    public static final int FULL_NAME_TEXT_LIMIT = 70;
    public static final int MULTI_LINE_TEXT_LIMIT = 300;
    public static final String NEGATIVE_BUTTON_TEXT = "negativeKey";
    public static final String POSITIVE_BUTTON_TEXT = "positiveKey";
    public static final int SELECT_COUNTRY_ACTIVITY_REQUEST_CODE = 1;
    public static final String STATE_COUNTRY_CODE = "STATE_COUNTRY_CODE";
    AccessibilityUtil accessibility;
    Account account;
    ActionBarCustomizer actionBarCustomizer;
    Analytics analytics;
    ChatText chatText;
    ContactUtil contactUtil;
    ConversationUtil conversationUtil;
    int conversationdId;
    private Button countryButton;
    private CountryCode countryCode;
    private TextView countryPrefix;
    EcsConfiguration ecsConfiguration;
    private boolean editMode;
    private EditText editText;
    InputMethodManager imm;
    private boolean isPhone;
    LayoutExperience layoutExperience;
    SkyLib lib;
    ObjectIdMap map;
    FormattedMessageCache messageCache;
    ContactMoodCache moodCache;
    private String normalizedPhone;
    private ObjectInterface object;
    private int phonePosition;
    private Spinner phoneType;
    private List phoneTypes;
    private PROPKEY property;
    private MenuItem removeButton;
    private MenuItem saveButton;
    private int selectedCode;
    String srcLang;
    String textOriginal;
    Translator translator;

    public EditPropertyFragment()
    {
        textOriginal = "";
        srcLang = "";
    }

    private void closeDialog()
    {
        if (getShowsDialog())
        {
            dismiss();
            return;
        } else
        {
            getActivity().finish();
            return;
        }
    }

    private void enableSaveButton(String s)
    {
        boolean flag = true;
        if (!isPhone) goto _L2; else goto _L1
_L1:
        flag = validatePhone(s);
_L4:
        saveButton.setEnabled(flag);
        return;
_L2:
        if (property == PROPKEY.CONTACT_FULLNAME || property == PROPKEY.CONTACT_ABOUT)
        {
            flag = validateFieldIsNotEmpty(s);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private int getPhonePropKeyIndex()
    {
        boolean flag = false;
        int i = 0;
        do
        {
label0:
            {
                int j = ((flag) ? 1 : 0);
                if (i < ContactUtil.e.length)
                {
                    if (ContactUtil.e[i] != property)
                    {
                        break label0;
                    }
                    j = i;
                }
                return j;
            }
            i++;
        } while (true);
    }

    private int getPhoneSpinnerIndex()
    {
        int i = getPhonePropKeyIndex();
        Object obj = (Contact)object;
        obj = getString(contactUtil.a(((Contact) (obj)).getStrProperty(ContactUtil.f[i])));
        for (int j = 0; j < phoneType.getCount(); j++)
        {
            if (phoneType.getItemAtPosition(j).toString().equalsIgnoreCase(((String) (obj))))
            {
                return j;
            }
        }

        return 0;
    }

    private int getTitleForProperty()
    {
        int i = -1;
        if (property == PROPKEY.CONTACT_GIVEN_DISPLAYNAME)
        {
            i = 0x7f080248;
        } else
        {
            if (property == PROPKEY.CONTACT_MOOD_TEXT)
            {
                return 0x7f080247;
            }
            if (property == PROPKEY.CONVERSATION_META_TOPIC)
            {
                return 0x7f08026a;
            }
            if (property == PROPKEY.CONTACT_FULLNAME)
            {
                return 0x7f08024e;
            }
            if (property == PROPKEY.CONTACT_ABOUT)
            {
                return 0x7f080225;
            }
            if (property == PROPKEY.CONTACT_LANGUAGES)
            {
                return 0x7f080253;
            }
            if (property == PROPKEY.CONTACT_CITY)
            {
                return 0x7f08023a;
            }
            if (property == PROPKEY.CONTACT_PROVINCE)
            {
                return 0x7f08027d;
            }
            if (property == PROPKEY.CONTACT_PHONE_MOBILE)
            {
                return 0x7f08025b;
            }
            if (property == PROPKEY.CONTACT_PHONE_HOME)
            {
                return 0x7f080250;
            }
            if (property == PROPKEY.CONTACT_PHONE_OFFICE)
            {
                return 0x7f080263;
            }
            if (property == PROPKEY.MESSAGE_BODY_XML)
            {
                return 0x7f080246;
            }
            if (ContactUtil.a(property))
            {
                return 0x7f080249;
            }
        }
        return i;
    }

    private void initLayoutContent()
    {
        if (property == PROPKEY.CONTACT_ABOUT || property == PROPKEY.CONTACT_MOOD_TEXT)
        {
            editText.setSingleLine(false);
            editText.setMinLines(3);
            editText.setLines(6);
            editText.setFilters(new InputFilter[] {
                new android.text.InputFilter.LengthFilter(300)
            });
            if (property == PROPKEY.CONTACT_MOOD_TEXT)
            {
                editText.setHint(0x7f080489);
                editText.setHintTextColor(getResources().getColor(0x7f0f0110));
            }
        } else
        {
            if (isPhone)
            {
                countryPrefix.setVisibility(0);
                editText.setInputType(3);
                return;
            }
            if (property == PROPKEY.CONTACT_GIVEN_DISPLAYNAME || property == PROPKEY.CONTACT_FULLNAME)
            {
                editText.setHint(0x7f08025e);
                editText.setFilters(new InputFilter[] {
                    new android.text.InputFilter.LengthFilter(70)
                });
                return;
            }
            if (property == PROPKEY.MESSAGE_BODY_XML)
            {
                editText.setMinLines(3);
                editText.setSingleLine(false);
                return;
            }
        }
    }

    private void populateDefaultValues()
    {
        Object obj;
        String s;
        Contact contact;
        if (property == PROPKEY.MESSAGE_BODY_XML && (object instanceof Message) && messageCache.e((Message)object))
        {
            s = messageCache.c((Message)object);
        } else
        {
            s = object.getStrProperty(property);
        }
        if (property != PROPKEY.CONTACT_GIVEN_DISPLAYNAME) goto _L2; else goto _L1
_L1:
        contact = (Contact)object;
        if (!ContactUtil.q(contact)) goto _L4; else goto _L3
_L3:
        obj = "";
_L6:
        editText.setText(((CharSequence) (obj)));
        editText.setSelection(((CharSequence) (obj)).length());
        return;
_L4:
        obj = s;
        if (TextUtils.isEmpty(s))
        {
            obj = contactUtil.l(contact);
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (isPhone)
        {
            if (object instanceof Contact)
            {
                phoneType.setVisibility(0);
                phoneType.setSelection(getPhoneSpinnerIndex());
            }
            if (TextUtils.isEmpty(s))
            {
                countryCode = contactUtil.b();
                obj = s;
            } else
            {
                obj = s.toString();
                s = lib.getISOCountryCodebyPhoneNo(((String) (obj)));
                countryCode = contactUtil.g(s);
                obj = ((String) (obj)).substring(countryCode.d().length());
            }
            updateSelectedCountry(countryCode);
        } else
        if (property == PROPKEY.MESSAGE_BODY_XML || property == PROPKEY.CONTACT_MOOD_TEXT)
        {
            obj = lib.contentGetRichEditable(s.toString(), new String[] {
                "ss", "flag"
            });
            obj = chatText.a(((com.skype.SkyLib.ContentGetRichEditable_Result) (obj)).m_result, Integer.valueOf(0));
        } else
        {
            obj = s;
            if (property == PROPKEY.CONVERSATION_META_TOPIC)
            {
                obj = Html.fromHtml(chatText.a(s.toString(), Integer.valueOf(0)).toString());
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void saveAndClose()
    {
        String s;
        boolean flag1;
        boolean flag2;
        s = editText.getText().toString().trim();
        flag1 = false;
        flag2 = false;
        if (!(object instanceof Conversation)) goto _L2; else goto _L1
_L1:
        boolean flag;
        Conversation conversation = (Conversation)object;
        flag = flag2;
        if (property == PROPKEY.CONVERSATION_META_TOPIC)
        {
            flag = conversation.setTopic(s, false);
            moodCache.a(conversation.getObjectID());
        }
_L4:
        if (flag)
        {
            closeDialog();
        }
        return;
_L2:
        if (object instanceof Contact)
        {
            Contact contact = (Contact)object;
            if (property == PROPKEY.CONTACT_GIVEN_DISPLAYNAME)
            {
                flag = contact.giveDisplayName(s);
            } else
            {
                flag = flag2;
                if (isPhone)
                {
                    flag = flag2;
                    if (validatePhone(s))
                    {
                        if (contactUtil.a(s, selectedCode))
                        {
                            InfoDialogFragment.create(getString(0x7f0804b2), getString(0x7f0804b3), getString(0x7f0802f6)).show(getActivity().getSupportFragmentManager());
                            flag = flag2;
                        } else
                        {
                            s = contactUtil.b(phoneType.getSelectedItem().toString());
                            flag = contact.setPhoneNumber(phonePosition, s, normalizedPhone);
                        }
                    }
                }
            }
        } else
        if (object instanceof Account)
        {
            Object obj = lib.validateProfileString(property, s, false);
            if (((com.skype.SkyLib.ValidateProfileString_Result) (obj)).m_return == com.skype.SkyLib.VALIDATERESULT.VALIDATED_OK || ((com.skype.SkyLib.ValidateProfileString_Result) (obj)).m_return == com.skype.SkyLib.VALIDATERESULT.NOT_VALIDATED)
            {
                obj = (Account)object;
                if (isPhone)
                {
                    s = normalizedPhone;
                }
                flag1 = ((Account) (obj)).setStrProperty(property, s);
                flag = flag1;
                if (!flag1)
                {
                    (new ProfileErrorDialogFragment()).show(getActivity().getSupportFragmentManager(), null);
                    flag = flag1;
                }
            } else
            {
                showError(((com.skype.SkyLib.ValidateProfileString_Result) (obj)).m_return);
                flag = flag2;
            }
        } else
        {
            flag = flag2;
            if (object instanceof Message)
            {
                Message message = (Message)object;
                flag = flag2;
                if (property == PROPKEY.MESSAGE_BODY_XML)
                {
                    Conversation conversation1 = (Conversation)map.a(conversationdId);
                    boolean flag3 = false;
                    flag = flag3;
                    if (conversation1 != null)
                    {
                        com.skype.android.util.ConversationUtil.TranslatorSetting translatorsetting = conversationUtil.C(conversation1);
                        flag = flag3;
                        if (conversationUtil.B(conversation1))
                        {
                            flag = flag3;
                            if (ConversationUtil.a(translatorsetting))
                            {
                                srcLang = translatorsetting.b;
                                textOriginal = s;
                                com.skype.SkyLib.ContentEncodeCloud_Result contentencodecloud_result = lib.contentEncodeCloud(textOriginal, true);
                                if (contentencodecloud_result.m_return)
                                {
                                    flag = translator.translateText(message.getObjectID(), conversationdId, contentencodecloud_result.m_result, translatorsetting.c, srcLang);
                                } else
                                {
                                    flag = translator.translateText(message.getObjectID(), conversationdId, textOriginal, translatorsetting.c, srcLang);
                                }
                            }
                        }
                    }
                    if (!flag)
                    {
                        flag1 = message.edit(s, false, false, "");
                    }
                    reportEvents(AnalyticsEvent.cY, message);
                    flag = flag1;
                }
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void showError(com.skype.SkyLib.VALIDATERESULT validateresult)
    {
        static final class _cls2
        {

            static final int $SwitchMap$com$skype$SkyLib$VALIDATERESULT[];

            static 
            {
                $SwitchMap$com$skype$SkyLib$VALIDATERESULT = new int[com.skype.SkyLib.VALIDATERESULT.values().length];
                try
                {
                    $SwitchMap$com$skype$SkyLib$VALIDATERESULT[com.skype.SkyLib.VALIDATERESULT.CONTAINS_INVALID_CHAR.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$skype$SkyLib$VALIDATERESULT[com.skype.SkyLib.VALIDATERESULT.CONTAINS_SPACE.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$skype$SkyLib$VALIDATERESULT[com.skype.SkyLib.VALIDATERESULT.CONTAINS_INVALID_WORD.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$skype$SkyLib$VALIDATERESULT[com.skype.SkyLib.VALIDATERESULT.INVALID_FORMAT.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$skype$SkyLib$VALIDATERESULT[com.skype.SkyLib.VALIDATERESULT.STARTS_WITH_INVALID_CHAR.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$skype$SkyLib$VALIDATERESULT[com.skype.SkyLib.VALIDATERESULT.TOO_LONG.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$skype$SkyLib$VALIDATERESULT[com.skype.SkyLib.VALIDATERESULT.TOO_SHORT.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        int ai[] = _cls2..SwitchMap.com.skype.SkyLib.VALIDATERESULT;
        validateresult.ordinal();
        (new ProfileErrorDialogFragment()).show(getActivity().getSupportFragmentManager(), null);
    }

    private void updateSelectedCountry(CountryCode countrycode)
    {
        if (countrycode != null)
        {
            String s = contactUtil.b(countrycode);
            selectedCode = countrycode.c();
            countryButton.setText(s);
            countryPrefix.setText(countrycode.d());
        }
        getActivity().supportInvalidateOptionsMenu();
    }

    private boolean validateFieldIsNotEmpty(String s)
    {
        return s.length() > 0;
    }

    private boolean validatePhone(String s)
    {
        s = lib.normalizePSTNWithCountry(s, selectedCode);
        boolean flag;
        if (((com.skype.SkyLib.NormalizePSTNWithCountry_Result) (s)).m_return == com.skype.SkyLib.NORMALIZERESULT.IDENTITY_OK)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        normalizedPhone = ((com.skype.SkyLib.NormalizePSTNWithCountry_Result) (s)).m_normalized;
        return flag;
    }

    public void afterTextChanged(Editable editable)
    {
        editable = getActivity();
        if (editable != null)
        {
            editable.supportInvalidateOptionsMenu();
        }
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        if (i == 1 && j == -1 && intent != null && intent.hasExtra("country_list_item"))
        {
            i = intent.getIntExtra("country_list_item", 0);
            countryCode = contactUtil.a(i);
            updateSelectedCountry(countryCode);
        }
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        getActivity().supportInvalidateOptionsMenu();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        switch (i)
        {
        default:
            return;

        case -2: 
            dialoginterface.dismiss();
            return;

        case -1: 
            saveAndClose();
            break;
        }
    }

    public void onClick(View view)
    {
        if (view.equals(countryButton))
        {
            startActivityForResult(new Intent(getActivity(), com/skype/android/app/dialer/SelectCountryActivity), 1);
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
        lifecycleSupport.addListener(actionBarCustomizer);
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        Object obj = getActivity();
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(((android.content.Context) (obj)));
        obj = ((FragmentActivity) (obj)).getLayoutInflater().inflate(0x7f030083, null);
        onViewCreated(((View) (obj)), bundle);
        builder.setView(((View) (obj)));
        builder.setPositiveButton(getArguments().getInt("positiveKey", 0x7f0802f6), this);
        builder.setNegativeButton(getArguments().getInt("negativeKey", 0x7f080120), this);
        builder.setTitle(getTitleForProperty());
        return builder.create();
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
        menuinflater.inflate(0x7f110012, menu);
        saveButton = menu.findItem(0x7f1005bb);
        if (editMode)
        {
            removeButton = menu.findItem(0x7f1005de);
            removeButton.setVisible(true);
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        if (getDialog() != null)
        {
            return super.onCreateView(layoutinflater, viewgroup, bundle);
        } else
        {
            return layoutinflater.inflate(0x7f030083, viewgroup, false);
        }
    }

    public void onEvent(com.skype.android.gen.TranslatorListener.OnTranscribedMessage ontranscribedmessage)
    {
        if (object instanceof Message)
        {
            final Message message = (Message)object;
            Object obj = ontranscribedmessage.getText();
            if (obj != null && message.getObjectID() == ontranscribedmessage.getMsgId())
            {
                ontranscribedmessage = ConversationUtil.b(((String) (obj)));
                obj = lib.contentStripXML(ontranscribedmessage);
                if (((com.skype.SkyLib.ContentStripXML_Result) (obj)).m_return)
                {
                    message.edit(((com.skype.SkyLib.ContentStripXML_Result) (obj)).m_result, false, false, "");
                } else
                {
                    message.edit(ontranscribedmessage, false, false, "");
                }
                (new Handler(Looper.getMainLooper())).postDelayed(new Runnable() {

                    final EditPropertyFragment this$0;
                    final Message val$message;

                    public final void run()
                    {
                        message.addAnnotation(com.skype.MessageAnnotation.TYPE.TRANSLATION, srcLang, textOriginal);
                        closeDialog();
                    }

            
            {
                this$0 = EditPropertyFragment.this;
                message = message1;
                super();
            }
                }, 250L);
            }
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        boolean flag = true;
        menuitem.getItemId();
        JVM INSTR lookupswitch 3: default 44
    //                   16908332: 48
    //                   2131756475: 57
    //                   2131756510: 63;
           goto _L1 _L2 _L3 _L4
_L1:
        flag = false;
_L6:
        return flag;
_L2:
        getActivity().finish();
        return true;
_L3:
        saveAndClose();
        return true;
_L4:
        if (object instanceof Contact)
        {
            menuitem = (ContactDeleteNumberDialog)SkypeDialogFragment.create(object, com/skype/android/app/contacts/ContactDeleteNumberDialog);
            menuitem.getArguments().putInt("com.skype.index", phonePosition);
            menuitem.show(getActivity().getSupportFragmentManager(), null);
            return true;
        }
        if (object instanceof Account)
        {
            menuitem = (DeletePhoneNumberDialog)SkypeDialogFragment.create(object, com/skype/android/app/account/DeletePhoneNumberDialog);
            menuitem.getArguments().putSerializable("com.skype.propkey", property);
            menuitem.show(getActivity().getSupportFragmentManager(), null);
            return true;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void onPrepareOptionsMenu(Menu menu)
    {
        enableSaveButton(editText.getText().toString().trim());
        if (accessibility.a())
        {
            accessibility.a(menu.findItem(0x7f1005bb));
            accessibility.a(menu.findItem(0x7f1005de));
            accessibility.a(menu.findItem(0x7f1005dd));
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("STATE_COUNTRY_CODE", countryCode);
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        countryButton = (Button)view.findViewById(0x7f100361);
        countryPrefix = (TextView)view.findViewById(0x7f100363);
        editText = (EditText)view.findViewById(0x7f100322);
        phoneType = (Spinner)view.findViewById(0x7f100364);
        ViewUtil.a(phoneType, getResources().getDrawable(0x7f0201ca));
        Boolean boolean1 = Boolean.valueOf(getShowsDialog());
        Object obj;
        int i;
        if (boolean1.booleanValue())
        {
            view = getArguments();
        } else
        {
            view = getActivity().getIntent().getExtras();
        }
        i = view.getInt("com.skype.objId", -1);
        obj = view.getString("com.skype.objClass");
        try
        {
            obj = Class.forName(((String) (obj)));
            object = map.a(i, ((Class) (obj)));
        }
        catch (ClassNotFoundException classnotfoundexception)
        {
            classnotfoundexception.printStackTrace();
            getActivity().onBackPressed();
        }
        conversationdId = view.getInt("conversationId", -1);
        property = (PROPKEY)view.getSerializable("com.skype.propkey");
        editMode = view.getBoolean("editMode", false);
        phonePosition = view.getInt("phonePosition", 1);
        isPhone = ContactUtil.a(property);
        if (!isPhone)
        {
            countryButton.setVisibility(8);
        } else
        {
            countryButton.setOnClickListener(this);
            if (object instanceof Contact)
            {
                phoneType.setVisibility(0);
            }
        }
        if (!boolean1.booleanValue())
        {
            getActionBarActivity().getSupportActionBar().b(true);
            setHasOptionsMenu(true);
            actionBarCustomizer.setTitle(getTitleForProperty());
        }
        editText.addTextChangedListener(this);
        phoneTypes = new ArrayList();
        phoneTypes.add(getString(0x7f0802dc));
        phoneTypes.add(getString(0x7f0802c3));
        phoneTypes.add(getString(0x7f0802f4));
        view = new ContactPhoneNumbersTypeAdapter(getActivity(), phoneTypes);
        phoneType.setAdapter(view);
        initLayoutContent();
        if (bundle != null)
        {
            countryCode = (CountryCode)bundle.getParcelable("STATE_COUNTRY_CODE");
            updateSelectedCountry(countryCode);
            return;
        } else
        {
            populateDefaultValues();
            return;
        }
    }

    public void reportEvents(AnalyticsEvent analyticsevent, Message message)
    {
        AnalyticsParameterContainer analyticsparametercontainer = new AnalyticsParameterContainer();
        analyticsparametercontainer.a(AnalyticsParameter.U, "edit");
        analyticsparametercontainer.a(AnalyticsParameter.s, Analytics.b(message.getEditTimestampProp() - message.getTimestampProp()));
        analytics.a(analyticsevent, analyticsparametercontainer);
    }

}
