// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import kik.a.d.n;
import kik.a.d.p;

// Referenced classes of package kik.android.chat.fragment:
//            KikGroupMembersListFragment

final class lo
    implements android.widget.AdapterView.OnItemClickListener
{

    final KikGroupMembersListFragment a;

    lo(KikGroupMembersListFragment kikgroupmemberslistfragment)
    {
        a = kikgroupmemberslistfragment;
        super();
    }

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
label0:
        {
            adapterview = ((AdapterView) (a._groupMembersList.getItemAtPosition(i)));
            if (adapterview != null && (adapterview instanceof p))
            {
                a.f = (p)adapterview;
                if (a.f != null)
                {
                    if (KikGroupMembersListFragment.a(a).A())
                    {
                        break label0;
                    }
                    a.a((new KikChatInfoFragment.a()).a(a.f.a()));
                }
            }
            return;
        }
        a._groupMembersList.showContextMenu();
    }
}
