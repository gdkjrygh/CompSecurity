// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.view.View;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.HashMap;
import kik.a.d.k;
import kik.a.d.n;
import kik.android.util.cq;

// Referenced classes of package kik.android.chat.fragment:
//            KikChatInfoFragment, hr

final class hq
    implements android.view.View.OnClickListener
{

    final KikChatInfoFragment a;

    hq(KikChatInfoFragment kikchatinfofragment)
    {
        a = kikchatinfofragment;
        super();
    }

    public final void onClick(View view)
    {
        view = new KikDialogFragment.a(a.f.getResources());
        ArrayList arraylist;
        HashMap hashmap;
        int i;
        int j;
        if (KikChatInfoFragment.a(a).t())
        {
            view.a(cq.a((n)KikChatInfoFragment.a(a), a.s));
        } else
        {
            view.a(KikChatInfoFragment.a(a).c());
        }
        arraylist = new ArrayList();
        hashmap = new HashMap();
        if (!KikChatInfoFragment.a(a).t() && !KikChatInfoFragment.h(a))
        {
            arraylist.add(String.format(KikChatInfoFragment.b(0x7f0901fd), new Object[] {
                cq.a(KikChatInfoFragment.a(a))
            }));
            hashmap.put(Integer.valueOf(0), "report");
            j = 1;
        } else
        {
            j = 0;
        }
        i = j;
        if (!KikChatInfoFragment.a(a).t())
        {
            i = j;
            if (!KikChatInfoFragment.h(a))
            {
                arraylist.add(String.format(KikChatInfoFragment.b(0x7f090298), new Object[] {
                    cq.a(KikChatInfoFragment.a(a))
                }));
                hashmap.put(Integer.valueOf(j), "block");
                i = j + 1;
            }
        }
        j = i;
        if (!KikChatInfoFragment.a(a).t())
        {
            j = i;
            if (KikChatInfoFragment.a(a).l())
            {
                j = i;
                if (!KikChatInfoFragment.a(a).m())
                {
                    arraylist.add(KikChatInfoFragment.b(0x7f0900f8));
                    hashmap.put(Integer.valueOf(i), "stopChatting");
                    j = i + 1;
                }
            }
        }
        if (KikChatInfoFragment.a(a).t())
        {
            arraylist.add(KikChatInfoFragment.b(0x7f090360));
            hashmap.put(Integer.valueOf(j), "viewMembers");
        }
        view.a((CharSequence[])arraylist.toArray(new CharSequence[arraylist.size()]), new hr(this, hashmap));
        a.a(((KikDialogFragment.a) (view)).a, KikScopedDialogFragment.a.b, "dialog");
    }
}
