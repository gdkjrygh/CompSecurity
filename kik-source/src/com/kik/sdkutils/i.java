// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.sdkutils;

import android.app.Activity;
import android.support.v4.app.Fragment;
import com.kik.g.p;
import com.kik.g.r;

// Referenced classes of package com.kik.sdkutils:
//            l, j, k

final class i extends r
{

    final Fragment a;
    final p b;

    i(Fragment fragment, p p)
    {
        a = fragment;
        b = p;
        super();
    }

    public final void a(Object obj)
    {
        android.support.v4.app.FragmentActivity fragmentactivity = a.getActivity();
        if (fragmentactivity == null)
        {
            return;
        } else
        {
            fragmentactivity.runOnUiThread(new l(this, obj));
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
            fragmentactivity.runOnUiThread(new j(this));
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
            fragmentactivity.runOnUiThread(new k(this, throwable));
            return;
        }
    }
}
