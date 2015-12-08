// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

final class lhk extends lik
{

    private void a(int i, Object obj)
    {
        Log.e("LocationClientHelper", "Received a data in client after calling removeLocationUpdates.");
    }

    public final void a(LocationAvailability locationavailability)
    {
        a(1, locationavailability);
    }

    public final void a(LocationResult locationresult)
    {
        a(0, locationresult);
    }
}
