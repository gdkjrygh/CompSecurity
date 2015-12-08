// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.database.Cursor;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.AdapterView;
import com.kik.android.a;
import kik.a.d.k;
import kik.android.util.af;

// Referenced classes of package kik.android.chat.fragment:
//            KikDefaultContactsListFragment

final class ks
    implements android.widget.AdapterView.OnItemClickListener
{

    final KikDefaultContactsListFragment a;

    ks(KikDefaultContactsListFragment kikdefaultcontactslistfragment)
    {
        a = kikdefaultcontactslistfragment;
        super();
    }

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        if (!(adapterview.getItemAtPosition(i) instanceof af)) goto _L2; else goto _L1
_L1:
        a.getActivity().runOnUiThread(((af)adapterview.getItemAtPosition(i)).a);
_L4:
        return;
_L2:
        adapterview = ((AdapterView) (adapterview.getItemAtPosition(i)));
        if (adapterview != null && (adapterview instanceof Cursor))
        {
            view = (Cursor)adapterview;
            adapterview = view.getString(view.getColumnIndex("suggest_text_1"));
            view = view.getString(view.getColumnIndex("suggest_intent_data_id"));
            a.a_(view, adapterview);
            return;
        }
        if (adapterview == null || !(adapterview instanceof String))
        {
            continue; /* Loop/switch isn't completed */
        }
        adapterview = (String)adapterview;
        if (adapterview.equals("FIND PEOPLE"))
        {
            a.N.b("Find People Opened").b();
            a.a(new KikFindPeopleFragment.a());
            return;
        }
        if (!adapterview.equals("START GROUP")) goto _L4; else goto _L3
_L3:
        a.a((new KikStartGroupFragment.a()).e());
        a.N.b("Start Group Screen Visited").a("Source", "Talk To").b();
        return;
        if (adapterview == null || !(adapterview instanceof k)) goto _L4; else goto _L5
_L5:
        a.c((k)adapterview);
        return;
    }
}
