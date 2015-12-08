// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.dynamic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;

// Referenced classes of package com.google.android.gms.dynamic:
//            e, d, c

public final class h extends c.a
{

    private Fragment Mx;

    private h(Fragment fragment)
    {
        Mx = fragment;
    }

    public static h a(Fragment fragment)
    {
        if (fragment != null)
        {
            return new h(fragment);
        } else
        {
            return null;
        }
    }

    public final void d(d d1)
    {
        d1 = (View)com.google.android.gms.dynamic.e.f(d1);
        Mx.registerForContextMenu(d1);
    }

    public final void e(d d1)
    {
        d1 = (View)com.google.android.gms.dynamic.e.f(d1);
        Mx.unregisterForContextMenu(d1);
    }

    public final Bundle getArguments()
    {
        return Mx.getArguments();
    }

    public final int getId()
    {
        return Mx.getId();
    }

    public final boolean getRetainInstance()
    {
        return Mx.getRetainInstance();
    }

    public final String getTag()
    {
        return Mx.getTag();
    }

    public final int getTargetRequestCode()
    {
        return Mx.getTargetRequestCode();
    }

    public final boolean getUserVisibleHint()
    {
        return Mx.getUserVisibleHint();
    }

    public final d getView()
    {
        return com.google.android.gms.dynamic.e.k(Mx.getView());
    }

    public final boolean isAdded()
    {
        return Mx.isAdded();
    }

    public final boolean isDetached()
    {
        return Mx.isDetached();
    }

    public final boolean isHidden()
    {
        return Mx.isHidden();
    }

    public final boolean isInLayout()
    {
        return Mx.isInLayout();
    }

    public final boolean isRemoving()
    {
        return Mx.isRemoving();
    }

    public final boolean isResumed()
    {
        return Mx.isResumed();
    }

    public final boolean isVisible()
    {
        return Mx.isVisible();
    }

    public final d jf()
    {
        return com.google.android.gms.dynamic.e.k(Mx.getActivity());
    }

    public final c jg()
    {
        return a(Mx.getParentFragment());
    }

    public final d jh()
    {
        return com.google.android.gms.dynamic.e.k(Mx.getResources());
    }

    public final c ji()
    {
        return a(Mx.getTargetFragment());
    }

    public final void setHasOptionsMenu(boolean flag)
    {
        Mx.setHasOptionsMenu(flag);
    }

    public final void setMenuVisibility(boolean flag)
    {
        Mx.setMenuVisibility(flag);
    }

    public final void setRetainInstance(boolean flag)
    {
        Mx.setRetainInstance(flag);
    }

    public final void setUserVisibleHint(boolean flag)
    {
        Mx.setUserVisibleHint(flag);
    }

    public final void startActivity(Intent intent)
    {
        Mx.startActivity(intent);
    }

    public final void startActivityForResult(Intent intent, int i)
    {
        Mx.startActivityForResult(intent, i);
    }
}
