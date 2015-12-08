// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;


// Referenced classes of package kik.android.chat.fragment:
//            KikChatFragment

final class fh
    implements Runnable
{

    final boolean a;
    final KikChatFragment b;

    fh(KikChatFragment kikchatfragment, boolean flag)
    {
        b = kikchatfragment;
        a = flag;
        super();
    }

    public final void run()
    {
        if (a && !KikChatFragment.B(b))
        {
            KikChatFragment.C(b);
        }
    }
}
