// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.app.Fragment;
import android.util.Log;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class axu extends Fragment
{

    final axk a;
    final axx b;
    amh c;
    Fragment d;
    private final HashSet e;
    private axu f;

    public axu()
    {
        this(new axk());
    }

    private axu(axk axk1)
    {
        b = new axv(this);
        e = new HashSet();
        a = axk1;
    }

    private boolean a(Fragment fragment)
    {
        Fragment fragment1 = getParentFragment();
        for (; fragment.getParentFragment() != null; fragment = fragment.getParentFragment())
        {
            if (fragment.getParentFragment() == fragment1)
            {
                return true;
            }
        }

        return false;
    }

    private void b()
    {
        if (f != null)
        {
            f.e.remove(this);
            f = null;
        }
    }

    public final Set a()
    {
        if (f == this)
        {
            return Collections.unmodifiableSet(e);
        }
        if (f == null || android.os.Build.VERSION.SDK_INT < 17)
        {
            return Collections.emptySet();
        }
        HashSet hashset = new HashSet();
        Iterator iterator = f.a().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            axu axu1 = (axu)iterator.next();
            if (a(axu1.getParentFragment()))
            {
                hashset.add(axu1);
            }
        } while (true);
        return Collections.unmodifiableSet(hashset);
    }

    void a(Activity activity)
    {
        b();
        f = axw.a().a(activity.getFragmentManager(), null);
        if (f != this)
        {
            f.e.add(this);
        }
    }

    public final void onAttach(Activity activity)
    {
        super.onAttach(activity);
        a(activity);
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
        b();
    }

    public final void onDetach()
    {
        super.onDetach();
        b();
    }

    public final void onLowMemory()
    {
        if (c != null)
        {
            c.b.onLowMemory();
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

    public final String toString()
    {
        String s = String.valueOf(super.toString());
        Object obj;
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            obj = getParentFragment();
        } else
        {
            obj = null;
        }
        if (obj == null)
        {
            obj = d;
        }
        obj = String.valueOf(obj);
        return (new StringBuilder(String.valueOf(s).length() + 9 + String.valueOf(obj).length())).append(s).append("{parent=").append(((String) (obj))).append("}").toString();
    }
}
