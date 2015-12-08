// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.view.View;
import android.widget.ListView;
import android.widget.WrapperListAdapter;
import kik.a.d.k;

// Referenced classes of package kik.android.chat.fragment:
//            KikMultiselectContactsListFragment

final class mx
    implements android.view.View.OnClickListener
{

    final KikMultiselectContactsListFragment a;

    mx(KikMultiselectContactsListFragment kikmultiselectcontactslistfragment)
    {
        a = kikmultiselectcontactslistfragment;
        super();
    }

    public final void onClick(View view)
    {
        view = (k)view.getTag();
        com.kik.view.adapters.k k1 = (com.kik.view.adapters.k)((WrapperListAdapter)a.c.getAdapter()).getWrappedAdapter();
        if (k1 != null)
        {
            int i = k1.a();
            a.a(view, null, null, i + 1);
            return;
        } else
        {
            a.a(view, null, null, 1);
            return;
        }
    }
}
