// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.javabridge.transport;

import com.netflix.mediaclient.javabridge.Bridge;
import com.netflix.mediaclient.javabridge.NrdProxy;

// Referenced classes of package com.netflix.mediaclient.javabridge.transport:
//            NativeTransport, Transport

public class TransportFactory
{

    private TransportFactory()
    {
    }

    public static Transport createTransport(String s, Bridge bridge, NrdProxy nrdproxy)
    {
        return new NativeTransport(bridge, nrdproxy);
    }
}
