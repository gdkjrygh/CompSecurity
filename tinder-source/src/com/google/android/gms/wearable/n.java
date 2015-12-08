// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.d;
import java.util.List;

// Referenced classes of package com.google.android.gms.wearable:
//            m

public interface n
{
    public static interface a
    {

        public abstract void onPeerConnected(m m);

        public abstract void onPeerDisconnected(m m);
    }

    public static interface b
    {

        public abstract void onConnectedNodes(List list);
    }


    public abstract d a(c c, a a1);

    public abstract d b(c c, a a1);
}
