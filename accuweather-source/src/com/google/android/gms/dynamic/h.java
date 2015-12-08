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

    private Fragment FS;

    private h(Fragment fragment)
    {
        FS = fragment;
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
        FS.registerForContextMenu(d1);
    }

    public void d(d d1)
    {
        d1 = (View)e.e(d1);
        FS.unregisterForContextMenu(d1);
    }

    public d gD()
    {
        return e.h(FS.getActivity());
    }

    public c gE()
    {
        return a(FS.getParentFragment());
    }

    public d gF()
    {
        return e.h(FS.getResources());
    }

    public c gG()
    {
        return a(FS.getTargetFragment());
    }

    public Bundle getArguments()
    {
        return FS.getArguments();
    }

    public int getId()
    {
        return FS.getId();
    }

    public boolean getRetainInstance()
    {
        return FS.getRetainInstance();
    }

    public String getTag()
    {
        return FS.getTag();
    }

    public int getTargetRequestCode()
    {
        return FS.getTargetRequestCode();
    }

    public boolean getUserVisibleHint()
    {
        return FS.getUserVisibleHint();
    }

    public d getView()
    {
        return e.h(FS.getView());
    }

    public boolean isAdded()
    {
        return FS.isAdded();
    }

    public boolean isDetached()
    {
        return FS.isDetached();
    }

    public boolean isHidden()
    {
        return FS.isHidden();
    }

    public boolean isInLayout()
    {
        return FS.isInLayout();
    }

    public boolean isRemoving()
    {
        return FS.isRemoving();
    }

    public boolean isResumed()
    {
        return FS.isResumed();
    }

    public boolean isVisible()
    {
        return FS.isVisible();
    }

    public void setHasOptionsMenu(boolean flag)
    {
        FS.setHasOptionsMenu(flag);
    }

    public void setMenuVisibility(boolean flag)
    {
        FS.setMenuVisibility(flag);
    }

    public void setRetainInstance(boolean flag)
    {
        FS.setRetainInstance(flag);
    }

    public void setUserVisibleHint(boolean flag)
    {
        FS.setUserVisibleHint(flag);
    }

    public void startActivity(Intent intent)
    {
        FS.startActivity(intent);
    }

    public void startActivityForResult(Intent intent, int i)
    {
        FS.startActivityForResult(intent, i);
    }
}
