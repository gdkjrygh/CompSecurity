// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package kik.android.chat.fragment:
//            KikGroupMembersListFragment

final class lp
    implements android.widget.AdapterView.OnItemLongClickListener
{

    final KikGroupMembersListFragment a;

    lp(KikGroupMembersListFragment kikgroupmemberslistfragment)
    {
        a = kikgroupmemberslistfragment;
        super();
    }

    public final boolean onItemLongClick(AdapterView adapterview, View view, int i, long l)
    {
        return true;
    }
}
