// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;


// Referenced classes of package kik.android.chat.fragment:
//            KikChatFragment

final class df
    implements Runnable
{

    final KikChatFragment a;

    df(KikChatFragment kikchatfragment)
    {
        a = kikchatfragment;
        super();
    }

    public final void run()
    {
        KikChatFragment.aa(a);
    }
}
