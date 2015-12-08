// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.javabridge.ui.android;

import com.netflix.mediaclient.javabridge.invoke.mdx.discovery.IsRemoteDeviceReady;
import com.netflix.mediaclient.javabridge.invoke.mdx.discovery.LaunchNetflix;
import com.netflix.mediaclient.javabridge.ui.mdxcontroller.DiscoveryController;
import java.util.Map;

// Referenced classes of package com.netflix.mediaclient.javabridge.ui.android:
//            NativeMdx

class this._cls0
    implements DiscoveryController
{

    final NativeMdx this$0;

    public void isRemoteDeviceReady(String s)
    {
        NativeMdx.access$000(NativeMdx.this, new IsRemoteDeviceReady(s));
    }

    public void launchNetflix(String s, Map map)
    {
        NativeMdx.access$000(NativeMdx.this, new LaunchNetflix(s, map));
    }

    ()
    {
        this$0 = NativeMdx.this;
        super();
    }
}
