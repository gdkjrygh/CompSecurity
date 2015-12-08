// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.Node;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            ah

public static class alX
    implements com.google.android.gms.wearable.pi.GetLocalNodeResult
{

    private final Node alX;
    private final Status yw;

    public Node getNode()
    {
        return alX;
    }

    public Status getStatus()
    {
        return yw;
    }

    public alNodeResult(Status status, Node node)
    {
        yw = status;
        alX = node;
    }
}
