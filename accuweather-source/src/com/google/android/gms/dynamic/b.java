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

    private Fragment Mg;

    private b(Fragment fragment)
    {
        Mg = fragment;
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

    public void c(d d1)
    {
        d1 = (View)e.e(d1);
        Mg.registerForContextMenu(d1);
    }

    public void d(d d1)
    {
        d1 = (View)e.e(d1);
        Mg.unregisterForContextMenu(d1);
    }

    public d gD()
    {
        return e.h(Mg.getActivity());
    }

    public c gE()
    {
        return a(Mg.getParentFragment());
    }

    public d gF()
    {
        return e.h(Mg.getResources());
    }

    public c gG()
    {
        return a(Mg.getTargetFragment());
    }

    public Bundle getArguments()
    {
        return Mg.getArguments();
    }

    public int getId()
    {
        return Mg.getId();
    }

    public boolean getRetainInstance()
    {
        return Mg.getRetainInstance();
    }

    public String getTag()
    {
        return Mg.getTag();
    }

    public int getTargetRequestCode()
    {
        return Mg.getTargetRequestCode();
    }

    public boolean getUserVisibleHint()
    {
        return Mg.getUserVisibleHint();
    }

    public d getView()
    {
        return e.h(Mg.getView());
    }

    public boolean isAdded()
    {
        return Mg.isAdded();
    }

    public boolean isDetached()
    {
        return Mg.isDetached();
    }

    public boolean isHidden()
    {
        return Mg.isHidden();
    }

    public boolean isInLayout()
    {
        return Mg.isInLayout();
    }

    public boolean isRemoving()
    {
        return Mg.isRemoving();
    }

    public boolean isResumed()
    {
        return Mg.isResumed();
    }

    public boolean isVisible()
    {
        return Mg.isVisible();
    }

    public void setHasOptionsMenu(boolean flag)
    {
        Mg.setHasOptionsMenu(flag);
    }

    public void setMenuVisibility(boolean flag)
    {
        Mg.setMenuVisibility(flag);
    }

    public void setRetainInstance(boolean flag)
    {
        Mg.setRetainInstance(flag);
    }

    public void setUserVisibleHint(boolean flag)
    {
        Mg.setUserVisibleHint(flag);
    }

    public void startActivity(Intent intent)
    {
        Mg.startActivity(intent);
    }

    public void startActivityForResult(Intent intent, int i)
    {
        Mg.startActivityForResult(intent, i);
    }
}
