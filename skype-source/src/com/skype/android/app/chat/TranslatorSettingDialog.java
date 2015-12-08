// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import com.skype.Account;
import com.skype.Contact;
import com.skype.Conversation;
import com.skype.Translator;
import com.skype.android.SkypeDialogFragment;
import com.skype.android.SkypeDialogFragmentComponent;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.LogAttributeName;
import com.skype.android.analytics.LogEvent;
import com.skype.android.analytics.SkypeTelemetryEvent;
import com.skype.android.app.chat.picker.OnTranslatorEnabled;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncResult;
import com.skype.android.event.EventBus;
import com.skype.android.res.DefaultAvatars;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.ImageCache;
import com.skype.android.util.async.UiCallback;
import com.skype.android.widget.PathClippedImageView;
import com.skype.android.widget.SkypeAvatarView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class TranslatorSettingDialog extends SkypeDialogFragment
{
    private final class a extends ArrayAdapter
    {

        private final String HEADER_CODE = "";
        private final int LANG_CODE_LENGTH = 2;
        private final int LANG_LOCALE_PREFIX_LENGTH = 3;
        private Context context;
        private int positionSpeechText;
        private int positionText;
        private ArrayList supportedLangCodes;
        private ArrayList supportedLangNames;
        final TranslatorSettingDialog this$0;

        private boolean isSpeechSupportedForText(String s)
        {
            boolean flag;
            boolean flag1;
            flag1 = false;
            flag = flag1;
            if (!speechLanguagesResult.m_return) goto _L2; else goto _L1
_L1:
            flag = flag1;
            if (s.length() < 2) goto _L2; else goto _L3
_L3:
            String as[];
            int i;
            int j;
            as = speechLanguagesResult.m_codeList;
            j = as.length;
            i = 0;
_L8:
            flag = flag1;
            if (i >= j) goto _L2; else goto _L4
_L4:
            String s1 = as[i];
            if (s1.length() < 2 || !s1.substring(0, 2).equalsIgnoreCase(s.substring(0, 2))) goto _L6; else goto _L5
_L5:
            flag = true;
_L2:
            return flag;
_L6:
            i++;
            if (true) goto _L8; else goto _L7
_L7:
        }

        public final View getDropDownView(int i, View view, ViewGroup viewgroup)
        {
            if (i == positionSpeechText || i == positionText)
            {
                view = LayoutInflater.from(context);
                if (i == positionSpeechText)
                {
                    i = 0x7f030122;
                } else
                {
                    i = 0x7f030123;
                }
                return view.inflate(i, viewgroup, false);
            }
            View view1 = view;
            if (view instanceof RelativeLayout)
            {
                view1 = null;
            }
            return super.getDropDownView(i, view1, viewgroup);
        }

        public final int getSpinnerPositionForMe()
        {
            if (!translatorSetting.d.isEmpty() || !translatorSetting.b.isEmpty())
            {
                String s;
                int i;
                if (!translatorSetting.d.isEmpty())
                {
                    s = translatorSetting.d;
                } else
                {
                    s = translatorSetting.b;
                }
                for (i = 0; i < supportedLangCodes.size(); i++)
                {
                    if (((String)supportedLangCodes.get(i)).equalsIgnoreCase(s))
                    {
                        return i;
                    }
                }

            }
            String s2 = account.getLanguagesProp();
            String s1 = s2;
            if (s2.isEmpty())
            {
                s1 = Locale.getDefault().getLanguage();
            }
            for (int j = 0; j < supportedLangCodes.size(); j++)
            {
                if (((String)supportedLangCodes.get(j)).length() >= 2 && ((String)supportedLangCodes.get(j)).substring(0, 2).equalsIgnoreCase(s1))
                {
                    return j;
                }
            }

            return 0;
        }

        public final int getSpinnerPositionForOther()
        {
            if (translatorSetting.e.isEmpty() && translatorSetting.c.isEmpty()) goto _L2; else goto _L1
_L1:
            int i;
            String s;
            if (!translatorSetting.e.isEmpty())
            {
                s = translatorSetting.e;
            } else
            {
                s = translatorSetting.c;
            }
            i = 0;
_L15:
            if (i >= supportedLangCodes.size()) goto _L2; else goto _L3
_L3:
            if (!((String)supportedLangCodes.get(i)).equalsIgnoreCase(s)) goto _L5; else goto _L4
_L4:
            return i;
_L5:
            i++;
            continue; /* Loop/switch isn't completed */
_L2:
            Object obj;
            String s1;
            int j;
            obj = conversationUtil.r(conversation);
            s1 = ((Contact) (obj)).getLanguagesProp();
            if (s1.isEmpty())
            {
                break MISSING_BLOCK_LABEL_215;
            }
            j = 0;
_L9:
            if (j >= supportedLangCodes.size()) goto _L7; else goto _L6
_L6:
            if (((String)supportedLangCodes.get(j)).length() < 2)
            {
                continue; /* Loop/switch isn't completed */
            }
            i = j;
            if (((String)supportedLangCodes.get(j)).substring(0, 2).equalsIgnoreCase(s1)) goto _L4; else goto _L8
_L8:
            j++;
              goto _L9
_L7:
            obj = ((Contact) (obj)).getCountryProp();
            if (((String) (obj)).isEmpty())
            {
                break MISSING_BLOCK_LABEL_298;
            }
            j = 0;
_L13:
            if (j >= supportedLangCodes.size()) goto _L11; else goto _L10
_L10:
            if (((String)supportedLangCodes.get(j)).length() <= 3)
            {
                continue; /* Loop/switch isn't completed */
            }
            i = j;
            if (((String)supportedLangCodes.get(j)).substring(3).equalsIgnoreCase(((String) (obj)))) goto _L4; else goto _L12
_L12:
            j++;
              goto _L13
_L11:
            return 0;
            if (true) goto _L15; else goto _L14
_L14:
        }

        public final boolean isValidLangPositon(int i)
        {
            return i != positionSpeechText && i != positionText;
        }

        public final void onItemSelected(int i, b b1)
        {
            String s;
            String s1;
            boolean flag1;
label0:
            {
                String s3 = "";
                String s2 = "";
                flag1 = false;
                boolean flag = false;
                if (i > positionSpeechText && i < positionText)
                {
                    s1 = (String)supportedLangCodes.get(i);
                    s = s1;
                } else
                {
                    s1 = s2;
                    s = s3;
                    if (i > positionText)
                    {
                        s1 = s2;
                        s = s3;
                        if (i < supportedLangCodes.size())
                        {
                            s = (String)supportedLangCodes.get(i);
                            s1 = s2;
                        }
                    }
                }
                if (b.ME != b1)
                {
                    break MISSING_BLOCK_LABEL_234;
                }
                if (translatorSetting.d.equals(s1))
                {
                    i = ((flag) ? 1 : 0);
                    if (translatorSetting.b.equals(s))
                    {
                        break label0;
                    }
                }
                i = 1;
            }
            translatorSetting.b = s;
            translatorSetting.d = s1;
_L1:
            if (i != 0)
            {
                b1 = conversationUtil;
                if (ConversationUtil.a(translatorSetting) && !translatorSwitch.isChecked())
                {
                    translatorSwitch.setChecked(true);
                } else
                {
                    b1 = conversationUtil;
                    if (!ConversationUtil.a(translatorSetting) && translatorSwitch.isChecked())
                    {
                        translatorSwitch.setChecked(false);
                    }
                }
                dirty = true;
            }
            setupTranslatorSymbols();
            return;
label1:
            {
                if (translatorSetting.e.equals(s1))
                {
                    i = ((flag1) ? 1 : 0);
                    if (translatorSetting.c.equals(s))
                    {
                        break label1;
                    }
                }
                i = 1;
            }
            translatorSetting.c = s;
            translatorSetting.e = s1;
              goto _L1
        }

        public a(Context context1, int i)
        {
            this$0 = TranslatorSettingDialog.this;
            super(context1, i);
            supportedLangNames = new ArrayList();
            supportedLangCodes = new ArrayList();
            positionSpeechText = 0;
            positionText = 0;
            context = context1;
            supportedLangNames.add(context1.getString(0x7f08033f));
            supportedLangCodes.add("");
            if (speechLanguagesResult.m_return)
            {
                String as[] = speechLanguagesResult.m_nameList;
                int j = as.length;
                for (i = 0; i < j; i++)
                {
                    String s = as[i];
                    supportedLangNames.add(s);
                }

                as = speechLanguagesResult.m_codeList;
                j = as.length;
                for (i = 0; i < j; i++)
                {
                    String s1 = as[i];
                    supportedLangCodes.add(s1);
                }

            }
            positionText = supportedLangNames.size();
            supportedLangNames.add(context1.getString(0x7f08033f));
            supportedLangCodes.add("");
            if (textLanguagesResult.m_return)
            {
                for (i = 0; i < textLanguagesResult.m_codeList.length; i++)
                {
                    if (!isSpeechSupportedForText(textLanguagesResult.m_codeList[i]))
                    {
                        supportedLangNames.add(textLanguagesResult.m_namesList[i]);
                        supportedLangCodes.add(textLanguagesResult.m_codeList[i]);
                    }
                }

            }
            addAll(supportedLangNames);
        }
    }

    private static final class b extends Enum
    {

        private static final b $VALUES[];
        public static final b ME;
        public static final b OTHER;

        public static b valueOf(String s)
        {
            return (b)Enum.valueOf(com/skype/android/app/chat/TranslatorSettingDialog$b, s);
        }

        public static b[] values()
        {
            return (b[])$VALUES.clone();
        }

        static 
        {
            ME = new b("ME", 0);
            OTHER = new b("OTHER", 1);
            $VALUES = (new b[] {
                ME, OTHER
            });
        }

        private b(String s, int i)
        {
            super(s, i);
        }
    }


    Account account;
    a adapter;
    Analytics analytics;
    View callSymbol;
    View chatSymbol;
    ContactUtil contactUtil;
    View contentView;
    private Conversation conversation;
    ConversationUtil conversationUtil;
    DefaultAvatars defaultAvatars;
    private boolean dirty;
    EventBus eventBus;
    private boolean firstTime;
    ImageCache imageCache;
    com.skype.Translator.GetSpeechTranslatorSupportedLanguages_Result speechLanguagesResult;
    com.skype.Translator.GetTextTranslatorSupportedLanguages_Result textLanguagesResult;
    Translator translator;
    private com.skype.android.util.ConversationUtil.TranslatorSetting translatorSetting;
    Switch translatorSwitch;
    View videoSymbol;

    public TranslatorSettingDialog()
    {
        firstTime = false;
        dirty = false;
    }

    private void initSettings()
    {
        translatorSetting = conversationUtil.C(conversation);
        boolean flag;
        if (!conversationUtil.A(conversation))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        firstTime = flag;
        textLanguagesResult = translator.getTextTranslatorSupportedLanguages();
        speechLanguagesResult = translator.getSpeechTranslatorSupportedLanguages();
        localizeNamesWithLocalResource();
    }

    private void localizeNamesWithLocalResource()
    {
        String as[] = getResources().getStringArray(0x7f0a000f);
        String as1[] = getResources().getStringArray(0x7f0a0000);
        HashMap hashmap = new HashMap();
        for (int i = 0; i < as.length && i < as1.length; i++)
        {
            hashmap.put(as[i], as1[i]);
        }

        if (speechLanguagesResult.m_return)
        {
            int j = 0;
            while (j < speechLanguagesResult.m_codeList.length) 
            {
                if (hashmap.containsKey(speechLanguagesResult.m_codeList[j]))
                {
                    speechLanguagesResult.m_nameList[j] = (String)hashmap.get(speechLanguagesResult.m_codeList[j]);
                } else
                if (speechLanguagesResult.m_codeList[j].length() >= 2)
                {
                    String s = speechLanguagesResult.m_codeList[j].substring(0, 2);
                    if (hashmap.containsKey(s))
                    {
                        speechLanguagesResult.m_nameList[j] = (String)hashmap.get(s);
                    }
                }
                j++;
            }
        }
        if (textLanguagesResult.m_return)
        {
            for (int k = 0; k < textLanguagesResult.m_codeList.length; k++)
            {
                if (hashmap.containsKey(textLanguagesResult.m_codeList[k]))
                {
                    textLanguagesResult.m_namesList[k] = (String)hashmap.get(textLanguagesResult.m_codeList[k]);
                }
            }

        }
    }

    private void reportTranslatorSettingEvent(boolean flag)
    {
        Object obj;
        if (flag)
        {
            obj = LogEvent.ah;
        } else
        {
            obj = LogEvent.ai;
        }
        obj = new SkypeTelemetryEvent(((com.skype.android.analytics.EcsControllableEvent) (obj)));
        ((SkypeTelemetryEvent) (obj)).put(LogAttributeName.g, Integer.valueOf(conversation.getObjectID()));
        ((SkypeTelemetryEvent) (obj)).put(LogAttributeName.h, Boolean.valueOf(translatorSetting.a));
        ((SkypeTelemetryEvent) (obj)).put(LogAttributeName.k, translatorSetting.b);
        ((SkypeTelemetryEvent) (obj)).put(LogAttributeName.m, translatorSetting.c);
        if (!flag)
        {
            ((SkypeTelemetryEvent) (obj)).put(LogAttributeName.f, Boolean.valueOf(dirty));
        }
        analytics.a(((SkypeTelemetryEvent) (obj)));
    }

    private void setupTranslatorSpinners()
    {
        adapter = new a(getActivity(), 0x7f030121);
        Spinner spinner = (Spinner)contentView.findViewById(0x7f10055d);
        spinner.setOnItemSelectedListener(new android.widget.AdapterView.OnItemSelectedListener() {

            final TranslatorSettingDialog this$0;

            public final void onItemSelected(AdapterView adapterview, View view, int j, long l)
            {
                adapter.onItemSelected(j, b.ME);
            }

            public final void onNothingSelected(AdapterView adapterview)
            {
            }

            
            {
                this$0 = TranslatorSettingDialog.this;
                super();
            }
        });
        spinner.setAdapter(adapter);
        spinner.setSelection(adapter.getSpinnerPositionForMe());
        spinner = (Spinner)contentView.findViewById(0x7f100563);
        spinner.setAdapter(adapter);
        int i = adapter.getSpinnerPositionForOther();
        spinner.setSelection(i);
        if (firstTime && adapter.isValidLangPositon(i))
        {
            translatorSwitch.setChecked(true);
        }
        spinner.setOnItemSelectedListener(new android.widget.AdapterView.OnItemSelectedListener() {

            final TranslatorSettingDialog this$0;

            public final void onItemSelected(AdapterView adapterview, View view, int j, long l)
            {
                adapter.onItemSelected(j, b.OTHER);
            }

            public final void onNothingSelected(AdapterView adapterview)
            {
            }

            
            {
                this$0 = TranslatorSettingDialog.this;
                super();
            }
        });
    }

    private void setupTranslatorSymbols()
    {
        if (!ConversationUtil.b(translatorSetting) && ConversationUtil.a(translatorSetting))
        {
            videoSymbol.setVisibility(8);
            callSymbol.setVisibility(8);
            chatSymbol.setVisibility(0);
            return;
        } else
        {
            videoSymbol.setVisibility(0);
            callSymbol.setVisibility(0);
            chatSymbol.setVisibility(0);
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
        conversation = (Conversation)getObjectInterface(com/skype/Conversation);
        initSettings();
        reportTranslatorSettingEvent(true);
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        contentView = LayoutInflater.from(getActivity()).inflate(0x7f030120, null, false);
        bundle = new Dialog(getActivity());
        bundle.requestWindowFeature(1);
        bundle.setContentView(contentView);
        Object obj = bundle.getWindow();
        Object obj1 = ((Window) (obj)).getAttributes();
        obj1.height = -2;
        obj1.width = -1;
        if (getResources().getConfiguration().orientation == 2 || getResources().getConfiguration().smallestScreenWidthDp >= 530)
        {
            obj1.width = (int)(400F * Resources.getSystem().getDisplayMetrics().density);
        }
        ((Window) (obj)).setAttributes(((android.view.WindowManager.LayoutParams) (obj1)));
        obj1 = (TextView)contentView.findViewById(0x7f100562);
        if (conversation.getTypeProp() == com.skype.Conversation.TYPE.DIALOG)
        {
            obj = conversationUtil.r(conversation);
            ((TextView) (obj1)).setText(((Contact) (obj)).getDisplaynameProp());
            obj1 = (SkypeAvatarView)contentView.findViewById(0x7f100561);
            ((SkypeAvatarView) (obj1)).setImageDrawable(contactUtil.a(defaultAvatars.a(com.skype.android.res.DefaultAvatars.AvatarType.c, com.skype.android.res.DefaultAvatars.AvatarSize.c, ((Contact) (obj)).getDisplaynameProp())));
            ((SkypeAvatarView) (obj1)).a().setClipCircleEnabled(true);
            imageCache.a(((Contact) (obj)), obj1, new UiCallback(this, new AsyncCallback() {

                final TranslatorSettingDialog this$0;

                public final void done(AsyncResult asyncresult)
                {
                    Bitmap bitmap = (Bitmap)asyncresult.a();
                    asyncresult = (SkypeAvatarView)asyncresult.b();
                    if (bitmap != null)
                    {
                        asyncresult.setImageBitmap(bitmap);
                    }
                }

            
            {
                this$0 = TranslatorSettingDialog.this;
                super();
            }
            }));
        }
        obj = (SkypeAvatarView)contentView.findViewById(0x7f10055b);
        ((SkypeAvatarView) (obj)).setImageDrawable(contactUtil.a(defaultAvatars.a(com.skype.android.res.DefaultAvatars.AvatarType.c, com.skype.android.res.DefaultAvatars.AvatarSize.c, account.getDisplaynameProp())));
        ((SkypeAvatarView) (obj)).a().setClipCircleEnabled(true);
        imageCache.a(account, obj, new UiCallback(this, new AsyncCallback() {

            final TranslatorSettingDialog this$0;

            public final void done(AsyncResult asyncresult)
            {
                Bitmap bitmap = (Bitmap)asyncresult.a();
                asyncresult = (SkypeAvatarView)asyncresult.b();
                if (bitmap != null)
                {
                    asyncresult.setImageBitmap(bitmap);
                }
            }

            
            {
                this$0 = TranslatorSettingDialog.this;
                super();
            }
        }));
        translatorSwitch = (Switch)contentView.findViewById(0x7f10055a);
        translatorSwitch.setChecked(translatorSetting.a);
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            translatorSwitch.setShowText(false);
        }
        translatorSwitch.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() {

            final TranslatorSettingDialog this$0;

            public final void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
            {
                if (translatorSetting.a != flag)
                {
                    dirty = true;
                }
                translatorSetting.a = flag;
                eventBus.a(new OnTranslatorEnabled(conversation, flag));
            }

            
            {
                this$0 = TranslatorSettingDialog.this;
                super();
            }
        });
        setupTranslatorSpinners();
        videoSymbol = contentView.findViewById(0x7f10055e);
        chatSymbol = contentView.findViewById(0x7f10055f);
        callSymbol = contentView.findViewById(0x7f100560);
        setupTranslatorSymbols();
        return bundle;
    }

    public void onDismiss(DialogInterface dialoginterface)
    {
        conversationUtil.a(conversation, translatorSetting);
        reportTranslatorSettingEvent(false);
        super.onDismiss(dialoginterface);
    }



/*
    static boolean access$102(TranslatorSettingDialog translatorsettingdialog, boolean flag)
    {
        translatorsettingdialog.dirty = flag;
        return flag;
    }

*/


}
