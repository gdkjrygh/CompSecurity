// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.inputs;

import android.text.Editable;
import com.google.android.apps.translate.e.c;

// Referenced classes of package com.google.android.apps.translate.inputs:
//            KeyboardHandwritingPopup

final class be extends c
{

    final KeyboardHandwritingPopup a;

    be(KeyboardHandwritingPopup keyboardhandwritingpopup)
    {
        a = keyboardhandwritingpopup;
        super();
    }

    public final void afterTextChanged(Editable editable)
    {
        KeyboardHandwritingPopup.f(a);
    }
}
