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

    private Fragment afI;

    private b(Fragment fragment)
    {
        afI = fragment;
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

    public final void g(d d)
    {
        d = (View)e.i(d);
        afI.registerForContextMenu(d);
    }

    public final Bundle getArguments()
    {
        return afI.getArguments();
    }

    public final int getId()
    {
        return afI.getId();
    }

    public final boolean getRetainInstance()
    {
        return afI.getRetainInstance();
    }

    public final String getTag()
    {
        return afI.getTag();
    }

    public final int getTargetRequestCode()
    {
        return afI.getTargetRequestCode();
    }

    public final boolean getUserVisibleHint()
    {
        return afI.getUserVisibleHint();
    }

    public final d getView()
    {
        return e.q(afI.getView());
    }

    public final void h(d d)
    {
        d = (View)e.i(d);
        afI.unregisterForContextMenu(d);
    }

    public final boolean isAdded()
    {
        return afI.isAdded();
    }

    public final boolean isDetached()
    {
        return afI.isDetached();
    }

    public final boolean isHidden()
    {
        return afI.isHidden();
    }

    public final boolean isInLayout()
    {
        return afI.isInLayout();
    }

    public final boolean isRemoving()
    {
        return afI.isRemoving();
    }

    public final boolean isResumed()
    {
        return afI.isResumed();
    }

    public final boolean isVisible()
    {
        return afI.isVisible();
    }

    public final d lg()
    {
        return e.q(afI.getActivity());
    }

    public final c lh()
    {
        return a(afI.getParentFragment());
    }

    public final d li()
    {
        return e.q(afI.getResources());
    }

    public final c lj()
    {
        return a(afI.getTargetFragment());
    }

    public final void setHasOptionsMenu(boolean flag)
    {
        afI.setHasOptionsMenu(flag);
    }

    public final void setMenuVisibility(boolean flag)
    {
        afI.setMenuVisibility(flag);
    }

    public final void setRetainInstance(boolean flag)
    {
        afI.setRetainInstance(flag);
    }

    public final void setUserVisibleHint(boolean flag)
    {
        afI.setUserVisibleHint(flag);
    }

    public final void startActivity(Intent intent)
    {
        afI.startActivity(intent);
    }

    public final void startActivityForResult(Intent intent, int i)
    {
        afI.startActivityForResult(intent, i);
    }
}
