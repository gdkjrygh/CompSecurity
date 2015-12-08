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

    public void d(d d1)
    {
        d1 = (View)com.google.android.gms.dynamic.e.f(d1);
        Mx.registerForContextMenu(d1);
    }

    public void e(d d1)
    {
        d1 = (View)com.google.android.gms.dynamic.e.f(d1);
        Mx.unregisterForContextMenu(d1);
    }

    public Bundle getArguments()
    {
        return Mx.getArguments();
    }

    public int getId()
    {
        return Mx.getId();
    }

    public boolean getRetainInstance()
    {
        return Mx.getRetainInstance();
    }

    public String getTag()
    {
        return Mx.getTag();
    }

    public int getTargetRequestCode()
    {
        return Mx.getTargetRequestCode();
    }

    public boolean getUserVisibleHint()
    {
        return Mx.getUserVisibleHint();
    }

    public d getView()
    {
        return com.google.android.gms.dynamic.e.k(Mx.getView());
    }

    public boolean isAdded()
    {
        return Mx.isAdded();
    }

    public boolean isDetached()
    {
        return Mx.isDetached();
    }

    public boolean isHidden()
    {
        return Mx.isHidden();
    }

    public boolean isInLayout()
    {
        return Mx.isInLayout();
    }

    public boolean isRemoving()
    {
        return Mx.isRemoving();
    }

    public boolean isResumed()
    {
        return Mx.isResumed();
    }

    public boolean isVisible()
    {
        return Mx.isVisible();
    }

    public d jf()
    {
        return com.google.android.gms.dynamic.e.k(Mx.getActivity());
    }

    public c jg()
    {
        return a(Mx.getParentFragment());
    }

    public d jh()
    {
        return com.google.android.gms.dynamic.e.k(Mx.getResources());
    }

    public c ji()
    {
        return a(Mx.getTargetFragment());
    }

    public void setHasOptionsMenu(boolean flag)
    {
        Mx.setHasOptionsMenu(flag);
    }

    public void setMenuVisibility(boolean flag)
    {
        Mx.setMenuVisibility(flag);
    }

    public void setRetainInstance(boolean flag)
    {
        Mx.setRetainInstance(flag);
    }

    public void setUserVisibleHint(boolean flag)
    {
        Mx.setUserVisibleHint(flag);
    }

    public void startActivity(Intent intent)
    {
        Mx.startActivity(intent);
    }

    public void startActivityForResult(Intent intent, int i)
    {
        Mx.startActivityForResult(intent, i);
    }
}
