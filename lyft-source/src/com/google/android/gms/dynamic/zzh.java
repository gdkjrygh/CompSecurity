// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.dynamic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;

// Referenced classes of package com.google.android.gms.dynamic:
//            zze, zzd, zzc

public final class zzh extends zzc.zza
{

    private Fragment a;

    private zzh(Fragment fragment)
    {
        a = fragment;
    }

    public static zzh a(Fragment fragment)
    {
        if (fragment != null)
        {
            return new zzh(fragment);
        } else
        {
            return null;
        }
    }

    public zzd a()
    {
        return zze.a(a.getActivity());
    }

    public void a(Intent intent)
    {
        a.startActivity(intent);
    }

    public void a(Intent intent, int i1)
    {
        a.startActivityForResult(intent, i1);
    }

    public void a(zzd zzd)
    {
        zzd = (View)zze.a(zzd);
        a.registerForContextMenu(zzd);
    }

    public void a(boolean flag)
    {
        a.setHasOptionsMenu(flag);
    }

    public Bundle b()
    {
        return a.getArguments();
    }

    public void b(zzd zzd)
    {
        zzd = (View)zze.a(zzd);
        a.unregisterForContextMenu(zzd);
    }

    public void b(boolean flag)
    {
        a.setMenuVisibility(flag);
    }

    public int c()
    {
        return a.getId();
    }

    public void c(boolean flag)
    {
        a.setRetainInstance(flag);
    }

    public zzc d()
    {
        return a(a.getParentFragment());
    }

    public void d(boolean flag)
    {
        a.setUserVisibleHint(flag);
    }

    public zzd e()
    {
        return zze.a(a.getResources());
    }

    public boolean f()
    {
        return a.getRetainInstance();
    }

    public String g()
    {
        return a.getTag();
    }

    public zzc h()
    {
        return a(a.getTargetFragment());
    }

    public int i()
    {
        return a.getTargetRequestCode();
    }

    public boolean j()
    {
        return a.getUserVisibleHint();
    }

    public zzd k()
    {
        return zze.a(a.getView());
    }

    public boolean l()
    {
        return a.isAdded();
    }

    public boolean m()
    {
        return a.isDetached();
    }

    public boolean n()
    {
        return a.isHidden();
    }

    public boolean o()
    {
        return a.isInLayout();
    }

    public boolean p()
    {
        return a.isRemoving();
    }

    public boolean q()
    {
        return a.isResumed();
    }

    public boolean r()
    {
        return a.isVisible();
    }
}
