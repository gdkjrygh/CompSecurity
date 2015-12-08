// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.chat;

import FD;
import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.snapchat.android.fragments.chat:
//            ChatFragment

final class a
    implements android.view.tener
{

    private ChatFragment a;

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        if (motionevent.getAction() == 0)
        {
            ChatFragment.w(a);
            ChatFragment.x(a).B();
        }
        return false;
    }

    (ChatFragment chatfragment)
    {
        a = chatfragment;
        super();
    }
}
