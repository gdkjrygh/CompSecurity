// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RelativeLayout;
import android.widget.Switch;
import com.skype.Account;
import com.skype.Contact;
import com.skype.android.util.ConversationUtil;
import java.util.ArrayList;
import java.util.Locale;

// Referenced classes of package com.skype.android.app.chat:
//            TranslatorSettingDialog

private final class supportedLangNames extends ArrayAdapter
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
        if (!TranslatorSettingDialog.access$000(TranslatorSettingDialog.this).d.isEmpty() || !TranslatorSettingDialog.access$000(TranslatorSettingDialog.this).b.isEmpty())
        {
            String s;
            int i;
            if (!TranslatorSettingDialog.access$000(TranslatorSettingDialog.this).d.isEmpty())
            {
                s = TranslatorSettingDialog.access$000(TranslatorSettingDialog.this).d;
            } else
            {
                s = TranslatorSettingDialog.access$000(TranslatorSettingDialog.this).b;
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
        if (TranslatorSettingDialog.access$000(TranslatorSettingDialog.this).e.isEmpty() && TranslatorSettingDialog.access$000(TranslatorSettingDialog.this).c.isEmpty()) goto _L2; else goto _L1
_L1:
        int i;
        String s;
        if (!TranslatorSettingDialog.access$000(TranslatorSettingDialog.this).e.isEmpty())
        {
            s = TranslatorSettingDialog.access$000(TranslatorSettingDialog.this).e;
        } else
        {
            s = TranslatorSettingDialog.access$000(TranslatorSettingDialog.this).c;
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
        obj = conversationUtil.r(TranslatorSettingDialog.access$200(TranslatorSettingDialog.this));
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

    public final void onItemSelected(int i, positionText positiontext)
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
            if (ME != positiontext)
            {
                break MISSING_BLOCK_LABEL_234;
            }
            if (TranslatorSettingDialog.access$000(TranslatorSettingDialog.this).d.equals(s1))
            {
                i = ((flag) ? 1 : 0);
                if (TranslatorSettingDialog.access$000(TranslatorSettingDialog.this).b.equals(s))
                {
                    break label0;
                }
            }
            i = 1;
        }
        TranslatorSettingDialog.access$000(TranslatorSettingDialog.this).b = s;
        TranslatorSettingDialog.access$000(TranslatorSettingDialog.this).d = s1;
_L1:
        if (i != 0)
        {
            positiontext = conversationUtil;
            if (ConversationUtil.a(TranslatorSettingDialog.access$000(TranslatorSettingDialog.this)) && !translatorSwitch.isChecked())
            {
                translatorSwitch.setChecked(true);
            } else
            {
                positiontext = conversationUtil;
                if (!ConversationUtil.a(TranslatorSettingDialog.access$000(TranslatorSettingDialog.this)) && translatorSwitch.isChecked())
                {
                    translatorSwitch.setChecked(false);
                }
            }
            TranslatorSettingDialog.access$102(TranslatorSettingDialog.this, true);
        }
        TranslatorSettingDialog.access$300(TranslatorSettingDialog.this);
        return;
label1:
        {
            if (TranslatorSettingDialog.access$000(TranslatorSettingDialog.this).e.equals(s1))
            {
                i = ((flag1) ? 1 : 0);
                if (TranslatorSettingDialog.access$000(TranslatorSettingDialog.this).c.equals(s))
                {
                    break label1;
                }
            }
            i = 1;
        }
        TranslatorSettingDialog.access$000(TranslatorSettingDialog.this).c = s;
        TranslatorSettingDialog.access$000(TranslatorSettingDialog.this).e = s1;
          goto _L1
    }

    public ting(Context context1, int i)
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
