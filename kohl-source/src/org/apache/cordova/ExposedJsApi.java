// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;

import org.json.JSONException;

// Referenced classes of package org.apache.cordova:
//            CordovaBridge

class ExposedJsApi
{

    private CordovaBridge bridge;

    public ExposedJsApi(CordovaBridge cordovabridge)
    {
        bridge = cordovabridge;
    }

    public String exec(int i, String s, String s1, String s2, String s3)
        throws JSONException, IllegalAccessException
    {
        return bridge.jsExec(i, s, s1, s2, s3);
    }

    public String retrieveJsMessages(int i, boolean flag)
        throws IllegalAccessException
    {
        return bridge.jsRetrieveJsMessages(i, flag);
    }

    public void setNativeToJsBridgeMode(int i, int j)
        throws IllegalAccessException
    {
        bridge.jsSetNativeToJsBridgeMode(i, j);
    }
}
