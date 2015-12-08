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

    public final void d(d d1)
    {
        d1 = (View)com.google.android.gms.dynamic.e.f(d1);
        TG.registerForContextMenu(d1);
    }

    public final void e(d d1)
    {
        d1 = (View)com.google.android.gms.dynamic.e.f(d1);
        TG.unregisterForContextMenu(d1);
    }

    public final Bundle getArguments()
    {
        return TG.getArguments();
    }

    public final int getId()
    {
        return TG.getId();
    }

    public final boolean getRetainInstance()
    {
        return TG.getRetainInstance();
    }

    public final String getTag()
    {
        return TG.getTag();
    }

    public final int getTargetRequestCode()
    {
        return TG.getTargetRequestCode();
    }

    public final boolean getUserVisibleHint()
    {
        return TG.getUserVisibleHint();
    }

    public final d getView()
    {
        return com.google.android.gms.dynamic.e.k(TG.getView());
    }

    public final boolean isAdded()
    {
        return TG.isAdded();
    }

    public final boolean isDetached()
    {
        return TG.isDetached();
    }

    public final boolean isHidden()
    {
        return TG.isHidden();
    }

    public final boolean isInLayout()
    {
        return TG.isInLayout();
    }

    public final boolean isRemoving()
    {
        return TG.isRemoving();
    }

    public final boolean isResumed()
    {
        return TG.isResumed();
    }

    public final boolean isVisible()
    {
        return TG.isVisible();
    }

    public final d jf()
    {
        return com.google.android.gms.dynamic.e.k(TG.getActivity());
    }

    public final c jg()
    {
        return a(TG.getParentFragment());
    }

    public final d jh()
    {
        return com.google.android.gms.dynamic.e.k(TG.getResources());
    }

    public final c ji()
    {
        return a(TG.getTargetFragment());
    }

    public final void setHasOptionsMenu(boolean flag)
    {
        TG.setHasOptionsMenu(flag);
    }

    public final void setMenuVisibility(boolean flag)
    {
        TG.setMenuVisibility(flag);
    }

    public final void setRetainInstance(boolean flag)
    {
        TG.setRetainInstance(flag);
    }

    public final void setUserVisibleHint(boolean flag)
    {
        TG.setUserVisibleHint(flag);
    }

    public final void startActivity(Intent intent)
    {
        TG.startActivity(intent);
    }

    public final void startActivityForResult(Intent intent, int i)
    {
        TG.startActivityForResult(intent, i);
    }
}
