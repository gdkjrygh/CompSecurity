// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.database.Cursor;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.AdapterView;
import kik.a.e.r;
import kik.android.util.af;

// Referenced classes of package kik.android.chat.fragment:
//            KikMultiselectContactsListFragment

final class ml
    implements android.widget.AdapterView.OnItemClickListener
{

    final KikMultiselectContactsListFragment a;

    ml(KikMultiselectContactsListFragment kikmultiselectcontactslistfragment)
    {
        a = kikmultiselectcontactslistfragment;
        super();
    }

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        if (adapterview.getItemAtPosition(i) instanceof af)
        {
            a.getActivity().runOnUiThread(((af)adapterview.getItemAtPosition(i)).a);
        } else
        {
            adapterview = (Cursor)adapterview.getItemAtPosition(i);
            if (adapterview != null)
            {
                Object obj = adapterview.getString(adapterview.getColumnIndex("suggest_intent_data_id"));
                obj = a.H.a(((String) (obj)), false);
                if (obj != null)
                {
                    a.a(((kik.a.d.k) (obj)), (com.kik.view.adapters.ContactsCursorAdapter.a)view.getTag(), adapterview, i);
                    return;
                }
            }
        }
    }
}
