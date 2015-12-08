// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.copydrop.views;

import android.text.Editable;
import android.text.TextWatcher;

// Referenced classes of package com.google.android.apps.translate.copydrop.views:
//            TranslationEditTextView

final class h
    implements TextWatcher
{

    final TranslationEditTextView a;

    h(TranslationEditTextView translationedittextview)
    {
        a = translationedittextview;
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
        if (TranslationEditTextView.b(a))
        {
            com.google.android.libraries.translate.e.h.a(254);
            TranslationEditTextView.c(a);
            a.c();
        }
        if (charsequence.length() > 0)
        {
            TranslationEditTextView.a(a, charsequence);
        }
    }
}
