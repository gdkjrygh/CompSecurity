// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.view.View;
import com.kik.android.a;

// Referenced classes of package kik.android.chat.fragment:
//            KikChatFragment

final class ev
    implements android.view.View.OnClickListener
{

    final KikChatFragment a;

    ev(KikChatFragment kikchatfragment)
    {
        a = kikchatfragment;
        super();
    }

    public final void onClick(View view)
    {
        KikChatFragment.ay(a);
        a.b(true);
        KikChatFragment.i(a, true);
        if (KikChatFragment.as(a))
        {
            KikChatFragment.at(a);
        }
        a.g.b("New Messages Tapped").a("New Messages", KikChatFragment.aH(a)).b();
        KikChatFragment.aI(a);
    }
}
