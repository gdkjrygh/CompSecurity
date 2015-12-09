// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.dynamic;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

// Referenced classes of package com.google.android.gms.dynamic:
//            zze, zzd, zzc

public final class zzb extends zzc.zza
{

    private Fragment zzacp;

    private zzb(Fragment fragment)
    {
        zzacp = fragment;
    }

    public static zzb zza(Fragment fragment)
    {
        if (fragment != null)
        {
            return new zzb(fragment);
        } else
        {
            return null;
        }
    }

    public Bundle getArguments()
    {
        return zzacp.getArguments();
    }

    public int getId()
    {
        return zzacp.getId();
    }

    public boolean getRetainInstance()
    {
        return zzacp.getRetainInstance();
    }

    public String getTag()
    {
        return zzacp.getTag();
    }

    public int getTargetRequestCode()
    {
        return zzacp.getTargetRequestCode();
    }

    public boolean getUserVisibleHint()
    {
        return zzacp.getUserVisibleHint();
    }

    public zzd getView()
    {
        return com.google.android.gms.dynamic.zze.zzt(zzacp.getView());
    }

    public boolean isAdded()
    {
        return zzacp.isAdded();
    }

    public boolean isDetached()
    {
        return zzacp.isDetached();
    }

    public boolean isHidden()
    {
        return zzacp.isHidden();
    }

    public boolean isInLayout()
    {
        return zzacp.isInLayout();
    }

    public boolean isRemoving()
    {
        return zzacp.isRemoving();
    }

    public boolean isResumed()
    {
        return zzacp.isResumed();
    }

    public boolean isVisible()
    {
        return zzacp.isVisible();
    }

    public void setHasOptionsMenu(boolean flag)
    {
        zzacp.setHasOptionsMenu(flag);
    }

    public void setMenuVisibility(boolean flag)
    {
        zzacp.setMenuVisibility(flag);
    }

    public void setRetainInstance(boolean flag)
    {
        zzacp.setRetainInstance(flag);
    }

    public void setUserVisibleHint(boolean flag)
    {
        zzacp.setUserVisibleHint(flag);
    }

    public void startActivity(Intent intent)
    {
        zzacp.startActivity(intent);
    }

    public void startActivityForResult(Intent intent, int i)
    {
        zzacp.startActivityForResult(intent, i);
    }

    public void zze(zzd zzd)
    {
        zzd = (View)com.google.android.gms.dynamic.zze.zzg(zzd);
        zzacp.registerForContextMenu(zzd);
    }

    public void zzf(zzd zzd)
    {
        zzd = (View)com.google.android.gms.dynamic.zze.zzg(zzd);
        zzacp.unregisterForContextMenu(zzd);
    }

    public zzd zzov()
    {
        return com.google.android.gms.dynamic.zze.zzt(zzacp.getActivity());
    }

    public zzc zzow()
    {
        return zza(zzacp.getParentFragment());
    }

    public zzd zzox()
    {
        return com.google.android.gms.dynamic.zze.zzt(zzacp.getResources());
    }

    public zzc zzoy()
    {
        return zza(zzacp.getTargetFragment());
    }
}
