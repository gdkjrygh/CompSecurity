// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.manager;

import android.app.Activity;
import android.app.Fragment;
import com.bumptech.glide.j;
import java.util.HashSet;

// Referenced classes of package com.bumptech.glide.manager:
//            a, j, k

public class RequestManagerFragment extends Fragment
{
    private class a
        implements k
    {

        final RequestManagerFragment a;

        private a()
        {
            a = RequestManagerFragment.this;
            super();
        }

    }


    private final com.bumptech.glide.manager.a a;
    private final k b;
    private j c;
    private final HashSet d;
    private RequestManagerFragment e;

    public RequestManagerFragment()
    {
        this(new com.bumptech.glide.manager.a());
    }

    RequestManagerFragment(com.bumptech.glide.manager.a a1)
    {
        b = new a();
        d = new HashSet();
        a = a1;
    }

    private void a(RequestManagerFragment requestmanagerfragment)
    {
        d.add(requestmanagerfragment);
    }

    private void b(RequestManagerFragment requestmanagerfragment)
    {
        d.remove(requestmanagerfragment);
    }

    com.bumptech.glide.manager.a a()
    {
        return a;
    }

    public void a(j j1)
    {
        c = j1;
    }

    public j b()
    {
        return c;
    }

    public k c()
    {
        return b;
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        e = j.a().a(getActivity().getFragmentManager());
        if (e != this)
        {
            e.a(this);
        }
    }

    public void onDestroy()
    {
        super.onDestroy();
        a.c();
    }

    public void onDetach()
    {
        super.onDetach();
        if (e != null)
        {
            e.b(this);
            e = null;
        }
    }

    public void onLowMemory()
    {
        if (c != null)
        {
            c.a();
        }
    }

    public void onStart()
    {
        super.onStart();
        a.a();
    }

    public void onStop()
    {
        super.onStop();
        a.b();
    }

    public void onTrimMemory(int i)
    {
        if (c != null)
        {
            c.a(i);
        }
    }
}
