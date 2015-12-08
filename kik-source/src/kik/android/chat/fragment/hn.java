// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.content.DialogInterface;
import com.kik.g.p;
import kik.a.d.k;
import kik.a.e.l;

// Referenced classes of package kik.android.chat.fragment:
//            ProgressDialogFragment, KikChatInfoFragment, ho

final class hn
    implements android.content.DialogInterface.OnClickListener
{

    final ProgressDialogFragment a;
    final boolean b;
    final KikChatInfoFragment c;

    hn(KikChatInfoFragment kikchatinfofragment, ProgressDialogFragment progressdialogfragment, boolean flag)
    {
        c = kikchatinfofragment;
        a = progressdialogfragment;
        b = flag;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        a.setCancelable(false);
        a.e();
        c.a(a);
        c.n.a(KikChatInfoFragment.b(c).b(), KikChatInfoFragment.a(c).b(), true, b).a(new ho(this));
    }
}
