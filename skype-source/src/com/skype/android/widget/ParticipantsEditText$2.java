// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget;

import android.text.Spannable;
import java.util.Comparator;

// Referenced classes of package com.skype.android.widget:
//            ParticipantsEditText, ContactSpan

final class a
    implements Comparator
{

    final Spannable a;
    final ParticipantsEditText b;

    public final int compare(Object obj, Object obj1)
    {
        obj = (ContactSpan)obj;
        obj1 = (ContactSpan)obj1;
        int i = a.getSpanStart(obj);
        int j = a.getSpanStart(obj1);
        if (i < j)
        {
            return -1;
        }
        return i <= j ? 0 : 1;
    }

    (ParticipantsEditText participantsedittext, Spannable spannable)
    {
        b = participantsedittext;
        a = spannable;
        super();
    }
}
