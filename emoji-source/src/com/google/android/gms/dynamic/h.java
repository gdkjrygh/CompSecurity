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

    private Fragment FV;

    private h(Fragment fragment)
    {
        FV = fragment;
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

    public void c(d d1)
    {
        d1 = (View)e.e(d1);
        FV.registerForContextMenu(d1);
    }

    public void d(d d1)
    {
        d1 = (View)e.e(d1);
        FV.unregisterForContextMenu(d1);
    }

    public d gI()
    {
        return e.h(FV.getActivity());
    }

    public c gJ()
    {
        return a(FV.getParentFragment());
    }

    public d gK()
    {
        return e.h(FV.getResources());
    }

    public c gL()
    {
        return a(FV.getTargetFragment());
    }

    public Bundle getArguments()
    {
        return FV.getArguments();
    }

    public int getId()
    {
        return FV.getId();
    }

    public boolean getRetainInstance()
    {
        return FV.getRetainInstance();
    }

    public String getTag()
    {
        return FV.getTag();
    }

    public int getTargetRequestCode()
    {
        return FV.getTargetRequestCode();
    }

    public boolean getUserVisibleHint()
    {
        return FV.getUserVisibleHint();
    }

    public d getView()
    {
        return e.h(FV.getView());
    }

    public boolean isAdded()
    {
        return FV.isAdded();
    }

    public boolean isDetached()
    {
        return FV.isDetached();
    }

    public boolean isHidden()
    {
        return FV.isHidden();
    }

    public boolean isInLayout()
    {
        return FV.isInLayout();
    }

    public boolean isRemoving()
    {
        return FV.isRemoving();
    }

    public boolean isResumed()
    {
        return FV.isResumed();
    }

    public boolean isVisible()
    {
        return FV.isVisible();
    }

    public void setHasOptionsMenu(boolean flag)
    {
        FV.setHasOptionsMenu(flag);
    }

    public void setMenuVisibility(boolean flag)
    {
        FV.setMenuVisibility(flag);
    }

    public void setRetainInstance(boolean flag)
    {
        FV.setRetainInstance(flag);
    }

    public void setUserVisibleHint(boolean flag)
    {
        FV.setUserVisibleHint(flag);
    }

    public void startActivity(Intent intent)
    {
        FV.startActivity(intent);
    }

    public void startActivityForResult(Intent intent, int i)
    {
        FV.startActivityForResult(intent, i);
    }
}
