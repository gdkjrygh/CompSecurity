// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.TextView;
import com.skype.Message;
import com.skype.Translator;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.LogAttributeName;
import com.skype.android.analytics.LogEvent;
import com.skype.android.analytics.SkypeTelemetryEvent;
import com.skype.android.app.chat.ChatMessageUtils;
import com.skype.android.app.chat.MessageHolder;
import com.skype.android.app.chat.OnTranslateMessage;
import com.skype.android.app.chat.SubtypeViewHolder;
import com.skype.android.app.chat.UrlPreviewTextMessageViewHolder;
import com.skype.android.event.EventBus;
import com.skype.android.event.EventBusInstance;
import com.skype.android.util.cache.FormattedMessageCache;
import java.util.Locale;

public class TranslationClickableSpan extends ClickableSpan
{

    Context a;
    FormattedMessageCache b;
    Analytics c;
    MessageHolder d;
    UrlPreviewTextMessageViewHolder e;
    boolean f;
    boolean g;
    String h;

    private TranslationClickableSpan()
    {
        f = false;
        g = true;
    }

    private TranslationClickableSpan(Context context, FormattedMessageCache formattedmessagecache, Analytics analytics, MessageHolder messageholder, UrlPreviewTextMessageViewHolder urlpreviewtextmessageviewholder, boolean flag)
    {
        f = false;
        g = true;
        a = context;
        b = formattedmessagecache;
        c = analytics;
        d = messageholder;
        e = urlpreviewtextmessageviewholder;
        f = flag;
    }

    private static CharSequence a(Context context, FormattedMessageCache formattedmessagecache, Analytics analytics, MessageHolder messageholder, CharSequence charsequence, UrlPreviewTextMessageViewHolder urlpreviewtextmessageviewholder, boolean flag)
    {
        Object obj;
label0:
        {
            obj = (SpannableStringBuilder)charsequence;
            TranslationClickableSpan atranslationclickablespan[] = (TranslationClickableSpan[])((SpannableStringBuilder) (obj)).getSpans(0, ((SpannableStringBuilder) (obj)).length(), com/skype/android/widget/TranslationClickableSpan);
            if (atranslationclickablespan != null)
            {
                obj = charsequence;
                if (atranslationclickablespan.length != 0)
                {
                    break label0;
                }
            }
            obj = (new TranslationClickableSpan(context, formattedmessagecache, analytics, messageholder, urlpreviewtextmessageviewholder, flag)).b(charsequence);
        }
        return ((CharSequence) (obj));
    }

    public static CharSequence a(Context context, FormattedMessageCache formattedmessagecache, Analytics analytics, MessageHolder messageholder, CharSequence charsequence, com.skype.android.util.ConversationUtil.TranslatorSetting translatorsetting, Translator translator, UrlPreviewTextMessageViewHolder urlpreviewtextmessageviewholder)
    {
        Object obj = messageholder.getMessageObject();
        CharSequence charsequence1 = charsequence;
        if (charsequence instanceof SpannableStringBuilder)
        {
            charsequence1 = charsequence;
            if (charsequence.length() > 0)
            {
                charsequence1 = charsequence;
                if (!ChatMessageUtils.allSpansAreEmoticons(charsequence))
                {
                    charsequence1 = charsequence;
                    if (obj instanceof Message)
                    {
                        charsequence1 = charsequence;
                        if (!((Message)obj).getBodyXmlProp().isEmpty())
                        {
                            if (FormattedMessageCache.f((Message)obj))
                            {
                                charsequence1 = a(context, formattedmessagecache, analytics, messageholder, charsequence, urlpreviewtextmessageviewholder, false);
                            } else
                            {
                                charsequence1 = charsequence;
                                if (!formattedmessagecache.g((Message)obj))
                                {
                                    com.skype.Translator.DetectTextLanguage_Result detecttextlanguage_result = translator.detectTextLanguage(charsequence.toString());
                                    charsequence1 = charsequence;
                                    if (detecttextlanguage_result.m_return)
                                    {
                                        charsequence1 = charsequence;
                                        if (detecttextlanguage_result.m_detectedLanguage.length() >= 2)
                                        {
                                            translator = translatorsetting.b;
                                            translatorsetting = translator;
                                            if (TextUtils.isEmpty(translator))
                                            {
                                                translatorsetting = Locale.getDefault().getLanguage();
                                            }
                                            charsequence1 = charsequence;
                                            if (translatorsetting.length() >= 2)
                                            {
                                                charsequence1 = charsequence;
                                                if (!translatorsetting.substring(0, 2).equalsIgnoreCase(detecttextlanguage_result.m_detectedLanguage.substring(0, 2)))
                                                {
                                                    return a(context, formattedmessagecache, analytics, messageholder, charsequence, urlpreviewtextmessageviewholder, true);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return charsequence1;
    }

    public static void a(CharSequence charsequence)
    {
        if (charsequence instanceof SpannableStringBuilder)
        {
            charsequence = (SpannableStringBuilder)charsequence;
            TranslationClickableSpan atranslationclickablespan[] = (TranslationClickableSpan[])charsequence.getSpans(0, charsequence.length(), com/skype/android/widget/TranslationClickableSpan);
            if (atranslationclickablespan != null && atranslationclickablespan.length > 0)
            {
                for (int i = 0; i < atranslationclickablespan.length; i++)
                {
                    TranslationClickableSpan translationclickablespan = atranslationclickablespan[i];
                    charsequence.removeSpan(translationclickablespan);
                    if (charsequence.length() - translationclickablespan.h.length() >= 0)
                    {
                        charsequence.delete(charsequence.length() - translationclickablespan.h.length(), charsequence.length());
                    }
                }

            }
        }
    }

    private CharSequence b(CharSequence charsequence)
    {
        SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder(charsequence);
        charsequence = (Message)d.getMessageObject();
        int i;
        int j;
        if (f)
        {
            charsequence = a.getString(0x7f08019b);
        } else
        if (b.g(charsequence) && g || !b.g(charsequence) && !g)
        {
            charsequence = a.getString(0x7f08033e);
        } else
        {
            charsequence = a.getString(0x7f08033d);
        }
        i = spannablestringbuilder.length();
        h = (new StringBuilder("\r\n")).append(charsequence).toString();
        spannablestringbuilder.append(h);
        j = spannablestringbuilder.length();
        spannablestringbuilder.setSpan(this, i, j, 0);
        spannablestringbuilder.setSpan(new StyleSpan(2), i, j, 0);
        spannablestringbuilder.setSpan(new RelativeSizeSpan(0.8F), i, j, 0);
        return spannablestringbuilder;
    }

    public void onClick(View view)
    {
        if (f && (d.getMessageObject() instanceof Message))
        {
            int i = e.getSubTypeHolder(a).getLayoutPosition();
            view = new OnTranslateMessage((Message)d.getMessageObject(), i);
            EventBusInstance.a().a(view);
            view = (Message)d.getMessageObject();
            SkypeTelemetryEvent skypetelemetryevent = new SkypeTelemetryEvent(LogEvent.al);
            skypetelemetryevent.put(LogAttributeName.l, Integer.valueOf(view.getObjectID()));
            c.a(skypetelemetryevent);
        } else
        if ((view instanceof TextView) && (d.getMessageObject() instanceof Message))
        {
label0:
            {
                TextView textview = (TextView)view;
                Object obj = (Message)d.getMessageObject();
                SkypeTelemetryEvent skypetelemetryevent1 = new SkypeTelemetryEvent(LogEvent.ao);
                skypetelemetryevent1.put(LogAttributeName.l, Integer.valueOf(((Message) (obj)).getObjectID()));
                LogAttributeName logattributename = LogAttributeName.i;
                TranslationClickableSpan atranslationclickablespan[];
                boolean flag;
                if (b.g(((Message) (obj))))
                {
                    view = LogAttributeName.k;
                } else
                {
                    view = LogAttributeName.m;
                }
                skypetelemetryevent1.put(logattributename, view);
                c.a(skypetelemetryevent1);
                if (g)
                {
                    if (b.g(((Message) (obj))))
                    {
                        view = b.d(((Message) (obj)));
                    } else
                    {
                        view = b.b(((Message) (obj)));
                    }
                } else
                {
                    view = b.a(((Message) (obj)));
                }
                obj = view;
                if (!(view instanceof SpannableStringBuilder))
                {
                    break label0;
                }
                obj = (SpannableStringBuilder)view;
                atranslationclickablespan = (TranslationClickableSpan[])((SpannableStringBuilder) (obj)).getSpans(0, ((SpannableStringBuilder) (obj)).length(), com/skype/android/widget/TranslationClickableSpan);
                if (atranslationclickablespan != null)
                {
                    obj = view;
                    if (atranslationclickablespan.length != 0)
                    {
                        break label0;
                    }
                }
                obj = new TranslationClickableSpan(a, b, c, d, e, f);
                if (!g)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                obj.g = flag;
                obj = ((TranslationClickableSpan) (obj)).b(view);
            }
            textview.setText(((CharSequence) (obj)));
            return;
        }
    }

    public void updateDrawState(TextPaint textpaint)
    {
        super.updateDrawState(textpaint);
        textpaint.setUnderlineText(false);
    }
}
