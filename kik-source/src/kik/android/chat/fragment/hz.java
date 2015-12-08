// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import kik.a.d.k;
import kik.a.d.n;

// Referenced classes of package kik.android.chat.fragment:
//            KikChatInfoFragment

final class hz
    implements Runnable
{

    final KikChatInfoFragment a;

    hz(KikChatInfoFragment kikchatinfofragment)
    {
        a = kikchatinfofragment;
        super();
    }

    public final void run()
    {
label0:
        {
            if (KikChatInfoFragment.a(a) != null && KikChatInfoFragment.i(a) != null && a.e != null)
            {
                if (!KikChatInfoFragment.a(a).t() || !((n)KikChatInfoFragment.a(a)).B())
                {
                    break label0;
                }
                kik.android.chat.fragment.KikChatInfoFragment.k(a);
            }
            return;
        }
        KikChatInfoFragment.l(a);
        a.b();
        a.c();
    }
}
