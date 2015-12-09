// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.manager;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import com.bumptech.glide.j;
import java.util.HashSet;

// Referenced classes of package com.bumptech.glide.manager:
//            a, j, k

public class m extends Fragment
{
    private class a
        implements k
    {

        final m a;

        private a()
        {
            a = m.this;
            super();
        }

    }


    private j a;
    private final com.bumptech.glide.manager.a b;
    private final k c;
    private final HashSet d;
    private m e;

    public m()
    {
        this(new com.bumptech.glide.manager.a());
    }

    public m(com.bumptech.glide.manager.a a1)
    {
        c = new a();
        d = new HashSet();
        b = a1;
    }

    private void a(m m1)
    {
        d.add(m1);
    }

    private void b(m m1)
    {
        d.remove(m1);
    }

    com.bumptech.glide.manager.a a()
    {
        return b;
    }

    public void a(j j1)
    {
        a = j1;
    }

    public j b()
    {
        return a;
    }

    public k c()
    {
        return c;
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        e = j.a().a(getActivity().getSupportFragmentManager());
        if (e != this)
        {
            e.a(this);
        }
    }

    public void onDestroy()
    {
        super.onDestroy();
        b.c();
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
        super.onLowMemory();
        if (a != null)
        {
            a.a();
        }
    }

    public void onStart()
    {
        super.onStart();
        b.a();
    }

    public void onStop()
    {
        super.onStop();
        b.b();
    }
}
