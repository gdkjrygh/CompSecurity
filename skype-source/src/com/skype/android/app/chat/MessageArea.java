// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.telephony.SmsMessage;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.skype.android.SkypeApplication;
import com.skype.android.app.chat.picker.GlyphImageView;
import com.skype.android.app.settings.UserPreferences;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.mediacontent.EmoticonContent;
import com.skype.android.mediacontent.EmoticonSize;
import com.skype.android.mediacontent.EmoticonSpan;
import com.skype.android.mediacontent.MediaContentRoster;
import com.skype.android.mediacontent.PackInfo;
import com.skype.android.mediacontent.PackInfoUtils;
import com.skype.android.mediacontent.SpannedAnimationDrawableCallback;
import com.skype.android.res.ChatText;
import com.skype.android.util.DeviceFeatures;
import com.skype.android.util.PropertyAnimationUtil;
import com.skype.android.util.ViewUtil;
import com.skype.android.util.accessibility.AccessibilityUtil;
import com.skype.android.widget.BadgeDecoratorView;
import com.skype.android.widget.ChatEditText;
import com.skype.android.widget.SymbolView;
import java.util.List;

// Referenced classes of package com.skype.android.app.chat:
//            DaggerMessageAreaComponent, MessageAreaComponent, SmsTargetsSpinner, MessageAreaCallback, 
//            ChatMessageUtils

public class MessageArea extends LinearLayout
    implements TextWatcher, android.view.View.OnClickListener, android.view.View.OnFocusChangeListener, android.view.View.OnKeyListener, android.widget.AdapterView.OnItemSelectedListener, android.widget.TextView.OnEditorActionListener, com.skype.android.widget.ChatEditText.ChatEditTextCallback
{

    private static final int MAX_SMS_BYTE_COUNT = 612;
    private static final int MAX_SMS_BYTE_COUNT_SMALL = 268;
    private static final String PICKER_PREFERENCES = "picker_preferences";
    private static final String PICKER_PREFERENCES_LAST_TAB_KEY = "picker_preferences_tab";
    AccessibilityUtil accessibility;
    PropertyAnimationUtil animationUtil;
    ChatText chatText;
    private MessageAreaComponent component;
    EcsConfiguration configuration;
    private BadgeDecoratorView emoticonButtonDecoratorView;
    private BadgeDecoratorView emoticonButtonLastOpenedTabDecoratorView;
    private boolean isSmsMode;
    private SymbolView keyboardButton;
    private PackInfo lastPackInfo;
    MediaContentRoster mediaContentRoster;
    private View messageArea;
    private MessageAreaCallback messageAreaCallback;
    private ChatEditText messageText;
    PackInfoUtils packInfoUtils;
    private SharedPreferences pickerPreferences;
    private SymbolView sendButton;
    private View smsBar;
    private TextView smsRateText;
    private SmsTargetsSpinner smsSpinner;
    UserPreferences userPreferences;

    public MessageArea(Context context)
    {
        super(context);
        lastPackInfo = null;
        init();
    }

    public MessageArea(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        lastPackInfo = null;
        init();
    }

    public MessageArea(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        lastPackInfo = null;
        init();
    }

    private MessageAreaComponent getComponent()
    {
        if (component == null)
        {
            component = DaggerMessageAreaComponent.builder().skypeApplicationComponent(((SkypeApplication)getContext().getApplicationContext()).a()).build();
        }
        return component;
    }

    private void init()
    {
        getComponent().inject(this);
        setOrientation(1);
        setDescendantFocusability(0x20000);
        LayoutInflater.from(getContext()).inflate(0x7f0300ae, this);
        messageText = (ChatEditText)ViewUtil.a(this, 0x7f100426);
        messageArea = ViewUtil.a(this, 0x7f100425);
        emoticonButtonLastOpenedTabDecoratorView = (BadgeDecoratorView)ViewUtil.a(this, 0x7f100427);
        emoticonButtonDecoratorView = (BadgeDecoratorView)ViewUtil.a(this, 0x7f100428);
        keyboardButton = (SymbolView)ViewUtil.a(this, 0x7f100429);
        sendButton = (SymbolView)ViewUtil.a(this, 0x7f10042a);
        smsSpinner = (SmsTargetsSpinner)ViewUtil.a(this, 0x7f100424);
        smsRateText = (TextView)ViewUtil.a(this, 0x7f100423);
        smsBar = ViewUtil.a(this, 0x7f100422);
        if (accessibility.a() && messageArea != null)
        {
            accessibility.a(messageArea);
        }
        if (configuration.isPickerContentUpdateEnabled())
        {
            emoticonButtonLastOpenedTabDecoratorView.setBadgeVisible(mediaContentRoster.e());
        } else
        {
            emoticonButtonDecoratorView.setBadgeVisible(mediaContentRoster.e());
        }
        smsSpinner.setOnItemSelectedListener(this);
        messageText.addTextChangedListener(this);
        messageText.setCallback(this);
        messageText.setOnEditorActionListener(this);
        messageText.setOnFocusChangeListener(this);
        messageText.setOnKeyListener(this);
        new SpannedAnimationDrawableCallback(messageText);
        ViewUtil.a(this, new View[] {
            sendButton, emoticonButtonLastOpenedTabDecoratorView, emoticonButtonDecoratorView, keyboardButton
        });
        refreshSendButton();
    }

    private void onClickForDefaultEmoticonOrMojiPicker(int i)
    {
        i;
        JVM INSTR tableswitch 2131756072 2131756074: default 28
    //                   2131756072 29
    //                   2131756073 28
    //                   2131756074 76;
           goto _L1 _L2 _L1 _L3
_L1:
        return;
_L2:
        if (messageAreaCallback != null)
        {
            if (messageAreaCallback.isPickerShowing())
            {
                messageAreaCallback.hidePicker();
                updateEmoticonButtonForHiddenPicker();
                return;
            } else
            {
                messageAreaCallback.showEmoticonPicker();
                updateEmoticonButtonForDisplayedPicker();
                return;
            }
        }
          goto _L1
_L3:
        sendMessage();
        return;
    }

    private void onClickForLastOpenedTabPicker(int i)
    {
        i;
        JVM INSTR tableswitch 2131756071 2131756074: default 32
    //                   2131756071 33
    //                   2131756072 32
    //                   2131756073 54
    //                   2131756074 75;
           goto _L1 _L2 _L1 _L3 _L4
_L1:
        return;
_L2:
        if (messageAreaCallback != null)
        {
            messageAreaCallback.showEmoticonPicker();
            updateEmoticonButtonForDisplayedPicker();
            return;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (messageAreaCallback != null)
        {
            messageAreaCallback.hidePicker();
            updateEmoticonButtonForHiddenPicker();
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
        sendMessage();
        return;
    }

    private void refreshSendButton()
    {
        boolean flag;
        if (messageText.getText().length() > 0 && isEnabled())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        sendButton.setEnabled(flag);
    }

    private void replaceEmoticonSpan(Editable editable, EmoticonSpan emoticonspan, EmoticonSpan emoticonspan1)
    {
        int i = editable.getSpanStart(emoticonspan);
        int j = editable.getSpanEnd(emoticonspan);
        editable.removeSpan(emoticonspan);
        editable.setSpan(emoticonspan1, i, j, 33);
    }

    private void sendMessage()
    {
        if (messageAreaCallback != null)
        {
            messageAreaCallback.sendText(messageText.getText());
        }
    }

    private void setEmoticonButtonGlyph(Bitmap bitmap, PackInfo packinfo, boolean flag)
    {
        if (bitmap != null)
        {
            ((GlyphImageView)emoticonButtonLastOpenedTabDecoratorView.a()).setSource(bitmap);
            if (flag)
            {
                lastPackInfo = packinfo;
            }
            return;
        } else
        {
            ((GlyphImageView)emoticonButtonLastOpenedTabDecoratorView.a()).setSource(0x7f0201cd);
            return;
        }
    }

    private void showSmsBar(boolean flag)
    {
        byte byte0 = 8;
        if (flag && smsBar.getVisibility() == 0 || !flag && smsBar.getVisibility() == 8)
        {
            return;
        }
        Object obj = smsBar;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        ((View) (obj)).setVisibility(i);
        if (configuration.isPickerContentUpdateEnabled())
        {
            obj = emoticonButtonLastOpenedTabDecoratorView;
            if (!flag)
            {
                byte0 = 0;
            }
            ((BadgeDecoratorView) (obj)).setVisibility(byte0);
            return;
        }
        obj = emoticonButtonDecoratorView;
        if (!flag)
        {
            byte0 = 0;
        }
        ((BadgeDecoratorView) (obj)).setVisibility(byte0);
    }

    private void truncateSmsMessageText()
    {
label0:
        {
            int ai[] = SmsMessage.calculateLength(messageText.getText().toString(), false);
            boolean flag;
            int i;
            if (ai[0] < 5)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            i = ai[3];
            if (!flag)
            {
                messageText.removeTextChangedListener(this);
                String s;
                if (i == 3)
                {
                    i = 268;
                } else
                {
                    i = 612;
                }
                messageText.setText(messageText.getText().subSequence(0, i));
                messageText.setSelection(i);
                messageText.addTextChangedListener(this);
            }
            if (accessibility.a())
            {
                if (flag)
                {
                    break label0;
                }
                s = (new StringBuilder()).append(messageText.getContentDescription()).append(", ").append(getContext().getString(0x7f080097)).toString();
                messageText.setContentDescription(s);
                messageText.setIncludeTextInContentDescription(false);
            }
            return;
        }
        messageText.setContentDescription(null);
        messageText.setIncludeTextInContentDescription(true);
    }

    public void afterTextChanged(Editable editable)
    {
        refreshSendButton();
        if (isSmsMode)
        {
            updateSmsInformation();
        }
        messageText.a();
        EmoticonSpan aemoticonspan[] = (EmoticonSpan[])editable.getSpans(0, editable.length(), com/skype/android/mediacontent/EmoticonSpan);
        if (ChatMessageUtils.shouldShowBigEmoticons(configuration, userPreferences) && ChatMessageUtils.allSpansAreEmoticons(editable))
        {
            CharSequence charsequence = ChatMessageUtils.getLargeEmoticonSpan(editable, userPreferences);
            EmoticonSpan aemoticonspan1[] = (EmoticonSpan[])((SpannableStringBuilder)charsequence).getSpans(0, charsequence.length(), com/skype/android/mediacontent/EmoticonSpan);
            for (int i = 0; i < aemoticonspan1.length; i++)
            {
                EmoticonSpan emoticonspan1 = aemoticonspan[i];
                if (emoticonspan1.a() == EmoticonSize.a)
                {
                    replaceEmoticonSpan(editable, emoticonspan1, aemoticonspan1[i]);
                }
            }

        } else
        {
            boolean flag = userPreferences.getShowAnimatedEmoticons();
            int k = aemoticonspan.length;
            for (int j = 0; j < k; j++)
            {
                EmoticonSpan emoticonspan = aemoticonspan[j];
                if (emoticonspan.a() == EmoticonSize.c)
                {
                    replaceEmoticonSpan(editable, emoticonspan, new EmoticonSpan(emoticonspan.b(), EmoticonSize.a, flag));
                }
            }

        }
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void clearCallback()
    {
        messageAreaCallback = null;
    }

    public EditText getEditText()
    {
        return messageText;
    }

    public boolean keyboardDismissed()
    {
        if (messageAreaCallback != null)
        {
            messageAreaCallback.onKeyboardDismissed();
            return true;
        } else
        {
            return false;
        }
    }

    public void onClick(View view)
    {
        if (configuration.isPickerContentUpdateEnabled())
        {
            onClickForLastOpenedTabPicker(view.getId());
            return;
        } else
        {
            onClickForDefaultEmoticonOrMojiPicker(view.getId());
            return;
        }
    }

    public void onDeleteKey()
    {
        messageText.dispatchKeyEvent(new KeyEvent(0, 67));
    }

    public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        if (i == 4)
        {
            if (messageAreaCallback != null)
            {
                messageAreaCallback.sendText(messageText.getText());
            }
            return true;
        } else
        {
            return false;
        }
    }

    public void onEmoticonSelected(EmoticonContent emoticoncontent, ChatText chattext)
    {
        int i = messageText.getSelectionStart();
        emoticoncontent = emoticoncontent.f();
        String s = (new StringBuilder()).append(emoticoncontent).append(" ").toString();
        Editable editable = messageText.getText();
        emoticoncontent = s;
        if (messageText.length() > 0)
        {
            emoticoncontent = s;
            if (!Character.isWhitespace(editable.charAt(messageText.length() - 1)))
            {
                emoticoncontent = (new StringBuilder(" ")).append(s).toString();
            }
        }
        int k = editable.length();
        editable.insert(i, emoticoncontent);
        int j = emoticoncontent.length();
        k = editable.length() - k;
        if (k < j)
        {
            editable.delete(i, i + k);
        } else
        {
            i += j;
        }
        messageText.setSelection(i);
        toggleImageSpan(true, chattext);
    }

    public void onFocusChange(View view, boolean flag)
    {
        if (view == messageText)
        {
            onInputAreaFocus(flag);
        }
    }

    protected void onInputAreaFocus(boolean flag)
    {
        if (messageAreaCallback != null)
        {
            updateEmoticonButtonForHiddenPicker();
            messageAreaCallback.onMessageAreaFocused(flag);
        }
    }

    public void onItemSelected(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = (String)((Pair)adapterview.getSelectedItem()).second;
        refreshSendButton();
        if (messageAreaCallback != null)
        {
            messageAreaCallback.setSmsRecipientPhone(adapterview);
        }
        updateSmsInformation();
    }

    public boolean onKey(View view, int i, KeyEvent keyevent)
    {
        while (!DeviceFeatures.a(getContext()) || keyevent.getAction() != 0 || view.getId() != 0x7f100426) 
        {
            return false;
        }
        switch (i)
        {
        default:
            return false;

        case 66: // 'B'
            sendMessage();
            break;
        }
        return true;
    }

    public void onNothingSelected(AdapterView adapterview)
    {
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        if (messageAreaCallback != null)
        {
            messageAreaCallback.onMessageAreaTextChanged(charsequence);
        }
    }

    public void resumeEditing()
    {
        messageText.requestFocus();
        onInputAreaFocus(true);
    }

    public void setCallback(MessageAreaCallback messageareacallback)
    {
        if (messageareacallback == null)
        {
            throw new RuntimeException("Message area callback cannot be null");
        } else
        {
            messageAreaCallback = messageareacallback;
            updateSmsTargets();
            onInputAreaFocus(false);
            return;
        }
    }

    public void setEnabled(boolean flag)
    {
        boolean flag2 = false;
        boolean flag1 = false;
        super.setEnabled(flag);
        messageText.setEnabled(flag);
        keyboardButton.setEnabled(flag);
        SymbolView symbolview = keyboardButton;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        symbolview.setVisibility(i);
        if (configuration.isPickerContentUpdateEnabled())
        {
            emoticonButtonLastOpenedTabDecoratorView.setEnabled(flag);
            BadgeDecoratorView badgedecoratorview = emoticonButtonLastOpenedTabDecoratorView;
            if (flag)
            {
                i = ((flag1) ? 1 : 0);
            } else
            {
                i = 8;
            }
            badgedecoratorview.setVisibility(i);
        } else
        {
            emoticonButtonDecoratorView.setEnabled(flag);
            BadgeDecoratorView badgedecoratorview1 = emoticonButtonDecoratorView;
            int j;
            if (flag)
            {
                j = ((flag2) ? 1 : 0);
            } else
            {
                j = 8;
            }
            badgedecoratorview1.setVisibility(j);
        }
        refreshSendButton();
    }

    public void setHidden(boolean flag)
    {
        View view = messageArea;
        byte byte0;
        if (flag)
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        view.setVisibility(byte0);
    }

    public void setUiElementsVisible(boolean flag)
    {
        boolean flag2 = false;
        boolean flag1 = false;
        Object obj = sendButton;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 4;
        }
        ((SymbolView) (obj)).setVisibility(i);
        obj = keyboardButton;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 4;
        }
        ((SymbolView) (obj)).setVisibility(i);
        if (configuration.isPickerContentUpdateEnabled())
        {
            obj = emoticonButtonLastOpenedTabDecoratorView;
            if (flag)
            {
                i = ((flag1) ? 1 : 0);
            } else
            {
                i = 4;
            }
            ((BadgeDecoratorView) (obj)).setVisibility(i);
            return;
        }
        obj = emoticonButtonDecoratorView;
        if (flag)
        {
            i = ((flag2) ? 1 : 0);
        } else
        {
            i = 4;
        }
        ((BadgeDecoratorView) (obj)).setVisibility(i);
    }

    public void toggleImageSpan(boolean flag, ChatText chattext)
    {
        int j = messageText.getSelectionStart();
        Editable editable = messageText.getText();
        Object obj = editable;
        if (flag)
        {
            obj = chattext.a(editable.toString(), true);
        }
        messageText.setText(((CharSequence) (obj)));
        int i = j;
        if (j > ((CharSequence) (obj)).length())
        {
            i = ((CharSequence) (obj)).length();
        }
        messageText.setSelection(i);
    }

    public void toggleSmsMode(String s)
    {
        if (messageAreaCallback != null)
        {
            messageAreaCallback.setSmsRecipientPhone(s);
        }
        boolean flag;
        if (!TextUtils.isEmpty(s))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        isSmsMode = flag;
        if (isSmsMode)
        {
            smsSpinner.setSelection(messageAreaCallback.getSelectedSmsTarget());
            messageText.setHint(0x7f0804df);
            updateSmsInformation();
            sendButton.setContentDescription(getResources().getString(0x7f0800c2));
            toggleImageSpan(false, chatText);
        } else
        {
            messageText.setHint(0x7f0804de);
            sendButton.setContentDescription(getResources().getString(0x7f0800c1));
            toggleImageSpan(true, chatText);
        }
        showSmsBar(isSmsMode);
    }

    public void updateEmoticonButtonForDisplayedPicker()
    {
        emoticonButtonLastOpenedTabDecoratorView.setVisibility(8);
        if (configuration.isPickerContentUpdateEnabled())
        {
            keyboardButton.setVisibility(0);
            emoticonButtonDecoratorView.setVisibility(8);
            emoticonButtonLastOpenedTabDecoratorView.setBadgeVisible(false);
            return;
        } else
        {
            keyboardButton.setVisibility(8);
            ((SymbolView)emoticonButtonDecoratorView.a()).setSymbolCode(com.skype.android.widget.SymbolElement.SymbolCode.bC);
            emoticonButtonDecoratorView.setBadgeVisible(false);
            return;
        }
    }

    public void updateEmoticonButtonForHiddenPicker()
    {
        if (configuration.isPickerContentUpdateEnabled())
        {
            emoticonButtonDecoratorView.setVisibility(8);
            keyboardButton.setVisibility(8);
            emoticonButtonLastOpenedTabDecoratorView.setVisibility(0);
            ((GlyphImageView)emoticonButtonLastOpenedTabDecoratorView.a()).setInvertedState(true);
            pickerPreferences = getContext().getSharedPreferences("picker_preferences", 0);
            int i = pickerPreferences.getInt("picker_preferences_tab", -1);
            PackInfo packinfo = mediaContentRoster.a(i);
            if (packinfo != null)
            {
                setEmoticonButtonGlyph(PackInfoUtils.a(packinfo, getContext()), packinfo, true);
            } else
            if (lastPackInfo != null)
            {
                setEmoticonButtonGlyph(PackInfoUtils.a(lastPackInfo, getContext()), lastPackInfo, false);
            } else
            {
                ((GlyphImageView)emoticonButtonLastOpenedTabDecoratorView.a()).setSource(0x7f0201cd);
            }
            emoticonButtonLastOpenedTabDecoratorView.setBadgeVisible(mediaContentRoster.e());
            return;
        }
        keyboardButton.setVisibility(8);
        emoticonButtonLastOpenedTabDecoratorView.setVisibility(8);
        Object obj1 = (SymbolView)emoticonButtonDecoratorView.a();
        Object obj;
        int j;
        if (configuration.isMojiSupported())
        {
            obj = com.skype.android.widget.SymbolElement.SymbolCode.fv;
        } else
        {
            obj = com.skype.android.widget.SymbolElement.SymbolCode.aW;
        }
        ((SymbolView) (obj1)).setSymbolCode(((com.skype.android.widget.SymbolElement.SymbolCode) (obj)));
        obj = emoticonButtonDecoratorView;
        obj1 = getResources();
        if (configuration.isMojiSupported())
        {
            j = 0x7f0c00b5;
        } else
        {
            j = 0x7f0c00b6;
        }
        ((BadgeDecoratorView) (obj)).setBadgeDistanceFromEdgeToCenter(((Resources) (obj1)).getDimensionPixelSize(j));
        emoticonButtonDecoratorView.setBadgeVisible(mediaContentRoster.e());
    }

    public void updateSmsInformation()
    {
        if (smsRateText.getVisibility() != 0)
        {
            return;
        }
        truncateSmsMessageText();
        int ai[] = SmsMessage.calculateLength(messageText.getText().toString(), false);
        int k = ai[0];
        int i = ai[1];
        int j = ai[2];
        int l = ai[3];
        String s;
        String s1;
        boolean flag;
        if (k < 5)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            k = 4;
            j = 0;
            if (l == 3)
            {
                i = 268;
            } else
            {
                i = 612;
            }
        }
        s1 = String.valueOf(j);
        s = s1;
        if (k > 1)
        {
            s = (new StringBuilder()).append(s1).append("/").append(String.valueOf(k)).toString();
        }
        s1 = messageAreaCallback.getSmsPrice();
        if (i == 0 || s1.isEmpty())
        {
            smsRateText.setText(s);
            s = getContext().getResources().getQuantityString(0x7f0b0000, j, new Object[] {
                Integer.valueOf(j)
            });
        } else
        {
            smsRateText.setText((new StringBuilder()).append(s1).append(" | ").append(s).toString());
            char c;
            if (l == 3)
            {
                c = '\u010C';
            } else
            {
                c = '\u0264';
            }
            if (i >= c)
            {
                s = getContext().getString(0x7f080097);
            } else
            {
                s = getContext().getResources().getQuantityString(0x7f0b0000, j, new Object[] {
                    Integer.valueOf(j)
                });
            }
            s = getContext().getString(0x7f0800cb, new Object[] {
                s1, s
            });
        }
        smsRateText.setContentDescription(s);
    }

    public void updateSmsTargets()
    {
        int j = smsSpinner.getSelectedItemPosition();
        List list = messageAreaCallback.getAvailableSmsTargets();
        if (list.size() > 0)
        {
            smsSpinner.setAdapter(list);
            int k = messageAreaCallback.getSelectedSmsTarget();
            int i = j;
            if (k < j)
            {
                i = k;
            }
            smsSpinner.setSelection(i);
        }
    }
}
