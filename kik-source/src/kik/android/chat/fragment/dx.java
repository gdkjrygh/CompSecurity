// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;


// Referenced classes of package kik.android.chat.fragment:
//            KikChatFragment

final class dx
    implements Runnable
{

    final String a;
    final KikChatFragment b;

    dx(KikChatFragment kikchatfragment, String s)
    {
        b = kikchatfragment;
        a = s;
        super();
    }

    public final void run()
    {
        b.a(null);
        b.a(KikChatFragment.b(0x7f0902bb), a);
        KikChatFragment.v(b);
    }
}
