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

    private Fragment Hz;

    private h(Fragment fragment)
    {
        Hz = fragment;
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

    public void b(d d)
    {
        d = (View)e.d(d);
        Hz.registerForContextMenu(d);
    }

    public void c(d d)
    {
        d = (View)e.d(d);
        Hz.unregisterForContextMenu(d);
    }

    public d fX()
    {
        return e.h(Hz.getActivity());
    }

    public c fY()
    {
        return a(Hz.getParentFragment());
    }

    public d fZ()
    {
        return e.h(Hz.getResources());
    }

    public c ga()
    {
        return a(Hz.getTargetFragment());
    }

    public Bundle getArguments()
    {
        return Hz.getArguments();
    }

    public int getId()
    {
        return Hz.getId();
    }

    public boolean getRetainInstance()
    {
        return Hz.getRetainInstance();
    }

    public String getTag()
    {
        return Hz.getTag();
    }

    public int getTargetRequestCode()
    {
        return Hz.getTargetRequestCode();
    }

    public boolean getUserVisibleHint()
    {
        return Hz.getUserVisibleHint();
    }

    public d getView()
    {
        return e.h(Hz.getView());
    }

    public boolean isAdded()
    {
        return Hz.isAdded();
    }

    public boolean isDetached()
    {
        return Hz.isDetached();
    }

    public boolean isHidden()
    {
        return Hz.isHidden();
    }

    public boolean isInLayout()
    {
        return Hz.isInLayout();
    }

    public boolean isRemoving()
    {
        return Hz.isRemoving();
    }

    public boolean isResumed()
    {
        return Hz.isResumed();
    }

    public boolean isVisible()
    {
        return Hz.isVisible();
    }

    public void setHasOptionsMenu(boolean flag)
    {
        Hz.setHasOptionsMenu(flag);
    }

    public void setMenuVisibility(boolean flag)
    {
        Hz.setMenuVisibility(flag);
    }

    public void setRetainInstance(boolean flag)
    {
        Hz.setRetainInstance(flag);
    }

    public void setUserVisibleHint(boolean flag)
    {
        Hz.setUserVisibleHint(flag);
    }

    public void startActivity(Intent intent)
    {
        Hz.startActivity(intent);
    }

    public void startActivityForResult(Intent intent, int i)
    {
        Hz.startActivityForResult(intent, i);
    }
}
