// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.livedata;

import android.content.Intent;
import com.fitbit.savedstate.l;
import com.fitbit.util.z;

// Referenced classes of package com.fitbit.livedata:
//            LiveDataPacket

public class e
{

    public static final String a = "com.fitbit.livedata.LiveDataBroadcaster.ACTION_LIVE_DATA_STREAM_STARTED";
    public static final String b = "com.fitbit.livedata.LiveDataBroadcaster.ACTION_LIVE_DATA_STREAM_STOPPED";
    public static final String c = "com.fitbit.livedata.LiveDataBroadcaster.ACTION_LIVE_DATA_RECEIVED";
    public static final String d = "com.fitbit.livedata.LiveDataBroadcaster.EXTRA_LIVE_DATA_PACKET";

    public e()
    {
    }

    public static void a()
    {
        z.a(new Intent("com.fitbit.livedata.LiveDataBroadcaster.ACTION_LIVE_DATA_STREAM_STARTED"));
    }

    public static void a(com.fitbit.galileo.ota.GalileoOtaMessages.RFLiveDataPacket rflivedatapacket)
    {
        LiveDataPacket livedatapacket = new LiveDataPacket();
        livedatapacket.a(rflivedatapacket.steps);
        livedatapacket.b(rflivedatapacket.distance);
        livedatapacket.b(rflivedatapacket.calories);
        livedatapacket.a(rflivedatapacket.elevation);
        livedatapacket.c(rflivedatapacket.veryActiveMinutes);
        livedatapacket.a(rflivedatapacket.heartRate);
        livedatapacket.b(rflivedatapacket.heartRateConfidence);
        a(livedatapacket);
    }

    public static void a(LiveDataPacket livedatapacket)
    {
        Intent intent = new Intent("com.fitbit.livedata.LiveDataBroadcaster.ACTION_LIVE_DATA_RECEIVED");
        intent.putExtra("com.fitbit.livedata.LiveDataBroadcaster.EXTRA_LIVE_DATA_PACKET", livedatapacket);
        l.a(livedatapacket);
        z.a(intent);
    }

    public static void b()
    {
        z.a(new Intent("com.fitbit.livedata.LiveDataBroadcaster.ACTION_LIVE_DATA_STREAM_STOPPED"));
    }
}
