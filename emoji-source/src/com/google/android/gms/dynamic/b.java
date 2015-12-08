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

    private Fragment Mj;

    private b(Fragment fragment)
    {
        Mj = fragment;
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
        Mj.registerForContextMenu(d1);
    }

    public void d(d d1)
    {
        d1 = (View)e.e(d1);
        Mj.unregisterForContextMenu(d1);
    }

    public d gI()
    {
        return e.h(Mj.getActivity());
    }

    public c gJ()
    {
        return a(Mj.getParentFragment());
    }

    public d gK()
    {
        return e.h(Mj.getResources());
    }

    public c gL()
    {
        return a(Mj.getTargetFragment());
    }

    public Bundle getArguments()
    {
        return Mj.getArguments();
    }

    public int getId()
    {
        return Mj.getId();
    }

    public boolean getRetainInstance()
    {
        return Mj.getRetainInstance();
    }

    public String getTag()
    {
        return Mj.getTag();
    }

    public int getTargetRequestCode()
    {
        return Mj.getTargetRequestCode();
    }

    public boolean getUserVisibleHint()
    {
        return Mj.getUserVisibleHint();
    }

    public d getView()
    {
        return e.h(Mj.getView());
    }

    public boolean isAdded()
    {
        return Mj.isAdded();
    }

    public boolean isDetached()
    {
        return Mj.isDetached();
    }

    public boolean isHidden()
    {
        return Mj.isHidden();
    }

    public boolean isInLayout()
    {
        return Mj.isInLayout();
    }

    public boolean isRemoving()
    {
        return Mj.isRemoving();
    }

    public boolean isResumed()
    {
        return Mj.isResumed();
    }

    public boolean isVisible()
    {
        return Mj.isVisible();
    }

    public void setHasOptionsMenu(boolean flag)
    {
        Mj.setHasOptionsMenu(flag);
    }

    public void setMenuVisibility(boolean flag)
    {
        Mj.setMenuVisibility(flag);
    }

    public void setRetainInstance(boolean flag)
    {
        Mj.setRetainInstance(flag);
    }

    public void setUserVisibleHint(boolean flag)
    {
        Mj.setUserVisibleHint(flag);
    }

    public void startActivity(Intent intent)
    {
        Mj.startActivity(intent);
    }

    public void startActivityForResult(Intent intent, int i)
    {
        Mj.startActivityForResult(intent, i);
    }
}
