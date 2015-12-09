// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.javabridge;

import com.netflix.mediaclient.javabridge.ui.android.NativeNrdProxy;

// Referenced classes of package com.netflix.mediaclient.javabridge:
//            Bridge, NrdProxy

public class NrdProxyFactory
{

    private NrdProxyFactory()
    {
    }

    public static NrdProxy createInstance(Bridge bridge)
    {
        return new NativeNrdProxy(bridge);
    }
}
