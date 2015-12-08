// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import kik.a.d.k;
import kik.android.f.a.f;
import kik.android.widget.BugmeBarView;
import kik.android.widget.ContentLinkView;
import kik.android.widget.ResizeEventList;

// Referenced classes of package kik.android.chat.fragment:
//            KikChatFragment

final class ek
    implements Runnable
{

    final KikChatFragment a;

    ek(KikChatFragment kikchatfragment)
    {
        a = kikchatfragment;
        super();
    }

    public final void run()
    {
        if (kik.android.chat.fragment.KikChatFragment.f(a, KikChatFragment.m(a).getHeight()))
        {
            KikChatFragment.ag(a);
            Object obj = f.a(KikChatFragment.ap(a), KikChatFragment.j(a).d());
            if (KikChatFragment.j(a).i() && obj != null)
            {
                KikChatFragment.x(a).a(((com.kik.f.a.a.a) (obj)), a.a);
                KikChatFragment.x(a).a(0, 4);
                return;
            }
            obj = KikChatFragment.w(a);
            KikChatFragment.j(a);
            ((BugmeBarView) (obj)).a();
            if (KikChatFragment.w(a).d())
            {
                KikChatFragment.w(a).a(0, 4);
                return;
            } else
            {
                KikChatFragment.w(a).a(8, 8);
                KikChatFragment.x(a).a(8, 8);
                return;
            }
        } else
        {
            KikChatFragment.w(a).a(8, 2);
            KikChatFragment.x(a).a(8, 2);
            return;
        }
    }
}
