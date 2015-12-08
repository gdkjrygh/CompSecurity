// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.location;

import android.location.Location;
import com.google.android.gms.location.LocationListener;
import rx.Subscriber;

// Referenced classes of package me.lyft.android.infrastructure.location:
//            LocationUpdatesOnSubscribe, GoogleLocationMapper

class val.subscriber
    implements LocationListener
{

    final LocationUpdatesOnSubscribe this$0;
    final Subscriber val$subscriber;

    public void onLocationChanged(Location location)
    {
        val$subscriber.onNext(GoogleLocationMapper.toDomainLocation(location));
    }

    ()
    {
        this$0 = final_locationupdatesonsubscribe;
        val$subscriber = Subscriber.this;
        super();
    }
}
