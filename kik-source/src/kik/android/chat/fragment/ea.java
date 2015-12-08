// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.view.ViewGroup;
import android.widget.Button;
import com.kik.g.i;
import kik.android.util.cv;

// Referenced classes of package kik.android.chat.fragment:
//            KikChatFragment

final class ea extends i
{

    final KikChatFragment a;

    ea(KikChatFragment kikchatfragment)
    {
        a = kikchatfragment;
        super();
    }

    public final void a(Object obj, Object obj1)
    {
        KikChatFragment.f(a);
        if (!KikChatFragment.g(a))
        {
            a.a(KikChatFragment.e(a));
        }
        a.tray.setVisibility(0);
        cv.a(a.tray, KikChatFragment.h(a));
        obj = (android.widget.RelativeLayout.LayoutParams)a._newMessagesButton.getLayoutParams();
        ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(12, 1);
        ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(2, 0);
        a._newMessagesButton.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
    }
}
