// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.Node;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            ak

public static class ayb
    implements com.google.android.gms.wearable.pi.GetLocalNodeResult
{

    private final Status Eb;
    private final Node ayb;

    public Node getNode()
    {
        return ayb;
    }

    public Status getStatus()
    {
        return Eb;
    }

    public alNodeResult(Status status, Node node)
    {
        Eb = status;
        ayb = node;
    }
}
