// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ai;

import android.app.Activity;
import android.app.Fragment;
import java.util.HashSet;

// Referenced classes of package p.ai:
//            a, k, l

public class j extends Fragment
{
    private class a
        implements l
    {

        final j a;

        private a()
        {
            a = j.this;
            super();
        }

    }


    private final p.ai.a a;
    private final l b;
    private p.l.j c;
    private final HashSet d;
    private j e;

    public j()
    {
        this(new p.ai.a());
    }

    j(p.ai.a a1)
    {
        b = new a();
        d = new HashSet();
        a = a1;
    }

    private void a(j j1)
    {
        d.add(j1);
    }

    private void b(j j1)
    {
        d.remove(j1);
    }

    p.ai.a a()
    {
        return a;
    }

    public void a(p.l.j j1)
    {
        c = j1;
    }

    public p.l.j b()
    {
        return c;
    }

    public l c()
    {
        return b;
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        e = k.a().a(getActivity().getFragmentManager());
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
