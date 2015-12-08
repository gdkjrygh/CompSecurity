// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.b;
import com.google.android.gms.location.e;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            nh, nl, ns, oh, 
//            nu, og, nw, ny, 
//            oc, oe, nq

public interface ni
    extends IInterface
{

    public abstract void S(boolean flag);

    public abstract void a(long l, boolean flag, PendingIntent pendingintent);

    public abstract void a(PendingIntent pendingintent);

    public abstract void a(PendingIntent pendingintent, nh nh, String s);

    public abstract void a(Location location, int i);

    public abstract void a(nh nh, String s);

    public abstract void a(nl nl, PendingIntent pendingintent);

    public abstract void a(nl nl, b b1);

    public abstract void a(ns ns, oh oh, PendingIntent pendingintent);

    public abstract void a(nu nu, oh oh, og og);

    public abstract void a(nw nw, oh oh);

    public abstract void a(ny ny, oh oh, PendingIntent pendingintent);

    public abstract void a(oc oc, oh oh, og og);

    public abstract void a(oe oe, LatLngBounds latlngbounds, List list, oh oh, og og);

    public abstract void a(oh oh, PendingIntent pendingintent);

    public abstract void a(GeofencingRequest geofencingrequest, PendingIntent pendingintent, nh nh);

    public abstract void a(LocationRequest locationrequest, PendingIntent pendingintent);

    public abstract void a(LocationRequest locationrequest, b b1);

    public abstract void a(LocationRequest locationrequest, b b1, String s);

    public abstract void a(b b1);

    public abstract void a(LatLng latlng, nu nu, oh oh, og og);

    public abstract void a(LatLngBounds latlngbounds, int i, nu nu, oh oh, og og);

    public abstract void a(LatLngBounds latlngbounds, int i, String s, nu nu, oh oh, og og);

    public abstract void a(String s, oh oh, og og);

    public abstract void a(String s, LatLngBounds latlngbounds, nq nq, oh oh, og og);

    public abstract void a(List list, PendingIntent pendingintent, nh nh, String s);

    public abstract void a(List list, oh oh, og og);

    public abstract void a(String as[], nh nh, String s);

    public abstract void b(PendingIntent pendingintent);

    public abstract void b(Location location);

    public abstract void b(oh oh, PendingIntent pendingintent);

    public abstract void b(String s, oh oh, og og);

    public abstract Location bZ(String s);

    public abstract e ca(String s);

    public abstract Location ni();

    public abstract IBinder nj();

    public abstract IBinder nk();
}
