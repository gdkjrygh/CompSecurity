// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.compose;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

// Referenced classes of package com.facebook.orca.compose:
//            ComposeFragment, ap

class z
    implements android.view.View.OnTouchListener
{

    final ComposeFragment a;

    z(ComposeFragment composefragment)
    {
        a = composefragment;
        super();
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        if (ComposeFragment.e(a) == ap.SHRUNK)
        {
            if (motionevent.getActionMasked() == 1 && !ComposeFragment.a(a, ComposeFragment.f(a), motionevent) && !ComposeFragment.a(a, ComposeFragment.g(a), motionevent))
            {
                ComposeFragment.h(a).requestFocusFromTouch();
                ((InputMethodManager)a.n().getSystemService("input_method")).showSoftInput(ComposeFragment.h(a), 0);
            }
            return true;
        } else
        {
            return false;
        }
    }
}
