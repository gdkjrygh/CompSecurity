// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.dynamic;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

// Referenced classes of package com.google.android.gms.dynamic:
//            e, d, c

public final class b extends c.a
{

    private Fragment Sj;

    private b(Fragment fragment)
    {
        Sj = fragment;
    }

    public static b a(Fragment fragment)
    {
        if (fragment != null)
        {
            return new b(fragment);
        } else
        {
            return null;
        }
    }

    public void d(d d1)
    {
        d1 = (View)com.google.android.gms.dynamic.e.f(d1);
        Sj.registerForContextMenu(d1);
    }

    public void e(d d1)
    {
        d1 = (View)com.google.android.gms.dynamic.e.f(d1);
        Sj.unregisterForContextMenu(d1);
    }

    public Bundle getArguments()
    {
        return Sj.getArguments();
    }

    public int getId()
    {
        return Sj.getId();
    }

    public boolean getRetainInstance()
    {
        return Sj.getRetainInstance();
    }

    public String getTag()
    {
        return Sj.getTag();
    }

    public int getTargetRequestCode()
    {
        return Sj.getTargetRequestCode();
    }

    public boolean getUserVisibleHint()
    {
        return Sj.getUserVisibleHint();
    }

    public d getView()
    {
        return com.google.android.gms.dynamic.e.k(Sj.getView());
    }

    public boolean isAdded()
    {
        return Sj.isAdded();
    }

    public boolean isDetached()
    {
        return Sj.isDetached();
    }

    public boolean isHidden()
    {
        return Sj.isHidden();
    }

    public boolean isInLayout()
    {
        return Sj.isInLayout();
    }

    public boolean isRemoving()
    {
        return Sj.isRemoving();
    }

    public boolean isResumed()
    {
        return Sj.isResumed();
    }

    public boolean isVisible()
    {
        return Sj.isVisible();
    }

    public d iu()
    {
        return com.google.android.gms.dynamic.e.k(Sj.getActivity());
    }

    public c iv()
    {
        return a(Sj.getParentFragment());
    }

    public d iw()
    {
        return com.google.android.gms.dynamic.e.k(Sj.getResources());
    }

    public c ix()
    {
        return a(Sj.getTargetFragment());
    }

    public void setHasOptionsMenu(boolean flag)
    {
        Sj.setHasOptionsMenu(flag);
    }

    public void setMenuVisibility(boolean flag)
    {
        Sj.setMenuVisibility(flag);
    }

    public void setRetainInstance(boolean flag)
    {
        Sj.setRetainInstance(flag);
    }

    public void setUserVisibleHint(boolean flag)
    {
        Sj.setUserVisibleHint(flag);
    }

    public void startActivity(Intent intent)
    {
        Sj.startActivity(intent);
    }

    public void startActivityForResult(Intent intent, int i)
    {
        Sj.startActivityForResult(intent, i);
    }
}
