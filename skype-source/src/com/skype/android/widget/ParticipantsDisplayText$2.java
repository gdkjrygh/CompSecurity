// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget;

import android.text.SpannableStringBuilder;
import java.util.Comparator;

// Referenced classes of package com.skype.android.widget:
//            ParticipantsDisplayText, ParticipantSpan

final class a
    implements Comparator
{

    final ParticipantsDisplayText a;

    public final int compare(Object obj, Object obj1)
    {
        obj = (ParticipantSpan)obj;
        obj1 = (ParticipantSpan)obj1;
        int i = ParticipantsDisplayText.a(a).getSpanStart(obj);
        int j = ParticipantsDisplayText.a(a).getSpanStart(obj1);
        if (i < j)
        {
            return -1;
        }
        return i <= j ? 0 : 1;
    }

    (ParticipantsDisplayText participantsdisplaytext)
    {
        a = participantsdisplaytext;
        super();
    }
}
