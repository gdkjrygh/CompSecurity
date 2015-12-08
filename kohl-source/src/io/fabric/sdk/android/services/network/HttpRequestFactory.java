// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.network;

import java.util.Map;

// Referenced classes of package io.fabric.sdk.android.services.network:
//            HttpMethod, HttpRequest, PinningInfoProvider

public interface HttpRequestFactory
{

    public abstract HttpRequest buildHttpRequest(HttpMethod httpmethod, String s);

    public abstract HttpRequest buildHttpRequest(HttpMethod httpmethod, String s, Map map);

    public abstract PinningInfoProvider getPinningInfoProvider();

    public abstract void setPinningInfoProvider(PinningInfoProvider pinninginfoprovider);
}
