// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ai;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import java.util.HashSet;
import p.l.j;

// Referenced classes of package p.ai:
//            a, k, l

public class n extends Fragment
{
    private class a
        implements l
    {

        final n a;

        private a()
        {
            a = n.this;
            super();
        }

    }


    private j a;
    private final p.ai.a b;
    private final l c;
    private final HashSet d;
    private n e;

    public n()
    {
        this(new p.ai.a());
    }

    public n(p.ai.a a1)
    {
        c = new a();
        d = new HashSet();
        b = a1;
    }

    private void a(n n1)
    {
        d.add(n1);
    }

    private void b(n n1)
    {
        d.remove(n1);
    }

    p.ai.a a()
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

    public l c()
    {
        return c;
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        e = k.a().a(getActivity().f());
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
