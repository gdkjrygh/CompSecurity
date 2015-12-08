// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.sendto;

import android.view.MotionEvent;
import android.view.View;
import com.snapchat.android.ui.window.WindowConfiguration;

// Referenced classes of package com.snapchat.android.fragments.sendto:
//            SendToFragment

final class a
    implements android.view.ner
{

    private SendToFragment a;

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        if (motionevent.getAction() == 0)
        {
            SendToFragment.n(a).a(com.snapchat.android.ui.window.on.StatusBarDrawMode.DRAW_BELOW_FOR_ADJUSTABLE_UI);
        }
        return false;
    }

    usBarDrawMode(SendToFragment sendtofragment)
    {
        a = sendtofragment;
        super();
    }
}
