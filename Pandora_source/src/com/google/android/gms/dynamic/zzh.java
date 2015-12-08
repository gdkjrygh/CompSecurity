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

    private Fragment zzTb;

    private zzh(Fragment fragment)
    {
        zzTb = fragment;
    }

    public static zzh zza(Fragment fragment)
    {
        if (fragment != null)
        {
            return new zzh(fragment);
        } else
        {
            return null;
        }
    }

    public Bundle getArguments()
    {
        return zzTb.getArguments();
    }

    public int getId()
    {
        return zzTb.getId();
    }

    public boolean getRetainInstance()
    {
        return zzTb.getRetainInstance();
    }

    public String getTag()
    {
        return zzTb.getTag();
    }

    public int getTargetRequestCode()
    {
        return zzTb.getTargetRequestCode();
    }

    public boolean getUserVisibleHint()
    {
        return zzTb.getUserVisibleHint();
    }

    public zzd getView()
    {
        return com.google.android.gms.dynamic.zze.zzt(zzTb.getView());
    }

    public boolean isAdded()
    {
        return zzTb.isAdded();
    }

    public boolean isDetached()
    {
        return zzTb.isDetached();
    }

    public boolean isHidden()
    {
        return zzTb.isHidden();
    }

    public boolean isInLayout()
    {
        return zzTb.isInLayout();
    }

    public boolean isRemoving()
    {
        return zzTb.isRemoving();
    }

    public boolean isResumed()
    {
        return zzTb.isResumed();
    }

    public boolean isVisible()
    {
        return zzTb.isVisible();
    }

    public void setHasOptionsMenu(boolean flag)
    {
        zzTb.setHasOptionsMenu(flag);
    }

    public void setMenuVisibility(boolean flag)
    {
        zzTb.setMenuVisibility(flag);
    }

    public void setRetainInstance(boolean flag)
    {
        zzTb.setRetainInstance(flag);
    }

    public void setUserVisibleHint(boolean flag)
    {
        zzTb.setUserVisibleHint(flag);
    }

    public void startActivity(Intent intent)
    {
        zzTb.startActivity(intent);
    }

    public void startActivityForResult(Intent intent, int i)
    {
        zzTb.startActivityForResult(intent, i);
    }

    public void zze(zzd zzd)
    {
        zzd = (View)com.google.android.gms.dynamic.zze.zzg(zzd);
        zzTb.registerForContextMenu(zzd);
    }

    public void zzf(zzd zzd)
    {
        zzd = (View)com.google.android.gms.dynamic.zze.zzg(zzd);
        zzTb.unregisterForContextMenu(zzd);
    }

    public zzd zzov()
    {
        return com.google.android.gms.dynamic.zze.zzt(zzTb.getActivity());
    }

    public zzc zzow()
    {
        return zza(zzTb.getParentFragment());
    }

    public zzd zzox()
    {
        return com.google.android.gms.dynamic.zze.zzt(zzTb.getResources());
    }

    public zzc zzoy()
    {
        return zza(zzTb.getTargetFragment());
    }
}
