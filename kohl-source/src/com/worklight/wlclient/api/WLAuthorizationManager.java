// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient.api;

import com.worklight.wlclient.WLAuthorizationManagerInternal;
import java.net.URLConnection;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpUriRequest;
import org.json.JSONObject;

// Referenced classes of package com.worklight.wlclient.api:
//            WLAuthorizationPersistencePolicy, WLResponseListener

public class WLAuthorizationManager
{

    private static WLAuthorizationManager instance = new WLAuthorizationManager();

    private WLAuthorizationManager()
    {
    }

    public static WLAuthorizationManager getInstance()
    {
        return instance;
    }

    public void addCachedAuthorizationHeader(URLConnection urlconnection)
    {
        WLAuthorizationManagerInternal.getInstance().addCachedAuthorizationHeader(urlconnection);
    }

    public void addCachedAuthorizationHeader(HttpUriRequest httpurirequest)
    {
        WLAuthorizationManagerInternal.getInstance().addCachedAuthorizationHeader(httpurirequest);
    }

    public JSONObject getAppIdentity()
    {
        return WLAuthorizationManagerInternal.getInstance().getAppIdentity();
    }

    public WLAuthorizationPersistencePolicy getAuthorizationPersistencePolicy()
    {
        return WLAuthorizationManagerInternal.getInstance().getAuthorizationPersistencePolicy();
    }

    public String getAuthorizationScope(String s)
    {
        return WLAuthorizationManagerInternal.getInstance().getAuthorizationScope(s);
    }

    public String getAuthorizationScope(HttpResponse httpresponse)
    {
        return WLAuthorizationManagerInternal.getInstance().getAuthorizationScope(httpresponse);
    }

    public String getCachedAuthorizationHeader()
    {
        return WLAuthorizationManagerInternal.getInstance().getCachedAuthorizationHeader();
    }

    public JSONObject getDeviceIdentity()
    {
        return WLAuthorizationManagerInternal.getInstance().getDeviceIdentity();
    }

    public JSONObject getUserIdentity()
    {
        return WLAuthorizationManagerInternal.getInstance().getUserIdentity();
    }

    public boolean isAuthorizationRequired(int i, String s)
    {
        return WLAuthorizationManagerInternal.getInstance().isAuthorizationRequired(i, s);
    }

    public boolean isAuthorizationRequired(HttpResponse httpresponse)
    {
        return WLAuthorizationManagerInternal.getInstance().isAuthorizationRequired(httpresponse);
    }

    public void obtainAuthorizationHeader(String s, WLResponseListener wlresponselistener)
    {
        WLAuthorizationManagerInternal.getInstance().obtainAuthorizationHeader(s, wlresponselistener);
    }

    public void setAuthorizationPersistencePolicy(WLAuthorizationPersistencePolicy wlauthorizationpersistencepolicy)
    {
        WLAuthorizationManagerInternal.getInstance().setAuthorizationPersistencePolicy(wlauthorizationpersistencepolicy);
    }

}
