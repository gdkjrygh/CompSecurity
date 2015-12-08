// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.ListView;
import java.util.HashMap;
import kik.a.d.f;
import kik.a.d.k;
import kik.android.util.cq;
import kik.android.widget.cp;

// Referenced classes of package kik.android.chat.fragment:
//            hq, KikChatInfoFragment, hv, hs

final class hr
    implements android.content.DialogInterface.OnClickListener
{

    final HashMap a;
    final hq b;

    hr(hq hq1, HashMap hashmap)
    {
        b = hq1;
        a = hashmap;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = (String)a.get(Integer.valueOf(i));
        if (dialoginterface.equals("report"))
        {
            dialoginterface = new cp(KikChatInfoFragment.a(b.a), KikChatInfoFragment.i(b.a).c(), b.a.b.getContext().getApplicationContext(), "Chat Info Screen", b.a.o, b.a.r);
            b.a.a(((KikDialogFragment.a) (dialoginterface)).a, KikScopedDialogFragment.a.b, "dialog");
        } else
        {
            if (dialoginterface.equals("block"))
            {
                dialoginterface = new KikDialogFragment.a(b.a.f.getResources());
                String s = cq.a(KikChatInfoFragment.a(b.a));
                dialoginterface.b(KikChatInfoFragment.a(0x7f090055, new Object[] {
                    KikChatInfoFragment.a(b.a).c(), s
                })).a(KikChatInfoFragment.a(0x7f09003b, new Object[] {
                    KikChatInfoFragment.a(b.a).c()
                })).b(0x7f090299, new hv(this)).a(0x7f090296, new hs(this));
                b.a.a(((KikDialogFragment.a) (dialoginterface)).a, KikScopedDialogFragment.a.b, "dialog");
                return;
            }
            if (dialoginterface.equals("stopChatting"))
            {
                KikChatInfoFragment.j(b.a);
                return;
            }
            if (dialoginterface.equals("viewMembers"))
            {
                b.a.a((new KikGroupMembersListFragment.a()).a(KikChatInfoFragment.a(b.a).b()));
                return;
            }
        }
    }
}
