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

    private Fragment Hv;

    private b(Fragment fragment)
    {
        Hv = fragment;
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

    public void b(d d)
    {
        d = (View)e.d(d);
        Hv.registerForContextMenu(d);
    }

    public void c(d d)
    {
        d = (View)e.d(d);
        Hv.unregisterForContextMenu(d);
    }

    public d fX()
    {
        return e.h(Hv.getActivity());
    }

    public c fY()
    {
        return a(Hv.getParentFragment());
    }

    public d fZ()
    {
        return e.h(Hv.getResources());
    }

    public c ga()
    {
        return a(Hv.getTargetFragment());
    }

    public Bundle getArguments()
    {
        return Hv.getArguments();
    }

    public int getId()
    {
        return Hv.getId();
    }

    public boolean getRetainInstance()
    {
        return Hv.getRetainInstance();
    }

    public String getTag()
    {
        return Hv.getTag();
    }

    public int getTargetRequestCode()
    {
        return Hv.getTargetRequestCode();
    }

    public boolean getUserVisibleHint()
    {
        return Hv.getUserVisibleHint();
    }

    public d getView()
    {
        return e.h(Hv.getView());
    }

    public boolean isAdded()
    {
        return Hv.isAdded();
    }

    public boolean isDetached()
    {
        return Hv.isDetached();
    }

    public boolean isHidden()
    {
        return Hv.isHidden();
    }

    public boolean isInLayout()
    {
        return Hv.isInLayout();
    }

    public boolean isRemoving()
    {
        return Hv.isRemoving();
    }

    public boolean isResumed()
    {
        return Hv.isResumed();
    }

    public boolean isVisible()
    {
        return Hv.isVisible();
    }

    public void setHasOptionsMenu(boolean flag)
    {
        Hv.setHasOptionsMenu(flag);
    }

    public void setMenuVisibility(boolean flag)
    {
        Hv.setMenuVisibility(flag);
    }

    public void setRetainInstance(boolean flag)
    {
        Hv.setRetainInstance(flag);
    }

    public void setUserVisibleHint(boolean flag)
    {
        Hv.setUserVisibleHint(flag);
    }

    public void startActivity(Intent intent)
    {
        Hv.startActivity(intent);
    }

    public void startActivityForResult(Intent intent, int i)
    {
        Hv.startActivityForResult(intent, i);
    }
}
