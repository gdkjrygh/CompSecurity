// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.content.DialogInterface;
import android.widget.CheckBox;
import kik.a.d.a.a;
import kik.a.d.s;
import kik.android.chat.KikApplication;
import kik.android.f.a.f;
import kik.android.net.a.c;
import kik.android.net.a.e;
import kik.android.util.bo;

// Referenced classes of package kik.android.chat.fragment:
//            KikChatFragment

final class fc
    implements android.content.DialogInterface.OnClickListener
{

    final a a;
    final CheckBox b;
    final int c;
    final KikChatFragment d;

    fc(KikChatFragment kikchatfragment, a a1, CheckBox checkbox, int i)
    {
        d = kikchatfragment;
        a = a1;
        b = checkbox;
        c = i;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = new c(a, KikChatFragment.p().i(), KikChatFragment.p().b(), KikChatFragment.p().o(), d.g, d.i, d.h, d.d, d.k, d.p);
        e.a().a(dialoginterface);
        if (b.isChecked())
        {
            KikChatFragment.ag(d).f(a.u());
        }
        KikApplication.d().a(KikChatFragment.p());
        KikChatFragment.o();
        KikChatFragment.aL(d);
        KikChatFragment.k(d, c);
    }
}
