// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.view.View;
import com.kik.android.a;
import kik.android.scan.d;

// Referenced classes of package kik.android.chat.fragment:
//            KikChatInfoFragment

final class gp
    implements android.view.View.OnClickListener
{

    final String a;
    final KikChatInfoFragment b;

    gp(KikChatInfoFragment kikchatinfofragment, String s)
    {
        b = kikchatinfofragment;
        a = s;
        super();
    }

    public final void onClick(View view)
    {
        b.o.b(a).b();
        KikChatInfoFragment.n(b);
        view = b;
        b.getActivity();
        KikChatInfoFragment.o(view);
        view = KikChatInfoFragment.p(b).d();
        if (view != null)
        {
            b.A.a(view, kik.android.chat.fragment.KikChatInfoFragment.a(b));
        }
    }
}
