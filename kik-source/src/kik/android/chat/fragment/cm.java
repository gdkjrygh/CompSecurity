// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.graphics.Rect;
import android.widget.FrameLayout;
import kik.android.widget.DarkLinearLayout;

// Referenced classes of package kik.android.chat.fragment:
//            KikChatFragment

final class cm
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener
{

    final KikChatFragment a;

    cm(KikChatFragment kikchatfragment)
    {
        a = kikchatfragment;
        super();
    }

    public final void onGlobalLayout()
    {
        Rect rect = new Rect();
        a._mediaTrayContainer.getWindowVisibleDisplayFrame(rect);
        int i = a._mediaTrayContainer.getMeasuredHeight();
        if (KikChatFragment.t(a))
        {
            i += KikChatFragment.H(a);
        }
        if (i != ((android.view.ViewGroup.MarginLayoutParams)a.rootLayout.getLayoutParams()).bottomMargin)
        {
            KikChatFragment.a(a, i);
        }
    }
}
