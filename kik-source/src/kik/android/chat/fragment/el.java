// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.content.DialogInterface;
import kik.a.d.a.a;
import kik.a.d.s;

// Referenced classes of package kik.android.chat.fragment:
//            KikChatFragment

final class el
    implements android.content.DialogInterface.OnClickListener
{

    final s a;
    final a b;
    final KikChatFragment c;

    el(KikChatFragment kikchatfragment, s s, a a1)
    {
        c = kikchatfragment;
        a = s;
        b = a1;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        if (i == -2)
        {
            kik.android.chat.fragment.KikChatFragment.a(c, "Message Delete Cancel Tapped", a, b);
            dialoginterface.dismiss();
            return;
        } else
        {
            kik.android.chat.fragment.KikChatFragment.a(c, a, b);
            return;
        }
    }
}
