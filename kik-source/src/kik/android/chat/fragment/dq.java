// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;


// Referenced classes of package kik.android.chat.fragment:
//            KikChatFragment, KikDialogFragment

final class dq
    implements KikChatFragment.f
{

    final KikDialogFragment a;
    final KikChatFragment b;

    dq(KikChatFragment kikchatfragment, KikDialogFragment kikdialogfragment)
    {
        b = kikchatfragment;
        a = kikdialogfragment;
        super();
    }

    public final void a()
    {
        b.a(a, KikScopedDialogFragment.a.b, "replace");
        KikChatFragment.aj(b);
    }
}
