// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.URLSpan;
import com.skype.android.app.settings.UserPreferences;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.mediacontent.EmoticonSize;
import com.skype.android.mediacontent.EmoticonSpan;

public class ChatMessageUtils
{

    private static final int MAX_LARGE_EMOTICONS = 3;

    public ChatMessageUtils()
    {
    }

    public static boolean allSpansAreEmoticons(CharSequence charsequence)
    {
        if (charsequence instanceof SpannableStringBuilder)
        {
            charsequence = (SpannableStringBuilder)charsequence;
            EmoticonSpan aemoticonspan[] = (EmoticonSpan[])charsequence.getSpans(0, charsequence.length(), com/skype/android/mediacontent/EmoticonSpan);
            if (aemoticonspan != null && aemoticonspan.length != 0 && aemoticonspan.length <= 3)
            {
                int j = 0;
                int i = 0;
                do
                {
                    if (i >= aemoticonspan.length)
                    {
                        break;
                    }
                    EmoticonSpan emoticonspan = aemoticonspan[i];
                    if (emoticonspan.b() == null)
                    {
                        break;
                    }
                    int l = charsequence.getSpanStart(emoticonspan);
                    int k = charsequence.getSpanEnd(emoticonspan);
                    if (i > 0 && l > j + 1 || i == 0 && l != 0)
                    {
                        break;
                    }
                    j = k;
                    i++;
                } while (true);
                if (i == aemoticonspan.length && j == charsequence.toString().trim().length())
                {
                    return true;
                }
            }
        }
        return false;
    }

    public static CharSequence getLargeEmoticonSpan(CharSequence charsequence, UserPreferences userpreferences)
    {
        Object obj = charsequence;
        if (charsequence instanceof SpannableStringBuilder)
        {
            obj = new SpannableStringBuilder(charsequence);
            charsequence = (EmoticonSpan[])((SpannableStringBuilder) (obj)).getSpans(0, ((SpannableStringBuilder) (obj)).length(), com/skype/android/mediacontent/EmoticonSpan);
            boolean flag = userpreferences.getShowAnimatedEmoticons();
            int j = charsequence.length;
            for (int i = 0; i < j; i++)
            {
                userpreferences = charsequence[i];
                int k = ((SpannableStringBuilder) (obj)).getSpanStart(userpreferences);
                int l = ((SpannableStringBuilder) (obj)).getSpanEnd(userpreferences);
                ((SpannableStringBuilder) (obj)).removeSpan(userpreferences);
                ((SpannableStringBuilder) (obj)).setSpan(new EmoticonSpan(userpreferences.b(), EmoticonSize.c, flag), k, l, 33);
            }

        }
        return ((CharSequence) (obj));
    }

    public static String getSpanUrl(CharSequence charsequence)
    {
        if (charsequence instanceof Spanned)
        {
            charsequence = (Spanned)charsequence;
            charsequence = (URLSpan[])charsequence.getSpans(0, charsequence.length(), android/text/style/URLSpan);
            if (charsequence.length > 0)
            {
                return charsequence[0].getURL();
            }
        }
        return null;
    }

    public static boolean isSingleUrlSpanMessage(CharSequence charsequence)
    {
        Spanned spanned;
        int i;
        int j;
        if (charsequence instanceof Spanned)
        {
            spanned = (Spanned)charsequence;
            URLSpan aurlspan[] = (URLSpan[])spanned.getSpans(0, spanned.length(), android/text/style/URLSpan);
            if (aurlspan.length == 1)
            {
                i = spanned.getSpanStart(aurlspan[0]);
                j = spanned.getSpanEnd(aurlspan[0]);
                break MISSING_BLOCK_LABEL_58;
            }
        }
        do
        {
            return false;
        } while (i != 0 && !TextUtils.isEmpty(spanned.subSequence(0, i).toString().trim()) || j < charsequence.length() && !TextUtils.isEmpty(spanned.subSequence(j, charsequence.length()).toString().trim()));
        return true;
    }

    public static boolean shouldShowBigEmoticons(EcsConfiguration ecsconfiguration, UserPreferences userpreferences)
    {
        return ecsconfiguration.getCloudEmoticonsEnabled() && userpreferences.getShowBigEmoticons();
    }

    public static CharSequence trim(CharSequence charsequence)
    {
        SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder(charsequence);
        int j = TextUtils.getTrimmedLength(charsequence);
        int i = 0;
        if (j == 0)
        {
            return charsequence;
        }
        for (; spannablestringbuilder.charAt(i) <= ' '; i++) { }
        return spannablestringbuilder.subSequence(i, j + i);
    }
}
