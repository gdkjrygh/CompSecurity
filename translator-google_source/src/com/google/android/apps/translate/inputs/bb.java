// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.inputs;

import android.text.TextUtils;
import android.widget.RelativeLayout;
import com.google.android.apps.translate.e.c;

// Referenced classes of package com.google.android.apps.translate.inputs:
//            KeyboardHandwritingPopup

final class bb extends c
{

    final KeyboardHandwritingPopup a;

    bb(KeyboardHandwritingPopup keyboardhandwritingpopup)
    {
        a = keyboardhandwritingpopup;
        super();
    }

    public final void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        if (KeyboardHandwritingPopup.a(a).getVisibility() != 0 && !TextUtils.isEmpty(charsequence))
        {
            KeyboardHandwritingPopup.b(a);
        }
    }
}
