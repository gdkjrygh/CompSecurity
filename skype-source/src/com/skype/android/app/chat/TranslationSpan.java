// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.text.SpannableStringBuilder;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import com.skype.android.res.ChatText;
import com.skype.android.widget.TranslationClickableSpan;

public class TranslationSpan
{

    private static final String TRANSLATION_NEW_LINE = "\r\n";
    private static final float TRANSLATION_TEXT_RELATIVE_SIZE = 0.8F;
    int spanLength;
    String translation;

    private TranslationSpan()
    {
        spanLength = 0;
        translation = "";
    }

    private TranslationSpan(String s)
    {
        spanLength = 0;
        translation = s;
    }

    private CharSequence attachTranslationSpan(ChatText chattext, CharSequence charsequence)
    {
        charsequence = new SpannableStringBuilder(charsequence);
        detachTranslationSpans(charsequence);
        chattext = chattext.a(translation, Integer.valueOf(0));
        int i = charsequence.length();
        charsequence.append("\r\n");
        spanLength = spanLength + 2;
        charsequence.append(chattext);
        spanLength = spanLength + chattext.length();
        int j = charsequence.length();
        charsequence.setSpan(this, i, j, 0);
        charsequence.setSpan(new StyleSpan(2), i, j, 0);
        charsequence.setSpan(new RelativeSizeSpan(0.8F), i, j, 0);
        return charsequence;
    }

    public static CharSequence attachTranslationSpan(ChatText chattext, CharSequence charsequence, String s)
    {
        return (new TranslationSpan(s)).attachTranslationSpan(chattext, charsequence);
    }

    private void detachTranslationSpan(SpannableStringBuilder spannablestringbuilder)
    {
        spannablestringbuilder.removeSpan(this);
        if (spannablestringbuilder.length() - spanLength >= 0)
        {
            spannablestringbuilder.delete(spannablestringbuilder.length() - spanLength, spannablestringbuilder.length());
        }
    }

    private static void detachTranslationSpans(SpannableStringBuilder spannablestringbuilder)
    {
        TranslationClickableSpan.a(spannablestringbuilder);
        TranslationSpan atranslationspan[] = (TranslationSpan[])spannablestringbuilder.getSpans(0, spannablestringbuilder.length(), com/skype/android/app/chat/TranslationSpan);
        if (atranslationspan != null && atranslationspan.length > 0)
        {
            for (int i = 0; i < atranslationspan.length; i++)
            {
                atranslationspan[i].detachTranslationSpan(spannablestringbuilder);
            }

        }
    }
}
