// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient.api;


// Referenced classes of package com.worklight.wlclient.api:
//            WLResponse

public interface WLAuthListener
{

    public abstract void handleLoginResponse(WLResponse wlresponse);

    public abstract boolean isLoginFormResponse(WLResponse wlresponse);
}
