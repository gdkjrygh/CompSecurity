// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget;

import android.text.Editable;
import android.text.TextWatcher;
import com.skype.android.app.contacts.ContactSearchAdapter;
import java.util.HashSet;

// Referenced classes of package com.skype.android.widget:
//            ParticipantsEditText, ContactSpan

private final class <init>
    implements TextWatcher
{

    final ParticipantsEditText a;

    public final void afterTextChanged(Editable editable)
    {
        if (editable == null || editable.toString().trim().isEmpty())
        {
            Editable editable1 = a.getText();
            ContactSpan acontactspan[] = (ContactSpan[])editable1.getSpans(0, a.getText().length(), com/skype/android/widget/ContactSpan);
            int j = acontactspan.length;
            for (int i = 0; i < j; i++)
            {
                editable1.removeSpan(acontactspan[i]);
            }

            if (ParticipantsEditText.access$200(a).size() > 0)
            {
                ParticipantsEditText.access$200(a).clear();
                ParticipantsEditText.access$300(a).setCurrentParticipants(a.getContacts());
            }
            if (editable != null && editable.length() > 0)
            {
                editable.clear();
            }
        }
        ParticipantsEditText.access$400(a);
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
        if (ParticipantsEditText.access$500(a) == null) goto _L4; else goto _L3
_L3:
        charsequence = ParticipantsEditText.access$500(a);
        i = 1;
_L10:
        if (charsequence == null) goto _L6; else goto _L5
_L5:
        Object obj;
        int l;
        obj = a.getText();
        l = ParticipantsEditText.access$600(a, charsequence);
        k = ParticipantsEditText.access$700(a, charsequence);
        if (k != l) goto _L7; else goto _L6
_L6:
        return;
_L4:
        i = a.getSelectionStart();
        obj = (ContactSpan[])a.getText().getSpans(i, i, com/skype/android/widget/ContactSpan);
        i = j;
        if (obj.length > 0)
        {
            charsequence = obj[0];
            i = j;
        }
        continue; /* Loop/switch isn't completed */
_L7:
        j = k;
        if (k > ((Editable) (obj)).length())
        {
            j = ((Editable) (obj)).length();
        }
        a.removeSpan(((Editable) (obj)), charsequence, l, j);
        if (i == 0) goto _L6; else goto _L8
_L8:
        ParticipantsEditText.access$400(a);
        ((Editable) (obj)).append(" ");
        return;
_L2:
        ParticipantsEditText.access$800(a);
        return;
        if (true) goto _L10; else goto _L9
_L9:
    }

    private ter(ParticipantsEditText participantsedittext)
    {
        a = participantsedittext;
        super();
    }

    a(ParticipantsEditText participantsedittext, byte byte0)
    {
        this(participantsedittext);
    }
}
