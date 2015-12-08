// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget;

import android.text.Editable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;

// Referenced classes of package com.skype.android.widget:
//            ParticipantsEditText, ContactSpan

private final class <init>
    implements android.widget.ew.Tokenizer
{

    final ParticipantsEditText a;

    public final int findTokenEnd(CharSequence charsequence, int i)
    {
        int k = charsequence.length();
        do
        {
label0:
            {
                int j = k;
                if (i < k)
                {
                    if (charsequence.charAt(i) != ' ')
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

    public final int findTokenStart(CharSequence charsequence, int i)
    {
        boolean flag = false;
        charsequence = (ContactSpan[])a.getText().getSpans(0, a.getText().length(), com/skype/android/widget/ContactSpan);
        i = ((flag) ? 1 : 0);
        if (charsequence != null)
        {
            i = ((flag) ? 1 : 0);
            if (charsequence.length > 0)
            {
                charsequence = charsequence[charsequence.length - 1];
                i = a.getText().getSpanEnd(charsequence) + 1;
            }
        }
        return i;
    }

    public final CharSequence terminateToken(CharSequence charsequence)
    {
        int i = charsequence.length();
        if (i > 0 && charsequence.charAt(i - 1) == ' ')
        {
            return charsequence;
        }
        if (charsequence instanceof Spanned)
        {
            SpannableString spannablestring = new SpannableString((new StringBuilder()).append(charsequence).append(" ").toString());
            TextUtils.copySpansFrom((Spanned)charsequence, 0, charsequence.length(), java/lang/Object, spannablestring, 0);
            return spannablestring;
        } else
        {
            return (new StringBuilder()).append(charsequence).append(" ").toString();
        }
    }

    private er(ParticipantsEditText participantsedittext)
    {
        a = participantsedittext;
        super();
    }

    a(ParticipantsEditText participantsedittext, byte byte0)
    {
        this(participantsedittext);
    }
}
