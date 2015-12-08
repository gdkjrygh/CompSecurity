// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.view.View;
import android.widget.AdapterView;
import com.kik.view.adapters.bb;
import kik.a.a.b;
import kik.a.a.c;

// Referenced classes of package kik.android.chat.fragment:
//            AbTestsFragment, KikDialogFragment, b

final class a
    implements android.widget.AdapterView.OnItemClickListener
{

    final AbTestsFragment a;

    a(AbTestsFragment abtestsfragment)
    {
        a = abtestsfragment;
        super();
    }

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = AbTestsFragment.a(a).a(i);
        if (adapterview instanceof AbTestsFragment.e)
        {
            adapterview = (kik.a.a.a)AbTestsFragment.a(a).getItem(i);
            a.a.c(adapterview.a());
        } else
        {
            if (adapterview instanceof AbTestsFragment.c)
            {
                adapterview = (b)AbTestsFragment.a(a).getItem(i);
                view = new KikDialogFragment();
                view.a(adapterview.a());
                view.b(adapterview.b(), new kik.android.chat.fragment.b(this, adapterview));
                a.a(view);
                return;
            }
            if (adapterview instanceof AbTestsFragment.a)
            {
                a.a.d();
                AbTestsFragment.a(a).notifyDataSetChanged();
                return;
            }
        }
    }
}
