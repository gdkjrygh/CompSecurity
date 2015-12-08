// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.support.v4.app.FragmentActivity;
import android.view.inputmethod.InputMethodManager;
import android.widget.AbsListView;
import android.widget.EditText;

// Referenced classes of package kik.android.chat.fragment:
//            KikDefaultContactsListFragment

final class ky
    implements android.widget.AbsListView.OnScrollListener
{

    final KikDefaultContactsListFragment a;
    private int b;

    ky(KikDefaultContactsListFragment kikdefaultcontactslistfragment)
    {
        a = kikdefaultcontactslistfragment;
        super();
        b = 0;
    }

    public final void onScroll(AbsListView abslistview, int i, int j, int k)
    {
    }

    public final void onScrollStateChanged(AbsListView abslistview, int i)
    {
        if (b == 0 && i != 0)
        {
            ((InputMethodManager)a.getActivity().getSystemService("input_method")).hideSoftInputFromWindow(a.s.getWindowToken(), 0);
        }
        b = i;
    }
}
