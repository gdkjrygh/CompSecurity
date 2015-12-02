// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.compose;

import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.facebook.orca.compose:
//            ComposeFragment

class ah
    implements android.view.View.OnTouchListener
{

    final ComposeFragment a;

    ah(ComposeFragment composefragment)
    {
        a = composefragment;
        super();
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        if (ComposeFragment.t(a) && ComposeFragment.u(a))
        {
            ComposeFragment.v(a);
        }
        ComposeFragment.c(a, false);
        ComposeFragment.w(a);
        ComposeFragment.k(a);
        return false;
    }
}
