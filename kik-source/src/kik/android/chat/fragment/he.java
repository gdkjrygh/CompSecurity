// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import kik.a.e.r;

// Referenced classes of package kik.android.chat.fragment:
//            KikChatInfoFragment, ProgressDialogFragment

final class he
    implements Runnable
{

    final ProgressDialogFragment a;
    final KikChatInfoFragment b;

    he(KikChatInfoFragment kikchatinfofragment, ProgressDialogFragment progressdialogfragment)
    {
        b = kikchatinfofragment;
        a = progressdialogfragment;
        super();
    }

    public final void run()
    {
        b.s.a(KikChatInfoFragment.a(b));
        a.dismissAllowingStateLoss();
    }
}
