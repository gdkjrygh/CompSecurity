// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.GestureRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.zzd;
import java.util.List;

// Referenced classes of package com.google.android.gms.location.internal:
//            zzf, zzh, LocationRequestInternal, LocationRequestUpdateData

public interface zzg
    extends IInterface
{

    public abstract Location a();

    public abstract Status a(GestureRequest gesturerequest, PendingIntent pendingintent);

    public abstract ActivityRecognitionResult a(String s);

    public abstract void a(long l, boolean flag, PendingIntent pendingintent);

    public abstract void a(PendingIntent pendingintent);

    public abstract void a(PendingIntent pendingintent, zzf zzf, String s);

    public abstract void a(Location location);

    public abstract void a(Location location, int i);

    public abstract void a(GeofencingRequest geofencingrequest, PendingIntent pendingintent, zzf zzf);

    public abstract void a(LocationRequest locationrequest, PendingIntent pendingintent);

    public abstract void a(LocationRequest locationrequest, zzd zzd);

    public abstract void a(LocationRequest locationrequest, zzd zzd, String s);

    public abstract void a(LocationSettingsRequest locationsettingsrequest, zzh zzh, String s);

    public abstract void a(LocationRequestInternal locationrequestinternal, PendingIntent pendingintent);

    public abstract void a(LocationRequestInternal locationrequestinternal, zzd zzd);

    public abstract void a(LocationRequestUpdateData locationrequestupdatedata);

    public abstract void a(zzf zzf, String s);

    public abstract void a(zzd zzd);

    public abstract void a(List list, PendingIntent pendingintent, zzf zzf, String s);

    public abstract void a(boolean flag);

    public abstract void a(String as[], zzf zzf, String s);

    public abstract Location b(String s);

    public abstract IBinder b();

    public abstract Status b(PendingIntent pendingintent);

    public abstract LocationAvailability c(String s);

    public abstract void c(PendingIntent pendingintent);
}
