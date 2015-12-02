// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.hls;

import java.util.Comparator;

// Referenced classes of package com.google.android.exoplayer.hls:
//            Variant

final class ngBandwidthComparator
    implements Comparator
{

    private final Comparator a = new com.google.android.exoplayer.chunk.BandwidthComparator();

    private int a(Variant variant, Variant variant1)
    {
        return a.compare(variant.b, variant1.b);
    }

    public final int compare(Object obj, Object obj1)
    {
        return a((Variant)obj, (Variant)obj1);
    }

    ngBandwidthComparator()
    {
    }
}
