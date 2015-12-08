// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import kik.a.e.f;

// Referenced classes of package kik.android.chat.fragment:
//            KikLoginFragment

final class md
    implements TextWatcher
{

    final KikLoginFragment a;

    md(KikLoginFragment kikloginfragment)
    {
        a = kikloginfragment;
        super();
    }

    public final void afterTextChanged(Editable editable)
    {
    }

    public final void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        if (KikLoginFragment.a(a).length() == 0 && KikLoginFragment.b(a).length() == 0)
        {
            a.e.o();
        }
    }

    public final void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }
}
