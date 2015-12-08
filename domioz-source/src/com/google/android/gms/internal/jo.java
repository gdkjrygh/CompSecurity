// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.s;
import com.google.android.gms.location.zzb;
import com.google.android.gms.location.zzl;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            jl, zzpg, zzpi, jr

public interface jo
    extends IInterface
{

    public abstract Location a();

    public abstract Location a(String s);

    public abstract Status a(zzb zzb, PendingIntent pendingintent);

    public abstract void a(long l, boolean flag, PendingIntent pendingintent);

    public abstract void a(PendingIntent pendingintent);

    public abstract void a(PendingIntent pendingintent, jl jl, String s);

    public abstract void a(Location location);

    public abstract void a(Location location, int i);

    public abstract void a(jl jl, String s);

    public abstract void a(zzpg zzpg, PendingIntent pendingintent);

    public abstract void a(zzpg zzpg, s s);

    public abstract void a(zzpi zzpi);

    public abstract void a(GeofencingRequest geofencingrequest, PendingIntent pendingintent, jl jl);

    public abstract void a(LocationRequest locationrequest, PendingIntent pendingintent);

    public abstract void a(LocationRequest locationrequest, s s);

    public abstract void a(LocationRequest locationrequest, s s, String s1);

    public abstract void a(LocationSettingsRequest locationsettingsrequest, jr jr, String s);

    public abstract void a(s s);

    public abstract void a(List list, PendingIntent pendingintent, jl jl, String s);

    public abstract void a(boolean flag);

    public abstract void a(String as[], jl jl, String s);

    public abstract IBinder b();

    public abstract Status b(PendingIntent pendingintent);

    public abstract zzl b(String s);

    public abstract void c(PendingIntent pendingintent);
}
