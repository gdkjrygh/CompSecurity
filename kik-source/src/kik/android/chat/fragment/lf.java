// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.view.View;
import android.widget.AdapterView;
import com.kik.android.a;
import kik.a.d.k;
import kik.a.e.w;
import kik.android.util.cc;

// Referenced classes of package kik.android.chat.fragment:
//            KikFindPeopleFragment

final class lf
    implements android.widget.AdapterView.OnItemClickListener
{

    final KikFindPeopleFragment a;

    lf(KikFindPeopleFragment kikfindpeoplefragment)
    {
        a = kikfindpeoplefragment;
        super();
    }

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = ((AdapterView) (adapterview.getItemAtPosition(i)));
        if (adapterview != null)
        {
            if (adapterview instanceof k)
            {
                adapterview = (k)adapterview;
                view = adapterview.b();
                String s = adapterview.e();
                a.l.b("Promoted Chat Click").a("Bots", new String[] {
                    s
                }).a("Is Contact", adapterview.l()).b();
                if (adapterview.m() || !adapterview.p())
                {
                    a.b(view);
                    return;
                } else
                {
                    a.a(view);
                    return;
                }
            }
            if (adapterview instanceof String)
            {
                adapterview = (String)adapterview;
                if (adapterview.equals("EXPLICIT SEARCH"))
                {
                    kik.android.chat.fragment.KikFindPeopleFragment.a(a);
                    return;
                }
                if (adapterview.equals("PROMOTED CHATS"))
                {
                    a.a(new KikPromotedChatsFragment.a());
                    return;
                }
                if (adapterview.equals("SHOW KIK CODE SCANNER"))
                {
                    a.a((new ScanCodeTabFragment.a()).a(ScanCodeTabFragment.c.c));
                    return;
                }
                if (adapterview.equals("SHARE PROFILE"))
                {
                    cc.a(a.b.d(), view.getContext(), a.l, a.c);
                    return;
                }
            }
        }
    }
}
