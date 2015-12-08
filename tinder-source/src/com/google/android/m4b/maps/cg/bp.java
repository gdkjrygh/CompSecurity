// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;

import com.google.android.m4b.maps.df.aa;
import com.google.android.m4b.maps.df.r;
import com.google.android.m4b.maps.model.CameraPosition;
import com.google.android.m4b.maps.model.LatLng;
import com.google.android.m4b.maps.model.LatLngBounds;

// Referenced classes of package com.google.android.m4b.maps.cg:
//            cb

public interface bp
{
    public static interface a
    {

        public abstract void a(bp bp1, int i, cb cb);
    }


    public static final CameraPosition a = CameraPosition.a(new LatLng(0.0D, 0.0D));

    public abstract float a(LatLng latlng);

    public abstract CameraPosition a(LatLngBounds latlngbounds);

    public abstract void a();

    public abstract void a(float f);

    public abstract void a(float f, float f1, int i);

    public abstract void a(float f, int i);

    public abstract void a(float f, int i, int j, int k);

    public abstract void a(int i, int j, int k, int l);

    public abstract void a(a a1, int i, r r, cb cb);

    public abstract void a(aa aa);

    public abstract void a(CameraPosition cameraposition, int i);

    public abstract void a(LatLng latlng, float f, int i);

    public abstract void a(LatLng latlng, int i);

    public abstract void a(LatLngBounds latlngbounds, int i, int j);

    public abstract void a(LatLngBounds latlngbounds, int i, int j, int k, int l);

    public abstract void b(float f, int i);

    public abstract void b(aa aa);

    public abstract CameraPosition c();

    public abstract void c(aa aa);

    public abstract float d();

    public abstract al.a e();

}
