// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.servicemgr;

import java.util.List;

// Referenced classes of package com.netflix.mediaclient.servicemgr:
//            VideoDetails

public interface MovieDetails
    extends VideoDetails
{

    public abstract List getSimilars();

    public abstract int getSimilarsListPos();

    public abstract String getSimilarsRequestId();

    public abstract int getSimilarsTrackId();

    public abstract boolean isShared();
}
