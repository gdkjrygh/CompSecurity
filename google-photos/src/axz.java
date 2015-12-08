// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.util.Log;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class axz extends am
{

    final axk a;
    final axx b;
    amh c;
    am d;
    private final HashSet e;
    private axz f;

    public axz()
    {
        this(new axk());
    }

    private axz(axk axk1)
    {
        b = new aya(this);
        e = new HashSet();
        a = axk1;
    }

    private boolean a(am am1)
    {
        am am2 = s();
        for (; am1.E != null; am1 = am1.E)
        {
            if (am1.E == am2)
            {
                return true;
            }
        }

        return false;
    }

    private am s()
    {
        am am1 = super.E;
        if (am1 != null)
        {
            return am1;
        } else
        {
            return d;
        }
    }

    private void t()
    {
        if (f != null)
        {
            f.e.remove(this);
            f = null;
        }
    }

    public final void a(Activity activity)
    {
        super.a(activity);
        a(O_());
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

    void a(ar ar1)
    {
        t();
        f = axw.a().a(ar1.c(), null);
        if (f != this)
        {
            f.e.add(this);
        }
    }

    public final void aj_()
    {
        super.aj_();
        a.b();
    }

    public final void au_()
    {
        super.au_();
        a.a();
    }

    public final void n()
    {
        super.n();
        a.c();
        t();
    }

    public final void onLowMemory()
    {
        super.onLowMemory();
        if (c != null)
        {
            c.b.onLowMemory();
        }
    }

    public final Set r()
    {
        if (f == null)
        {
            return Collections.emptySet();
        }
        if (f == this)
        {
            return Collections.unmodifiableSet(e);
        }
        HashSet hashset = new HashSet();
        Iterator iterator = f.r().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            axz axz1 = (axz)iterator.next();
            if (a(axz1.s()))
            {
                hashset.add(axz1);
            }
        } while (true);
        return Collections.unmodifiableSet(hashset);
    }

    public final void s_()
    {
        super.s_();
        d = null;
        t();
    }

    public final String toString()
    {
        String s1 = String.valueOf(super.toString());
        String s2 = String.valueOf(s());
        return (new StringBuilder(String.valueOf(s1).length() + 9 + String.valueOf(s2).length())).append(s1).append("{parent=").append(s2).append("}").toString();
    }
}
