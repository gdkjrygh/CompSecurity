// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.fitbit.e.a;
import se.emilsjolander.stickylistheaders.h;

// Referenced classes of package com.fitbit:
//            LoadableListView

public class LoadableListViewFragment extends Fragment
{

    private static final String a = "layout";
    private LoadableListView b;

    public LoadableListViewFragment()
    {
    }

    public static LoadableListViewFragment a()
    {
        return a(0x7f0400b1);
    }

    public static LoadableListViewFragment a(int i)
    {
        Bundle bundle = new Bundle();
        bundle.putInt("layout", i);
        LoadableListViewFragment loadablelistviewfragment = new LoadableListViewFragment();
        loadablelistviewfragment.setArguments(bundle);
        return loadablelistviewfragment;
    }

    private void a(View view)
    {
        View view1 = b.o();
        if (view1 != null)
        {
            view1.setVisibility(8);
        }
        b.f(view);
    }

    public void a(CharSequence charsequence)
    {
        View view = b.o();
        if (view == null)
        {
            return;
        }
        if (view != null && (view instanceof TextView))
        {
            ((TextView)view).setText(charsequence);
            return;
        } else
        {
            throw new IllegalStateException((new StringBuilder()).append("Empty[").append(view).append("] is not an instance of TextView").toString());
        }
    }

    public void a(h h)
    {
        com.fitbit.e.a.d("List", (new StringBuilder()).append("List Adapter Added ").append(h).toString(), new Object[0]);
        b.a(h);
    }

    protected int b()
    {
        return 0x7f0400b1;
    }

    public void b(int i)
    {
        View view = getView();
        if (view != null)
        {
            a(view.findViewById(i));
        }
    }

    public View c()
    {
        if (b != null)
        {
            return b.o();
        } else
        {
            return null;
        }
    }

    public LoadableListView d()
    {
        return b;
    }

    public h e()
    {
        return b.b();
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        int i;
        if (getArguments() != null)
        {
            i = getArguments().getInt("layout", b());
        } else
        {
            i = b();
        }
        layoutinflater = (ViewGroup)layoutinflater.inflate(i, viewgroup, false);
        b = (LoadableListView)layoutinflater.findViewById(0x102000a);
        a(layoutinflater.findViewById(0x1020004));
        return layoutinflater;
    }
}
