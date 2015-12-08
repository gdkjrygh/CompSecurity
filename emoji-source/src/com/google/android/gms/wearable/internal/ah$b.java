// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.Node;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            ah

public static class ama
    implements com.google.android.gms.wearable.pi.GetLocalNodeResult
{

    private final Node ama;
    private final Status yz;

    public Node getNode()
    {
        return ama;
    }

    public Status getStatus()
    {
        return yz;
    }

    public alNodeResult(Status status, Node node)
    {
        yz = status;
        ama = node;
    }
}
