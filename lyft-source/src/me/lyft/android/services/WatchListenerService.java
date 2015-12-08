// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.services;

import android.net.Uri;
import com.google.android.gms.wearable.DataEvent;
import com.google.android.gms.wearable.DataEventBuffer;
import com.google.android.gms.wearable.DataItem;
import com.google.android.gms.wearable.DataMap;
import com.google.android.gms.wearable.DataMapItem;
import com.google.android.gms.wearable.MessageEvent;
import com.google.android.gms.wearable.Node;
import com.google.android.gms.wearable.WearableListenerService;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import me.lyft.android.LyftApplication;
import me.lyft.android.application.ride.IWearRideRequestService;
import me.lyft.android.common.Unit;
import me.lyft.android.logging.L;
import me.lyft.android.rx.SimpleSubscriber;
import rx.Observable;

public class WatchListenerService extends WearableListenerService
{

    private static final String LATITUDE_PARAM = "latitude";
    private static final String LONGITUDE_PARAM = "longitude";
    private static final long REQUEST_TIMEOUT;
    private static final String RIDE_REQUEST_DATA_PATH = "/ride_request";
    private static final String TIMESTAMP_PARAM = "timestamp";
    IWearRideRequestService wearRideRequestService;

    public WatchListenerService()
    {
    }

    private void requestRide(DataItem dataitem)
    {
        dataitem = DataMapItem.a(dataitem).a();
        long l = dataitem.e("timestamp");
        double d = dataitem.g("latitude");
        double d1 = dataitem.g("longitude");
        if (System.currentTimeMillis() - l < REQUEST_TIMEOUT)
        {
            wearRideRequestService.requestRide(d, d1).subscribe(new SimpleSubscriber() {

                final WatchListenerService this$0;

                public void onError(Throwable throwable)
                {
                    super.onError(throwable);
                    L.w(throwable, "failed to request ride from watch", new Object[0]);
                }

                public volatile void onNext(Object obj)
                {
                    onNext((Unit)obj);
                }

                public void onNext(Unit unit)
                {
                    super.onNext(unit);
                }

            
            {
                this$0 = WatchListenerService.this;
                super();
            }
            });
        }
    }

    public LyftApplication getLyftApplication()
    {
        return (LyftApplication)getApplicationContext();
    }

    public void onCreate()
    {
        super.onCreate();
        L.d("onAttached", new Object[0]);
        getLyftApplication().inject(this);
    }

    public void onDataChanged(DataEventBuffer dataeventbuffer)
    {
        L.d((new StringBuilder()).append("onDataChanged: ").append(dataeventbuffer).append(" for ").append(getPackageName()).toString(), new Object[0]);
        dataeventbuffer = dataeventbuffer.iterator();
_L5:
        if (!dataeventbuffer.hasNext()) goto _L2; else goto _L1
_L1:
        Object obj = (DataEvent)dataeventbuffer.next();
        if (((DataEvent) (obj)).c() != 1) goto _L4; else goto _L3
_L3:
        obj = ((DataEvent) (obj)).b();
        if (((DataItem) (obj)).b().getPath().equalsIgnoreCase("/ride_request"))
        {
            requestRide(((DataItem) (obj)));
        }
          goto _L5
        dataeventbuffer;
        L.e(dataeventbuffer, "Failed to handle watch message", new Object[0]);
_L2:
        return;
_L4:
        int i = ((DataEvent) (obj)).c();
        if (i != 2);
          goto _L5
    }

    public void onMessageReceived(MessageEvent messageevent)
    {
        L.d((new StringBuilder()).append("onMessageReceived: ").append(messageevent.a()).append(" ").append(" for ").append(getPackageName()).toString(), new Object[0]);
    }

    public void onPeerConnected(Node node)
    {
        super.onPeerConnected(node);
        L.d("onPeerConnected", new Object[0]);
    }

    public void onPeerDisconnected(Node node)
    {
        super.onPeerDisconnected(node);
        L.d("onPeerDisconnected", new Object[0]);
    }

    static 
    {
        REQUEST_TIMEOUT = TimeUnit.SECONDS.toMillis(5L);
    }
}
