// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.internal.models;


// Referenced classes of package com.crashlytics.android.internal.models:
//            BinaryImageData, CustomAttributeData, SignalData, ThreadData

public class SessionEventData
{

    public final BinaryImageData binaryImages[];
    public final CustomAttributeData customAttributes[];
    public final SignalData signal;
    public final ThreadData threads[];
    public final long timestamp;

    public SessionEventData(long l, SignalData signaldata, ThreadData athreaddata[], BinaryImageData abinaryimagedata[], CustomAttributeData acustomattributedata[])
    {
        timestamp = l;
        signal = signaldata;
        threads = athreaddata;
        binaryImages = abinaryimagedata;
        customAttributes = acustomattributedata;
    }
}
