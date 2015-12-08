// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.webapi;

import java.io.IOException;
import org.apache.http.HttpException;
import org.json.JSONException;

// Referenced classes of package com.netflix.mediaclient.webapi:
//            WebApiGetCommand, AuthorizationCredentials, CommonRequestParameters

public abstract class NoResponseWebApiCommand extends WebApiGetCommand
{

    public NoResponseWebApiCommand(String s, AuthorizationCredentials authorizationcredentials, CommonRequestParameters commonrequestparameters)
    {
        super(s, authorizationcredentials, commonrequestparameters);
    }

    public void execute()
        throws IOException, HttpException, JSONException
    {
        doExecute();
    }
}
