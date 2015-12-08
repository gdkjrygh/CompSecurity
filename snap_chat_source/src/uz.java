// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.snapchat.android.controller.MediaOpenOrigin;
import com.snapchat.android.discover.analytics.EditionPerformanceAnalytics;
import java.util.HashSet;
import java.util.Set;

public final class uz
{

    public final Set a;
    public final Set b;
    public final MediaOpenOrigin c;
    public final EditionPerformanceAnalytics d;

    public uz(MediaOpenOrigin mediaopenorigin)
    {
        this(mediaopenorigin, new EditionPerformanceAnalytics(mediaopenorigin));
    }

    private uz(MediaOpenOrigin mediaopenorigin, EditionPerformanceAnalytics editionperformanceanalytics)
    {
        a = new HashSet();
        b = new HashSet();
        c = mediaopenorigin;
        d = editionperformanceanalytics;
    }
}
