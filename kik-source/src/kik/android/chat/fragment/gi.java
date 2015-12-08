// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.app.Activity;
import android.widget.ListView;
import com.kik.android.a;
import kik.a.d.j;
import kik.a.d.n;
import kik.a.z;
import kik.android.chat.activity.k;
import kik.android.util.ao;

// Referenced classes of package kik.android.chat.fragment:
//            KikChatInfoFragment

final class gi
    implements ao
{

    final KikChatInfoFragment a;

    gi(KikChatInfoFragment kikchatinfofragment)
    {
        a = kikchatinfofragment;
        super();
    }

    public final void a()
    {
        kik.android.chat.fragment.KikChatInfoFragment.a(a, true);
        String s = z.b(a.x).a().a();
        kik.android.chat.fragment.KikChatInfoFragment.a(a, null);
        a.o.b("Chat Info Group Member Tapped").b();
        android.support.v4.app.FragmentActivity fragmentactivity = a.getActivity();
        if (fragmentactivity != null)
        {
            fragmentactivity.closeContextMenu();
        }
        if (((n)kik.android.chat.fragment.KikChatInfoFragment.a(a)).A())
        {
            a.f.showContextMenu();
            return;
        } else
        {
            k.a((new KikChatInfoFragment.a()).d(s), fragmentactivity).f();
            return;
        }
    }

    public final void a(kik.a.d.k k1)
    {
        kik.android.chat.fragment.KikChatInfoFragment.a(a, false);
        kik.android.chat.fragment.KikChatInfoFragment.a(a, k1);
        a.o.b("Chat Info Group Member Tapped").b();
        k1 = a.getActivity();
        if (k1 != null)
        {
            k1.closeContextMenu();
        }
        if (((n)kik.android.chat.fragment.KikChatInfoFragment.a(a)).A())
        {
            a.f.showContextMenu();
            return;
        } else
        {
            k.a((new KikChatInfoFragment.a()).a(KikChatInfoFragment.b(a)), k1).f();
            return;
        }
    }

    public final void b()
    {
        kik.android.chat.fragment.KikChatInfoFragment.a(a, false);
        a.o.b("Chat Info Add Group Member Tapped").b();
        a.d();
    }
}
