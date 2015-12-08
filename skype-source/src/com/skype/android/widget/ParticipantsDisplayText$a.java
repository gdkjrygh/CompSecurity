// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import java.util.HashSet;

// Referenced classes of package com.skype.android.widget:
//            ParticipantsDisplayText, ParticipantSpan

private final class <init>
    implements TextWatcher
{

    final ParticipantsDisplayText a;

    public final void afterTextChanged(Editable editable)
    {
        if (editable == null || editable.toString().trim().isEmpty())
        {
            ParticipantSpan aparticipantspan[] = (ParticipantSpan[])ParticipantsDisplayText.a(a).getSpans(0, ParticipantsDisplayText.a(a).length(), com/skype/android/widget/ParticipantSpan);
            int j = aparticipantspan.length;
            for (int i = 0; i < j; i++)
            {
                ParticipantSpan participantspan = aparticipantspan[i];
                ParticipantsDisplayText.a(a).removeSpan(participantspan);
            }

            if (ParticipantsDisplayText.b(a).size() > 0)
            {
                ParticipantsDisplayText.b(a).clear();
            }
            if (editable != null && editable.length() > 0)
            {
                editable.clear();
            }
        }
        ParticipantsDisplayText.c(a);
    }

    public final void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public final void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        if (j <= k) goto _L2; else goto _L1
_L1:
        j = 0;
        charsequence = null;
        if (ParticipantsDisplayText.d(a) == null) goto _L4; else goto _L3
_L3:
        charsequence = ParticipantsDisplayText.d(a);
        i = 1;
_L9:
        if (charsequence == null) goto _L2; else goto _L5
_L5:
        int l;
        l = ParticipantsDisplayText.a(a, charsequence);
        k = ParticipantsDisplayText.b(a, charsequence);
        if (k != l) goto _L6; else goto _L2
_L2:
        return;
_L4:
        i = a.getSelectionStart();
        ParticipantSpan aparticipantspan[] = (ParticipantSpan[])ParticipantsDisplayText.a(a).getSpans(i, i, com/skype/android/widget/ParticipantSpan);
        i = j;
        if (aparticipantspan.length > 0)
        {
            charsequence = aparticipantspan[0];
            i = j;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        j = k;
        if (k > ParticipantsDisplayText.a(a).length())
        {
            j = ParticipantsDisplayText.a(a).length();
        }
        ParticipantsDisplayText.a(a, ParticipantsDisplayText.a(a), charsequence, l, j);
        if (i == 0) goto _L2; else goto _L7
_L7:
        ParticipantsDisplayText.c(a);
        ParticipantsDisplayText.a(a).append(" ");
        return;
        if (true) goto _L9; else goto _L8
_L8:
    }

    private (ParticipantsDisplayText participantsdisplaytext)
    {
        a = participantsdisplaytext;
        super();
    }

    a(ParticipantsDisplayText participantsdisplaytext, byte byte0)
    {
        this(participantsdisplaytext);
    }
}
