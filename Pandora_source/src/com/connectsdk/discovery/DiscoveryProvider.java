// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.connectsdk.discovery;

import org.json.JSONObject;

// Referenced classes of package com.connectsdk.discovery:
//            DiscoveryProviderListener

public interface DiscoveryProvider
{

    public abstract void addDeviceFilter(JSONObject jsonobject);

    public abstract void addListener(DiscoveryProviderListener discoveryproviderlistener);

    public abstract boolean isEmpty();

    public abstract void removeDeviceFilter(JSONObject jsonobject);

    public abstract void removeListener(DiscoveryProviderListener discoveryproviderlistener);

    public abstract void reset();

    public abstract void start();

    public abstract void stop();
}
