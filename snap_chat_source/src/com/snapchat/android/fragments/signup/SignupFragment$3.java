// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.signup;

import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;

// Referenced classes of package com.snapchat.android.fragments.signup:
//            SignupFragment

final class a
    implements android.view.ner
{

    private SignupFragment a;

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        view = SignupFragment.k(a).getOnFocusChangeListener();
        if (1 == motionevent.getAction() && view != null)
        {
            SignupFragment.j(a);
            return true;
        } else
        {
            return false;
        }
    }

    (SignupFragment signupfragment)
    {
        a = signupfragment;
        super();
    }
}
