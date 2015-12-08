// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import java.util.List;

// Referenced classes of package com.google.android.gms.wearable:
//            l

public interface m
{
    public static interface a
    {

        public abstract void onPeerConnected(l l);

        public abstract void onPeerDisconnected(l l);
    }

    public static interface b
    {

        public abstract void onConnectedNodes(List list);
    }

}
