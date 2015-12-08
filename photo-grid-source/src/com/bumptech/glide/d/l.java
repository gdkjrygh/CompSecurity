// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.d;

import android.app.Activity;
import android.app.Fragment;
import android.util.Log;
import com.bumptech.glide.p;
import java.util.HashSet;

// Referenced classes of package com.bumptech.glide.d:
//            a, m, n, o

public final class l extends Fragment
{

    private final a a;
    private final o b;
    private p c;
    private final HashSet d;
    private l e;

    public l()
    {
        this(new a());
    }

    private l(a a1)
    {
        b = new m(this, (byte)0);
        d = new HashSet();
        a = a1;
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
        return a;
    }

    public final void a(p p1)
    {
        c = p1;
    }

    public final p b()
    {
        return c;
    }

    public final o c()
    {
        return b;
    }

    public final void onAttach(Activity activity)
    {
        super.onAttach(activity);
        d();
        e = n.a().a(activity.getFragmentManager());
        if (e != this)
        {
            e.d.add(this);
        }
_L1:
        return;
        activity;
        if (Log.isLoggable("RMFragment", 5))
        {
            Log.w("RMFragment", "Unable to register fragment with root", activity);
            return;
        }
          goto _L1
    }

    public final void onDestroy()
    {
        super.onDestroy();
        a.c();
    }

    public final void onDetach()
    {
        super.onDetach();
        d();
    }

    public final void onLowMemory()
    {
        if (c != null)
        {
            c.a();
        }
    }

    public final void onStart()
    {
        super.onStart();
        a.a();
    }

    public final void onStop()
    {
        super.onStop();
        a.b();
    }

    public final void onTrimMemory(int i)
    {
        if (c != null)
        {
            c.a(i);
        }
    }
}
