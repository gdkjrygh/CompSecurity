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

    private Fragment TG;

    private b(Fragment fragment)
    {
        TG = fragment;
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
        TG.registerForContextMenu(d1);
    }

    public void e(d d1)
    {
        d1 = (View)com.google.android.gms.dynamic.e.f(d1);
        TG.unregisterForContextMenu(d1);
    }

    public Bundle getArguments()
    {
        return TG.getArguments();
    }

    public int getId()
    {
        return TG.getId();
    }

    public boolean getRetainInstance()
    {
        return TG.getRetainInstance();
    }

    public String getTag()
    {
        return TG.getTag();
    }

    public int getTargetRequestCode()
    {
        return TG.getTargetRequestCode();
    }

    public boolean getUserVisibleHint()
    {
        return TG.getUserVisibleHint();
    }

    public d getView()
    {
        return com.google.android.gms.dynamic.e.k(TG.getView());
    }

    public boolean isAdded()
    {
        return TG.isAdded();
    }

    public boolean isDetached()
    {
        return TG.isDetached();
    }

    public boolean isHidden()
    {
        return TG.isHidden();
    }

    public boolean isInLayout()
    {
        return TG.isInLayout();
    }

    public boolean isRemoving()
    {
        return TG.isRemoving();
    }

    public boolean isResumed()
    {
        return TG.isResumed();
    }

    public boolean isVisible()
    {
        return TG.isVisible();
    }

    public d jf()
    {
        return com.google.android.gms.dynamic.e.k(TG.getActivity());
    }

    public c jg()
    {
        return a(TG.getParentFragment());
    }

    public d jh()
    {
        return com.google.android.gms.dynamic.e.k(TG.getResources());
    }

    public c ji()
    {
        return a(TG.getTargetFragment());
    }

    public void setHasOptionsMenu(boolean flag)
    {
        TG.setHasOptionsMenu(flag);
    }

    public void setMenuVisibility(boolean flag)
    {
        TG.setMenuVisibility(flag);
    }

    public void setRetainInstance(boolean flag)
    {
        TG.setRetainInstance(flag);
    }

    public void setUserVisibleHint(boolean flag)
    {
        TG.setUserVisibleHint(flag);
    }

    public void startActivity(Intent intent)
    {
        TG.startActivity(intent);
    }

    public void startActivityForResult(Intent intent, int i)
    {
        TG.startActivityForResult(intent, i);
    }
}
