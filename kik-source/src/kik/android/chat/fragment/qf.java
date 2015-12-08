// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import kik.a.d.f;

// Referenced classes of package kik.android.chat.fragment:
//            MissedConversationsFragment

final class qf
    implements android.widget.AdapterView.OnItemClickListener
{

    final MissedConversationsFragment a;

    qf(MissedConversationsFragment missedconversationsfragment)
    {
        a = missedconversationsfragment;
        super();
    }

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = (f)a.j.getAdapter().getItem(i);
        a.a(adapterview);
    }
}
