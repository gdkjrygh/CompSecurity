// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.location.Location;
import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.TileOverlayOptions;
import com.google.android.gms.maps.model.internal.CameraUpdateParcelable;
import com.google.android.gms.maps.model.internal.GroundOverlayOptionsParcelable;
import com.google.android.gms.maps.model.internal.MarkerOptionsParcelable;

public interface auc
    extends IInterface
{

    public abstract aye a(PolylineOptions polylineoptions);

    public abstract ayn a(CircleOptions circleoptions);

    public abstract ayq a(GroundOverlayOptions groundoverlayoptions);

    public abstract ayq a(GroundOverlayOptions groundoverlayoptions, GroundOverlayOptionsParcelable groundoverlayoptionsparcelable);

    public abstract ayw a(MarkerOptions markeroptions);

    public abstract ayw a(MarkerOptions markeroptions, MarkerOptionsParcelable markeroptionsparcelable);

    public abstract ayz a(PolygonOptions polygonoptions);

    public abstract azc a(TileOverlayOptions tileoverlayoptions);

    public abstract CameraPosition a();

    public abstract void a(int i1);

    public abstract void a(int i1, int j1, int k1, int l1);

    public abstract void a(aaf aaf);

    public abstract void a(aaf aaf, int i1, avg avg);

    public abstract void a(aaf aaf, avg avg);

    public abstract void a(Bundle bundle);

    public abstract void a(auf auf);

    public abstract void a(avm avm);

    public abstract void a(avp avp);

    public abstract void a(avs avs);

    public abstract void a(avv avv);

    public abstract void a(avy avy);

    public abstract void a(awe awe);

    public abstract void a(awh awh);

    public abstract void a(awk awk);

    public abstract void a(awn awn);

    public abstract void a(awq awq);

    public abstract void a(awt awt);

    public abstract void a(aww aww);

    public abstract void a(awz awz);

    public abstract void a(axr axr, aaf aaf);

    public abstract void a(CameraUpdateParcelable cameraupdateparcelable);

    public abstract void a(CameraUpdateParcelable cameraupdateparcelable, int i1, avg avg);

    public abstract void a(CameraUpdateParcelable cameraupdateparcelable, avg avg);

    public abstract void a(String s1);

    public abstract void a(boolean flag);

    public abstract float b();

    public abstract void b(aaf aaf);

    public abstract void b(Bundle bundle);

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

    public abstract ava k();

    public abstract auo l();

    public abstract boolean m();

    public abstract ayt n();

    public abstract void o();

    public abstract void p();

    public abstract void q();

    public abstract void r();

    public abstract boolean s();
}
