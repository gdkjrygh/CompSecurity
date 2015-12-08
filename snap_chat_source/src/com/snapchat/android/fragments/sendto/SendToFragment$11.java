// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.sendto;

import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.snapchat.android.ui.window.WindowConfiguration;

// Referenced classes of package com.snapchat.android.fragments.sendto:
//            SendToFragment

final class a
    implements android.view.er
{

    private SendToFragment a;

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        if (SendToFragment.h(a))
        {
            SendToFragment.o(a).a(com.snapchat.android.ui.window.n.StatusBarDrawMode.DRAW_BACKGROUND_BEHIND);
            SendToFragment.p(a).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
        return false;
    }

    sBarDrawMode(SendToFragment sendtofragment)
    {
        a = sendtofragment;
        super();
    }
}
