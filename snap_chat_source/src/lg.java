// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.TimeUnit;

public final class lg
{

    public long filterCount;
    public final String filterGeofilterId;
    public long filterIndexCount;
    public long filterIndexPos;
    public final boolean isSponsored;
    public final dz viewTimeStopwatch = new dz();

    public lg(String s, boolean flag)
    {
        filterGeofilterId = s;
        isSponsored = flag;
    }

    public final void a()
    {
        if (viewTimeStopwatch.a)
        {
            viewTimeStopwatch.b();
        }
    }

    public final String toString()
    {
        return (new StringBuilder("GeofilterSwipeMetaDataItem{filterGeofilterId='")).append(filterGeofilterId).append('\'').append(", viewTimeStopwatch isRunning=").append(viewTimeStopwatch.a).append(", viewTimeStopwatch=").append(viewTimeStopwatch.a(TimeUnit.MILLISECONDS)).append(", filterIndexPos=").append(filterIndexPos).append(", filterIndexCount=").append(filterIndexCount).append(", filterCount=").append(filterCount).append('}').toString();
    }
}
