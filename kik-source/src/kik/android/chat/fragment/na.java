// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

// Referenced classes of package kik.android.chat.fragment:
//            KikMultiselectContactsListFragment

final class na
    implements TextWatcher
{

    final KikMultiselectContactsListFragment a;

    na(KikMultiselectContactsListFragment kikmultiselectcontactslistfragment)
    {
        a = kikmultiselectcontactslistfragment;
        super();
    }

    public final void afterTextChanged(Editable editable)
    {
    }

    public final void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public final void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        if (!KikMultiselectContactsListFragment.a(a)) goto _L2; else goto _L1
_L1:
        KikMultiselectContactsListFragment.b(a);
_L4:
        a.A = false;
        return;
_L2:
        if (!a.A)
        {
            a.d(a.s.getText().toString().trim());
            a.a(a.b, true);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
