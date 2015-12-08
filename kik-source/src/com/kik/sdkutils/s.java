// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.sdkutils;

import android.app.Activity;
import android.support.v4.app.Fragment;
import com.kik.g.r;

// Referenced classes of package com.kik.sdkutils:
//            t, x, w, u, 
//            v

final class s extends r
{

    final Fragment a;
    final r b;

    s(Fragment fragment, r r1)
    {
        a = fragment;
        b = r1;
        super();
    }

    public final void a()
    {
        android.support.v4.app.FragmentActivity fragmentactivity = a.getActivity();
        if (fragmentactivity == null)
        {
            return;
        } else
        {
            fragmentactivity.runOnUiThread(new t(this));
            return;
        }
    }

    public final void a(Object obj)
    {
        android.support.v4.app.FragmentActivity fragmentactivity = a.getActivity();
        if (fragmentactivity == null)
        {
            return;
        } else
        {
            fragmentactivity.runOnUiThread(new x(this, obj));
            return;
        }
    }

    public final void a(Throwable throwable)
    {
        android.support.v4.app.FragmentActivity fragmentactivity = a.getActivity();
        if (fragmentactivity == null)
        {
            return;
        } else
        {
            fragmentactivity.runOnUiThread(new w(this, throwable));
            return;
        }
    }

    public final void b()
    {
        android.support.v4.app.FragmentActivity fragmentactivity = a.getActivity();
        if (fragmentactivity == null)
        {
            return;
        } else
        {
            fragmentactivity.runOnUiThread(new u(this));
            return;
        }
    }

    public final void b(Throwable throwable)
    {
        android.support.v4.app.FragmentActivity fragmentactivity = a.getActivity();
        if (fragmentactivity == null)
        {
            return;
        } else
        {
            fragmentactivity.runOnUiThread(new v(this, throwable));
            return;
        }
    }
}
