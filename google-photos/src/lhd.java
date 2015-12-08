// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

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
import com.google.android.gms.location.internal.LocationRequestInternal;
import com.google.android.gms.location.internal.LocationRequestUpdateData;
import java.util.List;

public interface lhd
    extends IInterface
{

    public abstract Location a();

    public abstract Status a(GestureRequest gesturerequest, PendingIntent pendingintent);

    public abstract ActivityRecognitionResult a(String s);

    public abstract void a(long l, boolean flag, PendingIntent pendingintent);

    public abstract void a(PendingIntent pendingintent);

    public abstract void a(PendingIntent pendingintent, lha lha, String s);

    public abstract void a(Location location);

    public abstract void a(Location location, int i);

    public abstract void a(GeofencingRequest geofencingrequest, PendingIntent pendingintent, lha lha);

    public abstract void a(LocationRequest locationrequest, PendingIntent pendingintent);

    public abstract void a(LocationRequest locationrequest, lim lim);

    public abstract void a(LocationRequest locationrequest, lim lim, String s);

    public abstract void a(LocationSettingsRequest locationsettingsrequest, lhg lhg, String s);

    public abstract void a(LocationRequestInternal locationrequestinternal, PendingIntent pendingintent);

    public abstract void a(LocationRequestInternal locationrequestinternal, lim lim);

    public abstract void a(LocationRequestUpdateData locationrequestupdatedata);

    public abstract void a(List list, PendingIntent pendingintent, lha lha, String s);

    public abstract void a(lha lha, String s);

    public abstract void a(lim lim);

    public abstract void a(boolean flag);

    public abstract void a(String as[], lha lha, String s);

    public abstract Location b(String s);

    public abstract IBinder b();

    public abstract Status b(PendingIntent pendingintent);

    public abstract Status c(PendingIntent pendingintent);

    public abstract LocationAvailability c(String s);

    public abstract Status d(PendingIntent pendingintent);

    public abstract void e(PendingIntent pendingintent);
}
