// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.skype.Message;
import com.skype.Sms;
import com.skype.SmsImpl;
import com.skype.android.widget.SymbolView;
import com.skype.android.widget.bubbles.BubbleTextView;

// Referenced classes of package com.skype.android.app.chat:
//            UrlMessageViewBinder, TextMessageViewHolder, MessageHolder, SyntheticTypes, 
//            TextMessageViewAdapter, UrlPreviewTextMessageViewHolder

public class SimpleMessageViewBinder
    implements UrlMessageViewBinder
{

    public SimpleMessageViewBinder()
    {
    }

    private void alignTextAndIcon(Resources resources, TextMessageViewHolder textmessageviewholder, boolean flag, boolean flag1, boolean flag2)
    {
        android.widget.RelativeLayout.LayoutParams layoutparams2 = (android.widget.RelativeLayout.LayoutParams)textmessageviewholder.messageContainer.getLayoutParams();
        android.widget.RelativeLayout.LayoutParams layoutparams = (android.widget.RelativeLayout.LayoutParams)textmessageviewholder.textView.getLayoutParams();
        android.widget.RelativeLayout.LayoutParams layoutparams1 = (android.widget.RelativeLayout.LayoutParams)textmessageviewholder.symbolView.getLayoutParams();
        int i;
        if (flag1)
        {
            com.skype.android.widget.bubbles.Bubblable.Direction direction = com.skype.android.widget.bubbles.Bubblable.Direction.b;
            layoutparams2.setMargins(resources.getDimensionPixelSize(0x7f0c007a), 0, 0, 0);
            layoutparams.addRule(1, textmessageviewholder.symbolView.getId());
            layoutparams.addRule(0, 0);
            layoutparams1.addRule(9);
            layoutparams1.addRule(11, 0);
            resources = direction;
        } else
        {
            com.skype.android.widget.bubbles.Bubblable.Direction direction1 = com.skype.android.widget.bubbles.Bubblable.Direction.a;
            layoutparams2.setMargins(0, 0, resources.getDimensionPixelSize(0x7f0c007a), 0);
            layoutparams.addRule(0, textmessageviewholder.symbolView.getId());
            layoutparams.addRule(1, 0);
            layoutparams1.addRule(11);
            layoutparams1.addRule(9, 0);
            resources = direction1;
        }
        i = getMessageLayoutGravity(flag1);
        textmessageviewholder.messageContainer.setGravity(i);
        textmessageviewholder.symbolView.setLayoutParams(layoutparams1);
        textmessageviewholder.textView.setLayoutParams(layoutparams);
        if (flag2)
        {
            resources = com.skype.android.widget.bubbles.Bubblable.Direction.c;
        }
        textmessageviewholder.textView.setDirectionState(resources, flag);
        textmessageviewholder.getInlineContent().requestLayout();
    }

    private com.skype.Sms.STATUS getSmsStatus(Message message)
    {
        SmsImpl smsimpl = new SmsImpl();
        if (message.getSMS(smsimpl))
        {
            return smsimpl.getStatusProp();
        } else
        {
            return null;
        }
    }

    private com.skype.android.widget.SymbolElement.SymbolCode getSymbol(MessageHolder messageholder)
    {
        if (messageholder.getTypeOrdinal() != SyntheticTypes.PUSH.getType())
        {
            messageholder = (Message)messageholder.getMessageObject();
            if (messageholder.getTypeProp() == com.skype.Message.TYPE.POSTED_SMS)
            {
                if (getSmsStatus(messageholder) == com.skype.Sms.STATUS.FAILED)
                {
                    return com.skype.android.widget.SymbolElement.SymbolCode.dr;
                } else
                {
                    return com.skype.android.widget.SymbolElement.SymbolCode.aL;
                }
            }
            if (messageholder.getEditTimestampProp() > 0 && !TextUtils.isEmpty(messageholder.getBodyXmlProp()))
            {
                return com.skype.android.widget.SymbolElement.SymbolCode.bU;
            }
        }
        return com.skype.android.widget.SymbolElement.SymbolCode.a;
    }

    private boolean isPending(MessageHolder messageholder)
    {
        if (messageholder.getTypeOrdinal() != SyntheticTypes.PUSH.getType())
        {
            return ((Message)messageholder.getMessageObject()).getSendingStatusProp() == com.skype.Message.SENDING_STATUS.SENDING;
        } else
        {
            return false;
        }
    }

    private void setOnItemLongClickListener(View view, TextView textview, boolean flag, boolean flag1, int i, MessageHolder messageholder, TextMessageViewAdapter textmessageviewadapter)
    {
label0:
        {
            if (messageholder.getMessageObject() instanceof Message)
            {
                messageholder = (Message)messageholder.getMessageObject();
                if (!flag)
                {
                    break label0;
                }
                textmessageviewadapter.setOnItemLongClickListener(messageholder, view, i, false, false);
                if (textview.isClickable())
                {
                    textmessageviewadapter.setOnItemLongClickListener(messageholder, textview, i, false, false);
                }
            }
            return;
        }
        textmessageviewadapter.setOnItemLongClickListener(messageholder, textview, i, flag1, false);
    }

    private void setSymbol(UrlMessageViewBinder.ViewBinderParams viewbinderparams, SymbolView symbolview, com.skype.android.widget.SymbolElement.SymbolCode symbolcode)
    {
        int i = 0x7f0f0122;
        if (symbolcode == com.skype.android.widget.SymbolElement.SymbolCode.dr)
        {
            i = 0x7f0f011c;
        }
        symbolview.setSymbolCode(symbolcode);
        symbolview.setTextColor(viewbinderparams.getContext().getResources().getColor(i));
    }

    public void bindView(UrlMessageViewBinder.ViewBinderParams viewbinderparams)
    {
        TextMessageViewHolder textmessageviewholder = (TextMessageViewHolder)viewbinderparams.getSubtypeViewHolder();
        UrlPreviewTextMessageViewHolder urlpreviewtextmessageviewholder = textmessageviewholder.getUrlPreviewTextMessageViewHolder();
        boolean flag1 = viewbinderparams.isLargeEmoticonMessage();
        textmessageviewholder.textView.setOnClickListener(null);
        textmessageviewholder.textView.setOnLongClickListener(null);
        textmessageviewholder.textView.setClickable(false);
        textmessageviewholder.textView.setLongClickable(false);
        Object obj = getSymbol(viewbinderparams.getMessageHolder());
        setSymbol(viewbinderparams, textmessageviewholder.symbolView, ((com.skype.android.widget.SymbolElement.SymbolCode) (obj)));
        obj = textmessageviewholder.textView;
        boolean flag;
        if (viewbinderparams.showPendingStateAsTextStyle() && isPending(viewbinderparams.getMessageHolder()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((BubbleTextView) (obj)).setSelected(flag);
        alignTextAndIcon(viewbinderparams.getContext().getResources(), textmessageviewholder, urlpreviewtextmessageviewholder.isChained(), urlpreviewtextmessageviewholder.isOutgoing(), flag1);
        flag = viewbinderparams.isInAccessibilityMode();
        configureTextView(viewbinderparams.getContext(), textmessageviewholder.getItemView(), textmessageviewholder.textView, textmessageviewholder.getInlineContent(), flag, viewbinderparams.isUrl(), textmessageviewholder.getLayoutPosition(), viewbinderparams.getMessageHolder(), viewbinderparams.getTextMessageViewAdapter());
    }

    protected void configureTextView(Context context, View view, TextView textview, View view1, boolean flag, boolean flag1, int i, 
            MessageHolder messageholder, TextMessageViewAdapter textmessageviewadapter)
    {
        if (flag)
        {
            StringBuilder stringbuilder = new StringBuilder();
            if (messageholder.getTypeOrdinal() == com.skype.Message.TYPE.POSTED_SMS.toInt() && getSmsStatus((Message)messageholder.getMessageObject()) == com.skype.Sms.STATUS.FAILED)
            {
                stringbuilder.append(context.getResources().getString(0x7f08027c));
                stringbuilder.append(", ");
            }
            stringbuilder.append(textview.getText());
            view1.setContentDescription(stringbuilder);
        } else
        {
            textmessageviewadapter.enableClickForTimestamp(textview, i);
        }
        setOnItemLongClickListener(view, textview, flag, flag1, i, messageholder, textmessageviewadapter);
    }

    public int getMessageLayoutGravity(boolean flag)
    {
        if (android.os.Build.VERSION.SDK_INT > 16)
        {
            return !flag ? 3 : 5;
        }
        return !flag ? 0x800003 : 0x800005;
    }
}
