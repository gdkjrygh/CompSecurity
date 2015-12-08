// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import com.kik.g.r;

// Referenced classes of package kik.android.chat.fragment:
//            KikChatInfoFragment, ProgressDialogFragment

final class hc extends r
{

    final ProgressDialogFragment a;
    final KikChatInfoFragment b;

    hc(KikChatInfoFragment kikchatinfofragment, ProgressDialogFragment progressdialogfragment)
    {
        b = kikchatinfofragment;
        a = progressdialogfragment;
        super();
    }

    public final void a(Object obj)
    {
        KikChatInfoFragment.b(b, a);
    }

    public final void b(Throwable throwable)
    {
        KikChatInfoFragment.c(b, a);
    }
}
