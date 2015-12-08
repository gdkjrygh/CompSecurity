// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import android.widget.ImageView;
import android.widget.RadioGroup;

// Referenced classes of package com.pandora.android.activity:
//            SignUpActivity

class a
    implements android.widget.kedChangeListener
{

    final SignUpActivity a;

    public void onCheckedChanged(RadioGroup radiogroup, int i)
    {
        if (!SignUpActivity.d(a))
        {
            SignUpActivity.e(a).setSelected(true);
        }
        if (i == 0x7f10027f)
        {
            SignUpActivity.a(a, a.getString(0x7f0801b2));
        } else
        {
            SignUpActivity.a(a, a.getString(0x7f0801b1));
        }
        SignUpActivity.a(a, true);
        SignUpActivity.a(a);
        SignUpActivity.f(a).requestFocus();
    }

    ner(SignUpActivity signupactivity)
    {
        a = signupactivity;
        super();
    }
}
