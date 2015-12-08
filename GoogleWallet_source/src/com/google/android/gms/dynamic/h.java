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

    private Fragment VB;

    private h(Fragment fragment)
    {
        VB = fragment;
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

    public final void g(d d)
    {
        d = (View)e.i(d);
        VB.registerForContextMenu(d);
    }

    public final Bundle getArguments()
    {
        return VB.getArguments();
    }

    public final int getId()
    {
        return VB.getId();
    }

    public final boolean getRetainInstance()
    {
        return VB.getRetainInstance();
    }

    public final String getTag()
    {
        return VB.getTag();
    }

    public final int getTargetRequestCode()
    {
        return VB.getTargetRequestCode();
    }

    public final boolean getUserVisibleHint()
    {
        return VB.getUserVisibleHint();
    }

    public final d getView()
    {
        return e.q(VB.getView());
    }

    public final void h(d d)
    {
        d = (View)e.i(d);
        Fragment fragment = VB;
        Fragment.unregisterForContextMenu(d);
    }

    public final boolean isAdded()
    {
        return VB.isAdded();
    }

    public final boolean isDetached()
    {
        return VB.isDetached();
    }

    public final boolean isHidden()
    {
        return VB.isHidden();
    }

    public final boolean isInLayout()
    {
        return VB.isInLayout();
    }

    public final boolean isRemoving()
    {
        return VB.isRemoving();
    }

    public final boolean isResumed()
    {
        return VB.isResumed();
    }

    public final boolean isVisible()
    {
        return VB.isVisible();
    }

    public final d lg()
    {
        return e.q(VB.getActivity());
    }

    public final c lh()
    {
        return a(VB.getParentFragment());
    }

    public final d li()
    {
        return e.q(VB.getResources());
    }

    public final c lj()
    {
        return a(VB.getTargetFragment());
    }

    public final void setHasOptionsMenu(boolean flag)
    {
        VB.setHasOptionsMenu(flag);
    }

    public final void setMenuVisibility(boolean flag)
    {
        VB.setMenuVisibility(flag);
    }

    public final void setRetainInstance(boolean flag)
    {
        VB.setRetainInstance(flag);
    }

    public final void setUserVisibleHint(boolean flag)
    {
        VB.setUserVisibleHint(flag);
    }

    public final void startActivity(Intent intent)
    {
        VB.startActivity(intent);
    }

    public final void startActivityForResult(Intent intent, int i)
    {
        VB.startActivityForResult(intent, i);
    }
}
