// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.RadioGroup;

// Referenced classes of package com.pandora.android.activity:
//            SignUpActivity

class a
    implements android.view.eListener
{

    final SignUpActivity a;

    public void onFocusChange(View view, boolean flag)
    {
        if (flag)
        {
            ((InputMethodManager)a.getSystemService("input_method")).hideSoftInputFromWindow(SignUpActivity.f(a).getWindowToken(), 0);
        }
    }

    (SignUpActivity signupactivity)
    {
        a = signupactivity;
        super();
    }
}
