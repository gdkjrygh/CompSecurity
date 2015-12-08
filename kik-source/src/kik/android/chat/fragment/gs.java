// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.view.View;
import android.widget.CheckBox;
import com.kik.android.a;
import kik.a.d.f;
import kik.a.d.k;
import kik.a.d.n;
import kik.a.e.i;

// Referenced classes of package kik.android.chat.fragment:
//            KikChatInfoFragment

final class gs
    implements android.view.View.OnClickListener
{

    final k a;
    final KikChatInfoFragment b;

    gs(KikChatInfoFragment kikchatinfofragment, k k1)
    {
        b = kikchatinfofragment;
        a = k1;
        super();
    }

    public final void onClick(View view)
    {
        boolean flag1 = kik.android.chat.fragment.KikChatInfoFragment.i(b).n();
        view = b.o.b("Chat Info Mute Tapped");
        boolean flag;
        if (!flag1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view.a("Is Muted", flag).b();
        KikChatInfoFragment.s(b).setChecked(flag1);
        if (KikChatInfoFragment.s(b).isChecked())
        {
            com.kik.android.a.f f1 = b.o.b("Unmuted").a("Is Verified", a.i()).a("Source", "Chat Info");
            long l;
            if (kik.android.chat.fragment.KikChatInfoFragment.i(b).p() == -1L)
            {
                view = "Forever";
            } else
            {
                view = "Limited Time Duration";
            }
            view = f1.a("Duration", view).a("Is Group", a instanceof n);
            if (a instanceof n)
            {
                l = ((n)a).E();
            } else
            {
                l = 1L;
            }
            view.a("Participants Count", l).b();
            b.r.d(kik.android.chat.fragment.KikChatInfoFragment.i(b).b());
            KikChatInfoFragment.b(b, a);
            return;
        } else
        {
            kik.android.chat.fragment.KikChatInfoFragment.a(b, a, kik.android.chat.fragment.KikChatInfoFragment.i(b));
            return;
        }
    }
}
