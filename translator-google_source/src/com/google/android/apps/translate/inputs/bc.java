// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.inputs;

import android.widget.Spinner;
import com.google.android.apps.translate.r;

// Referenced classes of package com.google.android.apps.translate.inputs:
//            ao, KeyboardHandwritingPopup

final class bc
    implements Runnable
{

    final ao a;
    final boolean b;
    final KeyboardHandwritingPopup c;

    bc(KeyboardHandwritingPopup keyboardhandwritingpopup, ao ao1, boolean flag)
    {
        c = keyboardhandwritingpopup;
        a = ao1;
        b = flag;
        super();
    }

    public final void run()
    {
        a.a(r.label_phonetic, 0, true);
        KeyboardHandwritingPopup.c(c).setVisibility(0);
        if (KeyboardHandwritingPopup.c(c).getSelectedItemPosition() == 0 && !KeyboardHandwritingPopup.d(c) && b)
        {
            KeyboardHandwritingPopup.c(c).setSelection(a.getCount() - 1);
        }
    }
}
