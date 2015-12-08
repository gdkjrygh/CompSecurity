// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;

// Referenced classes of package kik.android.chat.fragment:
//            KikChatFragment

final class fz
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener
{

    final int a;
    final KikChatFragment b;

    fz(KikChatFragment kikchatfragment, int i)
    {
        b = kikchatfragment;
        a = i;
        super();
    }

    public final void onGlobalLayout()
    {
        if (KikChatFragment.aR(b) == a) goto _L2; else goto _L1
_L1:
        if (!KikChatFragment.aS(b)) goto _L4; else goto _L3
_L3:
        KikChatFragment.a(b, KikChatFragment.b.d, false);
_L6:
        KikChatFragment.aU(b);
        b._contentFrame.getViewTreeObserver().removeGlobalOnLayoutListener(this);
_L2:
        return;
_L4:
        if (KikChatFragment.aT(b) != KikChatFragment.c.a)
        {
            KikChatFragment.a(b, false, false);
        }
        if (true) goto _L6; else goto _L5
_L5:
    }
}
