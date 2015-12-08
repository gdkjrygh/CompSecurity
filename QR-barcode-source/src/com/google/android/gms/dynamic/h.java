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

    private Fragment Lt;

    private h(Fragment fragment)
    {
        Lt = fragment;
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
        Lt.registerForContextMenu(d1);
    }

    public void e(d d1)
    {
        d1 = (View)com.google.android.gms.dynamic.e.f(d1);
        Lt.unregisterForContextMenu(d1);
    }

    public Bundle getArguments()
    {
        return Lt.getArguments();
    }

    public int getId()
    {
        return Lt.getId();
    }

    public boolean getRetainInstance()
    {
        return Lt.getRetainInstance();
    }

    public String getTag()
    {
        return Lt.getTag();
    }

    public int getTargetRequestCode()
    {
        return Lt.getTargetRequestCode();
    }

    public boolean getUserVisibleHint()
    {
        return Lt.getUserVisibleHint();
    }

    public d getView()
    {
        return com.google.android.gms.dynamic.e.k(Lt.getView());
    }

    public boolean isAdded()
    {
        return Lt.isAdded();
    }

    public boolean isDetached()
    {
        return Lt.isDetached();
    }

    public boolean isHidden()
    {
        return Lt.isHidden();
    }

    public boolean isInLayout()
    {
        return Lt.isInLayout();
    }

    public boolean isRemoving()
    {
        return Lt.isRemoving();
    }

    public boolean isResumed()
    {
        return Lt.isResumed();
    }

    public boolean isVisible()
    {
        return Lt.isVisible();
    }

    public d iu()
    {
        return com.google.android.gms.dynamic.e.k(Lt.getActivity());
    }

    public c iv()
    {
        return a(Lt.getParentFragment());
    }

    public d iw()
    {
        return com.google.android.gms.dynamic.e.k(Lt.getResources());
    }

    public c ix()
    {
        return a(Lt.getTargetFragment());
    }

    public void setHasOptionsMenu(boolean flag)
    {
        Lt.setHasOptionsMenu(flag);
    }

    public void setMenuVisibility(boolean flag)
    {
        Lt.setMenuVisibility(flag);
    }

    public void setRetainInstance(boolean flag)
    {
        Lt.setRetainInstance(flag);
    }

    public void setUserVisibleHint(boolean flag)
    {
        Lt.setUserVisibleHint(flag);
    }

    public void startActivity(Intent intent)
    {
        Lt.startActivity(intent);
    }

    public void startActivityForResult(Intent intent, int i)
    {
        Lt.startActivityForResult(intent, i);
    }
}
