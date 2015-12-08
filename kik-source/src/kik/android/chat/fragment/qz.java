// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import kik.a.d.f;
import kik.android.chat.activity.k;
import kik.android.util.af;

// Referenced classes of package kik.android.chat.fragment:
//            SendToFragment

final class qz
    implements android.widget.AdapterView.OnItemClickListener
{

    final SendToFragment a;

    qz(SendToFragment sendtofragment)
    {
        a = sendtofragment;
        super();
    }

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        if (adapterview.getItemAtPosition(i) instanceof af)
        {
            SendToFragment.c(a).post(((af)adapterview.getItemAtPosition(i)).a);
            return;
        }
        adapterview = ((f)SendToFragment.c(a).getAdapter().getItem(i)).b();
        if (SendToFragment.d(a))
        {
            view = new KikChatFragment.a();
            view.a(adapterview).a(SendToFragment.e(a).h());
            k.a(view, a.getActivity()).f();
        } else
        {
            view = new Bundle();
            view.putString("SendToFragment.RESULT_JID", adapterview);
            a.a(view);
        }
        a.J();
        kik.android.chat.fragment.SendToFragment.f(a);
    }
}
