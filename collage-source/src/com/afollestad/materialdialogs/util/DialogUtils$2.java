// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.afollestad.materialdialogs.util;

import android.content.Context;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.afollestad.materialdialogs.f;

// Referenced classes of package com.afollestad.materialdialogs.util:
//            a

static final class b
    implements Runnable
{

    final f a;
    final com.afollestad.materialdialogs.ls._cls2.a b;

    public void run()
    {
        a.f().requestFocus();
        InputMethodManager inputmethodmanager = (InputMethodManager)b.b().getSystemService("input_method");
        if (inputmethodmanager != null)
        {
            inputmethodmanager.hideSoftInputFromWindow(a.f().getWindowToken(), 0);
        }
    }

    (f f1, com.afollestad.materialdialogs.ls._cls2 _pcls2)
    {
        a = f1;
        b = _pcls2;
        super();
    }
}
