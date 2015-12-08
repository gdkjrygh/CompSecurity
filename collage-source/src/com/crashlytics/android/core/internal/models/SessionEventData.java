// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core.internal.models;


// Referenced classes of package com.crashlytics.android.core.internal.models:
//            BinaryImageData, CustomAttributeData, DeviceData, SignalData, 
//            ThreadData

public class SessionEventData
{

    public final BinaryImageData binaryImages[];
    public final CustomAttributeData customAttributes[];
    public final DeviceData deviceData;
    public final SignalData signal;
    public final ThreadData threads[];
    public final long timestamp;

    public SessionEventData(long l, SignalData signaldata, ThreadData athreaddata[], BinaryImageData abinaryimagedata[], CustomAttributeData acustomattributedata[], DeviceData devicedata)
    {
        timestamp = l;
        signal = signaldata;
        threads = athreaddata;
        binaryImages = abinaryimagedata;
        customAttributes = acustomattributedata;
        deviceData = devicedata;
    }
}
