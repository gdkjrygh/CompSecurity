// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.dash.mpd;

import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.exoplayer.dash.mpd:
//            UtcTimingElement

public class MediaPresentationDescription
    implements com.google.android.exoplayer.util.ManifestFetcher.RedirectingManifest
{

    public final long a;
    public final long b;
    public final long c;
    public final boolean d;
    public final long e;
    public final long f;
    public final UtcTimingElement g;
    public final String h;
    public final List i;

    public MediaPresentationDescription(long l, long l1, long l2, boolean flag, 
            long l3, long l4, UtcTimingElement utctimingelement, String s, List list)
    {
        a = l;
        b = l1;
        c = l2;
        d = flag;
        e = l3;
        f = l4;
        g = utctimingelement;
        h = s;
        i = Collections.unmodifiableList(list);
    }

    public final String a()
    {
        return h;
    }
}
