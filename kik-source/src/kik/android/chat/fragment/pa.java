// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.content.res.Resources;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import java.util.Timer;

// Referenced classes of package kik.android.chat.fragment:
//            KikRegistrationFragment, pb

final class pa
    implements TextWatcher
{

    final KikRegistrationFragment a;

    pa(KikRegistrationFragment kikregistrationfragment)
    {
        a = kikregistrationfragment;
        super();
    }

    public final void afterTextChanged(Editable editable)
    {
        if (editable == null)
        {
            return;
        }
        KikRegistrationFragment.f(a).cancel();
        KikRegistrationFragment.a(a, new Timer("UsernameCheckTimer"));
        if (editable.toString().length() == 0)
        {
            a._usernameField.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
            return;
        }
        if (!editable.toString().matches(a._firstnameField.getResources().getString(0x7f0901ee)))
        {
            a._usernameField.setCompoundDrawablesWithIntrinsicBounds(null, null, KikRegistrationFragment.g(a), null);
            return;
        } else
        {
            editable = new pb(this, editable);
            a._usernameField.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
            KikRegistrationFragment.f(a).schedule(editable, 500L);
            KikRegistrationFragment.h(a);
            return;
        }
    }

    public final void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public final void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }
}
