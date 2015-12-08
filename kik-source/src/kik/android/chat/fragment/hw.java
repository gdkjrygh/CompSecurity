// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import com.kik.g.i;
import java.util.List;
import kik.a.d.k;
import kik.a.d.n;
import kik.android.util.cq;

// Referenced classes of package kik.android.chat.fragment:
//            KikChatInfoFragment

final class hw extends i
{

    final KikChatInfoFragment a;

    hw(KikChatInfoFragment kikchatinfofragment)
    {
        a = kikchatinfofragment;
        super();
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (String)obj1;
        if ((obj != null && KikChatInfoFragment.a(a).b().equals(obj) || KikChatInfoFragment.a(a).t() && ((n)KikChatInfoFragment.a(a)).w().contains(obj)) && (KikChatInfoFragment.a(a).t() || !cq.c(KikChatInfoFragment.a(a).c())))
        {
            KikChatInfoFragment.d(a);
        }
    }
}
