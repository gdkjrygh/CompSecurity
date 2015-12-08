// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.internal;

import android.location.Location;
import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.TileOverlayOptions;
import com.google.android.gms.maps.model.internal.CameraUpdateParcelable;
import com.google.android.gms.maps.model.internal.GroundOverlayOptionsParcelable;
import com.google.android.gms.maps.model.internal.IPolylineDelegate;
import com.google.android.gms.maps.model.internal.MarkerOptionsParcelable;
import com.google.android.gms.maps.model.internal.zze;
import com.google.android.gms.maps.model.internal.zzf;
import com.google.android.gms.maps.model.internal.zzg;
import com.google.android.gms.maps.model.internal.zzi;
import com.google.android.gms.maps.model.internal.zzj;
import com.google.android.gms.maps.model.internal.zzk;

// Referenced classes of package com.google.android.gms.maps.internal:
//            zzb, ILocationSourceDelegate, zzd, zze, 
//            zzf, zzg, zzh, zzj, 
//            zzk, zzl, zzm, zzn, 
//            zzo, zzp, zzq, zzw, 
//            IUiSettingsDelegate, IProjectionDelegate

public interface IGoogleMapDelegate
    extends IInterface
{

    public abstract CameraPosition a();

    public abstract IPolylineDelegate a(PolylineOptions polylineoptions);

    public abstract zze a(CircleOptions circleoptions);

    public abstract zzf a(GroundOverlayOptions groundoverlayoptions);

    public abstract zzf a(GroundOverlayOptions groundoverlayoptions, GroundOverlayOptionsParcelable groundoverlayoptionsparcelable);

    public abstract zzi a(MarkerOptions markeroptions);

    public abstract zzi a(MarkerOptions markeroptions, MarkerOptionsParcelable markeroptionsparcelable);

    public abstract zzj a(PolygonOptions polygonoptions);

    public abstract zzk a(TileOverlayOptions tileoverlayoptions);

    public abstract void a(int i1);

    public abstract void a(int i1, int j1, int k1, int l1);

    public abstract void a(Bundle bundle);

    public abstract void a(zzd zzd);

    public abstract void a(zzd zzd, int i1, zzb zzb);

    public abstract void a(zzd zzd, zzb zzb);

    public abstract void a(ILocationSourceDelegate ilocationsourcedelegate);

    public abstract void a(com.google.android.gms.maps.internal.zzd zzd);

    public abstract void a(com.google.android.gms.maps.internal.zze zze);

    public abstract void a(com.google.android.gms.maps.internal.zzf zzf);

    public abstract void a(com.google.android.gms.maps.internal.zzg zzg);

    public abstract void a(zzh zzh);

    public abstract void a(com.google.android.gms.maps.internal.zzj zzj);

    public abstract void a(com.google.android.gms.maps.internal.zzk zzk);

    public abstract void a(zzl zzl);

    public abstract void a(zzm zzm);

    public abstract void a(zzn zzn);

    public abstract void a(zzo zzo);

    public abstract void a(zzp zzp);

    public abstract void a(zzq zzq);

    public abstract void a(zzw zzw, zzd zzd);

    public abstract void a(CameraUpdateParcelable cameraupdateparcelable);

    public abstract void a(CameraUpdateParcelable cameraupdateparcelable, int i1, zzb zzb);

    public abstract void a(CameraUpdateParcelable cameraupdateparcelable, zzb zzb);

    public abstract void a(String s1);

    public abstract void a(boolean flag);

    public abstract float b();

    public abstract void b(Bundle bundle);

    public abstract void b(zzd zzd);

    public abstract void b(CameraUpdateParcelable cameraupdateparcelable);

    public abstract boolean b(boolean flag);

    public abstract float c();

    public abstract void c(boolean flag);

    public abstract void d();

    public abstract void d(boolean flag);

    public abstract void e();

    public abstract int f();

    public abstract boolean g();

    public abstract boolean h();

    public abstract boolean i();

    public abstract Location j();

    public abstract IUiSettingsDelegate k();

    public abstract IProjectionDelegate l();

    public abstract boolean m();

    public abstract zzg n();

    public abstract void o();

    public abstract void p();

    public abstract void q();

    public abstract void r();

    public abstract boolean s();
}
