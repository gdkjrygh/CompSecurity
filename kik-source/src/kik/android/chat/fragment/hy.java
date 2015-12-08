// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;


// Referenced classes of package kik.android.chat.fragment:
//            hx, KikChatInfoFragment

final class hy
    implements Runnable
{

    final hx a;

    hy(hx hx1)
    {
        a = hx1;
        super();
    }

    public final void run()
    {
        if (KikChatInfoFragment.i(a.a) != null && a.a.e != null)
        {
            KikChatInfoFragment.b(a.a, KikChatInfoFragment.a(a.a));
        }
    }
}
