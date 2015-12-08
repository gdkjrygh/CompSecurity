// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.herrevad.PredictedNetworkQuality;

public class mck
{

    public long a;

    public mck(PredictedNetworkQuality predictednetworkquality)
    {
        long l;
        if (predictednetworkquality == null)
        {
            l = -1L;
        } else
        {
            l = predictednetworkquality.d;
        }
        a = l;
    }

    public long a()
    {
        return a;
    }
}
