// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.view.View;
import kik.a.d.f;

// Referenced classes of package kik.android.chat.fragment:
//            KikChatFragment

final class cq
    implements android.view.View.OnClickListener
{

    final KikChatFragment a;

    cq(KikChatFragment kikchatfragment)
    {
        a = kikchatfragment;
        super();
    }

    public final void onClick(View view)
    {
        view = new KikChatInfoFragment.a();
        view.a(KikChatFragment.P(a)).b(1).a(KikChatFragment.P(a)).a(KikChatFragment.j(a)).b(KikChatFragment.z(a).b());
        a.a(view);
    }
}
