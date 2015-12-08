// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.d;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import com.bumptech.glide.p;
import java.util.HashSet;

// Referenced classes of package com.bumptech.glide.d:
//            a, r, n, o

public final class q extends Fragment
{

    private p a;
    private final a b;
    private final o c;
    private final HashSet d;
    private q e;

    public q()
    {
        this(new a());
    }

    private q(a a1)
    {
        c = new r(this, (byte)0);
        d = new HashSet();
        b = a1;
    }

    private void d()
    {
        if (e != null)
        {
            e.d.remove(this);
            e = null;
        }
    }

    final a a()
    {
        return b;
    }

    public final void a(p p1)
    {
        a = p1;
    }

    public final p b()
    {
        return a;
    }

    public final o c()
    {
        return c;
    }

    public final void onAttach(Activity activity)
    {
        super.onAttach(activity);
        activity = getActivity();
        d();
        e = n.a().a(activity.getSupportFragmentManager());
        if (e != this)
        {
            e.d.add(this);
        }
_L1:
        return;
        activity;
        if (Log.isLoggable("SupportRMFragment", 5))
        {
            Log.w("SupportRMFragment", "Unable to register fragment with root", activity);
            return;
        }
          goto _L1
    }

    public final void onDestroy()
    {
        super.onDestroy();
        b.c();
    }

    public final void onDetach()
    {
        super.onDetach();
        d();
    }

    public final void onLowMemory()
    {
        super.onLowMemory();
        if (a != null)
        {
            a.a();
        }
    }

    public final void onStart()
    {
        super.onStart();
        b.a();
    }

    public final void onStop()
    {
        super.onStop();
        b.b();
    }
}
