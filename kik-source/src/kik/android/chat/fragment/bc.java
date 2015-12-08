// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

// Referenced classes of package kik.android.chat.fragment:
//            KikAddContactFragment

final class bc
    implements TextWatcher
{

    final KikAddContactFragment a;

    bc(KikAddContactFragment kikaddcontactfragment)
    {
        a = kikaddcontactfragment;
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
        charsequence = KikAddContactFragment.a(a).getText().toString().trim();
        KikAddContactFragment.a(a, charsequence);
    }
}
