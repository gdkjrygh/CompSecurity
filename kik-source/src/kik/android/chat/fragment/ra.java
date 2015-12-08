// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import com.kik.g.p;
import kik.android.chat.activity.k;

// Referenced classes of package kik.android.chat.fragment:
//            SendToFragment, rb, rc

final class ra
    implements Runnable
{

    final SendToFragment a;

    ra(SendToFragment sendtofragment)
    {
        a = sendtofragment;
        super();
    }

    public final void run()
    {
        if (SendToFragment.d(a))
        {
            KikComposeFragment.a a1 = new KikComposeFragment.a();
            a1.a().a(SendToFragment.e(a).h());
            k.a(a1, a.getActivity()).f().a(new rb(this));
            return;
        } else
        {
            KikSelectUserFragment.a a2 = new KikSelectUserFragment.a();
            a2.a().a(SendToFragment.g(a)).a(SendToFragment.e(a).h());
            k.a(a2, a.getActivity()).f().a(new rc(this));
            return;
        }
    }
}
