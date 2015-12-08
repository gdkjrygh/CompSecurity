// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;


// Referenced classes of package kik.android.chat.fragment:
//            ca, KikChatFragment

final class cb
    implements Runnable
{

    final ca a;

    cb(ca ca1)
    {
        a = ca1;
        super();
    }

    public final void run()
    {
        KikChatFragment.C(a.a);
    }
}
