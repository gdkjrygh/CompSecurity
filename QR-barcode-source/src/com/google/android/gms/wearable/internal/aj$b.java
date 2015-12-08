// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.Node;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            aj

public static class avM
    implements com.google.android.gms.wearable.pi.GetLocalNodeResult
{

    private final Status CM;
    private final Node avM;

    public Node getNode()
    {
        return avM;
    }

    public Status getStatus()
    {
        return CM;
    }

    public alNodeResult(Status status, Node node)
    {
        CM = status;
        avM = node;
    }
}
