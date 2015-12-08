// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.servicemgr;

import java.util.List;

// Referenced classes of package com.netflix.mediaclient.servicemgr:
//            FetchVideosHandler

public static interface I
{

    public abstract long getRequestId();

    public abstract void onErrorResponse();

    public abstract void onNoVideosInResponse();

    public abstract void updateDataSet(List list, String s, int i, int j);
}
